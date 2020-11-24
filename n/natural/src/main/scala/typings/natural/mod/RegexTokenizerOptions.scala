package typings.natural.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexTokenizerOptions extends js.Object {
  
  var discardEmpty: js.UndefOr[Boolean] = js.native
  
  var pattern: js.UndefOr[RegExp] = js.native
}
object RegexTokenizerOptions {
  
  @scala.inline
  def apply(): RegexTokenizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexTokenizerOptions]
  }
  
  @scala.inline
  implicit class RegexTokenizerOptionsOps[Self <: RegexTokenizerOptions] (val x: Self) extends AnyVal {
    
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
    def setDiscardEmpty(value: Boolean): Self = this.set("discardEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscardEmpty: Self = this.set("discardEmpty", js.undefined)
    
    @scala.inline
    def setPattern(value: RegExp): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
}
