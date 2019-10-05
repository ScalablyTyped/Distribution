package typings.mendixmodelsdk.distGenAppservicesMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedParameter
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflowParameter")
@js.native
class MsdMicroflowParameter protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var canBeEmpty: Boolean = js.native
  val containerAsMsdMicroflow: MsdMicroflow = js.native
  val containerAsPublishedParameter: PublishedParameter = js.native
  @JSName("model")
  var model_MsdMicroflowParameter: IModel = js.native
  var name: String = js.native
  /**
    * In version 6.1.0: deleted
    */
  var systemEntityType: String = js.native
  var `type`: String = js.native
  var typeSpecification: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdMicroflowParameter")
@js.native
object MsdMicroflowParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdMicroflowParameter = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * The new MsdMicroflowParameter will be automatically stored in the 'parameters' property
    * of the parent MsdMicroflow element passed as argument.
    */
  def createInMsdMicroflowUnderParameters(container: MsdMicroflow): MsdMicroflowParameter = js.native
  /**
    * Creates and returns a new MsdMicroflowParameter instance in the SDK and on the server.
    * The new MsdMicroflowParameter will be automatically stored in the 'parameterByContract' property
    * of the parent webservices.PublishedParameter element passed as argument.
    */
  def createInPublishedParameterUnderParameterByContract(container: PublishedParameter): MsdMicroflowParameter = js.native
}

