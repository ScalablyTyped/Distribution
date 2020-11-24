package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "Errors")
@js.native
object Errors extends js.Object {
  
  @js.native
  class BaseError () extends js.Object {
    
    def init(name: String): Unit = js.native
    
    var name: String = js.native
  }
  
  @js.native
  class OperationError () extends BaseError {
    
    var date: js.Any = js.native
    
    var message: String = js.native
  }
  
  @js.native
  class RequestError () extends OperationError
}
