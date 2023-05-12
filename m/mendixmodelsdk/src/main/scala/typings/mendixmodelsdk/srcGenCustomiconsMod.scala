package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenCustomiconsMod {
  
  @JSImport("mendixmodelsdk/src/gen/customicons", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object customicons {
    
    /**
      * In version 9.20.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.srcGenCustomiconsMod.customicons.ICustomIcon because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsCustomIconCollection, name, characterCode, tags */ @JSImport("mendixmodelsdk/src/gen/customicons", "customicons.CustomIcon")
    @js.native
    open class CustomIcon protected ()
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
      
      def characterCode: Double = js.native
      def characterCode_=(newValue: Double): Unit = js.native
      @JSName("characterCode")
      val characterCode_FCustomIcon: Double = js.native
      
      def containerAsCustomIconCollection: CustomIconCollection = js.native
      @JSName("containerAsCustomIconCollection")
      val containerAsCustomIconCollection_FCustomIcon: ICustomIconCollection = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FCustomIcon: String = js.native
      
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
      @JSName("qualifiedName")
      def qualifiedName_MCustomIcon: String | Null = js.native
      
      def tags: IList[String] = js.native
      @JSName("tags")
      val tags_FCustomIcon: IList[String] = js.native
    }
    object CustomIcon {
      
      @JSImport("mendixmodelsdk/src/gen/customicons", "customicons.CustomIcon")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new CustomIcon instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): CustomIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[CustomIcon]
      
      /**
        * Creates and returns a new CustomIcon instance in the SDK and on the server.
        * The new CustomIcon will be automatically stored in the 'icons' property
        * of the parent CustomIconCollection element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.20.0 and higher
        */
      /* static member */
      inline def createIn(container: CustomIconCollection): CustomIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[CustomIcon]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/customicons", "customicons.CustomIcon.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/customicons", "customicons.CustomIcon.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/customicons relevant section in reference guide}
      *
      * In version 9.20.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.srcGenCustomiconsMod.customicons.ICustomIconCollection because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined collectionClass, prefix, fontData, icons */ @JSImport("mendixmodelsdk/src/gen/customicons", "customicons.CustomIconCollection")
    @js.native
    open class CustomIconCollection protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      /**
        * In version 9.22.0: introduced
        */
      def collectionClass: String = js.native
      def collectionClass_=(newValue: String): Unit = js.native
      /**
        * In version 9.22.0: introduced
        */
      @JSName("collectionClass")
      val collectionClass_FCustomIconCollection: String = js.native
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MCustomIconCollection: FolderBase = js.native
      
      def fontData: String | Null = js.native
      def fontData_=(newValue: String | Null): Unit = js.native
      @JSName("fontData")
      val fontData_FCustomIconCollection: String | Null = js.native
      
      def icons: IList[CustomIcon] = js.native
      @JSName("icons")
      val icons_FCustomIconCollection: IList[ICustomIcon] = js.native
      
      /**
        * In version 9.22.0: introduced
        */
      def prefix: String = js.native
      def prefix_=(newValue: String): Unit = js.native
      /**
        * In version 9.22.0: introduced
        */
      @JSName("prefix")
      val prefix_FCustomIconCollection: String = js.native
    }
    object CustomIconCollection {
      
      @JSImport("mendixmodelsdk/src/gen/customicons", "customicons.CustomIconCollection")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new CustomIconCollection unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): CustomIconCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[CustomIconCollection]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/customicons", "customicons.CustomIconCollection.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/customicons", "customicons.CustomIconCollection.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `CustomIcons`.
      */
    /**
      * In version 9.20.0: introduced
      */
    @js.native
    trait ICustomIcon
      extends StObject
         with IElement
         with IByNameReferrable {
      
      val characterCode: Double = js.native
      
      val containerAsCustomIconCollection: ICustomIconCollection = js.native
      
      @JSName("model")
      val model_ICustomIcon: IModel = js.native
      
      val name: String = js.native
      
      val tags: IList[String] = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/customicons relevant section in reference guide}
      *
      * In version 9.20.0: introduced
      */
    @js.native
    trait ICustomIconCollection
      extends StObject
         with IDocument {
      
      /**
        * In version 9.22.0: introduced
        */
      val collectionClass: String = js.native
      
      val fontData: String | Null = js.native
      
      val icons: IList[ICustomIcon] = js.native
      
      /**
        * In version 9.22.0: introduced
        */
      val prefix: String = js.native
    }
  }
}
