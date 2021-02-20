package typings.nodePgMigrate.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends StObject {
  
  var debug: js.UndefOr[LogFn] = js.native
  
  def error(msg: String): Unit = js.native
  @JSName("error")
  var error_Original: LogFn = js.native
  
  def info(msg: String): Unit = js.native
  @JSName("info")
  var info_Original: LogFn = js.native
  
  def warn(msg: String): Unit = js.native
  @JSName("warn")
  var warn_Original: LogFn = js.native
}
