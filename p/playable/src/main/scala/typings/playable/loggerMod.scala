package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  object default {
    
    @JSImport("playable/dist/src/utils/logger", "default.error")
    @js.native
    def error(name: String, optionalParams: js.Any*): Unit = js.native
    
    @JSImport("playable/dist/src/utils/logger", "default.info")
    @js.native
    def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
    
    @JSImport("playable/dist/src/utils/logger", "default.warn")
    @js.native
    def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
  }
}
