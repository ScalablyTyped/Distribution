package typings.pixiJs.global.PIXI

import typings.pixiJs.anon.Resolution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSGlobal("PIXI.RenderTexture")
@js.native
class RenderTexture protected ()
  extends StObject
     with typings.pixiJs.PIXI.RenderTexture {
  def this(baseRenderTexture: typings.pixiJs.PIXI.BaseRenderTexture) = this()
  def this(baseRenderTexture: typings.pixiJs.PIXI.BaseRenderTexture, frame: typings.pixiJs.PIXI.Rectangle) = this()
}
object RenderTexture {
  
  @JSGlobal("PIXI.RenderTexture")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  @scala.inline
  def create(): typings.pixiJs.PIXI.RenderTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.pixiJs.PIXI.RenderTexture]
  @scala.inline
  def create(options: Resolution): typings.pixiJs.PIXI.RenderTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.RenderTexture]
}
