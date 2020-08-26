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
  * In version 7.21.0: deleted
  * In version 7.2.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportMappingJavaActionParameterValue")
@js.native
class ExportMappingJavaActionParameterValue protected () extends JavaActionParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FExportMappingJavaActionParameterValue: IModel = js.native
  def exportMapping: IExportMapping | Null = js.native
  def exportMappingQualifiedName: String | Null = js.native
  def exportMapping_=(newValue: IExportMapping | Null): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ExportMappingJavaActionParameterValue")
@js.native
object ExportMappingJavaActionParameterValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ExportMappingJavaActionParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ExportMappingJavaActionParameterValue = js.native
  /**
    * Creates and returns a new ExportMappingJavaActionParameterValue instance in the SDK and on the server.
    * The new ExportMappingJavaActionParameterValue will be automatically stored in the 'value' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 to 7.20.0
    */
  def createIn(container: JavaActionParameterMapping): ExportMappingJavaActionParameterValue = js.native
}

