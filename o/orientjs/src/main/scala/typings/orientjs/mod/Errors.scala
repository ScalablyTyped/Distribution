package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Errors {
  
  @JSImport("orientjs", "Errors.BaseError")
  @js.native
  open class BaseError () extends StObject {
    
    def init(name: String): Unit = js.native
    
    var name: String = js.native
  }
  
  @JSImport("orientjs", "Errors.OperationError")
  @js.native
  open class OperationError () extends BaseError {
    
    var date: Any = js.native
    
    var message: String = js.native
  }
  
  @JSImport("orientjs", "Errors.RequestError")
  @js.native
  open class RequestError () extends OperationError
}
