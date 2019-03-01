package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options shared between date and time pickers
trait Options extends js.Object {
  /**
    * Set the clear button text.
    * Defaults to 'Clear'
    */
  var clear: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not to close the picker when the "clear" button is pressed.
    * Defaults to `true`.
    */
  var closeOnClear: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not to close the picker when a date is selected.
    * Defaults to `true`.
    */
  var closeOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify where to insert the picker's root element by passing any
    * valid CSS selector to this option. Defaults to undefined.
    */
  var container: js.UndefOr[java.lang.String | pickadateLib.JQuery] = js.undefined
  /**
    * The hidden input container.
    * Defaults to undefined.
    */
  var containerHidden: js.UndefOr[java.lang.String] = js.undefined
  /**
    * By default, typing into the input is disabled by giving it a readOnly
    * attribute. Setting the editable option to true allows the input field
    * to be edited directly.
    */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The human-friendly display format.
    * Escape any "rule" characters with an exclamation mark (!).
    * Defaults to 'd mmmm, yyyy'
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An alternate format to submit to the server.
    * Defaults to undefined.
    */
  var formatSubmit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A majority of the time, the value that needs to be sent to the server
    * is just the hidden value and not the visible one. To make this happen,
    * use the hiddenName option. This essentially nullifies the hiddenPrefix
    * and hiddenSuffix, strips the name attribute from the source input, and
    * then sets it as the name of the hidden input. Defaults to undefined.
    */
  var hiddenName: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional name prefix for the new hidden input element used
    * when a custom human-friendly display format is specified.
    * Defaults to undefined.
    */
  var hiddenPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional name suffix for the new hidden input element used
    * when a custom human-friendly display format is specified.
    * Defaults to '_submit'
    */
  var hiddenSuffix: js.UndefOr[java.lang.String] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onRender: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onSet: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  // Events
  var onStart: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    clear: java.lang.String = null,
    closeOnClear: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String | pickadateLib.JQuery = null,
    containerHidden: java.lang.String = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    formatSubmit: java.lang.String = null,
    hiddenName: js.UndefOr[scala.Boolean] = js.undefined,
    hiddenPrefix: java.lang.String = null,
    hiddenSuffix: java.lang.String = null,
    onClose: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onOpen: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onRender: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onSet: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onStart: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onStop: js.Function1[/* event */ js.Any, scala.Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (!js.isUndefined(closeOnClear)) __obj.updateDynamic("closeOnClear")(closeOnClear)
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerHidden != null) __obj.updateDynamic("containerHidden")(containerHidden)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatSubmit != null) __obj.updateDynamic("formatSubmit")(formatSubmit)
    if (!js.isUndefined(hiddenName)) __obj.updateDynamic("hiddenName")(hiddenName)
    if (hiddenPrefix != null) __obj.updateDynamic("hiddenPrefix")(hiddenPrefix)
    if (hiddenSuffix != null) __obj.updateDynamic("hiddenSuffix")(hiddenSuffix)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onRender != null) __obj.updateDynamic("onRender")(onRender)
    if (onSet != null) __obj.updateDynamic("onSet")(onSet)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    if (onStop != null) __obj.updateDynamic("onStop")(onStop)
    __obj.asInstanceOf[Options]
  }
}

