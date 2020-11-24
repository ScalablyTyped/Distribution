package typings.openfin

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/transport/transport-errors", JSImport.Namespace)
@js.native
object transportErrorsMod extends js.Object {
  
  @js.native
  class DisconnectedError protected () extends Error {
    def this(readyState: Double) = this()
    
    var readyState: Double = js.native
  }
  
  @js.native
  class DuplicateCorrelationError () extends Error
  
  @js.native
  class NoAckError () extends Error
  
  @js.native
  class NotImplementedError () extends Error
  
  @js.native
  class NotSupportedError () extends Error
  
  @js.native
  class RuntimeError protected () extends Error {
    def this(data: js.Any) = this()
  }
  
  @js.native
  class UnexpectedActionError () extends Error
}
