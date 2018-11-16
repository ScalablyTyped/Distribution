package typings
package openui5Lib.sapNs.uiNs.unifiedNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.unified.calendar.DatesRow")
@js.native
class DatesRow protected () extends Month {
  /**
             * Constructor for a new calendar/DatesRow.Accepts an object literal <code>mSettings</code> that
             * defines initialproperty values, aggregated and associated objects as well as event handlers.See
             * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
             * settings object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String) = this()
  /**
             * Constructor for a new calendar/DatesRow.Accepts an object literal <code>mSettings</code> that
             * defines initialproperty values, aggregated and associated objects as well as event handlers.See
             * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
             * settings object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
             * Gets current value of property <code>days</code>.number of days displayedDefault value is
             * <code>7</code>.
             * @returns Value of property <code>days</code>
            */
  def getDays(): scala.Double = js.native
  /**
             * Gets current value of property <code>showDayNamesLine</code>.If set the day names are shown in a
             * separate line.If not set the day names are shown inside the single days.Default value is
             * <code>true</code>.
             * @since 1.34.0
             * @returns Value of property <code>showDayNamesLine</code>
            */
  def getShowDayNamesLine(): scala.Boolean = js.native
  /**
             * Gets current value of property <code>startDate</code>.Start date of the rowIf in rendering phase the
             * date property is not in the range startDate + days,it is set to the start dateSo after setting the
             * start date the date should be set to be in the range of the start date
             * @returns Value of property <code>startDate</code>
            */
  def getStartDate(): js.Any = js.native
  /**
             * Sets a new value for property <code>days</code>.number of days displayedWhen called with a value of
             * <code>null</code> or <code>undefined</code>, the default value of the property will be
             * restored.Default value is <code>7</code>.
             * @param iDays New value for property <code>days</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setDays(iDays: scala.Double): DatesRow = js.native
  /**
             * Sets a new value for property <code>showDayNamesLine</code>.If set the day names are shown in a
             * separate line.If not set the day names are shown inside the single days.When called with a value of
             * <code>null</code> or <code>undefined</code>, the default value of the property will be
             * restored.Default value is <code>true</code>.
             * @since 1.34.0
             * @param bShowDayNamesLine New value for property <code>showDayNamesLine</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setShowDayNamesLine(bShowDayNamesLine: scala.Boolean): DatesRow = js.native
  /**
             * Sets a new value for property <code>startDate</code>.Start date of the rowIf in rendering phase the
             * date property is not in the range startDate + days,it is set to the start dateSo after setting the
             * start date the date should be set to be in the range of the start dateWhen called with a value of
             * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
             * @param oStartDate New value for property <code>startDate</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setStartDate(oStartDate: js.Any): DatesRow = js.native
}

