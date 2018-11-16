package typings
package mendixmodelsdkLib.distGenSecurityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/security", "security")
@js.native
object securityNs extends js.Object {
  /**
       * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
       */
  @js.native
  abstract class AccessRuleContainerBase protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val accessRules: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.AccessRule] = js.native
    val containerAsProjectSecurity: ProjectSecurity = js.native
    @JSName("model")
    var model_AccessRuleContainerBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/demo-users relevant section in reference guide}
       */
  @js.native
  class DemoUser protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsProjectSecurity: ProjectSecurity = js.native
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity | scala.Null = js.native
    val entityQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_DemoUser: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var password: java.lang.String = js.native
    var userName: java.lang.String = js.native
    val userRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IUserRole] = js.native
    val userRolesQualifiedNames: js.Array[java.lang.String] = js.native
  }
  
  @js.native
  class FileDocumentAccessRuleContainer protected () extends AccessRuleContainerBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/module-role relevant section in reference guide}
       */
  @js.native
  trait IModuleRole
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsModuleSecurity: IModuleSecurity = js.native
    @JSName("model")
    val model_IModuleRole: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
       */
  @js.native
  trait IModuleSecurity
    extends mendixmodelsdkLib.distSdkInternalUnitsMod.IModelUnit {
    val containerAsModule: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule = js.native
    @JSName("model")
    val model_IModuleSecurity: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val moduleRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IModuleRole] = js.native
    def asLoaded(): ModuleSecurity = js.native
    def load(callback: js.Function1[/* element */ ModuleSecurity, scala.Unit]): scala.Unit = js.native
    def load(callback: js.Function1[/* element */ ModuleSecurity, scala.Unit], forceRefresh: scala.Boolean): scala.Unit = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
       */
  @js.native
  trait IProjectSecurity
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProjectDocument {
    val userRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IUserRole] = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/user-role relevant section in reference guide}
       */
  @js.native
  trait IUserRole
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsProjectSecurity: IProjectSecurity = js.native
    @JSName("model")
    val model_IUserRole: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  @js.native
  class ImageAccessRuleContainer protected () extends AccessRuleContainerBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/module-role relevant section in reference guide}
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleRole because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class ModuleRole protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsModuleSecurity: ModuleSecurity = js.native
    var description: java.lang.String = js.native
    @JSName("model")
    var model_ModuleRole: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleSecurity because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class ModuleSecurity protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.ModelUnit {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule) = this()
    val containerAsModule: mendixmodelsdkLib.distGenProjectsMod.projectsNs.Module = js.native
    @JSName("model")
    var model_ModuleSecurity: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val moduleRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ModuleRole] = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/password-policy relevant section in reference guide}
       */
  @js.native
  class PasswordPolicySettings protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsProjectSecurity: ProjectSecurity = js.native
    var minimumLength: scala.Double = js.native
    @JSName("model")
    var model_PasswordPolicySettings: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var requireDigit: scala.Boolean = js.native
    var requireMixedCase: scala.Boolean = js.native
    var requireSymbol: scala.Boolean = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenSecurityMod.securityNs.IProjectSecurity because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class ProjectSecurity protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.ProjectDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject) = this()
    var adminPassword: java.lang.String = js.native
    var adminUserName: java.lang.String = js.native
    var adminUserRoleName: java.lang.String = js.native
    var checkSecurity: scala.Boolean = js.native
    val demoUsers: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[DemoUser] = js.native
    var enableDemoUsers: scala.Boolean = js.native
    var enableGuestAccess: scala.Boolean = js.native
    /**
             * In version 6.0.0: deprecated
             */
    var fileDocumentAccess: FileDocumentAccessRuleContainer = js.native
    var guestUserRoleName: java.lang.String = js.native
    /**
             * In version 6.0.0: deprecated
             */
    var imageAccess: ImageAccessRuleContainer = js.native
    var passwordPolicySettings: PasswordPolicySettings = js.native
    var securityLevel: SecurityLevel = js.native
    var signInMicroflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val signInMicroflowQualifiedName: java.lang.String | scala.Null = js.native
    val userRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[UserRole] = js.native
  }
  
  @js.native
  class SecurityLevel ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/user-role relevant section in reference guide}
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenSecurityMod.securityNs.IUserRole because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class UserRole protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var checkSecurity: scala.Boolean = js.native
    val containerAsProjectSecurity: ProjectSecurity = js.native
    var description: java.lang.String = js.native
    var guid: java.lang.String = js.native
    var manageAllRoles: scala.Boolean = js.native
    var manageUsersWithoutRoles: scala.Boolean = js.native
    val manageableRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IUserRole] = js.native
    val manageableRolesQualifiedNames: js.Array[java.lang.String] = js.native
    @JSName("model")
    var model_UserRole: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val moduleRoles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IModuleRole] = js.native
    val moduleRolesQualifiedNames: js.Array[java.lang.String] = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
       * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
       */
  @js.native
  object AccessRuleContainerBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSecurityMod.StructureVersionInfo = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/demo-users relevant section in reference guide}
       */
  @js.native
  object DemoUser extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSecurityMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new DemoUser instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSecurityMod.securityNs.DemoUser = js.native
    /**
             * Creates and returns a new DemoUser instance in the SDK and on the server.
             * The new DemoUser will be automatically stored in the 'demoUsers' property
             * of the parent ProjectSecurity element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenSecurityMod.securityNs.ProjectSecurity): mendixmodelsdkLib.distGenSecurityMod.securityNs.DemoUser = js.native
  }
  
  @js.native
  object FileDocumentAccessRuleContainer extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSecurityMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSecurityMod.securityNs.FileDocumentAccessRuleContainer = js.native
    /**
             * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
             * The new FileDocumentAccessRuleContainer will be automatically stored in the 'fileDocumentAccess' property
             * of the parent ProjectSecurity element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenSecurityMod.securityNs.ProjectSecurity): mendixmodelsdkLib.distGenSecurityMod.securityNs.FileDocumentAccessRuleContainer = js.native
  }
  
  @js.native
  object ImageAccessRuleContainer extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSecurityMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSecurityMod.securityNs.ImageAccessRuleContainer = js.native
    /**
             * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
             * The new ImageAccessRuleContainer will be automatically stored in the 'imageAccess' property
             * of the parent ProjectSecurity element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenSecurityMod.securityNs.ProjectSecurity): mendixmodelsdkLib.distGenSecurityMod.securityNs.ImageAccessRuleContainer = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/module-role relevant section in reference guide}
       */
  @js.native
  object ModuleRole extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSecurityMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ModuleRole instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSecurityMod.securityNs.ModuleRole = js.native
    /**
             * Creates and returns a new ModuleRole instance in the SDK and on the server.
             * The new ModuleRole will be automatically stored in the 'moduleRoles' property
             * of the parent ModuleSecurity element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenSecurityMod.securityNs.ModuleSecurity): mendixmodelsdkLib.distGenSecurityMod.securityNs.ModuleRole = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
       */
  @js.native
  object ModuleSecurity extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSecurityMod.StructureVersionInfo = js.native
    /**
             * Creates a new ModuleSecurity unit in the SDK and on the server.
             * Expects one argument, the projects.IModule in which this unit is contained.
             */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule): mendixmodelsdkLib.distGenSecurityMod.securityNs.ModuleSecurity = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/password-policy relevant section in reference guide}
       */
  @js.native
  object PasswordPolicySettings extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSecurityMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSecurityMod.securityNs.PasswordPolicySettings = js.native
    /**
             * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
             * The new PasswordPolicySettings will be automatically stored in the 'passwordPolicySettings' property
             * of the parent ProjectSecurity element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenSecurityMod.securityNs.ProjectSecurity): mendixmodelsdkLib.distGenSecurityMod.securityNs.PasswordPolicySettings = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
       */
  @js.native
  object ProjectSecurity extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSecurityMod.StructureVersionInfo = js.native
    /**
             * Creates a new ProjectSecurity unit in the SDK and on the server.
             * Expects one argument, the projects.IProject in which this unit is contained.
             */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject): mendixmodelsdkLib.distGenSecurityMod.securityNs.ProjectSecurity = js.native
  }
  
  @js.native
  object SecurityLevel extends js.Object {
    var CheckEverything: mendixmodelsdkLib.distGenSecurityMod.securityNs.SecurityLevel = js.native
    var CheckFormsAndMicroflows: mendixmodelsdkLib.distGenSecurityMod.securityNs.SecurityLevel = js.native
    var CheckNothing: mendixmodelsdkLib.distGenSecurityMod.securityNs.SecurityLevel = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/user-role relevant section in reference guide}
       */
  @js.native
  object UserRole extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSecurityMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new UserRole instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenSecurityMod.securityNs.UserRole = js.native
    /**
             * Creates and returns a new UserRole instance in the SDK and on the server.
             * The new UserRole will be automatically stored in the 'userRoles' property
             * of the parent ProjectSecurity element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenSecurityMod.securityNs.ProjectSecurity): mendixmodelsdkLib.distGenSecurityMod.securityNs.UserRole = js.native
  }
  
}

