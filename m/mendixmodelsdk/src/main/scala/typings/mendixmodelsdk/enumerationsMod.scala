package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
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
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enumerationsMod {
  
  @JSImport("mendixmodelsdk/dist/gen/enumerations", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object enumerations {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
      */
    @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Condition")
    @js.native
    class Condition protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attributeValue: String = js.native
      def attributeValue_=(newValue: String): Unit = js.native
      
      def containerAsConditionSettings: ConditionSettings = js.native
      
      def containerAsConditionalSettings: ConditionalSettings = js.native
      
      def editableVisible: Boolean = js.native
      def editableVisible_=(newValue: Boolean): Unit = js.native
    }
    object Condition {
      
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Condition")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @scala.inline
      def create(model: IModel): Condition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Condition]
      
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * The new Condition will be automatically stored in the 'conditions' property
        * of the parent documenttemplates.ConditionSettings element passed as argument.
        */
      /* static member */
      @scala.inline
      def createInConditionSettingsUnderConditions(container: ConditionSettings): Condition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionSettingsUnderConditions")(container.asInstanceOf[js.Any]).asInstanceOf[Condition]
      
      /**
        * Creates and returns a new Condition instance in the SDK and on the server.
        * The new Condition will be automatically stored in the 'conditions' property
        * of the parent pages.ConditionalSettings element passed as argument.
        */
      /* static member */
      @scala.inline
      def createInConditionalSettingsUnderConditions(container: ConditionalSettings): Condition = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionalSettingsUnderConditions")(container.asInstanceOf[js.Any]).asInstanceOf[Condition]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Condition.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Condition.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
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
    - typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined values */ @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Enumeration")
    @js.native
    class Enumeration protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MEnumeration: FolderBase = js.native
      
      def values: IList[EnumerationValue] = js.native
      @JSName("values")
      val values_FEnumeration: IList[IEnumerationValue] = js.native
    }
    object Enumeration {
      
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Enumeration")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Enumeration unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @scala.inline
      def createIn(container: IFolderBase): Enumeration = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Enumeration]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Enumeration.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.Enumeration.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumerationValue because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsEnumeration, name */ @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.EnumerationValue")
    @js.native
    class EnumerationValue protected ()
      extends Element[IModel]
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def caption: Text = js.native
      def caption_=(newValue: Text): Unit = js.native
      
      def containerAsEnumeration: Enumeration = js.native
      @JSName("containerAsEnumeration")
      val containerAsEnumeration_FEnumerationValue: IEnumeration = js.native
      
      def image: IImage | Null = js.native
      
      def imageQualifiedName: String | Null = js.native
      
      def image_=(newValue: IImage | Null): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FEnumerationValue: String = js.native
      
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
      @JSName("qualifiedName")
      def qualifiedName_MEnumerationValue: String | Null = js.native
    }
    object EnumerationValue {
      
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.EnumerationValue")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new EnumerationValue instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @scala.inline
      def create(model: IModel): EnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[EnumerationValue]
      
      /**
        * Creates and returns a new EnumerationValue instance in the SDK and on the server.
        * The new EnumerationValue will be automatically stored in the 'values' property
        * of the parent Enumeration element passed as argument.
        */
      /* static member */
      @scala.inline
      def createIn(container: Enumeration): EnumerationValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[EnumerationValue]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.EnumerationValue.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/enumerations", "enumerations.EnumerationValue.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
      */
    @js.native
    trait IEnumeration
      extends StObject
         with IDocument {
      
      val values: IList[IEnumerationValue] = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/enumerations relevant section in reference guide}
      */
    @js.native
    trait IEnumerationValue
      extends StObject
         with IElement
         with IByNameReferrable {
      
      val containerAsEnumeration: IEnumeration = js.native
      
      @JSName("model")
      val model_IEnumerationValue: IModel = js.native
      
      val name: String = js.native
    }
  }
}
