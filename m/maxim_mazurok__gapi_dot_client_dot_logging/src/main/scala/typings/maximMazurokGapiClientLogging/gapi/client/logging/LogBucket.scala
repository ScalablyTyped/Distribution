package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogBucket extends StObject {
  
  /** Output only. The creation timestamp of the bucket. This is not set for any of the default buckets. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Describes this bucket. */
  var description: js.UndefOr[String] = js.native
  
  /** Output only. The bucket lifecycle state. */
  var lifecycleState: js.UndefOr[String] = js.native
  
  /** Whether the bucket has been locked. The retention period on a locked bucket may not be changed. Locked buckets may only be deleted if they are empty. */
  var locked: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. The resource name of the bucket. For example: "projects/my-project-id/locations/my-location/buckets/my-bucket-id The supported locations are: "global"For the location
    * of global it is unspecified where logs are actually stored. Once a bucket has been created, the location can not be changed.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at
    * bucket creation time, the default time of 30 days will be used.
    */
  var retentionDays: js.UndefOr[Double] = js.native
  
  /** Output only. The last update timestamp of the bucket. */
  var updateTime: js.UndefOr[String] = js.native
}
object LogBucket {
  
  @scala.inline
  def apply(): LogBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogBucket]
  }
  
  @scala.inline
  implicit class LogBucketMutableBuilder[Self <: LogBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLifecycleState(value: String): Self = StObject.set(x, "lifecycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleStateUndefined: Self = StObject.set(x, "lifecycleState", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRetentionDays(value: Double): Self = StObject.set(x, "retentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionDaysUndefined: Self = StObject.set(x, "retentionDays", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
