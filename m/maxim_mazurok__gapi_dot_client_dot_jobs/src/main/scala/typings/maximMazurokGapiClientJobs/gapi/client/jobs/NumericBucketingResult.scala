package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericBucketingResult extends js.Object {
  
  /** Count within each bucket. Its size is the length of NumericBucketingOption.bucket_bounds plus 1. */
  var counts: js.UndefOr[js.Array[BucketizedCount]] = js.native
  
  /** Stores the maximum value of the numeric field. Is populated only if [NumericBucketingOption.requires_min_max] is set to true. */
  var maxValue: js.UndefOr[Double] = js.native
  
  /** Stores the minimum value of the numeric field. Will be populated only if [NumericBucketingOption.requires_min_max] is set to true. */
  var minValue: js.UndefOr[Double] = js.native
}
object NumericBucketingResult {
  
  @scala.inline
  def apply(): NumericBucketingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericBucketingResult]
  }
  
  @scala.inline
  implicit class NumericBucketingResultOps[Self <: NumericBucketingResult] (val x: Self) extends AnyVal {
    
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
    def setCountsVarargs(value: BucketizedCount*): Self = this.set("counts", js.Array(value :_*))
    
    @scala.inline
    def setCounts(value: js.Array[BucketizedCount]): Self = this.set("counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounts: Self = this.set("counts", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
  }
}
