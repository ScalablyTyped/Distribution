package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketPolicyOnly extends StObject {
  
  /**
    * The bucket's uniform bucket-level access configuration. The feature was formerly known as Bucket Policy Only. For backward compatibility, this field will be populated with
    * identical information as the uniformBucketLevelAccess field. We recommend using the uniformBucketLevelAccess field to enable and disable the feature.
    */
  var bucketPolicyOnly: js.UndefOr[Enabled] = js.native
  
  /** The bucket's Public Access Prevention configuration. Currently, 'unspecified' and 'enforced' are supported. */
  var publicAccessPrevention: js.UndefOr[String] = js.native
  
  /** The bucket's uniform bucket-level access configuration. */
  var uniformBucketLevelAccess: js.UndefOr[Enabled] = js.native
}
object BucketPolicyOnly {
  
  @scala.inline
  def apply(): BucketPolicyOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPolicyOnly]
  }
  
  @scala.inline
  implicit class BucketPolicyOnlyMutableBuilder[Self <: BucketPolicyOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketPolicyOnly(value: Enabled): Self = StObject.set(x, "bucketPolicyOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPolicyOnlyUndefined: Self = StObject.set(x, "bucketPolicyOnly", js.undefined)
    
    @scala.inline
    def setPublicAccessPrevention(value: String): Self = StObject.set(x, "publicAccessPrevention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessPreventionUndefined: Self = StObject.set(x, "publicAccessPrevention", js.undefined)
    
    @scala.inline
    def setUniformBucketLevelAccess(value: Enabled): Self = StObject.set(x, "uniformBucketLevelAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformBucketLevelAccessUndefined: Self = StObject.set(x, "uniformBucketLevelAccess", js.undefined)
  }
}
