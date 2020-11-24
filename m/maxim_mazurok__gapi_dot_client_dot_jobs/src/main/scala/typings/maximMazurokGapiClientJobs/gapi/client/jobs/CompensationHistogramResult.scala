package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompensationHistogramResult extends js.Object {
  
  /** Histogram result. */
  var result: js.UndefOr[NumericBucketingResult] = js.native
  
  /** Type of the request, corresponding to CompensationHistogramRequest.type. */
  var `type`: js.UndefOr[String] = js.native
}
object CompensationHistogramResult {
  
  @scala.inline
  def apply(): CompensationHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompensationHistogramResult]
  }
  
  @scala.inline
  implicit class CompensationHistogramResultOps[Self <: CompensationHistogramResult] (val x: Self) extends AnyVal {
    
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
    def setResult(value: NumericBucketingResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
