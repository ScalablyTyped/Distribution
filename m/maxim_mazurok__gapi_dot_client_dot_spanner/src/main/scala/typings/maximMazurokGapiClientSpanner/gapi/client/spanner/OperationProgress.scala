package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationProgress extends js.Object {
  
  /** If set, the time at which this operation failed or was completed successfully. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Percent completion of the operation. Values are between 0 and 100 inclusive. */
  var progressPercent: js.UndefOr[Double] = js.native
  
  /** Time the request was received. */
  var startTime: js.UndefOr[String] = js.native
}
object OperationProgress {
  
  @scala.inline
  def apply(): OperationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationProgress]
  }
  
  @scala.inline
  implicit class OperationProgressOps[Self <: OperationProgress] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: Double): Self = this.set("progressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressPercent: Self = this.set("progressPercent", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
