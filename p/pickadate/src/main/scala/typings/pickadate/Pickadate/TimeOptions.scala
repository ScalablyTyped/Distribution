package typings.pickadate.Pickadate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeOptions
  extends StObject
     with Options {
  
  /**
    * Disable a specific or arbitrary set of times selectable on the picker.
    * Accepts an array of Date objects, arrays formatted as [HOUR, MINUTE],
    * integers representing hours (from 0 to 23), or objects with a range of
    * times. Switch to a whitelist by setting `true` as the first item in the
    * collection. Enable times that fall within a range of disabled times by
    * adding an `inverted` parameter to the item within the collection.
    */
  var disable: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * The formatLabel option is unique. It can contain HTML and it can
    * also be a function if you want to create the label during run-time.
    */
  var formatLabel: js.UndefOr[String | (js.Function1[/* time */ TimeItem, String])] = js.undefined
  
  /**
    * Choose the interval in minutes between each time in the list.
    * Default is 30.
    */
  var interval: js.UndefOr[Double] = js.undefined
  
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
  def apply(): TimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOptions]
  }
  
  @scala.inline
  implicit class TimeOptionsMutableBuilder[Self <: TimeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable(value: js.Array[js.Any]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    @scala.inline
    def setDisableVarargs(value: js.Any*): Self = StObject.set(x, "disable", js.Array(value :_*))
    
    @scala.inline
    def setFormatLabel(value: String | (js.Function1[/* time */ TimeItem, String])): Self = StObject.set(x, "formatLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatLabelFunction1(value: /* time */ TimeItem => String): Self = StObject.set(x, "formatLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatLabelUndefined: Self = StObject.set(x, "formatLabel", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setKlass(value: TimeKlassOptions): Self = StObject.set(x, "klass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKlassUndefined: Self = StObject.set(x, "klass", js.undefined)
    
    @scala.inline
    def setMax(value: MinOrMaxTimeOption): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: MinOrMaxTimeOption): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
