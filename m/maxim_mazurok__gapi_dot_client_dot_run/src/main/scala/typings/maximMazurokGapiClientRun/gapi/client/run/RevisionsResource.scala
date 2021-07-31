package typings.maximMazurokGapiClientRun.gapi.client.run

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRun.anon.Alt
import typings.maximMazurokGapiClientRun.anon.ApiVersion
import typings.maximMazurokGapiClientRun.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionsResource extends StObject {
  
  /** Delete a revision. */
  def delete(): Request[Status] = js.native
  def delete(request: ApiVersion): Request[Status] = js.native
  
  /** Get information about a revision. */
  def get(): Request[Revision] = js.native
  def get(request: Alt): Request[Revision] = js.native
  
  /** List revisions. */
  def list(): Request[ListRevisionsResponse] = js.native
  def list(request: Callback): Request[ListRevisionsResponse] = js.native
}
