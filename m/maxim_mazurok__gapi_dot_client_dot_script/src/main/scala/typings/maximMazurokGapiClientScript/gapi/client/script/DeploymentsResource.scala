package typings.maximMazurokGapiClientScript.gapi.client.script

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientScript.anon.Callback
import typings.maximMazurokGapiClientScript.anon.DeploymentId
import typings.maximMazurokGapiClientScript.anon.Fields
import typings.maximMazurokGapiClientScript.anon.Key
import typings.maximMazurokGapiClientScript.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentsResource extends StObject {
  
  /** Creates a deployment of an Apps Script project. */
  def create(request: Callback): Request[Deployment] = js.native
  def create(request: Fields, body: DeploymentConfig): Request[Deployment] = js.native
  
  /** Deletes a deployment of an Apps Script project. */
  def delete(): Request[js.Object] = js.native
  def delete(request: DeploymentId): Request[js.Object] = js.native
  
  /** Gets a deployment of an Apps Script project. */
  def get(): Request[Deployment] = js.native
  def get(request: DeploymentId): Request[Deployment] = js.native
  
  /** Lists the deployments of an Apps Script project. */
  def list(): Request[ListDeploymentsResponse] = js.native
  def list(request: Key): Request[ListDeploymentsResponse] = js.native
  
  def update(request: DeploymentId, body: UpdateDeploymentRequest): Request[Deployment] = js.native
  /** Updates a deployment of an Apps Script project. */
  def update(request: Oauthtoken): Request[Deployment] = js.native
}
