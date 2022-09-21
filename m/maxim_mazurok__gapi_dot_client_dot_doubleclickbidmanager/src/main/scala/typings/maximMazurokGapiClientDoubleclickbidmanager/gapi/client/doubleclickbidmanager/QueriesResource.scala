package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.Callback
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.Fields
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.Key
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.Oauthtoken
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.PrettyPrint
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.QueryId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueriesResource extends StObject {
  
  /** Creates a query. */
  def create(request: Callback): Request[Query] = js.native
  def create(request: Fields, body: Query): Request[Query] = js.native
  
  /** Deletes a query as well as the associated reports. */
  def delete(): Request[Unit] = js.native
  def delete(request: Key): Request[Unit] = js.native
  
  /** Retrieves a query. */
  def get(): Request[Query] = js.native
  def get(request: Key): Request[Query] = js.native
  
  /** Lists queries created by the current user. */
  def list(): Request[ListQueriesResponse] = js.native
  def list(request: Oauthtoken): Request[ListQueriesResponse] = js.native
  
  var reports: ReportsResource = js.native
  
  /** Runs a stored query to generate a report. */
  def run(request: PrettyPrint): Request[Report] = js.native
  def run(request: QueryId, body: RunQueryRequest): Request[Report] = js.native
}
