package typings.onsenui.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("onsenui", "openActionSheet")
@js.native
object openActionSheet extends js.Object {
  /**
    * @description Shows an instant Action Sheet and lets the user choose an action.
    * @return Will resolve when the action sheet is closed. The resolve value is either the index of the tapped button or -1 when canceled.
    */
  def apply(args: js.Any*): js.Promise[Double] = js.native
}

