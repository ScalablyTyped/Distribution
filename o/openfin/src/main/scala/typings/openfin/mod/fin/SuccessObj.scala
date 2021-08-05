package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessObj extends StObject {
  
  var httpResponseCode: Double
}
object SuccessObj {
  
  inline def apply(httpResponseCode: Double): SuccessObj = {
    val __obj = js.Dynamic.literal(httpResponseCode = httpResponseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessObj]
  }
  
  extension [Self <: SuccessObj](x: Self) {
    
    inline def setHttpResponseCode(value: Double): Self = StObject.set(x, "httpResponseCode", value.asInstanceOf[js.Any])
  }
}
