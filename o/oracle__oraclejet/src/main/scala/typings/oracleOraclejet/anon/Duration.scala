package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Duration extends js.Object {
  
  var delay: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[String] = js.native
  
  var endOpacity: js.UndefOr[Double] = js.native
  
  var persist: js.UndefOr[String] = js.native
  
  var startOpacity: js.UndefOr[Double] = js.native
  
  var timingFunction: js.UndefOr[String] = js.native
}
object Duration {
  
  @scala.inline
  def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationOps[Self <: Duration] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: String): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEndOpacity(value: Double): Self = this.set("endOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndOpacity: Self = this.set("endOpacity", js.undefined)
    
    @scala.inline
    def setPersist(value: String): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    
    @scala.inline
    def setStartOpacity(value: Double): Self = this.set("startOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOpacity: Self = this.set("startOpacity", js.undefined)
    
    @scala.inline
    def setTimingFunction(value: String): Self = this.set("timingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingFunction: Self = this.set("timingFunction", js.undefined)
  }
}
