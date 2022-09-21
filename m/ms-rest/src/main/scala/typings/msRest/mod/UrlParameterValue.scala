package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlParameterValue extends StObject {
  
  var skipUrlEncoding: Boolean
  
  var value: Any
}
object UrlParameterValue {
  
  inline def apply(skipUrlEncoding: Boolean, value: Any): UrlParameterValue = {
    val __obj = js.Dynamic.literal(skipUrlEncoding = skipUrlEncoding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlParameterValue]
  }
  
  extension [Self <: UrlParameterValue](x: Self) {
    
    inline def setSkipUrlEncoding(value: Boolean): Self = StObject.set(x, "skipUrlEncoding", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
