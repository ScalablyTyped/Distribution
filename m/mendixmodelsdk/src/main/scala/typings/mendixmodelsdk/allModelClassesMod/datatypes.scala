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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.FloatType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ListType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.StringType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType]
    
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    @scala.inline
    def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    @scala.inline
    def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    @scala.inline
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datatypesMod.datatypes.VoidType]
    
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
