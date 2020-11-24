package typings.maximMazurokGapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogBucket extends js.Object {
  
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
  implicit class LogBucketOps[Self <: LogBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLifecycleState(value: String): Self = this.set("lifecycleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecycleState: Self = this.set("lifecycleState", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRetentionDays(value: Double): Self = this.set("retentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionDays: Self = this.set("retentionDays", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
