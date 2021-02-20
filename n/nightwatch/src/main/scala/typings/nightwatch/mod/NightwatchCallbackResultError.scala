package typings.nightwatch.mod

import typings.nightwatch.anon.Class
import typings.nightwatch.nightwatchNumbers.`1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
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
  implicit class NightwatchCallbackResultErrorMutableBuilder[Self <: NightwatchCallbackResultError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: Error | String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Class): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
