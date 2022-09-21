package typings.maximMazurokGapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPeople.anon.Alt
import typings.maximMazurokGapiClientPeople.anon.PageSize
import typings.maximMazurokGapiClientPeople.anon.Query
import typings.maximMazurokGapiClientPeople.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherContactsResource extends StObject {
  
  def copyOtherContactToMyContactsGroup(request: Alt, body: CopyOtherContactToMyContactsGroupRequest): Request[Person] = js.native
  /** Copies an "Other contact" to a new contact in the user's "myContacts" group Mutate requests for the same user should be sent sequentially to avoid increased latency and failures. */
  def copyOtherContactToMyContactsGroup(request: QuotaUser): Request[Person] = js.native
  
  /**
    * List all "Other contacts", that is contacts that are not in a contact group. "Other contacts" are typically auto created contacts from interactions. Sync tokens expire 7 days after
    * the full sync. A request with an expired sync token will get an error with an [google.rpc.ErrorInfo](https://cloud.google.com/apis/design/errors#error_info) with reason
    * "EXPIRED_SYNC_TOKEN". In the case of such an error clients should make a full sync request without a `sync_token`. The first page of a full sync request has an additional quota. If
    * the quota is exceeded, a 429 error will be returned. This quota is fixed and can not be increased. When the `sync_token` is specified, resources deleted since the last sync will be
    * returned as a person with `PersonMetadata.deleted` set to true. When the `page_token` or `sync_token` is specified, all other request parameters must match the first call. Writes
    * may have a propagation delay of several minutes for sync requests. Incremental syncs are not intended for read-after-write use cases. See example usage at [List the user's other
    * contacts that have changed](/people/v1/other-contacts#list_the_users_other_contacts_that_have_changed).
    */
  def list(): Request[ListOtherContactsResponse] = js.native
  def list(request: PageSize): Request[ListOtherContactsResponse] = js.native
  
  /**
    * Provides a list of contacts in the authenticated user's other contacts that matches the search query. The query matches on a contact's `names`, `emailAddresses`, and `phoneNumbers`
    * fields that are from the OTHER_CONTACT source. **IMPORTANT**: Before searching, clients should send a warmup request with an empty query to update the cache. See
    * https://developers.google.com/people/v1/other-contacts#search_the_users_other_contacts
    */
  def search(): Request[SearchResponse] = js.native
  def search(request: Query): Request[SearchResponse] = js.native
}
