package typings.pixiJs.mod

import typings.pixiJs.PIXI.ISize
import typings.pixiJs.anon.AutoLoad
import typings.pixiJs.anon.AutoPlay
import typings.pixiJs.anon.CreateBitmap
import typings.pixiJs.anon.Crossorigin
import typings.pixiJs.anon.HeightWidth
import typings.pixiJs.anon.Scale
import typings.pixiJs.anon.Width
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
  
  @JSImport("pixi.js", "resources")
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("pixi.js", "resources.AbstractMultiResource")
  @js.native
  class AbstractMultiResource ()
    extends StObject
       with typings.pixiJs.PIXI.resources.AbstractMultiResource {
    def this(options: Width) = this()
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
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
  @JSImport("pixi.js", "resources.ArrayResource")
  @js.native
  class ArrayResource protected ()
    extends StObject
       with typings.pixiJs.PIXI.resources.ArrayResource {
    def this(source: js.Array[js.Any]) = this()
    def this(source: Double) = this()
    def this(source: js.Array[js.Any], options: Width) = this()
    def this(source: Double, options: Width) = this()
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Set a baseTexture by ID,
      * ArrayResource just takes resource from it, nothing more
      *
      * @param {PIXI.BaseTexture} baseTexture
      * @param {number} index - Zero-based index of resource to set
      * @return {PIXI.resources.ArrayResource} Instance for chaining
      */
    /* CompleteClass */
    override def addBaseTextureAt(baseTexture: typings.pixiJs.PIXI.BaseTexture, index: Double): typings.pixiJs.PIXI.resources.ArrayResource = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Upload the resources to the GPU.
      * @param {PIXI.Renderer} renderer
      * @param {PIXI.BaseTexture} texture
      * @param {PIXI.GLTexture} glTexture
      * @returns {boolean} whether texture was uploaded
      */
    /* CompleteClass */
    override def upload(
      renderer: typings.pixiJs.PIXI.Renderer,
      texture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  
  /**
    * Base for all the image/canvas resources
    * @class
    * @extends PIXI.resources.Resource
    * @memberof PIXI.resources
    */
  @JSImport("pixi.js", "resources.BaseImageResource")
  @js.native
  class BaseImageResource protected ()
    extends StObject
       with typings.pixiJs.PIXI.resources.BaseImageResource {
    def this(source: HTMLCanvasElement) = this()
    def this(source: HTMLImageElement) = this()
    def this(source: HTMLVideoElement) = this()
    def this(source: SVGElement) = this()
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  object BaseImageResource {
    
    @JSImport("pixi.js", "resources.BaseImageResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Set cross origin based detecting the url and the crossorigin
      * @protected
      * @param {HTMLElement} element - Element to apply crossOrigin
      * @param {string} url - URL to check
      * @param {boolean|string} [crossorigin=true] - Cross origin value to use
      */
    /* static member */
    inline def crossOrigin(element: HTMLElement, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def crossOrigin(element: HTMLElement, url: String, crossorigin: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any], crossorigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def crossOrigin(element: HTMLElement, url: String, crossorigin: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("crossOrigin")(element.asInstanceOf[js.Any], url.asInstanceOf[js.Any], crossorigin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * Buffer resource with data of typed array.
    * @class
    * @extends PIXI.resources.Resource
    * @memberof PIXI.resources
    */
  @JSImport("pixi.js", "resources.BufferResource")
  @js.native
  class BufferResource protected ()
    extends StObject
       with typings.pixiJs.PIXI.resources.BufferResource {
    def this(source: Float32Array, options: HeightWidth) = this()
    def this(source: Uint32Array, options: HeightWidth) = this()
    def this(source: Uint8Array, options: HeightWidth) = this()
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Source array
      * Cannot be ClampedUint8Array because it cant be uploaded to WebGL
      *
      * @member {Float32Array|Uint8Array|Uint32Array} PIXI.resources.BufferResource#data
      */
    /* CompleteClass */
    var data: Float32Array | Uint8Array | Uint32Array = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Upload the texture to the GPU.
      * @param {PIXI.Renderer} renderer - Upload to the renderer
      * @param {PIXI.BaseTexture} baseTexture - Reference to parent texture
      * @param {PIXI.GLTexture} glTexture - glTexture
      * @returns {boolean} true is success
      */
    /* CompleteClass */
    override def upload(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  object BufferResource {
    
    @JSImport("pixi.js", "resources.BufferResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {*} source - The source object
      * @return {boolean} `true` if <canvas>
      */
    /* static member */
    inline def test(source: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * Resource type for HTMLCanvasElement.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    * @param {HTMLCanvasElement} source - Canvas element to use
    */
  @JSImport("pixi.js", "resources.CanvasResource")
  @js.native
  class CanvasResource protected ()
    extends StObject
       with typings.pixiJs.PIXI.resources.CanvasResource {
    def this(source: HTMLCanvasElement) = this()
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  object CanvasResource {
    
    @JSImport("pixi.js", "resources.CanvasResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {HTMLCanvasElement|OffscreenCanvas} source - The source object
      * @return {boolean} `true` if source is HTMLCanvasElement or OffscreenCanvas
      */
    /* static member */
    inline def test(source: HTMLCanvasElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def test(source: OffscreenCanvas): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
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
  @JSImport("pixi.js", "resources.CubeResource")
  @js.native
  class CubeResource ()
    extends StObject
       with typings.pixiJs.PIXI.resources.CubeResource {
    def this(source: js.Array[String | typings.pixiJs.PIXI.resources.Resource]) = this()
    def this(source: js.Array[String | typings.pixiJs.PIXI.resources.Resource], options: AutoLoad) = this()
    def this(source: Unit, options: AutoLoad) = this()
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Set a baseTexture by ID,
      * ArrayResource just takes resource from it, nothing more
      *
      * @param {PIXI.BaseTexture} baseTexture
      * @param {number} index - Zero-based index of resource to set
      * @return {PIXI.resources.ArrayResource} Instance for chaining
      */
    /* CompleteClass */
    override def addBaseTextureAt(baseTexture: typings.pixiJs.PIXI.BaseTexture, index: Double): typings.pixiJs.PIXI.resources.ArrayResource = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * In case BaseTextures are supplied, whether to use same resource or bind baseTexture itself
      * @member {boolean} PIXI.resources.CubeResource#linkBaseTexture
      * @protected
      */
    /* protected */ /* CompleteClass */
    var linkBaseTexture: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Upload the resource
      *
      * @returns {boolean} true is success
      */
    /* CompleteClass */
    override def upload(): Boolean = js.native
    /**
      * Upload the resources to the GPU.
      * @param {PIXI.Renderer} renderer
      * @param {PIXI.BaseTexture} texture
      * @param {PIXI.GLTexture} glTexture
      * @returns {boolean} whether texture was uploaded
      */
    /* CompleteClass */
    override def upload(
      renderer: typings.pixiJs.PIXI.Renderer,
      texture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  object CubeResource {
    
    @JSImport("pixi.js", "resources.CubeResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Number of texture sides to store for CubeResources
      *
      * @name PIXI.resources.CubeResource.SIDES
      * @static
      * @member {number}
      * @default 6
      */
    /* static member */
    @JSImport("pixi.js", "resources.CubeResource.SIDES")
    @js.native
    def SIDES: Double = js.native
    inline def SIDES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIDES")(x.asInstanceOf[js.Any])
    
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {object} source - The source object
      * @return {boolean} `true` if source is an array of 6 elements
      */
    /* static member */
    inline def test(source: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * Resource type for DepthTexture.
    * @class
    * @extends PIXI.resources.BufferResource
    * @memberof PIXI.resources
    */
  @JSImport("pixi.js", "resources.DepthResource")
  @js.native
  class DepthResource ()
    extends StObject
       with typings.pixiJs.PIXI.resources.DepthResource {
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Source array
      * Cannot be ClampedUint8Array because it cant be uploaded to WebGL
      *
      * @member {Float32Array|Uint8Array|Uint32Array} PIXI.resources.BufferResource#data
      */
    /* CompleteClass */
    var data: Float32Array | Uint8Array | Uint32Array = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Upload the texture to the GPU.
      * @param {PIXI.Renderer} renderer - Upload to the renderer
      * @param {PIXI.BaseTexture} baseTexture - Reference to parent texture
      * @param {PIXI.GLTexture} glTexture - glTexture
      * @returns {boolean} true is success
      */
    /* CompleteClass */
    override def upload(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
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
  @JSImport("pixi.js", "resources.INSTALLED")
  @js.native
  def INSTALLED: js.Array[js.Any] = js.native
  inline def INSTALLED_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTALLED")(x.asInstanceOf[js.Any])
  
  /**
    * Resource type for ImageBitmap.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    * @param {ImageBitmap} source - Image element to use
    */
  @JSImport("pixi.js", "resources.ImageBitmapResource")
  @js.native
  class ImageBitmapResource protected ()
    extends StObject
       with typings.pixiJs.PIXI.resources.ImageBitmapResource {
    def this(source: ImageBitmap) = this()
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  object ImageBitmapResource {
    
    @JSImport("pixi.js", "resources.ImageBitmapResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {ImageBitmap} source - The source object
      * @return {boolean} `true` if source is an ImageBitmap
      */
    /* static member */
    inline def test(source: ImageBitmap): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * Resource type for HTMLImageElement.
    * @class
    * @extends PIXI.resources.BaseImageResource
    * @memberof PIXI.resources
    */
  @JSImport("pixi.js", "resources.ImageResource")
  @js.native
  class ImageResource protected ()
    extends StObject
       with typings.pixiJs.PIXI.resources.ImageResource {
    def this(source: String) = this()
    def this(source: HTMLImageElement) = this()
    def this(source: String, options: CreateBitmap) = this()
    def this(source: HTMLImageElement, options: CreateBitmap) = this()
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  object ImageResource {
    
    @JSImport("pixi.js", "resources.ImageResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {string|HTMLImageElement} source - The source object
      * @return {boolean} `true` if source is string or HTMLImageElement
      */
    /* static member */
    inline def test(source: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def test(source: HTMLImageElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * Base resource class for textures that manages validation and uploading, depending on its type.
    *
    * Uploading of a base texture to the GPU is required.
    *
    * @class
    * @memberof PIXI.resources
    */
  @JSImport("pixi.js", "resources.Resource")
  @js.native
  class Resource ()
    extends StObject
       with typings.pixiJs.PIXI.resources.Resource {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Unit, height: Double) = this()
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  object Resource {
    
    @JSImport("pixi.js", "resources.Resource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Abstract, used to auto-detect resource type
      *
      * @static
      * @param {*} source - The source object
      * @param {string} extension - The extension of source, if set
      */
    /* static member */
    inline def test(source: js.Any, `extension`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  @JSImport("pixi.js", "resources.SVGResource")
  @js.native
  class SVGResource protected ()
    extends StObject
       with typings.pixiJs.PIXI.resources.SVGResource {
    def this(source: String) = this()
    def this(source: String, options: Scale) = this()
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  object SVGResource {
    
    @JSImport("pixi.js", "resources.SVGResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * RegExp for SVG size.
      *
      * @static
      * @constant {RegExp|string} SVG_SIZE
      * @memberof PIXI.resources.SVGResource
      * @example &lt;svg width="100" height="100"&gt;&lt;/svg&gt;
      */
    /* static member */
    @JSImport("pixi.js", "resources.SVGResource.SVG_SIZE")
    @js.native
    val SVG_SIZE: RegExp | String = js.native
    
    /**
      * Get size from an svg string using regexp.
      *
      * @method
      * @param {string} svgString - a serialized svg element
      * @return {PIXI.ISize} image extension
      */
    /* static member */
    inline def getSize(svgString: String): ISize = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(svgString.asInstanceOf[js.Any]).asInstanceOf[ISize]
    
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {*} source - The source object
      * @param {string} extension - The extension of source, if set
      */
    /* static member */
    inline def test(source: js.Any, `extension`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  @JSImport("pixi.js", "resources.VideoResource")
  @js.native
  class VideoResource protected ()
    extends StObject
       with typings.pixiJs.PIXI.resources.VideoResource {
    def this(source: String) = this()
    def this(source: js.Any) = this()
    def this(source: js.Array[String | js.Any]) = this()
    def this(source: HTMLVideoElement) = this()
    def this(source: String, options: AutoPlay) = this()
    def this(source: js.Any, options: AutoPlay) = this()
    def this(source: js.Array[String | js.Any], options: AutoPlay) = this()
    def this(source: HTMLVideoElement, options: AutoPlay) = this()
    
    /**
      * Internal height of the resource
      * @member {number} PIXI.resources.Resource#_height
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _height: Double = js.native
    
    /**
      * Internal width of the resource
      * @member {number} PIXI.resources.Resource#_width
      * @protected
      */
    /* protected */ /* CompleteClass */
    var _width: Double = js.native
    
    /**
      * Bind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def bind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Call when destroying resource, unbind any BaseTexture object
      * before calling this method, as reference counts are maintained
      * internally.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * If resource has been destroyed
      * @member {boolean} PIXI.resources.Resource#destroyed
      * @readonly
      * @default false
      */
    /* CompleteClass */
    override val destroyed: Boolean = js.native
    
    /**
      * Clean up anything, this happens when destroying is ready.
      *
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The height of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val height: Double = js.native
    
    /**
      * `true` if resource is created by BaseTexture
      * useful for doing cleanup with BaseTexture destroy
      * and not cleaning up resources that were created
      * externally.
      * @member {boolean} PIXI.resources.Resource#internal
      * @protected
      */
    /* protected */ /* CompleteClass */
    var internal: Boolean = js.native
    
    /**
      * This can be overridden to start preloading a resource
      * or do any other prepare step.
      * @protected
      * @return {Promise<void>} Handle the validate event
      */
    /* protected */ /* CompleteClass */
    override def load(): js.Promise[Unit] = js.native
    
    /**
      * Trigger a resize event
      * @param {number} width - X dimension
      * @param {number} height - Y dimension
      */
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * Set the style, optional to override
      *
      * @param {PIXI.Renderer} renderer - yeah, renderer!
      * @param {PIXI.BaseTexture} baseTexture - the texture
      * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
      * @returns {boolean} `true` is success
      */
    /* CompleteClass */
    override def style(
      renderer: typings.pixiJs.PIXI.Renderer,
      baseTexture: typings.pixiJs.PIXI.BaseTexture,
      glTexture: typings.pixiJs.PIXI.GLTexture
    ): Boolean = js.native
    
    /**
      * Unbind to a parent BaseTexture
      *
      * @param {PIXI.BaseTexture} baseTexture - Parent texture
      */
    /* CompleteClass */
    override def unbind(baseTexture: typings.pixiJs.PIXI.BaseTexture): Unit = js.native
    
    /**
      * Has been updated trigger event
      */
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /**
      * Has been validated
      * @readonly
      * @member {boolean}
      */
    /* CompleteClass */
    override val valid: Boolean = js.native
    
    /**
      * The width of the resource.
      *
      * @member {number}
      * @readonly
      */
    /* CompleteClass */
    override val width: Double = js.native
  }
  object VideoResource {
    
    @JSImport("pixi.js", "resources.VideoResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Map of video MIME types that can't be directly derived from file extensions.
      * @constant
      * @member {object}
      * @static
      * @readonly
      */
    /* static member */
    @JSImport("pixi.js", "resources.VideoResource.MIME_TYPES")
    @js.native
    val MIME_TYPES: js.Any = js.native
    
    /**
      * List of common video file extensions supported by VideoResource.
      * @constant
      * @member {Array<string>}
      * @static
      * @readonly
      */
    /* static member */
    @JSImport("pixi.js", "resources.VideoResource.TYPES")
    @js.native
    val TYPES: js.Array[String] = js.native
    
    /**
      * Used to auto-detect the type of resource.
      *
      * @static
      * @param {*} source - The source object
      * @param {string} extension - The extension of source, if set
      * @return {boolean} `true` if video source
      */
    /* static member */
    inline def test(source: js.Any, `extension`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
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
  inline def autoDetectResource(source: String): typings.pixiJs.PIXI.resources.Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.resources.Resource]
  inline def autoDetectResource(source: String, options: Crossorigin): typings.pixiJs.PIXI.resources.Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.resources.Resource]
  inline def autoDetectResource(source: js.Any): typings.pixiJs.PIXI.resources.Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.resources.Resource]
  inline def autoDetectResource(source: js.Any, options: Crossorigin): typings.pixiJs.PIXI.resources.Resource = (^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectResource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.resources.Resource]
}
