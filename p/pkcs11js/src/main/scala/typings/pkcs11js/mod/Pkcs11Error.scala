package typings.pkcs11js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exception with the name and value of PKCS#11 return value
  */
trait Pkcs11Error
  extends StObject
     with NativeError {
  
  /**
    * PKCS#11 result value. Default is 0
    */
  val code: Double
}
object Pkcs11Error {
  
  inline def apply(code: Double, message: String, method: String, name: String, nativeStack: String): Pkcs11Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nativeStack = nativeStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pkcs11Error]
  }
  
  extension [Self <: Pkcs11Error](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
