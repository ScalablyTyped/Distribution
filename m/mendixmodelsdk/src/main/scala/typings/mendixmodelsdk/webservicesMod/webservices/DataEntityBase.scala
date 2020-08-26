package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataEntityBase")
@js.native
abstract class DataEntityBase protected () extends DataMember {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataEntityBase: IModel = js.native
  def childMembers: IList[DataMember] = js.native
  def entity: IEntity | Null = js.native
  def entityQualifiedName: String | Null = js.native
  def entity_=(newValue: IEntity | Null): Unit = js.native
  def exposedItemName: String = js.native
  def exposedItemName_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataEntityBase")
@js.native
object DataEntityBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

