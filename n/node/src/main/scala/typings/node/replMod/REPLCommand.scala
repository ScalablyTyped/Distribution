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
  var help: js.UndefOr[String] = js.native
  /**
    * The function to execute, optionally accepting a single string argument.
    */
  def action(text: String): Unit = js.native
}

