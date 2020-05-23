package typings.pixiJs.PIXI

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
  * let renderTexture = PIXI.RenderTexture.create({ width: 800, height: 600 });
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
@js.native
trait RenderTexture extends Texture {
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

