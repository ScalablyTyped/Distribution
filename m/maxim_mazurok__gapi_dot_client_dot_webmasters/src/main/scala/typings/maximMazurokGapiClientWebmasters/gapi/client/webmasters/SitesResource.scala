package typings.maximMazurokGapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientWebmasters.anon.Fields
import typings.maximMazurokGapiClientWebmasters.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitesResource extends js.Object {
  
  /** Adds a site to the set of the user's sites in Search Console. */
  def add(): Request[Unit] = js.native
  def add(request: Fields): Request[Unit] = js.native
  
  /** Removes a site from the set of the user's Search Console sites. */
  def delete(): Request[Unit] = js.native
  def delete(request: Fields): Request[Unit] = js.native
  
  /** Retrieves information about specific site. */
  def get(): Request[WmxSite] = js.native
  def get(request: Fields): Request[WmxSite] = js.native
  
  /** Lists the user's Search Console sites. */
  def list(): Request[SitesListResponse] = js.native
  def list(request: Oauthtoken): Request[SitesListResponse] = js.native
}
