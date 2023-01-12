package typings.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////
///// WX Cloud Apis
/////////////////////
/**
  * Common interfaces and types
  */
trait IAPIError
  extends StObject
     with IAPICompleteParam {
  
  var errMsg: java.lang.String
}
object IAPIError {
  
  inline def apply(errMsg: java.lang.String): IAPIError = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAPIError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAPIError] (val x: Self) extends AnyVal {
    
    inline def setErrMsg(value: java.lang.String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
