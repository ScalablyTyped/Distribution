package typings.maximMazurokGapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDns.anon.Accesstoken
import typings.maximMazurokGapiClientDns.anon.Alt
import typings.maximMazurokGapiClientDns.anon.Callback
import typings.maximMazurokGapiClientDns.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesResource extends StObject {
  
  /** Atomically update the ResourceRecordSet collection. */
  def create(request: Accesstoken): Request[Change] = js.native
  def create(request: Alt, body: Change): Request[Change] = js.native
  
  /** Fetch the representation of an existing Change. */
  def get(): Request[Change] = js.native
  def get(request: Callback): Request[Change] = js.native
  
  /** Enumerate Changes to a ResourceRecordSet collection. */
  def list(): Request[ChangesListResponse] = js.native
  def list(request: Fields): Request[ChangesListResponse] = js.native
}
