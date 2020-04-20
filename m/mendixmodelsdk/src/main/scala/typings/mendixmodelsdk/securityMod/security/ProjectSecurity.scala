package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.projectsMod.projects.IProject
import typings.mendixmodelsdk.projectsMod.projects.Project
import typings.mendixmodelsdk.projectsMod.projects.ProjectDocument
import typings.mendixmodelsdk.securityMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
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
  @JSName("model")
  var model_FProjectSecurity: IModel = js.native
  @JSName("userRoles")
  val userRoles_FProjectSecurity: IList[IUserRole] = js.native
  def adminPassword: String = js.native
  def adminPassword(newValue: String): js.Any = js.native
  def adminUserName: String = js.native
  def adminUserName(newValue: String): js.Any = js.native
  def adminUserRoleName: String = js.native
  def adminUserRoleName(newValue: String): js.Any = js.native
  def checkSecurity: Boolean = js.native
  def checkSecurity(newValue: Boolean): js.Any = js.native
  @JSName("containerAsProject")
  def containerAsProject_MProjectSecurity: Project = js.native
  def demoUsers: IList[DemoUser] = js.native
  def enableDemoUsers: Boolean = js.native
  def enableDemoUsers(newValue: Boolean): js.Any = js.native
  def enableGuestAccess: Boolean = js.native
  def enableGuestAccess(newValue: Boolean): js.Any = js.native
  /**
    * In version 6.0.0: deprecated
    */
  def fileDocumentAccess: FileDocumentAccessRuleContainer = js.native
  def fileDocumentAccess(newValue: FileDocumentAccessRuleContainer): js.Any = js.native
  def guestUserRoleName: String = js.native
  def guestUserRoleName(newValue: String): js.Any = js.native
  /**
    * In version 6.0.0: deprecated
    */
  def imageAccess: ImageAccessRuleContainer = js.native
  def imageAccess(newValue: ImageAccessRuleContainer): js.Any = js.native
  def passwordPolicySettings: PasswordPolicySettings = js.native
  def passwordPolicySettings(newValue: PasswordPolicySettings): js.Any = js.native
  def securityLevel: SecurityLevel = js.native
  def securityLevel(newValue: SecurityLevel): js.Any = js.native
  def signInMicroflow(): js.Any = js.native
  def signInMicroflow(newValue: IMicroflow): js.Any = js.native
  def signInMicroflowQualifiedName: String | Null = js.native
  /**
    * In version 8.0.0: deleted
    */
  @JSName("signInMicroflow")
  def signInMicroflow_Union: IMicroflow | Null = js.native
  def userRoles: IList[UserRole] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.ProjectSecurity")
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

