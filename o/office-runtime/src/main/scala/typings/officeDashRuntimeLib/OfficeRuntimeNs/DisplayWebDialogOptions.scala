package typings
package officeDashRuntimeLib.OfficeRuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides display options and actions a dialog box may take. */
trait DisplayWebDialogOptions extends js.Object {
  /**
    * Optional parameter that determines whether the dialog box displays as a popup (false) or within an IFrame (true).
    * This setting is only applicable to custom functions running on Excel Online.
    */
  var displayInIFrame: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional parameter that defines the height of the dialog box as a percentage of the current display.
    * For example, accepts strings such as: '50%', '50'.
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional callback that runs when the dialog box is closed.
    */
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Optional callback that runs when the dialog box sends a message to its parent.
    */
  var onMessage: js.UndefOr[
    js.Function2[/* message */ java.lang.String, /* dialog */ js.UndefOr[Dialog], scala.Unit]
  ] = js.undefined
  /**
    * Optional callback that runs when the dialog box sends an error.
    */
  var onRuntimeError: js.UndefOr[
    js.Function2[/* error */ stdLib.Error, /* dialog */ js.UndefOr[Dialog], scala.Unit]
  ] = js.undefined
  /**
    * Optional parameter that defines the width of dialog as a percentage of window.
    * For example, accepts strings such as: '50%', '50'.
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object DisplayWebDialogOptions {
  @scala.inline
  def apply(
    displayInIFrame: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String = null,
    onClose: () => scala.Unit = null,
    onMessage: (/* message */ java.lang.String, /* dialog */ js.UndefOr[Dialog]) => scala.Unit = null,
    onRuntimeError: (/* error */ stdLib.Error, /* dialog */ js.UndefOr[Dialog]) => scala.Unit = null,
    width: java.lang.String = null
  ): DisplayWebDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayInIFrame)) __obj.updateDynamic("displayInIFrame")(displayInIFrame)
    if (height != null) __obj.updateDynamic("height")(height)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction2(onMessage))
    if (onRuntimeError != null) __obj.updateDynamic("onRuntimeError")(js.Any.fromFunction2(onRuntimeError))
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[DisplayWebDialogOptions]
  }
}

