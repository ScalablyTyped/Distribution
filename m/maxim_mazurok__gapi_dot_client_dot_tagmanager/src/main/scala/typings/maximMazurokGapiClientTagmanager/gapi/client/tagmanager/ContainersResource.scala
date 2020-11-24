package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTagmanager.anon.Alt
import typings.maximMazurokGapiClientTagmanager.anon.Callback
import typings.maximMazurokGapiClientTagmanager.anon.Fields
import typings.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typings.maximMazurokGapiClientTagmanager.anon.ParentPrettyPrint
import typings.maximMazurokGapiClientTagmanager.anon.ResourceUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainersResource extends js.Object {
  
  def create(request: Alt, body: Container): Request[Container] = js.native
  /** Creates a Container. */
  def create(request: ParentPrettyPrint): Request[Container] = js.native
  
  /** Deletes a Container. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  var environments: EnvironmentsResource = js.native
  
  /** Gets a Container. */
  def get(): Request[Container] = js.native
  def get(request: Callback): Request[Container] = js.native
  
  /** Lists all Containers that belongs to a GTM Account. */
  def list(): Request[ListContainersResponse] = js.native
  def list(request: Fields): Request[ListContainersResponse] = js.native
  
  def update(request: Oauthtoken, body: Container): Request[Container] = js.native
  /** Updates a Container. */
  def update(request: ResourceUploadType): Request[Container] = js.native
  
  var version_headers: VersionHeadersResource = js.native
  
  var versions: VersionsResource = js.native
  
  var workspaces: WorkspacesResource = js.native
}
