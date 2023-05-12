package typings.mirada.distSrcTypesOpencvMod

import typings.mirada.distSrcTypesOpencvHacksMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv", "Logger")
@js.native
open class Logger ()
  extends typings.mirada.distSrcTypesOpencvTypesMod.Logger
/* static members */
object Logger {
  
  @JSImport("mirada/dist/src/types/opencv", "Logger")
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(fmt: Any, arg121: Any): int = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(fmt.asInstanceOf[js.Any], arg121.asInstanceOf[js.Any])).asInstanceOf[int]
  
  inline def fatal(fmt: Any, arg122: Any): int = (^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(fmt.asInstanceOf[js.Any], arg122.asInstanceOf[js.Any])).asInstanceOf[int]
  
  inline def info(fmt: Any, arg123: Any): int = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(fmt.asInstanceOf[js.Any], arg123.asInstanceOf[js.Any])).asInstanceOf[int]
  
  /**
    *   Print log message
    *
    * @param level Log level
    *
    * @param fmt Message format
    */
  inline def log(level: int, fmt: Any, arg124: Any): int = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], fmt.asInstanceOf[js.Any], arg124.asInstanceOf[js.Any])).asInstanceOf[int]
  
  /**
    *   Sets the logging destination
    *
    * @param name Filename or NULL for console
    */
  inline def setDestination(name: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDestination")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    *   Sets the logging level. All messages with lower priority will be ignored.
    *
    * @param level Logging level
    */
  inline def setLevel(level: int): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warn(fmt: Any, arg125: Any): int = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(fmt.asInstanceOf[js.Any], arg125.asInstanceOf[js.Any])).asInstanceOf[int]
}
