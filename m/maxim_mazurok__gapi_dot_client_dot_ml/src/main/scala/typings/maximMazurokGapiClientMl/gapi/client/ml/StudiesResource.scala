package typings.maximMazurokGapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMl.anon.Alt
import typings.maximMazurokGapiClientMl.anon.AltCallback
import typings.maximMazurokGapiClientMl.anon.Fields
import typings.maximMazurokGapiClientMl.anon.StudyId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StudiesResource extends StObject {
  
  def create(request: AltCallback, body: GoogleCloudMlV1Study): Request[GoogleCloudMlV1Study] = js.native
  /** Creates a study. */
  def create(request: StudyId): Request[GoogleCloudMlV1Study] = js.native
  
  /** Deletes a study. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Alt): Request[js.Object] = js.native
  
  /** Gets a study. */
  def get(): Request[GoogleCloudMlV1Study] = js.native
  def get(request: Alt): Request[GoogleCloudMlV1Study] = js.native
  
  /** Lists all the studies in a region for an associated project. */
  def list(): Request[GoogleCloudMlV1ListStudiesResponse] = js.native
  def list(request: Fields): Request[GoogleCloudMlV1ListStudiesResponse] = js.native
  
  var trials: TrialsResource = js.native
}
