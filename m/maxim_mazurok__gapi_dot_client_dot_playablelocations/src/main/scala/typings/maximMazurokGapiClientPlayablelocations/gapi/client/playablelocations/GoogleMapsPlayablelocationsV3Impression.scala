package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3Impression extends js.Object {
  
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
  implicit class GoogleMapsPlayablelocationsV3ImpressionOps[Self <: GoogleMapsPlayablelocationsV3Impression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGameObjectType(value: Double): Self = this.set("gameObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameObjectType: Self = this.set("gameObjectType", js.undefined)
    
    @scala.inline
    def setImpressionType(value: String): Self = this.set("impressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressionType: Self = this.set("impressionType", js.undefined)
    
    @scala.inline
    def setLocationName(value: String): Self = this.set("locationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationName: Self = this.set("locationName", js.undefined)
  }
}
