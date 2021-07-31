package typings.maximMazurokGapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebasedynamiclinks.anon.Accesstoken
import typings.maximMazurokGapiClientFirebasedynamiclinks.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedShortLinksResource extends StObject {
  
  /**
    * Creates a managed short Dynamic Link given either a valid long Dynamic Link or details such as Dynamic Link domain, Android and iOS app information. The created short Dynamic Link
    * will not expire. This differs from CreateShortDynamicLink in the following ways: - The request will also contain a name for the link (non unique name for the front end). - The
    * response must be authenticated with an auth token (generated with the admin service account). - The link will appear in the FDL list of links in the console front end. The Dynamic
    * Link domain in the request must be owned by requester's Firebase project.
    */
  def create(request: Accesstoken): Request[CreateManagedShortLinkResponse] = js.native
  def create(request: Alt, body: CreateManagedShortLinkRequest): Request[CreateManagedShortLinkResponse] = js.native
}
