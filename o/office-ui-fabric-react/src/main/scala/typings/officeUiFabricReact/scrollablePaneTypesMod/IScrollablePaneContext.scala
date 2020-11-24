package typings.officeUiFabricReact.scrollablePaneTypesMod

import typings.officeUiFabricReact.anon.AddSticky
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScrollablePaneContext extends js.Object {
  
  var scrollablePane: js.UndefOr[AddSticky] = js.native
}
object IScrollablePaneContext {
  
  @scala.inline
  def apply(): IScrollablePaneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollablePaneContext]
  }
  
  @scala.inline
  implicit class IScrollablePaneContextOps[Self <: IScrollablePaneContext] (val x: Self) extends AnyVal {
    
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
    def setScrollablePane(value: AddSticky): Self = this.set("scrollablePane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollablePane: Self = this.set("scrollablePane", js.undefined)
  }
}
