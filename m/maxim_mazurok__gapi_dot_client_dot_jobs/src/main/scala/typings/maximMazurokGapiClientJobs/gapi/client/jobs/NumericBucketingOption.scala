package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericBucketingOption extends StObject {
  
  /**
    * Required. Two adjacent values form a histogram bucket. Values should be in ascending order. For example, if [5, 10, 15] are provided, four buckets are created: (-inf, 5), 5, 10),
    * [10, 15), [15, inf). At most 20 [buckets_bound is supported.
    */
  var bucketBounds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Optional. If set to true, the histogram result includes minimum/maximum value of the numeric field. */
  var requiresMinMax: js.UndefOr[Boolean] = js.undefined
}
object NumericBucketingOption {
  
  @scala.inline
  def apply(): NumericBucketingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericBucketingOption]
  }
  
  @scala.inline
  implicit class NumericBucketingOptionMutableBuilder[Self <: NumericBucketingOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketBounds(value: js.Array[Double]): Self = StObject.set(x, "bucketBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketBoundsUndefined: Self = StObject.set(x, "bucketBounds", js.undefined)
    
    @scala.inline
    def setBucketBoundsVarargs(value: Double*): Self = StObject.set(x, "bucketBounds", js.Array(value :_*))
    
    @scala.inline
    def setRequiresMinMax(value: Boolean): Self = StObject.set(x, "requiresMinMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresMinMaxUndefined: Self = StObject.set(x, "requiresMinMax", js.undefined)
  }
}
