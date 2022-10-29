package typings.pixiSpritesheet

import typings.pixiAssets.libAssetExtensionMod.AssetExtension
import typings.pixiSpritesheet.anon.Image
import typings.pixiSpritesheet.libSpritesheetMod.ISpritesheetData
import typings.pixiSpritesheet.libSpritesheetMod.ISpritesheetFrameData
import typings.pixiSpritesheet.libSpritesheetMod.Spritesheet
import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpritesheetAssetMod {
  
  @JSImport("@pixi/spritesheet/lib/spritesheetAsset", "spritesheetAsset")
  @js.native
  val spritesheetAsset: AssetExtension[Spritesheet | SpriteSheetJson, Any] = js.native
  
  trait SpriteSheetJson
    extends StObject
       with ISpritesheetData {
    
    @JSName("meta")
    var meta_SpriteSheetJson: Image
  }
  object SpriteSheetJson {
    
    inline def apply(frames: Dict[ISpritesheetFrameData], meta: Image): SpriteSheetJson = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpriteSheetJson]
    }
    
    extension [Self <: SpriteSheetJson](x: Self) {
      
      inline def setMeta(value: Image): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
