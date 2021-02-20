package typings.maximMazurokGapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStorage.anon.Fields
import typings.maximMazurokGapiClientStorage.anon.IfMetagenerationMatch
import typings.maximMazurokGapiClientStorage.anon.IfMetagenerationNotMatch
import typings.maximMazurokGapiClientStorage.anon.MaxResults
import typings.maximMazurokGapiClientStorage.anon.Oauthtoken
import typings.maximMazurokGapiClientStorage.anon.Permissions
import typings.maximMazurokGapiClientStorage.anon.PredefinedAcl
import typings.maximMazurokGapiClientStorage.anon.PredefinedDefaultObjectAcl
import typings.maximMazurokGapiClientStorage.anon.PrettyPrint
import typings.maximMazurokGapiClientStorage.anon.Projection
import typings.maximMazurokGapiClientStorage.anon.ProvisionalUserProject
import typings.maximMazurokGapiClientStorage.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketsResource extends StObject {
  
  /** Permanently deletes an empty bucket. */
  def delete(): Request[Unit] = js.native
  def delete(request: IfMetagenerationMatch): Request[Unit] = js.native
  
  /** Returns metadata for the specified bucket. */
  def get(): Request[Bucket] = js.native
  def get(request: IfMetagenerationNotMatch): Request[Bucket] = js.native
  
  /** Returns an IAM policy for the specified bucket. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: Oauthtoken): Request[Policy] = js.native
  
  /** Creates a new bucket. */
  def insert(request: PredefinedAcl): Request[Bucket] = js.native
  def insert(request: PredefinedDefaultObjectAcl, body: Bucket): Request[Bucket] = js.native
  
  /** Retrieves a list of buckets for a given project. */
  def list(): Request[Buckets] = js.native
  def list(request: MaxResults): Request[Buckets] = js.native
  
  /** Locks retention policy on a bucket. */
  def lockRetentionPolicy(): Request[Bucket] = js.native
  def lockRetentionPolicy(request: PrettyPrint): Request[Bucket] = js.native
  
  /** Patches a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def patch(request: Projection): Request[Bucket] = js.native
  def patch(request: ProvisionalUserProject, body: Bucket): Request[Bucket] = js.native
  
  def setIamPolicy(request: Fields, body: Policy): Request[Policy] = js.native
  /** Updates an IAM policy for the specified bucket. */
  def setIamPolicy(request: QuotaUser): Request[Policy] = js.native
  
  /** Tests a set of permissions on the given bucket to see which, if any, are held by the caller. */
  def testIamPermissions(): Request[TestIamPermissionsResponse] = js.native
  def testIamPermissions(request: Permissions): Request[TestIamPermissionsResponse] = js.native
  
  /** Updates a bucket. Changes to the bucket will be readable immediately after writing, but configuration changes may take time to propagate. */
  def update(request: Projection): Request[Bucket] = js.native
  def update(request: ProvisionalUserProject, body: Bucket): Request[Bucket] = js.native
}
