package typings.mendixmodelsdk.srcGenDatatypesMod.datatypes

import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceAction
import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceActionParameter
import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenConstantsMod.constants.Constant
import typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetColumn
import typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter
import typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportMapping
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.ValueMappingElement
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.CreateVariableAction
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MLModelCallParameterMapping
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowBase
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowParameterBase
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowParameterObject
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ResultHandling
import typings.mendixmodelsdk.srcGenPagesMod.pages.PageParameter
import typings.mendixmodelsdk.srcGenRestMod.rest.RestOperationParameter
import typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedOperation
import typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedParameter
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.9.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IDataType because Already inherited
- typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IDecimalType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, containerAsPageParameter, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DecimalType")
@js.native
open class DecimalType protected () extends DataType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MDecimalType: AppServiceActionParameter = js.native
  
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MDecimalType: AppServiceAction = js.native
  
  @JSName("containerAsConstant")
  def containerAsConstant_MDecimalType: Constant = js.native
  
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MDecimalType: DataSetParameter = js.native
  
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MDecimalType: DocumentTemplateParameter = js.native
  
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MDecimalType: ImportMapping = js.native
  
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MDecimalType: MicroflowBase = js.native
  
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MDecimalType: MicroflowParameterBase = js.native
  
  @JSName("containerAsPageParameter")
  def containerAsPageParameter_MDecimalType: PageParameter = js.native
}
object DecimalType {
  
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DecimalType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.0.1
    */
  /* static member */
  inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.0.1
    */
  /* static member */
  inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInConstantUnderType(container: Constant): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  /* static member */
  inline def createInImportMappingUnderParameterType(container: ImportMapping): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MLModelCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.10.0 to 9.17.0
    */
  /* static member */
  inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'parameterType' property
    * of the parent pages.PageParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.4.0 and higher
    */
  /* static member */
  inline def createInPageParameterUnderParameterType(container: PageParameter): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInRestOperationParameterUnderType(container: RestOperationParameter): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInResultHandlingUnderVariableType(container: ResultHandling): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInValueMappingElementUnderType(container: ValueMappingElement): DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[DecimalType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DecimalType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.DecimalType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
