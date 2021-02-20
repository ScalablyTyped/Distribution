package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientOsconfig.anon.Accesstoken
import typings.maximMazurokGapiClientOsconfig.anon.Alt
import typings.maximMazurokGapiClientOsconfig.anon.Callback
import typings.maximMazurokGapiClientOsconfig.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchDeploymentsResource extends StObject {
  
  /** Create an OS Config patch deployment. */
  def create(request: Accesstoken): Request[PatchDeployment] = js.native
  def create(request: Alt, body: PatchDeployment): Request[PatchDeployment] = js.native
  
  /** Delete an OS Config patch deployment. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Get an OS Config patch deployment. */
  def get(): Request[PatchDeployment] = js.native
  def get(request: Callback): Request[PatchDeployment] = js.native
  
  /** Get a page of OS Config patch deployments. */
  def list(): Request[ListPatchDeploymentsResponse] = js.native
  def list(request: Fields): Request[ListPatchDeploymentsResponse] = js.native
}
