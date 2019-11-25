package typings.pickadate.Pickadate

import typings.pickadate.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options shared between date and time pickers
trait Options extends js.Object {
  /**
    * Set the clear button text.
    * Defaults to 'Clear'
    */
  var clear: js.UndefOr[String] = js.undefined
  /**
    * Whether or not to close the picker when the "clear" button is pressed.
    * Defaults to `true`.
    */
  var closeOnClear: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not to close the picker when a date is selected.
    * Defaults to `true`.
    */
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify where to insert the picker's root element by passing any
    * valid CSS selector to this option. Defaults to undefined.
    */
  var container: js.UndefOr[String | JQuery] = js.undefined
  /**
    * The hidden input container.
    * Defaults to undefined.
    */
  var containerHidden: js.UndefOr[String] = js.undefined
  /**
    * By default, typing into the input is disabled by giving it a readOnly
    * attribute. Setting the editable option to true allows the input field
    * to be edited directly.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  /**
    * The human-friendly display format.
    * Escape any "rule" characters with an exclamation mark (!).
    * Defaults to 'd mmmm, yyyy'
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * An alternate format to submit to the server.
    * Defaults to undefined.
    */
  var formatSubmit: js.UndefOr[String] = js.undefined
  /**
    * A majority of the time, the value that needs to be sent to the server
    * is just the hidden value and not the visible one. To make this happen,
    * use the hiddenName option. This essentially nullifies the hiddenPrefix
    * and hiddenSuffix, strips the name attribute from the source input, and
    * then sets it as the name of the hidden input. Defaults to undefined.
    */
  var hiddenName: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional name prefix for the new hidden input element used
    * when a custom human-friendly display format is specified.
    * Defaults to undefined.
    */
  var hiddenPrefix: js.UndefOr[String] = js.undefined
  /**
    * An optional name suffix for the new hidden input element used
    * when a custom human-friendly display format is specified.
    * Defaults to '_submit'
    */
  var hiddenSuffix: js.UndefOr[String] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onRender: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onSet: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  // Events
  var onStart: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    clear: String = null,
    closeOnClear: js.UndefOr[Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    container: String | JQuery = null,
    containerHidden: String = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    formatSubmit: String = null,
    hiddenName: js.UndefOr[Boolean] = js.undefined,
    hiddenPrefix: String = null,
    hiddenSuffix: String = null,
    onClose: /* event */ js.Any => Unit = null,
    onOpen: /* event */ js.Any => Unit = null,
    onRender: /* event */ js.Any => Unit = null,
    onSet: /* event */ js.Any => Unit = null,
    onStart: /* event */ js.Any => Unit = null,
    onStop: /* event */ js.Any => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClear)) __obj.updateDynamic("closeOnClear")(closeOnClear.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerHidden != null) __obj.updateDynamic("containerHidden")(containerHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatSubmit != null) __obj.updateDynamic("formatSubmit")(formatSubmit.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenName)) __obj.updateDynamic("hiddenName")(hiddenName.asInstanceOf[js.Any])
    if (hiddenPrefix != null) __obj.updateDynamic("hiddenPrefix")(hiddenPrefix.asInstanceOf[js.Any])
    if (hiddenSuffix != null) __obj.updateDynamic("hiddenSuffix")(hiddenSuffix.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction1(onRender))
    if (onSet != null) __obj.updateDynamic("onSet")(js.Any.fromFunction1(onSet))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction1(onStop))
    __obj.asInstanceOf[Options]
  }
}

