package typings.nightwatch.mod

import typings.nightwatch.nightwatchNumbers.`0`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchTypedCallbackResult[T] extends NightwatchCallbackResult[T] {
  
  var state: Error | String = js.native
  
  var status: `0` = js.native
  
  var value: T = js.native
}
object NightwatchTypedCallbackResult {
  
  @scala.inline
  def apply[T](state: Error | String, status: `0`, value: T): NightwatchTypedCallbackResult[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTypedCallbackResult[T]]
  }
  
  @scala.inline
  implicit class NightwatchTypedCallbackResultOps[Self <: NightwatchTypedCallbackResult[_], T] (val x: Self with NightwatchTypedCallbackResult[T]) extends AnyVal {
    
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
    def setStatus(value: `0`): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
