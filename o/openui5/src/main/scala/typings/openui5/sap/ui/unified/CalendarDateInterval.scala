package typings.openui5.sap.ui.unified

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarDateInterval extends Calendar_ {
  /**
    * Gets current value of property <code>days</code>.number of days displayedon phones the maximum
    * rendered number of days is 8.Default value is <code>7</code>.
    * @returns Value of property <code>days</code>
    */
  def getDays(): Double = js.native
  /**
    * Gets current value of property <code>pickerPopup</code>.If set, the month- and yearPicker opens on a
    * popupDefault value is <code>false</code>.
    * @since 1.34.0
    * @returns Value of property <code>pickerPopup</code>
    */
  def getPickerPopup(): Boolean = js.native
  /**
    * Gets current value of property <code>showDayNamesLine</code>.If set the day names are shown in a
    * separate line.If not set the day names are shown inside the single days.Default value is
    * <code>true</code>.
    * @since 1.34.0
    * @returns Value of property <code>showDayNamesLine</code>
    */
  def getShowDayNamesLine(): Boolean = js.native
  /**
    * Sets a new value for property <code>days</code>.number of days displayedon phones the maximum
    * rendered number of days is 8.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>7</code>.
    * @param iDays New value for property <code>days</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDays(iDays: Double): CalendarDateInterval = js.native
  /**
    * Sets a new value for property <code>pickerPopup</code>.If set, the month- and yearPicker opens on a
    * popupWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>false</code>.
    * @since 1.34.0
    * @param bPickerPopup New value for property <code>pickerPopup</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPickerPopup(bPickerPopup: Boolean): CalendarDateInterval = js.native
  /**
    * Sets a new value for property <code>showDayNamesLine</code>.If set the day names are shown in a
    * separate line.If not set the day names are shown inside the single days.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.34.0
    * @param bShowDayNamesLine New value for property <code>showDayNamesLine</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowDayNamesLine(bShowDayNamesLine: Boolean): CalendarDateInterval = js.native
  /**
    * Sets a new value for property <code>startDate</code>.Start date of the IntervalWhen called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.
    * @param oStartDate New value for property <code>startDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStartDate(oStartDate: js.Any): CalendarDateInterval = js.native
}

