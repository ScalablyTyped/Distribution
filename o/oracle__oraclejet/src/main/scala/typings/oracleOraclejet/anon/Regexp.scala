package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Regexp extends js.Object {
  
  var regexp: js.UndefOr[MessageSummary] = js.native
  
  var required: js.UndefOr[Hint] = js.native
}
object Regexp {
  
  @scala.inline
  def apply(): Regexp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Regexp]
  }
  
  @scala.inline
  implicit class RegexpOps[Self <: Regexp] (val x: Self) extends AnyVal {
    
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
    def setRegexp(value: MessageSummary): Self = this.set("regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    
    @scala.inline
    def setRequired(value: Hint): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
}
