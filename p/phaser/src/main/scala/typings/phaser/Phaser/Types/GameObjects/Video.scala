package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Video {
  
  trait VideoConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * Optional key of the Video this Game Object will play, as stored in the Video Cache.
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object VideoConfig {
    
    inline def apply(): VideoConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VideoConfig] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
