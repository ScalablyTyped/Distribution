package typings.playable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndTS extends js.Object {
  
  var endTS: js.UndefOr[Double] = js.native
  
  var reason: String = js.native
  
  var startTS: js.UndefOr[Double] = js.native
}
object EndTS {
  
  @scala.inline
  def apply(reason: String): EndTS = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndTS]
  }
  
  @scala.inline
  implicit class EndTSOps[Self <: EndTS] (val x: Self) extends AnyVal {
    
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
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTS(value: Double): Self = this.set("endTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTS: Self = this.set("endTS", js.undefined)
    
    @scala.inline
    def setStartTS(value: Double): Self = this.set("startTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTS: Self = this.set("startTS", js.undefined)
  }
}
