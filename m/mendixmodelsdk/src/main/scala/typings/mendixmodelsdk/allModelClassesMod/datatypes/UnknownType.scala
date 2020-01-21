package typings.mendixmodelsdk.allModelClassesMod.datatypes

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
import typings.mendixmodelsdk.webservicesMod.webservices.PublishedOperation
import typings.mendixmodelsdk.webservicesMod.webservices.PublishedParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType")
@js.native
class UnknownType protected ()
  extends typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType")
@js.native
object UnknownType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent appservices.AppServiceActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'actionReturnType' property
    * of the parent appservices.AppServiceAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'type' property
    * of the parent constants.Constant element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'variableType' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'columnType' property
    * of the parent datasets.DataSetColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent datasets.DataSetParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent importmappings.ImportMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.16.0 and higher
    */
  def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'microflowReturnType' property
    * of the parent microflows.MicroflowBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent microflows.MicroflowParameterBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'variableType' property
    * of the parent microflows.MicroflowParameterObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'operationReturnType' property
    * of the parent webservices.PublishedOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'parameterType' property
    * of the parent webservices.PublishedParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'type' property
    * of the parent rest.RestOperationParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'variableType' property
    * of the parent microflows.ResultHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
  /**
    * Creates and returns a new UnknownType instance in the SDK and on the server.
    * The new UnknownType will be automatically stored in the 'type' property
    * of the parent mappings.ValueMappingElement element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
}

