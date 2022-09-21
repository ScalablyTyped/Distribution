package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.Callback
import typings.maximMazurokGapiClientHealthcare.anon.Fields
import typings.maximMazurokGapiClientHealthcare.anon.Filter
import typings.maximMazurokGapiClientHealthcare.anon.Name
import typings.maximMazurokGapiClientHealthcare.anon.Parent
import typings.maximMazurokGapiClientHealthcare.anon.PrettyPrint
import typings.maximMazurokGapiClientHealthcare.anon.QuotaUser
import typings.maximMazurokGapiClientHealthcare.anon.Resource
import typings.maximMazurokGapiClientHealthcare.anon.UploadType
import typings.maximMazurokGapiClientHealthcare.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsentsResource extends StObject {
  
  def activate(request: Callback, body: ActivateConsentRequest): Request[Consent] = js.native
  /**
    * Activates the latest revision of the specified Consent by committing a new revision with `state` updated to `ACTIVE`. If the latest revision of the specified Consent is in the
    * `ACTIVE` state, no new revision is committed. A FAILED_PRECONDITION error occurs if the latest revision of the specified Consent is in the `REJECTED` or `REVOKED` state.
    */
  def activate(request: PrettyPrint): Request[Consent] = js.native
  
  def create(request: Parent, body: Consent): Request[Consent] = js.native
  /** Creates a new Consent in the parent consent store. */
  def create(request: QuotaUser): Request[Consent] = js.native
  
  /**
    * Deletes the Consent and its revisions. To keep a record of the Consent but mark it inactive, see [RevokeConsent]. To delete a revision of a Consent, see [DeleteConsentRevision].
    * This operation does not delete the related Consent artifact.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Deletes the specified revision of a Consent. An INVALID_ARGUMENT error occurs if the specified revision is the latest revision. */
  def deleteRevision(): Request[js.Object] = js.native
  def deleteRevision(request: Callback): Request[js.Object] = js.native
  
  /** Gets the specified revision of a Consent, or the latest revision if `revision_id` is not specified in the resource name. */
  def get(): Request[Consent] = js.native
  def get(request: Callback): Request[Consent] = js.native
  
  /** Lists the Consent in the given consent store, returning each Consent's latest revision. */
  def list(): Request[ListConsentsResponse] = js.native
  def list(request: Fields): Request[ListConsentsResponse] = js.native
  
  /** Lists the revisions of the specified Consent in reverse chronological order. */
  def listRevisions(): Request[ListConsentRevisionsResponse] = js.native
  def listRevisions(request: Filter): Request[ListConsentRevisionsResponse] = js.native
  
  def patch(request: Name, body: Consent): Request[Consent] = js.native
  /**
    * Updates the latest revision of the specified Consent by committing a new revision with the changes. A FAILED_PRECONDITION error occurs if the latest revision of the specified
    * Consent is in the `REJECTED` or `REVOKED` state.
    */
  def patch(request: Resource): Request[Consent] = js.native
  
  def reject(request: Callback, body: RejectConsentRequest): Request[Consent] = js.native
  /**
    * Rejects the latest revision of the specified Consent by committing a new revision with `state` updated to `REJECTED`. If the latest revision of the specified Consent is in the
    * `REJECTED` state, no new revision is committed. A FAILED_PRECONDITION error occurs if the latest revision of the specified Consent is in the `ACTIVE` or `REVOKED` state.
    */
  def reject(request: UploadType): Request[Consent] = js.native
  
  def revoke(request: Callback, body: RevokeConsentRequest): Request[Consent] = js.native
  /**
    * Revokes the latest revision of the specified Consent by committing a new revision with `state` updated to `REVOKED`. If the latest revision of the specified Consent is in the
    * `REVOKED` state, no new revision is committed. A FAILED_PRECONDITION error occurs if the latest revision of the given consent is in `DRAFT` or `REJECTED` state.
    */
  def revoke(request: Uploadprotocol): Request[Consent] = js.native
}
