package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRealtimebidding.anon.Callback
import typings.maximMazurokGapiClientRealtimebidding.anon.FieldsKey
import typings.maximMazurokGapiClientRealtimebidding.anon.KeyName
import typings.maximMazurokGapiClientRealtimebidding.anon.KeyOauthtoken
import typings.maximMazurokGapiClientRealtimebidding.anon.NameOauthtoken
import typings.maximMazurokGapiClientRealtimebidding.anon.PageSize
import typings.maximMazurokGapiClientRealtimebidding.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserListsResource extends StObject {
  
  /** Change the status of a user list to CLOSED. This prevents new users from being added to the user list. */
  def close(request: FieldsKey): Request[UserList] = js.native
  def close(request: QuotaUser, body: CloseUserListRequest): Request[UserList] = js.native
  
  def create(request: Callback, body: UserList): Request[UserList] = js.native
  /** Create a new user list. */
  def create(request: KeyOauthtoken): Request[UserList] = js.native
  
  /** Gets a user list by its name. */
  def get(): Request[UserList] = js.native
  def get(request: QuotaUser): Request[UserList] = js.native
  
  /**
    * Gets remarketing tag for a buyer. A remarketing tag is a piece of JavaScript code that can be placed on a web page. When a user visits a page containing a remarketing tag, Google
    * adds the user to a user list.
    */
  def getRemarketingTag(): Request[GetRemarketingTagResponse] = js.native
  def getRemarketingTag(request: QuotaUser): Request[GetRemarketingTagResponse] = js.native
  
  /** Lists the user lists visible to the current user. */
  def list(): Request[ListUserListsResponse] = js.native
  def list(request: PageSize): Request[ListUserListsResponse] = js.native
  
  /** Change the status of a user list to OPEN. This allows new users to be added to the user list. */
  def open(request: KeyName): Request[UserList] = js.native
  def open(request: QuotaUser, body: OpenUserListRequest): Request[UserList] = js.native
  
  /** Update the given user list. Only user lists with URLRestrictions can be updated. */
  def update(request: NameOauthtoken): Request[UserList] = js.native
  def update(request: QuotaUser, body: UserList): Request[UserList] = js.native
}
