package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object log {
  
  @JSImport("playcanvas", "log")
  @js.native
  val ^ : js.Any = js.native
  
  inline def alert(text: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assert(condition: Any, text: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def debug(text: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def error(text: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def info(text: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def open(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[Unit]
  
  inline def warning(text: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def write(text: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
