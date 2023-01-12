package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlossaryTermsPair extends StObject {
  
  /** The source term is the term that will get match in the text, */
  var sourceTerm: js.UndefOr[GlossaryTerm] = js.undefined
  
  /** The term that will replace the match source term. */
  var targetTerm: js.UndefOr[GlossaryTerm] = js.undefined
}
object GlossaryTermsPair {
  
  inline def apply(): GlossaryTermsPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlossaryTermsPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlossaryTermsPair] (val x: Self) extends AnyVal {
    
    inline def setSourceTerm(value: GlossaryTerm): Self = StObject.set(x, "sourceTerm", value.asInstanceOf[js.Any])
    
    inline def setSourceTermUndefined: Self = StObject.set(x, "sourceTerm", js.undefined)
    
    inline def setTargetTerm(value: GlossaryTerm): Self = StObject.set(x, "targetTerm", value.asInstanceOf[js.Any])
    
    inline def setTargetTermUndefined: Self = StObject.set(x, "targetTerm", js.undefined)
  }
}
