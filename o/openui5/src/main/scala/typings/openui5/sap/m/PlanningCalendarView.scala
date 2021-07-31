package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Element
import typings.openui5.sap.ui.unified.CalendarIntervalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanningCalendarView
  extends StObject
     with Element {
  
  /**
    * Gets current value of property <code>description</code>.Description of the
    * <code>PlanningCalendarView</code>
    * @returns Value of property <code>description</code>
    */
  def getDescription(): String = js.native
  
  /**
    * Gets current value of property <code>intervalType</code>.Type of the intervals of the row. Default
    * is Hour.Default value is <code>Hour</code>.
    * @returns Value of property <code>intervalType</code>
    */
  def getIntervalType(): CalendarIntervalType = js.native
  
  /**
    * Gets current value of property <code>intervalsL</code>.Number of intervals (defined with
    * <code>intervalType</code>) that are displayed on large size (desktop)<b>Note:</b> It is not only the
    * screen size which is used to determine the available space, the size of the
    * <code>PlanningCalendar</code> is used as well.Default value is <code>12</code>.
    * @returns Value of property <code>intervalsL</code>
    */
  def getIntervalsL(): Double = js.native
  
  /**
    * Gets current value of property <code>intervalsM</code>.Number of intervals (defined with
    * <code>intervalType</code>) that are displayed on medium size (tablet)<b>Note:</b> It is not only the
    * screen size which is used to determine the available space, the size of the
    * <code>PlanningCalendar</code> is used as well.Default value is <code>8</code>.
    * @returns Value of property <code>intervalsM</code>
    */
  def getIntervalsM(): Double = js.native
  
  /**
    * Gets current value of property <code>intervalsS</code>.Number of intervals (defined with
    * <code>intervalType</code>) that are displayed on small size (phones).<b>Note:</b> It is not only the
    * screen size which is used to determine the available space, the size of the
    * <code>PlanningCalendar</code> is used as well.Default value is <code>6</code>.
    * @returns Value of property <code>intervalsS</code>
    */
  def getIntervalsS(): Double = js.native
  
  /**
    * Gets current value of property <code>key</code>.Key of the view. This must be set to identify the
    * used view in the <code>PlanningCalendar</code>
    * @returns Value of property <code>key</code>
    */
  def getKey(): String = js.native
  
  /**
    * Gets current value of property <code>showSubIntervals</code>.If set subintervals are shown.If the
    * interval type is <code>Hour</code>, quarter hours are shown.If the interval type is
    * <code>Day</code>, hours are shown.If the interval type is <code>Month</code>, days are shown.Default
    * value is <code>false</code>.
    * @returns Value of property <code>showSubIntervals</code>
    */
  def getShowSubIntervals(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>description</code>.Description of the
    * <code>PlanningCalendarView</code>When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: String): PlanningCalendarView = js.native
  
  /**
    * Sets a new value for property <code>intervalType</code>.Type of the intervals of the row. Default is
    * Hour.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Hour</code>.
    * @param sIntervalType New value for property <code>intervalType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIntervalType(sIntervalType: CalendarIntervalType): PlanningCalendarView = js.native
  
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
  def setIntervalsL(iIntervalsL: Double): PlanningCalendarView = js.native
  
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
  def setIntervalsM(iIntervalsM: Double): PlanningCalendarView = js.native
  
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
  def setIntervalsS(iIntervalsS: Double): PlanningCalendarView = js.native
  
  /**
    * Sets a new value for property <code>key</code>.Key of the view. This must be set to identify the
    * used view in the <code>PlanningCalendar</code>When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sKey New value for property <code>key</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setKey(sKey: String): PlanningCalendarView = js.native
  
  /**
    * Sets a new value for property <code>showSubIntervals</code>.If set subintervals are shown.If the
    * interval type is <code>Hour</code>, quarter hours are shown.If the interval type is
    * <code>Day</code>, hours are shown.If the interval type is <code>Month</code>, days are shown.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @param bShowSubIntervals New value for property <code>showSubIntervals</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSubIntervals(bShowSubIntervals: Boolean): PlanningCalendarView = js.native
}
