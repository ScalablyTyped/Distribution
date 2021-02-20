package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchHitsContainer extends StObject {
  
  var hits: js.UndefOr[NullableOption[js.Array[SearchHit]]] = js.native
  
  var moreResultsAvailable: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var total: js.UndefOr[NullableOption[Double]] = js.native
}
object SearchHitsContainer {
  
  @scala.inline
  def apply(): SearchHitsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchHitsContainer]
  }
  
  @scala.inline
  implicit class SearchHitsContainerMutableBuilder[Self <: SearchHitsContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHits(value: NullableOption[js.Array[SearchHit]]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsNull: Self = StObject.set(x, "hits", null)
    
    @scala.inline
    def setHitsUndefined: Self = StObject.set(x, "hits", js.undefined)
    
    @scala.inline
    def setHitsVarargs(value: SearchHit*): Self = StObject.set(x, "hits", js.Array(value :_*))
    
    @scala.inline
    def setMoreResultsAvailable(value: NullableOption[Boolean]): Self = StObject.set(x, "moreResultsAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreResultsAvailableNull: Self = StObject.set(x, "moreResultsAvailable", null)
    
    @scala.inline
    def setMoreResultsAvailableUndefined: Self = StObject.set(x, "moreResultsAvailable", js.undefined)
    
    @scala.inline
    def setTotal(value: NullableOption[Double]): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalNull: Self = StObject.set(x, "total", null)
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
