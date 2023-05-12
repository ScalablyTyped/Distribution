package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.Phaser.Textures.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TileSprite {
  
  trait TileSpriteConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * An optional frame from the Texture this Tile Sprite is rendering with.
      */
    var frame: js.UndefOr[Double | String | Frame] = js.undefined
    
    /**
      * The height of the Tile Sprite. If zero it will use the size of the texture frame.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The key of the Texture this Tile Sprite will use to render with, as stored in the Texture Manager.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * The width of the Tile Sprite. If zero it will use the size of the texture frame.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * The x coordinate of the Tile Sprite.
      */
    @JSName("x")
    var x_TileSpriteConfig: js.UndefOr[Double] = js.undefined
    
    /**
      * The y coordinate of the Tile Sprite.
      */
    @JSName("y")
    var y_TileSpriteConfig: js.UndefOr[Double] = js.undefined
  }
  object TileSpriteConfig {
    
    inline def apply(): TileSpriteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileSpriteConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileSpriteConfig] (val x: Self) extends AnyVal {
      
      inline def setFrame(value: Double | String | Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
