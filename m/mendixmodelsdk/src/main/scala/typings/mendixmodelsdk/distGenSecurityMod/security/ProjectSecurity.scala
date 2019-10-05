package typings.mendixmodelsdk.distGenSecurityMod.security

import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenProjectsMod.projects.IProject
import typings.mendixmodelsdk.distGenProjectsMod.projects.Project
import typings.mendixmodelsdk.distGenProjectsMod.projects.ProjectDocument
import typings.mendixmodelsdk.distGenSecurityMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IProjectDocument because Already inherited
- typings.mendixmodelsdk.distGenSecurityMod.security.IProjectSecurity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined userRoles */ @JSImport("mendixmodelsdk/dist/gen/security", "security.ProjectSecurity")
@js.native
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

