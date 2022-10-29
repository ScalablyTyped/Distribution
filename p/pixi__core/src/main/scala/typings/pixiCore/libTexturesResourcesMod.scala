package typings.pixiCore

import typings.pixiCore.libTexturesBaseTextureMod.ImageSource
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IResourcePlugin
import typings.pixiCore.libTexturesResourcesCubeResourceMod.ICubeResourceOptions
import typings.pixiCore.libTexturesResourcesImageBitmapResourceMod.IImageBitmapResourceOptions
import typings.pixiCore.libTexturesResourcesImageResourceMod.IImageResourceOptions
import typings.pixiCore.libTexturesResourcesSvgresourceMod.ISVGResourceOptions
import typings.pixiCore.libTexturesResourcesVideoResourceMod.IVideoResourceOptions
import typings.pixiCore.libTexturesResourcesVideoResourceMod.IVideoResourceOptionsElement
import typings.pixiCore.pixiCoreInts.`6`
import typings.pixiMath.mod.ISize
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiUtils.libTypesMod.ArrayFixed
import typings.pixiUtils.libTypesMod.Dict
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesResourcesMod {
  
  @JSImport("@pixi/core/lib/textures/resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@pixi/core/lib/textures/resources", "AbstractMultiResource")
  @js.native
  open class AbstractMultiResource protected ()
    extends typings.pixiCore.libTexturesResourcesAbstractMultiResourceMod.AbstractMultiResource {
    /**
      * @param length
      * @param options - Options to for Resource constructor
      * @param {number} [options.width] - Width of the resource
      * @param {number} [options.height] - Height of the resource
      */
    def this(length: Double) = this()
    def this(length: Double, options: ISize) = this()
  }
  
  @JSImport("@pixi/core/lib/textures/resources", "ArrayResource")
  @js.native
  open class ArrayResource protected ()
    extends typings.pixiCore.libTexturesResourcesArrayResourceMod.ArrayResource {
    def this(source: js.Array[Any]) = this()
    /**
      * @param source - Number of items in array or the collection
      *        of image URLs to use. Can also be resources, image elements, canvas, etc.
      * @param options - Options to apply to {@link PIXI.autoDetectResource}
      * @param {number} [options.width] - Width of the resource
      * @param {number} [options.height] - Height of the resource
      */
    def this(source: Double) = this()
    def this(source: js.Array[Any], options: ISize) = this()
    def this(source: Double, options: ISize) = this()
  }
  
  @JSImport("@pixi/core/lib/textures/resources", "BaseImageResource")
  @js.native
  open class BaseImageResource protected ()
    extends typings.pixiCore.libTexturesResourcesBaseImageResourceMod.BaseImageResource {
    /**
      * @param {HTMLImageElement|HTMLVideoElement|ImageBitmap|PIXI.ICanvas} source
      */
    def this(source: ImageSource) = this()
  }
  /* static members */
  object BaseImageResource {
    
    @JSImport("@pixi/core/lib/textures/resources", "BaseImageResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Set cross origin based detecting the url and the crossorigin
      * @param element - Element to apply crossOrigin
      * @param url - URL to check
      * @param crossorigin - Cross origin value to use
      */
    inline def crossOrigin(element: HTMLImageElement, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def crossOrigin(element: HTMLImageElement, url: String, crossorigin: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any], crossorigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def crossOrigin(element: HTMLImageElement, url: String, crossorigin: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any], crossorigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def crossOrigin(element: HTMLVideoElement, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def crossOrigin(element: HTMLVideoElement, url: String, crossorigin: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any], crossorigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def crossOrigin(element: HTMLVideoElement, url: String, crossorigin: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any], crossorigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("@pixi/core/lib/textures/resources", "BufferResource")
  @js.native
  open class BufferResource protected ()
    extends typings.pixiCore.libTexturesResourcesBufferResourceMod.BufferResource {
    /**
      * @param source - Source buffer
      * @param options - Options
      * @param {number} options.width - Width of the texture
      * @param {number} options.height - Height of the texture
      */
    def this(source: js.typedarray.Float32Array, options: ISize) = this()
    def this(source: js.typedarray.Int32Array, options: ISize) = this()
    def this(source: js.typedarray.Uint16Array, options: ISize) = this()
    def this(source: js.typedarray.Uint32Array, options: ISize) = this()
    def this(source: js.typedarray.Uint8Array, options: ISize) = this()
  }
  /* static members */
  object BufferResource {
    
    @JSImport("@pixi/core/lib/textures/resources", "BufferResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @returns {boolean} `true` if <canvas>
      */
    inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@pixi/core/lib/textures/resources", "CanvasResource")
  @js.native
  open class CanvasResource protected ()
    extends typings.pixiCore.libTexturesResourcesCanvasResourceMod.CanvasResource {
    /**
      * @param source - Canvas element to use
      */
    def this(source: ICanvas) = this()
  }
  /* static members */
  object CanvasResource {
    
    @JSImport("@pixi/core/lib/textures/resources", "CanvasResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @returns {boolean} `true` if source is HTMLCanvasElement or OffscreenCanvas
      */
    inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@pixi/core/lib/textures/resources", "CubeResource")
  @js.native
  /**
    * @param {Array<string|PIXI.Resource>} [source] - Collection of URLs or resources
    *        to use as the sides of the cube.
    * @param options - ImageResource options
    * @param {number} [options.width] - Width of resource
    * @param {number} [options.height] - Height of resource
    * @param {number} [options.autoLoad=true] - Whether to auto-load resources
    * @param {number} [options.linkBaseTexture=true] - In case BaseTextures are supplied,
    *   whether to copy them or use
    */
  open class CubeResource ()
    extends typings.pixiCore.libTexturesResourcesCubeResourceMod.CubeResource {
    def this(source: ArrayFixed[String | typings.pixiCore.libTexturesResourcesResourceMod.Resource, `6`]) = this()
    def this(source: Unit, options: ICubeResourceOptions) = this()
    def this(
      source: ArrayFixed[String | typings.pixiCore.libTexturesResourcesResourceMod.Resource, `6`],
      options: ICubeResourceOptions
    ) = this()
  }
  /* static members */
  object CubeResource {
    
    @JSImport("@pixi/core/lib/textures/resources", "CubeResource")
    @js.native
    val ^ : js.Any = js.native
    
    /** Number of texture sides to store for CubeResources. */
    @JSImport("@pixi/core/lib/textures/resources", "CubeResource.SIDES")
    @js.native
    def SIDES: Double = js.native
    inline def SIDES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIDES")(x.asInstanceOf[js.Any])
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @returns {boolean} `true` if source is an array of 6 elements
      */
    inline def test(source: Any): /* is @pixi/utils.@pixi/utils/lib/types.ArrayFixed<string | @pixi/core.@pixi/core/lib/textures/resources/Resource.Resource, 6> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[/* is @pixi/utils.@pixi/utils/lib/types.ArrayFixed<string | @pixi/core.@pixi/core/lib/textures/resources/Resource.Resource, 6> */ Boolean]
  }
  
  @JSImport("@pixi/core/lib/textures/resources", "INSTALLED")
  @js.native
  val INSTALLED: js.Array[IResourcePlugin[Any, Any]] = js.native
  
  @JSImport("@pixi/core/lib/textures/resources", "ImageBitmapResource")
  @js.native
  open class ImageBitmapResource protected ()
    extends typings.pixiCore.libTexturesResourcesImageBitmapResourceMod.ImageBitmapResource {
    def this(source: String) = this()
    /**
      * @param source - ImageBitmap or URL to use
      * @param options
      * @param {boolean} [options.autoLoad=true] - Start loading process automatically when constructed.
      * @param {boolean} [options.crossOrigin=true] - Load image using cross origin.
      * @param {PIXI.ALPHA_MODES} [options.alphaMode=null] - Alpha mode used when creating the ImageBitmap.
      */
    def this(source: ImageBitmap) = this()
    def this(source: String, options: IImageBitmapResourceOptions) = this()
    def this(source: ImageBitmap, options: IImageBitmapResourceOptions) = this()
  }
  /* static members */
  object ImageBitmapResource {
    
    @JSImport("@pixi/core/lib/textures/resources", "ImageBitmapResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Cached empty placeholder canvas.
      * @see EMPTY
      */
    @JSImport("@pixi/core/lib/textures/resources", "ImageBitmapResource._EMPTY")
    @js.native
    def _EMPTY: Any = js.native
    inline def _EMPTY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EMPTY")(x.asInstanceOf[js.Any])
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @returns {boolean} `true` if current environment support ImageBitmap, and source is string or ImageBitmap
      */
    inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@pixi/core/lib/textures/resources", "ImageResource")
  @js.native
  open class ImageResource protected ()
    extends typings.pixiCore.libTexturesResourcesImageResourceMod.ImageResource {
    def this(source: String) = this()
    /**
      * @param source - image source or URL
      * @param options
      * @param {boolean} [options.autoLoad=true] - start loading process
      * @param {boolean} [options.createBitmap=PIXI.settings.CREATE_IMAGE_BITMAP] - whether its required to create
      *        a bitmap before upload
      * @param {boolean} [options.crossorigin=true] - Load image using cross origin
      * @param {PIXI.ALPHA_MODES} [options.alphaMode=PIXI.ALPHA_MODES.UNPACK] - Premultiply image alpha in bitmap
      */
    def this(source: HTMLImageElement) = this()
    def this(source: String, options: IImageResourceOptions) = this()
    def this(source: HTMLImageElement, options: IImageResourceOptions) = this()
  }
  /* static members */
  object ImageResource {
    
    @JSImport("@pixi/core/lib/textures/resources", "ImageResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @returns {boolean} `true` if current environment support HTMLImageElement, and source is string or HTMLImageElement
      */
    inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /* note: abstract class */ @JSImport("@pixi/core/lib/textures/resources", "Resource")
  @js.native
  /**
    * @param width - Width of the resource
    * @param height - Height of the resource
    */
  open class Resource ()
    extends typings.pixiCore.libTexturesResourcesResourceMod.Resource {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Unit, height: Double) = this()
  }
  /* static members */
  object Resource {
    
    @JSImport("@pixi/core/lib/textures/resources", "Resource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Abstract, used to auto-detect resource type.
      * @param {*} _source - The source object
      * @param {string} _extension - The extension of source, if set
      */
    inline def test(_source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(_source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def test(_source: Any, _extension: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(_source.asInstanceOf[js.Any], _extension.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("@pixi/core/lib/textures/resources", "SVGResource")
  @js.native
  open class SVGResource protected ()
    extends typings.pixiCore.libTexturesResourcesSvgresourceMod.SVGResource {
    /**
      * @param sourceBase64 - Base64 encoded SVG element or URL for SVG file.
      * @param {object} [options] - Options to use
      * @param {number} [options.scale=1] - Scale to apply to SVG. Overridden by...
      * @param {number} [options.width] - Rasterize SVG this wide. Aspect ratio preserved if height not specified.
      * @param {number} [options.height] - Rasterize SVG this high. Aspect ratio preserved if width not specified.
      * @param {boolean} [options.autoLoad=true] - Start loading right away.
      */
    def this(sourceBase64: String) = this()
    def this(sourceBase64: String, options: ISVGResourceOptions) = this()
  }
  /* static members */
  object SVGResource {
    
    @JSImport("@pixi/core/lib/textures/resources", "SVGResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Regular expression for SVG size.
      * @example &lt;svg width="100" height="100"&gt;&lt;/svg&gt;
      * @readonly
      */
    @JSImport("@pixi/core/lib/textures/resources", "SVGResource.SVG_SIZE")
    @js.native
    def SVG_SIZE: js.RegExp = js.native
    inline def SVG_SIZE_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVG_SIZE")(x.asInstanceOf[js.Any])
    
    /**
      * Regular expression for SVG XML document.
      * @example &lt;?xml version="1.0" encoding="utf-8" ?&gt;&lt;!-- image/svg --&gt;&lt;svg
      * @readonly
      */
    @JSImport("@pixi/core/lib/textures/resources", "SVGResource.SVG_XML")
    @js.native
    def SVG_XML: js.RegExp = js.native
    inline def SVG_XML_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVG_XML")(x.asInstanceOf[js.Any])
    
    /**
      * Get size from an svg string using a regular expression.
      * @param svgString - a serialized svg element
      * @returns - image extension
      */
    inline def getSize(): ISize = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")().asInstanceOf[ISize]
    inline def getSize(svgString: String): ISize = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(svgString.asInstanceOf[js.Any]).asInstanceOf[ISize]
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @param {string} extension - The extension of source, if set
      * @returns {boolean} - If the source is a SVG source or data file
      */
    inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def test(source: Any, `extension`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("@pixi/core/lib/textures/resources", "VideoResource")
  @js.native
  /**
    * @param {HTMLVideoElement|object|string|Array<string|object>} source - Video element to use.
    * @param {object} [options] - Options to use
    * @param {boolean} [options.autoLoad=true] - Start loading the video immediately
    * @param {boolean} [options.autoPlay=true] - Start playing video immediately
    * @param {number} [options.updateFPS=0] - How many times a second to update the texture from the video.
    * Leave at 0 to update at every render.
    * @param {boolean} [options.crossorigin=true] - Load image using cross origin
    */
  open class VideoResource ()
    extends typings.pixiCore.libTexturesResourcesVideoResourceMod.VideoResource {
    def this(source: String) = this()
    def this(source: js.Array[String | IVideoResourceOptionsElement]) = this()
    def this(source: HTMLVideoElement) = this()
    def this(source: String, options: IVideoResourceOptions) = this()
    def this(source: js.Array[String | IVideoResourceOptionsElement], options: IVideoResourceOptions) = this()
    def this(source: Unit, options: IVideoResourceOptions) = this()
    def this(source: HTMLVideoElement, options: IVideoResourceOptions) = this()
  }
  /* static members */
  object VideoResource {
    
    @JSImport("@pixi/core/lib/textures/resources", "VideoResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Map of video MIME types that can't be directly derived from file extensions.
      * @readonly
      */
    @JSImport("@pixi/core/lib/textures/resources", "VideoResource.MIME_TYPES")
    @js.native
    def MIME_TYPES: Dict[String] = js.native
    inline def MIME_TYPES_=(x: Dict[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIME_TYPES")(x.asInstanceOf[js.Any])
    
    /**
      * List of common video file extensions supported by VideoResource.
      * @readonly
      */
    @JSImport("@pixi/core/lib/textures/resources", "VideoResource.TYPES")
    @js.native
    def TYPES: js.Array[String] = js.native
    inline def TYPES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPES")(x.asInstanceOf[js.Any])
    
    /**
      * Used to auto-detect the type of resource.
      * @param {*} source - The source object
      * @param {string} extension - The extension of source, if set
      * @returns {boolean} `true` if video source
      */
    inline def test(source: Any): /* is std.HTMLVideoElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLVideoElement */ Boolean]
    inline def test(source: Any, `extension`: String): /* is std.HTMLVideoElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[/* is std.HTMLVideoElement */ Boolean]
  }
  
  inline def autoDetectResource[R /* <: typings.pixiCore.libTexturesResourcesResourceMod.Resource */, RO](source: Any): R = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any]).asInstanceOf[R]
  inline def autoDetectResource[R /* <: typings.pixiCore.libTexturesResourcesResourceMod.Resource */, RO](source: Any, options: RO): R = (^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[R]
}
