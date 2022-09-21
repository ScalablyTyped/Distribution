package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  object default {
    
    @JSImport("playable/dist/src/utils/logger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(name: String, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(List(name.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def info(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def warn(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
}
