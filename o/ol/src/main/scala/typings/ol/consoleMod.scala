package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleMod {
  
  @JSImport("ol/console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def log(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def setLevel(l: Level): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(l.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warn(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.info
    - typings.ol.olStrings.warn
    - typings.ol.olStrings.error
    - typings.ol.olStrings.none
  */
  trait Level extends StObject
  object Level {
    
    inline def error: typings.ol.olStrings.error = "error".asInstanceOf[typings.ol.olStrings.error]
    
    inline def info: typings.ol.olStrings.info = "info".asInstanceOf[typings.ol.olStrings.info]
    
    inline def none: typings.ol.olStrings.none = "none".asInstanceOf[typings.ol.olStrings.none]
    
    inline def warn: typings.ol.olStrings.warn = "warn".asInstanceOf[typings.ol.olStrings.warn]
  }
}
