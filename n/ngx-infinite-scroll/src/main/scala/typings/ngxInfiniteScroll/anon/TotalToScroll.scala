package typings.ngxInfiniteScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TotalToScroll extends js.Object {
  
  var totalToScroll: js.Any = js.native
}
object TotalToScroll {
  
  @scala.inline
  def apply(totalToScroll: js.Any): TotalToScroll = {
    val __obj = js.Dynamic.literal(totalToScroll = totalToScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalToScroll]
  }
  
  @scala.inline
  implicit class TotalToScrollOps[Self <: TotalToScroll] (val x: Self) extends AnyVal {
    
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
    def setTotalToScroll(value: js.Any): Self = this.set("totalToScroll", value.asInstanceOf[js.Any])
  }
}
