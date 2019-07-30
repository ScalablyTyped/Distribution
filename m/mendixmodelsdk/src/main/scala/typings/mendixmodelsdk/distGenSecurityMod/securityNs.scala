package typings.mendixmodelsdk.distGenSecurityMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.AccessRule
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IModule
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProject
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProjectDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Module
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Project
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.ProjectDocument
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.AccessRuleContainerBase
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.DemoUser
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.FileDocumentAccessRuleContainer
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IModuleRole
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IModuleSecurity
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IProjectSecurity
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IUserRole
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.ImageAccessRuleContainer
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.ModuleRole
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.ModuleSecurity
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.PasswordPolicySettings
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.ProjectSecurity
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.SecurityLevel
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.UserRole
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit
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
  abstract class AccessRuleContainerBase protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val accessRules: IList[AccessRule] = js.native
    val containerAsProjectSecurity: ProjectSecurity = js.native
    @JSName("model")
    var model_AccessRuleContainerBase: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/demo-users relevant section in reference guide}
    */
  @js.native
  class DemoUser protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsProjectSecurity: ProjectSecurity = js.native
    var entity: IEntity | Null = js.native
    val entityQualifiedName: String | Null = js.native
    @JSName("model")
    var model_DemoUser: IModel = js.native
    var password: String = js.native
    var userName: String = js.native
    val userRoles: IList[IUserRole] = js.native
    val userRolesQualifiedNames: js.Array[String] = js.native
  }
  
  @js.native
  class FileDocumentAccessRuleContainer protected () extends AccessRuleContainerBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/module-role relevant section in reference guide}
    */
  @js.native
  trait IModuleRole
    extends IElement
       with IByNameReferrable {
    val containerAsModuleSecurity: IModuleSecurity = js.native
    @JSName("model")
    val model_IModuleRole: IModel = js.native
    val name: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
    */
  @js.native
  trait IModuleSecurity extends IModelUnit {
    val containerAsModule: IModule = js.native
    @JSName("model")
    val model_IModuleSecurity: IModel = js.native
    val moduleRoles: IList[IModuleRole] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
    */
  @js.native
  trait IProjectSecurity extends IProjectDocument {
    val userRoles: IList[IUserRole] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/user-role relevant section in reference guide}
    */
  @js.native
  trait IUserRole
    extends IElement
       with IByNameReferrable {
    val containerAsProjectSecurity: IProjectSecurity = js.native
    @JSName("model")
    val model_IUserRole: IModel = js.native
    val name: String = js.native
  }
  
  @js.native
  class ImageAccessRuleContainer protected () extends AccessRuleContainerBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/module-role relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenSecurityMod.securityNs.IModuleRole because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsModuleSecurity, name */ @js.native
  class ModuleRole protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsModuleSecurity: IModuleSecurity | ModuleSecurity = js.native
    var description: String = js.native
    @JSName("model")
    var model_ModuleRole: IModel = js.native
    var name: String = js.native
    val qualifiedName: String | Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenSecurityMod.securityNs.IModuleSecurity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsModule, moduleRoles */ @js.native
  class ModuleSecurity protected () extends ModelUnit {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
    val containerAsModule: IModule | Module = js.native
    @JSName("model")
    var model_ModuleSecurity: IModel = js.native
    val moduleRoles: IList[IModuleRole | ModuleRole] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/password-policy relevant section in reference guide}
    */
  @js.native
  class PasswordPolicySettings protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsProjectSecurity: ProjectSecurity = js.native
    var minimumLength: Double = js.native
    @JSName("model")
    var model_PasswordPolicySettings: IModel = js.native
    var requireDigit: Boolean = js.native
    var requireMixedCase: Boolean = js.native
    var requireSymbol: Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenSecurityMod.securityNs.IProjectSecurity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined userRoles */ @js.native
  class ProjectSecurity protected () extends ProjectDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
    var adminPassword: String = js.native
    var adminUserName: String = js.native
    var adminUserRoleName: String = js.native
    var checkSecurity: Boolean = js.native
    @JSName("containerAsProject")
    val containerAsProject_ProjectSecurity: Project = js.native
    val demoUsers: IList[DemoUser] = js.native
    var enableDemoUsers: Boolean = js.native
    var enableGuestAccess: Boolean = js.native
    /**
      * In version 6.0.0: deprecated
      */
    var fileDocumentAccess: FileDocumentAccessRuleContainer = js.native
    var guestUserRoleName: String = js.native
    /**
      * In version 6.0.0: deprecated
      */
    var imageAccess: ImageAccessRuleContainer = js.native
    var passwordPolicySettings: PasswordPolicySettings = js.native
    var securityLevel: SecurityLevel = js.native
    /**
      * In version 8.0.0: deleted
      */
    var signInMicroflow: IMicroflow | Null = js.native
    val signInMicroflowQualifiedName: String | Null = js.native
    val userRoles: IList[IUserRole | UserRole] = js.native
  }
  
  @js.native
  class SecurityLevel () extends AbstractEnum
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/user-role relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenSecurityMod.securityNs.IUserRole because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsProjectSecurity, name */ @js.native
  class UserRole protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var checkSecurity: Boolean = js.native
    val containerAsProjectSecurity: IProjectSecurity | ProjectSecurity = js.native
    var description: String = js.native
    var guid: String = js.native
    var manageAllRoles: Boolean = js.native
    var manageUsersWithoutRoles: Boolean = js.native
    val manageableRoles: IList[IUserRole] = js.native
    val manageableRolesQualifiedNames: js.Array[String] = js.native
    @JSName("model")
    var model_UserRole: IModel = js.native
    val moduleRoles: IList[IModuleRole] = js.native
    val moduleRolesQualifiedNames: js.Array[String] = js.native
    var name: String = js.native
    val qualifiedName: String | Null = js.native
  }
  
  /* static members */
  @js.native
  object AccessRuleContainerBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DemoUser extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DemoUser = js.native
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * The new DemoUser will be automatically stored in the 'demoUsers' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: ProjectSecurity): DemoUser = js.native
  }
  
  /* static members */
  @js.native
  object FileDocumentAccessRuleContainer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): FileDocumentAccessRuleContainer = js.native
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * The new FileDocumentAccessRuleContainer will be automatically stored in the 'fileDocumentAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: ProjectSecurity): FileDocumentAccessRuleContainer = js.native
  }
  
  /* static members */
  @js.native
  object ImageAccessRuleContainer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ImageAccessRuleContainer = js.native
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * The new ImageAccessRuleContainer will be automatically stored in the 'imageAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: ProjectSecurity): ImageAccessRuleContainer = js.native
  }
  
  /* static members */
  @js.native
  object ModuleRole extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ModuleRole = js.native
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * The new ModuleRole will be automatically stored in the 'moduleRoles' property
      * of the parent ModuleSecurity element passed as argument.
      */
    def createIn(container: ModuleSecurity): ModuleRole = js.native
  }
  
  /* static members */
  @js.native
  object ModuleSecurity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new ModuleSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IModule in which this unit is contained.
      */
    def createIn(container: IModule): ModuleSecurity = js.native
  }
  
  /* static members */
  @js.native
  object PasswordPolicySettings extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): PasswordPolicySettings = js.native
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * The new PasswordPolicySettings will be automatically stored in the 'passwordPolicySettings' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: ProjectSecurity): PasswordPolicySettings = js.native
  }
  
  /* static members */
  @js.native
  object ProjectSecurity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new ProjectSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: IProject): ProjectSecurity = js.native
  }
  
  /* static members */
  @js.native
  object SecurityLevel extends js.Object {
    var CheckEverything: SecurityLevel = js.native
    var CheckFormsAndMicroflows: SecurityLevel = js.native
    var CheckNothing: SecurityLevel = js.native
  }
  
  /* static members */
  @js.native
  object UserRole extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): UserRole = js.native
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * The new UserRole will be automatically stored in the 'userRoles' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: ProjectSecurity): UserRole = js.native
  }
  
}

