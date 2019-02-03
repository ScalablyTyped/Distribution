package typings
package mendixmodelsdkLib.distGenImagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/images", "images")
@js.native
object imagesNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Images`.
    */
  @js.native
  trait IImage
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsImageCollection: IImageCollection = js.native
    @JSName("model")
    val model_IImage: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/images relevant section in reference guide}
    */
  @js.native
  trait IImageCollection
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument {
    val images: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IImage] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenImagesMod.imagesNs.IImage because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsImageCollection, name, asLoaded, load, load, load, load */ @js.native
  class Image protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsImageCollection: IImageCollection | ImageCollection = js.native
    var imageData: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_Image: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/images relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenImagesMod.imagesNs.IImageCollection because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined images, asLoaded, load, load, load, load */ @js.native
  class ImageCollection protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    val images: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IImage | Image] = js.native
  }
  
  /* static members */
  @js.native
  object Image extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenImagesMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenImagesMod.imagesNs.Image = js.native
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * The new Image will be automatically stored in the 'images' property
      * of the parent ImageCollection element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenImagesMod.imagesNs.ImageCollection): mendixmodelsdkLib.distGenImagesMod.imagesNs.Image = js.native
  }
  
  /* static members */
  @js.native
  object ImageCollection extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenImagesMod.StructureVersionInfo = js.native
    /**
      * Creates a new ImageCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenImagesMod.imagesNs.ImageCollection = js.native
  }
  
}

