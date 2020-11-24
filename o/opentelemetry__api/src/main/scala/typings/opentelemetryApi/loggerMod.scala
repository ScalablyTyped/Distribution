package typings.opentelemetryApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/common/Logger", JSImport.Namespace)
@js.native
object loggerMod extends js.Object {
  
  @js.native
  trait Logger extends js.Object {
    
    def debug(message: String, args: js.Any*): Unit = js.native
    @JSName("debug")
    var debug_Original: LogFunction = js.native
    
    def error(message: String, args: js.Any*): Unit = js.native
    @JSName("error")
    var error_Original: LogFunction = js.native
    
    def info(message: String, args: js.Any*): Unit = js.native
    @JSName("info")
    var info_Original: LogFunction = js.native
    
    def warn(message: String, args: js.Any*): Unit = js.native
    @JSName("warn")
    var warn_Original: LogFunction = js.native
  }
  
  type LogFunction = js.Function2[/* message */ String, /* repeated */ js.Any, Unit]
}
