package typings.pixiJs.mod

import typings.pixiJs.anon.HeightWidth
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tiling sprite is a fast way of rendering a tiling image
  *
  * @class
  * @extends PIXI.Sprite
  * @memberof PIXI
  */
@JSImport("pixi.js", "TilingSprite")
@js.native
class TilingSprite protected ()
  extends StObject
     with typings.pixiJs.PIXI.TilingSprite {
  def this(texture: typings.pixiJs.PIXI.Texture) = this()
  def this(texture: typings.pixiJs.PIXI.Texture, width: Double) = this()
  def this(texture: typings.pixiJs.PIXI.Texture, width: Double, height: Double) = this()
  def this(texture: typings.pixiJs.PIXI.Texture, width: Unit, height: Double) = this()
}
object TilingSprite {
  
  @JSImport("pixi.js", "TilingSprite")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def from(source: String): typings.pixiJs.PIXI.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: String, options: js.Any): typings.pixiJs.PIXI.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  /**
    * Helper function that creates a new tiling sprite based on the source you provide.
    * The source can be - frame id, image url, video url, canvas element, video element, base texture
    *
    * @static
    * @param {string|PIXI.Texture|HTMLCanvasElement|HTMLVideoElement} source - Source to create texture from
    * @param {Object} options - See {@link PIXI.BaseTexture}'s constructor for options.
    * @param {number} options.width - required width of the tiling sprite
    * @param {number} options.height - required height of the tiling sprite
    * @return {PIXI.TilingSprite} The newly created texture
    */
  /* static member */
  @scala.inline
  def from(source: String, options: HeightWidth): typings.pixiJs.PIXI.TilingSprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.TilingSprite]
  /* static member */
  @scala.inline
  def from(source: Double): typings.pixiJs.PIXI.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: Double, options: js.Any): typings.pixiJs.PIXI.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: typings.pixiJs.PIXI.Texture): typings.pixiJs.PIXI.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: typings.pixiJs.PIXI.Texture, options: js.Any): typings.pixiJs.PIXI.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: typings.pixiJs.PIXI.Texture, options: HeightWidth): typings.pixiJs.PIXI.TilingSprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.TilingSprite]
  @scala.inline
  def from(source: HTMLCanvasElement): typings.pixiJs.PIXI.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: HTMLCanvasElement, options: js.Any): typings.pixiJs.PIXI.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: HTMLCanvasElement, options: HeightWidth): typings.pixiJs.PIXI.TilingSprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.TilingSprite]
  @scala.inline
  def from(source: HTMLVideoElement): typings.pixiJs.PIXI.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: HTMLVideoElement, options: js.Any): typings.pixiJs.PIXI.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.Sprite]
  @scala.inline
  def from(source: HTMLVideoElement, options: HeightWidth): typings.pixiJs.PIXI.TilingSprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiJs.PIXI.TilingSprite]
  
  /* static member */
  @scala.inline
  def fromFrame(): typings.pixiJs.PIXI.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFrame")().asInstanceOf[typings.pixiJs.PIXI.Sprite]
  
  /* static member */
  @scala.inline
  def fromImage(): typings.pixiJs.PIXI.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImage")().asInstanceOf[typings.pixiJs.PIXI.Sprite]
}
