package typings.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxImageCacheCount extends StObject {
  
  var maxImageCacheCount: js.UndefOr[Double] = js.native
}
object MaxImageCacheCount {
  
  @scala.inline
  def apply(): MaxImageCacheCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxImageCacheCount]
  }
  
  @scala.inline
  implicit class MaxImageCacheCountMutableBuilder[Self <: MaxImageCacheCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxImageCacheCount(value: Double): Self = StObject.set(x, "maxImageCacheCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxImageCacheCountUndefined: Self = StObject.set(x, "maxImageCacheCount", js.undefined)
  }
}
