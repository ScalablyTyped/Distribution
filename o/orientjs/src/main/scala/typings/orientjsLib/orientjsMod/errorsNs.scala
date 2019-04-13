package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "errors")
@js.native
object errorsNs extends js.Object {
  @js.native
  class BaseError () extends js.Object {
    var name: java.lang.String = js.native
    def init(name: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class OperationError () extends BaseError {
    var date: js.Any = js.native
    var message: java.lang.String = js.native
  }
  
  @js.native
  class RequestError () extends OperationError
  
}

