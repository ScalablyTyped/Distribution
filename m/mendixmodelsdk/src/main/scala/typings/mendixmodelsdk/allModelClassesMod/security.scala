package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.projects.IModule
import typings.mendixmodelsdk.projectsMod.projects.IProject
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object security {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.AccessRuleContainerBase")
  @js.native
  abstract class AccessRuleContainerBase protected ()
    extends typings.mendixmodelsdk.securityMod.security.AccessRuleContainerBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AccessRuleContainerBase {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.AccessRuleContainerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.AccessRuleContainerBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.AccessRuleContainerBase.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/demo-users relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.DemoUser")
  @js.native
  class DemoUser protected ()
    extends typings.mendixmodelsdk.securityMod.security.DemoUser {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DemoUser {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.DemoUser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.DemoUser.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.DemoUser = js.native
    
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * The new DemoUser will be automatically stored in the 'demoUsers' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.DemoUser.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.DemoUser = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.DemoUser.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.DemoUser.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.FileDocumentAccessRuleContainer")
  @js.native
  class FileDocumentAccessRuleContainer protected ()
    extends typings.mendixmodelsdk.securityMod.security.FileDocumentAccessRuleContainer {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object FileDocumentAccessRuleContainer {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.FileDocumentAccessRuleContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.FileDocumentAccessRuleContainer.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.FileDocumentAccessRuleContainer = js.native
    
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * The new FileDocumentAccessRuleContainer will be automatically stored in the 'fileDocumentAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.FileDocumentAccessRuleContainer.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.FileDocumentAccessRuleContainer = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.FileDocumentAccessRuleContainer.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.FileDocumentAccessRuleContainer.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ImageAccessRuleContainer")
  @js.native
  class ImageAccessRuleContainer protected ()
    extends typings.mendixmodelsdk.securityMod.security.ImageAccessRuleContainer {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ImageAccessRuleContainer {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ImageAccessRuleContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ImageAccessRuleContainer.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.ImageAccessRuleContainer = js.native
    
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * The new ImageAccessRuleContainer will be automatically stored in the 'imageAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ImageAccessRuleContainer.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.ImageAccessRuleContainer = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ImageAccessRuleContainer.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ImageAccessRuleContainer.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ModuleRole")
  @js.native
  class ModuleRole protected ()
    extends typings.mendixmodelsdk.securityMod.security.ModuleRole {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ModuleRole {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ModuleRole")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ModuleRole.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.ModuleRole = js.native
    
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * The new ModuleRole will be automatically stored in the 'moduleRoles' property
      * of the parent ModuleSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ModuleRole.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ModuleSecurity): typings.mendixmodelsdk.securityMod.security.ModuleRole = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ModuleRole.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ModuleRole.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ModuleSecurity")
  @js.native
  class ModuleSecurity protected ()
    extends typings.mendixmodelsdk.securityMod.security.ModuleSecurity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
  }
  object ModuleSecurity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ModuleSecurity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ModuleSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IModule in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ModuleSecurity.createIn")
    @js.native
    def createIn(container: IModule): typings.mendixmodelsdk.securityMod.security.ModuleSecurity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ModuleSecurity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ModuleSecurity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/password-policy relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.PasswordPolicySettings")
  @js.native
  class PasswordPolicySettings protected ()
    extends typings.mendixmodelsdk.securityMod.security.PasswordPolicySettings {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object PasswordPolicySettings {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.PasswordPolicySettings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.PasswordPolicySettings.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.PasswordPolicySettings = js.native
    
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * The new PasswordPolicySettings will be automatically stored in the 'passwordPolicySettings' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.PasswordPolicySettings.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.PasswordPolicySettings = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.PasswordPolicySettings.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.PasswordPolicySettings.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/project-security relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ProjectSecurity")
  @js.native
  class ProjectSecurity protected ()
    extends typings.mendixmodelsdk.securityMod.security.ProjectSecurity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object ProjectSecurity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ProjectSecurity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ProjectSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ProjectSecurity.createIn")
    @js.native
    def createIn(container: IProject): typings.mendixmodelsdk.securityMod.security.ProjectSecurity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ProjectSecurity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.ProjectSecurity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.SecurityLevel")
  @js.native
  class SecurityLevel protected ()
    extends typings.mendixmodelsdk.securityMod.security.SecurityLevel {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object SecurityLevel {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.SecurityLevel")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.SecurityLevel.CheckEverything")
    @js.native
    def CheckEverything: typings.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
    @scala.inline
    def CheckEverything_=(x: typings.mendixmodelsdk.securityMod.security.SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckEverything")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.SecurityLevel.CheckFormsAndMicroflows")
    @js.native
    def CheckFormsAndMicroflows: typings.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
    @scala.inline
    def CheckFormsAndMicroflows_=(x: typings.mendixmodelsdk.securityMod.security.SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckFormsAndMicroflows")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.SecurityLevel.CheckNothing")
    @js.native
    def CheckNothing: typings.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
    @scala.inline
    def CheckNothing_=(x: typings.mendixmodelsdk.securityMod.security.SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckNothing")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/user-roles relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.UserRole")
  @js.native
  class UserRole protected ()
    extends typings.mendixmodelsdk.securityMod.security.UserRole {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object UserRole {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.UserRole")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.UserRole.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.UserRole = js.native
    
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * The new UserRole will be automatically stored in the 'userRoles' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.UserRole.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.UserRole = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.UserRole.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "security.UserRole.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
