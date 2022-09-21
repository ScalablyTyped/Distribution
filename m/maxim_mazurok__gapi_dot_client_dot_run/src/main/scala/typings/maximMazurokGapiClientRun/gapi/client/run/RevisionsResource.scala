package typings.maximMazurokGapiClientRun.gapi.client.run

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRun.anon.Accesstoken
import typings.maximMazurokGapiClientRun.anon.Alt
import typings.maximMazurokGapiClientRun.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionsResource extends StObject {
  
  /** Delete a Revision. */
  def delete(): Request[GoogleLongrunningOperation] = js.native
  def delete(request: Callback): Request[GoogleLongrunningOperation] = js.native
  
  /** Gets information about a Revision. */
  def get(): Request[GoogleCloudRunV2Revision] = js.native
  def get(request: Accesstoken): Request[GoogleCloudRunV2Revision] = js.native
  
  /** List Revisions from a given Service, or from a given location. */
  def list(): Request[GoogleCloudRunV2ListRevisionsResponse] = js.native
  def list(request: Alt): Request[GoogleCloudRunV2ListRevisionsResponse] = js.native
}
