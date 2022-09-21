package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientOsconfig.anon.AccesstokenAlt
import typings.maximMazurokGapiClientOsconfig.anon.AltCallback
import typings.maximMazurokGapiClientOsconfig.anon.Callback
import typings.maximMazurokGapiClientOsconfig.anon.Fields
import typings.maximMazurokGapiClientOsconfig.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchJobsResource extends StObject {
  
  def cancel(request: Callback, body: CancelPatchJobRequest): Request[PatchJob] = js.native
  /** Cancel a patch job. The patch job must be active. Canceled patch jobs cannot be restarted. */
  def cancel(request: Xgafv): Request[PatchJob] = js.native
  
  /** Patch VM instances by creating and running a patch job. */
  def execute(request: AccesstokenAlt): Request[PatchJob] = js.native
  def execute(request: AltCallback, body: ExecutePatchJobRequest): Request[PatchJob] = js.native
  
  /** Get the patch job. This can be used to track the progress of an ongoing patch job or review the details of completed jobs. */
  def get(): Request[PatchJob] = js.native
  def get(request: Callback): Request[PatchJob] = js.native
  
  var instanceDetails: InstanceDetailsResource = js.native
  
  /** Get a list of patch jobs. */
  def list(): Request[ListPatchJobsResponse] = js.native
  def list(request: Fields): Request[ListPatchJobsResponse] = js.native
}
