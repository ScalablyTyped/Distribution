package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenImagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenImagesMod.images.IImage
import typings.mendixmodelsdk.distGenImagesMod.images.IImageCollection
import typings.mendixmodelsdk.distGenImagesMod.images.Image
import typings.mendixmodelsdk.distGenImagesMod.images.ImageCollection
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/images", JSImport.Namespace)
@js.native
object distGenImagesMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object images extends js.Object {
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
      * See: {@link https://docs.mendix.com/refguide7/images relevant section in reference guide}
      */
    @js.native
    trait IImageCollection extends IDocument {
      val images: IList[IImage] = js.native
    }
    
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.distGenImagesMod.images.IImage because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsImageCollection, name */ @js.native
    class Image protected ()
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
      @JSName("containerAsImageCollection")
      val containerAsImageCollection_FImage: IImageCollection = js.native
      @JSName("model")
      var model_FImage: IModel = js.native
      @JSName("name")
      val name_FImage: String = js.native
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
      def containerAsImageCollection(): ImageCollection = js.native
      def imageData(): String | Null = js.native
      def imageData(newValue: String): js.Any = js.native
      @JSName("imageData")
      def imageData_Any(): js.Any = js.native
      def name(): String = js.native
      def name(newValue: String): js.Any = js.native
      @JSName("qualifiedName")
      def qualifiedName_MImage(): String | Null = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/images relevant section in reference guide}
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenImagesMod.images.IImageCollection because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined images */ @js.native
    class ImageCollection protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("images")
      val images_FImageCollection: IList[IImage] = js.native
      @JSName("model")
      var model_FImageCollection: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MImageCollection(): FolderBase = js.native
      def images(): IList[Image] = js.native
    }
    
    /* static members */
    @js.native
    object Image extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new Image instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): Image = js.native
      /**
        * Creates and returns a new Image instance in the SDK and on the server.
        * The new Image will be automatically stored in the 'images' property
        * of the parent ImageCollection element passed as argument.
        */
      def createIn(container: ImageCollection): Image = js.native
    }
    
    /* static members */
    @js.native
    object ImageCollection extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new ImageCollection unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): ImageCollection = js.native
    }
    
  }
  
}

