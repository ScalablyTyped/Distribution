package typings.pickadate.Pickadate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeOptions extends Options {
  /**
    * Disable a specific or arbitrary set of times selectable on the picker.
    * Accepts an array of Date objects, arrays formatted as [HOUR, MINUTE],
    * integers representing hours (from 0 to 23), or objects with a range of
    * times. Switch to a whitelist by setting `true` as the first item in the
    * collection. Enable times that fall within a range of disabled times by
    * adding an `inverted` parameter to the item within the collection.
    */
  var disable: js.UndefOr[js.Array[_]] = js.native
  /**
    * The formatLabel option is unique. It can contain HTML and it can
    * also be a function if you want to create the label during run-time.
    */
  var formatLabel: js.UndefOr[String | (js.Function1[/* time */ TimeItem, String])] = js.native
  /**
    * Choose the interval in minutes between each time in the list.
    * Default is 30.
    */
  var interval: js.UndefOr[Double] = js.native
  // Classes
  var klass: js.UndefOr[TimeKlassOptions] = js.native
  /**
    * Set the maximum selectable time on the picker.
    * Accepts the same values as the `min` property.
    */
  var max: js.UndefOr[MinOrMaxTimeOption] = js.native
  /**
    * Set the minimum selectable time on the picker. Accepts a Date object,
    * array formatted as [HOUR, MINUTE], a positive or negative integer
    * for a time relative to now, or a boolean (`true` sets it to now, and
    * `false` removes any limit).
    */
  var min: js.UndefOr[MinOrMaxTimeOption] = js.native
}

object TimeOptions {
  @scala.inline
  def apply(): TimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOptions]
  }
  @scala.inline
  implicit class TimeOptionsOps[Self <: TimeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisableVarargs(value: js.Any*): Self = this.set("disable", js.Array(value :_*))
    @scala.inline
    def setDisable(value: js.Array[_]): Self = this.set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setFormatLabelFunction1(value: /* time */ TimeItem => String): Self = this.set("formatLabel", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatLabel(value: String | (js.Function1[/* time */ TimeItem, String])): Self = this.set("formatLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatLabel: Self = this.set("formatLabel", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setKlass(value: TimeKlassOptions): Self = this.set("klass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKlass: Self = this.set("klass", js.undefined)
    @scala.inline
    def setMax(value: MinOrMaxTimeOption): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: MinOrMaxTimeOption): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
  
}

