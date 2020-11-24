package typings.officeUiFabricReact.pivotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPivotState extends js.Object {
  
  var selectedKey: js.UndefOr[String] = js.native
}
object IPivotState {
  
  @scala.inline
  def apply(): IPivotState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPivotState]
  }
  
  @scala.inline
  implicit class IPivotStateOps[Self <: IPivotState] (val x: Self) extends AnyVal {
    
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
    def setSelectedKey(value: String): Self = this.set("selectedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedKey: Self = this.set("selectedKey", js.undefined)
  }
}
