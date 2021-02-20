package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3Impression extends StObject {
  
  /**
    * An arbitrary, developer-defined type identifier for each type of game object used in your game. Since players interact with differ types of game objects in different ways, this
    * field allows you to segregate impression data by type for analysis. You should assign a unique `game_object_type` ID to represent a distinct type of game object in your game. For
    * example, 1=monster location, 2=powerup location.
    */
  var gameObjectType: js.UndefOr[Double] = js.native
  
  /** Required. The type of impression event. */
  var impressionType: js.UndefOr[String] = js.native
  
  /** Required. The name of the playable location. */
  var locationName: js.UndefOr[String] = js.native
}
object GoogleMapsPlayablelocationsV3Impression {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3Impression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3Impression]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3ImpressionMutableBuilder[Self <: GoogleMapsPlayablelocationsV3Impression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameObjectType(value: Double): Self = StObject.set(x, "gameObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameObjectTypeUndefined: Self = StObject.set(x, "gameObjectType", js.undefined)
    
    @scala.inline
    def setImpressionType(value: String): Self = StObject.set(x, "impressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionTypeUndefined: Self = StObject.set(x, "impressionType", js.undefined)
    
    @scala.inline
    def setLocationName(value: String): Self = StObject.set(x, "locationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNameUndefined: Self = StObject.set(x, "locationName", js.undefined)
  }
}
