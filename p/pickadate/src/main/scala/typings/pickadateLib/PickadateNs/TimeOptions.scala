package typings
package pickadateLib.PickadateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeOptions extends Options {
  /**
    * Disable a specific or arbitrary set of times selectable on the picker.
    * Accepts an array of Date objects, arrays formatted as [HOUR, MINUTE],
    * integers representing hours (from 0 to 23), or objects with a range of
    * times. Switch to a whitelist by setting `true` as the first item in the
    * collection. Enable times that fall within a range of disabled times by
    * adding an `inverted` parameter to the item within the collection.
    */
  var disable: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The formatLabel option is unique. It can contain HTML and it can
    * also be a function if you want to create the label during run-time.
    */
  var formatLabel: js.UndefOr[java.lang.String | (js.Function1[/* time */ TimeItem, java.lang.String])] = js.undefined
  /**
    * Choose the interval in minutes between each time in the list.
    * Default is 30.
    */
  var interval: js.UndefOr[scala.Double] = js.undefined
  // Classes
  var klass: js.UndefOr[TimeKlassOptions] = js.undefined
  /**
    * Set the maximum selectable time on the picker.
    * Accepts the same values as the `min` property.
    */
  var max: js.UndefOr[MinOrMaxTimeOption] = js.undefined
  /**
    * Set the minimum selectable time on the picker. Accepts a Date object,
    * array formatted as [HOUR, MINUTE], a positive or negative integer
    * for a time relative to now, or a boolean (`true` sets it to now, and
    * `false` removes any limit).
    */
  var min: js.UndefOr[MinOrMaxTimeOption] = js.undefined
}

object TimeOptions {
  @scala.inline
  def apply(
    clear: java.lang.String = null,
    closeOnClear: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String | pickadateLib.JQuery = null,
    containerHidden: java.lang.String = null,
    disable: js.Array[_] = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    formatLabel: java.lang.String | (js.Function1[/* time */ TimeItem, java.lang.String]) = null,
    formatSubmit: java.lang.String = null,
    hiddenName: js.UndefOr[scala.Boolean] = js.undefined,
    hiddenPrefix: java.lang.String = null,
    hiddenSuffix: java.lang.String = null,
    interval: scala.Int | scala.Double = null,
    klass: TimeKlassOptions = null,
    max: MinOrMaxTimeOption = null,
    min: MinOrMaxTimeOption = null,
    onClose: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onOpen: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onRender: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onSet: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onStart: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onStop: js.Function1[/* event */ js.Any, scala.Unit] = null
  ): TimeOptions = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (!js.isUndefined(closeOnClear)) __obj.updateDynamic("closeOnClear")(closeOnClear)
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerHidden != null) __obj.updateDynamic("containerHidden")(containerHidden)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(formatLabel.asInstanceOf[js.Any])
    if (formatSubmit != null) __obj.updateDynamic("formatSubmit")(formatSubmit)
    if (!js.isUndefined(hiddenName)) __obj.updateDynamic("hiddenName")(hiddenName)
    if (hiddenPrefix != null) __obj.updateDynamic("hiddenPrefix")(hiddenPrefix)
    if (hiddenSuffix != null) __obj.updateDynamic("hiddenSuffix")(hiddenSuffix)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (klass != null) __obj.updateDynamic("klass")(klass)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onRender != null) __obj.updateDynamic("onRender")(onRender)
    if (onSet != null) __obj.updateDynamic("onSet")(onSet)
    if (onStart != null) __obj.updateDynamic("onStart")(onStart)
    if (onStop != null) __obj.updateDynamic("onStop")(onStop)
    __obj.asInstanceOf[TimeOptions]
  }
}

