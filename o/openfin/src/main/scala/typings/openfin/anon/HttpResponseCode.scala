package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpResponseCode extends StObject {
  
  var httpResponseCode: Double
}
object HttpResponseCode {
  
  inline def apply(httpResponseCode: Double): HttpResponseCode = {
    val __obj = js.Dynamic.literal(httpResponseCode = httpResponseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponseCode]
  }
  
  extension [Self <: HttpResponseCode](x: Self) {
    
    inline def setHttpResponseCode(value: Double): Self = StObject.set(x, "httpResponseCode", value.asInstanceOf[js.Any])
  }
}
