package typings.maximMazurokGapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStorage.anon.Alt
import typings.maximMazurokGapiClientStorage.anon.AltBucket
import typings.maximMazurokGapiClientStorage.anon.Fields
import typings.maximMazurokGapiClientStorage.anon.IfMetagenerationMatch
import typings.maximMazurokGapiClientStorage.anon.UserProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultObjectAccessControlsResource extends StObject {
  
  /** Permanently deletes the default object ACL entry for the specified entity on the specified bucket. */
  def delete(): Request[Unit] = js.native
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Returns the default object ACL entry for the specified entity on the specified bucket. */
  def get(): Request[ObjectAccessControl] = js.native
  def get(request: Alt): Request[ObjectAccessControl] = js.native
  
  def insert(request: Fields, body: ObjectAccessControl): Request[ObjectAccessControl] = js.native
  /** Creates a new default object ACL entry on the specified bucket. */
  def insert(request: UserProject): Request[ObjectAccessControl] = js.native
  
  /** Retrieves default object ACL entries on the specified bucket. */
  def list(): Request[ObjectAccessControls] = js.native
  def list(request: IfMetagenerationMatch): Request[ObjectAccessControls] = js.native
  
  /** Patches a default object ACL entry on the specified bucket. */
  def patch(request: AltBucket): Request[ObjectAccessControl] = js.native
  def patch(request: Alt, body: ObjectAccessControl): Request[ObjectAccessControl] = js.native
  
  /** Updates a default object ACL entry on the specified bucket. */
  def update(request: AltBucket): Request[ObjectAccessControl] = js.native
  def update(request: Alt, body: ObjectAccessControl): Request[ObjectAccessControl] = js.native
}
