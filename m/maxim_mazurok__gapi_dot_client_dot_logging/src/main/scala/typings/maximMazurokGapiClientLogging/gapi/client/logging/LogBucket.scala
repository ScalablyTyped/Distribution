package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogBucket extends StObject {
  
  /**
    * The CMEK settings of the log bucket. If present, new log entries written to this log bucket are encrypted using the CMEK key provided in this configuration. If a log bucket has CMEK
    * settings, the CMEK settings cannot be disabled later by updating the log bucket. Changing the KMS key is allowed.
    */
  var cmekSettings: js.UndefOr[CmekSettings] = js.undefined
  
  /** Output only. The creation timestamp of the bucket. This is not set for any of the default buckets. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Describes this bucket. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A list of indexed fields and related configuration data. */
  var indexConfigs: js.UndefOr[js.Array[IndexConfig]] = js.undefined
  
  /** Output only. The bucket lifecycle state. */
  var lifecycleState: js.UndefOr[String] = js.undefined
  
  /** Whether the bucket is locked.The retention period on a locked bucket cannot be changed. Locked buckets may only be deleted if they are empty. */
  var locked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. The resource name of the bucket.For example:projects/my-project/locations/global/buckets/my-bucketFor a list of supported locations, see Supported Regions
    * (https://cloud.google.com/logging/docs/region-support)For the location of global it is unspecified where log entries are actually stored.After a bucket has been created, the
    * location cannot be changed.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Log entry field paths that are denied access in this bucket.The following fields and their children are eligible: textPayload, jsonPayload, protoPayload, httpRequest, labels,
    * sourceLocation.Restricting a repeated field will restrict all values. Adding a parent will block all child fields. (e.g. foo.bar will block foo.bar.baz)
    */
  var restrictedFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Logs will be retained by default for this amount of time, after which they will automatically be deleted. The minimum retention period is 1 day. If this value is set to zero at
    * bucket creation time, the default time of 30 days will be used.
    */
  var retentionDays: js.UndefOr[Double] = js.undefined
  
  /** Output only. The last update timestamp of the bucket. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object LogBucket {
  
  inline def apply(): LogBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogBucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogBucket] (val x: Self) extends AnyVal {
    
    inline def setCmekSettings(value: CmekSettings): Self = StObject.set(x, "cmekSettings", value.asInstanceOf[js.Any])
    
    inline def setCmekSettingsUndefined: Self = StObject.set(x, "cmekSettings", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIndexConfigs(value: js.Array[IndexConfig]): Self = StObject.set(x, "indexConfigs", value.asInstanceOf[js.Any])
    
    inline def setIndexConfigsUndefined: Self = StObject.set(x, "indexConfigs", js.undefined)
    
    inline def setIndexConfigsVarargs(value: IndexConfig*): Self = StObject.set(x, "indexConfigs", js.Array(value*))
    
    inline def setLifecycleState(value: String): Self = StObject.set(x, "lifecycleState", value.asInstanceOf[js.Any])
    
    inline def setLifecycleStateUndefined: Self = StObject.set(x, "lifecycleState", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRestrictedFields(value: js.Array[String]): Self = StObject.set(x, "restrictedFields", value.asInstanceOf[js.Any])
    
    inline def setRestrictedFieldsUndefined: Self = StObject.set(x, "restrictedFields", js.undefined)
    
    inline def setRestrictedFieldsVarargs(value: String*): Self = StObject.set(x, "restrictedFields", js.Array(value*))
    
    inline def setRetentionDays(value: Double): Self = StObject.set(x, "retentionDays", value.asInstanceOf[js.Any])
    
    inline def setRetentionDaysUndefined: Self = StObject.set(x, "retentionDays", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
