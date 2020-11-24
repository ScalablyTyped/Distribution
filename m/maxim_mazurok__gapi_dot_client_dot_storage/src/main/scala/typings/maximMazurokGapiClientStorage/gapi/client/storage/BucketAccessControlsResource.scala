package typings.maximMazurokGapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStorage.anon.Alt
import typings.maximMazurokGapiClientStorage.anon.Fields
import typings.maximMazurokGapiClientStorage.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketAccessControlsResource extends js.Object {
  
  /** Permanently deletes the ACL entry for the specified entity on the specified bucket. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Returns the ACL entry for the specified entity on the specified bucket. */
  def get(): Request[BucketAccessControl] = js.native
  def get(request: Alt): Request[BucketAccessControl] = js.native
  
  /** Creates a new ACL entry on the specified bucket. */
  def insert(request: typings.maximMazurokGapiClientStorage.anon.Bucket): Request[BucketAccessControl] = js.native
  def insert(request: Fields, body: BucketAccessControl): Request[BucketAccessControl] = js.native
  
  /** Retrieves ACL entries on the specified bucket. */
  def list(): Request[BucketAccessControls] = js.native
  def list(request: Fields): Request[BucketAccessControls] = js.native
  
  def patch(request: Alt, body: BucketAccessControl): Request[BucketAccessControl] = js.native
  /** Patches an ACL entry on the specified bucket. */
  def patch(request: Key): Request[BucketAccessControl] = js.native
  
  def update(request: Alt, body: BucketAccessControl): Request[BucketAccessControl] = js.native
  /** Updates an ACL entry on the specified bucket. */
  def update(request: Key): Request[BucketAccessControl] = js.native
}
