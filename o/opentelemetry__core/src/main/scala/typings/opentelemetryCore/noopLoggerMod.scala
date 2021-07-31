package typings.opentelemetryCore

import typings.opentelemetryApi.loggerMod.LogFunction
import typings.opentelemetryApi.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopLoggerMod {
  
  @JSImport("@opentelemetry/core/build/src/common/NoopLogger", "NoopLogger")
  @js.native
  class NoopLogger ()
    extends StObject
       with Logger {
    
    /* CompleteClass */
    override def debug(message: String, args: js.Any*): Unit = js.native
    /* CompleteClass */
    @JSName("debug")
    var debug_Original: LogFunction = js.native
    
    /* CompleteClass */
    override def error(message: String, args: js.Any*): Unit = js.native
    /* CompleteClass */
    @JSName("error")
    var error_Original: LogFunction = js.native
    
    /* CompleteClass */
    override def info(message: String, args: js.Any*): Unit = js.native
    /* CompleteClass */
    @JSName("info")
    var info_Original: LogFunction = js.native
    
    /* CompleteClass */
    override def warn(message: String, args: js.Any*): Unit = js.native
    /* CompleteClass */
    @JSName("warn")
    var warn_Original: LogFunction = js.native
  }
}
