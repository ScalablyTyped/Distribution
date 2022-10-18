package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLogLoggerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/log/Logger", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Logger
  @JSImport("@nginstack/engine/lib/log/Logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLogger(category: String): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(category.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  inline def propertyConfig(config: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("propertyConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait Logger extends StObject {
    
    def debug(log: String): Unit = js.native
    def debug(log: String, opt_formatArgs: js.Array[Any]): Unit = js.native
    
    def error(log: String): Unit = js.native
    def error(log: String, opt_formatArgs: js.Array[Any]): Unit = js.native
    
    def fatal(log: String): Unit = js.native
    def fatal(log: String, opt_formatArgs: js.Array[Any]): Unit = js.native
    
    def info(log: String): Unit = js.native
    def info(log: String, opt_formatArgs: js.Array[Any]): Unit = js.native
    
    def warn(log: String): Unit = js.native
    def warn(log: String, opt_formatArgs: js.Array[Any]): Unit = js.native
  }
}
