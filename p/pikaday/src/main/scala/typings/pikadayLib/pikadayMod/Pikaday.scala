package typings
package pikadayLib.pikadayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pikaday extends js.Object {
  var el: stdLib.HTMLElement = js.native
  /**
    * Recalculate and change the position of the picker.
    */
  def adjustPosition(): scala.Unit = js.native
  /**
    * Extends the existing configuration options for Pikaday object with the options provided.
    * Can be used to change/extend the configurations on runtime.
    * @param options full/partial configuration options.
    * @returns extended configurations.
    */
  def config(options: pikadayLib.pikadayMod.PikadayNs.PikadayOptions): pikadayLib.pikadayMod.PikadayNs.PikadayOptions = js.native
  /**
    * Hide the picker and remove all event listeners - no going back!
    */
  def destroy(): scala.Unit = js.native
  /**
    * Update the HTML.
    */
  def draw(force: scala.Boolean): scala.Unit = js.native
  /**
    * Returns a JavaScript Date object for the selected day, or null if
    * no date is selected.
    */
  def getDate(): stdLib.Date = js.native
  /**
    * Returns a Moment.js object for the selected date (Moment must be
    * loaded before Pikaday).
    */
  def getMoment(): momentLib.momentMod.momentNs.Moment = js.native
  /**
    * Change the current view to see a specific date.
    */
  def gotoDate(date: stdLib.Date): scala.Unit = js.native
  /**
    * Change the current view by month (0: January, 1: Februrary, etc).
    */
  def gotoMonth(monthIndex: scala.Double): scala.Unit = js.native
  /**
    * Shortcut for picker.gotoDate(new Date())
    */
  def gotoToday(): scala.Unit = js.native
  /**
    * Change the year being viewed.
    */
  def gotoYear(year: scala.Double): scala.Unit = js.native
  /**
    * Hide the picker making it invisible.
    */
  def hide(): scala.Unit = js.native
  /**
    * Returns true if the picker is visible.
    */
  def isVisible(): scala.Boolean = js.native
  /**
    * Go to the next month (this will change year if necessary).
    */
  def nextMonth(): scala.Unit = js.native
  /**
    * Go to the previous month (this will change year if necessary).
    */
  def prevMonth(): scala.Unit = js.native
  /**
    * Set the current selection. This will be restricted within the bounds
    * of minDate and maxDate options if they're specified. A boolean (true)
    * can optionally be passed as the second parameter to prevent triggering
    * of the onSelect callback, allowing the date to be set silently.
    */
  def setDate(date: java.lang.String): scala.Unit = js.native
  def setDate(date: java.lang.String, preventOnSelect: scala.Boolean): scala.Unit = js.native
  def setDate(date: stdLib.Date): scala.Unit = js.native
  def setDate(date: stdLib.Date, preventOnSelect: scala.Boolean): scala.Unit = js.native
  /**
    * Update the range end date. For using two Pikaday instances to select
    * a date range.
    */
  def setEndRange(date: stdLib.Date): scala.Unit = js.native
  def setMaxDate(): scala.Unit = js.native
  /**
    * Update the maximum/latest date that can be selected.
    */
  def setMaxDate(date: stdLib.Date): scala.Unit = js.native
  def setMinDate(): scala.Unit = js.native
  /**
    * Update the minimum/earliest date that can be selected.
    */
  def setMinDate(date: stdLib.Date): scala.Unit = js.native
  /**
    * Set the current selection with a Moment.js object (see setDate).
    */
  def setMoment(moment: js.Any): scala.Unit = js.native
  def setMoment(moment: js.Any, preventOnSelect: scala.Boolean): scala.Unit = js.native
  /**
    * Update the range start date. For using two Pikaday instances to
    * select a date range.
    */
  def setStartRange(date: stdLib.Date): scala.Unit = js.native
  /**
    * Make the picker visible.
    */
  def show(): scala.Unit = js.native
  def toString(format: java.lang.String): java.lang.String = js.native
}

