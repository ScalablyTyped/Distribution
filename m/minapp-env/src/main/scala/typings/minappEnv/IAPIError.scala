package typings.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////
///// WX Cloud Apis
/////////////////////
/**
  * Common interfaces and types
  */
@js.native
trait IAPIError extends IAPICompleteParam {
  
  var errMsg: java.lang.String = js.native
}
object IAPIError {
  
  @scala.inline
  def apply(errMsg: java.lang.String): IAPIError = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAPIError]
  }
  
  @scala.inline
  implicit class IAPIErrorMutableBuilder[Self <: IAPIError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: java.lang.String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
