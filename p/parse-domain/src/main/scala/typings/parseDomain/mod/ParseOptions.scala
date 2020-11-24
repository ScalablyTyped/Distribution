package typings.parseDomain.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions extends js.Object {
  
  var customTlds: js.UndefOr[RegExp | js.Array[String]] = js.native
  
  var privateTlds: js.UndefOr[Boolean] = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomTldsVarargs(value: String*): Self = this.set("customTlds", js.Array(value :_*))
    
    @scala.inline
    def setCustomTlds(value: RegExp | js.Array[String]): Self = this.set("customTlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTlds: Self = this.set("customTlds", js.undefined)
    
    @scala.inline
    def setPrivateTlds(value: Boolean): Self = this.set("privateTlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateTlds: Self = this.set("privateTlds", js.undefined)
  }
}
