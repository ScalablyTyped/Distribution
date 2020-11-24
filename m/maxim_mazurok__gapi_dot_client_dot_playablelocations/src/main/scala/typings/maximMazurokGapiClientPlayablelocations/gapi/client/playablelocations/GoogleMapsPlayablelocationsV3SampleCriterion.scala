package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3SampleCriterion extends js.Object {
  
  /**
    * Specifies which `PlayableLocation` fields are returned. `name` (which is used for logging impressions), `center_point` and `place_id` (or `plus_code`) are always returned. The
    * following fields are omitted unless you specify them here: * snapped_point * types Note: The more fields you include, the more expensive in terms of data and associated latency your
    * query will be.
    */
  var fieldsToReturn: js.UndefOr[String] = js.native
  
  /** Specifies filtering options, and specifies what will be included in the result set. */
  var filter: js.UndefOr[GoogleMapsPlayablelocationsV3SampleFilter] = js.native
  
  /**
    * Required. An arbitrary, developer-defined identifier of the type of game object that the playable location is used for. This field allows you to specify criteria per game object
    * type when searching for playable locations. You should assign a unique `game_object_type` ID across all `request_criteria` to represent a distinct type of game object. For example,
    * 1=monster location, 2=powerup location. The response contains a map.
    */
  var gameObjectType: js.UndefOr[Double] = js.native
}
object GoogleMapsPlayablelocationsV3SampleCriterion {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3SampleCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SampleCriterion]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3SampleCriterionOps[Self <: GoogleMapsPlayablelocationsV3SampleCriterion] (val x: Self) extends AnyVal {
    
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
    def setFieldsToReturn(value: String): Self = this.set("fieldsToReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldsToReturn: Self = this.set("fieldsToReturn", js.undefined)
    
    @scala.inline
    def setFilter(value: GoogleMapsPlayablelocationsV3SampleFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGameObjectType(value: Double): Self = this.set("gameObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameObjectType: Self = this.set("gameObjectType", js.undefined)
  }
}
