package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
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
  @JSImport("mendixmodelsdk", "security.AccessRuleContainerBase")
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
  object AccessRuleContainerBase {
    
    @JSImport("mendixmodelsdk", "security.AccessRuleContainerBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.AccessRuleContainerBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.AccessRuleContainerBase.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/demo-users relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.DemoUser")
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
  object DemoUser {
    
    @JSImport("mendixmodelsdk", "security.DemoUser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.DemoUser.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.DemoUser = js.native
    
    /**
      * Creates and returns a new DemoUser instance in the SDK and on the server.
      * The new DemoUser will be automatically stored in the 'demoUsers' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.DemoUser.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.DemoUser = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.DemoUser.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.DemoUser.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "security.FileDocumentAccessRuleContainer")
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
  object FileDocumentAccessRuleContainer {
    
    @JSImport("mendixmodelsdk", "security.FileDocumentAccessRuleContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.FileDocumentAccessRuleContainer.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.FileDocumentAccessRuleContainer = js.native
    
    /**
      * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
      * The new FileDocumentAccessRuleContainer will be automatically stored in the 'fileDocumentAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.FileDocumentAccessRuleContainer.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.FileDocumentAccessRuleContainer = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.FileDocumentAccessRuleContainer.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.FileDocumentAccessRuleContainer.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "security.ImageAccessRuleContainer")
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
  object ImageAccessRuleContainer {
    
    @JSImport("mendixmodelsdk", "security.ImageAccessRuleContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.ImageAccessRuleContainer.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.ImageAccessRuleContainer = js.native
    
    /**
      * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
      * The new ImageAccessRuleContainer will be automatically stored in the 'imageAccess' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.ImageAccessRuleContainer.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.ImageAccessRuleContainer = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ImageAccessRuleContainer.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ImageAccessRuleContainer.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.ModuleRole")
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
  object ModuleRole {
    
    @JSImport("mendixmodelsdk", "security.ModuleRole")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.ModuleRole.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.ModuleRole = js.native
    
    /**
      * Creates and returns a new ModuleRole instance in the SDK and on the server.
      * The new ModuleRole will be automatically stored in the 'moduleRoles' property
      * of the parent ModuleSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.ModuleRole.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ModuleSecurity): typings.mendixmodelsdk.securityMod.security.ModuleRole = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ModuleRole.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ModuleRole.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.ModuleSecurity")
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
  object ModuleSecurity {
    
    @JSImport("mendixmodelsdk", "security.ModuleSecurity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ModuleSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IModule in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.ModuleSecurity.createIn")
    @js.native
    def createIn(container: IModule): typings.mendixmodelsdk.securityMod.security.ModuleSecurity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ModuleSecurity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ModuleSecurity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/password-policy relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.PasswordPolicySettings")
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
  object PasswordPolicySettings {
    
    @JSImport("mendixmodelsdk", "security.PasswordPolicySettings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.PasswordPolicySettings.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.PasswordPolicySettings = js.native
    
    /**
      * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
      * The new PasswordPolicySettings will be automatically stored in the 'passwordPolicySettings' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.PasswordPolicySettings.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.PasswordPolicySettings = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.PasswordPolicySettings.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.PasswordPolicySettings.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/project-security relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.ProjectSecurity")
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
  object ProjectSecurity {
    
    @JSImport("mendixmodelsdk", "security.ProjectSecurity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ProjectSecurity unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.ProjectSecurity.createIn")
    @js.native
    def createIn(container: IProject): typings.mendixmodelsdk.securityMod.security.ProjectSecurity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ProjectSecurity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.ProjectSecurity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "security.SecurityLevel")
  @js.native
  class SecurityLevel protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.security.SecurityLevel {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object SecurityLevel {
    
    @JSImport("mendixmodelsdk", "security.SecurityLevel")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.SecurityLevel.CheckEverything")
    @js.native
    def CheckEverything: typings.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
    @scala.inline
    def CheckEverything_=(x: typings.mendixmodelsdk.securityMod.security.SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckEverything")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.SecurityLevel.CheckFormsAndMicroflows")
    @js.native
    def CheckFormsAndMicroflows: typings.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
    @scala.inline
    def CheckFormsAndMicroflows_=(x: typings.mendixmodelsdk.securityMod.security.SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckFormsAndMicroflows")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.SecurityLevel.CheckNothing")
    @js.native
    def CheckNothing: typings.mendixmodelsdk.securityMod.security.SecurityLevel = js.native
    @scala.inline
    def CheckNothing_=(x: typings.mendixmodelsdk.securityMod.security.SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckNothing")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/user-roles relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "security.UserRole")
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
  object UserRole {
    
    @JSImport("mendixmodelsdk", "security.UserRole")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.UserRole.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.securityMod.security.UserRole = js.native
    
    /**
      * Creates and returns a new UserRole instance in the SDK and on the server.
      * The new UserRole will be automatically stored in the 'userRoles' property
      * of the parent ProjectSecurity element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "security.UserRole.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.securityMod.security.ProjectSecurity): typings.mendixmodelsdk.securityMod.security.UserRole = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.UserRole.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "security.UserRole.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.securityMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.securityMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
