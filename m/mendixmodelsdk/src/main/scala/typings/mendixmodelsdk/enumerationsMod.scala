package typings.mendixmodelsdk

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.ConditionSettings
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.textsMod.texts.Text
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/enumerations", JSImport.Namespace)
@js.native
object enumerationsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object enumerations extends js.Object {
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
      */
    @js.native
    class Condition protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FCondition: IModel = js.native
      def attributeValue: String = js.native
      def attributeValue_=(newValue: String): Unit = js.native
      def containerAsConditionSettings: ConditionSettings = js.native
      def containerAsConditionalSettings: ConditionalSettings = js.native
      def editableVisible: Boolean = js.native
      def editableVisible_=(newValue: Boolean): Unit = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined values */ @js.native
    class Enumeration protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FEnumeration: IModel = js.native
      @JSName("values")
      val values_FEnumeration: IList[IEnumerationValue] = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MEnumeration: FolderBase = js.native
      def values: IList[EnumerationValue] = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumerationValue because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEnumeration, name */ @js.native
    class EnumerationValue protected ()
      extends Element
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("containerAsEnumeration")
      val containerAsEnumeration_FEnumerationValue: IEnumeration = js.native
      @JSName("model")
      var model_FEnumerationValue: IModel = js.native
      @JSName("name")
      val name_FEnumerationValue: String = js.native
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
      def containerAsEnumeration: Enumeration = js.native
      def image: IImage | Null = js.native
      def imageQualifiedName: String | Null = js.native
      def image_=(newValue: IImage | Null): Unit = js.native
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("qualifiedName")
      def qualifiedName_MEnumerationValue: String | Null = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
      */
    @js.native
    trait IEnumeration extends IDocument {
      val values: IList[IEnumerationValue] = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
      */
    @js.native
    trait IEnumerationValue
      extends IElement
         with IByNameReferrable {
      val containerAsEnumeration: IEnumeration = js.native
      @JSName("model")
      val model_IEnumerationValue: IModel = js.native
      val name: String = js.native
    }
    
    /* static members */
    @js.native
    object Condition extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): Condition = js.native
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * The new Condition will be automatically stored in the 'conditions' property
        * of the parent documenttemplates.ConditionSettings element passed as argument.
        */
      def createInConditionSettingsUnderConditions(container: ConditionSettings): Condition = js.native
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * The new Condition will be automatically stored in the 'conditions' property
        * of the parent pages.ConditionalSettings element passed as argument.
        */
      def createInConditionalSettingsUnderConditions(container: ConditionalSettings): Condition = js.native
    }
    
    /* static members */
    @js.native
    object Enumeration extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new Enumeration unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): Enumeration = js.native
    }
    
    /* static members */
    @js.native
    object EnumerationValue extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new EnumerationValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): EnumerationValue = js.native
      /**
        * Creates and returns a new EnumerationValue instance in the SDK and on the server.
        * The new EnumerationValue will be automatically stored in the 'values' property
        * of the parent Enumeration element passed as argument.
        */
      def createIn(container: Enumeration): EnumerationValue = js.native
    }
    
  }
  
}

