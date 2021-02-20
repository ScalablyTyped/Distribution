package typings.openfin

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportErrorsMod {
  
  @JSImport("openfin/_v2/transport/transport-errors", "DisconnectedError")
  @js.native
  class DisconnectedError protected () extends Error {
    def this(readyState: Double) = this()
    
    var readyState: Double = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "DuplicateCorrelationError")
  @js.native
  class DuplicateCorrelationError () extends Error
  
  @JSImport("openfin/_v2/transport/transport-errors", "NoAckError")
  @js.native
  class NoAckError () extends Error
  
  @JSImport("openfin/_v2/transport/transport-errors", "NotImplementedError")
  @js.native
  class NotImplementedError () extends Error
  
  @JSImport("openfin/_v2/transport/transport-errors", "NotSupportedError")
  @js.native
  class NotSupportedError () extends Error
  
  @JSImport("openfin/_v2/transport/transport-errors", "RuntimeError")
  @js.native
  class RuntimeError protected () extends Error {
    def this(data: js.Any) = this()
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "UnexpectedActionError")
  @js.native
  class UnexpectedActionError () extends Error
}
