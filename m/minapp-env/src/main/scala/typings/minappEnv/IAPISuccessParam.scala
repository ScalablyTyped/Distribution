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
  
  inline def apply(errMsg: java.lang.String): IAPISuccessParam = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAPISuccessParam]
  }
  
  extension [Self <: IAPISuccessParam](x: Self) {
    
    inline def setErrMsg(value: java.lang.String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
