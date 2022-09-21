package typings.maximMazurokGapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPeople.anon.AccesstokenAlt
import typings.maximMazurokGapiClientPeople.anon.Alt
import typings.maximMazurokGapiClientPeople.anon.AltCallback
import typings.maximMazurokGapiClientPeople.anon.Key
import typings.maximMazurokGapiClientPeople.anon.MergeSources
import typings.maximMazurokGapiClientPeople.anon.PersonFields
import typings.maximMazurokGapiClientPeople.anon.ReadMask
import typings.maximMazurokGapiClientPeople.anon.RequestMaskincludeField
import typings.maximMazurokGapiClientPeople.anon.Resource
import typings.maximMazurokGapiClientPeople.anon.ResourceName
import typings.maximMazurokGapiClientPeople.anon.ResourceNames
import typings.maximMazurokGapiClientPeople.anon.Sources
import typings.maximMazurokGapiClientPeople.anon.UpdatePersonFields
import typings.maximMazurokGapiClientPeople.anon.UploadType
import typings.maximMazurokGapiClientPeople.anon.Uploadprotocol
import typings.maximMazurokGapiClientPeople.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeopleResource extends StObject {
  
  def batchCreateContacts(request: Key, body: BatchCreateContactsRequest): Request[BatchCreateContactsResponse] = js.native
  /** Create a batch of new contacts and return the PersonResponses for the newly Mutate requests for the same user should be sent sequentially to avoid increased latency and failures. */
  def batchCreateContacts(request: Resource): Request[BatchCreateContactsResponse] = js.native
  
  def batchDeleteContacts(request: Key, body: BatchDeleteContactsRequest): Request[js.Object] = js.native
  /** Delete a batch of contacts. Any non-contact data will not be deleted. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures. */
  def batchDeleteContacts(request: UploadType): Request[js.Object] = js.native
  
  def batchUpdateContacts(request: Key, body: BatchUpdateContactsRequest): Request[BatchUpdateContactsResponse] = js.native
  /**
    * Update a batch of contacts and return a map of resource names to PersonResponses for the updated contacts. Mutate requests for the same user should be sent sequentially to avoid
    * increased latency and failures.
    */
  def batchUpdateContacts(request: Uploadprotocol): Request[BatchUpdateContactsResponse] = js.native
  
  var connections: ConnectionsResource = js.native
  
  /**
    * Create a new contact and return the person resource for that contact. The request returns a 400 error if more than one field is specified on a field that is a singleton for contact
    * sources: * biographies * birthdays * genders * names Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    */
  def createContact(request: PersonFields): Request[Person] = js.native
  def createContact(request: Sources, body: Person): Request[Person] = js.native
  
  /** Delete a contact person. Any non-contact data will not be deleted. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures. */
  def deleteContact(): Request[js.Object] = js.native
  def deleteContact(request: Alt): Request[js.Object] = js.native
  
  /** Delete a contact's photo. Mutate requests for the same user should be done sequentially to avoid // lock contention. */
  def deleteContactPhoto(): Request[DeleteContactPhotoResponse] = js.native
  def deleteContactPhoto(request: ResourceName): Request[DeleteContactPhotoResponse] = js.native
  
  /**
    * Provides information about a person by specifying a resource name. Use `people/me` to indicate the authenticated user. The request returns a 400 error if 'personFields' is not
    * specified.
    */
  def get(): Request[Person] = js.native
  def get(request: RequestMaskincludeField): Request[Person] = js.native
  
  /**
    * Provides information about a list of specific people by specifying a list of requested resource names. Use `people/me` to indicate the authenticated user. The request returns a 400
    * error if 'personFields' is not specified.
    */
  def getBatchGet(): Request[GetPeopleResponse] = js.native
  def getBatchGet(request: ResourceNames): Request[GetPeopleResponse] = js.native
  
  /**
    * Provides a list of domain profiles and domain contacts in the authenticated user's domain directory. When the `sync_token` is specified, resources deleted since the last sync will
    * be returned as a person with `PersonMetadata.deleted` set to true. When the `page_token` or `sync_token` is specified, all other request parameters must match the first call. Writes
    * may have a propagation delay of several minutes for sync requests. Incremental syncs are not intended for read-after-write use cases. See example usage at [List the directory people
    * that have changed](/people/v1/directory#list_the_directory_people_that_have_changed).
    */
  def listDirectoryPeople(): Request[ListDirectoryPeopleResponse] = js.native
  def listDirectoryPeople(request: MergeSources): Request[ListDirectoryPeopleResponse] = js.native
  
  /**
    * Provides a list of contacts in the authenticated user's grouped contacts that matches the search query. The query matches on a contact's `names`, `nickNames`, `emailAddresses`,
    * `phoneNumbers`, and `organizations` fields that are from the CONTACT source. **IMPORTANT**: Before searching, clients should send a warmup request with an empty query to update the
    * cache. See https://developers.google.com/people/v1/contacts#search_the_users_contacts
    */
  def searchContacts(): Request[SearchResponse] = js.native
  def searchContacts(request: ReadMask): Request[SearchResponse] = js.native
  
  /** Provides a list of domain profiles and domain contacts in the authenticated user's domain directory that match the search query. */
  def searchDirectoryPeople(): Request[SearchDirectoryPeopleResponse] = js.native
  def searchDirectoryPeople(request: Xgafv): Request[SearchDirectoryPeopleResponse] = js.native
  
  def updateContact(request: AccesstokenAlt, body: Person): Request[Person] = js.native
  /**
    * Update contact data for an existing contact person. Any non-contact data will not be modified. Any non-contact data in the person to update will be ignored. All fields specified in
    * the `update_mask` will be replaced. The server returns a 400 error if `person.metadata.sources` is not specified for the contact to be updated or if there is no contact source. The
    * server returns a 400 error with reason `"failedPrecondition"` if `person.metadata.sources.etag` is different than the contact's etag, which indicates the contact has changed since
    * its data was read. Clients should get the latest person and merge their updates into the latest person. The server returns a 400 error if `memberships` are being updated and there
    * are no contact group memberships specified on the person. The server returns a 400 error if more than one field is specified on a field that is a singleton for contact sources: *
    * biographies * birthdays * genders * names Mutate requests for the same user should be sent sequentially to avoid increased latency and failures.
    */
  def updateContact(request: UpdatePersonFields): Request[Person] = js.native
  
  /** Update a contact's photo. Mutate requests for the same user should be sent sequentially to avoid increased latency and failures. */
  def updateContactPhoto(request: AltCallback): Request[UpdateContactPhotoResponse] = js.native
  def updateContactPhoto(request: Alt, body: UpdateContactPhotoRequest): Request[UpdateContactPhotoResponse] = js.native
}
