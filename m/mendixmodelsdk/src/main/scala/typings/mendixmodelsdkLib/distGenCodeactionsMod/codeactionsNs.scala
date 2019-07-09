package typings
package mendixmodelsdkLib.distGenCodeactionsMod

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
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IBasicParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined `type` */ @js.native
  class BasicParameterType protected () extends ParameterType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsCodeActionParameter")
    val containerAsCodeActionParameter_BasicParameterType: CodeActionParameter = js.native
    var `type`: IType | Type = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IBooleanType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class BooleanType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ICodeAction because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined actionTypeParameters, actionReturnType, modelerActionInfo, actionParameters */ @js.native
  abstract class CodeAction protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
      * In version 7.21.0: introduced
      */
    val actionParameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[CodeActionParameter | ICodeActionParameter] = js.native
    /**
      * In version 7.21.0: introduced
      */
    var actionReturnType: IType | Type = js.native
    /**
      * In version 7.21.0: introduced
      */
    val actionTypeParameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ITypeParameter | TypeParameter] = js.native
    /**
      * In version 7.21.0: introduced
      */
    var modelerActionInfo: IMicroflowActionInfo | MicroflowActionInfo | scala.Null = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ICodeActionParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, containerAsJavaAction, name, actionParameterType, description */ @js.native
  abstract class CodeActionParameter protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.21.0: introduced
      */
    var actionParameterType: IParameterType | ParameterType = js.native
    /**
      * In version 7.18.0: introduced
      */
    var category: java.lang.String = js.native
    val containerAsCodeAction: CodeAction | ICodeAction = js.native
    val containerAsJavaAction: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IJavaAction | mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction = js.native
    /**
      * In version 6.10.0: introduced
      */
    var description: java.lang.String = js.native
    @JSName("model")
    var model_CodeActionParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IConcreteEntityType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined entity, entityQualifiedName */ @js.native
  class ConcreteEntityType protected () extends EntityType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity = js.native
    val entityQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IDateTimeType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class DateTimeType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IDecimalType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class DecimalType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IEntityType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  abstract class EntityType protected () extends Type {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
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
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IEntityTypeParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @js.native
  class EntityTypeParameterType protected () extends ParameterType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsCodeActionParameter")
    val containerAsCodeActionParameter_EntityTypeParameterType: CodeActionParameter = js.native
    var typeParameter: ITypeParameter | scala.Null | TypeParameter = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IEnumerationType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined enumeration, enumerationQualifiedName */ @js.native
  class EnumerationType protected () extends Type {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsBasicParameterType")
    val containerAsBasicParameterType_EnumerationType: BasicParameterType = js.native
    @JSName("containerAsCodeAction")
    val containerAsCodeAction_EnumerationType: CodeAction = js.native
    var enumeration: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration = js.native
    val enumerationQualifiedName: java.lang.String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IFloatType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class FloatType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
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
  trait ICodeAction
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument {
    /**
      * In version 7.21.0: introduced
      */
    val actionParameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ICodeActionParameter] = js.native
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.21.0: introduced
      */
    val actionReturnType: IType = js.native
    /**
      * In version 7.21.0: introduced
      */
    val actionTypeParameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ITypeParameter] = js.native
    /**
      * In version 7.21.0: introduced
      */
    val modelerActionInfo: IMicroflowActionInfo | scala.Null = js.native
  }
  
  @js.native
  trait ICodeActionParameter
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    /**
      * This property is required and cannot be set to null.
      *
      * In version 7.21.0: introduced
      */
    val actionParameterType: IParameterType = js.native
    val containerAsCodeAction: ICodeAction = js.native
    val containerAsJavaAction: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IJavaAction = js.native
    /**
      * In version 6.10.0: introduced
      */
    val description: java.lang.String = js.native
    @JSName("model")
    val model_ICodeActionParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IConcreteEntityType extends IEntityType {
    /**
      * This property is required and cannot be set to null.
      */
    val entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity = js.native
    val entityQualifiedName: java.lang.String = js.native
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
    val typeParameter: ITypeParameter | scala.Null = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IEnumerationType extends IType {
    /**
      * This property is required and cannot be set to null.
      */
    val enumeration: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration = js.native
    val enumerationQualifiedName: java.lang.String = js.native
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
  trait IMicroflowActionInfo
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement {
    val caption: java.lang.String = js.native
    val category: java.lang.String = js.native
    val containerAsCodeAction: ICodeAction = js.native
    val containerAsMicroflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow = js.native
    val icon: mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage | scala.Null = js.native
    val iconQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    val model_IMicroflowActionInfo: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `CodeActions`.
    */
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait IParameterType
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement {
    val containerAsCodeActionParameter: ICodeActionParameter = js.native
    @JSName("model")
    val model_IParameterType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
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
  trait IType
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement {
    val containerAsBasicParameterType: IBasicParameterType = js.native
    val containerAsCodeAction: ICodeAction = js.native
    val containerAsListType: IListType = js.native
    @JSName("model")
    val model_IType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  @js.native
  trait ITypeParameter
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsCodeAction: ICodeAction = js.native
    @JSName("model")
    val model_ITypeParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IIntegerType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class IntegerType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IListType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined parameter */ @js.native
  class ListType protected () extends Type {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
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
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IMicroflowActionInfo because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, containerAsMicroflow, caption, category, icon, iconQualifiedName */ @js.native
  class MicroflowActionInfo protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: java.lang.String = js.native
    var category: java.lang.String = js.native
    val containerAsCodeAction: CodeAction | ICodeAction = js.native
    val containerAsMicroflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Microflow = js.native
    var icon: mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage | scala.Null = js.native
    val iconQualifiedName: scala.Null | java.lang.String = js.native
    @JSName("model")
    var model_MicroflowActionInfo: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IParameterType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeActionParameter */ @js.native
  abstract class ParameterType protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsCodeActionParameter: CodeActionParameter | ICodeActionParameter = js.native
    @JSName("model")
    var model_ParameterType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IParameterizedEntityType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @js.native
  class ParameterizedEntityType protected () extends EntityType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var typeParameter: ITypeParameter | TypeParameter = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IPrimitiveType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  abstract class PrimitiveType protected () extends Type {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsBasicParameterType")
    val containerAsBasicParameterType_PrimitiveType: BasicParameterType = js.native
    @JSName("containerAsCodeAction")
    val containerAsCodeAction_PrimitiveType: CodeAction = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IStringType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class StringType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsBasicParameterType, containerAsCodeAction, containerAsListType */ @js.native
  abstract class Type protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsBasicParameterType: BasicParameterType | IBasicParameterType = js.native
    val containerAsCodeAction: CodeAction | ICodeAction = js.native
    val containerAsListType: IListType | ListType = js.native
    @JSName("model")
    var model_Type: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ITypeParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCodeAction, name */ @js.native
  class TypeParameter protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsCodeAction: CodeAction | ICodeAction = js.native
    @JSName("model")
    var model_TypeParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /* static members */
  @js.native
  object BasicParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BasicParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BasicParameterType = js.native
  }
  
  /* static members */
  @js.native
  object BooleanType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BasicParameterType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BooleanType = js.native
    /**
      * Creates and returns a new BooleanType instance in the SDK and on the server.
      * The new BooleanType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BooleanType = js.native
  }
  
  /* static members */
  @js.native
  object CodeAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object CodeActionParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ConcreteEntityType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ConcreteEntityType = js.native
    /**
      * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
      * The new ConcreteEntityType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BasicParameterType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ConcreteEntityType = js.native
    /**
      * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
      * The new ConcreteEntityType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ConcreteEntityType = js.native
    /**
      * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
      * The new ConcreteEntityType will be automatically stored in the 'parameter' property
      * of the parent ListType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInListTypeUnderParameter(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ListType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ConcreteEntityType = js.native
  }
  
  /* static members */
  @js.native
  object DateTimeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BasicParameterType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.DateTimeType = js.native
    /**
      * Creates and returns a new DateTimeType instance in the SDK and on the server.
      * The new DateTimeType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.DateTimeType = js.native
  }
  
  /* static members */
  @js.native
  object DecimalType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BasicParameterType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.DecimalType = js.native
    /**
      * Creates and returns a new DecimalType instance in the SDK and on the server.
      * The new DecimalType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.DecimalType = js.native
  }
  
  /* static members */
  @js.native
  object EntityType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object EntityTypeParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EntityTypeParameterType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.EntityTypeParameterType = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BasicParameterType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.EnumerationType = js.native
    /**
      * Creates and returns a new EnumerationType instance in the SDK and on the server.
      * The new EnumerationType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.EnumerationType = js.native
  }
  
  /* static members */
  @js.native
  object FloatType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BasicParameterType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.FloatType = js.native
    /**
      * Creates and returns a new FloatType instance in the SDK and on the server.
      * The new FloatType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.FloatType = js.native
  }
  
  /* static members */
  @js.native
  object IntegerType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BasicParameterType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IntegerType = js.native
    /**
      * Creates and returns a new IntegerType instance in the SDK and on the server.
      * The new IntegerType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IntegerType = js.native
  }
  
  /* static members */
  @js.native
  object ListType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BasicParameterType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ListType = js.native
    /**
      * Creates and returns a new ListType instance in the SDK and on the server.
      * The new ListType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ListType = js.native
  }
  
  /* static members */
  @js.native
  object MicroflowActionInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.MicroflowActionInfo = js.native
    /**
      * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
      * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 to 7.23.0
      */
    def createIn(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.MicroflowActionInfo = js.native
    /**
      * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
      * The new MicroflowActionInfo will be automatically stored in the 'modelerActionInfo' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderModelerActionInfo(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.MicroflowActionInfo = js.native
    /**
      * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
      * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
      * of the parent microflows.Microflow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInMicroflowUnderMicroflowActionInfo(container: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.Microflow): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.MicroflowActionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ParameterizedEntityType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ParameterizedEntityType = js.native
    /**
      * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
      * The new ParameterizedEntityType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BasicParameterType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ParameterizedEntityType = js.native
    /**
      * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
      * The new ParameterizedEntityType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ParameterizedEntityType = js.native
    /**
      * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
      * The new ParameterizedEntityType will be automatically stored in the 'parameter' property
      * of the parent ListType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInListTypeUnderParameter(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ListType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ParameterizedEntityType = js.native
  }
  
  /* static members */
  @js.native
  object PrimitiveType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object StringType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'type' property
      * of the parent BasicParameterType element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.BasicParameterType): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.StringType = js.native
    /**
      * Creates and returns a new StringType instance in the SDK and on the server.
      * The new StringType will be automatically stored in the 'actionReturnType' property
      * of the parent CodeAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInCodeActionUnderActionReturnType(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.StringType = js.native
  }
  
  /* static members */
  @js.native
  object Type extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object TypeParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenCodeactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new TypeParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.TypeParameter = js.native
  }
  
}

