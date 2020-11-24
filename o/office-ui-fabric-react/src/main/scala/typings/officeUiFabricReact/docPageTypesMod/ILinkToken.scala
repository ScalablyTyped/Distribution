package typings.officeUiFabricReact.docPageTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILinkToken extends js.Object {
  
  /** If this token is a link, name of the doc page it points to */
  var linkedPage: js.UndefOr[String] = js.native
  
  /** If this token is a link, group/category of the doc page it points to */
  var linkedPageGroup: js.UndefOr[String] = js.native
  
  var text: String = js.native
}
object ILinkToken {
  
  @scala.inline
  def apply(text: String): ILinkToken = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkToken]
  }
  
  @scala.inline
  implicit class ILinkTokenOps[Self <: ILinkToken] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedPage(value: String): Self = this.set("linkedPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedPage: Self = this.set("linkedPage", js.undefined)
    
    @scala.inline
    def setLinkedPageGroup(value: String): Self = this.set("linkedPageGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedPageGroup: Self = this.set("linkedPageGroup", js.undefined)
  }
}
