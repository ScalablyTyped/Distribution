package typings.pkcs11js.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
/**
  * Exception from native module
  */
trait NativeError
  extends StObject
     with Error {
  
  /**
    * Native function name. Default is empty string
    */
  val method: String
  
  /**
    * Native library call stack. Default is empty string
    */
  val nativeStack: String
}
object NativeError {
  
  inline def apply(message: String, method: String, name: String, nativeStack: String): NativeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nativeStack = nativeStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeError]
  }
  
  extension [Self <: NativeError](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNativeStack(value: String): Self = StObject.set(x, "nativeStack", value.asInstanceOf[js.Any])
  }
}
