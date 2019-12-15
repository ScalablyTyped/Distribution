package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenExportmappingsMod.exportmappings.IExportMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceOperationAdvancedParameterMapping")
@js.native
class WebServiceOperationAdvancedParameterMapping protected () extends WebServiceOperationParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FWebServiceOperationAdvancedParameterMapping: IModel = js.native
  def mapping(): IExportMapping | Null = js.native
  def mapping(newValue: IExportMapping): js.Any = js.native
  def mappingArgumentVariableName(): String = js.native
  def mappingArgumentVariableName(newValue: String): js.Any = js.native
  def mappingQualifiedName(): String | Null = js.native
  @JSName("mapping")
  def mapping_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceOperationAdvancedParameterMapping")
@js.native
object WebServiceOperationAdvancedParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WebServiceOperationAdvancedParameterMapping = js.native
  /**
    * Creates and returns a new WebServiceOperationAdvancedParameterMapping instance in the SDK and on the server.
    * The new WebServiceOperationAdvancedParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent AdvancedRequestHandling element passed as argument.
    */
  def createIn(container: AdvancedRequestHandling): WebServiceOperationAdvancedParameterMapping = js.native
}

