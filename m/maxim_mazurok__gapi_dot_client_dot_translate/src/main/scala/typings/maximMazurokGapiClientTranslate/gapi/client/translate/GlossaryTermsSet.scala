package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlossaryTermsSet extends StObject {
  
  /** Each term in the set represents a term that can be replaced by the other terms. */
  var terms: js.UndefOr[js.Array[GlossaryTerm]] = js.undefined
}
object GlossaryTermsSet {
  
  inline def apply(): GlossaryTermsSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlossaryTermsSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlossaryTermsSet] (val x: Self) extends AnyVal {
    
    inline def setTerms(value: js.Array[GlossaryTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsUndefined: Self = StObject.set(x, "terms", js.undefined)
    
    inline def setTermsVarargs(value: GlossaryTerm*): Self = StObject.set(x, "terms", js.Array(value*))
  }
}
