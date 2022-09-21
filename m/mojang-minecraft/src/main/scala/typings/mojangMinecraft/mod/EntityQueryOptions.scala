package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityQueryOptions extends StObject {
  
  /**
    * Limits the number of entities to return, opting for the
    * closest N entities as specified by this property. The
    * location value must also be specified on the query options
    * object.
    */
  var closest: js.UndefOr[Double] = js.undefined
  
  /**
    * Excludes entities that match one or more of the specified
    * families.
    */
  var excludeFamilies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Excludes entities if have a specific gamemode that matches
    * the specified gamemode.
    */
  var excludeGameModes: js.UndefOr[js.Array[GameMode]] = js.undefined
  
  /**
    * Excludes entities that have a name that match one of the
    * specified values.
    */
  var excludeNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Excludes entities with a tag that matches one of the
    * specified values.
    */
  var excludeTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Excludes entities if they are one of the specified types.
    */
  var excludeTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If specified, includes entities that match all of the
    * specified families.
    */
  var families: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Limits the number of entities to return, opting for the
    * farthest N entities as specified by this property. The
    * location value must also be specified on the query options
    * object.
    */
  var farthest: js.UndefOr[Double] = js.undefined
  
  /**
    * If specified, includes entities with a gamemode that matches
    * the specified gamemode.
    */
  var gameMode: js.UndefOr[GameMode] = js.undefined
  
  /**
    * Adds a seed location to the query that is used in
    * conjunction with closest, farthest, limit, volume, and
    * distance properties.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    * If specified, includes entities that are less than this
    * distance away from the location specified in the location
    * property.
    */
  var maxDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * If specified, will only include entities that have at most
    * this horizontal rotation.
    */
  var maxHorizontalRotation: js.UndefOr[Double] = js.undefined
  
  /**
    * If defined, only players that have at most this level are
    * returned.
    */
  var maxLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * If specified, only entities that have at most this vertical
    * rotation are returned.
    */
  var maxVerticalRotation: js.UndefOr[Double] = js.undefined
  
  /**
    * If specified, includes entities that are least this distance
    * away from the location specified in the location property.
    */
  var minDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * If specified, will only include entities that have at a
    * minimum this horizontal rotation.
    */
  var minHorizontalRotation: js.UndefOr[Double] = js.undefined
  
  /**
    * If defined, only players that have at least this level are
    * returned.
    */
  var minLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * If specified, will only include entities that have at least
    * this vertical rotation.
    */
  var minVerticalRotation: js.UndefOr[Double] = js.undefined
  
  /**
    * Includes entities with the specified name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Gets/sets a collection of EntityQueryScoreOptions objects
    * with filters for specific scoreboard objectives.
    */
  var scoreOptions: js.UndefOr[js.Array[EntityQueryScoreOptions]] = js.undefined
  
  /**
    * Includes entities that match all of the specified tags.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If defined, entities that match this type are included.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * In conjunction with location, specified a cuboid volume of
    * entities to include.
    */
  var volume: js.UndefOr[BlockAreaSize] = js.undefined
}
object EntityQueryOptions {
  
  inline def apply(): EntityQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityQueryOptions]
  }
  
  extension [Self <: EntityQueryOptions](x: Self) {
    
    inline def setClosest(value: Double): Self = StObject.set(x, "closest", value.asInstanceOf[js.Any])
    
    inline def setClosestUndefined: Self = StObject.set(x, "closest", js.undefined)
    
    inline def setExcludeFamilies(value: js.Array[String]): Self = StObject.set(x, "excludeFamilies", value.asInstanceOf[js.Any])
    
    inline def setExcludeFamiliesUndefined: Self = StObject.set(x, "excludeFamilies", js.undefined)
    
    inline def setExcludeFamiliesVarargs(value: String*): Self = StObject.set(x, "excludeFamilies", js.Array(value*))
    
    inline def setExcludeGameModes(value: js.Array[GameMode]): Self = StObject.set(x, "excludeGameModes", value.asInstanceOf[js.Any])
    
    inline def setExcludeGameModesUndefined: Self = StObject.set(x, "excludeGameModes", js.undefined)
    
    inline def setExcludeGameModesVarargs(value: GameMode*): Self = StObject.set(x, "excludeGameModes", js.Array(value*))
    
    inline def setExcludeNames(value: js.Array[String]): Self = StObject.set(x, "excludeNames", value.asInstanceOf[js.Any])
    
    inline def setExcludeNamesUndefined: Self = StObject.set(x, "excludeNames", js.undefined)
    
    inline def setExcludeNamesVarargs(value: String*): Self = StObject.set(x, "excludeNames", js.Array(value*))
    
    inline def setExcludeTags(value: js.Array[String]): Self = StObject.set(x, "excludeTags", value.asInstanceOf[js.Any])
    
    inline def setExcludeTagsUndefined: Self = StObject.set(x, "excludeTags", js.undefined)
    
    inline def setExcludeTagsVarargs(value: String*): Self = StObject.set(x, "excludeTags", js.Array(value*))
    
    inline def setExcludeTypes(value: js.Array[String]): Self = StObject.set(x, "excludeTypes", value.asInstanceOf[js.Any])
    
    inline def setExcludeTypesUndefined: Self = StObject.set(x, "excludeTypes", js.undefined)
    
    inline def setExcludeTypesVarargs(value: String*): Self = StObject.set(x, "excludeTypes", js.Array(value*))
    
    inline def setFamilies(value: js.Array[String]): Self = StObject.set(x, "families", value.asInstanceOf[js.Any])
    
    inline def setFamiliesUndefined: Self = StObject.set(x, "families", js.undefined)
    
    inline def setFamiliesVarargs(value: String*): Self = StObject.set(x, "families", js.Array(value*))
    
    inline def setFarthest(value: Double): Self = StObject.set(x, "farthest", value.asInstanceOf[js.Any])
    
    inline def setFarthestUndefined: Self = StObject.set(x, "farthest", js.undefined)
    
    inline def setGameMode(value: GameMode): Self = StObject.set(x, "gameMode", value.asInstanceOf[js.Any])
    
    inline def setGameModeUndefined: Self = StObject.set(x, "gameMode", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    inline def setMaxHorizontalRotation(value: Double): Self = StObject.set(x, "maxHorizontalRotation", value.asInstanceOf[js.Any])
    
    inline def setMaxHorizontalRotationUndefined: Self = StObject.set(x, "maxHorizontalRotation", js.undefined)
    
    inline def setMaxLevel(value: Double): Self = StObject.set(x, "maxLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxLevelUndefined: Self = StObject.set(x, "maxLevel", js.undefined)
    
    inline def setMaxVerticalRotation(value: Double): Self = StObject.set(x, "maxVerticalRotation", value.asInstanceOf[js.Any])
    
    inline def setMaxVerticalRotationUndefined: Self = StObject.set(x, "maxVerticalRotation", js.undefined)
    
    inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
    
    inline def setMinHorizontalRotation(value: Double): Self = StObject.set(x, "minHorizontalRotation", value.asInstanceOf[js.Any])
    
    inline def setMinHorizontalRotationUndefined: Self = StObject.set(x, "minHorizontalRotation", js.undefined)
    
    inline def setMinLevel(value: Double): Self = StObject.set(x, "minLevel", value.asInstanceOf[js.Any])
    
    inline def setMinLevelUndefined: Self = StObject.set(x, "minLevel", js.undefined)
    
    inline def setMinVerticalRotation(value: Double): Self = StObject.set(x, "minVerticalRotation", value.asInstanceOf[js.Any])
    
    inline def setMinVerticalRotationUndefined: Self = StObject.set(x, "minVerticalRotation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScoreOptions(value: js.Array[EntityQueryScoreOptions]): Self = StObject.set(x, "scoreOptions", value.asInstanceOf[js.Any])
    
    inline def setScoreOptionsUndefined: Self = StObject.set(x, "scoreOptions", js.undefined)
    
    inline def setScoreOptionsVarargs(value: EntityQueryScoreOptions*): Self = StObject.set(x, "scoreOptions", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVolume(value: BlockAreaSize): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
