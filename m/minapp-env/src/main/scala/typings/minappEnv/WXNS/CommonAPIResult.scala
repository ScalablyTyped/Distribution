package typings.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonAPIResult extends StObject {
  
  var errMsg: String
}
object CommonAPIResult {
  
  @scala.inline
  def apply(errMsg: String): CommonAPIResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonAPIResult]
  }
  
  @scala.inline
  implicit class CommonAPIResultMutableBuilder[Self <: CommonAPIResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
