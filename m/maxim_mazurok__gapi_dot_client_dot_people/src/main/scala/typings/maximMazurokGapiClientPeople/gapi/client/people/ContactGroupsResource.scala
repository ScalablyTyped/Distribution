package typings.maximMazurokGapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPeople.anon.Alt
import typings.maximMazurokGapiClientPeople.anon.Callback
import typings.maximMazurokGapiClientPeople.anon.DeleteContacts
import typings.maximMazurokGapiClientPeople.anon.Fields
import typings.maximMazurokGapiClientPeople.anon.GroupFields
import typings.maximMazurokGapiClientPeople.anon.Key
import typings.maximMazurokGapiClientPeople.anon.Oauthtoken
import typings.maximMazurokGapiClientPeople.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactGroupsResource extends StObject {
  
  /** Get a list of contact groups owned by the authenticated user by specifying a list of contact group resource names. */
  def batchGet(): Request[BatchGetContactGroupsResponse] = js.native
  def batchGet(request: Callback): Request[BatchGetContactGroupsResponse] = js.native
  
  /**
    * Create a new contact group owned by the authenticated user. Created contact group names must be unique to the users contact groups. Attempting to create a group with a duplicate
    * name will return a HTTP 409 error. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    */
  def create(request: Fields): Request[ContactGroup] = js.native
  def create(request: Key, body: CreateContactGroupRequest): Request[ContactGroup] = js.native
  
  /**
    * Delete an existing contact group owned by the authenticated user by specifying a contact group resource name. Mutate requests for the same user should be sent sequentially to avoid
    * increased latency and failures.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: DeleteContacts): Request[js.Object] = js.native
  
  /** Get a specific contact group owned by the authenticated user by specifying a contact group resource name. */
  def get(): Request[ContactGroup] = js.native
  def get(request: GroupFields): Request[ContactGroup] = js.native
  
  /** List all contact groups owned by the authenticated user. Members of the contact groups are not populated. */
  def list(): Request[ListContactGroupsResponse] = js.native
  def list(request: Oauthtoken): Request[ListContactGroupsResponse] = js.native
  
  var members: MembersResource = js.native
  
  def update(request: Alt, body: UpdateContactGroupRequest): Request[ContactGroup] = js.native
  /**
    * Update the name of an existing contact group owned by the authenticated user. Updated contact group names must be unique to the users contact groups. Attempting to create a group
    * with a duplicate name will return a HTTP 409 error. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    */
  def update(request: PrettyPrint): Request[ContactGroup] = js.native
}
