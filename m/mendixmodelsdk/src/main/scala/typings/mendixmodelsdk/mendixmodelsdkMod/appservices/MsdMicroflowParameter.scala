package typings.mendixmodelsdk.mendixmodelsdkMod.appservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "appservices.MsdMicroflowParameter")
@js.native
class MsdMicroflowParameter protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.appservices.MsdMicroflowParameter {
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
@JSImport("mendixmodelsdk", "appservices.MsdMicroflowParameter")
@js.native
object MsdMicroflowParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMicroflowParameter = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * The new MsdMicroflowParameter will be automatically stored in the 'parameters' property
    * of the parent MsdMicroflow element passed as argument.
    */
  def createInMsdMicroflowUnderParameters(container: typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMicroflow): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMicroflowParameter = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * The new MsdMicroflowParameter will be automatically stored in the 'parameterByContract' property
    * of the parent webservices.PublishedParameter element passed as argument.
    */
  def createInPublishedParameterUnderParameterByContract(container: PublishedParameter): typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMicroflowParameter = js.native
}

