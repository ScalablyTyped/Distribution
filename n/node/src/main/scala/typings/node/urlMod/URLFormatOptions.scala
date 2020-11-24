package typings.node.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait URLFormatOptions extends js.Object {
  
  var auth: js.UndefOr[Boolean] = js.native
  
  var fragment: js.UndefOr[Boolean] = js.native
  
  var search: js.UndefOr[Boolean] = js.native
  
  var unicode: js.UndefOr[Boolean] = js.native
}
object URLFormatOptions {
  
  @scala.inline
  def apply(): URLFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[URLFormatOptions]
  }
  
  @scala.inline
  implicit class URLFormatOptionsOps[Self <: URLFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: Boolean): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setFragment(value: Boolean): Self = this.set("fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragment: Self = this.set("fragment", js.undefined)
    
    @scala.inline
    def setSearch(value: Boolean): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    
    @scala.inline
    def setUnicode(value: Boolean): Self = this.set("unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
  }
}
