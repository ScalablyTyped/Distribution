package typings.mendixmodelsdk.distGenDatatypesMod.datatypes

import typings.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservices.AppServiceActionParameter
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constants.Constant
import typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetColumn
import typings.mendixmodelsdk.distGenDatasetsMod.datasets.DataSetParameter
import typings.mendixmodelsdk.distGenDatatypesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.ImportMapping
import typings.mendixmodelsdk.distGenMappingsMod.mappings.ValueMappingElement
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.CreateVariableAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowParameterBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowParameterObject
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ResultHandling
import typings.mendixmodelsdk.distGenRestMod.rest.RestOperationParameter
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedOperation
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedParameter
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.9.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenDatatypesMod.datatypes.IDataType because Already inherited
- typings.mendixmodelsdk.distGenDatatypesMod.datatypes.IFloatType because var conflicts: containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType")
@js.native
class FloatType protected () extends DataType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FFloatType: IModel = js.native
  @JSName("containerAsAppServiceActionParameter")
  def containerAsAppServiceActionParameter_MFloatType(): AppServiceActionParameter = js.native
  @JSName("containerAsAppServiceAction")
  def containerAsAppServiceAction_MFloatType(): AppServiceAction = js.native
  @JSName("containerAsConstant")
  def containerAsConstant_MFloatType(): Constant = js.native
  @JSName("containerAsDataSetParameter")
  def containerAsDataSetParameter_MFloatType(): DataSetParameter = js.native
  @JSName("containerAsDocumentTemplateParameter")
  def containerAsDocumentTemplateParameter_MFloatType(): DocumentTemplateParameter = js.native
  @JSName("containerAsImportMapping")
  def containerAsImportMapping_MFloatType(): ImportMapping = js.native
  @JSName("containerAsMicroflowBase")
  def containerAsMicroflowBase_MFloatType(): MicroflowBase = js.native
  @JSName("containerAsMicroflowParameterBase")
  def containerAsMicroflowParameterBase_MFloatType(): MicroflowParameterBase = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes.FloatType")
@js.native
object FloatType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConstantUnderType(container: Constant): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetColumnUnderColumnType(container: DataSetColumn): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetParameterUnderParameterType(container: DataSetParameter): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  def createInImportMappingUnderParameterType(container: ImportMapping): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedParameterUnderParameterType(container: PublishedParameter): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInRestOperationParameterUnderType(container: RestOperationParameter): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInResultHandlingUnderVariableType(container: ResultHandling): FloatType = js.native
  /**
    * Creates and returns a new FloatType instance in the SDK and on the server.
    * The new FloatType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInValueMappingElementUnderType(container: ValueMappingElement): FloatType = js.native
}

