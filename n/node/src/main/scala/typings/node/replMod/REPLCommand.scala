package typings.node.replMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait REPLCommand extends js.Object {
  /**
    * The function to execute, optionally accepting a single string argument.
    */
  @JSName("action")
  var action_Original: REPLCommandAction = js.native
  /**
    * Help text to be displayed when `.help` is entered.
    */
  var help: js.UndefOr[java.lang.String] = js.native
  /**
    * The function to execute, optionally accepting a single string argument.
    */
  def action(`this`: REPLServer, text: java.lang.String): Unit = js.native
}

