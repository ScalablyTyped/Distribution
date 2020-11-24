package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTimeSeriesSummary extends js.Object {
  
  /** The number of points that failed to be written. Order is not guaranteed. */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /** The number of points that were successfully written. */
  var successPointCount: js.UndefOr[Double] = js.native
  
  /** The number of points in the request. */
  var totalPointCount: js.UndefOr[Double] = js.native
}
object CreateTimeSeriesSummary {
  
  @scala.inline
  def apply(): CreateTimeSeriesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTimeSeriesSummary]
  }
  
  @scala.inline
  implicit class CreateTimeSeriesSummaryOps[Self <: CreateTimeSeriesSummary] (val x: Self) extends AnyVal {
    
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
    def setErrorsVarargs(value: Error*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setSuccessPointCount(value: Double): Self = this.set("successPointCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessPointCount: Self = this.set("successPointCount", js.undefined)
    
    @scala.inline
    def setTotalPointCount(value: Double): Self = this.set("totalPointCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPointCount: Self = this.set("totalPointCount", js.undefined)
  }
}
