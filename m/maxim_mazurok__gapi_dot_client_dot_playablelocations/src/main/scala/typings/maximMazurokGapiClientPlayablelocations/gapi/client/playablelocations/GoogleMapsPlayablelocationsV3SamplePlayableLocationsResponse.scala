package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse extends js.Object {
  
  /** Each PlayableLocation object corresponds to a game_object_type specified in the request. */
  var locationsPerGameObjectType: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.playablelocations.gapi.client.playablelocations.GoogleMapsPlayablelocationsV3SamplePlayableLocationList}
    */ typings.maximMazurokGapiClientPlayablelocations.maximMazurokGapiClientPlayablelocationsStrings.GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Required. Specifies the "time-to-live" for the set of playable locations. You can use this value to determine how long to cache the set of playable locations. After this length of
    * time, your back-end game server should issue a new SamplePlayableLocations request to get a fresh set of playable locations (because for example, they might have been removed, a
    * park might have closed for the day, a business might have closed permanently).
    */
  var ttl: js.UndefOr[String] = js.native
}
object GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponseOps[Self <: GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse] (val x: Self) extends AnyVal {
    
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
    def setLocationsPerGameObjectType(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.playablelocations.gapi.client.playablelocations.GoogleMapsPlayablelocationsV3SamplePlayableLocationList}
      */ typings.maximMazurokGapiClientPlayablelocations.maximMazurokGapiClientPlayablelocationsStrings.GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse with TopLevel[js.Any]
    ): Self = this.set("locationsPerGameObjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationsPerGameObjectType: Self = this.set("locationsPerGameObjectType", js.undefined)
    
    @scala.inline
    def setTtl(value: String): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
