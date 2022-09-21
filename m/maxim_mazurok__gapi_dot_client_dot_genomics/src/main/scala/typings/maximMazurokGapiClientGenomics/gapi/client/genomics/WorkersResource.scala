package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGenomics.anon.Id
import typings.maximMazurokGapiClientGenomics.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkersResource extends StObject {
  
  /** The worker uses this method to retrieve the assigned operation and provide periodic status updates. */
  def checkIn(request: Id): Request[CheckInResponse] = js.native
  def checkIn(request: Key, body: CheckInRequest): Request[CheckInResponse] = js.native
}
