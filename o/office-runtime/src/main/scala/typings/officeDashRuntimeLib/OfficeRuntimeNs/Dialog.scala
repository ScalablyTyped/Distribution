package typings
package officeDashRuntimeLib.OfficeRuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @beta
  * Object representing the dialog box.
  */
trait Dialog extends js.Object {
  /**
    * @beta
    * Method that closes a dialog box.
    */
  def close(): js.Promise[scala.Unit]
}

object Dialog {
  @scala.inline
  def apply(close: js.Function0[js.Promise[scala.Unit]]): Dialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.asInstanceOf[Dialog]
  }
}

