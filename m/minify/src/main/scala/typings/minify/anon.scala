package typings.minify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MaxSize extends StObject {
    
    /**
      * bigger images are not base64 in the CSS
      * @default 4096
      */
    var maxSize: js.UndefOr[Double] = js.undefined
  }
  object MaxSize {
    
    inline def apply(): MaxSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxSize]
    }
    
    extension [Self <: MaxSize](x: Self) {
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    }
  }
}
