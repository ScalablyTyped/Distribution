package typings.playable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/utils/logger", JSImport.Namespace)
@js.native
object loggerMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def error(name: String, optionalParams: js.Any*): Unit = js.native
    
    def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
    
    def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
  }
}
