package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTagmanager.anon.Alt
import typings.maximMazurokGapiClientTagmanager.anon.IncludeDeleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionHeadersResource extends js.Object {
  
  /** Gets the latest container version header */
  def latest(): Request[ContainerVersionHeader] = js.native
  def latest(request: Alt): Request[ContainerVersionHeader] = js.native
  
  /** Lists all Container Versions of a GTM Container. */
  def list(): Request[ListContainerVersionsResponse] = js.native
  def list(request: IncludeDeleted): Request[ListContainerVersionsResponse] = js.native
}
