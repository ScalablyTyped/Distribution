package typings.maximMazurokGapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLogging.anon.Accesstoken
import typings.maximMazurokGapiClientLogging.anon.BucketId
import typings.maximMazurokGapiClientLogging.anon.Fields
import typings.maximMazurokGapiClientLogging.anon.Name
import typings.maximMazurokGapiClientLogging.anon.Oauthtoken
import typings.maximMazurokGapiClientLogging.anon.PrettyPrint
import typings.maximMazurokGapiClientLogging.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketsResource extends StObject {
  
  /** Creates a bucket that can be used to store log entries. Once a bucket has been created, the region cannot be changed. */
  def create(request: BucketId): Request[LogBucket] = js.native
  def create(request: Oauthtoken, body: LogBucket): Request[LogBucket] = js.native
  
  /** Deletes a bucket. Moves the bucket to the DELETE_REQUESTED state. After 7 days, the bucket will be purged and all logs in the bucket will be permanently deleted. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Gets a bucket. */
  def get(): Request[LogBucket] = js.native
  def get(request: Accesstoken): Request[LogBucket] = js.native
  
  /** Lists buckets. */
  def list(): Request[ListBucketsResponse] = js.native
  def list(request: Fields): Request[ListBucketsResponse] = js.native
  
  def patch(request: Name, body: LogBucket): Request[LogBucket] = js.native
  /**
    * Updates a bucket. This method replaces the following fields in the existing bucket with values from the new bucket: retention_periodIf the retention period is decreased and the
    * bucket is locked, FAILED_PRECONDITION will be returned.If the bucket has a LifecycleState of DELETE_REQUESTED, FAILED_PRECONDITION will be returned.A buckets region may not be
    * modified after it is created.
    */
  def patch(request: PrettyPrint): Request[LogBucket] = js.native
  
  def undelete(request: Accesstoken, body: UndeleteBucketRequest): Request[js.Object] = js.native
  /** Undeletes a bucket. A bucket that has been deleted may be undeleted within the grace period of 7 days. */
  def undelete(request: QuotaUser): Request[js.Object] = js.native
  
  var views: ViewsResource = js.native
}
