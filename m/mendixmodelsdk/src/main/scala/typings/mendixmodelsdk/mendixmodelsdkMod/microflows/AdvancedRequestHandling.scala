package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.AdvancedRequestHandling")
@js.native
class AdvancedRequestHandling protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.AdvancedRequestHandling {
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
@JSImport("mendixmodelsdk", "microflows.AdvancedRequestHandling")
@js.native
object AdvancedRequestHandling extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.AdvancedRequestHandling = js.native
  /**
    * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
    * The new AdvancedRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createInRestCallActionUnderRequestHandling(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RestCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.AdvancedRequestHandling = js.native
  /**
    * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
    * The new AdvancedRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  def createInWebServiceCallActionUnderRequestBodyHandling(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.AdvancedRequestHandling = js.native
  /**
    * Creates and returns a new AdvancedRequestHandling instance in the SDK and on the server.
    * The new AdvancedRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  def createInWebServiceCallActionUnderRequestHeaderHandling(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.AdvancedRequestHandling = js.native
}

