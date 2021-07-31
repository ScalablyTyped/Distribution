package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.Asynchronous
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
  def createquery(request: Asynchronous): Request[Query] = js.native
  def createquery(request: Fields, body: Query): Request[Query] = js.native
  
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(): Request[Unit] = js.native
  def deletequery(request: Key): Request[Unit] = js.native
  
  /** Retrieves a stored query. */
  def getquery(): Request[Query] = js.native
  def getquery(request: Key): Request[Query] = js.native
  
  /** Retrieves stored queries. */
  def listqueries(): Request[ListQueriesResponse] = js.native
  def listqueries(request: Oauthtoken): Request[ListQueriesResponse] = js.native
  
  /** Runs a stored query to generate a report. */
  def runquery(request: PrettyPrint): Request[Unit] = js.native
  def runquery(request: QueryId, body: RunQueryRequest): Request[Unit] = js.native
}
