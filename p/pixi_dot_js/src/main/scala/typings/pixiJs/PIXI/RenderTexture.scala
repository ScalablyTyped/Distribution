package typings.pixiJs.PIXI

import typings.pixiJs.AnonResolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A RenderTexture is a special texture that allows any PixiJS display object to be rendered to it.
  *
  * __Hint__: All DisplayObjects (i.e. Sprites) that render to a RenderTexture should be preloaded
  * otherwise black rectangles will be drawn instead.
  *
  * __Hint-2__: The actual memory allocation will happen on first render.
  * You shouldn't create renderTextures each frame just to delete them after, try to reuse them.
  *
  * A RenderTexture takes a snapshot of any Display Object given to its render method. For example:
  *
  * ```js
  * let renderer = PIXI.autoDetectRenderer();
  * let renderTexture = PIXI.RenderTexture.create(800, 600);
  * let sprite = PIXI.Sprite.from("spinObj_01.png");
  *
  * sprite.position.x = 800/2;
  * sprite.position.y = 600/2;
  * sprite.anchor.x = 0.5;
  * sprite.anchor.y = 0.5;
  *
  * renderer.render(sprite, renderTexture);
  * ```
  *
  * The Sprite in this case will be rendered using its local transform. To render this sprite at 0,0
  * you can clear the transform
  *
  * ```js
  *
  * sprite.setTransform()
  *
  * let renderTexture = new PIXI.RenderTexture.create(100, 100);
  *
  * renderer.render(sprite, renderTexture);  // Renders to center of RenderTexture
  * ```
  *
  * @class
  * @extends PIXI.Texture
  * @memberof PIXI
  */
@JSGlobal("PIXI.RenderTexture")
@js.native
class RenderTexture protected () extends Texture {
  def this(baseRenderTexture: BaseRenderTexture) = this()
  def this(baseRenderTexture: BaseRenderTexture, frame: Rectangle) = this()
  /**
    * Stores `sourceFrame` when this texture is inside current filter stack.
    * You can read it inside filters.
    *
    * @readonly
    * @member {PIXI.Rectangle} PIXI.RenderTexture#filterFrame
    */
  val filterFrame: Rectangle = js.native
  /**
    * The key for pooled texture of FilterSystem
    * @protected
    * @member {string} PIXI.RenderTexture#filterPoolKey
    */
  var filterPoolKey: String = js.native
  /**
    * Resizes the RenderTexture.
    *
    * @param {number} width - The width to resize to.
    * @param {number} height - The height to resize to.
    * @param {boolean} [resizeBaseTexture=true] - Should the baseTexture.width and height values be resized as well?
    */
  def resize(width: Double, height: Double): Unit = js.native
  def resize(width: Double, height: Double, resizeBaseTexture: Boolean): Unit = js.native
  /**
    * Changes the resolution of baseTexture, but does not change framebuffer size.
    *
    * @param {number} resolution - The new resolution to apply to RenderTexture
    */
  def setResolution(resolution: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.RenderTexture")
@js.native
object RenderTexture extends js.Object {
  /**
    * A short hand way of creating a render texture.
    *
    * @param {object} [options] - Options
    * @param {number} [options.width=100] - The width of the render texture
    * @param {number} [options.height=100] - The height of the render texture
    * @param {number} [options.scaleMode=PIXI.settings.SCALE_MODE] - See {@link PIXI.SCALE_MODES} for possible values
    * @param {number} [options.resolution=1] - The resolution / device pixel ratio of the texture being generated
    * @return {PIXI.RenderTexture} The new render texture
    */
  def create(): RenderTexture = js.native
  def create(options: AnonResolution): RenderTexture = js.native
}

