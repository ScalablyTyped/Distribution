package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhraseSetResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The phrase set. */
  var phraseSets: js.UndefOr[js.Array[PhraseSet]] = js.undefined
}
object ListPhraseSetResponse {
  
  inline def apply(): ListPhraseSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhraseSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPhraseSetResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPhraseSets(value: js.Array[PhraseSet]): Self = StObject.set(x, "phraseSets", value.asInstanceOf[js.Any])
    
    inline def setPhraseSetsUndefined: Self = StObject.set(x, "phraseSets", js.undefined)
    
    inline def setPhraseSetsVarargs(value: PhraseSet*): Self = StObject.set(x, "phraseSets", js.Array(value*))
  }
}
