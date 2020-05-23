package typings.novaEditor

import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  val console: Console = js.native
  @JSName("__dirname")
  val dirname: String = js.native
  val exports: js.Any = js.native
  @JSName("__filename")
  val filename: String = js.native
  def require(module: String): js.Any = js.native
  @js.native
  object module extends js.Object {
    var exports: js.Any = js.native
  }
  
}

