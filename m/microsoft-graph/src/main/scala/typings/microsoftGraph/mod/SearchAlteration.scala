package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAlteration extends StObject {
  
  /**
    * Defines the altered highlighted query string with spelling correction. The annotation around the corrected segment is:
    * /ue000, /ue001.
    */
  var alteredHighlightedQueryString: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Defines the altered query string with spelling correction.
  var alteredQueryString: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Represents changed segments related to an original user query.
  var alteredQueryTokens: js.UndefOr[NullableOption[js.Array[AlteredQueryToken]]] = js.undefined
}
object SearchAlteration {
  
  inline def apply(): SearchAlteration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAlteration]
  }
  
  extension [Self <: SearchAlteration](x: Self) {
    
    inline def setAlteredHighlightedQueryString(value: NullableOption[String]): Self = StObject.set(x, "alteredHighlightedQueryString", value.asInstanceOf[js.Any])
    
    inline def setAlteredHighlightedQueryStringNull: Self = StObject.set(x, "alteredHighlightedQueryString", null)
    
    inline def setAlteredHighlightedQueryStringUndefined: Self = StObject.set(x, "alteredHighlightedQueryString", js.undefined)
    
    inline def setAlteredQueryString(value: NullableOption[String]): Self = StObject.set(x, "alteredQueryString", value.asInstanceOf[js.Any])
    
    inline def setAlteredQueryStringNull: Self = StObject.set(x, "alteredQueryString", null)
    
    inline def setAlteredQueryStringUndefined: Self = StObject.set(x, "alteredQueryString", js.undefined)
    
    inline def setAlteredQueryTokens(value: NullableOption[js.Array[AlteredQueryToken]]): Self = StObject.set(x, "alteredQueryTokens", value.asInstanceOf[js.Any])
    
    inline def setAlteredQueryTokensNull: Self = StObject.set(x, "alteredQueryTokens", null)
    
    inline def setAlteredQueryTokensUndefined: Self = StObject.set(x, "alteredQueryTokens", js.undefined)
    
    inline def setAlteredQueryTokensVarargs(value: AlteredQueryToken*): Self = StObject.set(x, "alteredQueryTokens", js.Array(value*))
  }
}
