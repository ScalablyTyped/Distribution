package typings.mendixmodelsdk.distGenRestMod.rest

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedResource
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  /**
    * In version 8.0.0: introduced
    */
  var description: String = js.native
  /**
    * In version 7.19.0: introduced
    */
  var exposedName: String = js.native
  var pageSize: Double = js.native
  var path: String = js.native
  /**
    * In version 8.0.0: introduced
    */
  var summary: String = js.native
  var usePaging: Boolean = js.native
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

