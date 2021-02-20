package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.appservicesMod.appservices.AppServiceAction
import typings.mendixmodelsdk.appservicesMod.appservices.AppServiceActionParameter
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.constantsMod.constants.Constant
import typings.mendixmodelsdk.datasetsMod.datasets.DataSetColumn
import typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplateParameter
import typings.mendixmodelsdk.importmappingsMod.importmappings.ImportMapping
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
  @JSImport("mendixmodelsdk", "datatypes.BinaryType")
  @js.native
  class BinaryType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.BinaryType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BinaryType {
    
    @JSImport("mendixmodelsdk", "datatypes.BinaryType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.BinaryType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.BinaryType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.BooleanType")
  @js.native
  class BooleanType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.BooleanType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BooleanType {
    
    @JSImport("mendixmodelsdk", "datatypes.BooleanType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.BooleanType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.BooleanType.versionInfo")
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
  @JSImport("mendixmodelsdk", "datatypes.DataType")
  @js.native
  abstract class DataType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.DataType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataType {
    
    @JSImport("mendixmodelsdk", "datatypes.DataType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.DataType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.DataType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.DateTimeType")
  @js.native
  class DateTimeType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.DateTimeType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DateTimeType {
    
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.DateTimeType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.DateTimeType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.DecimalType")
  @js.native
  class DecimalType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.DecimalType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DecimalType {
    
    @JSImport("mendixmodelsdk", "datatypes.DecimalType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.DecimalType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.DecimalType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.EmptyType")
  @js.native
  class EmptyType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.EmptyType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EmptyType {
    
    @JSImport("mendixmodelsdk", "datatypes.EmptyType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.EmptyType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.EmptyType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.EntityType")
  @js.native
  abstract class EntityType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.EntityType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EntityType {
    
    @JSImport("mendixmodelsdk", "datatypes.EntityType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.EntityType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.EntityType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.EnumerationType")
  @js.native
  class EnumerationType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.EnumerationType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EnumerationType {
    
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.EnumerationType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.EnumerationType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.FloatType")
  @js.native
  class FloatType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.FloatType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object FloatType {
    
    @JSImport("mendixmodelsdk", "datatypes.FloatType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.FloatType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.FloatType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.FloatType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.FloatType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.FloatType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.IntegerType")
  @js.native
  class IntegerType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.IntegerType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object IntegerType {
    
    @JSImport("mendixmodelsdk", "datatypes.IntegerType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.IntegerType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.IntegerType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.ListType")
  @js.native
  class ListType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.ListType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ListType {
    
    @JSImport("mendixmodelsdk", "datatypes.ListType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.ListType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.ListType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.ListType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.ListType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.ListType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.ObjectType")
  @js.native
  class ObjectType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.ObjectType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ObjectType {
    
    @JSImport("mendixmodelsdk", "datatypes.ObjectType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.ObjectType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.ObjectType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.StringType")
  @js.native
  class StringType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.StringType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object StringType {
    
    @JSImport("mendixmodelsdk", "datatypes.StringType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.StringType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.StringType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.StringType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.StringType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.StringType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.UnknownType")
  @js.native
  class UnknownType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.UnknownType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object UnknownType {
    
    @JSImport("mendixmodelsdk", "datatypes.UnknownType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.UnknownType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.UnknownType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @JSImport("mendixmodelsdk", "datatypes.VoidType")
  @js.native
  class VoidType protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datatypes.VoidType {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object VoidType {
    
    @JSImport("mendixmodelsdk", "datatypes.VoidType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.VoidType.create")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInAppServiceActionParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInAppServiceActionUnderActionReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInConstantUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInCreateVariableActionUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInDataSetColumnUnderColumnType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInDataSetParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInDocumentTemplateParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInImportMappingUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInMicroflowBaseUnderMicroflowReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInMicroflowParameterBaseUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInMicroflowParameterObjectUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInPublishedOperationUnderOperationReturnType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInPublishedParameterUnderParameterType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInRestOperationParameterUnderType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInResultHandlingUnderVariableType")
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
    @JSImport("mendixmodelsdk", "datatypes.VoidType.createInValueMappingElementUnderType")
    @js.native
    def createInValueMappingElementUnderType(container: ValueMappingElement): typings.mendixmodelsdk.datatypesMod.datatypes.VoidType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.VoidType.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datatypes.VoidType.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datatypesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
