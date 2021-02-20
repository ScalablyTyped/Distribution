package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait requestDefaultsOptions extends StObject {
  
  var agent: js.Any = js.native
  
  var headers: js.Object = js.native
  
  var timeout: Double = js.native
}
object requestDefaultsOptions {
  
  @scala.inline
  def apply(agent: js.Any, headers: js.Object, timeout: Double): requestDefaultsOptions = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[requestDefaultsOptions]
  }
  
  @scala.inline
  implicit class requestDefaultsOptionsMutableBuilder[Self <: requestDefaultsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: js.Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
