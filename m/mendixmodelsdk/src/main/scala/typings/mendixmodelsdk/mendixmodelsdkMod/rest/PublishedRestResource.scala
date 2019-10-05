package typings.mendixmodelsdk.mendixmodelsdkMod.rest

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-odata-resource relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "rest.PublishedRestResource")
@js.native
class PublishedRestResource protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.rest.PublishedRestResource {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "rest.PublishedRestResource")
@js.native
object PublishedRestResource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenRestMod.rest.PublishedRestResource = js.native
  /**
    * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
    * The new PublishedRestResource will be automatically stored in the 'resources' property
    * of the parent PublishedODataService element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenRestMod.rest.PublishedODataService): typings.mendixmodelsdk.distGenRestMod.rest.PublishedRestResource = js.native
}

