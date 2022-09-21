package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeEntitiesResponse extends StObject {
  
  /** The union of all the candidate entities that the entity_mentions in this response could link to. These are UMLS concepts or normalized mention content. */
  var entities: js.UndefOr[js.Array[Entity]] = js.undefined
  
  /** entity_mentions contains all the annotated medical entities that were mentioned in the provided document. */
  var entityMentions: js.UndefOr[js.Array[EntityMention]] = js.undefined
  
  /** relationships contains all the binary relationships that were identified between entity mentions within the provided document. */
  var relationships: js.UndefOr[js.Array[EntityMentionRelationship]] = js.undefined
}
object AnalyzeEntitiesResponse {
  
  inline def apply(): AnalyzeEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeEntitiesResponse]
  }
  
  extension [Self <: AnalyzeEntitiesResponse](x: Self) {
    
    inline def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value*))
    
    inline def setEntityMentions(value: js.Array[EntityMention]): Self = StObject.set(x, "entityMentions", value.asInstanceOf[js.Any])
    
    inline def setEntityMentionsUndefined: Self = StObject.set(x, "entityMentions", js.undefined)
    
    inline def setEntityMentionsVarargs(value: EntityMention*): Self = StObject.set(x, "entityMentions", js.Array(value*))
    
    inline def setRelationships(value: js.Array[EntityMentionRelationship]): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    inline def setRelationshipsVarargs(value: EntityMentionRelationship*): Self = StObject.set(x, "relationships", js.Array(value*))
  }
}
