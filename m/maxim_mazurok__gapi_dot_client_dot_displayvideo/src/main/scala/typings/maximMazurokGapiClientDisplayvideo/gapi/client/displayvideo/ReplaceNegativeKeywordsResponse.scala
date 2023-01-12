package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceNegativeKeywordsResponse extends StObject {
  
  /** The full list of negative keywords now present in the negative keyword list. */
  var negativeKeywords: js.UndefOr[js.Array[NegativeKeyword]] = js.undefined
}
object ReplaceNegativeKeywordsResponse {
  
  inline def apply(): ReplaceNegativeKeywordsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceNegativeKeywordsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplaceNegativeKeywordsResponse] (val x: Self) extends AnyVal {
    
    inline def setNegativeKeywords(value: js.Array[NegativeKeyword]): Self = StObject.set(x, "negativeKeywords", value.asInstanceOf[js.Any])
    
    inline def setNegativeKeywordsUndefined: Self = StObject.set(x, "negativeKeywords", js.undefined)
    
    inline def setNegativeKeywordsVarargs(value: NegativeKeyword*): Self = StObject.set(x, "negativeKeywords", js.Array(value*))
  }
}
