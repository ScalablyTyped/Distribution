package typings.pixiSpritesheet

import typings.pixiAssets.libAssetExtensionMod.AssetExtension
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.BaseTexture
import typings.pixiCore.mod.Texture
import typings.pixiSpritesheet.libSpritesheetAssetMod.SpriteSheetJson
import typings.pixiSpritesheet.libSpritesheetMod.ISpritesheetData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/spritesheet", "Spritesheet")
  @js.native
  open class Spritesheet protected ()
    extends typings.pixiSpritesheet.libSpritesheetMod.Spritesheet {
    /**
      * @param texture - Reference to the source BaseTexture object.
      * @param {object} data - Spritesheet image data.
      * @param resolutionFilename - The filename to consider when determining
      *        the resolution of the spritesheet. If not provided, the imageUrl will
      *        be used on the BaseTexture.
      */
    def this(texture: BaseTexture[Resource, IAutoDetectOptions], data: ISpritesheetData) = this()
    def this(texture: Texture[Resource], data: ISpritesheetData) = this()
    def this(
      texture: BaseTexture[Resource, IAutoDetectOptions],
      data: ISpritesheetData,
      resolutionFilename: String
    ) = this()
    def this(texture: Texture[Resource], data: ISpritesheetData, resolutionFilename: String) = this()
  }
  /* static members */
  object Spritesheet {
    
    /** The maximum number of Textures to build per process. */
    @JSImport("@pixi/spritesheet", "Spritesheet.BATCH_SIZE")
    @js.native
    val BATCH_SIZE: /* 1000 */ Double = js.native
  }
  
  @JSImport("@pixi/spritesheet", "spritesheetAsset")
  @js.native
  val spritesheetAsset: AssetExtension[typings.pixiSpritesheet.libSpritesheetMod.Spritesheet | SpriteSheetJson, Any] = js.native
}
