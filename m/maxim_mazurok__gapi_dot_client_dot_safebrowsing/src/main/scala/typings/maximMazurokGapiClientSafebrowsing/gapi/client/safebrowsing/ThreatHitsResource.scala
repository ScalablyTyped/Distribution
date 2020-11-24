package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSafebrowsing.anon.Callback
import typings.maximMazurokGapiClientSafebrowsing.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatHitsResource extends js.Object {
  
  def create(request: Callback, body: ThreatHit): Request[js.Object] = js.native
  /** Reports a Safe Browsing threat list hit to Google. Only projects with TRUSTED_REPORTER visibility can use this method. */
  def create(request: Fields): Request[js.Object] = js.native
}
