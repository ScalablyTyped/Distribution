package typings.mendixmodelsdk.distGenRestMod.rest

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: removed experimental
  * In version 7.8.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.RestOperationParameter")
@js.native
class RestOperationParameter protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRestOperationParameter: IModel = js.native
  def containerAsPublishedRestService(): PublishedRestService = js.native
  def containerAsPublishedRestServiceOperation(): PublishedRestServiceOperation = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def dataType(): String = js.native
  def dataType(newValue: String): js.Any = js.native
  /**
    * In version 8.3.0: introduced
    */
  def description(): String = js.native
  def description(newValue: String): js.Any = js.native
  /**
    * In version 7.17.0: introduced
    */
  def microflowParameter(): IMicroflowParameter | Null = js.native
  def microflowParameter(newValue: IMicroflowParameter): js.Any = js.native
  def microflowParameterQualifiedName(): String | Null = js.native
  @JSName("microflowParameter")
  def microflowParameter_Any(): js.Any = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  def parameterType(): RestOperationParameterType = js.native
  def parameterType(newValue: RestOperationParameterType): js.Any = js.native
  /**
    * In version 7.17.0: introduced
    */
  def `type`(): DataType = js.native
  def `type`(newValue: DataType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.RestOperationParameter")
@js.native
object RestOperationParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RestOperationParameter = js.native
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * The new RestOperationParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedRestServiceOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInPublishedRestServiceOperationUnderParameters(container: PublishedRestServiceOperation): RestOperationParameter = js.native
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * The new RestOperationParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedRestService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInPublishedRestServiceUnderParameters(container: PublishedRestService): RestOperationParameter = js.native
}

