package typings.maximMazurokGapiClientKgsearch.gapi.client.kgsearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientKgsearch.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntitiesResource extends js.Object {
  
  /**
    * Searches Knowledge Graph for entities that match the constraints. A list of matched entities will be returned in response, which will be in JSON-LD format and compatible with
    * http://schema.org
    */
  def search(): Request[SearchResponse] = js.native
  def search(request: Accesstoken): Request[SearchResponse] = js.native
}
