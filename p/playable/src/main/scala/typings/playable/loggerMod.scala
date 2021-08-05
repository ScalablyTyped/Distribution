package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  object default {
    
    @JSImport("playable/dist/src/utils/logger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(name: String, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(name.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def info(message: js.Any, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def warn(message: js.Any, optionalParams: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
