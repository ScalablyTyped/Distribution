package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.securityMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/user-role relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.securityMod.security.IUserRole because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsProjectSecurity, name */ @JSImport("mendixmodelsdk/dist/gen/security", "security.UserRole")
@js.native
class UserRole protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsProjectSecurity")
  val containerAsProjectSecurity_FUserRole: IProjectSecurity = js.native
  @JSName("model")
  var model_FUserRole: IModel = js.native
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
  def checkSecurity(): Boolean = js.native
  def checkSecurity(newValue: Boolean): js.Any = js.native
  def containerAsProjectSecurity(): ProjectSecurity = js.native
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  def guid(): String = js.native
  def guid(newValue: String): js.Any = js.native
  def manageAllRoles(): Boolean = js.native
  def manageAllRoles(newValue: Boolean): js.Any = js.native
  def manageUsersWithoutRoles(): Boolean = js.native
  def manageUsersWithoutRoles(newValue: Boolean): js.Any = js.native
  def manageableRoles(): IList[IUserRole] = js.native
  def manageableRolesQualifiedNames(): js.Array[String] = js.native
  def moduleRoles(): IList[IModuleRole] = js.native
  def moduleRolesQualifiedNames(): js.Array[String] = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MUserRole(): String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.UserRole")
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

