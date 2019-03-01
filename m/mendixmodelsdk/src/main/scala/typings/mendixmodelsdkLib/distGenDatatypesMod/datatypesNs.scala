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
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IBinaryType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class BinaryType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_BinaryType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_BinaryType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_BinaryType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_BinaryType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_BinaryType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_BinaryType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_BinaryType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_BinaryType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IBooleanType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class BooleanType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_BooleanType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_BooleanType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_BooleanType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_BooleanType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_BooleanType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_BooleanType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_BooleanType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_BooleanType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
    *
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDataType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase, asLoaded, load, load, load, load */ @js.native
  abstract class DataType protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsAppServiceAction: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction | mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IAppServiceAction = js.native
    val containerAsAppServiceActionParameter: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter | mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.IAppServiceActionParameter = js.native
    val containerAsConstant: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant | mendixmodelsdkLib.distGenConstantsMod.constantsNs.IConstant = js.native
    val containerAsCreateVariableAction: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.CreateVariableAction = js.native
    val containerAsDataSetColumn: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn = js.native
    val containerAsDataSetParameter: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter | mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.IDataSetParameter = js.native
    val containerAsDocumentTemplateParameter: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter | mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplateParameter = js.native
    val containerAsImportMapping: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.IImportMapping | mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    val containerAsMicroflowBase: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowBase | mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    val containerAsMicroflowParameterBase: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflowParameterBase | mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
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
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDateTimeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class DateTimeType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_DateTimeType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_DateTimeType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_DateTimeType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_DateTimeType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_DateTimeType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_DateTimeType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_DateTimeType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_DateTimeType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IDecimalType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class DecimalType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_DecimalType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_DecimalType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_DecimalType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_DecimalType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_DecimalType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_DecimalType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_DecimalType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_DecimalType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IEmptyType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class EmptyType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_EmptyType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_EmptyType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_EmptyType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_EmptyType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_EmptyType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_EmptyType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_EmptyType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_EmptyType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IEntityType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName, asLoaded, load, load, load, load */ @js.native
  abstract class EntityType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_EntityType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_EntityType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_EntityType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_EntityType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_EntityType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_EntityType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_EntityType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_EntityType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity = js.native
    val entityQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IEnumerationType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined enumeration, enumerationQualifiedName, asLoaded, load, load, load, load */ @js.native
  class EnumerationType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_EnumerationType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_EnumerationType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_EnumerationType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_EnumerationType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_EnumerationType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_EnumerationType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_EnumerationType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_EnumerationType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
    var enumeration: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration = js.native
    val enumerationQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IFloatType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class FloatType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_FloatType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_FloatType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_FloatType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_FloatType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_FloatType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_FloatType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_FloatType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_FloatType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
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
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IIntegerType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class IntegerType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_IntegerType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_IntegerType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_IntegerType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_IntegerType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_IntegerType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_IntegerType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_IntegerType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_IntegerType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IListType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class ListType protected () extends EntityType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IObjectType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class ObjectType protected () extends EntityType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IStringType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class StringType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_StringType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_StringType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_StringType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_StringType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_StringType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_StringType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_StringType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_StringType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IUnknownType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class UnknownType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_UnknownType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_UnknownType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_UnknownType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_UnknownType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_UnknownType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_UnknownType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_UnknownType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_UnknownType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.IVoidType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class VoidType protected () extends DataType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_VoidType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_VoidType: mendixmodelsdkLib.distGenAppservicesMod.appservicesNs.AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_VoidType: mendixmodelsdkLib.distGenConstantsMod.constantsNs.Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_VoidType: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_VoidType: mendixmodelsdkLib.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_VoidType: mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_VoidType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_VoidType: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase = js.native
  }
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
  @js.native
  object DataType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
  @js.native
  object EntityType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatatypesMod.StructureVersionInfo = js.native
  }
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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
  
  /* static members */
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

