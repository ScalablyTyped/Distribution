package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  /** The number of achievements visible to the currently authenticated player. */
  var achievement_count: js.UndefOr[Double] = js.undefined
  
  /** The assets of the application. */
  var assets: js.UndefOr[js.Array[ImageAsset]] = js.undefined
  
  /** The author of the application. */
  var author: js.UndefOr[String] = js.undefined
  
  /** The category of the application. */
  var category: js.UndefOr[ApplicationCategory] = js.undefined
  
  /** The description of the application. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A list of features that have been enabled for the application. */
  var enabledFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The ID of the application. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The instances of the application. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#application`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The last updated timestamp of the application. */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.undefined
  
  /** The number of leaderboards visible to the currently authenticated player. */
  var leaderboard_count: js.UndefOr[Double] = js.undefined
  
  /** The name of the application. */
  var name: js.UndefOr[String] = js.undefined
  
  /** A hint to the client UI for what color to use as an app-themed color. The color is given as an RGB triplet (e.g. "E0E0E0"). */
  var themeColor: js.UndefOr[String] = js.undefined
}
object Application {
  
  inline def apply(): Application = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    inline def setAchievement_count(value: Double): Self = StObject.set(x, "achievement_count", value.asInstanceOf[js.Any])
    
    inline def setAchievement_countUndefined: Self = StObject.set(x, "achievement_count", js.undefined)
    
    inline def setAssets(value: js.Array[ImageAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: ImageAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCategory(value: ApplicationCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabledFeatures(value: js.Array[String]): Self = StObject.set(x, "enabledFeatures", value.asInstanceOf[js.Any])
    
    inline def setEnabledFeaturesUndefined: Self = StObject.set(x, "enabledFeatures", js.undefined)
    
    inline def setEnabledFeaturesVarargs(value: String*): Self = StObject.set(x, "enabledFeatures", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstances(value: js.Array[Instance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: String): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
    
    inline def setLeaderboard_count(value: Double): Self = StObject.set(x, "leaderboard_count", value.asInstanceOf[js.Any])
    
    inline def setLeaderboard_countUndefined: Self = StObject.set(x, "leaderboard_count", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
