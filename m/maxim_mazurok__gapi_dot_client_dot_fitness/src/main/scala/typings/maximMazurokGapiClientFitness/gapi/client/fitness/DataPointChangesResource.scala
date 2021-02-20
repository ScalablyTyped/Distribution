package typings.maximMazurokGapiClientFitness.gapi.client.fitness

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFitness.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataPointChangesResource extends StObject {
  
  /** Queries for user's data point changes for a particular data source. */
  def list(): Request[ListDataPointChangesResponse] = js.native
  def list(request: Callback): Request[ListDataPointChangesResponse] = js.native
}
