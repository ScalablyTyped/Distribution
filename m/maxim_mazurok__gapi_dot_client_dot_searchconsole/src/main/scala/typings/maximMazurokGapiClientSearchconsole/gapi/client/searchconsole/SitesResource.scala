package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSearchconsole.anon.Alt
import typings.maximMazurokGapiClientSearchconsole.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitesResource extends StObject {
  
  /** Adds a site to the set of the user's sites in Search Console. */
  def add(): Request[Unit] = js.native
  def add(request: Alt): Request[Unit] = js.native
  
  /** Removes a site from the set of the user's Search Console sites. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Retrieves information about specific site. */
  def get(): Request[WmxSite] = js.native
  def get(request: Alt): Request[WmxSite] = js.native
  
  /** Lists the user's Search Console sites. */
  def list(): Request[SitesListResponse] = js.native
  def list(request: Key): Request[SitesListResponse] = js.native
}
