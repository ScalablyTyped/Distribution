package typings.officeUiFabricReact.detailsRowCheckTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsRowCheckStyles extends js.Object {
  
  /** @deprecated Use `root` (they're applied to the same element) */
  var check: IStyle = js.native
  
  var isDisabled: IStyle = js.native
  
  var root: IStyle = js.native
}
object IDetailsRowCheckStyles {
  
  @scala.inline
  def apply(): IDetailsRowCheckStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsRowCheckStyles]
  }
  
  @scala.inline
  implicit class IDetailsRowCheckStylesOps[Self <: IDetailsRowCheckStyles] (val x: Self) extends AnyVal {
    
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
    def setCheck(value: IStyle): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    
    @scala.inline
    def setCheckNull: Self = this.set("check", null)
    
    @scala.inline
    def setIsDisabled(value: IStyle): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setIsDisabledNull: Self = this.set("isDisabled", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}
