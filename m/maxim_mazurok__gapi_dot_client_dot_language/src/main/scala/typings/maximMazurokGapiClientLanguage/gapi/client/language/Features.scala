package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features extends StObject {
  
  /** Classify the full document into categories. */
  var classifyText: js.UndefOr[Boolean] = js.undefined
  
  /** Extract document-level sentiment. */
  var extractDocumentSentiment: js.UndefOr[Boolean] = js.undefined
  
  /** Extract entities. */
  var extractEntities: js.UndefOr[Boolean] = js.undefined
  
  /** Extract entities and their associated sentiment. */
  var extractEntitySentiment: js.UndefOr[Boolean] = js.undefined
  
  /** Extract syntax information. */
  var extractSyntax: js.UndefOr[Boolean] = js.undefined
}
object Features {
  
  inline def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  
  extension [Self <: Features](x: Self) {
    
    inline def setClassifyText(value: Boolean): Self = StObject.set(x, "classifyText", value.asInstanceOf[js.Any])
    
    inline def setClassifyTextUndefined: Self = StObject.set(x, "classifyText", js.undefined)
    
    inline def setExtractDocumentSentiment(value: Boolean): Self = StObject.set(x, "extractDocumentSentiment", value.asInstanceOf[js.Any])
    
    inline def setExtractDocumentSentimentUndefined: Self = StObject.set(x, "extractDocumentSentiment", js.undefined)
    
    inline def setExtractEntities(value: Boolean): Self = StObject.set(x, "extractEntities", value.asInstanceOf[js.Any])
    
    inline def setExtractEntitiesUndefined: Self = StObject.set(x, "extractEntities", js.undefined)
    
    inline def setExtractEntitySentiment(value: Boolean): Self = StObject.set(x, "extractEntitySentiment", value.asInstanceOf[js.Any])
    
    inline def setExtractEntitySentimentUndefined: Self = StObject.set(x, "extractEntitySentiment", js.undefined)
    
    inline def setExtractSyntax(value: Boolean): Self = StObject.set(x, "extractSyntax", value.asInstanceOf[js.Any])
    
    inline def setExtractSyntaxUndefined: Self = StObject.set(x, "extractSyntax", js.undefined)
  }
}
