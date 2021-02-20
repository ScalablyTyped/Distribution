package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnGyroscopeChangeCallbackResult extends StObject {
  
  var res: Result = js.native
}
object OnGyroscopeChangeCallbackResult {
  
  @scala.inline
  def apply(res: Result): OnGyroscopeChangeCallbackResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGyroscopeChangeCallbackResult]
  }
  
  @scala.inline
  implicit class OnGyroscopeChangeCallbackResultMutableBuilder[Self <: OnGyroscopeChangeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRes(value: Result): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
