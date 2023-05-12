package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.Phaser.Textures.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plane {
  
  trait PlaneCheckerboardConfig extends StObject {
    
    /**
      * The odd cell alpha value, specified as a number between 0 and 255.
      */
    var alpha1: js.UndefOr[Double] = js.undefined
    
    /**
      * The even cell alpha value, specified as a number between 0 and 255.
      */
    var alpha2: js.UndefOr[Double] = js.undefined
    
    /**
      * The odd cell color, specified as a hex value.
      */
    var color1: js.UndefOr[Double] = js.undefined
    
    /**
      * The even cell color, specified as a hex value.
      */
    var color2: js.UndefOr[Double] = js.undefined
    
    /**
      * The view height of the Plane after creation, in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
  }
  object PlaneCheckerboardConfig {
    
    inline def apply(): PlaneCheckerboardConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaneCheckerboardConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlaneCheckerboardConfig] (val x: Self) extends AnyVal {
      
      inline def setAlpha1(value: Double): Self = StObject.set(x, "alpha1", value.asInstanceOf[js.Any])
      
      inline def setAlpha1Undefined: Self = StObject.set(x, "alpha1", js.undefined)
      
      inline def setAlpha2(value: Double): Self = StObject.set(x, "alpha2", value.asInstanceOf[js.Any])
      
      inline def setAlpha2Undefined: Self = StObject.set(x, "alpha2", js.undefined)
      
      inline def setColor1(value: Double): Self = StObject.set(x, "color1", value.asInstanceOf[js.Any])
      
      inline def setColor1Undefined: Self = StObject.set(x, "color1", js.undefined)
      
      inline def setColor2(value: Double): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
      
      inline def setColor2Undefined: Self = StObject.set(x, "color2", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    }
  }
  
  trait PlaneConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * Plane checkerboard configuration object.
      */
    var checkerboard: js.UndefOr[PlaneCheckerboardConfig] = js.undefined
    
    /**
      * An optional frame from the Texture this Game Object is rendering with.
      */
    var frame: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The height of this Plane, in cells, not pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      */
    var key: js.UndefOr[String | Texture] = js.undefined
    
    /**
      * Is the texture tiled? I.e. repeated across each cell.
      */
    var tile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The width of this Plane, in cells, not pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PlaneConfig {
    
    inline def apply(): PlaneConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaneConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlaneConfig] (val x: Self) extends AnyVal {
      
      inline def setCheckerboard(value: PlaneCheckerboardConfig): Self = StObject.set(x, "checkerboard", value.asInstanceOf[js.Any])
      
      inline def setCheckerboardUndefined: Self = StObject.set(x, "checkerboard", js.undefined)
      
      inline def setFrame(value: String | Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setKey(value: String | Texture): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTile(value: Boolean): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
      
      inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
