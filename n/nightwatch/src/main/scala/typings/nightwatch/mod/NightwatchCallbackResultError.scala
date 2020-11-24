package typings.nightwatch.mod

import typings.nightwatch.anon.Class
import typings.nightwatch.nightwatchNumbers.`1`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchCallbackResultError
  extends NightwatchCallbackResult[js.Any] {
  
  var state: Error | String = js.native
  
  var status: `1` = js.native
  
   // we cannot use `number` so giving it a "symbolic" value allows to disjoint the union
  var value: Class = js.native
}
object NightwatchCallbackResultError {
  
  @scala.inline
  def apply(state: Error | String, status: `1`, value: Class): NightwatchCallbackResultError = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchCallbackResultError]
  }
  
  @scala.inline
  implicit class NightwatchCallbackResultErrorOps[Self <: NightwatchCallbackResultError] (val x: Self) extends AnyVal {
    
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
    def setState(value: Error | String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `1`): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Class): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
