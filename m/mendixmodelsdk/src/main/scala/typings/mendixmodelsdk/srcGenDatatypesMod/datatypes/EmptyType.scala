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
- typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IEmptyType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, containerAsPageParameter, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.EmptyType")
@js.native
open class EmptyType protected () extends DataType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MEmptyType: AppServiceActionParameter = js.native
  
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MEmptyType: AppServiceAction = js.native
  
  @JSName("containerAsConstant")
  def containerAsConstant_MEmptyType: Constant = js.native
  
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MEmptyType: DataSetParameter = js.native
  
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MEmptyType: DocumentTemplateParameter = js.native
  
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MEmptyType: ImportMapping = js.native
  
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MEmptyType: MicroflowBase = js.native
  
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MEmptyType: MicroflowParameterBase = js.native
  
  @JSName("containerAsPageParameter")
  def containerAsPageParameter_MEmptyType: PageParameter = js.native
}
object EmptyType {
  
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.EmptyType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.0.1
    */
  /* static member */
  inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.0.1
    */
  /* static member */
  inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInConstantUnderType(container: Constant): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  /* static member */
  inline def createInImportMappingUnderParameterType(container: ImportMapping): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MLModelCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.10.0 to 9.17.0
    */
  /* static member */
  inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'parameterType' property
    * of the parent pages.PageParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.4.0 and higher
    */
  /* static member */
  inline def createInPageParameterUnderParameterType(container: PageParameter): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInRestOperationParameterUnderType(container: RestOperationParameter): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInResultHandlingUnderVariableType(container: ResultHandling): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /**
    * Creates and returns a new EmptyType instance in the SDK and on the server.
    * The new EmptyType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  inline def createInValueMappingElementUnderType(container: ValueMappingElement): EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[EmptyType]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.EmptyType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/datatypes", "datatypes.EmptyType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
