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
  var isValidationRequired: Boolean = js.native
  /**
    * In version 7.6.0: deleted
    */
  var mapping: IExportMapping | Null = js.native
  /**
    * In version 7.6.0: deleted
    */
  var mappingArgumentVariableName: String = js.native
  val mappingQualifiedName: String | Null = js.native
  var outputMethod: OutputMethod = js.native
  /**
    * In version 7.6.0: introduced
    */
  var resultHandling: MappingRequestHandling = js.native
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

