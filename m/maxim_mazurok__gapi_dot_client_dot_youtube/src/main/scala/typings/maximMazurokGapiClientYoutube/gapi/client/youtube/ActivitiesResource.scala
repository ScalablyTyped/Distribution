package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutube.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivitiesResource extends StObject {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[ActivityListResponse] = js.native
  def list(request: Callback): Request[ActivityListResponse] = js.native
}
