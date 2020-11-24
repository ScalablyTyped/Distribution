package typings.maximMazurokGapiClientLicensing.gapi.client.licensing

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLicensing.anon.Accesstoken
import typings.maximMazurokGapiClientLicensing.anon.Alt
import typings.maximMazurokGapiClientLicensing.anon.Callback
import typings.maximMazurokGapiClientLicensing.anon.CustomerId
import typings.maximMazurokGapiClientLicensing.anon.Fields
import typings.maximMazurokGapiClientLicensing.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseAssignmentsResource extends js.Object {
  
  /** Revoke a license. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Get a specific user's license by product SKU. */
  def get(): Request[LicenseAssignment] = js.native
  def get(request: Accesstoken): Request[LicenseAssignment] = js.native
  
  /** Assign a license. */
  def insert(request: Alt): Request[LicenseAssignment] = js.native
  def insert(request: Callback, body: LicenseAssignmentInsert): Request[LicenseAssignment] = js.native
  
  /** List all users assigned licenses for a specific product SKU. */
  def listForProduct(): Request[LicenseAssignmentList] = js.native
  def listForProduct(request: CustomerId): Request[LicenseAssignmentList] = js.native
  
  /** List all users assigned licenses for a specific product SKU. */
  def listForProductAndSku(): Request[LicenseAssignmentList] = js.native
  def listForProductAndSku(request: Fields): Request[LicenseAssignmentList] = js.native
  
  def patch(request: Accesstoken, body: LicenseAssignment): Request[LicenseAssignment] = js.native
  /** Reassign a user's product SKU with a different SKU in the same product. This method supports patch semantics. */
  def patch(request: Key): Request[LicenseAssignment] = js.native
  
  def update(request: Accesstoken, body: LicenseAssignment): Request[LicenseAssignment] = js.native
  /** Reassign a user's product SKU with a different SKU in the same product. */
  def update(request: Key): Request[LicenseAssignment] = js.native
}
