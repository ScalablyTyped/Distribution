package typings.pixiJs.PIXI

import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageBitmap
import typings.std.SVGElement
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object resources {
  
  /**
    * Resource that can manage several resource (items) inside.
    * All resources need to have the same pixel size.
    * Parent class for CubeResource and ArrayResource
    *
    * @class
    * @extends PIXI.resources.Resource
    * @memberof PIXI.resources
    * @param {object} [options] Options to for Resource constructor
    * @param {number} [options.width] - Width of the resource
    * @param {number} [options.height] - Height of the resource
    */
  @js.native
  trait AbstractMultiResource
    extends StObject
       with Resource {
    
    /**
      * Set a resource by ID
      *
      * @param {PIXI.resources.Resource} resource
      * @param {number} index - Zero-based index of resource to set
      * @return {PIXI.resources.ArrayResource} Instance for chaining
      */
    def addResourceAt(resource: Resource, index: Double): ArrayResource = js.native
    
    /**
      * Bound baseTexture, there can only be one
      * @member {PIXI.BaseTexture} PIXI.resources.AbstractMultiResource#baseTexture
      */
    var baseTexture: BaseTexture = js.native
    
    /**
      * used from ArrayResource and CubeResource constructors
      * @param {Array<*>} resources - Can be resources, image elements, canvas, etc. ,
      *  length should be same as constructor length
      * @param {object} [options] - detect options for resources
      * @protected
      */
    /* protected */ def initFromArray(resources: js.Array[js.Any]): Unit = js.native
    /* protected */ def initFromArray(resources: js.Array[js.Any], options: js.Any): Unit = js.native
    
    /**
      * Dirty IDs for each part
      * @member {Array<number>} PIXI.resources.AbstractMultiResource#itemDirtyIds
      * @readonly
      */
    val itemDirtyIds: js.Array[Double] = js.native
    
    /**
      * Collection of partial baseTextures that correspond to resources
      * @member {Array<PIXI.BaseTexture>} PIXI.resources.AbstractMultiResource#items
      * @readonly
      */
    val items: js.Array[BaseTexture] = js.native
    
    /**
      * Number of elements in array
      *
      * @member {number} PIXI.resources.AbstractMultiResource#length
      * @readonly
      */
    val length: Double = js.native
  }
  
  /**
    * A resource that contains a number of sources.
    *
    * @class
    * @extends PIXI.resources.Resource
    * @memberof PIXI.resources
    * @param {number|Array<*>} source - Number of items in array or the collection
    *        of image URLs to use. Can also be resources, image elements, canvas, etc.
    * @param {object} [options] - Options to apply to {@link PIXI.resources.autoDetectResource}
    * @param {number} [options.width] - Width of the resource
    * @param {number} [options.height] - Height of the resource
    */
  trait ArrayResource
    extends StObject
       with Resource {
    
    /**
      * Set a baseTexture by ID,
      * ArrayResource just takes resource from it, nothing more
      *
      * @param {PIXI.BaseTexture} baseTexture
      * @param {number} index - Zero-based index of resource to set
      * @return {PIXI.resources.ArrayResource} Instance for chaining
      */
    def addBaseTextureAt(baseTexture: BaseTexture, index: Double): ArrayResource
    
    /**
      * Upload the resources to the GPU.
      * @param {PIXI.Renderer} renderer
      * @param {PIXI.BaseTexture} texture
      * @param {PIXI.GLTexture} glTexture
      * @returns {boolean} whether texture was uploaded
      */
    def upload(renderer: Renderer, texture: BaseTexture, glTexture: GLTexture): Boolean
  }
  object ArrayResource {
    
    inline def apply(
      _height: Double,
      _width: Double,
      addBaseTextureAt: (BaseTexture, Double) => ArrayResource,
      bind: BaseTexture => Unit,
      destroy: () => Unit,
      destroyed: Boolean,
      dispose: () => Unit,
      height: Double,
      internal: Boolean,
      load: () => js.Promise[Unit],
      resize: (Double, Double) => Unit,
      style: (Renderer, BaseTexture, GLTexture) => Boolean,
      unbind: BaseTexture => Unit,
      update: () => Unit,
      upload: (Renderer, BaseTexture, GLTexture) => Boolean,
      valid: Boolean,
      width: Double
    ): ArrayResource = {
      val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], addBaseTextureAt = js.Any.fromFunction2(addBaseTextureAt), bind = js.Any.fromFunction1(bind), destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), upload = js.Any.fromFunction3(upload), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayResource]
    }
    
    extension [Self <: ArrayResource](x: Self) {
      
      inline def setAddBaseTextureAt(value: (BaseTexture, Double) => ArrayResource): Self = StObject.set(x, "addBaseTextureAt", js.Any.fromFunction2(value))
      
      inline def setUpload(value: (Renderer, BaseTexture, GLTexture) => Boolean): Self = StObject.set(x, "upload", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * Base for all the image/canvas resources
    * @class
    * @extends PIXI.resources.Resource
    * @memberof PIXI.resources
    */
  @js.native
  trait BaseImageResource
    extends StObject
       with Resource {
    
    /**
      * The source element
      * @member {HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|SVGElement} PIXI.resources.BaseImageResource#source
      * @readonly
      */
    val source: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | SVGElement = js.native
    
    /**
      * Upload the texture to the GPU.
      * @param {PIXI.Renderer} renderer - Upload to the renderer
      * @param {PIXI.BaseTexture} baseTexture - Reference to parent texture
      * @param {PIXI.GLTexture} glTexture
      * @param {HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|SVGElement} [source] (optional)
      * @returns {boolean} true is success
      */
    def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean = js.native
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
  trait BufferResource
    extends StObject
       with Resource {
    
    /**
      * Source array
      * Cannot be ClampedUint8Array because it cant be uploaded to WebGL
      *
      * @member {Float32Array|Uint8Array|Uint32Array} PIXI.resources.BufferResource#data
      */
    var data: Float32Array | Uint8Array | Uint32Array
    
    /**
      * Upload the texture to the GPU.
      * @param {PIXI.Renderer} renderer - Upload to the renderer
      * @param {PIXI.BaseTexture} baseTexture - Reference to parent texture
      * @param {PIXI.GLTexture} glTexture - glTexture
      * @returns {boolean} true is success
      */
    def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
  }
  object BufferResource {
    
    inline def apply(
      _height: Double,
      _width: Double,
      bind: BaseTexture => Unit,
      data: Float32Array | Uint8Array | Uint32Array,
      destroy: () => Unit,
      destroyed: Boolean,
      dispose: () => Unit,
      height: Double,
      internal: Boolean,
      load: () => js.Promise[Unit],
      resize: (Double, Double) => Unit,
      style: (Renderer, BaseTexture, GLTexture) => Boolean,
      unbind: BaseTexture => Unit,
      update: () => Unit,
      upload: (Renderer, BaseTexture, GLTexture) => Boolean,
      valid: Boolean,
      width: Double
    ): BufferResource = {
      val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], bind = js.Any.fromFunction1(bind), data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), upload = js.Any.fromFunction3(upload), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferResource]
    }
    
    extension [Self <: BufferResource](x: Self) {
      
      inline def setData(value: Float32Array | Uint8Array | Uint32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setUpload(value: (Renderer, BaseTexture, GLTexture) => Boolean): Self = StObject.set(x, "upload", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * Resource type for HTMLCanvasElement.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    * @param {HTMLCanvasElement} source - Canvas element to use
    */
  @js.native
  trait CanvasResource
    extends StObject
       with BaseImageResource
  
  /**
    * Resource for a CubeTexture which contains six resources.
    *
    * @class
    * @extends PIXI.resources.ArrayResource
    * @memberof PIXI.resources
    * @param {Array<string|PIXI.resources.Resource>} [source] - Collection of URLs or resources
    *        to use as the sides of the cube.
    * @param {object} [options] - ImageResource options
    * @param {number} [options.width] - Width of resource
    * @param {number} [options.height] - Height of resource
    * @param {number} [options.autoLoad=true] - Whether to auto-load resources
    * @param {number} [options.linkBaseTexture=true] - In case BaseTextures are supplied,
    *   whether to copy them or use
    */
  trait CubeResource
    extends StObject
       with ArrayResource {
    
    /**
      * In case BaseTextures are supplied, whether to use same resource or bind baseTexture itself
      * @member {boolean} PIXI.resources.CubeResource#linkBaseTexture
      * @protected
      */
    /* protected */ var linkBaseTexture: Boolean
    
    /**
      * Upload the resource
      *
      * @returns {boolean} true is success
      */
    def upload(): Boolean
  }
  object CubeResource {
    
    inline def apply(
      _height: Double,
      _width: Double,
      addBaseTextureAt: (BaseTexture, Double) => ArrayResource,
      bind: BaseTexture => Unit,
      destroy: () => Unit,
      destroyed: Boolean,
      dispose: () => Unit,
      height: Double,
      internal: Boolean,
      linkBaseTexture: Boolean,
      load: () => js.Promise[Unit],
      resize: (Double, Double) => Unit,
      style: (Renderer, BaseTexture, GLTexture) => Boolean,
      unbind: BaseTexture => Unit,
      update: () => Unit,
      upload: () => Boolean,
      valid: Boolean,
      width: Double
    ): CubeResource = {
      val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], addBaseTextureAt = js.Any.fromFunction2(addBaseTextureAt), bind = js.Any.fromFunction1(bind), destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], linkBaseTexture = linkBaseTexture.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), upload = js.Any.fromFunction0(upload), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CubeResource]
    }
    
    extension [Self <: CubeResource](x: Self) {
      
      inline def setLinkBaseTexture(value: Boolean): Self = StObject.set(x, "linkBaseTexture", value.asInstanceOf[js.Any])
      
      inline def setUpload(value: () => Boolean): Self = StObject.set(x, "upload", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Resource type for DepthTexture.
    * @class
    * @extends PIXI.resources.BufferResource
    * @memberof PIXI.resources
    */
  trait DepthResource
    extends StObject
       with BufferResource
  object DepthResource {
    
    inline def apply(
      _height: Double,
      _width: Double,
      bind: BaseTexture => Unit,
      data: Float32Array | Uint8Array | Uint32Array,
      destroy: () => Unit,
      destroyed: Boolean,
      dispose: () => Unit,
      height: Double,
      internal: Boolean,
      load: () => js.Promise[Unit],
      resize: (Double, Double) => Unit,
      style: (Renderer, BaseTexture, GLTexture) => Boolean,
      unbind: BaseTexture => Unit,
      update: () => Unit,
      upload: (Renderer, BaseTexture, GLTexture) => Boolean,
      valid: Boolean,
      width: Double
    ): DepthResource = {
      val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], bind = js.Any.fromFunction1(bind), data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), upload = js.Any.fromFunction3(upload), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DepthResource]
    }
  }
  
  /**
    * Resource type for ImageBitmap.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    * @param {ImageBitmap} source - Image element to use
    */
  @js.native
  trait ImageBitmapResource
    extends StObject
       with BaseImageResource
  
  /**
    * Resource type for HTMLImageElement.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    */
  @js.native
  trait ImageResource
    extends StObject
       with BaseImageResource {
    
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
    
    def load(createBitmap: Boolean): js.Promise[Unit] = js.native
    
    /**
      * If the image should be disposed after upload
      * @member {boolean} PIXI.resources.ImageResource#preserveBitmap
      * @default false
      */
    var preserveBitmap: Boolean = js.native
    
    /**
      * Called when we need to convert image into BitmapImage.
      * Can be called multiple times, real promise is cached inside.
      *
      * @returns {Promise<void>} cached promise to fill that bitmap
      */
    def process(): js.Promise[Unit] = js.native
    
    /**
      * URL of the image source
      * @member {string} PIXI.resources.ImageResource#url
      */
    var url: String = js.native
  }
  
  /**
    * Base resource class for textures that manages validation and uploading, depending on its type.
    *
    * Uploading of a base texture to the GPU is required.
    *
    * @class
    * @memberof PIXI.resources
    */
  trait Resource extends StObject {
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ var _height: Double
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ var _width: Double
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    def bind(baseTexture: BaseTexture): Unit
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    def destroy(): Unit
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    val destroyed: Boolean
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ def dispose(): Unit
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    val height: Double
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ var internal: Boolean
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ def load(): js.Promise[Unit]
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    def resize(width: Double, height: Double): Unit
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    def style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    def unbind(baseTexture: BaseTexture): Unit
    
    /**
      * Has been updated trigger event
      */
    def update(): Unit
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    val valid: Boolean
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    val width: Double
  }
  object Resource {
    
    inline def apply(
      _height: Double,
      _width: Double,
      bind: BaseTexture => Unit,
      destroy: () => Unit,
      destroyed: Boolean,
      dispose: () => Unit,
      height: Double,
      internal: Boolean,
      load: () => js.Promise[Unit],
      resize: (Double, Double) => Unit,
      style: (Renderer, BaseTexture, GLTexture) => Boolean,
      unbind: BaseTexture => Unit,
      update: () => Unit,
      valid: Boolean,
      width: Double
    ): Resource = {
      val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], bind = js.Any.fromFunction1(bind), destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    extension [Self <: Resource](x: Self) {
      
      inline def setBind(value: BaseTexture => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      inline def setLoad(value: () => js.Promise[Unit]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      inline def setResize(value: (Double, Double) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
      
      inline def setStyle(value: (Renderer, BaseTexture, GLTexture) => Boolean): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
      
      inline def setUnbind(value: BaseTexture => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def set_height(value: Double): Self = StObject.set(x, "_height", value.asInstanceOf[js.Any])
      
      inline def set_width(value: Double): Self = StObject.set(x, "_width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Resource type for SVG elements and graphics.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    * @param {string} source - Base64 encoded SVG element or URL for SVG file.
    * @param {object} [options] - Options to use
    * @param {number} [options.scale=1] - Scale to apply to SVG. Overridden by...
    * @param {number} [options.width] - Rasterize SVG this wide. Aspect ratio preserved if height not specified.
    * @param {number} [options.height] - Rasterize SVG this high. Aspect ratio preserved if width not specified.
    * @param {boolean} [options.autoLoad=true] - Start loading right away.
    */
  @js.native
  trait SVGResource
    extends StObject
       with BaseImageResource {
    
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
  trait VideoResource
    extends StObject
       with BaseImageResource {
    
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
    
    def update(deltaTime: Double): Unit = js.native
    
    /**
      * How many times a second to update the texture from the video. Leave at 0 to update at every render.
      * A lower fps can help performance, as updating the texture at 60fps on a 30ps video may not be efficient.
      *
      * @member {number}
      */
    var updateFPS: Double = js.native
  }
}
