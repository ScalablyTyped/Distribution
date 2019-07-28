package typings.mendixmodelsdk.distGenJavaactionsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.CodeAction
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.CodeActionParameter
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ICodeAction
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ICodeActionParameter
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.IEnumeration
import typings.mendixmodelsdk.distGenImagesMod.imagesNs.IImage
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.BasicParameterType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.BooleanType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.ConcreteEntityType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.DateTimeType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.DecimalType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.EntityType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.EntityTypeParameterType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.EnumerationType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.ExportMappingJavaActionParameterType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.ExportMappingParameterType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.FloatType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IBasicParameterType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IEntityType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IJavaAction
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IJavaActionParameter
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IListType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IMicroflowActionInfo
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IParameterType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IPrimitiveType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.ITypeParameter
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.ImportMappingJavaActionParameterType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.ImportMappingParameterType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IntegerType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.JavaAction
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.JavaActionParameter
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.ListType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.MicroflowActionInfo
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.MicroflowJavaActionParameterType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.MicroflowParameterType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.ParameterType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.ParameterizedEntityType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.PrimitiveType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.StringType
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.Type
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.TypeParameter
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions")
@js.native
object javaactionsNs extends js.Object {
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IBasicParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined `type` */ @js.native
  class BasicParameterType protected () extends ParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsJavaActionParameter")
    val containerAsJavaActionParameter_BasicParameterType: JavaActionParameter = js.native
    var `type`: IType | Type = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IBooleanType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class BooleanType protected () extends PrimitiveType {
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
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IConcreteEntityType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName */ @js.native
  class ConcreteEntityType protected () extends EntityType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var entity: IEntity = js.native
    val entityQualifiedName: String = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IDateTimeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class DateTimeType protected () extends PrimitiveType {
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
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IDecimalType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class DecimalType protected () extends PrimitiveType {
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
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IEntityType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  abstract class EntityType protected () extends Type {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsBasicParameterType")
    val containerAsBasicParameterType_EntityType: BasicParameterType = js.native
    @JSName("containerAsJavaActionParameter")
    val containerAsJavaActionParameter_EntityType: JavaActionParameter = js.native
    @JSName("containerAsJavaAction")
    val containerAsJavaAction_EntityType: JavaAction = js.native
    @JSName("containerAsListType")
    val containerAsListType_EntityType: ListType = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IEntityTypeParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @js.native
  class EntityTypeParameterType protected () extends ParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsJavaActionParameter")
    val containerAsJavaActionParameter_EntityTypeParameterType: JavaActionParameter = js.native
    var typeParameter: ITypeParameter | Null | TypeParameter = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IEnumerationType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined enumeration, enumerationQualifiedName */ @js.native
  class EnumerationType protected () extends Type {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsBasicParameterType")
    val containerAsBasicParameterType_EnumerationType: BasicParameterType = js.native
    @JSName("containerAsJavaActionParameter")
    val containerAsJavaActionParameter_EnumerationType: JavaActionParameter = js.native
    @JSName("containerAsJavaAction")
    val containerAsJavaAction_EnumerationType: JavaAction = js.native
    var enumeration: IEnumeration = js.native
    val enumerationQualifiedName: String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IExportMappingJavaActionParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class ExportMappingJavaActionParameterType protected ()
    extends typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsCodeActionParameter")
    val containerAsCodeActionParameter_ExportMappingJavaActionParameterType: CodeActionParameter = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 7.2.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IExportMappingParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class ExportMappingParameterType protected () extends ParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsJavaActionParameter")
    val containerAsJavaActionParameter_ExportMappingParameterType: JavaActionParameter = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IFloatType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class FloatType protected () extends PrimitiveType {
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
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  @js.native
  trait IBasicParameterType extends IParameterType {
    /**
      * This property is required and cannot be set to null.
      */
    val `type`: IType = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IBooleanType extends IPrimitiveType
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IConcreteEntityType extends IEntityType {
    /**
      * This property is required and cannot be set to null.
      */
    val entity: IEntity = js.native
    val entityQualifiedName: String = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IDateTimeType extends IPrimitiveType
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IDecimalType extends IPrimitiveType
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IEntityType extends IType
  
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  @js.native
  trait IEntityTypeParameterType extends IParameterType {
    val typeParameter: ITypeParameter | Null = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IEnumerationType extends IType {
    /**
      * This property is required and cannot be set to null.
      */
    val enumeration: IEnumeration = js.native
    val enumerationQualifiedName: String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IExportMappingJavaActionParameterType
    extends typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IParameterType
  
  /**
    * In version 7.21.0: deleted
    * In version 7.2.0: introduced
    */
  @js.native
  trait IExportMappingParameterType extends IParameterType
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IFloatType extends IPrimitiveType
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IImportMappingJavaActionParameterType
    extends typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IParameterType
  
  /**
    * In version 7.21.0: deleted
    * In version 7.2.0: introduced
    */
  @js.native
  trait IImportMappingParameterType extends IParameterType
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IIntegerType extends IPrimitiveType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/java-actions relevant section in reference guide}
    */
  @js.native
  trait IJavaAction extends ICodeAction {
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.21.0: deleted
      * In version 6.6.0: introduced
      */
    val javaReturnType: IType = js.native
    /**
      * In version 7.21.0: deleted
      * In version 6.6.0: introduced
      */
    val microflowActionInfo: IMicroflowActionInfo | Null = js.native
    /**
      * In version 7.21.0: deleted
      */
    val parameters: IList[IJavaActionParameter] = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 6.6.0: deleted
      */
    val returnType: String | Null = js.native
    /**
      * In version 7.21.0: deleted
      * In version 6.6.0: introduced
      */
    val typeParameters: IList[ITypeParameter] = js.native
  }
  
  @js.native
  trait IJavaActionParameter extends ICodeActionParameter {
    /**
      * This property is required and cannot be set to null.
      *
      * In version 6.7.0: deleted
      * In version 6.6.0: introduced
      */
    val javaType: IType = js.native
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.21.0: deleted
      * In version 6.7.0: introduced
      */
    val parameterType: IParameterType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 6.6.0: deleted
      */
    val `type`: String | Null = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IListType extends IType {
    /**
      * This property is required and cannot be set to null.
      */
    val parameter: IEntityType = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.10.0: removed experimental
    * In version 6.6.0: introduced
    */
  @js.native
  trait IMicroflowActionInfo extends IElement {
    val caption: String = js.native
    val category: String = js.native
    val containerAsJavaAction: IJavaAction = js.native
    val icon: IImage | Null = js.native
    val iconQualifiedName: String | Null = js.native
    @JSName("model")
    val model_IMicroflowActionInfo: IModel = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IMicroflowJavaActionParameterType
    extends typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IParameterType
  
  /**
    * In version 7.21.0: deleted
    * In version 6.9.0: introduced
    */
  @js.native
  trait IMicroflowParameterType extends IParameterType
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `JavaActions`.
    */
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  @js.native
  trait IParameterType extends IElement {
    val containerAsJavaActionParameter: IJavaActionParameter = js.native
    @JSName("model")
    val model_IParameterType: IModel = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IParameterizedEntityType extends IEntityType {
    /**
      * This property is required and cannot be set to null.
      */
    val typeParameter: ITypeParameter = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IPrimitiveType extends IType
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IStringType extends IPrimitiveType
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait IType extends IElement {
    val containerAsBasicParameterType: IBasicParameterType = js.native
    val containerAsJavaAction: IJavaAction = js.native
    val containerAsJavaActionParameter: IJavaActionParameter = js.native
    val containerAsListType: IListType = js.native
    @JSName("model")
    val model_IType: IModel = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  @js.native
  trait ITypeParameter
    extends IElement
       with IByNameReferrable {
    val containerAsJavaAction: IJavaAction = js.native
    @JSName("model")
    val model_ITypeParameter: IModel = js.native
    val name: String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IImportMappingJavaActionParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class ImportMappingJavaActionParameterType protected ()
    extends typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsCodeActionParameter")
    val containerAsCodeActionParameter_ImportMappingJavaActionParameterType: CodeActionParameter = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 7.2.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IImportMappingParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class ImportMappingParameterType protected () extends ParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsJavaActionParameter")
    val containerAsJavaActionParameter_ImportMappingParameterType: JavaActionParameter = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IIntegerType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class IntegerType protected () extends PrimitiveType {
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
    * See: {@link https://docs.mendix.com/refguide7/java-actions relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IJavaAction because var conflicts: actionReturnType, id, isLoaded, model, modelerActionInfo, structureTypeName, unit. Inlined typeParameters, parameters, returnType, javaReturnType, microflowActionInfo */ @js.native
  class JavaAction protected () extends CodeAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    /**
      * In version 7.21.0: deleted
      * In version 6.6.0: introduced
      */
    var javaReturnType: IType | Type = js.native
    /**
      * In version 7.21.0: deleted
      * In version 6.6.0: introduced
      */
    var microflowActionInfo: IMicroflowActionInfo | MicroflowActionInfo | Null = js.native
    /**
      * In version 7.21.0: deleted
      */
    val parameters: IList[IJavaActionParameter | JavaActionParameter] = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 6.6.0: deleted
      */
    var returnType: Null | String = js.native
    /**
      * In version 7.21.0: deleted
      * In version 6.6.0: introduced
      */
    val typeParameters: IList[ITypeParameter | TypeParameter] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IJavaActionParameter because var conflicts: actionParameterType, description, id, isLoaded, model, name, structureTypeName, unit. Inlined `type`, javaType, parameterType */ @js.native
  class JavaActionParameter protected () extends CodeActionParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsCodeAction")
    val containerAsCodeAction_JavaActionParameter: CodeAction = js.native
    @JSName("containerAsJavaAction")
    val containerAsJavaAction_JavaActionParameter: JavaAction = js.native
    /**
      * In version 6.7.0: deleted
      * In version 6.6.0: introduced
      */
    var javaType: IType | Type = js.native
    /**
      * In version 7.21.0: deleted
      * In version 6.7.0: introduced
      */
    var parameterType: IParameterType | ParameterType = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 6.6.0: deleted
      */
    var `type`: Null | String = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IListType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined parameter */ @js.native
  class ListType protected () extends Type {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsBasicParameterType")
    val containerAsBasicParameterType_ListType: BasicParameterType = js.native
    @JSName("containerAsJavaActionParameter")
    val containerAsJavaActionParameter_ListType: JavaActionParameter = js.native
    @JSName("containerAsJavaAction")
    val containerAsJavaAction_ListType: JavaAction = js.native
    var parameter: EntityType | IEntityType = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.10.0: removed experimental
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IMicroflowActionInfo because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsJavaAction, caption, category, icon, iconQualifiedName */ @js.native
  class MicroflowActionInfo protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var caption: String = js.native
    var category: String = js.native
    val containerAsJavaAction: IJavaAction | JavaAction = js.native
    var icon: IImage | Null = js.native
    val iconQualifiedName: Null | String = js.native
    @JSName("model")
    var model_MicroflowActionInfo: IModel = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IMicroflowJavaActionParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class MicroflowJavaActionParameterType protected ()
    extends typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsCodeActionParameter")
    val containerAsCodeActionParameter_MicroflowJavaActionParameterType: CodeActionParameter = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.9.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IMicroflowParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class MicroflowParameterType protected () extends ParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsJavaActionParameter")
    val containerAsJavaActionParameter_MicroflowParameterType: JavaActionParameter = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsJavaActionParameter */ @js.native
  abstract class ParameterType protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsJavaActionParameter: IJavaActionParameter | JavaActionParameter = js.native
    @JSName("model")
    var model_ParameterType: IModel = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IParameterizedEntityType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @js.native
  class ParameterizedEntityType protected () extends EntityType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var typeParameter: ITypeParameter | TypeParameter = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IPrimitiveType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  abstract class PrimitiveType protected () extends Type {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsBasicParameterType")
    val containerAsBasicParameterType_PrimitiveType: BasicParameterType = js.native
    @JSName("containerAsJavaActionParameter")
    val containerAsJavaActionParameter_PrimitiveType: JavaActionParameter = js.native
    @JSName("containerAsJavaAction")
    val containerAsJavaAction_PrimitiveType: JavaAction = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IStringType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class StringType protected () extends PrimitiveType {
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
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsBasicParameterType, containerAsJavaAction, containerAsJavaActionParameter, containerAsListType */ @js.native
  abstract class Type protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsBasicParameterType: BasicParameterType | IBasicParameterType = js.native
    val containerAsJavaAction: IJavaAction | JavaAction = js.native
    val containerAsJavaActionParameter: IJavaActionParameter | JavaActionParameter = js.native
    val containerAsListType: IListType | ListType = js.native
    @JSName("model")
    var model_Type: IModel = js.native
  }
  
  /**
    * In version 7.21.0: deleted
    * In version 6.6.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.ITypeParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsJavaAction, name */ @js.native
  class TypeParameter protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsJavaAction: IJavaAction | JavaAction = js.native
    @JSName("model")
    var model_TypeParameter: IModel = js.native
    var name: String = js.native
    val qualifiedName: String | Null = js.native
  }
  
  /* static members */
  @js.native
  object BasicParameterType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): BasicParameterType = js.native
    /**
      * Creates and returns a new BasicParameterType instance in the SDK and on the server.
      * The new BasicParameterType will be automatically stored in the 'parameterType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createIn(container: JavaActionParameter): BasicParameterType = js.native
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
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'javaType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 6.6.0
      */
    def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'javaReturnType' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInJavaActionUnderJavaReturnType(container: JavaAction): BooleanType = js.native
  }
  
  /* static members */
  @js.native
  object ConcreteEntityType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ConcreteEntityType = js.native
    /**
      * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
      * The new ConcreteEntityType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): ConcreteEntityType = js.native
    /**
      * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
      * The new ConcreteEntityType will be automatically stored in the 'javaType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 6.6.0
      */
    def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): ConcreteEntityType = js.native
    /**
      * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
      * The new ConcreteEntityType will be automatically stored in the 'javaReturnType' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInJavaActionUnderJavaReturnType(container: JavaAction): ConcreteEntityType = js.native
    /**
      * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
      * The new ConcreteEntityType will be automatically stored in the 'parameter' property
      * of the parent ListType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInListTypeUnderParameter(container: ListType): ConcreteEntityType = js.native
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
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'javaType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 6.6.0
      */
    def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'javaReturnType' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInJavaActionUnderJavaReturnType(container: JavaAction): DateTimeType = js.native
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
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'javaType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 6.6.0
      */
    def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'javaReturnType' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInJavaActionUnderJavaReturnType(container: JavaAction): DecimalType = js.native
  }
  
  /* static members */
  @js.native
  object EntityType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object EntityTypeParameterType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityTypeParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): EntityTypeParameterType = js.native
    /**
      * Creates and returns a new EntityTypeParameterType instance in the SDK and on the server.
      * The new EntityTypeParameterType will be automatically stored in the 'parameterType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createIn(container: JavaActionParameter): EntityTypeParameterType = js.native
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
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'javaType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 6.6.0
      */
    def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'javaReturnType' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInJavaActionUnderJavaReturnType(container: JavaAction): EnumerationType = js.native
  }
  
  /* static members */
  @js.native
  object ExportMappingJavaActionParameterType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportMappingJavaActionParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExportMappingJavaActionParameterType = js.native
  }
  
  /* static members */
  @js.native
  object ExportMappingParameterType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportMappingParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ExportMappingParameterType = js.native
    /**
      * Creates and returns a new ExportMappingParameterType instance in the SDK and on the server.
      * The new ExportMappingParameterType will be automatically stored in the 'parameterType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 to 7.20.0
      */
    def createIn(container: JavaActionParameter): ExportMappingParameterType = js.native
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
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'javaType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 6.6.0
      */
    def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'javaReturnType' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInJavaActionUnderJavaReturnType(container: JavaAction): FloatType = js.native
  }
  
  /* static members */
  @js.native
  object ImportMappingJavaActionParameterType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportMappingJavaActionParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ImportMappingJavaActionParameterType = js.native
  }
  
  /* static members */
  @js.native
  object ImportMappingParameterType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportMappingParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ImportMappingParameterType = js.native
    /**
      * Creates and returns a new ImportMappingParameterType instance in the SDK and on the server.
      * The new ImportMappingParameterType will be automatically stored in the 'parameterType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 to 7.20.0
      */
    def createIn(container: JavaActionParameter): ImportMappingParameterType = js.native
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
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'javaType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 6.6.0
      */
    def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'javaReturnType' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInJavaActionUnderJavaReturnType(container: JavaAction): IntegerType = js.native
  }
  
  /* static members */
  @js.native
  object JavaAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new JavaAction unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): JavaAction = js.native
  }
  
  /* static members */
  @js.native
  object JavaActionParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): JavaActionParameter = js.native
    /**
      * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
      * The new JavaActionParameter will be automatically stored in the 'actionParameters' property
      * of the parent codeactions.CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionParameters(container: CodeAction): JavaActionParameter = js.native
    /**
      * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
      * The new JavaActionParameter will be automatically stored in the 'parameters' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.20.0
      */
    def createInJavaActionUnderParameters(container: JavaAction): JavaActionParameter = js.native
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
      * The new ListType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'javaType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 6.6.0
      */
    def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'javaReturnType' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInJavaActionUnderJavaReturnType(container: JavaAction): ListType = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowActionInfo extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MicroflowActionInfo = js.native
    /**
      * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
      * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createIn(container: JavaAction): MicroflowActionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowJavaActionParameterType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowJavaActionParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MicroflowJavaActionParameterType = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowParameterType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): MicroflowParameterType = js.native
    /**
      * Creates and returns a new MicroflowParameterType instance in the SDK and on the server.
      * The new MicroflowParameterType will be automatically stored in the 'parameterType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.9.0 to 7.20.0
      */
    def createIn(container: JavaActionParameter): MicroflowParameterType = js.native
  }
  
  /* static members */
  @js.native
  object ParameterType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ParameterizedEntityType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ParameterizedEntityType = js.native
    /**
      * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
      * The new ParameterizedEntityType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): ParameterizedEntityType = js.native
    /**
      * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
      * The new ParameterizedEntityType will be automatically stored in the 'javaType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 6.6.0
      */
    def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): ParameterizedEntityType = js.native
    /**
      * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
      * The new ParameterizedEntityType will be automatically stored in the 'javaReturnType' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInJavaActionUnderJavaReturnType(container: JavaAction): ParameterizedEntityType = js.native
    /**
      * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
      * The new ParameterizedEntityType will be automatically stored in the 'parameter' property
      * of the parent ListType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInListTypeUnderParameter(container: ListType): ParameterizedEntityType = js.native
  }
  
  /* static members */
  @js.native
  object PrimitiveType extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
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
      * The new StringType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.7.0 to 7.20.0
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'javaType' property
      * of the parent JavaActionParameter element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 6.6.0
      */
    def createInJavaActionParameterUnderJavaType(container: JavaActionParameter): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'javaReturnType' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createInJavaActionUnderJavaReturnType(container: JavaAction): StringType = js.native
  }
  
  /* static members */
  @js.native
  object Type extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object TypeParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new TypeParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): TypeParameter = js.native
    /**
      * Creates and returns a new TypeParameter instance in the SDK and on the server.
      * The new TypeParameter will be automatically stored in the 'typeParameters' property
      * of the parent JavaAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 to 7.20.0
      */
    def createIn(container: JavaAction): TypeParameter = js.native
  }
  
}

