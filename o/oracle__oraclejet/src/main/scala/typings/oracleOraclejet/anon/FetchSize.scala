package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchSize extends StObject {
  
  var fetchSize: js.UndefOr[Double] = js.native
  
  var maxCount: js.UndefOr[Double] = js.native
  
  var scroller: js.UndefOr[typings.std.Element] = js.native
}
object FetchSize {
  
  @scala.inline
  def apply(): FetchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchSize]
  }
  
  @scala.inline
  implicit class FetchSizeMutableBuilder[Self <: FetchSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchSizeUndefined: Self = StObject.set(x, "fetchSize", js.undefined)
    
    @scala.inline
    def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
    
    @scala.inline
    def setScroller(value: typings.std.Element): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollerUndefined: Self = StObject.set(x, "scroller", js.undefined)
  }
}
