package typings.mendixmodelsdk.srcGenDatatypesMod.datatypes

import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceAction
import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceActionParameter
import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.IAppServiceAction
import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.IAppServiceActionParameter
import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenConstantsMod.constants.Constant
import typings.mendixmodelsdk.srcGenConstantsMod.constants.IConstant
import typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetColumn
import typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter
import typings.mendixmodelsdk.srcGenDatasetsMod.datasets.IDataSetParameter
import typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.IDocumentTemplateParameter
import typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.IImportMapping
import typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportMapping
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.ValueMappingElement
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.CreateVariableAction
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflowBase
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflowParameterBase
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MLModelCallParameterMapping
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowBase
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowParameterBase
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowParameterObject
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling
import typings.mendixmodelsdk.srcGenPagesMod.pages.IPageParameter
import typings.mendixmodelsdk.srcGenPagesMod.pages.PageParameter
import typings.mendixmodelsdk.srcGenRestMod.rest.RestOperationParameter
import typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedOperation
import typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedParameter
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/data-types relevant section in reference guide}
  *
  * In version 7.9.0: introduced
  */
/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IDataType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, containerAsPageParameter */ @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DataType")
@js.native
open class DataType protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAppServiceAction: AppServiceAction = js.native
  
  def containerAsAppServiceActionParameter: AppServiceActionParameter = js.native
  @JSName("containerAsAppServiceActionParameter")
  val containerAsAppServiceActionParameter_FDataType: IAppServiceActionParameter = js.native
  
  @JSName("containerAsAppServiceAction")
  val containerAsAppServiceAction_FDataType: IAppServiceAction = js.native
  
  def containerAsConstant: Constant = js.native
  @JSName("containerAsConstant")
  val containerAsConstant_FDataType: IConstant = js.native
  
  def containerAsCreateVariableAction: CreateVariableAction = js.native
  
  def containerAsDataSetColumn: DataSetColumn = js.native
  
  def containerAsDataSetParameter: DataSetParameter = js.native
  @JSName("containerAsDataSetParameter")
  val containerAsDataSetParameter_FDataType: IDataSetParameter = js.native
  
  def containerAsDocumentTemplateParameter: DocumentTemplateParameter = js.native
  @JSName("containerAsDocumentTemplateParameter")
  val containerAsDocumentTemplateParameter_FDataType: IDocumentTemplateParameter = js.native
  
  def containerAsImportMapping: ImportMapping = js.native
  @JSName("containerAsImportMapping")
  val containerAsImportMapping_FDataType: IImportMapping = js.native
  
  def containerAsMLModelCallParameterMapping: MLModelCallParameterMapping = js.native
  
  def containerAsMicroflowBase: MicroflowBase = js.native
  @JSName("containerAsMicroflowBase")
  val containerAsMicroflowBase_FDataType: IMicroflowBase = js.native
  
  def containerAsMicroflowParameterBase: MicroflowParameterBase = js.native
  @JSName("containerAsMicroflowParameterBase")
  val containerAsMicroflowParameterBase_FDataType: IMicroflowParameterBase = js.native
  
  def containerAsMicroflowParameterObject: MicroflowParameterObject = js.native
  
  def containerAsPageParameter: PageParameter = js.native
  @JSName("containerAsPageParameter")
  val containerAsPageParameter_FDataType: IPageParameter = js.native
  
  def containerAsPublishedOperation: PublishedOperation = js.native
  
  def containerAsPublishedParameter: PublishedParameter = js.native
  
  def containerAsRestOperationParameter: RestOperationParameter = js.native
  
  def containerAsResultHandling: ResultHandling = js.native
  
  def containerAsValueMappingElement: ValueMappingElement = js.native
}
object DataType {
  
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DataType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DataType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DataType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
