package typings.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFactchecktools.anon.Alt
import typings.maximMazurokGapiClientFactchecktools.anon.Callback
import typings.maximMazurokGapiClientFactchecktools.anon.Fields
import typings.maximMazurokGapiClientFactchecktools.anon.Key
import typings.maximMazurokGapiClientFactchecktools.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagesResource extends js.Object {
  
  /** Create `ClaimReview` markup on a page. */
  def create(request: Alt): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def create(request: Callback, body: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  
  /** Delete all `ClaimReview` markup on a page. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  /** Get all `ClaimReview` markup on a page. */
  def get(): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  def get(request: Fields): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  
  /** List the `ClaimReview` markup pages for a specific URL or for an organization. */
  def list(): Request[GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] = js.native
  def list(request: Key): Request[GoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] = js.native
  
  def update(request: Fields, body: GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
  /**
    * Update for all `ClaimReview` markup on a page Note that this is a full update. To retain the existing `ClaimReview` markup on a page, first perform a Get operation, then modify the
    * returned markup, and finally call Update with the entire `ClaimReview` markup as the body.
    */
  def update(request: Name): Request[GoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] = js.native
}
