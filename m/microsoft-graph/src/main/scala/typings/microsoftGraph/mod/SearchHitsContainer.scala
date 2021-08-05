package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchHitsContainer extends StObject {
  
  var hits: js.UndefOr[NullableOption[js.Array[SearchHit]]] = js.undefined
  
  var moreResultsAvailable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var total: js.UndefOr[NullableOption[Double]] = js.undefined
}
object SearchHitsContainer {
  
  inline def apply(): SearchHitsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchHitsContainer]
  }
  
  extension [Self <: SearchHitsContainer](x: Self) {
    
    inline def setHits(value: NullableOption[js.Array[SearchHit]]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsNull: Self = StObject.set(x, "hits", null)
    
    inline def setHitsUndefined: Self = StObject.set(x, "hits", js.undefined)
    
    inline def setHitsVarargs(value: SearchHit*): Self = StObject.set(x, "hits", js.Array(value :_*))
    
    inline def setMoreResultsAvailable(value: NullableOption[Boolean]): Self = StObject.set(x, "moreResultsAvailable", value.asInstanceOf[js.Any])
    
    inline def setMoreResultsAvailableNull: Self = StObject.set(x, "moreResultsAvailable", null)
    
    inline def setMoreResultsAvailableUndefined: Self = StObject.set(x, "moreResultsAvailable", js.undefined)
    
    inline def setTotal(value: NullableOption[Double]): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalNull: Self = StObject.set(x, "total", null)
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
