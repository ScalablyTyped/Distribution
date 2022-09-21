package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.Accesstoken
import typings.maximMazurokGapiClientDoubleclickbidmanager.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsResource extends StObject {
  
  /** Retrieves a report. */
  def get(): Request[Report] = js.native
  def get(request: Accesstoken): Request[Report] = js.native
  
  /** Lists reports associated with a query. */
  def list(): Request[ListReportsResponse] = js.native
  def list(request: Alt): Request[ListReportsResponse] = js.native
}
