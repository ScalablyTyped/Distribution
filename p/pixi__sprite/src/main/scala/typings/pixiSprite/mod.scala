package typings.pixiSprite

import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiSprite.libSpriteMod.SpriteSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/sprite", "Sprite")
  @js.native
  /** @param texture - The texture for this sprite. */
  open class Sprite ()
    extends typings.pixiSprite.libSpriteMod.Sprite {
    def this(texture: Texture[Resource]) = this()
  }
  /* static members */
  object Sprite {
    
    @JSImport("@pixi/sprite", "Sprite")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper function that creates a new sprite based on the source you provide.
      * The source can be - frame id, image url, video url, canvas element, video element, base texture
      * @param {string|PIXI.Texture|HTMLImageElement|HTMLVideoElement|ImageBitmap|PIXI.ICanvas} source
      *     - Source to create texture from
      * @param {object} [options] - See {@link PIXI.BaseTexture}'s constructor for options.
      * @returns The newly created sprite
      */
    inline def from(source: SpriteSource): typings.pixiSprite.libSpriteMod.Sprite = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any]).asInstanceOf[typings.pixiSprite.libSpriteMod.Sprite]
    inline def from(source: SpriteSource, options: IBaseTextureOptions[Any]): typings.pixiSprite.libSpriteMod.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.pixiSprite.libSpriteMod.Sprite]
  }
}
