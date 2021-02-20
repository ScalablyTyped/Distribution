package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Features extends StObject {
  
  /** Classify the full document into categories. */
  var classifyText: js.UndefOr[Boolean] = js.native
  
  /** Extract document-level sentiment. */
  var extractDocumentSentiment: js.UndefOr[Boolean] = js.native
  
  /** Extract entities. */
  var extractEntities: js.UndefOr[Boolean] = js.native
  
  /** Extract entities and their associated sentiment. */
  var extractEntitySentiment: js.UndefOr[Boolean] = js.native
  
  /** Extract syntax information. */
  var extractSyntax: js.UndefOr[Boolean] = js.native
}
object Features {
  
  @scala.inline
  def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  
  @scala.inline
  implicit class FeaturesMutableBuilder[Self <: Features] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifyText(value: Boolean): Self = StObject.set(x, "classifyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifyTextUndefined: Self = StObject.set(x, "classifyText", js.undefined)
    
    @scala.inline
    def setExtractDocumentSentiment(value: Boolean): Self = StObject.set(x, "extractDocumentSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractDocumentSentimentUndefined: Self = StObject.set(x, "extractDocumentSentiment", js.undefined)
    
    @scala.inline
    def setExtractEntities(value: Boolean): Self = StObject.set(x, "extractEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractEntitiesUndefined: Self = StObject.set(x, "extractEntities", js.undefined)
    
    @scala.inline
    def setExtractEntitySentiment(value: Boolean): Self = StObject.set(x, "extractEntitySentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractEntitySentimentUndefined: Self = StObject.set(x, "extractEntitySentiment", js.undefined)
    
    @scala.inline
    def setExtractSyntax(value: Boolean): Self = StObject.set(x, "extractSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractSyntaxUndefined: Self = StObject.set(x, "extractSyntax", js.undefined)
  }
}
