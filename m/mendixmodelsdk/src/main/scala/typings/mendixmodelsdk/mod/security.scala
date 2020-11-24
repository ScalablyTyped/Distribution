package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.projectsMod.projects.IModule
import typings.mendixmodelsdk.projectsMod.projects.IProject
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "security")
@js.native
object security extends js.Object {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
    */
  @js.native
  abstract class AccessRuleContainerBase protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.security.AccessRuleContainerBase {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object AccessRuleContainerBase extends js.Object {
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/demo-users relevant section in reference guide}
    */
  @js.native
  class DemoUser protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.security.DemoUser {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object DemoUser extends js.Object {
    
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.DemoUser = js.native
    
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * The new DemoUser will be automatically stored in the 'demoUsers' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.DemoUser = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class FileDocumentAccessRuleContainer protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.security.FileDocumentAccessRuleContainer {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object FileDocumentAccessRuleContainer extends js.Object {
    
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.FileDocumentAccessRuleContainer = js.native
    
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * The new FileDocumentAccessRuleContainer will be automatically stored in the 'fileDocumentAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.FileDocumentAccessRuleContainer = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class ImageAccessRuleContainer protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.security.ImageAccessRuleContainer {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object ImageAccessRuleContainer extends js.Object {
    
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.ImageAccessRuleContainer = js.native
    
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * The new ImageAccessRuleContainer will be automatically stored in the 'imageAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.ImageAccessRuleContainer = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
    */
  @js.native
  class ModuleRole protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.security.ModuleRole {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object ModuleRole extends js.Object {
    
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.ModuleRole = js.native
    
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * The new ModuleRole will be automatically stored in the 'moduleRoles' property
      * of the parent ModuleSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ModuleSecurity): typings.mendixmodelsdk.securityMod.security.ModuleRole = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
    */
  @js.native
  class ModuleSecurity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.security.ModuleSecurity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
  }
  /* static members */
  @js.native
  object ModuleSecurity extends js.Object {
    
    /**
      * Creates a new ModuleSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IModule in which this unit is contained.
      */
    def createIn(container: IModule): typings.mendixmodelsdk.securityMod.security.ModuleSecurity = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/password-policy relevant section in reference guide}
    */
  @js.native
  class PasswordPolicySettings protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.security.PasswordPolicySettings {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object PasswordPolicySettings extends js.Object {
    
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.PasswordPolicySettings = js.native
    
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * The new PasswordPolicySettings will be automatically stored in the 'passwordPolicySettings' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.PasswordPolicySettings = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/project-security relevant section in reference guide}
    */
  @js.native
  class ProjectSecurity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.security.ProjectSecurity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  /* static members */
  @js.native
  object ProjectSecurity extends js.Object {
    
    /**
      * Creates a new ProjectSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: IProject): typings.mendixmodelsdk.securityMod.security.ProjectSecurity = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
  
  @js.native
  class SecurityLevel ()
    extends typings.mendixmodelsdk.allModelClassesMod.security.SecurityLevel
  /* static members */
  @js.native
  object SecurityLevel extends js.Object {
    
    var CheckEverything: typings.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
    
    var CheckFormsAndMicroflows: typings.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
    
    var CheckNothing: typings.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/user-roles relevant section in reference guide}
    */
  @js.native
  class UserRole protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.security.UserRole {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  /* static members */
  @js.native
  object UserRole extends js.Object {
    
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.UserRole = js.native
    
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * The new UserRole will be automatically stored in the 'userRoles' property
      * of the parent ProjectSecurity element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.UserRole = js.native
    
    var structureTypeName: String = js.native
    
    var versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
  }
}
