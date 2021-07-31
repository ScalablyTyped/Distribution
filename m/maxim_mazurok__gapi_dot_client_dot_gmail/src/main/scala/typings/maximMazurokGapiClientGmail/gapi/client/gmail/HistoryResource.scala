package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGmail.anon.HistoryTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryResource extends StObject {
  
  /** Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing `historyId`). */
  def list(): Request[ListHistoryResponse] = js.native
  def list(request: HistoryTypes): Request[ListHistoryResponse] = js.native
}
