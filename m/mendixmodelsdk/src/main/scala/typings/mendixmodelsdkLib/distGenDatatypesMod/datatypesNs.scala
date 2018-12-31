package typings
package mendixmodelsdkLib.distGenDatatypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/datatypes", "datatypes")
@js.native
object datatypesNs extends js.Object {
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IBinaryType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class BinaryType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IBooleanType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class BooleanType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
    *
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDataType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  abstract class DataType protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsAppServiceAction: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    val containerAsAppServiceActionParameter: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    val containerAsConstant: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    val containerAsCreateVariableAction: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction = js.native
    val containerAsDataSetColumn: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn = js.native
    val containerAsDataSetParameter: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    val containerAsDocumentTemplateParameter: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    val containerAsImportMapping: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    val containerAsMicroflowBase: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    val containerAsMicroflowParameterBase: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
    val containerAsMicroflowParameterObject: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject = js.native
    val containerAsPublishedOperation: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation = js.native
    val containerAsPublishedParameter: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter = js.native
    val containerAsRestOperationParameter: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter = js.native
    val containerAsResultHandling: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling = js.native
    val containerAsValueMappingElement: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement = js.native
    @JSName("model")
    var model_DataType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDateTimeType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class DateTimeType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDecimalType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class DecimalType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IEmptyType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class EmptyType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IEntityType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  abstract class EntityType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity = js.native
    val entityQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IEnumerationType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class EnumerationType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var enumeration: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration = js.native
    val enumerationQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IFloatType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class FloatType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IBinaryType extends IDataType
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IBooleanType extends IDataType
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `DataTypes`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
    *
    * In version 7.9.0: introduced
    */
  @js.native
  trait IDataType
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement {
    val containerAsAppServiceAction: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IAppServiceAction = js.native
    val containerAsAppServiceActionParameter: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IAppServiceActionParameter = js.native
    val containerAsConstant: mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant = js.native
    val containerAsDataSetParameter: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.IDataSetParameter = js.native
    val containerAsDocumentTemplateParameter: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplateParameter = js.native
    val containerAsImportMapping: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.IImportMapping = js.native
    val containerAsMicroflowBase: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowBase = js.native
    val containerAsMicroflowParameterBase: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowParameterBase = js.native
    @JSName("model")
    val model_IDataType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IDateTimeType extends IDataType
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IDecimalType extends IDataType
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IEmptyType extends IDataType
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IEntityType extends IDataType {
    /**
      * This property is required and cannot be set to null.
      */
    val entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity = js.native
    val entityQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IEnumerationType extends IDataType {
    /**
      * This property is required and cannot be set to null.
      */
    val enumeration: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration = js.native
    val enumerationQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IFloatType extends IDataType
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IIntegerType extends IDataType
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IListType extends IEntityType
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IObjectType extends IEntityType
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IStringType extends IDataType
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IUnknownType extends IDataType
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IVoidType extends IDataType
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IIntegerType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class IntegerType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IListType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class ListType protected () extends EntityType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IObjectType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class ObjectType protected () extends EntityType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IStringType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class StringType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IUnknownType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class UnknownType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IVoidType because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class VoidType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object BinaryType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BinaryType = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object BooleanType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.BooleanType = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
    *
    * In version 7.9.0: introduced
    */
  @js.native
  object DataType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object DateTimeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DateTimeType = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object DecimalType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DecimalType = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object EmptyType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EmptyType = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object EntityType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object EnumerationType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.EnumerationType = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object FloatType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.FloatType = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object IntegerType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IntegerType = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object ListType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ListType = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object ObjectType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.ObjectType = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object StringType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.StringType = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object UnknownType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.UnknownType = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  object VoidType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(
      container: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
    ): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedOperation): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: mendixmodelsdkLib.distGenWebservicesMod.webservicesNs.PublishedParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: mendixmodelsdkLib.distGenRestMod.restNs.RestOperationParameter): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.ResultHandling): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement): mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.VoidType = js.native
  }
  
}

