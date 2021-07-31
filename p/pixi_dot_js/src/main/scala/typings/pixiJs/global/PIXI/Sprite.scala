package typings.pixiJs.global.PIXI

import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Sprite object is the base for all textured objects that are rendered to the screen
  *
  * A sprite can be created directly from an image like this:
  *
  * ```js
  * let sprite = PIXI.Sprite.from('assets/image.png');
  * ```
  *
  * The more efficient way to create sprites is using a {@link PIXI.Spritesheet},
  * as swapping base textures when rendering to the screen is inefficient.
  *
  * ```js
  * PIXI.Loader.shared.add("assets/spritesheet.json").load(setup);
  *
  * function setup() {
  *   let sheet = PIXI.Loader.shared.resources["assets/spritesheet.json"].spritesheet;
  *   let sprite = new PIXI.Sprite(sheet.textures["image.png"]);
  *   ...
  * }
  * ```
  *
  * @class
  * @extends PIXI.Container
  * @memberof PIXI
  */
@JSGlobal("PIXI.Sprite")
@js.native
class Sprite ()
  extends StObject
     with typings.pixiJs.PIXI.Sprite {
  def this(texture: typings.pixiJs.PIXI.Texture) = this()
}
object Sprite {
  
  @JSGlobal("PIXI.Sprite")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function that creates a new sprite based on the source you provide.
    * The source can be - frame id, image url, video url, canvas element, video element, base texture
    *
    * @static
    * @param {string|PIXI.Texture|HTMLCanvasElement|HTMLVideoElement} source - Source to create texture from
    * @param {object} [options] - See {@link PIXI.BaseTexture}'s constructor for options.
    * @return {PIXI.Sprite} The newly created sprite
    */
  /* static member */
  @scala.inline
  def from(source: String): typings.pixiJs.PIXI.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: String, options: js.Any): typings.pixiJs.PIXI.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: typings.pixiJs.PIXI.Texture): typings.pixiJs.PIXI.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: typings.pixiJs.PIXI.Texture, options: js.Any): typings.pixiJs.PIXI.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: HTMLCanvasElement): typings.pixiJs.PIXI.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: HTMLCanvasElement, options: js.Any): typings.pixiJs.PIXI.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: HTMLVideoElement): typings.pixiJs.PIXI.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: HTMLVideoElement, options: js.Any): typings.pixiJs.PIXI.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Sprite]
}
