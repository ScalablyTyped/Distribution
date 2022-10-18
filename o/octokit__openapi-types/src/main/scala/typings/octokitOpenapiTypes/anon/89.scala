package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `89` extends StObject {
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
}
object `89` {
  
  inline def apply(): `89` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`89`]
  }
  
  extension [Self <: `89`](x: Self) {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
