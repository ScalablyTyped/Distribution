package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aliases extends StObject {
  
  var aliases: js.UndefOr[js.Array[Topicrelation] | Null] = js.undefined
  
  /** Format: date-time */
  var created_at: String
  
  var created_by: String | Null
  
  var curated: Boolean
  
  var description: String | Null
  
  var display_name: String | Null
  
  var featured: Boolean
  
  /** Format: uri */
  var logo_url: js.UndefOr[String | Null] = js.undefined
  
  var name: String
  
  var related: js.UndefOr[js.Array[Topicrelation] | Null] = js.undefined
  
  var released: String | Null
  
  var repository_count: js.UndefOr[Double | Null] = js.undefined
  
  var score: Double
  
  var short_description: String | Null
  
  var text_matches: js.UndefOr[js.Array[Fragment]] = js.undefined
  
  /** Format: date-time */
  var updated_at: String
}
object Aliases {
  
  inline def apply(
    created_at: String,
    curated: Boolean,
    featured: Boolean,
    name: String,
    score: Double,
    updated_at: String
  ): Aliases = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], curated = curated.asInstanceOf[js.Any], featured = featured.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], created_by = null, description = null, display_name = null, released = null, short_description = null)
    __obj.asInstanceOf[Aliases]
  }
  
  extension [Self <: Aliases](x: Self) {
    
    inline def setAliases(value: js.Array[Topicrelation]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesNull: Self = StObject.set(x, "aliases", null)
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: Topicrelation*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setCreated_byNull: Self = StObject.set(x, "created_by", null)
    
    inline def setCurated(value: Boolean): Self = StObject.set(x, "curated", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameNull: Self = StObject.set(x, "display_name", null)
    
    inline def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
    
    inline def setLogo_url(value: String): Self = StObject.set(x, "logo_url", value.asInstanceOf[js.Any])
    
    inline def setLogo_urlNull: Self = StObject.set(x, "logo_url", null)
    
    inline def setLogo_urlUndefined: Self = StObject.set(x, "logo_url", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelated(value: js.Array[Topicrelation]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedNull: Self = StObject.set(x, "related", null)
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: Topicrelation*): Self = StObject.set(x, "related", js.Array(value*))
    
    inline def setReleased(value: String): Self = StObject.set(x, "released", value.asInstanceOf[js.Any])
    
    inline def setReleasedNull: Self = StObject.set(x, "released", null)
    
    inline def setRepository_count(value: Double): Self = StObject.set(x, "repository_count", value.asInstanceOf[js.Any])
    
    inline def setRepository_countNull: Self = StObject.set(x, "repository_count", null)
    
    inline def setRepository_countUndefined: Self = StObject.set(x, "repository_count", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setShort_description(value: String): Self = StObject.set(x, "short_description", value.asInstanceOf[js.Any])
    
    inline def setShort_descriptionNull: Self = StObject.set(x, "short_description", null)
    
    inline def setText_matches(value: js.Array[Fragment]): Self = StObject.set(x, "text_matches", value.asInstanceOf[js.Any])
    
    inline def setText_matchesUndefined: Self = StObject.set(x, "text_matches", js.undefined)
    
    inline def setText_matchesVarargs(value: Fragment*): Self = StObject.set(x, "text_matches", js.Array(value*))
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
