package typings.picomatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsMatch extends js.Object {
  
  var isMatch: Boolean = js.native
  
  var `match`: Boolean = js.native
  
  var output: js.Any = js.native
}
object IsMatch {
  
  @scala.inline
  def apply(isMatch: Boolean, `match`: Boolean, output: js.Any): IsMatch = {
    val __obj = js.Dynamic.literal(isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMatch]
  }
  
  @scala.inline
  implicit class IsMatchOps[Self <: IsMatch] (val x: Self) extends AnyVal {
    
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
    def setIsMatch(value: Boolean): Self = this.set("isMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: Boolean): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: js.Any): Self = this.set("output", value.asInstanceOf[js.Any])
  }
}
