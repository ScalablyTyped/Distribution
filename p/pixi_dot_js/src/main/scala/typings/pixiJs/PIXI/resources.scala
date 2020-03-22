package typings.pixiJs.PIXI

import typings.pixiJs.AnonAutoLoad
import typings.pixiJs.AnonAutoPlay
import typings.pixiJs.AnonCreateBitmap
import typings.pixiJs.AnonHeightWidth
import typings.pixiJs.AnonWidth
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.OffscreenCanvas
import typings.std.RegExp
import typings.std.SVGElement
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Collection of base resource types supported by PixiJS.
  *
  * Resources are used by {@link PIXI.BaseTexture} to handle different media types
  * such as images, video, SVG graphics, etc. In most use-cases, you should not
  * instantiate the resources directly. The easy thing is to use
  * {@link PIXI.BaseTexture.from}.
  * @example
  * const baseTexture = PIXI.BaseTexture.from('path/to/image.jpg');
  * @namespace PIXI.resources
  */
@JSGlobal("PIXI.resources")
@js.native
object resources extends js.Object {
  /**
    * A resource that contains a number of sources.
    *
    * @class
    * @extends PIXI.resources.Resource
    * @memberof PIXI.resources
    * @param {number|Array<*>} source - Number of items in array or the collection
    *        of image URLs to use. Can also be resources, image elements, canvas, etc.
    * @param {object} [options] Options to apply to {@link PIXI.resources.autoDetectResource}
    * @param {number} [options.width] - Width of the resource
    * @param {number} [options.height] - Height of the resource
    */
  @js.native
  class ArrayResource protected () extends Resource {
    def this(source: js.Array[_]) = this()
    def this(source: Double) = this()
    def this(source: js.Array[_], options: AnonWidth) = this()
    def this(source: Double, options: AnonWidth) = this()
    /**
      * Dirty IDs for each part
      * @member {Array<number>} PIXI.resources.ArrayResource#itemDirtyIds
      * @readonly
      */
    val itemDirtyIds: js.Array[Double] = js.native
    /**
      * Collection of resources.
      * @member {Array<PIXI.BaseTexture>} PIXI.resources.ArrayResource#items
      * @readonly
      */
    val items: js.Array[BaseTexture] = js.native
    /**
      * Number of elements in array
      *
      * @member {number} PIXI.resources.ArrayResource#length
      * @readonly
      */
    val length: Double = js.native
    /**
      * Set a resource by ID
      *
      * @param {PIXI.resources.Resource} resource
      * @param {number} index - Zero-based index of resource to set
      * @return {PIXI.resources.ArrayResource} Instance for chaining
      */
    def addResourceAt(resource: Resource, index: Double): ArrayResource = js.native
  }
  
  /**
    * Base for all the image/canvas resources
    * @class
    * @extends PIXI.resources.Resource
    * @memberof PIXI.resources
    */
  @js.native
  class BaseImageResource protected () extends Resource {
    def this(source: HTMLCanvasElement) = this()
    def this(source: HTMLImageElement) = this()
    def this(source: HTMLVideoElement) = this()
    def this(source: SVGElement) = this()
    /**
      * The source element
      * @member {HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|SVGElement} PIXI.resources.BaseImageResource#source
      * @readonly
      */
    val source: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | SVGElement = js.native
    def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLCanvasElement): Boolean = js.native
    def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLImageElement): Boolean = js.native
    def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLVideoElement): Boolean = js.native
    def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: SVGElement): Boolean = js.native
  }
  
  /**
    * Buffer resource with data of typed array.
    * @class
    * @extends PIXI.resources.Resource
    * @memberof PIXI.resources
    */
  @js.native
  class BufferResource protected () extends Resource {
    def this(source: Float32Array, options: AnonHeightWidth) = this()
    def this(source: Uint32Array, options: AnonHeightWidth) = this()
    def this(source: Uint8Array, options: AnonHeightWidth) = this()
    /**
      * Source array
      * Cannot be ClampedUint8Array because it cant be uploaded to WebGL
      *
      * @member {Float32Array|Uint8Array|Uint32Array} PIXI.resources.BufferResource#data
      */
    var data: Float32Array | Uint8Array | Uint32Array = js.native
  }
  
  /**
    * Resource type for HTMLCanvasElement.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    * @param {HTMLCanvasElement} source - Canvas element to use
    */
  @js.native
  class CanvasResource protected () extends BaseImageResource {
    def this(source: HTMLCanvasElement) = this()
  }
  
  /**
    * Resource for a CubeTexture which contains six resources.
    *
    * @class
    * @extends PIXI.resources.ArrayResource
    * @memberof PIXI.resources
    * @param {Array<string|PIXI.resources.Resource>} [source] Collection of URLs or resources
    *        to use as the sides of the cube.
    * @param {object} [options] - ImageResource options
    * @param {number} [options.width] - Width of resource
    * @param {number} [options.height] - Height of resource
    */
  @js.native
  class CubeResource () extends ArrayResource {
    def this(source: js.Array[String | Resource]) = this()
    def this(source: js.Array[String | Resource], options: AnonWidth) = this()
    /**
      * Upload the resource
      *
      * @returns {boolean} true is success
      */
    def upload(): Boolean = js.native
  }
  
  /**
    * Resource type for DepthTexture.
    * @class
    * @extends PIXI.resources.BufferResource
    * @memberof PIXI.resources
    */
  @js.native
  class DepthResource () extends BufferResource
  
  /**
    * Resource type for ImageBitmap.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    * @param {ImageBitmap} source - Image element to use
    */
  @js.native
  class ImageBitmapResource protected () extends BaseImageResource {
    def this(source: ImageBitmap) = this()
  }
  
  /**
    * Resource type for HTMLImageElement.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    */
  @js.native
  class ImageResource protected () extends BaseImageResource {
    def this(source: String) = this()
    def this(source: HTMLImageElement) = this()
    /**
      * Controls texture alphaMode field
      * Copies from options
      * Default is `null`, copies option from baseTexture
      *
      * @member {PIXI.ALPHA_MODES|null} PIXI.resources.ImageResource#alphaMode
      * @readonly
      */
    val alphaMode: ALPHA_MODES | Null = js.native
    /**
      * The ImageBitmap element created for HTMLImageElement
      * @member {ImageBitmap} PIXI.resources.ImageResource#bitmap
      * @default null
      */
    var bitmap: ImageBitmap = js.native
    /**
      * If capable, convert the image using createImageBitmap API
      * @member {boolean} PIXI.resources.ImageResource#createBitmap
      * @default PIXI.settings.CREATE_IMAGE_BITMAP
      */
    var createBitmap: Boolean = js.native
    /**
      * If the image should be disposed after upload
      * @member {boolean} PIXI.resources.ImageResource#preserveBitmap
      * @default false
      */
    var preserveBitmap: Boolean = js.native
    /**
      * URL of the image source
      * @member {string} PIXI.resources.ImageResource#url
      */
    var url: String = js.native
    def load(createBitmap: Boolean): js.Promise[Unit] = js.native
    /**
      * Called when we need to convert image into BitmapImage.
      * Can be called multiple times, real promise is cached inside.
      *
      * @returns {Promise<void>} cached promise to fill that bitmap
      */
    def process(): js.Promise[Unit] = js.native
  }
  
  /**
    * Base resource class for textures that manages validation and uploading, depending on its type.
    *
    * Uploading of a base texture to the GPU is required.
    *
    * @class
    * @memberof PIXI.resources
    */
  @js.native
  class Resource () extends js.Object {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    var _height: Double = js.native
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    var _width: Double = js.native
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    val destroyed: Boolean = js.native
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    val height: Double = js.native
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    var internal: Boolean = js.native
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    val valid: Boolean = js.native
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    val width: Double = js.native
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    def bind(baseTexture: BaseTexture): Unit = js.native
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    def destroy(): Unit = js.native
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ def dispose(): Unit = js.native
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ def load(): js.Promise[Unit] = js.native
    /**
      * Trigger a resize event
      * @param {number} width X dimension
      * @param {number} height Y dimension
      */
    def resize(width: Double, height: Double): Unit = js.native
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    def style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean = js.native
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    def unbind(baseTexture: BaseTexture): Unit = js.native
    /**
      * Has been updated trigger event
      */
    def update(): Unit = js.native
    /**
      * Uploads the texture or returns false if it cant for some reason. Override this.
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} true is success
      */
    def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean = js.native
  }
  
  /**
    * Resource type for SVG elements and graphics.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    * @param {string} source - Base64 encoded SVG element or URL for SVG file.
    * @param {object} [options] - Options to use
    * @param {number} [options.scale=1] Scale to apply to SVG. Overridden by...
    * @param {number} [options.width] Rasterize SVG this wide. Aspect ratio preserved if height not specified.
    * @param {number} [options.height] Rasterize SVG this high. Aspect ratio preserved if width not specified.
    * @param {boolean} [options.autoLoad=true] Start loading right away.
    */
  @js.native
  class SVGResource protected () extends BaseImageResource {
    def this(source: String) = this()
    def this(source: String, options: AnonAutoLoad) = this()
    /**
      * A height override for rasterization on load
      * @readonly
      * @member {number} PIXI.resources.SVGResource#_overrideHeight
      */
    val _overrideHeight: Double = js.native
    /**
      * A width override for rasterization on load
      * @readonly
      * @member {number} PIXI.resources.SVGResource#_overrideWidth
      */
    val _overrideWidth: Double = js.native
    /**
      * The source scale to apply when rasterizing on load
      * @readonly
      * @member {number} PIXI.resources.SVGResource#scale
      */
    val scale: Double = js.native
    /**
      * Base64 encoded SVG element or URL for SVG file
      * @readonly
      * @member {string} PIXI.resources.SVGResource#svg
      */
    val svg: String = js.native
  }
  
  /**
    * Resource type for HTMLVideoElement.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    * @param {HTMLVideoElement|object|string|Array<string|object>} source - Video element to use.
    * @param {object} [options] - Options to use
    * @param {boolean} [options.autoLoad=true] - Start loading the video immediately
    * @param {boolean} [options.autoPlay=true] - Start playing video immediately
    * @param {number} [options.updateFPS=0] - How many times a second to update the texture from the video.
    * Leave at 0 to update at every render.
    * @param {boolean} [options.crossorigin=true] - Load image using cross origin
    */
  @js.native
  class VideoResource protected () extends BaseImageResource {
    def this(source: String) = this()
    def this(source: js.Any) = this()
    def this(source: js.Array[String | _]) = this()
    def this(source: HTMLVideoElement) = this()
    def this(source: String, options: AnonAutoPlay) = this()
    def this(source: js.Any, options: AnonAutoPlay) = this()
    def this(source: js.Array[String | _], options: AnonAutoPlay) = this()
    def this(source: HTMLVideoElement, options: AnonAutoPlay) = this()
    /**
      * When set to true will automatically play videos used by this texture once
      * they are loaded. If false, it will not modify the playing state.
      *
      * @member {boolean} PIXI.resources.VideoResource#autoPlay
      * @default true
      */
    var autoPlay: Boolean = js.native
    /**
      * Should the base texture automatically update itself, set to true by default
      *
      * @member {boolean}
      */
    var autoUpdate: Boolean = js.native
    /**
      * How many times a second to update the texture from the video. Leave at 0 to update at every render.
      * A lower fps can help performance, as updating the texture at 60fps on a 30ps video may not be efficient.
      *
      * @member {number}
      */
    var updateFPS: Double = js.native
    def update(deltaTime: Double): Unit = js.native
  }
  
  /**
    * Collection of installed resource types, class must extend {@link PIXI.resources.Resource}.
    * @example
    * class CustomResource extends PIXI.resources.Resource {
    *   // MUST have source, options constructor signature
    *   // for auto-detected resources to be created.
    *   constructor(source, options) {
    *     super();
    *   }
    *   upload(renderer, baseTexture, glTexture) {
    *     // upload with GL
    *     return true;
    *   }
    *   // used to auto-detect resource
    *   static test(source, extension) {
    *     return extension === 'xyz'|| source instanceof SomeClass;
    *   }
    * }
    * // Install the new resource type
    * PIXI.resources.INSTALLED.push(CustomResource);
    *
    * @name PIXI.resources.INSTALLED
    * @type {Array<*>}
    * @static
    * @readonly
    */
  var INSTALLED: js.Array[js.Any] = js.native
  /**
    * Create a resource element from a single source element. This
    * auto-detects which type of resource to create. All resources that
    * are auto-detectable must have a static `test` method and a constructor
    * with the arguments `(source, options?)`. Currently, the supported
    * resources for auto-detection include:
    *  - {@link PIXI.resources.ImageResource}
    *  - {@link PIXI.resources.CanvasResource}
    *  - {@link PIXI.resources.VideoResource}
    *  - {@link PIXI.resources.SVGResource}
    *  - {@link PIXI.resources.BufferResource}
    * @static
    * @function PIXI.resources.autoDetectResource
    * @param {string|*} source - Resource source, this can be the URL to the resource,
    *        a typed-array (for BufferResource), HTMLVideoElement, SVG data-uri
    *        or any other resource that can be auto-detected. If not resource is
    *        detected, it's assumed to be an ImageResource.
    * @param {object} [options] - Pass-through options to use for Resource
    * @param {number} [options.width] - Width of BufferResource or SVG rasterization
    * @param {number} [options.height] - Height of BufferResource or SVG rasterization
    * @param {boolean} [options.autoLoad=true] - Image, SVG and Video flag to start loading
    * @param {number} [options.scale=1] - SVG source scale. Overridden by width, height
    * @param {boolean} [options.createBitmap=PIXI.settings.CREATE_IMAGE_BITMAP] - Image option to create Bitmap object
    * @param {boolean} [options.crossorigin=true] - Image and Video option to set crossOrigin
    * @param {boolean} [options.autoPlay=true] - Video option to start playing video immediately
    * @param {number} [options.updateFPS=0] - Video option to update how many times a second the
    *        texture should be updated from the video. Leave at 0 to update at every render
    * @return {PIXI.resources.Resource} The created resource.
    */
  def autoDetectResource(source: String): Resource = js.native
  def autoDetectResource(source: String, options: AnonCreateBitmap): Resource = js.native
  def autoDetectResource(source: js.Any): Resource = js.native
  def autoDetectResource(source: js.Any, options: AnonCreateBitmap): Resource = js.native
  /* static members */
  @js.native
  object BaseImageResource extends js.Object {
    /**
      * Set cross origin based detecting the url and the crossorigin
      * @protected
      * @param {HTMLElement} element - Element to apply crossOrigin
      * @param {string} url - URL to check
      * @param {boolean|string} [crossorigin=true] - Cross origin value to use
      */
    /* protected */ def crossOrigin(element: HTMLElement, url: String): Unit = js.native
    /* protected */ def crossOrigin(element: HTMLElement, url: String, crossorigin: String): Unit = js.native
    /* protected */ def crossOrigin(element: HTMLElement, url: String, crossorigin: Boolean): Unit = js.native
  }
  
  /* static members */
  @js.native
  object BufferResource extends js.Object {
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {*} source - The source object
      * @return {boolean} `true` if <canvas>
      */
    def test(source: js.Any): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CanvasResource extends js.Object {
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {HTMLCanvasElement|OffscreenCanvas} source - The source object
      * @return {boolean} `true` if source is HTMLCanvasElement or OffscreenCanvas
      */
    def test(source: HTMLCanvasElement): Boolean = js.native
    def test(source: OffscreenCanvas): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CubeResource extends js.Object {
    /**
      * Number of texture sides to store for CubeResources
      *
      * @name PIXI.resources.CubeResource.SIDES
      * @static
      * @member {number}
      * @default 6
      */
    var SIDES: Double = js.native
  }
  
  /* static members */
  @js.native
  object ImageBitmapResource extends js.Object {
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {ImageBitmap} source - The source object
      * @return {boolean} `true` if source is an ImageBitmap
      */
    def test(source: ImageBitmap): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SVGResource extends js.Object {
    /**
      * RegExp for SVG size.
      *
      * @static
      * @constant {RegExp|string} SVG_SIZE
      * @memberof PIXI.resources.SVGResource
      * @example &lt;svg width="100" height="100"&gt;&lt;/svg&gt;
      */
    val SVG_SIZE: RegExp | String = js.native
    /**
      * Get size from an svg string using regexp.
      *
      * @method
      * @param {string} svgString - a serialized svg element
      * @return {PIXI.ISize} image extension
      */
    def getSize(svgString: String): ISize = js.native
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {*} source - The source object
      * @param {string} extension - The extension of source, if set
      */
    def test(source: js.Any, extension: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object VideoResource extends js.Object {
    /**
      * List of common video file extensions supported by VideoResource.
      * @constant
      * @member {Array<string>}
      * @static
      * @readonly
      */
    val TYPES: js.Array[String] = js.native
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {*} source - The source object
      * @param {string} extension - The extension of source, if set
      * @return {boolean} `true` if video source
      */
    def test(source: js.Any, extension: String): Boolean = js.native
  }
  
}

