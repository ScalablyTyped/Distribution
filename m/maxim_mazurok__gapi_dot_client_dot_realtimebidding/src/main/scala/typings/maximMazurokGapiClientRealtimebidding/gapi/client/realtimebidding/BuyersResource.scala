package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRealtimebidding.anon.PageToken
import typings.maximMazurokGapiClientRealtimebidding.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyersResource extends StObject {
  
  var creatives: CreativesResource = js.native
  
  /** Gets a buyer account by its name. */
  def get(): Request[Buyer] = js.native
  def get(request: PrettyPrint): Request[Buyer] = js.native
  
  /**
    * Gets remarketing tag for a buyer. A remarketing tag is a piece of JavaScript code that can be placed on a web page. When a user visits a page containing a remarketing tag, Google
    * adds the user to a user list.
    */
  def getRemarketingTag(): Request[GetRemarketingTagResponse] = js.native
  def getRemarketingTag(request: PrettyPrint): Request[GetRemarketingTagResponse] = js.native
  
  /** Lists all buyer account information the calling buyer user or service account is permissioned to manage. */
  def list(): Request[ListBuyersResponse] = js.native
  def list(request: PageToken): Request[ListBuyersResponse] = js.native
  
  var userLists: UserListsResource = js.native
}
