package typings.mendixmodelsdk.distGenWebservicesMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenRestMod.rest.PublishedODataService
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedResource")
@js.native
abstract class PublishedResource protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FPublishedResource: IModel = js.native
  def containerAsPublishedODataService(): PublishedODataService = js.native
  def containerAsVersionedService(): VersionedService = js.native
  def dataEntity(): DataEntity = js.native
  def dataEntity(newValue: DataEntity): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedResource")
@js.native
object PublishedResource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

