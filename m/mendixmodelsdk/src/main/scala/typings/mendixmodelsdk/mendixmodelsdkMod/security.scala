package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenProjectsMod.projects.IModule
import typings.mendixmodelsdk.distGenProjectsMod.projects.IProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "security")
@js.native
object security extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
    */
  @js.native
  abstract class AccessRuleContainerBase protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.security.AccessRuleContainerBase {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/demo-users relevant section in reference guide}
    */
  @js.native
  class DemoUser protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.security.DemoUser {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class FileDocumentAccessRuleContainer protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.security.FileDocumentAccessRuleContainer {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ImageAccessRuleContainer protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.security.ImageAccessRuleContainer {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/module-role relevant section in reference guide}
    */
  @js.native
  class ModuleRole protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.security.ModuleRole {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
    */
  @js.native
  class ModuleSecurity protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.security.ModuleSecurity {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/password-policy relevant section in reference guide}
    */
  @js.native
  class PasswordPolicySettings protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.security.PasswordPolicySettings {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
    */
  @js.native
  class ProjectSecurity protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.security.ProjectSecurity {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  
  @js.native
  class SecurityLevel ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.security.SecurityLevel
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/user-role relevant section in reference guide}
    */
  @js.native
  class UserRole protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.security.UserRole {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object AccessRuleContainerBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DemoUser extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenSecurityMod.security.DemoUser = js.native
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * The new DemoUser will be automatically stored in the 'demoUsers' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenSecurityMod.security.ProjectSecurity): typings.mendixmodelsdk.distGenSecurityMod.security.DemoUser = js.native
  }
  
  /* static members */
  @js.native
  object FileDocumentAccessRuleContainer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenSecurityMod.security.FileDocumentAccessRuleContainer = js.native
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * The new FileDocumentAccessRuleContainer will be automatically stored in the 'fileDocumentAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenSecurityMod.security.ProjectSecurity): typings.mendixmodelsdk.distGenSecurityMod.security.FileDocumentAccessRuleContainer = js.native
  }
  
  /* static members */
  @js.native
  object ImageAccessRuleContainer extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenSecurityMod.security.ImageAccessRuleContainer = js.native
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * The new ImageAccessRuleContainer will be automatically stored in the 'imageAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenSecurityMod.security.ProjectSecurity): typings.mendixmodelsdk.distGenSecurityMod.security.ImageAccessRuleContainer = js.native
  }
  
  /* static members */
  @js.native
  object ModuleRole extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenSecurityMod.security.ModuleRole = js.native
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * The new ModuleRole will be automatically stored in the 'moduleRoles' property
      * of the parent ModuleSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenSecurityMod.security.ModuleSecurity): typings.mendixmodelsdk.distGenSecurityMod.security.ModuleRole = js.native
  }
  
  /* static members */
  @js.native
  object ModuleSecurity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo = js.native
    /**
      * Creates a new ModuleSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IModule in which this unit is contained.
      */
    def createIn(container: IModule): typings.mendixmodelsdk.distGenSecurityMod.security.ModuleSecurity = js.native
  }
  
  /* static members */
  @js.native
  object PasswordPolicySettings extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenSecurityMod.security.PasswordPolicySettings = js.native
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * The new PasswordPolicySettings will be automatically stored in the 'passwordPolicySettings' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenSecurityMod.security.ProjectSecurity): typings.mendixmodelsdk.distGenSecurityMod.security.PasswordPolicySettings = js.native
  }
  
  /* static members */
  @js.native
  object ProjectSecurity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo = js.native
    /**
      * Creates a new ProjectSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: IProject): typings.mendixmodelsdk.distGenSecurityMod.security.ProjectSecurity = js.native
  }
  
  /* static members */
  @js.native
  object SecurityLevel extends js.Object {
    var CheckEverything: typings.mendixmodelsdk.distGenSecurityMod.security.SecurityLevel = js.native
    var CheckFormsAndMicroflows: typings.mendixmodelsdk.distGenSecurityMod.security.SecurityLevel = js.native
    var CheckNothing: typings.mendixmodelsdk.distGenSecurityMod.security.SecurityLevel = js.native
  }
  
  /* static members */
  @js.native
  object UserRole extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenSecurityMod.security.UserRole = js.native
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * The new UserRole will be automatically stored in the 'userRoles' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.distGenSecurityMod.security.ProjectSecurity): typings.mendixmodelsdk.distGenSecurityMod.security.UserRole = js.native
  }
  
}

