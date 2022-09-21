package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse extends StObject {
  
  /** Each PlayableLocation object corresponds to a game_object_type specified in the request. */
  var locationsPerGameObjectType: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.playablelocations.gapi.client.playablelocations.GoogleMapsPlayablelocationsV3SamplePlayableLocationList}
    */ typings.maximMazurokGapiClientPlayablelocations.maximMazurokGapiClientPlayablelocationsStrings.GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Required. Specifies the "time-to-live" for the set of playable locations. You can use this value to determine how long to cache the set of playable locations. After this length of
    * time, your back-end game server should issue a new SamplePlayableLocations request to get a fresh set of playable locations (because for example, they might have been removed, a
    * park might have closed for the day, a business might have closed permanently).
    */
  var ttl: js.UndefOr[String] = js.undefined
}
object GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse {
  
  inline def apply(): GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse]
  }
  
  extension [Self <: GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse](x: Self) {
    
    inline def setLocationsPerGameObjectType(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.playablelocations.gapi.client.playablelocations.GoogleMapsPlayablelocationsV3SamplePlayableLocationList}
      */ typings.maximMazurokGapiClientPlayablelocations.maximMazurokGapiClientPlayablelocationsStrings.GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse & TopLevel[Any]
    ): Self = StObject.set(x, "locationsPerGameObjectType", value.asInstanceOf[js.Any])
    
    inline def setLocationsPerGameObjectTypeUndefined: Self = StObject.set(x, "locationsPerGameObjectType", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
