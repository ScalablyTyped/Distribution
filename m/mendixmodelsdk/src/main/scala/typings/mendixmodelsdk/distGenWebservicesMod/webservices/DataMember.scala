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
  @JSName("model")
  var model_FDataMember: IModel = js.native
  def containerAsDataEntityBase(): DataEntityBase = js.native
  def containerAsPublishedParameter(): PublishedParameter = js.native
  def containerAsPublishedResource(): PublishedResource = js.native
  def exposedName(): String = js.native
  def exposedName(newValue: String): js.Any = js.native
  def isKey(): Boolean = js.native
  def isKey(newValue: Boolean): js.Any = js.native
  def isLockedByContract(): Boolean = js.native
  def isLockedByContract(newValue: Boolean): js.Any = js.native
  def isNillable(): Boolean = js.native
  def isNillable(newValue: Boolean): js.Any = js.native
  def isNillableByContract(): Boolean = js.native
  def isNillableByContract(newValue: Boolean): js.Any = js.native
  def isOptional(): Boolean = js.native
  def isOptional(newValue: Boolean): js.Any = js.native
  def isOptionalByContract(): Boolean = js.native
  def isOptionalByContract(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataMember")
@js.native
object DataMember extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

