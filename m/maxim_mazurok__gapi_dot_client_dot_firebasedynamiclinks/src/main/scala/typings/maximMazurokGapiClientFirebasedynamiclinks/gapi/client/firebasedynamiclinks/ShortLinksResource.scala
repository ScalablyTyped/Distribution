package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebasedynamiclinks.anon.Alt
import typings.maximMazurokGapiClientFirebasedynamiclinks.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortLinksResource extends StObject {
  
  def create(request: Alt, body: CreateShortDynamicLinkRequest): Request[CreateShortDynamicLinkResponse] = js.native
  /**
    * Creates a short Dynamic Link given either a valid long Dynamic Link or details such as Dynamic Link domain, Android and iOS app information. The created short Dynamic Link will not
    * expire. Repeated calls with the same long Dynamic Link or Dynamic Link information will produce the same short Dynamic Link. The Dynamic Link domain in the request must be owned by
    * requester's Firebase project.
    */
  def create(request: Callback): Request[CreateShortDynamicLinkResponse] = js.native
}
