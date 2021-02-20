package typings.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends StObject {
  
  def debug(msg: String, args: js.Any*): Unit = js.native
  def debug(obj: js.Object, msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def debug(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
  @JSName("debug")
  var debug_Original: LogFn = js.native
  
  def error(msg: String, args: js.Any*): Unit = js.native
  def error(obj: js.Object, msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def error(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
  @JSName("error")
  var error_Original: LogFn = js.native
  
  def fatal(msg: String, args: js.Any*): Unit = js.native
  def fatal(obj: js.Object, msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def fatal(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
  @JSName("fatal")
  var fatal_Original: LogFn = js.native
  
  def info(msg: String, args: js.Any*): Unit = js.native
  def info(obj: js.Object, msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def info(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
  @JSName("info")
  var info_Original: LogFn = js.native
  
  def trace(msg: String, args: js.Any*): Unit = js.native
  def trace(obj: js.Object, msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def trace(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
  @JSName("trace")
  var trace_Original: LogFn = js.native
  
  def warn(msg: String, args: js.Any*): Unit = js.native
  def warn(obj: js.Object, msg: js.UndefOr[scala.Nothing], args: js.Any*): Unit = js.native
  def warn(obj: js.Object, msg: String, args: js.Any*): Unit = js.native
  @JSName("warn")
  var warn_Original: LogFn = js.native
}
