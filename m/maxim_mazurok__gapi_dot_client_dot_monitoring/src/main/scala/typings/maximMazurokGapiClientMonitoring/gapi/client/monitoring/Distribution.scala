package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Distribution extends js.Object {
  
  /**
    * Required in the Cloud Monitoring API v3. The values for each bucket specified in bucket_options. The sum of the values in bucketCounts must equal the value in the count field of the
    * Distribution object. The order of the bucket counts follows the numbering schemes described for the three bucket types. The underflow bucket has number 0; the finite buckets, if
    * any, have numbers 1 through N-2; and the overflow bucket has number N-1. The size of bucket_counts must not be greater than N. If the size is less than N, then the remaining buckets
    * are assigned values of zero.
    */
  var bucketCounts: js.UndefOr[js.Array[String]] = js.native
  
  /** Required in the Cloud Monitoring API v3. Defines the histogram bucket boundaries. */
  var bucketOptions: js.UndefOr[BucketOptions] = js.native
  
  /** The number of values in the population. Must be non-negative. This value must equal the sum of the values in bucket_counts if a histogram is provided. */
  var count: js.UndefOr[String] = js.native
  
  /** Must be in increasing order of value field. */
  var exemplars: js.UndefOr[js.Array[Exemplar]] = js.native
  
  /** The arithmetic mean of the values in the population. If count is zero then this field must be zero. */
  var mean: js.UndefOr[Double] = js.native
  
  /** If specified, contains the range of the population values. The field must not be present if the count is zero. This field is presently ignored by the Cloud Monitoring API v3. */
  var range: js.UndefOr[Range] = js.native
  
  /**
    * The sum of squared deviations from the mean of the values in the population. For values x_i this is: Sum[i=1..n]((x_i - mean)^2) Knuth, "The Art of Computer Programming", Vol. 2,
    * page 232, 3rd edition describes Welford's method for accumulating this sum in one pass.If count is zero then this field must be zero.
    */
  var sumOfSquaredDeviation: js.UndefOr[Double] = js.native
}
object Distribution {
  
  @scala.inline
  def apply(): Distribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  implicit class DistributionOps[Self <: Distribution] (val x: Self) extends AnyVal {
    
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
    def setBucketCountsVarargs(value: String*): Self = this.set("bucketCounts", js.Array(value :_*))
    
    @scala.inline
    def setBucketCounts(value: js.Array[String]): Self = this.set("bucketCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketCounts: Self = this.set("bucketCounts", js.undefined)
    
    @scala.inline
    def setBucketOptions(value: BucketOptions): Self = this.set("bucketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketOptions: Self = this.set("bucketOptions", js.undefined)
    
    @scala.inline
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setExemplarsVarargs(value: Exemplar*): Self = this.set("exemplars", js.Array(value :_*))
    
    @scala.inline
    def setExemplars(value: js.Array[Exemplar]): Self = this.set("exemplars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExemplars: Self = this.set("exemplars", js.undefined)
    
    @scala.inline
    def setMean(value: Double): Self = this.set("mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMean: Self = this.set("mean", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSumOfSquaredDeviation(value: Double): Self = this.set("sumOfSquaredDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSumOfSquaredDeviation: Self = this.set("sumOfSquaredDeviation", js.undefined)
  }
}
