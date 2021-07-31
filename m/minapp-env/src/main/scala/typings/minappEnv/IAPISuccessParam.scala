package typings.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAPISuccessParam
  extends StObject
     with IAPICompleteParam {
  
  var errMsg: java.lang.String
}
object IAPISuccessParam {
  
  @scala.inline
  def apply(errMsg: java.lang.String): IAPISuccessParam = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAPISuccessParam]
  }
  
  @scala.inline
  implicit class IAPISuccessParamMutableBuilder[Self <: IAPISuccessParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: java.lang.String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
