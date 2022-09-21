package typings.maximMazurokGapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIam.anon.AccesstokenAlt
import typings.maximMazurokGapiClientIam.anon.Alt
import typings.maximMazurokGapiClientIam.anon.AltCallback
import typings.maximMazurokGapiClientIam.anon.CallbackFields
import typings.maximMazurokGapiClientIam.anon.Etag
import typings.maximMazurokGapiClientIam.anon.Fields
import typings.maximMazurokGapiClientIam.anon.FieldsKey
import typings.maximMazurokGapiClientIam.anon.PageToken
import typings.maximMazurokGapiClientIam.anon.ShowDeleted
import typings.maximMazurokGapiClientIam.anon.UpdateMask
import typings.maximMazurokGapiClientIam.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RolesResource extends StObject {
  
  def create(request: AccesstokenAlt, body: CreateRoleRequest): Request[Role] = js.native
  /** Creates a new custom Role. */
  def create(request: Xgafv): Request[Role] = js.native
  
  /**
    * Deletes a custom Role. When you delete a custom role, the following changes occur immediately: * You cannot bind a principal to the custom role in an IAM Policy. * Existing bindings
    * to the custom role are not changed, but they have no effect. * By default, the response from ListRoles does not include the custom role. You have 7 days to undelete the custom role.
    * After 7 days, the following changes occur: * The custom role is permanently deleted and cannot be recovered. * If an IAM policy contains a binding to the custom role, the binding is
    * permanently removed.
    */
  def delete(): Request[Role] = js.native
  def delete(request: Etag): Request[Role] = js.native
  
  /** Gets the definition of a Role. */
  def get(): Request[Role] = js.native
  def get(request: Fields): Request[Role] = js.native
  
  /** Lists every predefined Role that IAM supports, or every custom role that is defined for an organization or project. */
  def list(): Request[ListRolesResponse] = js.native
  def list(request: PageToken): Request[ListRolesResponse] = js.native
  def list(request: ShowDeleted): Request[ListRolesResponse] = js.native
  
  /** Updates the definition of a custom Role. */
  def patch(request: AltCallback): Request[Role] = js.native
  def patch(request: UpdateMask, body: Role): Request[Role] = js.native
  
  def queryGrantableRoles(request: Alt, body: QueryGrantableRolesRequest): Request[QueryGrantableRolesResponse] = js.native
  /** Lists roles that can be granted on a Google Cloud resource. A role is grantable if the IAM policy for the resource can contain bindings to the role. */
  def queryGrantableRoles(request: FieldsKey): Request[QueryGrantableRolesResponse] = js.native
  
  /** Undeletes a custom Role. */
  def undelete(request: CallbackFields): Request[Role] = js.native
  def undelete(request: Fields, body: UndeleteRoleRequest): Request[Role] = js.native
}
