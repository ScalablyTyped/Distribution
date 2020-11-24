package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPageLoadMetricV5 extends js.Object {
  
  /** The category of the specific time metric. */
  var category: js.UndefOr[String] = js.native
  
  /** Metric distributions. Proportions should sum up to 1. */
  var distributions: js.UndefOr[js.Array[Bucket]] = js.native
  
  /** Identifies the form factor of the metric being collected. */
  var formFactor: js.UndefOr[String] = js.native
  
  /** The median number of the metric, in millisecond. */
  var median: js.UndefOr[Double] = js.native
  
  /** Identifies the type of the metric. */
  var metricId: js.UndefOr[String] = js.native
  
  /** We use this field to store certain percentile value for this metric. For v4, this field contains pc50. For v5, this field contains pc90. */
  var percentile: js.UndefOr[Double] = js.native
}
object UserPageLoadMetricV5 {
  
  @scala.inline
  def apply(): UserPageLoadMetricV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPageLoadMetricV5]
  }
  
  @scala.inline
  implicit class UserPageLoadMetricV5Ops[Self <: UserPageLoadMetricV5] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setDistributionsVarargs(value: Bucket*): Self = this.set("distributions", js.Array(value :_*))
    
    @scala.inline
    def setDistributions(value: js.Array[Bucket]): Self = this.set("distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributions: Self = this.set("distributions", js.undefined)
    
    @scala.inline
    def setFormFactor(value: String): Self = this.set("formFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormFactor: Self = this.set("formFactor", js.undefined)
    
    @scala.inline
    def setMedian(value: Double): Self = this.set("median", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedian: Self = this.set("median", js.undefined)
    
    @scala.inline
    def setMetricId(value: String): Self = this.set("metricId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricId: Self = this.set("metricId", js.undefined)
    
    @scala.inline
    def setPercentile(value: Double): Self = this.set("percentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentile: Self = this.set("percentile", js.undefined)
  }
}
