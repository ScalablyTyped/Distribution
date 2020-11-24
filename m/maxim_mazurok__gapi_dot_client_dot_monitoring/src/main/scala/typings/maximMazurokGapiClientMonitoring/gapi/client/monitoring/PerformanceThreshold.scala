package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceThreshold extends js.Object {
  
  /** BasicSli to evaluate to judge window quality. */
  var basicSliPerformance: js.UndefOr[BasicSli] = js.native
  
  /** RequestBasedSli to evaluate to judge window quality. */
  var performance: js.UndefOr[RequestBasedSli] = js.native
  
  /** If window performance >= threshold, the window is counted as good. */
  var threshold: js.UndefOr[Double] = js.native
}
object PerformanceThreshold {
  
  @scala.inline
  def apply(): PerformanceThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceThreshold]
  }
  
  @scala.inline
  implicit class PerformanceThresholdOps[Self <: PerformanceThreshold] (val x: Self) extends AnyVal {
    
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
    def setBasicSliPerformance(value: BasicSli): Self = this.set("basicSliPerformance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicSliPerformance: Self = this.set("basicSliPerformance", js.undefined)
    
    @scala.inline
    def setPerformance(value: RequestBasedSli): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
