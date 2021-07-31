package typings.maximMazurokGapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPeople.anon.Alt
import typings.maximMazurokGapiClientPeople.anon.MergeSources
import typings.maximMazurokGapiClientPeople.anon.PersonFields
import typings.maximMazurokGapiClientPeople.anon.Query
import typings.maximMazurokGapiClientPeople.anon.RequestMaskincludeField
import typings.maximMazurokGapiClientPeople.anon.Resource
import typings.maximMazurokGapiClientPeople.anon.ResourceName
import typings.maximMazurokGapiClientPeople.anon.ResourceNames
import typings.maximMazurokGapiClientPeople.anon.Sources
import typings.maximMazurokGapiClientPeople.anon.UpdatePersonFields
import typings.maximMazurokGapiClientPeople.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeopleResource extends StObject {
  
  var connections: ConnectionsResource = js.native
  
  /**
    * Create a new contact and return the person resource for that contact. The request returns a 400 error if more than one field is specified on a field that is a singleton for contact
    * sources: * biographies * birthdays * genders * names
    */
  def createContact(request: PersonFields): Request[Person] = js.native
  def createContact(request: Sources, body: Person): Request[Person] = js.native
  
  /** Delete a contact person. Any non-contact data will not be deleted. */
  def deleteContact(): Request[js.Object] = js.native
  def deleteContact(request: Alt): Request[js.Object] = js.native
  
  /** Delete a contact's photo. */
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
  
  /** Provides a list of domain profiles and domain contacts in the authenticated user's domain directory. */
  def listDirectoryPeople(): Request[ListDirectoryPeopleResponse] = js.native
  def listDirectoryPeople(request: MergeSources): Request[ListDirectoryPeopleResponse] = js.native
  
  /** Provides a list of domain profiles and domain contacts in the authenticated user's domain directory that match the search query. */
  def searchDirectoryPeople(): Request[SearchDirectoryPeopleResponse] = js.native
  def searchDirectoryPeople(request: Query): Request[SearchDirectoryPeopleResponse] = js.native
  
  /**
    * Update contact data for an existing contact person. Any non-contact data will not be modified. Any non-contact data in the person to update will be ignored. All fields specified in
    * the `update_mask` will be replaced. The server returns a 400 error if `person.metadata.sources` is not specified for the contact to be updated or if there is no contact source. The
    * server returns a 400 error with reason `"failedPrecondition"` if `person.metadata.sources.etag` is different than the contact's etag, which indicates the contact has changed since
    * its data was read. Clients should get the latest person and merge their updates into the latest person. The server returns a 400 error if `memberships` are being updated and there
    * are no contact group memberships specified on the person. The server returns a 400 error if more than one field is specified on a field that is a singleton for contact sources: *
    * biographies * birthdays * genders * names
    */
  def updateContact(request: Resource): Request[Person] = js.native
  def updateContact(request: UpdatePersonFields, body: Person): Request[Person] = js.native
  
  def updateContactPhoto(request: Alt, body: UpdateContactPhotoRequest): Request[UpdateContactPhotoResponse] = js.native
  /** Update a contact's photo. */
  def updateContactPhoto(request: UploadType): Request[UpdateContactPhotoResponse] = js.native
}
