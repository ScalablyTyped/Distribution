package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ImportMappingParameterValue")
@js.native
class ImportMappingParameterValue protected () extends ExpressionBasedCodeActionParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FImportMappingParameterValue: IModel = js.native
  def importMapping(): js.Any = js.native
  def importMapping(newValue: IImportMapping): js.Any = js.native
  def importMappingQualifiedName: String | Null = js.native
  @JSName("importMapping")
  def importMapping_Union: IImportMapping | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ImportMappingParameterValue")
@js.native
object ImportMappingParameterValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ImportMappingParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ImportMappingParameterValue = js.native
  /**
    * Creates and returns a new ImportMappingParameterValue instance in the SDK and on the server.
    * The new ImportMappingParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): ImportMappingParameterValue = js.native
  /**
    * Creates and returns a new ImportMappingParameterValue instance in the SDK and on the server.
    * The new ImportMappingParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): ImportMappingParameterValue = js.native
}

