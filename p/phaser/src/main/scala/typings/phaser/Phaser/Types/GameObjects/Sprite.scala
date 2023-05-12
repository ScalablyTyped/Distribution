package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.Phaser.Textures.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sprite {
  
  trait SpriteConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * An optional frame from the Texture this Game Object is rendering with.
      */
    var frame: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      */
    var key: js.UndefOr[String | Texture] = js.undefined
  }
  object SpriteConfig {
    
    inline def apply(): SpriteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpriteConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpriteConfig] (val x: Self) extends AnyVal {
      
      inline def setFrame(value: String | Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setKey(value: String | Texture): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
