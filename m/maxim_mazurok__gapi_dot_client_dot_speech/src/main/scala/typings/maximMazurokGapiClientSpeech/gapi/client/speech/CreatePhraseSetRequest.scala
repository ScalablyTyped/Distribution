package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePhraseSetRequest extends StObject {
  
  /** Required. The phrase set to create. */
  var phraseSet: js.UndefOr[PhraseSet] = js.undefined
  
  /**
    * Required. The ID to use for the phrase set, which will become the final component of the phrase set's resource name. This value should restrict to letters, numbers, and hyphens,
    * with the first character a letter, the last a letter or a number, and be 4-63 characters.
    */
  var phraseSetId: js.UndefOr[String] = js.undefined
}
object CreatePhraseSetRequest {
  
  inline def apply(): CreatePhraseSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePhraseSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePhraseSetRequest] (val x: Self) extends AnyVal {
    
    inline def setPhraseSet(value: PhraseSet): Self = StObject.set(x, "phraseSet", value.asInstanceOf[js.Any])
    
    inline def setPhraseSetId(value: String): Self = StObject.set(x, "phraseSetId", value.asInstanceOf[js.Any])
    
    inline def setPhraseSetIdUndefined: Self = StObject.set(x, "phraseSetId", js.undefined)
    
    inline def setPhraseSetUndefined: Self = StObject.set(x, "phraseSet", js.undefined)
  }
}
