package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlossaryEntry extends StObject {
  
  /** Describes the glossary entry. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Required. The resource name of the entry. Format: "projects/ *‍/locations/ *‍/glossaries/ *‍/glossaryEntries/ *" */
  var name: js.UndefOr[String] = js.undefined
  
  /** Used for an unidirectional glossary. */
  var termsPair: js.UndefOr[GlossaryTermsPair] = js.undefined
  
  /** Used for an equivalent term sets glossary. */
  var termsSet: js.UndefOr[GlossaryTermsSet] = js.undefined
}
object GlossaryEntry {
  
  inline def apply(): GlossaryEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlossaryEntry]
  }
  
  extension [Self <: GlossaryEntry](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTermsPair(value: GlossaryTermsPair): Self = StObject.set(x, "termsPair", value.asInstanceOf[js.Any])
    
    inline def setTermsPairUndefined: Self = StObject.set(x, "termsPair", js.undefined)
    
    inline def setTermsSet(value: GlossaryTermsSet): Self = StObject.set(x, "termsSet", value.asInstanceOf[js.Any])
    
    inline def setTermsSetUndefined: Self = StObject.set(x, "termsSet", js.undefined)
  }
}
