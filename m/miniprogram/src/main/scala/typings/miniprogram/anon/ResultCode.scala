package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultCode extends StObject {
  
  var resultCode: String
}
object ResultCode {
  
  inline def apply(resultCode: String): ResultCode = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultCode] (val x: Self) extends AnyVal {
    
    inline def setResultCode(value: String): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
  }
}
