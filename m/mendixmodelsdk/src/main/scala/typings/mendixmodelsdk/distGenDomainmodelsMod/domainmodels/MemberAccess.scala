package typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberAccess")
@js.native
class MemberAccess protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var accessRights: MemberAccessRights = js.native
  var association: IAssociationBase | Null = js.native
  val associationQualifiedName: String | Null = js.native
  var attribute: IAttribute | Null = js.native
  val attributeQualifiedName: String | Null = js.native
  val containerAsAccessRule: AccessRule = js.native
  @JSName("model")
  var model_MemberAccess: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberAccess")
@js.native
object MemberAccess extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MemberAccess instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MemberAccess = js.native
  /**
    * Creates and returns a new MemberAccess instance in the SDK and on the server.
    * The new MemberAccess will be automatically stored in the 'memberAccesses' property
    * of the parent AccessRule element passed as argument.
    */
  def createIn(container: AccessRule): MemberAccess = js.native
}

