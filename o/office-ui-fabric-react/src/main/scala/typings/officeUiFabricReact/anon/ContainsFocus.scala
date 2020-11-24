package typings.officeUiFabricReact.anon

import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainsFocus extends js.Object {
  
  var containsFocus: Boolean = js.native
  
  var documentContainsFocus: Boolean = js.native
  
  var originalElement: js.UndefOr[HTMLElement | Window] = js.native
}
object ContainsFocus {
  
  @scala.inline
  def apply(containsFocus: Boolean, documentContainsFocus: Boolean): ContainsFocus = {
    val __obj = js.Dynamic.literal(containsFocus = containsFocus.asInstanceOf[js.Any], documentContainsFocus = documentContainsFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsFocus]
  }
  
  @scala.inline
  implicit class ContainsFocusOps[Self <: ContainsFocus] (val x: Self) extends AnyVal {
    
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
    def setContainsFocus(value: Boolean): Self = this.set("containsFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentContainsFocus(value: Boolean): Self = this.set("documentContainsFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalElement(value: HTMLElement | Window): Self = this.set("originalElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalElement: Self = this.set("originalElement", js.undefined)
  }
}
