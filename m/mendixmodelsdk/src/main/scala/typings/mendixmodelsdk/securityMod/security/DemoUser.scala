package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
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
  * See: {@link https://docs.mendix.com/refguide7/demo-users relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/security", "security.DemoUser")
@js.native
class DemoUser protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDemoUser: IModel = js.native
  def containerAsProjectSecurity(): ProjectSecurity = js.native
  def entity(): js.Any = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName(): String | Null = js.native
  @JSName("entity")
  def entity_Union(): IEntity | Null = js.native
  def password(): String = js.native
  def password(newValue: String): js.Any = js.native
  def userName(): String = js.native
  def userName(newValue: String): js.Any = js.native
  def userRoles(): IList[IUserRole] = js.native
  def userRolesQualifiedNames(): js.Array[String] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.DemoUser")
@js.native
object DemoUser extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DemoUser instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DemoUser = js.native
  /**
    * Creates and returns a new DemoUser instance in the SDK and on the server.
    * The new DemoUser will be automatically stored in the 'demoUsers' property
    * of the parent ProjectSecurity element passed as argument.
    */
  def createIn(container: ProjectSecurity): DemoUser = js.native
}

