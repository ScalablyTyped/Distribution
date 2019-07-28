package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.MessageToast")
@js.native
object MessageToastNs extends js.Object {
  /**
    * Creates and displays a simple message toast notification message with the given text, and optionally
    * other options.The only mandatory parameter is <code>sMessage</code>.
    * @param sMessage The message to be displayed.
    * @param mOptions Object which can contain all other options. Not all entries in this object are
    * required. This property is optional.
    */
  def show(sMessage: String): Unit = js.native
  def show(sMessage: String, mOptions: js.Any): Unit = js.native
}

