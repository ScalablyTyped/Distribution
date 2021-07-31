package typings.openfin

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportErrorsMod {
  
  @JSImport("openfin/_v2/transport/transport-errors", "DisconnectedError")
  @js.native
  class DisconnectedError protected ()
    extends StObject
       with Error {
    def this(readyState: Double) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var readyState: Double = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "DuplicateCorrelationError")
  @js.native
  class DuplicateCorrelationError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "NoAckError")
  @js.native
  class NoAckError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "NotImplementedError")
  @js.native
  class NotImplementedError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "NotSupportedError")
  @js.native
  class NotSupportedError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "RuntimeError")
  @js.native
  class RuntimeError protected ()
    extends StObject
       with Error {
    def this(data: js.Any) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("openfin/_v2/transport/transport-errors", "UnexpectedActionError")
  @js.native
  class UnexpectedActionError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
