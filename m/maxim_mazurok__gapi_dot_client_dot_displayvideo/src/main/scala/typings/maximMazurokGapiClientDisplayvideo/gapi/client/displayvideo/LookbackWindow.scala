package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookbackWindow extends js.Object {
  
  /** Lookback window, in days, from the last time a given user clicked on one of your ads. */
  var clickDays: js.UndefOr[Double] = js.native
  
  /** Lookback window, in days, from the last time a given user viewed one of your ads. */
  var impressionDays: js.UndefOr[Double] = js.native
}
object LookbackWindow {
  
  @scala.inline
  def apply(): LookbackWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookbackWindow]
  }
  
  @scala.inline
  implicit class LookbackWindowOps[Self <: LookbackWindow] (val x: Self) extends AnyVal {
    
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
    def setClickDays(value: Double): Self = this.set("clickDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickDays: Self = this.set("clickDays", js.undefined)
    
    @scala.inline
    def setImpressionDays(value: Double): Self = this.set("impressionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressionDays: Self = this.set("impressionDays", js.undefined)
  }
}
