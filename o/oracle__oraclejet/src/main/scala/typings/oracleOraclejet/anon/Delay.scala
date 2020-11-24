package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delay extends js.Object {
  
  var delay: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[String] = js.native
  
  var endMaxHeight: js.UndefOr[String] = js.native
  
  var endMaxWidth: js.UndefOr[String] = js.native
  
  var persist: js.UndefOr[String] = js.native
  
  var startMaxHeight: js.UndefOr[String] = js.native
  
  var startMaxWidth: js.UndefOr[String] = js.native
  
  var timingFunction: js.UndefOr[String] = js.native
}
object Delay {
  
  @scala.inline
  def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit class DelayOps[Self <: Delay] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEndMaxHeight(value: String): Self = this.set("endMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndMaxHeight: Self = this.set("endMaxHeight", js.undefined)
    
    @scala.inline
    def setEndMaxWidth(value: String): Self = this.set("endMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndMaxWidth: Self = this.set("endMaxWidth", js.undefined)
    
    @scala.inline
    def setPersist(value: String): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    
    @scala.inline
    def setStartMaxHeight(value: String): Self = this.set("startMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMaxHeight: Self = this.set("startMaxHeight", js.undefined)
    
    @scala.inline
    def setStartMaxWidth(value: String): Self = this.set("startMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartMaxWidth: Self = this.set("startMaxWidth", js.undefined)
    
    @scala.inline
    def setTimingFunction(value: String): Self = this.set("timingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingFunction: Self = this.set("timingFunction", js.undefined)
  }
}
