package typings
package mendixmodelsdkLib.distGenAllDashModelDashClassesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security")
@js.native
object securityNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
    */
  @js.native
  abstract class AccessRuleContainerBase protected ()
    extends mendixmodelsdkLib.distGenSecurityMod.securityNs.AccessRuleContainerBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/demo-users relevant section in reference guide}
    */
  @js.native
  class DemoUser protected ()
    extends mendixmodelsdkLib.distGenSecurityMod.securityNs.DemoUser {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class FileDocumentAccessRuleContainer protected ()
    extends mendixmodelsdkLib.distGenSecurityMod.securityNs.FileDocumentAccessRuleContainer {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  @js.native
  class ImageAccessRuleContainer protected ()
    extends mendixmodelsdkLib.distGenSecurityMod.securityNs.ImageAccessRuleContainer {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/module-role relevant section in reference guide}
    */
  @js.native
  class ModuleRole protected ()
    extends mendixmodelsdkLib.distGenSecurityMod.securityNs.ModuleRole {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
    */
  @js.native
  class ModuleSecurity protected ()
    extends mendixmodelsdkLib.distGenSecurityMod.securityNs.ModuleSecurity {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/password-policy relevant section in reference guide}
    */
  @js.native
  class PasswordPolicySettings protected ()
    extends mendixmodelsdkLib.distGenSecurityMod.securityNs.PasswordPolicySettings {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
    */
  @js.native
  class ProjectSecurity protected ()
    extends mendixmodelsdkLib.distGenSecurityMod.securityNs.ProjectSecurity {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject) = this()
  }
  
  @js.native
  class SecurityLevel ()
    extends mendixmodelsdkLib.distGenSecurityMod.securityNs.SecurityLevel
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/user-role relevant section in reference guide}
    */
  @js.native
  class UserRole protected ()
    extends mendixmodelsdkLib.distGenSecurityMod.securityNs.UserRole {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* static members */
  @js.native
  object AccessRuleContainerBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenSecurityMod.StructureVersionInfo = js.native
  }
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
  @js.native
  object SecurityLevel extends js.Object {
    var CheckEverything: mendixmodelsdkLib.distGenSecurityMod.securityNs.SecurityLevel = js.native
    var CheckFormsAndMicroflows: mendixmodelsdkLib.distGenSecurityMod.securityNs.SecurityLevel = js.native
    var CheckNothing: mendixmodelsdkLib.distGenSecurityMod.securityNs.SecurityLevel = js.native
  }
  
  /* static members */
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

