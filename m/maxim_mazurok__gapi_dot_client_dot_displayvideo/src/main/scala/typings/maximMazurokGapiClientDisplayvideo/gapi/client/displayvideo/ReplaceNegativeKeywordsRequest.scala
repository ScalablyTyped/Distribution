package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceNegativeKeywordsRequest extends StObject {
  
  /** The negative keywords that will replace the existing keywords in the negative keyword list, specified as a list of NegativeKeywords. */
  var newNegativeKeywords: js.UndefOr[js.Array[NegativeKeyword]] = js.undefined
}
object ReplaceNegativeKeywordsRequest {
  
  inline def apply(): ReplaceNegativeKeywordsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceNegativeKeywordsRequest]
  }
  
  extension [Self <: ReplaceNegativeKeywordsRequest](x: Self) {
    
    inline def setNewNegativeKeywords(value: js.Array[NegativeKeyword]): Self = StObject.set(x, "newNegativeKeywords", value.asInstanceOf[js.Any])
    
    inline def setNewNegativeKeywordsUndefined: Self = StObject.set(x, "newNegativeKeywords", js.undefined)
    
    inline def setNewNegativeKeywordsVarargs(value: NegativeKeyword*): Self = StObject.set(x, "newNegativeKeywords", js.Array(value*))
  }
}
