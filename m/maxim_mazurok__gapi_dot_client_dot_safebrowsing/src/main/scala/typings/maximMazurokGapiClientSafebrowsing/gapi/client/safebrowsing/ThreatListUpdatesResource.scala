package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSafebrowsing.anon.Callback
import typings.maximMazurokGapiClientSafebrowsing.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatListUpdatesResource extends StObject {
  
  def fetch(request: Callback, body: FetchThreatListUpdatesRequest): Request[FetchThreatListUpdatesResponse] = js.native
  /** Fetches the most recent threat list updates. A client can request updates for multiple lists at once. */
  def fetch(request: Key): Request[FetchThreatListUpdatesResponse] = js.native
}
