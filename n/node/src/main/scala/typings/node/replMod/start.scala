package typings.node.replMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("repl", "start")
@js.native
object start extends js.Object {
  /**
    * Creates and starts a `repl.REPLServer` instance.
    *
    * @param options The options for the `REPLServer`. If `options` is a string, then it specifies
    * the input prompt.
    */
  def apply(): REPLServer = js.native
  def apply(options: java.lang.String): REPLServer = js.native
  def apply(options: ReplOptions): REPLServer = js.native
}

