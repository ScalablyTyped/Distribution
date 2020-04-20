package typings.mendixmodelsdk.appservicesMod.appservices

import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.webservicesMod.webservices.PublishedParameter
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
  @JSName("model")
  var model_FMsdMicroflowParameter: IModel = js.native
  def canBeEmpty: Boolean = js.native
  def canBeEmpty(newValue: Boolean): js.Any = js.native
  def containerAsMsdMicroflow: MsdMicroflow = js.native
  def containerAsPublishedParameter: PublishedParameter = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  /**
    * In version 6.1.0: deleted
    */
  def systemEntityType: String = js.native
  def systemEntityType(newValue: String): js.Any = js.native
  def `type`: String = js.native
  def `type`(newValue: String): js.Any = js.native
  def typeSpecification: String = js.native
  def typeSpecification(newValue: String): js.Any = js.native
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

