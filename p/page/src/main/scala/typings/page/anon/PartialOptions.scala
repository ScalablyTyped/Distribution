package typings.page.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<page.PageJS.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var click: js.UndefOr[Boolean] = js.native
  
  var decodeURLComponents: js.UndefOr[Boolean] = js.native
  
  var dispatch: js.UndefOr[Boolean] = js.native
  
  var hashbang: js.UndefOr[Boolean] = js.native
  
  var popstate: js.UndefOr[Boolean] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setClick(value: Boolean): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setDecodeURLComponents(value: Boolean): Self = this.set("decodeURLComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeURLComponents: Self = this.set("decodeURLComponents", js.undefined)
    
    @scala.inline
    def setDispatch(value: Boolean): Self = this.set("dispatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispatch: Self = this.set("dispatch", js.undefined)
    
    @scala.inline
    def setHashbang(value: Boolean): Self = this.set("hashbang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashbang: Self = this.set("hashbang", js.undefined)
    
    @scala.inline
    def setPopstate(value: Boolean): Self = this.set("popstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopstate: Self = this.set("popstate", js.undefined)
  }
}
