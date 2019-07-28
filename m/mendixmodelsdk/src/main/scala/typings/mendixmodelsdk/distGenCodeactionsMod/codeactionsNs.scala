package typings.mendixmodelsdk.distGenCodeactionsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.BasicParameterType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.BooleanType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.CodeAction
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.CodeActionParameter
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ConcreteEntityType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.DateTimeType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.DecimalType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.EntityType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.EntityTypeParameterType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.EnumerationType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.FloatType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IBasicParameterType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ICodeAction
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ICodeActionParameter
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IEntityType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IListType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IMicroflowActionInfo
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IParameterType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IPrimitiveType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ITypeParameter
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IntegerType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ListType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.MicroflowActionInfo
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ParameterType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ParameterizedEntityType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.PrimitiveType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.StringType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.Type
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.TypeParameter
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenEnumerationsMod.enumerationsNs.IEnumeration
import typings.mendixmodelsdk.distGenImagesMod.imagesNs.IImage
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.IJavaAction
import typings.mendixmodelsdk.distGenJavaactionsMod.javaactionsNs.JavaAction
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.Microflow
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
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

@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions")
@js.native
object codeactionsNs extends js.Object {
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IBasicParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined `type` */ @js.native
  class BasicParameterType protected () extends ParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsCodeActionParameter")
    val containerAsCodeActionParameter_BasicParameterType: CodeActionParameter = js.native
    var `type`: IType | Type = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IBooleanType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ICodeAction because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined actionTypeParameters, actionReturnType, modelerActionInfo, actionParameters */ @js.native
  abstract class CodeAction protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    /**
      * In version 7.21.0: introduced
      */
    val actionParameters: IList[CodeActionParameter | ICodeActionParameter] = js.native
    /**
      * In version 7.21.0: introduced
      */
    var actionReturnType: IType | Type = js.native
    /**
      * In version 7.21.0: introduced
      */
    val actionTypeParameters: IList[ITypeParameter | TypeParameter] = js.native
    /**
      * In version 7.21.0: introduced
      */
    var modelerActionInfo: IMicroflowActionInfo | MicroflowActionInfo | Null = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ICodeActionParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, containerAsJavaAction, name, actionParameterType, description */ @js.native
  abstract class CodeActionParameter protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.21.0: introduced
      */
    var actionParameterType: IParameterType | ParameterType = js.native
    /**
      * In version 7.18.0: introduced
      */
    var category: String = js.native
    val containerAsCodeAction: CodeAction | ICodeAction = js.native
    val containerAsJavaAction: IJavaAction | JavaAction = js.native
    /**
      * In version 6.10.0: introduced
      */
    var description: String = js.native
    @JSName("model")
    var model_CodeActionParameter: IModel = js.native
    var name: String = js.native
    val qualifiedName: String | Null = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IConcreteEntityType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName */ @js.native
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
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IDateTimeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IDecimalType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IEntityType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
    @JSName("containerAsCodeAction")
    val containerAsCodeAction_EntityType: CodeAction = js.native
    @JSName("containerAsListType")
    val containerAsListType_EntityType: ListType = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IEntityTypeParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @js.native
  class EntityTypeParameterType protected () extends ParameterType {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsCodeActionParameter")
    val containerAsCodeActionParameter_EntityTypeParameterType: CodeActionParameter = js.native
    var typeParameter: ITypeParameter | Null | TypeParameter = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IEnumerationType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined enumeration, enumerationQualifiedName */ @js.native
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
    @JSName("containerAsCodeAction")
    val containerAsCodeAction_EnumerationType: CodeAction = js.native
    var enumeration: IEnumeration = js.native
    val enumerationQualifiedName: String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IFloatType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
    * In version 7.21.0: introduced
    */
  @js.native
  trait IBasicParameterType extends IParameterType {
    /**
      * This property is required and cannot be set to null.
      */
    val `type`: IType = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IBooleanType extends IPrimitiveType
  
  @js.native
  trait ICodeAction extends IDocument {
    /**
      * In version 7.21.0: introduced
      */
    val actionParameters: IList[ICodeActionParameter] = js.native
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.21.0: introduced
      */
    val actionReturnType: IType = js.native
    /**
      * In version 7.21.0: introduced
      */
    val actionTypeParameters: IList[ITypeParameter] = js.native
    /**
      * In version 7.21.0: introduced
      */
    val modelerActionInfo: IMicroflowActionInfo | Null = js.native
  }
  
  @js.native
  trait ICodeActionParameter
    extends IElement
       with IByNameReferrable {
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.21.0: introduced
      */
    val actionParameterType: IParameterType = js.native
    val containerAsCodeAction: ICodeAction = js.native
    val containerAsJavaAction: IJavaAction = js.native
    /**
      * In version 6.10.0: introduced
      */
    val description: String = js.native
    @JSName("model")
    val model_ICodeActionParameter: IModel = js.native
    val name: String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
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
    * In version 7.21.0: introduced
    */
  @js.native
  trait IDateTimeType extends IPrimitiveType
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IDecimalType extends IPrimitiveType
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IEntityType extends IType
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IEntityTypeParameterType extends IParameterType {
    val typeParameter: ITypeParameter | Null = js.native
  }
  
  /**
    * In version 7.21.0: introduced
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
  trait IFloatType extends IPrimitiveType
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IIntegerType extends IPrimitiveType
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IListType extends IType {
    /**
      * This property is required and cannot be set to null.
      */
    val parameter: IEntityType = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IMicroflowActionInfo extends IElement {
    val caption: String = js.native
    val category: String = js.native
    val containerAsCodeAction: ICodeAction = js.native
    val containerAsMicroflow: IMicroflow = js.native
    val icon: IImage | Null = js.native
    val iconQualifiedName: String | Null = js.native
    @JSName("model")
    val model_IMicroflowActionInfo: IModel = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `CodeActions`.
    */
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IParameterType extends IElement {
    val containerAsCodeActionParameter: ICodeActionParameter = js.native
    @JSName("model")
    val model_IParameterType: IModel = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IParameterizedEntityType extends IEntityType {
    /**
      * This property is required and cannot be set to null.
      */
    val typeParameter: ITypeParameter = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IPrimitiveType extends IType
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IStringType extends IPrimitiveType
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IType extends IElement {
    val containerAsBasicParameterType: IBasicParameterType = js.native
    val containerAsCodeAction: ICodeAction = js.native
    val containerAsListType: IListType = js.native
    @JSName("model")
    val model_IType: IModel = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait ITypeParameter
    extends IElement
       with IByNameReferrable {
    val containerAsCodeAction: ICodeAction = js.native
    @JSName("model")
    val model_ITypeParameter: IModel = js.native
    val name: String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IIntegerType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IListType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined parameter */ @js.native
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
    @JSName("containerAsCodeAction")
    val containerAsCodeAction_ListType: CodeAction = js.native
    var parameter: EntityType | IEntityType = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IMicroflowActionInfo because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, containerAsMicroflow, caption, category, icon, iconQualifiedName */ @js.native
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
    val containerAsCodeAction: CodeAction | ICodeAction = js.native
    val containerAsMicroflow: IMicroflow | Microflow = js.native
    var icon: IImage | Null = js.native
    val iconQualifiedName: Null | String = js.native
    @JSName("model")
    var model_MicroflowActionInfo: IModel = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeActionParameter */ @js.native
  abstract class ParameterType protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsCodeActionParameter: CodeActionParameter | ICodeActionParameter = js.native
    @JSName("model")
    var model_ParameterType: IModel = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IParameterizedEntityType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @js.native
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
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IPrimitiveType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
    @JSName("containerAsCodeAction")
    val containerAsCodeAction_PrimitiveType: CodeAction = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IStringType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.IType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsBasicParameterType, containerAsCodeAction, containerAsListType */ @js.native
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
    val containerAsCodeAction: CodeAction | ICodeAction = js.native
    val containerAsListType: IListType | ListType = js.native
    @JSName("model")
    var model_Type: IModel = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ITypeParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, name */ @js.native
  class TypeParameter protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsCodeAction: CodeAction | ICodeAction = js.native
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
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: CodeAction): BooleanType = js.native
  }
  
  /* static members */
  @js.native
  object CodeAction extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object CodeActionParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
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
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): ConcreteEntityType = js.native
    /**
      * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
      * The new ConcreteEntityType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: CodeAction): ConcreteEntityType = js.native
    /**
      * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
      * The new ConcreteEntityType will be automatically stored in the 'parameter' property
      * of the parent ListType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
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
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: CodeAction): DateTimeType = js.native
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
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: CodeAction): DecimalType = js.native
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
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: CodeAction): EnumerationType = js.native
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
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: CodeAction): FloatType = js.native
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
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: CodeAction): IntegerType = js.native
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
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: CodeAction): ListType = js.native
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
      * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createIn(container: CodeAction): MicroflowActionInfo = js.native
    /**
      * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
      * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderModelerActionInfo(container: CodeAction): MicroflowActionInfo = js.native
    /**
      * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
      * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
      * of the parent microflows.Microflow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInMicroflowUnderMicroflowActionInfo(container: Microflow): MicroflowActionInfo = js.native
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
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): ParameterizedEntityType = js.native
    /**
      * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
      * The new ParameterizedEntityType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: CodeAction): ParameterizedEntityType = js.native
    /**
      * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
      * The new ParameterizedEntityType will be automatically stored in the 'parameter' property
      * of the parent ListType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
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
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: BasicParameterType): StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: CodeAction): StringType = js.native
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
  }
  
}

