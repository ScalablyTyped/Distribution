package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSafebrowsing.anon.Callback
import typings.maximMazurokGapiClientSafebrowsing.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatMatchesResource extends StObject {
  
  def find(request: Callback, body: FindThreatMatchesRequest): Request[FindThreatMatchesResponse] = js.native
  /** Finds the threat entries that match the Safe Browsing lists. */
  def find(request: Oauthtoken): Request[FindThreatMatchesResponse] = js.native
}
