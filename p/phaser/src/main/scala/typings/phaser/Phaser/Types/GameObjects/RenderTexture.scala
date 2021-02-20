package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RenderTexture {
  
  @js.native
  trait RenderTextureConfig extends StObject {
    
    /**
      * the frame to make the RenderTexture from.
      */
    var frame: js.UndefOr[String] = js.native
    
    /**
      * The height of the RenderTexture.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * The texture key to make the RenderTexture from.
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * The width of the RenderTexture.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * The x coordinate of the RenderTextures position.
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * The y coordinate of the RenderTextures position.
      */
    var y: js.UndefOr[Double] = js.native
  }
  object RenderTextureConfig {
    
    @scala.inline
    def apply(): RenderTextureConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderTextureConfig]
    }
    
    @scala.inline
    implicit class RenderTextureConfigMutableBuilder[Self <: RenderTextureConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
