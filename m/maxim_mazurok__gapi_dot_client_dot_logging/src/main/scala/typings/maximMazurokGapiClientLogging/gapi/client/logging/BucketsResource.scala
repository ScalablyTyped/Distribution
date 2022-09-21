package typings.maximMazurokGapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLogging.anon.BucketId
import typings.maximMazurokGapiClientLogging.anon.Callback
import typings.maximMazurokGapiClientLogging.anon.Fields
import typings.maximMazurokGapiClientLogging.anon.Name
import typings.maximMazurokGapiClientLogging.anon.Resource
import typings.maximMazurokGapiClientLogging.anon.UploadType
import typings.maximMazurokGapiClientLogging.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketsResource extends StObject {
  
  /** Creates a log bucket that can be used to store log entries. After a bucket has been created, the bucket's location cannot be changed. */
  def create(request: BucketId): Request[LogBucket] = js.native
  def create(request: UploadType, body: LogBucket): Request[LogBucket] = js.native
  
  /**
    * Deletes a log bucket.Changes the bucket's lifecycle_state to the DELETE_REQUESTED state. After 7 days, the bucket will be purged and all log entries in the bucket will be
    * permanently deleted.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets a log bucket. */
  def get(): Request[LogBucket] = js.native
  def get(request: Callback): Request[LogBucket] = js.native
  
  /** Lists log buckets. */
  def list(): Request[ListBucketsResponse] = js.native
  def list(request: Fields): Request[ListBucketsResponse] = js.native
  
  def patch(request: Name, body: LogBucket): Request[LogBucket] = js.native
  /**
    * Updates a log bucket. This method replaces the following fields in the existing bucket with values from the new bucket: retention_periodIf the retention period is decreased and the
    * bucket is locked, FAILED_PRECONDITION will be returned.If the bucket has a lifecycle_state of DELETE_REQUESTED, then FAILED_PRECONDITION will be returned.After a bucket has been
    * created, the bucket's location cannot be changed.
    */
  def patch(request: Resource): Request[LogBucket] = js.native
  
  def undelete(request: Callback, body: UndeleteBucketRequest): Request[js.Object] = js.native
  /** Undeletes a log bucket. A bucket that has been deleted can be undeleted within the grace period of 7 days. */
  def undelete(request: Uploadprotocol): Request[js.Object] = js.native
  
  var views: ViewsResource = js.native
}
