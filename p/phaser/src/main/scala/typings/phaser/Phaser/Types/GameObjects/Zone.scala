package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Zone {
  
  trait ZoneConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * The height of the Game Object.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of the Game Object.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ZoneConfig {
    
    inline def apply(): ZoneConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoneConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoneConfig] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
