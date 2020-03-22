package typings.openfin

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/transport/transport-errors", JSImport.Namespace)
@js.native
object transportErrorsMod extends js.Object {
  @js.native
  class DisconnectedError protected () extends Error {
    def this(readyState: Double) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var readyState: Double = js.native
  }
  
  @js.native
  class DuplicateCorrelationError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class NoAckError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class NotImplementedError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class NotSupportedError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class RuntimeError protected () extends Error {
    def this(data: js.Any) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class UnexpectedActionError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

