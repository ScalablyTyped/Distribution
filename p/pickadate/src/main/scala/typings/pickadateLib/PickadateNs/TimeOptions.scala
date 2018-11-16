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

