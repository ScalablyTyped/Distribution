package typings.orientjs.orientjsMod

import typings.orientjs.orientjsMod.errorsNs.BaseError
import typings.orientjs.orientjsMod.errorsNs.OperationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "errors")
@js.native
object errorsNs extends js.Object {
  @js.native
  class BaseError () extends js.Object {
    var name: String = js.native
    def init(name: String): Unit = js.native
  }
  
  @js.native
  class OperationError () extends BaseError {
    var date: js.Any = js.native
    var message: String = js.native
  }
  
  @js.native
  class RequestError () extends OperationError
  
}

