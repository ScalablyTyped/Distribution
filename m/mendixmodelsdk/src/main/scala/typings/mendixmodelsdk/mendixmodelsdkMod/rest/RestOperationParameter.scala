package typings.mendixmodelsdk.mendixmodelsdkMod.rest

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: removed experimental
  * In version 7.8.0: introduced
  */
@JSImport("mendixmodelsdk", "rest.RestOperationParameter")
@js.native
class RestOperationParameter protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.rest.RestOperationParameter {
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
@JSImport("mendixmodelsdk", "rest.RestOperationParameter")
@js.native
object RestOperationParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenRestMod.rest.RestOperationParameter = js.native
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * The new RestOperationParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedRestServiceOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInPublishedRestServiceOperationUnderParameters(container: typings.mendixmodelsdk.distGenRestMod.rest.PublishedRestServiceOperation): typings.mendixmodelsdk.distGenRestMod.rest.RestOperationParameter = js.native
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * The new RestOperationParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedRestService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInPublishedRestServiceUnderParameters(container: typings.mendixmodelsdk.distGenRestMod.rest.PublishedRestService): typings.mendixmodelsdk.distGenRestMod.rest.RestOperationParameter = js.native
}

