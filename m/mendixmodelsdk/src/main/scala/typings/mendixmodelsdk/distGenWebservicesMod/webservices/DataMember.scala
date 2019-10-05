package typings.mendixmodelsdk.distGenWebservicesMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `WebServices`.
  */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataMember")
@js.native
abstract class DataMember protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsDataEntityBase: DataEntityBase = js.native
  val containerAsPublishedParameter: PublishedParameter = js.native
  val containerAsPublishedResource: PublishedResource = js.native
  var exposedName: String = js.native
  var isKey: Boolean = js.native
  var isLockedByContract: Boolean = js.native
  var isNillable: Boolean = js.native
  var isNillableByContract: Boolean = js.native
  var isOptional: Boolean = js.native
  var isOptionalByContract: Boolean = js.native
  @JSName("model")
  var model_DataMember: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataMember")
@js.native
object DataMember extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

