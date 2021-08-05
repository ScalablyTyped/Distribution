package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstringMatchCriteria extends StObject {
  
  /** Indicates whether the search should respect case: - `True`: the search is case sensitive. - `False`: the search is case insensitive. */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  
  /** The text to search for in the document. */
  var text: js.UndefOr[String] = js.undefined
}
object SubstringMatchCriteria {
  
  inline def apply(): SubstringMatchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstringMatchCriteria]
  }
  
  extension [Self <: SubstringMatchCriteria](x: Self) {
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
