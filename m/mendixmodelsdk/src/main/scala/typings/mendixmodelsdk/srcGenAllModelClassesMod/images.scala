package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object images {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.Image")
  @js.native
  open class Image protected ()
    extends typings.mendixmodelsdk.srcGenImagesMod.images.Image {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Image {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.Image")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenImagesMod.images.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenImagesMod.images.Image]
    
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * The new Image will be automatically stored in the 'images' property
      * of the parent ImageCollection element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenImagesMod.images.ImageCollection): typings.mendixmodelsdk.srcGenImagesMod.images.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenImagesMod.images.Image]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.Image.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.Image.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenImagesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenImagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/images relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.ImageCollection")
  @js.native
  open class ImageCollection protected ()
    extends typings.mendixmodelsdk.srcGenImagesMod.images.ImageCollection {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ImageCollection {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.ImageCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ImageCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenImagesMod.images.ImageCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenImagesMod.images.ImageCollection]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.ImageCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.ImageCollection.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenImagesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenImagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.MxImageFormat")
  @js.native
  open class MxImageFormat protected ()
    extends typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object MxImageFormat {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.MxImageFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.MxImageFormat.Bmp")
    @js.native
    def Bmp: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Bmp_=(x: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bmp")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.MxImageFormat.Gif")
    @js.native
    def Gif: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Gif_=(x: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Gif")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.MxImageFormat.Jpg")
    @js.native
    def Jpg: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Jpg_=(x: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Jpg")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.MxImageFormat.Png")
    @js.native
    def Png: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Png_=(x: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Png")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.MxImageFormat.Svg")
    @js.native
    def Svg: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Svg_=(x: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Svg")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "images.MxImageFormat.Unknown")
    @js.native
    def Unknown: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Unknown_=(x: typings.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(x.asInstanceOf[js.Any])
  }
}
