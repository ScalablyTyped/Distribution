package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagesMod {
  
  @JSImport("mendixmodelsdk/dist/gen/images", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object images {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.imagesMod.images.IImage because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsImageCollection, name */ @JSImport("mendixmodelsdk/dist/gen/images", "images.Image")
    @js.native
    class Image protected ()
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
      
      def containerAsImageCollection: ImageCollection = js.native
      @JSName("containerAsImageCollection")
      val containerAsImageCollection_FImage: IImageCollection = js.native
      
      def imageData: String | Null = js.native
      def imageData_=(newValue: String | Null): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FImage: String = js.native
      
      @JSName("qualifiedName")
      def qualifiedName_MImage: String | Null = js.native
    }
    object Image {
      
      @JSImport("mendixmodelsdk/dist/gen/images", "images.Image")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new Image instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/images", "images.Image.create")
      @js.native
      def create(model: IModel): Image = js.native
      
      /**
        * Creates and returns a new Image instance in the SDK and on the server.
        * The new Image will be automatically stored in the 'images' property
        * of the parent ImageCollection element passed as argument.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/images", "images.Image.createIn")
      @js.native
      def createIn(container: ImageCollection): Image = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/images", "images.Image.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/images", "images.Image.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/images relevant section in reference guide}
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
    - typings.mendixmodelsdk.imagesMod.images.IImageCollection because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined images */ @JSImport("mendixmodelsdk/dist/gen/images", "images.ImageCollection")
    @js.native
    class ImageCollection protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MImageCollection: FolderBase = js.native
      
      def images: IList[Image] = js.native
      @JSName("images")
      val images_FImageCollection: IList[IImage] = js.native
    }
    object ImageCollection {
      
      @JSImport("mendixmodelsdk/dist/gen/images", "images.ImageCollection")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ImageCollection unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/images", "images.ImageCollection.createIn")
      @js.native
      def createIn(container: IFolderBase): ImageCollection = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/images", "images.ImageCollection.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/images", "images.ImageCollection.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Images`.
      */
    @js.native
    trait IImage
      extends IElement
         with IByNameReferrable {
      
      val containerAsImageCollection: IImageCollection = js.native
      
      @JSName("model")
      val model_IImage: IModel = js.native
      
      val name: String = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/images relevant section in reference guide}
      */
    @js.native
    trait IImageCollection extends IDocument {
      
      val images: IList[IImage] = js.native
    }
  }
}
