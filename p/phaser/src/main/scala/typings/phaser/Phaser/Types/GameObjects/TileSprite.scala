package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.integer
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
    var frame: js.UndefOr[String] = js.undefined
    
    /**
      * The height of the Tile Sprite. If zero it will use the size of the texture frame.
      */
    var height: js.UndefOr[integer] = js.undefined
    
    /**
      * The key of the Texture this Tile Sprite will use to render with, as stored in the Texture Manager.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * The width of the Tile Sprite. If zero it will use the size of the texture frame.
      */
    var width: js.UndefOr[integer] = js.undefined
  }
  object TileSpriteConfig {
    
    @scala.inline
    def apply(): TileSpriteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileSpriteConfig]
    }
    
    @scala.inline
    implicit class TileSpriteConfigMutableBuilder[Self <: TileSpriteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
