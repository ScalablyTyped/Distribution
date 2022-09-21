package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientEventarc.anon.AccesstokenAlt
import typings.maximMazurokGapiClientEventarc.anon.Callback
import typings.maximMazurokGapiClientEventarc.anon.Filter
import typings.maximMazurokGapiClientEventarc.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var channelConnections: ChannelConnectionsResource = js.native
  
  var channels: ChannelsResource = js.native
  
  /** Gets information about a location. */
  def get(): Request[Location] = js.native
  def get(request: Callback): Request[Location] = js.native
  
  /** Get a GoogleChannelConfig */
  def getGoogleChannelConfig(): Request[GoogleChannelConfig] = js.native
  def getGoogleChannelConfig(request: Callback): Request[GoogleChannelConfig] = js.native
  
  /** Lists information about the supported locations for this service. */
  def list(): Request[ListLocationsResponse] = js.native
  def list(request: Filter): Request[ListLocationsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  var providers: ProvidersResource = js.native
  
  var triggers: TriggersResource = js.native
  
  def updateGoogleChannelConfig(request: AccesstokenAlt, body: GoogleChannelConfig): Request[GoogleChannelConfig] = js.native
  /** Update a single GoogleChannelConfig */
  def updateGoogleChannelConfig(request: Xgafv): Request[GoogleChannelConfig] = js.native
}
