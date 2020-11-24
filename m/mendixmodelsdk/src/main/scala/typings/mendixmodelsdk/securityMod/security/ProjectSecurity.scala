package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.projectsMod.projects.IProject
import typings.mendixmodelsdk.projectsMod.projects.Project
import typings.mendixmodelsdk.projectsMod.projects.ProjectDocument
import typings.mendixmodelsdk.securityMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
- typings.mendixmodelsdk.securityMod.security.IProjectSecurity because var conflicts: containerAsProject, id, isLoaded, model, structureTypeName, unit. Inlined userRoles */ @JSImport("mendixmodelsdk/dist/gen/security", "security.ProjectSecurity")
@js.native
class ProjectSecurity protected () extends ProjectDocument {
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
  
  def userRoles: IList[UserRole] = js.native
  @JSName("userRoles")
  val userRoles_FProjectSecurity: IList[IUserRole] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.ProjectSecurity")
@js.native
object ProjectSecurity extends js.Object {
  
  /**
    * Creates a new ProjectSecurity unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  def createIn(container: IProject): ProjectSecurity = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
