package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityMention extends StObject {
  
  /**
    * For calls to AnalyzeEntitySentiment or if AnnotateTextRequest.Features.extract_entity_sentiment is set to true, this field will contain the sentiment expressed for this mention of
    * the entity in the provided document.
    */
  var sentiment: js.UndefOr[Sentiment] = js.undefined
  
  /** The mention text. */
  var text: js.UndefOr[TextSpan] = js.undefined
  
  /** The type of the entity mention. */
  var `type`: js.UndefOr[String] = js.undefined
}
object EntityMention {
  
  inline def apply(): EntityMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityMention]
  }
  
  extension [Self <: EntityMention](x: Self) {
    
    inline def setSentiment(value: Sentiment): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    inline def setText(value: TextSpan): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
