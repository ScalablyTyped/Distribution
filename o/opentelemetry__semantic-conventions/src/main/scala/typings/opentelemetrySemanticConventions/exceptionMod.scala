package typings.opentelemetrySemanticConventions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionMod {
  
  object ExceptionAttribute {
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/exception", "ExceptionAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/exception", "ExceptionAttribute.MESSAGE")
    @js.native
    def MESSAGE: String = js.native
    inline def MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/exception", "ExceptionAttribute.STACKTRACE")
    @js.native
    def STACKTRACE: String = js.native
    inline def STACKTRACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STACKTRACE")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/semantic-conventions/build/src/trace/exception", "ExceptionAttribute.TYPE")
    @js.native
    def TYPE: String = js.native
    inline def TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@opentelemetry/semantic-conventions/build/src/trace/exception", "ExceptionEventName")
  @js.native
  val ExceptionEventName: /* "exception" */ String = js.native
}
