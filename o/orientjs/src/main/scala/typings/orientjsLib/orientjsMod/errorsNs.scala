package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "errors")
@js.native
object errorsNs extends js.Object {
  @js.native
  class BaseError ()
    extends orientjsLib.orientjsMod.orientjsNs.errorsNs.BaseError {
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override def init(name: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class OperationError ()
    extends orientjsLib.orientjsMod.orientjsNs.errorsNs.OperationError {
    /* CompleteClass */
    override var date: js.Any = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override def init(name: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class RequestError ()
    extends orientjsLib.orientjsMod.orientjsNs.errorsNs.RequestError {
    /* CompleteClass */
    override var date: js.Any = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    override def init(name: java.lang.String): scala.Unit = js.native
  }
  
}

