package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTagmanager.anon.Alt
import typings.maximMazurokGapiClientTagmanager.anon.Callback
import typings.maximMazurokGapiClientTagmanager.anon.ContainerVersionId
import typings.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typings.maximMazurokGapiClientTagmanager.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionsResource extends StObject {
  
  /** Deletes a Container Version. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a Container Version. */
  def get(): Request[ContainerVersion] = js.native
  def get(request: ContainerVersionId): Request[ContainerVersion] = js.native
  
  /** Gets the live (i.e. published) container version */
  def live(): Request[ContainerVersion] = js.native
  def live(request: Alt): Request[ContainerVersion] = js.native
  
  /** Publishes a Container Version. */
  def publish(): Request[PublishContainerVersionResponse] = js.native
  def publish(request: Oauthtoken): Request[PublishContainerVersionResponse] = js.native
  
  /** Sets the latest version used for synchronization of workspaces when detecting conflicts and errors. */
  def set_latest(): Request[ContainerVersion] = js.native
  def set_latest(request: Callback): Request[ContainerVersion] = js.native
  
  /** Undeletes a Container Version. */
  def undelete(): Request[ContainerVersion] = js.native
  def undelete(request: Callback): Request[ContainerVersion] = js.native
  
  def update(request: Oauthtoken, body: ContainerVersion): Request[ContainerVersion] = js.native
  /** Updates a Container Version. */
  def update(request: Path): Request[ContainerVersion] = js.native
}
