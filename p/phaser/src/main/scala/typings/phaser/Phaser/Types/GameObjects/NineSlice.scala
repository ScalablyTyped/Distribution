package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.Phaser.Textures.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NineSlice {
  
  trait NineSliceConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * The size of the bottom horiztonal row (D). Set to zero or undefined to create a 3 slice object.
      */
    var bottomHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional frame from the Texture this Game Object is rendering with.
      */
    var frame: js.UndefOr[String | Double] = js.undefined
    
    /**
      * The height of the Nine Slice Game Object. If this is a 3 slice object the height will be fixed to the height of the texture and cannot be changed.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
      */
    var key: js.UndefOr[String | Texture] = js.undefined
    
    /**
      * The size of the left vertical column (A).
      */
    var leftWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The size of the right vertical column (B).
      */
    var rightWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The size of the top horiztonal row (C). Set to zero or undefined to create a 3 slice object.
      */
    var topHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of the Nine Slice Game Object. You can adjust the width post-creation.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object NineSliceConfig {
    
    inline def apply(): NineSliceConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NineSliceConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NineSliceConfig] (val x: Self) extends AnyVal {
      
      inline def setBottomHeight(value: Double): Self = StObject.set(x, "bottomHeight", value.asInstanceOf[js.Any])
      
      inline def setBottomHeightUndefined: Self = StObject.set(x, "bottomHeight", js.undefined)
      
      inline def setFrame(value: String | Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setKey(value: String | Texture): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLeftWidth(value: Double): Self = StObject.set(x, "leftWidth", value.asInstanceOf[js.Any])
      
      inline def setLeftWidthUndefined: Self = StObject.set(x, "leftWidth", js.undefined)
      
      inline def setRightWidth(value: Double): Self = StObject.set(x, "rightWidth", value.asInstanceOf[js.Any])
      
      inline def setRightWidthUndefined: Self = StObject.set(x, "rightWidth", js.undefined)
      
      inline def setTopHeight(value: Double): Self = StObject.set(x, "topHeight", value.asInstanceOf[js.Any])
      
      inline def setTopHeightUndefined: Self = StObject.set(x, "topHeight", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
