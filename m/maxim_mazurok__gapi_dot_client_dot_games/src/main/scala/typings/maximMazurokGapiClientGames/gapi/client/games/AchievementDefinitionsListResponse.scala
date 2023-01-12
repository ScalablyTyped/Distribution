package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchievementDefinitionsListResponse extends StObject {
  
  /** The achievement definitions. */
  var items: js.UndefOr[js.Array[AchievementDefinition]] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#achievementDefinitionsListResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object AchievementDefinitionsListResponse {
  
  inline def apply(): AchievementDefinitionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementDefinitionsListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AchievementDefinitionsListResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[AchievementDefinition]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: AchievementDefinition*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
