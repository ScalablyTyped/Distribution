package typings.maximMazurokGapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStorage.anon.AccessId
import typings.maximMazurokGapiClientStorage.anon.AccessIdAlt
import typings.maximMazurokGapiClientStorage.anon.PageToken
import typings.maximMazurokGapiClientStorage.anon.ProjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HmacKeysResource extends StObject {
  
  /** Creates a new HMAC key for the specified service account. */
  def create(): Request[HmacKey] = js.native
  def create(request: ProjectId): Request[HmacKey] = js.native
  
  /** Deletes an HMAC key. */
  def delete(): Request[Unit] = js.native
  def delete(request: AccessId): Request[Unit] = js.native
  
  /** Retrieves an HMAC key's metadata */
  def get(): Request[HmacKeyMetadata] = js.native
  def get(request: AccessId): Request[HmacKeyMetadata] = js.native
  
  /** Retrieves a list of HMAC keys matching the criteria. */
  def list(): Request[HmacKeysMetadata] = js.native
  def list(request: PageToken): Request[HmacKeysMetadata] = js.native
  
  /** Updates the state of an HMAC key. See the HMAC Key resource descriptor for valid states. */
  def update(request: AccessIdAlt): Request[HmacKeyMetadata] = js.native
  def update(request: AccessId, body: HmacKeyMetadata): Request[HmacKeyMetadata] = js.native
}
