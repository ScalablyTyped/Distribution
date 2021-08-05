package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMapsPlayablelocationsV3Impression extends StObject {
  
  /**
    * An arbitrary, developer-defined type identifier for each type of game object used in your game. Since players interact with differ types of game objects in different ways, this
    * field allows you to segregate impression data by type for analysis. You should assign a unique `game_object_type` ID to represent a distinct type of game object in your game. For
    * example, 1=monster location, 2=powerup location.
    */
  var gameObjectType: js.UndefOr[Double] = js.undefined
  
  /** Required. The type of impression event. */
  var impressionType: js.UndefOr[String] = js.undefined
  
  /** Required. The name of the playable location. */
  var locationName: js.UndefOr[String] = js.undefined
}
object GoogleMapsPlayablelocationsV3Impression {
  
  inline def apply(): GoogleMapsPlayablelocationsV3Impression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3Impression]
  }
  
  extension [Self <: GoogleMapsPlayablelocationsV3Impression](x: Self) {
    
    inline def setGameObjectType(value: Double): Self = StObject.set(x, "gameObjectType", value.asInstanceOf[js.Any])
    
    inline def setGameObjectTypeUndefined: Self = StObject.set(x, "gameObjectType", js.undefined)
    
    inline def setImpressionType(value: String): Self = StObject.set(x, "impressionType", value.asInstanceOf[js.Any])
    
    inline def setImpressionTypeUndefined: Self = StObject.set(x, "impressionType", js.undefined)
    
    inline def setLocationName(value: String): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
    
    inline def setLocationNameUndefined: Self = StObject.set(x, "locationName", js.undefined)
  }
}
