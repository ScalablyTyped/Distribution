package typings.maximMazurokGapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientIam.anon.Fields
import typings.maximMazurokGapiClientIam.anon.Key
import typings.maximMazurokGapiClientIam.anon.KeyTypes
import typings.maximMazurokGapiClientIam.anon.Name
import typings.maximMazurokGapiClientIam.anon.Oauthtoken
import typings.maximMazurokGapiClientIam.anon.PrettyPrint
import typings.maximMazurokGapiClientIam.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeysResource extends StObject {
  
  def create(request: Fields, body: CreateServiceAccountKeyRequest): Request[ServiceAccountKey] = js.native
  /** Creates a ServiceAccountKey. */
  def create(request: Key): Request[ServiceAccountKey] = js.native
  
  /** Deletes a ServiceAccountKey. Deleting a service account key does not revoke short-lived credentials that have been issued based on the service account key. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Fields): Request[js.Object] = js.native
  
  def disable(request: Fields, body: DisableServiceAccountKeyRequest): Request[js.Object] = js.native
  /** Disable a ServiceAccountKey. A disabled service account key can be re-enabled with EnableServiceAccountKey. */
  def disable(request: Name): Request[js.Object] = js.native
  
  def enable(request: Fields, body: EnableServiceAccountKeyRequest): Request[js.Object] = js.native
  /** Enable a ServiceAccountKey. */
  def enable(request: Oauthtoken): Request[js.Object] = js.native
  
  /** Gets a ServiceAccountKey. */
  def get(): Request[ServiceAccountKey] = js.native
  def get(request: PrettyPrint): Request[ServiceAccountKey] = js.native
  
  /** Lists every ServiceAccountKey for a service account. */
  def list(): Request[ListServiceAccountKeysResponse] = js.native
  def list(request: KeyTypes): Request[ListServiceAccountKeysResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  def upload(request: Fields, body: UploadServiceAccountKeyRequest): Request[ServiceAccountKey] = js.native
  /**
    * Uploads the public key portion of a key pair that you manage, and associates the public key with a ServiceAccount. After you upload the public key, you can use the private key from
    * the key pair as a service account key.
    */
  def upload(request: QuotaUser): Request[ServiceAccountKey] = js.native
}
