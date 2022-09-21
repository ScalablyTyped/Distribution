package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDlp.anon.AccesstokenAlt
import typings.maximMazurokGapiClientDlp.anon.AltCallback
import typings.maximMazurokGapiClientDlp.anon.Fields
import typings.maximMazurokGapiClientDlp.anon.Filter
import typings.maximMazurokGapiClientDlp.anon.Key
import typings.maximMazurokGapiClientDlp.anon.Uploadprotocol
import typings.maximMazurokGapiClientDlp.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobTriggersResource extends StObject {
  
  /** Activate a job trigger. Causes the immediate execute of a trigger instead of waiting on the trigger event to occur. */
  def activate(request: AccesstokenAlt): Request[GooglePrivacyDlpV2DlpJob] = js.native
  def activate(request: Key, body: GooglePrivacyDlpV2ActivateJobTriggerRequest): Request[GooglePrivacyDlpV2DlpJob] = js.native
  
  def create(request: Fields, body: GooglePrivacyDlpV2CreateJobTriggerRequest): Request[GooglePrivacyDlpV2JobTrigger] = js.native
  /**
    * Creates a job trigger to run DLP actions such as scanning storage for sensitive information on a set schedule. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn
    * more.
    */
  def create(request: Uploadprotocol): Request[GooglePrivacyDlpV2JobTrigger] = js.native
  
  /** Deletes a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more. */
  def get(): Request[GooglePrivacyDlpV2JobTrigger] = js.native
  def get(request: Key): Request[GooglePrivacyDlpV2JobTrigger] = js.native
  
  /** Inspect hybrid content and store findings to a trigger. The inspection will be processed asynchronously. To review the findings monitor the jobs within the trigger. */
  def hybridInspect(request: AltCallback): Request[js.Object] = js.native
  def hybridInspect(request: Key, body: GooglePrivacyDlpV2HybridInspectJobTriggerRequest): Request[js.Object] = js.native
  
  /** Lists job triggers. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more. */
  def list(): Request[GooglePrivacyDlpV2ListJobTriggersResponse] = js.native
  def list(request: Filter): Request[GooglePrivacyDlpV2ListJobTriggersResponse] = js.native
  
  def patch(request: Key, body: GooglePrivacyDlpV2UpdateJobTriggerRequest): Request[GooglePrivacyDlpV2JobTrigger] = js.native
  /** Updates a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more. */
  def patch(request: Xgafv): Request[GooglePrivacyDlpV2JobTrigger] = js.native
}
