package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPlayablelocations.anon.Accesstoken
import typings.maximMazurokGapiClientPlayablelocations.anon.Alt
import typings.maximMazurokGapiClientPlayablelocations.anon.Callback
import typings.maximMazurokGapiClientPlayablelocations.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V3Resource extends StObject {
  
  /**
    * Logs new events when playable locations are displayed, and when they are interacted with. Impressions are not partially saved; either all impressions are saved and this request
    * succeeds, or no impressions are saved, and this request fails.
    */
  def logImpressions(request: Accesstoken): Request[js.Object] = js.native
  def logImpressions(request: Alt, body: GoogleMapsPlayablelocationsV3LogImpressionsRequest): Request[js.Object] = js.native
  
  def logPlayerReports(request: Alt, body: GoogleMapsPlayablelocationsV3LogPlayerReportsRequest): Request[js.Object] = js.native
  /**
    * Logs bad playable location reports submitted by players. Reports are not partially saved; either all reports are saved and this request succeeds, or no reports are saved, and this
    * request fails.
    */
  def logPlayerReports(request: Callback): Request[js.Object] = js.native
  
  def samplePlayableLocations(request: Alt, body: GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest): Request[GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse] = js.native
  /**
    * Returns a set of playable locations that lie within a specified area, that satisfy optional filter criteria. Note: Identical `SamplePlayableLocations` requests can return different
    * results as the state of the world changes over time.
    */
  def samplePlayableLocations(request: Fields): Request[GoogleMapsPlayablelocationsV3SamplePlayableLocationsResponse] = js.native
}
