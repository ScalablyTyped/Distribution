package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.PlanningCalendarView")
@js.native
class PlanningCalendarView protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  /**
    * Constructor for a new <code>PlanningCalendarView</code>.Accepts an object literal
    * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
    * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>description</code>.Description of the
    * <code>PlanningCalendarView</code>
    * @returns Value of property <code>description</code>
    */
  def getDescription(): java.lang.String = js.native
  /**
    * Gets current value of property <code>intervalType</code>.Type of the intervals of the row. Default
    * is Hour.Default value is <code>Hour</code>.
    * @returns Value of property <code>intervalType</code>
    */
  def getIntervalType(): openui5Lib.sapNs.uiNs.unifiedNs.CalendarIntervalType = js.native
  /**
    * Gets current value of property <code>intervalsL</code>.Number of intervals (defined with
    * <code>intervalType</code>) that are displayed on large size (desktop)<b>Note:</b> It is not only the
    * screen size which is used to determine the available space, the size of the
    * <code>PlanningCalendar</code> is used as well.Default value is <code>12</code>.
    * @returns Value of property <code>intervalsL</code>
    */
  def getIntervalsL(): scala.Double = js.native
  /**
    * Gets current value of property <code>intervalsM</code>.Number of intervals (defined with
    * <code>intervalType</code>) that are displayed on medium size (tablet)<b>Note:</b> It is not only the
    * screen size which is used to determine the available space, the size of the
    * <code>PlanningCalendar</code> is used as well.Default value is <code>8</code>.
    * @returns Value of property <code>intervalsM</code>
    */
  def getIntervalsM(): scala.Double = js.native
  /**
    * Gets current value of property <code>intervalsS</code>.Number of intervals (defined with
    * <code>intervalType</code>) that are displayed on small size (phones).<b>Note:</b> It is not only the
    * screen size which is used to determine the available space, the size of the
    * <code>PlanningCalendar</code> is used as well.Default value is <code>6</code>.
    * @returns Value of property <code>intervalsS</code>
    */
  def getIntervalsS(): scala.Double = js.native
  /**
    * Gets current value of property <code>key</code>.Key of the view. This must be set to identify the
    * used view in the <code>PlanningCalendar</code>
    * @returns Value of property <code>key</code>
    */
  def getKey(): java.lang.String = js.native
  /**
    * Gets current value of property <code>showSubIntervals</code>.If set subintervals are shown.If the
    * interval type is <code>Hour</code>, quarter hours are shown.If the interval type is
    * <code>Day</code>, hours are shown.If the interval type is <code>Month</code>, days are shown.Default
    * value is <code>false</code>.
    * @returns Value of property <code>showSubIntervals</code>
    */
  def getShowSubIntervals(): scala.Boolean = js.native
  /**
    * Sets a new value for property <code>description</code>.Description of the
    * <code>PlanningCalendarView</code>When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: java.lang.String): PlanningCalendarView = js.native
  /**
    * Sets a new value for property <code>intervalType</code>.Type of the intervals of the row. Default is
    * Hour.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Hour</code>.
    * @param sIntervalType New value for property <code>intervalType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntervalType(sIntervalType: openui5Lib.sapNs.uiNs.unifiedNs.CalendarIntervalType): PlanningCalendarView = js.native
  /**
    * Sets a new value for property <code>intervalsL</code>.Number of intervals (defined with
    * <code>intervalType</code>) that are displayed on large size (desktop)<b>Note:</b> It is not only the
    * screen size which is used to determine the available space, the size of the
    * <code>PlanningCalendar</code> is used as well.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>12</code>.
    * @param iIntervalsL New value for property <code>intervalsL</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntervalsL(iIntervalsL: scala.Double): PlanningCalendarView = js.native
  /**
    * Sets a new value for property <code>intervalsM</code>.Number of intervals (defined with
    * <code>intervalType</code>) that are displayed on medium size (tablet)<b>Note:</b> It is not only the
    * screen size which is used to determine the available space, the size of the
    * <code>PlanningCalendar</code> is used as well.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>8</code>.
    * @param iIntervalsM New value for property <code>intervalsM</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntervalsM(iIntervalsM: scala.Double): PlanningCalendarView = js.native
  /**
    * Sets a new value for property <code>intervalsS</code>.Number of intervals (defined with
    * <code>intervalType</code>) that are displayed on small size (phones).<b>Note:</b> It is not only the
    * screen size which is used to determine the available space, the size of the
    * <code>PlanningCalendar</code> is used as well.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>6</code>.
    * @param iIntervalsS New value for property <code>intervalsS</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntervalsS(iIntervalsS: scala.Double): PlanningCalendarView = js.native
  /**
    * Sets a new value for property <code>key</code>.Key of the view. This must be set to identify the
    * used view in the <code>PlanningCalendar</code>When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sKey New value for property <code>key</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setKey(sKey: java.lang.String): PlanningCalendarView = js.native
  /**
    * Sets a new value for property <code>showSubIntervals</code>.If set subintervals are shown.If the
    * interval type is <code>Hour</code>, quarter hours are shown.If the interval type is
    * <code>Day</code>, hours are shown.If the interval type is <code>Month</code>, days are shown.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @param bShowSubIntervals New value for property <code>showSubIntervals</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSubIntervals(bShowSubIntervals: scala.Boolean): PlanningCalendarView = js.native
}

