package typings.maximMazurokGapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketPolicyOnly extends js.Object {
  
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
  implicit class BucketPolicyOnlyOps[Self <: BucketPolicyOnly] (val x: Self) extends AnyVal {
    
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
    def setBucketPolicyOnly(value: Enabled): Self = this.set("bucketPolicyOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketPolicyOnly: Self = this.set("bucketPolicyOnly", js.undefined)
    
    @scala.inline
    def setPublicAccessPrevention(value: String): Self = this.set("publicAccessPrevention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicAccessPrevention: Self = this.set("publicAccessPrevention", js.undefined)
    
    @scala.inline
    def setUniformBucketLevelAccess(value: Enabled): Self = this.set("uniformBucketLevelAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniformBucketLevelAccess: Self = this.set("uniformBucketLevelAccess", js.undefined)
  }
}
