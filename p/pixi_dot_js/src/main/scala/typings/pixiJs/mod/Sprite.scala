package typings.pixiJs.mod

import typings.pixiCore.mod.IBaseTextureOptions
import typings.pixiSprite.mod.SpriteSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Sprite")
@js.native
/** @param texture - The texture for this sprite. */
open class Sprite ()
  extends typings.pixiSprite.mod.Sprite {
  def this(texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource]) = this()
}
/* static members */
object Sprite {
  
  @JSImport("pixi.js", "Sprite")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function that creates a new sprite based on the source you provide.
    * The source can be - frame id, image url, video url, canvas element, video element, base texture
    * @param {string|PIXI.Texture|HTMLCanvasElement|HTMLVideoElement} source - Source to create texture from
    * @param {object} [options] - See {@link PIXI.BaseTexture}'s constructor for options.
    * @returns The newly created sprite
    */
  inline def from(source: SpriteSource): typings.pixiSprite.mod.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSprite.mod.Sprite]
  inline def from(source: SpriteSource, options: IBaseTextureOptions[Any]): typings.pixiSprite.mod.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiSprite.mod.Sprite]
}
