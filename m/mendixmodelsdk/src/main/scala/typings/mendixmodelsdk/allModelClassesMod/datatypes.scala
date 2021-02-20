package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.appservicesMod.appservices.AppServiceAction
import typings.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.constantsMod.constants.Constant
import typings.mendixmodelsdk.datasetsMod.datasets.DataSetColumn
import typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datatypes {
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType")
  @js.native
  class BinaryType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BinaryType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BinaryType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType")
  @js.native
  class BooleanType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BooleanType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.BooleanType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/data-types relevant section in reference guide}
    *
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DataType")
  @js.native
  abstract class DataType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DataType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DataType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DataType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType")
  @js.native
  class DateTimeType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DateTimeType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DateTimeType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType")
  @js.native
  class DecimalType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DecimalType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.DecimalType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType")
  @js.native
  class EmptyType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EmptyType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EmptyType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EntityType")
  @js.native
  abstract class EntityType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.EntityType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EntityType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EntityType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EntityType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EntityType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType")
  @js.native
  class EnumerationType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EnumerationType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.EnumerationType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType")
  @js.native
  class FloatType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.FloatType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object FloatType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.FloatType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType")
  @js.native
  class IntegerType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object IntegerType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.IntegerType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType")
  @js.native
  class ListType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.ListType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ListType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ListType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType")
  @js.native
  class ObjectType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ObjectType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.ObjectType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType")
  @js.native
  class StringType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.StringType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object StringType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.StringType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
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
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object UnknownType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.UnknownType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType")
  @js.native
  class VoidType protected ()
    extends typings.mendixmodelsdk.datatypesMod.datatypes.VoidType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object VoidType {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInAppServiceActionParameterUnderParameterType")
    @js.native
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInAppServiceActionUnderActionReturnType")
    @js.native
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInConstantUnderType")
    @js.native
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInCreateVariableActionUnderVariableType")
    @js.native
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInDataSetColumnUnderColumnType")
    @js.native
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInDataSetParameterUnderParameterType")
    @js.native
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInDocumentTemplateParameterUnderParameterType")
    @js.native
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInImportMappingUnderParameterType")
    @js.native
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInMicroflowBaseUnderMicroflowReturnType")
    @js.native
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInMicroflowParameterBaseUnderParameterType")
    @js.native
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInMicroflowParameterObjectUnderVariableType")
    @js.native
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInPublishedOperationUnderOperationReturnType")
    @js.native
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInPublishedParameterUnderParameterType")
    @js.native
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInRestOperationParameterUnderType")
    @js.native
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInResultHandlingUnderVariableType")
    @js.native
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "datatypes.VoidType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
