package typings
package mendixmodelsdkLib.distGenJavaactionsMod

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
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IBasicParameterType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class BasicParameterType protected () extends ParameterType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var `type`: Type = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IBooleanType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class BooleanType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IConcreteEntityType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class ConcreteEntityType protected () extends EntityType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity = js.native
    val entityQualifiedName: java.lang.String = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IDateTimeType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class DateTimeType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IDecimalType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class DecimalType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IEntityType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  abstract class EntityType protected () extends Type {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.7.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IEntityTypeParameterType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class EntityTypeParameterType protected () extends ParameterType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var typeParameter: TypeParameter | scala.Null = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IEnumerationType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class EnumerationType protected () extends Type {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var enumeration: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration = js.native
    val enumerationQualifiedName: java.lang.String = js.native
  }
  
  /**
       * In version 7.21.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IExportMappingJavaActionParameterType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class ExportMappingJavaActionParameterType protected ()
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ParameterType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 7.2.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IExportMappingParameterType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class ExportMappingParameterType protected () extends ParameterType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IFloatType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class FloatType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
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
    val entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity = js.native
    val entityQualifiedName: java.lang.String = js.native
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
    val typeParameter: ITypeParameter | scala.Null = js.native
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
    val enumeration: mendixmodelsdkLib.distGenEnumerationsMod.enumerationsNs.IEnumeration = js.native
    val enumerationQualifiedName: java.lang.String = js.native
  }
  
  /**
       * In version 7.21.0: introduced
       */
  @js.native
  trait IExportMappingJavaActionParameterType
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IParameterType
  
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
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IParameterType
  
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
  trait IJavaAction
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ICodeAction {
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
    val microflowActionInfo: IMicroflowActionInfo | scala.Null = js.native
    /**
             * In version 7.21.0: deleted
             */
    val parameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IJavaActionParameter] = js.native
    /**
             * The value of this property is conceptually of type dataTypes.LegacyDataType.
             *
             * In version 6.6.0: deleted
             */
    val returnType: java.lang.String | scala.Null = js.native
    /**
             * In version 7.21.0: deleted
             * In version 6.6.0: introduced
             */
    val typeParameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ITypeParameter] = js.native
  }
  
  @js.native
  trait IJavaActionParameter
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ICodeActionParameter {
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
    val `type`: java.lang.String | scala.Null = js.native
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
  trait IMicroflowActionInfo
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement {
    val caption: java.lang.String = js.native
    val category: java.lang.String = js.native
    val containerAsJavaAction: IJavaAction = js.native
    val icon: mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage | scala.Null = js.native
    val iconQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    val model_IMicroflowActionInfo: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
       * In version 7.21.0: introduced
       */
  @js.native
  trait IMicroflowJavaActionParameterType
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.IParameterType
  
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
  trait IParameterType
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement {
    val containerAsJavaActionParameter: IJavaActionParameter = js.native
    @JSName("model")
    val model_IParameterType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
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
  trait IType
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement {
    val containerAsBasicParameterType: IBasicParameterType = js.native
    val containerAsJavaAction: IJavaAction = js.native
    val containerAsJavaActionParameter: IJavaActionParameter = js.native
    val containerAsListType: IListType = js.native
    @JSName("model")
    val model_IType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  trait ITypeParameter
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsJavaAction: IJavaAction = js.native
    @JSName("model")
    val model_ITypeParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  /**
       * In version 7.21.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IImportMappingJavaActionParameterType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class ImportMappingJavaActionParameterType protected ()
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ParameterType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 7.2.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IImportMappingParameterType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class ImportMappingParameterType protected () extends ParameterType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IIntegerType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class IntegerType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/java-actions relevant section in reference guide}
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IJavaAction because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class JavaAction protected ()
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
             * In version 7.21.0: deleted
             * In version 6.6.0: introduced
             */
    var javaReturnType: Type = js.native
    /**
             * In version 7.21.0: deleted
             * In version 6.6.0: introduced
             */
    var microflowActionInfo: MicroflowActionInfo | scala.Null = js.native
    /**
             * In version 7.21.0: deleted
             */
    val parameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[JavaActionParameter] = js.native
    /**
             * The value of this property is conceptually of type dataTypes.LegacyDataType.
             *
             * In version 6.6.0: deleted
             */
    var returnType: java.lang.String = js.native
    /**
             * In version 7.21.0: deleted
             * In version 6.6.0: introduced
             */
    val typeParameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[TypeParameter] = js.native
  }
  
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IJavaActionParameter because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class JavaActionParameter protected ()
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeActionParameter {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
             * In version 6.7.0: deleted
             * In version 6.6.0: introduced
             */
    var javaType: Type = js.native
    /**
             * In version 7.21.0: deleted
             * In version 6.7.0: introduced
             */
    var parameterType: ParameterType = js.native
    /**
             * The value of this property is conceptually of type dataTypes.LegacyDataType.
             *
             * In version 6.6.0: deleted
             */
    var `type`: java.lang.String = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IListType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class ListType protected () extends Type {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var parameter: EntityType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.10.0: removed experimental
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IMicroflowActionInfo because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class MicroflowActionInfo protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: java.lang.String = js.native
    var category: java.lang.String = js.native
    val containerAsJavaAction: JavaAction = js.native
    var icon: mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage | scala.Null = js.native
    val iconQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_MicroflowActionInfo: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
       * In version 7.21.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IMicroflowJavaActionParameterType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class MicroflowJavaActionParameterType protected ()
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ParameterType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.9.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IMicroflowParameterType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class MicroflowParameterType protected () extends ParameterType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.7.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IParameterType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  abstract class ParameterType protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsJavaActionParameter: JavaActionParameter = js.native
    @JSName("model")
    var model_ParameterType: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IParameterizedEntityType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class ParameterizedEntityType protected () extends EntityType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var typeParameter: TypeParameter = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IPrimitiveType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  abstract class PrimitiveType protected () extends Type {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IStringType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class StringType protected () extends PrimitiveType {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IType because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  abstract class Type protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsBasicParameterType: BasicParameterType = js.native
    val containerAsJavaAction: JavaAction = js.native
    val containerAsJavaActionParameter: JavaActionParameter = js.native
    val containerAsListType: ListType = js.native
    @JSName("model")
    var model_Type: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ITypeParameter because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
  @js.native
  class TypeParameter protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsJavaAction: JavaAction = js.native
    @JSName("model")
    var model_TypeParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.7.0: introduced
       */
  @js.native
  object BasicParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new BasicParameterType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType = js.native
    /**
             * Creates and returns a new BasicParameterType instance in the SDK and on the server.
             * The new BasicParameterType will be automatically stored in the 'parameterType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createIn(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object BooleanType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new BooleanType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BooleanType = js.native
    /**
             * Creates and returns a new BooleanType instance in the SDK and on the server.
             * The new BooleanType will be automatically stored in the 'type' property
             * of the parent BasicParameterType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BooleanType = js.native
    /**
             * Creates and returns a new BooleanType instance in the SDK and on the server.
             * The new BooleanType will be automatically stored in the 'javaType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 6.6.0
             */
    def createInJavaActionParameterUnderJavaType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BooleanType = js.native
    /**
             * Creates and returns a new BooleanType instance in the SDK and on the server.
             * The new BooleanType will be automatically stored in the 'javaReturnType' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInJavaActionUnderJavaReturnType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BooleanType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object ConcreteEntityType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ConcreteEntityType = js.native
    /**
             * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
             * The new ConcreteEntityType will be automatically stored in the 'type' property
             * of the parent BasicParameterType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ConcreteEntityType = js.native
    /**
             * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
             * The new ConcreteEntityType will be automatically stored in the 'javaType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 6.6.0
             */
    def createInJavaActionParameterUnderJavaType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ConcreteEntityType = js.native
    /**
             * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
             * The new ConcreteEntityType will be automatically stored in the 'javaReturnType' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInJavaActionUnderJavaReturnType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ConcreteEntityType = js.native
    /**
             * Creates and returns a new ConcreteEntityType instance in the SDK and on the server.
             * The new ConcreteEntityType will be automatically stored in the 'parameter' property
             * of the parent ListType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInListTypeUnderParameter(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ListType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ConcreteEntityType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object DateTimeType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new DateTimeType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.DateTimeType = js.native
    /**
             * Creates and returns a new DateTimeType instance in the SDK and on the server.
             * The new DateTimeType will be automatically stored in the 'type' property
             * of the parent BasicParameterType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.DateTimeType = js.native
    /**
             * Creates and returns a new DateTimeType instance in the SDK and on the server.
             * The new DateTimeType will be automatically stored in the 'javaType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 6.6.0
             */
    def createInJavaActionParameterUnderJavaType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.DateTimeType = js.native
    /**
             * Creates and returns a new DateTimeType instance in the SDK and on the server.
             * The new DateTimeType will be automatically stored in the 'javaReturnType' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInJavaActionUnderJavaReturnType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.DateTimeType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object DecimalType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new DecimalType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.DecimalType = js.native
    /**
             * Creates and returns a new DecimalType instance in the SDK and on the server.
             * The new DecimalType will be automatically stored in the 'type' property
             * of the parent BasicParameterType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.DecimalType = js.native
    /**
             * Creates and returns a new DecimalType instance in the SDK and on the server.
             * The new DecimalType will be automatically stored in the 'javaType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 6.6.0
             */
    def createInJavaActionParameterUnderJavaType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.DecimalType = js.native
    /**
             * Creates and returns a new DecimalType instance in the SDK and on the server.
             * The new DecimalType will be automatically stored in the 'javaReturnType' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInJavaActionUnderJavaReturnType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.DecimalType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object EntityType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.7.0: introduced
       */
  @js.native
  object EntityTypeParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new EntityTypeParameterType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.EntityTypeParameterType = js.native
    /**
             * Creates and returns a new EntityTypeParameterType instance in the SDK and on the server.
             * The new EntityTypeParameterType will be automatically stored in the 'parameterType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createIn(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.EntityTypeParameterType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object EnumerationType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new EnumerationType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.EnumerationType = js.native
    /**
             * Creates and returns a new EnumerationType instance in the SDK and on the server.
             * The new EnumerationType will be automatically stored in the 'type' property
             * of the parent BasicParameterType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.EnumerationType = js.native
    /**
             * Creates and returns a new EnumerationType instance in the SDK and on the server.
             * The new EnumerationType will be automatically stored in the 'javaType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 6.6.0
             */
    def createInJavaActionParameterUnderJavaType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.EnumerationType = js.native
    /**
             * Creates and returns a new EnumerationType instance in the SDK and on the server.
             * The new EnumerationType will be automatically stored in the 'javaReturnType' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInJavaActionUnderJavaReturnType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.EnumerationType = js.native
  }
  
  /**
       * In version 7.21.0: introduced
       */
  @js.native
  object ExportMappingJavaActionParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ExportMappingJavaActionParameterType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ExportMappingJavaActionParameterType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 7.2.0: introduced
       */
  @js.native
  object ExportMappingParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ExportMappingParameterType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ExportMappingParameterType = js.native
    /**
             * Creates and returns a new ExportMappingParameterType instance in the SDK and on the server.
             * The new ExportMappingParameterType will be automatically stored in the 'parameterType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.2.0 to 7.20.0
             */
    def createIn(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ExportMappingParameterType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object FloatType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new FloatType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.FloatType = js.native
    /**
             * Creates and returns a new FloatType instance in the SDK and on the server.
             * The new FloatType will be automatically stored in the 'type' property
             * of the parent BasicParameterType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.FloatType = js.native
    /**
             * Creates and returns a new FloatType instance in the SDK and on the server.
             * The new FloatType will be automatically stored in the 'javaType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 6.6.0
             */
    def createInJavaActionParameterUnderJavaType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.FloatType = js.native
    /**
             * Creates and returns a new FloatType instance in the SDK and on the server.
             * The new FloatType will be automatically stored in the 'javaReturnType' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInJavaActionUnderJavaReturnType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.FloatType = js.native
  }
  
  /**
       * In version 7.21.0: introduced
       */
  @js.native
  object ImportMappingJavaActionParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ImportMappingJavaActionParameterType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ImportMappingJavaActionParameterType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 7.2.0: introduced
       */
  @js.native
  object ImportMappingParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ImportMappingParameterType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ImportMappingParameterType = js.native
    /**
             * Creates and returns a new ImportMappingParameterType instance in the SDK and on the server.
             * The new ImportMappingParameterType will be automatically stored in the 'parameterType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.2.0 to 7.20.0
             */
    def createIn(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ImportMappingParameterType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object IntegerType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new IntegerType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IntegerType = js.native
    /**
             * Creates and returns a new IntegerType instance in the SDK and on the server.
             * The new IntegerType will be automatically stored in the 'type' property
             * of the parent BasicParameterType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IntegerType = js.native
    /**
             * Creates and returns a new IntegerType instance in the SDK and on the server.
             * The new IntegerType will be automatically stored in the 'javaType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 6.6.0
             */
    def createInJavaActionParameterUnderJavaType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IntegerType = js.native
    /**
             * Creates and returns a new IntegerType instance in the SDK and on the server.
             * The new IntegerType will be automatically stored in the 'javaReturnType' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInJavaActionUnderJavaReturnType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.IntegerType = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/java-actions relevant section in reference guide}
       */
  @js.native
  object JavaAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates a new JavaAction unit in the SDK and on the server.
             * Expects one argument, the projects.IFolderBase in which this unit is contained.
             */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction = js.native
  }
  
  @js.native
  object JavaActionParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter = js.native
    /**
             * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
             * The new JavaActionParameter will be automatically stored in the 'actionParameters' property
             * of the parent codeactions.CodeAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.21.0 and higher
             */
    def createInCodeActionUnderActionParameters(container: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter = js.native
    /**
             * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
             * The new JavaActionParameter will be automatically stored in the 'parameters' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.20.0
             */
    def createInJavaActionUnderParameters(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object ListType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ListType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ListType = js.native
    /**
             * Creates and returns a new ListType instance in the SDK and on the server.
             * The new ListType will be automatically stored in the 'type' property
             * of the parent BasicParameterType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ListType = js.native
    /**
             * Creates and returns a new ListType instance in the SDK and on the server.
             * The new ListType will be automatically stored in the 'javaType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 6.6.0
             */
    def createInJavaActionParameterUnderJavaType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ListType = js.native
    /**
             * Creates and returns a new ListType instance in the SDK and on the server.
             * The new ListType will be automatically stored in the 'javaReturnType' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInJavaActionUnderJavaReturnType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ListType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.10.0: removed experimental
       * In version 6.6.0: introduced
       */
  @js.native
  object MicroflowActionInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.MicroflowActionInfo = js.native
    /**
             * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
             * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createIn(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.MicroflowActionInfo = js.native
  }
  
  /**
       * In version 7.21.0: introduced
       */
  @js.native
  object MicroflowJavaActionParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new MicroflowJavaActionParameterType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.MicroflowJavaActionParameterType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.9.0: introduced
       */
  @js.native
  object MicroflowParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new MicroflowParameterType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.MicroflowParameterType = js.native
    /**
             * Creates and returns a new MicroflowParameterType instance in the SDK and on the server.
             * The new MicroflowParameterType will be automatically stored in the 'parameterType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.9.0 to 7.20.0
             */
    def createIn(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.MicroflowParameterType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.7.0: introduced
       */
  @js.native
  object ParameterType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object ParameterizedEntityType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ParameterizedEntityType = js.native
    /**
             * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
             * The new ParameterizedEntityType will be automatically stored in the 'type' property
             * of the parent BasicParameterType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ParameterizedEntityType = js.native
    /**
             * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
             * The new ParameterizedEntityType will be automatically stored in the 'javaType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 6.6.0
             */
    def createInJavaActionParameterUnderJavaType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ParameterizedEntityType = js.native
    /**
             * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
             * The new ParameterizedEntityType will be automatically stored in the 'javaReturnType' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInJavaActionUnderJavaReturnType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ParameterizedEntityType = js.native
    /**
             * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
             * The new ParameterizedEntityType will be automatically stored in the 'parameter' property
             * of the parent ListType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInListTypeUnderParameter(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ListType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.ParameterizedEntityType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object PrimitiveType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object StringType extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new StringType instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.StringType = js.native
    /**
             * Creates and returns a new StringType instance in the SDK and on the server.
             * The new StringType will be automatically stored in the 'type' property
             * of the parent BasicParameterType element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.20.0
             */
    def createInBasicParameterTypeUnderType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.BasicParameterType): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.StringType = js.native
    /**
             * Creates and returns a new StringType instance in the SDK and on the server.
             * The new StringType will be automatically stored in the 'javaType' property
             * of the parent JavaActionParameter element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 6.6.0
             */
    def createInJavaActionParameterUnderJavaType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaActionParameter): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.StringType = js.native
    /**
             * Creates and returns a new StringType instance in the SDK and on the server.
             * The new StringType will be automatically stored in the 'javaReturnType' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createInJavaActionUnderJavaReturnType(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.StringType = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object Type extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
  }
  
  /**
       * In version 7.21.0: deleted
       * In version 6.6.0: introduced
       */
  @js.native
  object TypeParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavaactionsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new TypeParameter instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.TypeParameter = js.native
    /**
             * Creates and returns a new TypeParameter instance in the SDK and on the server.
             * The new TypeParameter will be automatically stored in the 'typeParameters' property
             * of the parent JavaAction element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.6.0 to 7.20.0
             */
    def createIn(container: mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.JavaAction): mendixmodelsdkLib.distGenJavaactionsMod.javaactionsNs.TypeParameter = js.native
  }
  
}

