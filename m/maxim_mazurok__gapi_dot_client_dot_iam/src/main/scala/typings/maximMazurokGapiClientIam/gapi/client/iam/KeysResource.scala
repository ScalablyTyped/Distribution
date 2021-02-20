package typings.maximMazurokGapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIam.anon.AccesstokenAlt
import typings.maximMazurokGapiClientIam.anon.KeyTypes
import typings.maximMazurokGapiClientIam.anon.Name
import typings.maximMazurokGapiClientIam.anon.PublicKeyType
import typings.maximMazurokGapiClientIam.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeysResource extends StObject {
  
  def create(request: Name, body: CreateServiceAccountKeyRequest): Request[ServiceAccountKey] = js.native
  /** Creates a ServiceAccountKey. */
  def create(request: Xgafv): Request[ServiceAccountKey] = js.native
  
  /** Deletes a ServiceAccountKey. Deleting a service account key does not revoke short-lived credentials that have been issued based on the service account key. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets a ServiceAccountKey. */
  def get(): Request[ServiceAccountKey] = js.native
  def get(request: PublicKeyType): Request[ServiceAccountKey] = js.native
  
  /** Lists every ServiceAccountKey for a service account. */
  def list(): Request[ListServiceAccountKeysResponse] = js.native
  def list(request: KeyTypes): Request[ListServiceAccountKeysResponse] = js.native
  
  /** Creates a ServiceAccountKey, using a public key that you provide. */
  def upload(request: AccesstokenAlt): Request[ServiceAccountKey] = js.native
  def upload(request: Name, body: UploadServiceAccountKeyRequest): Request[ServiceAccountKey] = js.native
}
