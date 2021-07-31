package typings.mendixmodelsdk.datatypesMod.datatypes

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.appservicesMod.appservices.AppServiceAction
import typings.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.constantsMod.constants.Constant
import typings.mendixmodelsdk.datasetsMod.datasets.DataSetColumn
import typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter
import typings.mendixmodelsdk.datatypesMod.StructureVersionInfo
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typings.mendixmodelsdk.importmappingsMod.importmappings.ImportMapping
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mappingsMod.mappings.ValueMappingElement
import typings.mendixmodelsdk.microflowsMod.microflows.CreateVariableAction
import typings.mendixmodelsdk.microflowsMod.microflows.MicroflowBase
import typings.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterBase
import typings.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterObject
import typings.mendixmodelsdk.microflowsMod.microflows.ResultHandling
import typings.mendixmodelsdk.restMod.rest.RestOperationParameter
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.webservices.PublishedOperation
import typings.mendixmodelsdk.webservicesMod.webservices.PublishedParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.9.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.datatypesMod.datatypes.IDataType because Already inherited
- typings.mendixmodelsdk.datatypesMod.datatypes.IUnknownType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.UnknownType")
@js.native
class UnknownType protected () extends DataType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MUnknownType: AppServiceActionParameter = js.native
  
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MUnknownType: AppServiceAction = js.native
  
  @JSName("containerAsConstant")
  def containerAsConstant_MUnknownType: Constant = js.native
  
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MUnknownType: DataSetParameter = js.native
  
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MUnknownType: DocumentTemplateParameter = js.native
  
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MUnknownType: ImportMapping = js.native
  
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MUnknownType: MicroflowBase = js.native
  
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MUnknownType: MicroflowParameterBase = js.native
}
object UnknownType {
  
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.UnknownType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInConstantUnderType(container: Constant): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDataSetColumnUnderColumnType(container: DataSetColumn): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDataSetParameterUnderParameterType(container: DataSetParameter): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  /* static member */
  @scala.inline
  def createInImportMappingUnderParameterType(container: ImportMapping): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInPublishedParameterUnderParameterType(container: PublishedParameter): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @scala.inline
  def createInRestOperationParameterUnderType(container: RestOperationParameter): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInResultHandlingUnderVariableType(container: ResultHandling): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @scala.inline
  def createInValueMappingElementUnderType(container: ValueMappingElement): UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[UnknownType]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.UnknownType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.UnknownType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
