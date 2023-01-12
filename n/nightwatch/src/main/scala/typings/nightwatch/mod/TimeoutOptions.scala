package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeoutOptions extends StObject {
  
  /**
    * @default 0
    */
  var retry_attempts: Double
  
  /**
    * @default 60000
    */
  var timeout: Double
}
object TimeoutOptions {
  
  inline def apply(retry_attempts: Double, timeout: Double): TimeoutOptions = {
    val __obj = js.Dynamic.literal(retry_attempts = retry_attempts.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeoutOptions] (val x: Self) extends AnyVal {
    
    inline def setRetry_attempts(value: Double): Self = StObject.set(x, "retry_attempts", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
