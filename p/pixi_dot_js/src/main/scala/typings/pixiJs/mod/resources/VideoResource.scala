package typings.pixiJs.mod.resources

import typings.pixiJs.PIXI.BaseTexture
import typings.pixiJs.PIXI.GLTexture
import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.anon.AutoPlay
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends typings.pixiJs.PIXI.resources.VideoResource {
  def this(source: String) = this()
  def this(source: js.Any) = this()
  def this(source: js.Array[String | _]) = this()
  def this(source: HTMLVideoElement) = this()
  def this(source: String, options: AutoPlay) = this()
  def this(source: js.Any, options: AutoPlay) = this()
  def this(source: js.Array[String | _], options: AutoPlay) = this()
  def this(source: HTMLVideoElement, options: AutoPlay) = this()
  /**
    * Internal height of the resource
    * @member {number} PIXI.resources.Resource#_height
    * @protected
    */
  /* CompleteClass */
  override var _height: Double = js.native
  /**
    * Internal width of the resource
    * @member {number} PIXI.resources.Resource#_width
    * @protected
    */
  /* CompleteClass */
  override var _width: Double = js.native
  /**
    * If resource has been destroyed
    * @member {boolean} PIXI.resources.Resource#destroyed
    * @readonly
    * @default false
    */
  /* CompleteClass */
  override val destroyed: Boolean = js.native
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
  /* CompleteClass */
  override var internal: Boolean = js.native
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
  /**
    * Bind to a parent BaseTexture
    *
    * @param {PIXI.BaseTexture} baseTexture - Parent texture
    */
  /* CompleteClass */
  override def bind(baseTexture: BaseTexture): Unit = js.native
  /**
    * Call when destroying resource, unbind any BaseTexture object
    * before calling this method, as reference counts are maintained
    * internally.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Clean up anything, this happens when destroying is ready.
    *
    * @protected
    */
  /* CompleteClass */
  /* protected */ override def dispose(): Unit = js.native
  /**
    * This can be overridden to start preloading a resource
    * or do any other prepare step.
    * @protected
    * @return {Promise<void>} Handle the validate event
    */
  /* CompleteClass */
  /* protected */ override def load(): js.Promise[Unit] = js.native
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
  override def style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean = js.native
  /**
    * Unbind to a parent BaseTexture
    *
    * @param {PIXI.BaseTexture} baseTexture - Parent texture
    */
  /* CompleteClass */
  override def unbind(baseTexture: BaseTexture): Unit = js.native
  /**
    * Has been updated trigger event
    */
  /* CompleteClass */
  override def update(): Unit = js.native
}

/* static members */
@JSImport("pixi.js", "resources.VideoResource")
@js.native
object VideoResource extends js.Object {
  /**
    * Map of video MIME types that can't be directly derived from file extensions.
    * @constant
    * @member {object}
    * @static
    * @readonly
    */
  val MIME_TYPES: js.Any = js.native
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

