package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sentence extends StObject {
  
  /** For calls to AnalyzeSentiment or if AnnotateTextRequest.Features.extract_document_sentiment is set to true, this field will contain the sentiment for the sentence. */
  var sentiment: js.UndefOr[Sentiment] = js.native
  
  /** The sentence text. */
  var text: js.UndefOr[TextSpan] = js.native
}
object Sentence {
  
  @scala.inline
  def apply(): Sentence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sentence]
  }
  
  @scala.inline
  implicit class SentenceMutableBuilder[Self <: Sentence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSentiment(value: Sentiment): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    @scala.inline
    def setText(value: TextSpan): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
