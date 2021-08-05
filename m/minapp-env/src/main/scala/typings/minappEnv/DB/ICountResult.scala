package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICountResult
  extends StObject
     with IAPISuccessParam {
  
  var total: Double
}
object ICountResult {
  
  inline def apply(errMsg: String, total: Double): ICountResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICountResult]
  }
  
  extension [Self <: ICountResult](x: Self) {
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
