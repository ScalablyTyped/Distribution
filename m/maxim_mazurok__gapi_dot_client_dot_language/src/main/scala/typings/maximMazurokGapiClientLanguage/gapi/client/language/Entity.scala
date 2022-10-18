package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity extends StObject {
  
  /** The mentions of this entity in the input document. The API currently supports proper noun mentions. */
  var mentions: js.UndefOr[js.Array[EntityMention]] = js.undefined
  
  /**
    * Metadata associated with the entity. For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`) and Knowledge Graph MID (`mid`), if they are available. For the
    * metadata associated with other entity types, see the Type table below.
    */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The representative name for the entity. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The salience score associated with the entity in the [0, 1.0] range. The salience score for an entity provides information about the importance or centrality of that entity to the
    * entire document text. Scores closer to 0 are less salient, while scores closer to 1.0 are highly salient.
    */
  var salience: js.UndefOr[Double] = js.undefined
  
  /**
    * For calls to AnalyzeEntitySentiment or if AnnotateTextRequest.Features.extract_entity_sentiment is set to true, this field will contain the aggregate sentiment expressed for this
    * entity in the provided document.
    */
  var sentiment: js.UndefOr[Sentiment] = js.undefined
  
  /** The entity type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Entity {
  
  inline def apply(): Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entity]
  }
  
  extension [Self <: Entity](x: Self) {
    
    inline def setMentions(value: js.Array[EntityMention]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setMentionsVarargs(value: EntityMention*): Self = StObject.set(x, "mentions", js.Array(value*))
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSalience(value: Double): Self = StObject.set(x, "salience", value.asInstanceOf[js.Any])
    
    inline def setSalienceUndefined: Self = StObject.set(x, "salience", js.undefined)
    
    inline def setSentiment(value: Sentiment): Self = StObject.set(x, "sentiment", value.asInstanceOf[js.Any])
    
    inline def setSentimentUndefined: Self = StObject.set(x, "sentiment", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
