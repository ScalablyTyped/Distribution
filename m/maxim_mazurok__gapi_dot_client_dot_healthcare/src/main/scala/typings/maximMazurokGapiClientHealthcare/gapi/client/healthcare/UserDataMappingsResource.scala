package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.AccesstokenAlt
import typings.maximMazurokGapiClientHealthcare.anon.Callback
import typings.maximMazurokGapiClientHealthcare.anon.Fields
import typings.maximMazurokGapiClientHealthcare.anon.Name
import typings.maximMazurokGapiClientHealthcare.anon.Parent
import typings.maximMazurokGapiClientHealthcare.anon.UpdateMask
import typings.maximMazurokGapiClientHealthcare.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDataMappingsResource extends StObject {
  
  def archive(request: Callback, body: ArchiveUserDataMappingRequest): Request[js.Object] = js.native
  /** Archives the specified User data mapping. */
  def archive(request: Xgafv): Request[js.Object] = js.native
  
  /** Creates a new User data mapping in the parent consent store. */
  def create(request: AccesstokenAlt): Request[UserDataMapping] = js.native
  def create(request: Parent, body: UserDataMapping): Request[UserDataMapping] = js.native
  
  /** Deletes the specified User data mapping. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets the specified User data mapping. */
  def get(): Request[UserDataMapping] = js.native
  def get(request: Callback): Request[UserDataMapping] = js.native
  
  /** Lists the User data mappings in the specified consent store. */
  def list(): Request[ListUserDataMappingsResponse] = js.native
  def list(request: Fields): Request[ListUserDataMappingsResponse] = js.native
  
  def patch(request: Name, body: UserDataMapping): Request[UserDataMapping] = js.native
  /** Updates the specified User data mapping. */
  def patch(request: UpdateMask): Request[UserDataMapping] = js.native
}
