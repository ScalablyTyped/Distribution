package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.projectsMod.projects.IModule
import typings.mendixmodelsdk.projectsMod.projects.IProject
import typings.mendixmodelsdk.projectsMod.projects.IProjectDocument
import typings.mendixmodelsdk.projectsMod.projects.Module
import typings.mendixmodelsdk.projectsMod.projects.Project
import typings.mendixmodelsdk.projectsMod.projects.ProjectDocument
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.unitsMod.IModelUnit
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityMod {
  
  @JSImport("mendixmodelsdk/src/gen/security", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object security {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
      */
    @JSImport("mendixmodelsdk/src/gen/security", "security.AccessRuleContainerBase")
    @js.native
    abstract class AccessRuleContainerBase protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def accessRules: IList[AccessRule] = js.native
      
      def containerAsProjectSecurity: ProjectSecurity = js.native
    }
    object AccessRuleContainerBase {
      
      @JSImport("mendixmodelsdk/src/gen/security", "security.AccessRuleContainerBase")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.AccessRuleContainerBase.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.AccessRuleContainerBase.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/demo-users relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/security", "security.DemoUser")
    @js.native
    open class DemoUser protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsProjectSecurity: ProjectSecurity = js.native
      
      def entity: IEntity | Null = js.native
      
      def entityQualifiedName: String | Null = js.native
      
      def entity_=(newValue: IEntity | Null): Unit = js.native
      
      def password: String = js.native
      def password_=(newValue: String): Unit = js.native
      
      def userName: String = js.native
      def userName_=(newValue: String): Unit = js.native
      
      def userRoles: IList[IUserRole] = js.native
      
      def userRolesQualifiedNames: js.Array[String] = js.native
    }
    object DemoUser {
      
      @JSImport("mendixmodelsdk/src/gen/security", "security.DemoUser")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DemoUser instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DemoUser = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DemoUser]
      
      /**
        * Creates and returns a new DemoUser instance in the SDK and on the server.
        * The new DemoUser will be automatically stored in the 'demoUsers' property
        * of the parent ProjectSecurity element passed as argument.
        */
      /* static member */
      inline def createIn(container: ProjectSecurity): DemoUser = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DemoUser]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.DemoUser.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.DemoUser.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/security", "security.FileDocumentAccessRuleContainer")
    @js.native
    open class FileDocumentAccessRuleContainer protected () extends AccessRuleContainerBase {
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
      
      @JSImport("mendixmodelsdk/src/gen/security", "security.FileDocumentAccessRuleContainer")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): FileDocumentAccessRuleContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[FileDocumentAccessRuleContainer]
      
      /**
        * Creates and returns a new FileDocumentAccessRuleContainer instance in the SDK and on the server.
        * The new FileDocumentAccessRuleContainer will be automatically stored in the 'fileDocumentAccess' property
        * of the parent ProjectSecurity element passed as argument.
        */
      /* static member */
      inline def createIn(container: ProjectSecurity): FileDocumentAccessRuleContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[FileDocumentAccessRuleContainer]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.FileDocumentAccessRuleContainer.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.FileDocumentAccessRuleContainer.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/security", "security.ImageAccessRuleContainer")
    @js.native
    open class ImageAccessRuleContainer protected () extends AccessRuleContainerBase {
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
      
      @JSImport("mendixmodelsdk/src/gen/security", "security.ImageAccessRuleContainer")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ImageAccessRuleContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ImageAccessRuleContainer]
      
      /**
        * Creates and returns a new ImageAccessRuleContainer instance in the SDK and on the server.
        * The new ImageAccessRuleContainer will be automatically stored in the 'imageAccess' property
        * of the parent ProjectSecurity element passed as argument.
        */
      /* static member */
      inline def createIn(container: ProjectSecurity): ImageAccessRuleContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ImageAccessRuleContainer]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.ImageAccessRuleContainer.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.ImageAccessRuleContainer.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.securityMod.security.IModuleRole because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsModuleSecurity, name */ @JSImport("mendixmodelsdk/src/gen/security", "security.ModuleRole")
    @js.native
    open class ModuleRole protected ()
      extends Element[IModel]
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsModuleSecurity: ModuleSecurity = js.native
      @JSName("containerAsModuleSecurity")
      val containerAsModuleSecurity_FModuleRole: IModuleSecurity = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FModuleRole: String = js.native
      
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
      @JSName("qualifiedName")
      def qualifiedName_MModuleRole: String | Null = js.native
    }
    object ModuleRole {
      
      @JSImport("mendixmodelsdk/src/gen/security", "security.ModuleRole")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ModuleRole instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ModuleRole = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ModuleRole]
      
      /**
        * Creates and returns a new ModuleRole instance in the SDK and on the server.
        * The new ModuleRole will be automatically stored in the 'moduleRoles' property
        * of the parent ModuleSecurity element passed as argument.
        */
      /* static member */
      inline def createIn(container: ModuleSecurity): ModuleRole = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ModuleRole]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.ModuleRole.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.ModuleRole.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.securityMod.security.IModuleSecurity because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined containerAsModule, moduleRoles */ @JSImport("mendixmodelsdk/src/gen/security", "security.ModuleSecurity")
    @js.native
    open class ModuleSecurity protected () extends ModelUnit[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IModule
      ) = this()
      
      def containerAsModule: Module = js.native
      @JSName("containerAsModule")
      val containerAsModule_FModuleSecurity: IModule = js.native
      
      def moduleRoles: IList[ModuleRole] = js.native
      @JSName("moduleRoles")
      val moduleRoles_FModuleSecurity: IList[IModuleRole] = js.native
    }
    object ModuleSecurity {
      
      @JSImport("mendixmodelsdk/src/gen/security", "security.ModuleSecurity")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ModuleSecurity unit in the SDK and on the server.
        * Expects one argument, the projects.IModule in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IModule): ModuleSecurity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ModuleSecurity]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.ModuleSecurity.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.ModuleSecurity.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/password-policy relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/security", "security.PasswordPolicySettings")
    @js.native
    open class PasswordPolicySettings protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsProjectSecurity: ProjectSecurity = js.native
      
      def minimumLength: Double = js.native
      def minimumLength_=(newValue: Double): Unit = js.native
      
      def requireDigit: Boolean = js.native
      def requireDigit_=(newValue: Boolean): Unit = js.native
      
      def requireMixedCase: Boolean = js.native
      def requireMixedCase_=(newValue: Boolean): Unit = js.native
      
      def requireSymbol: Boolean = js.native
      def requireSymbol_=(newValue: Boolean): Unit = js.native
    }
    object PasswordPolicySettings {
      
      @JSImport("mendixmodelsdk/src/gen/security", "security.PasswordPolicySettings")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): PasswordPolicySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PasswordPolicySettings]
      
      /**
        * Creates and returns a new PasswordPolicySettings instance in the SDK and on the server.
        * The new PasswordPolicySettings will be automatically stored in the 'passwordPolicySettings' property
        * of the parent ProjectSecurity element passed as argument.
        */
      /* static member */
      inline def createIn(container: ProjectSecurity): PasswordPolicySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PasswordPolicySettings]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.PasswordPolicySettings.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.PasswordPolicySettings.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/project-security relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IProjectDocument because Already inherited
    - typings.mendixmodelsdk.securityMod.security.IProjectSecurity because var conflicts: containerAsProject, id, isLoaded, model, structureTypeName, unit. Inlined userRoles */ @JSImport("mendixmodelsdk/src/gen/security", "security.ProjectSecurity")
    @js.native
    open class ProjectSecurity protected () extends ProjectDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IProject
      ) = this()
      
      def adminPassword: String = js.native
      def adminPassword_=(newValue: String): Unit = js.native
      
      def adminUserName: String = js.native
      def adminUserName_=(newValue: String): Unit = js.native
      
      def adminUserRoleName: String = js.native
      def adminUserRoleName_=(newValue: String): Unit = js.native
      
      def checkSecurity: Boolean = js.native
      def checkSecurity_=(newValue: Boolean): Unit = js.native
      
      @JSName("containerAsProject")
      def containerAsProject_MProjectSecurity: Project = js.native
      
      def demoUsers: IList[DemoUser] = js.native
      
      def enableDemoUsers: Boolean = js.native
      def enableDemoUsers_=(newValue: Boolean): Unit = js.native
      
      def enableGuestAccess: Boolean = js.native
      def enableGuestAccess_=(newValue: Boolean): Unit = js.native
      
      /**
        * In version 6.0.0: deprecated
        */
      def fileDocumentAccess: FileDocumentAccessRuleContainer = js.native
      def fileDocumentAccess_=(newValue: FileDocumentAccessRuleContainer): Unit = js.native
      
      def guestUserRoleName: String = js.native
      def guestUserRoleName_=(newValue: String): Unit = js.native
      
      /**
        * In version 6.0.0: deprecated
        */
      def imageAccess: ImageAccessRuleContainer = js.native
      def imageAccess_=(newValue: ImageAccessRuleContainer): Unit = js.native
      
      def passwordPolicySettings: PasswordPolicySettings = js.native
      def passwordPolicySettings_=(newValue: PasswordPolicySettings): Unit = js.native
      
      def securityLevel: SecurityLevel = js.native
      def securityLevel_=(newValue: SecurityLevel): Unit = js.native
      
      /**
        * In version 8.0.0: deleted
        */
      def signInMicroflow: IMicroflow | Null = js.native
      
      def signInMicroflowQualifiedName: String | Null = js.native
      
      def signInMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
      
      /**
        * In version 9.8.0: introduced
        */
      def strictPageUrlCheck: Boolean = js.native
      def strictPageUrlCheck_=(newValue: Boolean): Unit = js.native
      
      def userRoles: IList[UserRole] = js.native
      @JSName("userRoles")
      val userRoles_FProjectSecurity: IList[IUserRole] = js.native
    }
    object ProjectSecurity {
      
      @JSImport("mendixmodelsdk/src/gen/security", "security.ProjectSecurity")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ProjectSecurity unit in the SDK and on the server.
        * Expects one argument, the projects.IProject in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IProject): ProjectSecurity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ProjectSecurity]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.ProjectSecurity.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.ProjectSecurity.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/security", "security.SecurityLevel")
    @js.native
    open class SecurityLevel protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object SecurityLevel {
      
      @JSImport("mendixmodelsdk/src/gen/security", "security.SecurityLevel")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.SecurityLevel.CheckEverything")
      @js.native
      def CheckEverything: SecurityLevel = js.native
      inline def CheckEverything_=(x: SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckEverything")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.SecurityLevel.CheckFormsAndMicroflows")
      @js.native
      def CheckFormsAndMicroflows: SecurityLevel = js.native
      inline def CheckFormsAndMicroflows_=(x: SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckFormsAndMicroflows")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.SecurityLevel.CheckNothing")
      @js.native
      def CheckNothing: SecurityLevel = js.native
      inline def CheckNothing_=(x: SecurityLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckNothing")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/user-roles relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.securityMod.security.IUserRole because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsProjectSecurity, name */ @JSImport("mendixmodelsdk/src/gen/security", "security.UserRole")
    @js.native
    open class UserRole protected ()
      extends Element[IModel]
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def checkSecurity: Boolean = js.native
      def checkSecurity_=(newValue: Boolean): Unit = js.native
      
      def containerAsProjectSecurity: ProjectSecurity = js.native
      @JSName("containerAsProjectSecurity")
      val containerAsProjectSecurity_FUserRole: IProjectSecurity = js.native
      
      def description: String = js.native
      def description_=(newValue: String): Unit = js.native
      
      def guid: String = js.native
      def guid_=(newValue: String): Unit = js.native
      
      def manageAllRoles: Boolean = js.native
      def manageAllRoles_=(newValue: Boolean): Unit = js.native
      
      def manageUsersWithoutRoles: Boolean = js.native
      def manageUsersWithoutRoles_=(newValue: Boolean): Unit = js.native
      
      def manageableRoles: IList[IUserRole] = js.native
      
      def manageableRolesQualifiedNames: js.Array[String] = js.native
      
      def moduleRoles: IList[IModuleRole] = js.native
      
      def moduleRolesQualifiedNames: js.Array[String] = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FUserRole: String = js.native
      
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
      @JSName("qualifiedName")
      def qualifiedName_MUserRole: String | Null = js.native
    }
    object UserRole {
      
      @JSImport("mendixmodelsdk/src/gen/security", "security.UserRole")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new UserRole instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): UserRole = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[UserRole]
      
      /**
        * Creates and returns a new UserRole instance in the SDK and on the server.
        * The new UserRole will be automatically stored in the 'userRoles' property
        * of the parent ProjectSecurity element passed as argument.
        */
      /* static member */
      inline def createIn(container: ProjectSecurity): UserRole = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[UserRole]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.UserRole.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/security", "security.UserRole.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
      */
    @js.native
    trait IModuleRole
      extends StObject
         with IElement
         with IByNameReferrable {
      
      val containerAsModuleSecurity: IModuleSecurity = js.native
      
      @JSName("model")
      val model_IModuleRole: IModel = js.native
      
      val name: String = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/module-security relevant section in reference guide}
      */
    @js.native
    trait IModuleSecurity
      extends StObject
         with IModelUnit {
      
      val containerAsModule: IModule = js.native
      
      @JSName("model")
      val model_IModuleSecurity: IModel = js.native
      
      val moduleRoles: IList[IModuleRole] = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/project-security relevant section in reference guide}
      */
    @js.native
    trait IProjectSecurity
      extends StObject
         with IProjectDocument {
      
      val userRoles: IList[IUserRole] = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/user-roles relevant section in reference guide}
      */
    @js.native
    trait IUserRole
      extends StObject
         with IElement
         with IByNameReferrable {
      
      val containerAsProjectSecurity: IProjectSecurity = js.native
      
      @JSName("model")
      val model_IUserRole: IModel = js.native
      
      val name: String = js.native
    }
  }
}
