package typings.maximMazurokGapiClientWebmasters.gapi.client.webmasters

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientWebmasters.anon.Feedpath
import typings.maximMazurokGapiClientWebmasters.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitemapsResource extends js.Object {
  
  /** Deletes a sitemap from this site. */
  def delete(): Request[Unit] = js.native
  def delete(request: Feedpath): Request[Unit] = js.native
  
  /** Retrieves information about a specific sitemap. */
  def get(): Request[WmxSitemap] = js.native
  def get(request: Feedpath): Request[WmxSitemap] = js.native
  
  /** Lists the sitemaps-entries submitted for this site, or included in the sitemap index file (if sitemapIndex is specified in the request). */
  def list(): Request[SitemapsListResponse] = js.native
  def list(request: Key): Request[SitemapsListResponse] = js.native
  
  /** Submits a sitemap for a site. */
  def submit(): Request[Unit] = js.native
  def submit(request: Feedpath): Request[Unit] = js.native
}
