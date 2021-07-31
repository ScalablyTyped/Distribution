package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchHit extends StObject {
  
  var contentSource: js.UndefOr[NullableOption[String]] = js.undefined
  
  var hitId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var rank: js.UndefOr[NullableOption[Double]] = js.undefined
  
  var resource: js.UndefOr[NullableOption[Entity]] = js.undefined
  
  var summary: js.UndefOr[NullableOption[String]] = js.undefined
}
object SearchHit {
  
  @scala.inline
  def apply(): SearchHit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchHit]
  }
  
  @scala.inline
  implicit class SearchHitMutableBuilder[Self <: SearchHit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentSource(value: NullableOption[String]): Self = StObject.set(x, "contentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSourceNull: Self = StObject.set(x, "contentSource", null)
    
    @scala.inline
    def setContentSourceUndefined: Self = StObject.set(x, "contentSource", js.undefined)
    
    @scala.inline
    def setHitId(value: NullableOption[String]): Self = StObject.set(x, "hitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitIdNull: Self = StObject.set(x, "hitId", null)
    
    @scala.inline
    def setHitIdUndefined: Self = StObject.set(x, "hitId", js.undefined)
    
    @scala.inline
    def setRank(value: NullableOption[Double]): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankNull: Self = StObject.set(x, "rank", null)
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    @scala.inline
    def setResource(value: NullableOption[Entity]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNull: Self = StObject.set(x, "resource", null)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setSummary(value: NullableOption[String]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
