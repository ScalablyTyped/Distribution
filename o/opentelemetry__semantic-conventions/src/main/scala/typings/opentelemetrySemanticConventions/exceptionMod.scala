package typings.opentelemetrySemanticConventions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/semantic-conventions/build/src/trace/exception", JSImport.Namespace)
@js.native
object exceptionMod extends js.Object {
  
  val ExceptionEventName: /* "exception" */ String = js.native
  
  @js.native
  object ExceptionAttribute extends js.Object {
    
    var MESSAGE: String = js.native
    
    var STACKTRACE: String = js.native
    
    var TYPE: String = js.native
  }
}
