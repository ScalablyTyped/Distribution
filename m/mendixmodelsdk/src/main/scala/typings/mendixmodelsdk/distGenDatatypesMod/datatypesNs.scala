package typings.mendixmodelsdk.distGenDatatypesMod

import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.AppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.AppServiceActionParameter
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IAppServiceAction
import typings.mendixmodelsdk.distGenAppservicesMod.appservicesNs.IAppServiceActionParameter
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenConstantsMod.constantsNs.Constant
import typings.mendixmodelsdk.distGenConstantsMod.constantsNs.IConstant
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetColumn
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetParameter
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.IDataSetParameter
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.BinaryType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.BooleanType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DataType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DateTimeType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DecimalType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.EmptyType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.EntityType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.EnumerationType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.FloatType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IDataType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IEntityType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IntegerType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.ListType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.ObjectType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.StringType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.UnknownType
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.VoidType
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.DocumentTemplateParameter
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplatesNs.IDocumentTemplateParameter
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.IEnumeration
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappingsNs.IImportMapping
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappingsNs.ImportMapping
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ValueMappingElement
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.CreateVariableAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflowParameterBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowParameterBase
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.MicroflowParameterObject
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.ResultHandling
import typings.mendixmodelsdk.distGenRestMod.restNs.RestOperationParameter
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedOperation
import typings.mendixmodelsdk.distGenWebservicesMod.webservicesNs.PublishedParameter
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IBinaryType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class BinaryType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_BinaryType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_BinaryType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_BinaryType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_BinaryType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_BinaryType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_BinaryType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_BinaryType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_BinaryType: MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IBooleanType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class BooleanType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_BooleanType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_BooleanType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_BooleanType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_BooleanType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_BooleanType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_BooleanType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_BooleanType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_BooleanType: MicroflowParameterBase = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-types relevant section in reference guide}
    *
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IDataType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsAppServiceAction, containerAsAppServiceActionParameter, containerAsConstant, containerAsDataSetParameter, containerAsDocumentTemplateParameter, containerAsImportMapping, containerAsMicroflowBase, containerAsMicroflowParameterBase */ @js.native
  abstract class DataType protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsAppServiceAction: AppServiceAction | IAppServiceAction = js.native
    val containerAsAppServiceActionParameter: AppServiceActionParameter | IAppServiceActionParameter = js.native
    val containerAsConstant: Constant | IConstant = js.native
    val containerAsCreateVariableAction: CreateVariableAction = js.native
    val containerAsDataSetColumn: DataSetColumn = js.native
    val containerAsDataSetParameter: DataSetParameter | IDataSetParameter = js.native
    val containerAsDocumentTemplateParameter: DocumentTemplateParameter | IDocumentTemplateParameter = js.native
    val containerAsImportMapping: IImportMapping | ImportMapping = js.native
    val containerAsMicroflowBase: IMicroflowBase | MicroflowBase = js.native
    val containerAsMicroflowParameterBase: IMicroflowParameterBase | MicroflowParameterBase = js.native
    val containerAsMicroflowParameterObject: MicroflowParameterObject = js.native
    val containerAsPublishedOperation: PublishedOperation = js.native
    val containerAsPublishedParameter: PublishedParameter = js.native
    val containerAsRestOperationParameter: RestOperationParameter = js.native
    val containerAsResultHandling: ResultHandling = js.native
    val containerAsValueMappingElement: ValueMappingElement = js.native
    @JSName("model")
    var model_DataType: IModel = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IDateTimeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class DateTimeType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_DateTimeType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_DateTimeType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_DateTimeType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_DateTimeType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_DateTimeType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_DateTimeType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_DateTimeType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_DateTimeType: MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IDecimalType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class DecimalType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_DecimalType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_DecimalType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_DecimalType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_DecimalType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_DecimalType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_DecimalType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_DecimalType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_DecimalType: MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IEmptyType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class EmptyType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_EmptyType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_EmptyType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_EmptyType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_EmptyType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_EmptyType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_EmptyType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_EmptyType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_EmptyType: MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IEntityType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName */ @js.native
  abstract class EntityType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_EntityType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_EntityType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_EntityType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_EntityType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_EntityType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_EntityType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_EntityType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_EntityType: MicroflowParameterBase = js.native
    var entity: IEntity = js.native
    val entityQualifiedName: String = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IEnumerationType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined enumeration, enumerationQualifiedName */ @js.native
  class EnumerationType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_EnumerationType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_EnumerationType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_EnumerationType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_EnumerationType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_EnumerationType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_EnumerationType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_EnumerationType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_EnumerationType: MicroflowParameterBase = js.native
    var enumeration: IEnumeration = js.native
    val enumerationQualifiedName: String = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IFloatType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class FloatType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_FloatType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_FloatType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_FloatType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_FloatType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_FloatType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_FloatType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_FloatType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_FloatType: MicroflowParameterBase = js.native
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
  trait IDataType extends IElement {
    val containerAsAppServiceAction: IAppServiceAction = js.native
    val containerAsAppServiceActionParameter: IAppServiceActionParameter = js.native
    val containerAsConstant: IConstant = js.native
    val containerAsDataSetParameter: IDataSetParameter = js.native
    val containerAsDocumentTemplateParameter: IDocumentTemplateParameter = js.native
    val containerAsImportMapping: IImportMapping = js.native
    val containerAsMicroflowBase: IMicroflowBase = js.native
    val containerAsMicroflowParameterBase: IMicroflowParameterBase = js.native
    @JSName("model")
    val model_IDataType: IModel = js.native
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
    val entity: IEntity = js.native
    val entityQualifiedName: String = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  @js.native
  trait IEnumerationType extends IDataType {
    /**
      * This property is required and cannot be set to null.
      */
    val enumeration: IEnumeration = js.native
    val enumerationQualifiedName: String = js.native
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
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IIntegerType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class IntegerType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_IntegerType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_IntegerType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_IntegerType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_IntegerType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_IntegerType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_IntegerType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_IntegerType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_IntegerType: MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IListType because var conflicts: entity, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class ListType protected () extends EntityType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IObjectType because var conflicts: entity, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class ObjectType protected () extends EntityType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IStringType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class StringType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_StringType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_StringType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_StringType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_StringType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_StringType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_StringType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_StringType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_StringType: MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IUnknownType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class UnknownType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_UnknownType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_UnknownType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_UnknownType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_UnknownType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_UnknownType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_UnknownType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_UnknownType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_UnknownType: MicroflowParameterBase = js.native
  }
  
  /**
    * In version 7.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.IVoidType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class VoidType protected () extends DataType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsAppServiceActionParameter")
    val containerAsAppServiceActionParameter_VoidType: AppServiceActionParameter = js.native
    @JSName("containerAsAppServiceAction")
    val containerAsAppServiceAction_VoidType: AppServiceAction = js.native
    @JSName("containerAsConstant")
    val containerAsConstant_VoidType: Constant = js.native
    @JSName("containerAsDataSetParameter")
    val containerAsDataSetParameter_VoidType: DataSetParameter = js.native
    @JSName("containerAsDocumentTemplateParameter")
    val containerAsDocumentTemplateParameter_VoidType: DocumentTemplateParameter = js.native
    @JSName("containerAsImportMapping")
    val containerAsImportMapping_VoidType: ImportMapping = js.native
    @JSName("containerAsMicroflowBase")
    val containerAsMicroflowBase_VoidType: MicroflowBase = js.native
    @JSName("containerAsMicroflowParameterBase")
    val containerAsMicroflowParameterBase_VoidType: MicroflowParameterBase = js.native
  }
  
  /* static members */
  @js.native
  object BinaryType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): BinaryType = js.native
    /**
      * Creates and returns a new BinaryType instance in the SDK and on the server.
      * The new BinaryType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): BinaryType = js.native
  }
  
  /* static members */
  @js.native
  object BooleanType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): BooleanType = js.native
  }
  
  /* static members */
  @js.native
  object DataType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DateTimeType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): DateTimeType = js.native
  }
  
  /* static members */
  @js.native
  object DecimalType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): DecimalType = js.native
  }
  
  /* static members */
  @js.native
  object EmptyType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): EmptyType = js.native
    /**
      * Creates and returns a new EmptyType instance in the SDK and on the server.
      * The new EmptyType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): EmptyType = js.native
  }
  
  /* static members */
  @js.native
  object EntityType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): EnumerationType = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object IntegerType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): IntegerType = js.native
  }
  
  /* static members */
  @js.native
  object ListType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): ListType = js.native
  }
  
  /* static members */
  @js.native
  object ObjectType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): ObjectType = js.native
    /**
      * Creates and returns a new ObjectType instance in the SDK and on the server.
      * The new ObjectType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): ObjectType = js.native
  }
  
  /* static members */
  @js.native
  object StringType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): StringType = js.native
  }
  
  /* static members */
  @js.native
  object UnknownType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): UnknownType = js.native
    /**
      * Creates and returns a new UnknownType instance in the SDK and on the server.
      * The new UnknownType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): UnknownType = js.native
  }
  
  /* static members */
  @js.native
  object VoidType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent appservices.AppServiceActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionParameterUnderParameterType(container: AppServiceActionParameter): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'actionReturnType' property
      * of the parent appservices.AppServiceAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInAppServiceActionUnderActionReturnType(container: AppServiceAction): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent constants.Constant element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInConstantUnderType(container: Constant): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.CreateVariableAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInCreateVariableActionUnderVariableType(container: CreateVariableAction): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'columnType' property
      * of the parent datasets.DataSetColumn element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetColumnUnderColumnType(container: DataSetColumn): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent datasets.DataSetParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDataSetParameterUnderParameterType(container: DataSetParameter): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent documenttemplates.DocumentTemplateParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInDocumentTemplateParameterUnderParameterType(container: DocumentTemplateParameter): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent importmappings.ImportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.16.0 and higher
      */
    def createInImportMappingUnderParameterType(container: ImportMapping): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'microflowReturnType' property
      * of the parent microflows.MicroflowBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowBaseUnderMicroflowReturnType(container: MicroflowBase): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent microflows.MicroflowParameterBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterBaseUnderParameterType(container: MicroflowParameterBase): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.MicroflowParameterObject element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInMicroflowParameterObjectUnderVariableType(container: MicroflowParameterObject): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'operationReturnType' property
      * of the parent webservices.PublishedOperation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedOperationUnderOperationReturnType(container: PublishedOperation): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'parameterType' property
      * of the parent webservices.PublishedParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInPublishedParameterUnderParameterType(container: PublishedParameter): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent rest.RestOperationParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.17.0 and higher
      */
    def createInRestOperationParameterUnderType(container: RestOperationParameter): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'variableType' property
      * of the parent microflows.ResultHandling element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInResultHandlingUnderVariableType(container: ResultHandling): VoidType = js.native
    /**
      * Creates and returns a new VoidType instance in the SDK and on the server.
      * The new VoidType will be automatically stored in the 'type' property
      * of the parent mappings.ValueMappingElement element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.9.0 and higher
      */
    def createInValueMappingElementUnderType(container: ValueMappingElement): VoidType = js.native
  }
  
}

