package typings.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object representing the dialog box. */
trait Dialog extends js.Object {
  /**
    * Method to close a dialog box. Returns a Promise.
    *
    * [Api set: CustomFunctionsRuntime 1.1]
    *
    */
  def close(): js.Promise[Unit]
}

object Dialog {
  @scala.inline
  def apply(close: () => js.Promise[Unit]): Dialog = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[Dialog]
  }
}

