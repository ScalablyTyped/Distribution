package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.ResultHandling")
@js.native
class ResultHandling protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.ResultHandling {
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
@JSImport("mendixmodelsdk", "microflows.ResultHandling")
@js.native
object ResultHandling extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ResultHandling = js.native
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent ImportXmlAction element passed as argument.
    */
  def createInImportXmlActionUnderResultHandling(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ImportXmlAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ResultHandling = js.native
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createInRestCallActionUnderResultHandling(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.RestCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ResultHandling = js.native
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  def createInWebServiceCallActionUnderResultHandling(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ResultHandling = js.native
}

