package typings.naverWhale.whale.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabHighlightInfo extends js.Object {
  
  var tabIds: js.Array[Double] = js.native
  
  var windowId: Double = js.native
}
object TabHighlightInfo {
  
  @scala.inline
  def apply(tabIds: js.Array[Double], windowId: Double): TabHighlightInfo = {
    val __obj = js.Dynamic.literal(tabIds = tabIds.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabHighlightInfo]
  }
  
  @scala.inline
  implicit class TabHighlightInfoOps[Self <: TabHighlightInfo] (val x: Self) extends AnyVal {
    
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
    def setTabIdsVarargs(value: Double*): Self = this.set("tabIds", js.Array(value :_*))
    
    @scala.inline
    def setTabIds(value: js.Array[Double]): Self = this.set("tabIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowId(value: Double): Self = this.set("windowId", value.asInstanceOf[js.Any])
  }
}
