package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchSize extends StObject {
  
  var fetchSize: js.UndefOr[Double] = js.undefined
  
  var maxCount: js.UndefOr[Double] = js.undefined
  
  var scroller: js.UndefOr[typings.std.Element] = js.undefined
}
object FetchSize {
  
  inline def apply(): FetchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchSize]
  }
  
  extension [Self <: FetchSize](x: Self) {
    
    inline def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
    
    inline def setFetchSizeUndefined: Self = StObject.set(x, "fetchSize", js.undefined)
    
    inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
    
    inline def setScroller(value: typings.std.Element): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
    
    inline def setScrollerUndefined: Self = StObject.set(x, "scroller", js.undefined)
  }
}
