package typings.officeUiFabricReact.stickyStickyMod

import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStickyContext extends js.Object {
  
  var scrollablePane: Requireable[js.Object] = js.native
}
object IStickyContext {
  
  @scala.inline
  def apply(scrollablePane: Requireable[js.Object]): IStickyContext = {
    val __obj = js.Dynamic.literal(scrollablePane = scrollablePane.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStickyContext]
  }
  
  @scala.inline
  implicit class IStickyContextOps[Self <: IStickyContext] (val x: Self) extends AnyVal {
    
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
    def setScrollablePane(value: Requireable[js.Object]): Self = this.set("scrollablePane", value.asInstanceOf[js.Any])
  }
}
