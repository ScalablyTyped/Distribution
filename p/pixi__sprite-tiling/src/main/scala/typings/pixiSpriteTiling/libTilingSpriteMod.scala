package typings.pixiSpriteTiling

import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.libTexturesTextureMod.TextureSource
import typings.pixiCore.mod.ObservablePoint
import typings.pixiCore.mod.Texture
import typings.pixiCore.mod.TextureMatrix
import typings.pixiCore.mod.Transform
import typings.pixiMath.libIpointdataMod.IPointData
import typings.pixiMath.mod.ISize
import typings.pixiSprite.mod.Sprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTilingSpriteMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.TilingSprite * / any */ @JSImport("@pixi/sprite-tiling/lib/TilingSprite", "TilingSprite")
  @js.native
  open class TilingSprite protected () extends Sprite {
    /**
      * Note: The wrap mode of the texture is forced to REPEAT on render if the size of the texture
      * is a power of two, the texture's wrap mode is CLAMP, and the texture hasn't been bound yet.
      * @param texture - The texture of the tiling sprite.
      * @param width - The width of the tiling sprite.
      * @param height - The height of the tiling sprite.
      */
    def this(texture: Texture[Resource]) = this()
    def this(texture: Texture[Resource], width: Double) = this()
    def this(texture: Texture[Resource], width: Double, height: Double) = this()
    def this(texture: Texture[Resource], width: Unit, height: Double) = this()
    
    /**
      * Changes frame clamping in corresponding textureTransform, shortcut
      * Change to -0.5 to add a pixel to the edge, recommended for transparent trimmed textures in atlas
      * @default 0.5
      * @member {number}
      */
    def clampMargin: Double = js.native
    def clampMargin_=(value: Double): Unit = js.native
    
    /** The offset of the image that is being tiled. */
    def tilePosition: ObservablePoint[Any] = js.native
    def tilePosition_=(value: ObservablePoint[Any]): Unit = js.native
    
    /** The scaling of the image that is being tiled. */
    def tileScale: ObservablePoint[Any] = js.native
    def tileScale_=(value: IPointData): Unit = js.native
    
    /** Tile transform */
    var tileTransform: Transform = js.native
    
    /** Matrix that is applied to UV to get the coords in Texture normalized space to coords in BaseTexture space. */
    var uvMatrix: TextureMatrix = js.native
    
    /**
      * Flags whether the tiling pattern should originate from the origin instead of the top-left corner in
      * local space.
      *
      * This will make the texture coordinates assigned to each vertex dependent on the value of the anchor. Without
      * this, the top-left corner always gets the (0, 0) texture coordinate.
      * @default false
      */
    var uvRespectAnchor: Boolean = js.native
  }
  /* static members */
  object TilingSprite {
    
    @JSImport("@pixi/sprite-tiling/lib/TilingSprite", "TilingSprite")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Helper function that creates a new tiling sprite based on the source you provide.
      * The source can be - frame id, image url, video url, canvas element, video element, base texture
      * @static
      * @param {string|PIXI.Texture|HTMLCanvasElement|HTMLVideoElement} source - Source to create texture from
      * @param {object} options - See {@link PIXI.BaseTexture}'s constructor for options.
      * @param {number} options.width - required width of the tiling sprite
      * @param {number} options.height - required height of the tiling sprite
      * @returns {PIXI.TilingSprite} The newly created texture
      */
    inline def from(source: TextureSource, options: ISize & IBaseTextureOptions[Any]): TilingSprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TilingSprite]
    inline def from(source: Texture[Resource], options: ISize & IBaseTextureOptions[Any]): TilingSprite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TilingSprite]
  }
}
