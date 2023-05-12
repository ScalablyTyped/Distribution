package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceAction
import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.AppServiceActionParameter
import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenConstantsMod.constants.Constant
import typings.mendixmodelsdk.srcGenDatabaseconnectorMod.databaseconnector.QueryParameter
import typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetColumn
import typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter
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
import typings.mendixmodelsdk.srcGenPagesMod.pages.SnippetParameter
import typings.mendixmodelsdk.srcGenRestMod.rest.OperationParameter
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

object datatypes {
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.BinaryType")
  @js.native
  open class BinaryType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.BinaryType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BinaryType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.BinaryType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.BinaryType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.BooleanType")
  @js.native
  open class BooleanType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.BooleanType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.BooleanType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.BooleanType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.BooleanType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/data-types relevant section in reference guide}
    *
    * In version 7.9.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DataType")
  @js.native
  open class DataType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DataType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DataType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DataType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DataType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DateTimeType")
  @js.native
  open class DateTimeType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DateTimeType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DateTimeType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DateTimeType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DateTimeType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DecimalType")
  @js.native
  open class DecimalType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DecimalType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DecimalType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DecimalType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.DecimalType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EmptyType")
  @js.native
  open class EmptyType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EmptyType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EmptyType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EmptyType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EmptyType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EntityType")
  @js.native
  open class EntityType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EntityType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EntityType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EntityType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EntityType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EnumerationType")
  @js.native
  open class EnumerationType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EnumerationType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.EnumerationType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EnumerationType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.EnumerationType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.FloatType")
  @js.native
  open class FloatType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.FloatType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.FloatType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.FloatType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.FloatType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.IntegerType")
  @js.native
  open class IntegerType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.IntegerType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.IntegerType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.IntegerType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.IntegerType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.ListType")
  @js.native
  open class ListType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.ListType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ListType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.ListType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.ListType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.ObjectType")
  @js.native
  open class ObjectType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.ObjectType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.ObjectType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.ObjectType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.ObjectType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.StringType")
  @js.native
  open class StringType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.StringType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.StringType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.StringType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.StringType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.UnknownType")
  @js.native
  open class UnknownType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.UnknownType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.UnknownType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.UnknownType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.UnknownType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.VoidType")
  @js.native
  open class VoidType protected ()
    extends typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType {
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
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.VoidType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 to 9.0.1
      */
    /* static member */
    inline def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceActionUnderActionReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInConstantUnderType(container: Constant): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConstantUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetColumnUnderColumnType(container: DataSetColumn): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetColumnUnderColumnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDataSetParameterUnderParameterType(container: DataSetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataSetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    /* static member */
    inline def createInImportMappingUnderParameterType(container: ImportMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MLModelCallParameterMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.10.0 to 9.17.0
      */
    /* static member */
    inline def createInMLModelCallParameterMappingUnderParameterType(container: MLModelCallParameterMapping): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMLModelCallParameterMappingUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowBaseUnderMicroflowReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterBaseUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowParameterObjectUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'dataType' property
      * of the parent rest.OperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInOperationParameterUnderDataType(container: OperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent pages.PageParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createInPageParameterUnderParameterType(container: PageParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedOperationUnderOperationReturnType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInPublishedParameterUnderParameterType(container: PublishedParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'dataType' property
      * of the parent databaseconnector.QueryParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.22.0 and higher
      */
    /* static member */
    inline def createInQueryParameterUnderDataType(container: QueryParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInQueryParameterUnderDataType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    /* static member */
    inline def createInRestOperationParameterUnderType(container: RestOperationParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestOperationParameterUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInResultHandlingUnderVariableType(container: ResultHandling): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInResultHandlingUnderVariableType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent pages.SnippetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.21.0 and higher
      */
    /* static member */
    inline def createInSnippetParameterUnderParameterType(container: SnippetParameter): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSnippetParameterUnderParameterType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    /* static member */
    inline def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValueMappingElementUnderType")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.VoidType]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.VoidType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datatypes.VoidType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
