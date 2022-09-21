package typings.maximMazurokGapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLogging.anon.AccesstokenAlt
import typings.maximMazurokGapiClientLogging.anon.AltCallback
import typings.maximMazurokGapiClientLogging.anon.Fields
import typings.maximMazurokGapiClientLogging.anon.SinkName
import typings.maximMazurokGapiClientLogging.anon.UniqueWriterIdentity
import typings.maximMazurokGapiClientLogging.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinksResource extends StObject {
  
  def create(request: AccesstokenAlt, body: LogSink): Request[LogSink] = js.native
  /**
    * Creates a sink that exports specified log entries to a destination. The export of newly-ingested log entries begins immediately, unless the sink's writer_identity is not permitted
    * to write to the destination. A sink can export log entries only from the resource owning the sink.
    */
  def create(request: UniqueWriterIdentity): Request[LogSink] = js.native
  
  /** Deletes a sink. If the sink has a unique writer_identity, then that service account is also deleted. */
  def delete(): Request[js.Object] = js.native
  def delete(request: SinkName): Request[js.Object] = js.native
  
  /** Gets a sink. */
  def get(): Request[LogSink] = js.native
  def get(request: SinkName): Request[LogSink] = js.native
  
  /** Lists sinks. */
  def list(): Request[ListSinksResponse] = js.native
  def list(request: Fields): Request[ListSinksResponse] = js.native
  
  def patch(request: AltCallback, body: LogSink): Request[LogSink] = js.native
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter.The updated sink might also have a new
    * writer_identity; see the unique_writer_identity field.
    */
  def patch(request: UpdateMask): Request[LogSink] = js.native
  
  def update(request: AltCallback, body: LogSink): Request[LogSink] = js.native
  /**
    * Updates a sink. This method replaces the following fields in the existing sink with values from the new sink: destination, and filter.The updated sink might also have a new
    * writer_identity; see the unique_writer_identity field.
    */
  def update(request: UpdateMask): Request[LogSink] = js.native
}
