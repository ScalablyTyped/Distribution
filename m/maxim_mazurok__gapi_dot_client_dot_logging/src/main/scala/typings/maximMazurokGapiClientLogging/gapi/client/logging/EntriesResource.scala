package typings.maximMazurokGapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLogging.anon.AccesstokenAlt
import typings.maximMazurokGapiClientLogging.anon.AltCallback
import typings.maximMazurokGapiClientLogging.anon.CallbackFields
import typings.maximMazurokGapiClientLogging.anon.FieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntriesResource extends js.Object {
  
  /**
    * Lists log entries. Use this method to retrieve log entries that originated from a project/folder/organization/billing account. For ways to export log entries, see Exporting Logs
    * (https://cloud.google.com/logging/docs/export).
    */
  def list(request: AccesstokenAlt): Request[ListLogEntriesResponse] = js.native
  def list(request: AltCallback, body: ListLogEntriesRequest): Request[ListLogEntriesResponse] = js.native
  
  def tail(request: AltCallback, body: TailLogEntriesRequest): Request[TailLogEntriesResponse] = js.native
  /** Streaming read of log entries as they are ingested. Until the stream is terminated, it will continue reading logs. */
  def tail(request: CallbackFields): Request[TailLogEntriesResponse] = js.native
  
  def write(request: AltCallback, body: WriteLogEntriesRequest): Request[js.Object] = js.native
  /**
    * Writes log entries to Logging. This API method is the only way to send log entries to Logging. This method is used, directly or indirectly, by the Logging agent (fluentd) and all
    * logging libraries configured to use Logging. A single request may contain log entries for a maximum of 1000 different resources (projects, organizations, billing accounts or
    * folders)
    */
  def write(request: FieldsKey): Request[js.Object] = js.native
}
