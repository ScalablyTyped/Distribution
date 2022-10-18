package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contributors extends StObject {
  
  var contributors: js.UndefOr[Any] = js.undefined
  
  var coordinates: js.UndefOr[Any] = js.undefined
  
  var created_at: String
  
  var entities: Hashtags
  
  var favorite_count: Double
  
  var favorited: Boolean
  
  var geo: js.UndefOr[Any] = js.undefined
  
  var id: Double
  
  var id_str: String
  
  var in_reply_to_screen_name: String
  
  var in_reply_to_status_id: Double
  
  var in_reply_to_status_id_str: String
  
  var in_reply_to_user_id: Double
  
  var in_reply_to_user_id_str: String
  
  var is_quote_status: Boolean
  
  var lang: String
  
  var place: js.UndefOr[Any] = js.undefined
  
  var retweet_count: Double
  
  var retweeted: Boolean
  
  var source: String
  
  var text: String
  
  var truncated: Boolean
}
object Contributors {
  
  inline def apply(
    created_at: String,
    entities: Hashtags,
    favorite_count: Double,
    favorited: Boolean,
    id: Double,
    id_str: String,
    in_reply_to_screen_name: String,
    in_reply_to_status_id: Double,
    in_reply_to_status_id_str: String,
    in_reply_to_user_id: Double,
    in_reply_to_user_id_str: String,
    is_quote_status: Boolean,
    lang: String,
    retweet_count: Double,
    retweeted: Boolean,
    source: String,
    text: String,
    truncated: Boolean
  ): Contributors = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], favorite_count = favorite_count.asInstanceOf[js.Any], favorited = favorited.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], in_reply_to_screen_name = in_reply_to_screen_name.asInstanceOf[js.Any], in_reply_to_status_id = in_reply_to_status_id.asInstanceOf[js.Any], in_reply_to_status_id_str = in_reply_to_status_id_str.asInstanceOf[js.Any], in_reply_to_user_id = in_reply_to_user_id.asInstanceOf[js.Any], in_reply_to_user_id_str = in_reply_to_user_id_str.asInstanceOf[js.Any], is_quote_status = is_quote_status.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], retweet_count = retweet_count.asInstanceOf[js.Any], retweeted = retweeted.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contributors]
  }
  
  extension [Self <: Contributors](x: Self) {
    
    inline def setContributors(value: Any): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
    
    inline def setCoordinates(value: Any): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEntities(value: Hashtags): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setFavorite_count(value: Double): Self = StObject.set(x, "favorite_count", value.asInstanceOf[js.Any])
    
    inline def setFavorited(value: Boolean): Self = StObject.set(x, "favorited", value.asInstanceOf[js.Any])
    
    inline def setGeo(value: Any): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
    
    inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_screen_name(value: String): Self = StObject.set(x, "in_reply_to_screen_name", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_status_id(value: Double): Self = StObject.set(x, "in_reply_to_status_id", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_status_id_str(value: String): Self = StObject.set(x, "in_reply_to_status_id_str", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_user_id(value: Double): Self = StObject.set(x, "in_reply_to_user_id", value.asInstanceOf[js.Any])
    
    inline def setIn_reply_to_user_id_str(value: String): Self = StObject.set(x, "in_reply_to_user_id_str", value.asInstanceOf[js.Any])
    
    inline def setIs_quote_status(value: Boolean): Self = StObject.set(x, "is_quote_status", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setPlace(value: Any): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
    
    inline def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
    
    inline def setRetweet_count(value: Double): Self = StObject.set(x, "retweet_count", value.asInstanceOf[js.Any])
    
    inline def setRetweeted(value: Boolean): Self = StObject.set(x, "retweeted", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
  }
}
