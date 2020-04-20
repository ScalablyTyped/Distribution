package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import typings.mendixmodelsdk.webservicesMod.webservices.PublishedResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-odata-resource relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestResource")
@js.native
class PublishedRestResource protected () extends PublishedResource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FPublishedRestResource: IModel = js.native
  /**
    * In version 8.0.0: introduced
    */
  def description: String = js.native
  def description(newValue: String): js.Any = js.native
  /**
    * In version 7.19.0: introduced
    */
  def exposedName: String = js.native
  def exposedName(newValue: String): js.Any = js.native
  def pageSize: Double = js.native
  def pageSize(newValue: Double): js.Any = js.native
  def path: String = js.native
  def path(newValue: String): js.Any = js.native
  /**
    * In version 8.0.0: introduced
    */
  def summary: String = js.native
  def summary(newValue: String): js.Any = js.native
  def usePaging: Boolean = js.native
  def usePaging(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestResource")
@js.native
object PublishedRestResource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PublishedRestResource = js.native
  /**
    * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
    * The new PublishedRestResource will be automatically stored in the 'resources' property
    * of the parent PublishedODataService element passed as argument.
    */
  def createIn(container: PublishedODataService): PublishedRestResource = js.native
}

