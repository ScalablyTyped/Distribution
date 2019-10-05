package typings.mendixmodelsdk.distGenDatatypesMod.datatypes

import typings.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceActionParameter
import typings.mendixmodelsdk.distGenAppservicesMod.appservices.IAppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservices.IAppServiceActionParameter
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constants.Constant
import typings.mendixmodelsdk.distGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetColumn
import typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetParameter
import typings.mendixmodelsdk.distGenDatasetsMod.datasets.IDataSetParameter
import typings.mendixmodelsdk.distGenDatatypesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.ImportMapping
import typings.mendixmodelsdk.distGenMappingsMod.mappings.ValueMappingElement
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.CreateVariableAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowParameterBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowParameterBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowParameterObject
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ResultHandling
import typings.mendixmodelsdk.distGenRestMod.rest.RestOperationParameter
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedOperation
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedParameter
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenDatatypesMod.datatypes.IDataType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.DataType")
@js.native
abstract class DataType protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsAppServiceAction: AppServiceAction | IAppServiceAction = js.native
  val containerAsAppServiceActionParameter: AppServiceActionParameter | IAppServiceActionParameter = js.native
  val containerAsConstant: Constant | IConstant = js.native
  val containerAsCreateVariableAction: CreateVariableAction = js.native
  val containerAsDataSetColumn: DataSetColumn = js.native
  val containerAsDataSetParameter: DataSetParameter | IDataSetParameter = js.native
  val containerAsDocumentTemplateParameter: DocumentTemplateParameter | IDocumentTemplateParameter = js.native
  val containerAsImportMapping: IImportMapping | ImportMapping = js.native
  val containerAsMicroflowBase: IMicroflowBase | MicroflowBase = js.native
  val containerAsMicroflowParameterBase: IMicroflowParameterBase | MicroflowParameterBase = js.native
  val containerAsMicroflowParameterObject: MicroflowParameterObject = js.native
  val containerAsPublishedOperation: PublishedOperation = js.native
  val containerAsPublishedParameter: PublishedParameter = js.native
  val containerAsRestOperationParameter: RestOperationParameter = js.native
  val containerAsResultHandling: ResultHandling = js.native
  val containerAsValueMappingElement: ValueMappingElement = js.native
  @JSName("model")
  var model_DataType: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.DataType")
@js.native
object DataType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

