package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.exportmappingsMod.exportmappings.IExportMapping
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/export-mapping-action relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportXmlAction")
@js.native
class ExportXmlAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FExportXmlAction: IModel = js.native
  def isValidationRequired: Boolean = js.native
  def isValidationRequired(newValue: Boolean): js.Any = js.native
  def mapping(): js.Any = js.native
  def mapping(newValue: IExportMapping): js.Any = js.native
  /**
    * In version 7.6.0: deleted
    */
  def mappingArgumentVariableName: String = js.native
  def mappingArgumentVariableName(newValue: String): js.Any = js.native
  def mappingQualifiedName: String | Null = js.native
  /**
    * In version 7.6.0: deleted
    */
  @JSName("mapping")
  def mapping_Union: IExportMapping | Null = js.native
  def outputMethod: OutputMethod = js.native
  def outputMethod(newValue: OutputMethod): js.Any = js.native
  /**
    * In version 7.6.0: introduced
    */
  def resultHandling: MappingRequestHandling = js.native
  def resultHandling(newValue: MappingRequestHandling): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportXmlAction")
@js.native
object ExportXmlAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ExportXmlAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ExportXmlAction = js.native
  /**
    * Creates and returns a new ExportXmlAction instance in the SDK and on the server.
    * The new ExportXmlAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): ExportXmlAction = js.native
}

