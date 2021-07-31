package typings.phaser.Phaser.Types.GameObjects

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
    var frame: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object SpriteConfig {
    
    @scala.inline
    def apply(): SpriteConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpriteConfig]
    }
    
    @scala.inline
    implicit class SpriteConfigMutableBuilder[Self <: SpriteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrame(value: Double | String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
