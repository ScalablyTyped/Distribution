package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericBucketingResult extends StObject {
  
  /** Count within each bucket. Its size is the length of NumericBucketingOption.bucket_bounds plus 1. */
  var counts: js.UndefOr[js.Array[BucketizedCount]] = js.undefined
  
  /** Stores the maximum value of the numeric field. Is populated only if [NumericBucketingOption.requires_min_max] is set to true. */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /** Stores the minimum value of the numeric field. Will be populated only if [NumericBucketingOption.requires_min_max] is set to true. */
  var minValue: js.UndefOr[Double] = js.undefined
}
object NumericBucketingResult {
  
  @scala.inline
  def apply(): NumericBucketingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericBucketingResult]
  }
  
  @scala.inline
  implicit class NumericBucketingResultMutableBuilder[Self <: NumericBucketingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounts(value: js.Array[BucketizedCount]): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    @scala.inline
    def setCountsVarargs(value: BucketizedCount*): Self = StObject.set(x, "counts", js.Array(value :_*))
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
