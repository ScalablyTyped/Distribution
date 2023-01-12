package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxImageCacheCount extends StObject {
  
  var maxImageCacheCount: js.UndefOr[Double] = js.undefined
}
object MaxImageCacheCount {
  
  inline def apply(): MaxImageCacheCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxImageCacheCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxImageCacheCount] (val x: Self) extends AnyVal {
    
    inline def setMaxImageCacheCount(value: Double): Self = StObject.set(x, "maxImageCacheCount", value.asInstanceOf[js.Any])
    
    inline def setMaxImageCacheCountUndefined: Self = StObject.set(x, "maxImageCacheCount", js.undefined)
  }
}
