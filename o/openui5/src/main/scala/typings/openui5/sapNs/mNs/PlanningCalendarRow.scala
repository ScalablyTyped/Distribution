package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Element
import typings.openui5.sapNs.uiNs.unifiedNs.CalendarAppointment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.PlanningCalendarRow")
@js.native
class PlanningCalendarRow protected () extends Element {
  /**
    * Constructor for a new <code>PlanningCalendarRow</code>.Accepts an object literal
    * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
    * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some appointment to the aggregation <code>appointments</code>.
    * @param oAppointment the appointment to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAppointment(oAppointment: CalendarAppointment): PlanningCalendarRow = js.native
  /**
    * Adds some intervalHeader to the aggregation <code>intervalHeaders</code>.
    * @param oIntervalHeader the intervalHeader to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addIntervalHeader(oIntervalHeader: CalendarAppointment): PlanningCalendarRow = js.native
  /**
    * Destroys all the appointments in the aggregation <code>appointments</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyAppointments(): PlanningCalendarRow = js.native
  /**
    * Destroys all the intervalHeaders in the aggregation <code>intervalHeaders</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyIntervalHeaders(): PlanningCalendarRow = js.native
  /**
    * Gets content of aggregation <code>appointments</code>.Appointments to be displayed in the row.
    * Appointments outside the visible time frame are not rendered.<b>Note:</b> For performance reasons
    * only appointments in the visible time range or nearby should be assigned.
    */
  def getAppointments(): js.Array[CalendarAppointment] = js.native
  /**
    * Gets current value of property <code>icon</code>.Icon of the header (e.g. picture of the person)URI
    * of an image or an icon registered in sap.ui.core.IconPool.
    * @returns Value of property <code>icon</code>
    */
  def getIcon(): js.Any = js.native
  /**
    * Gets content of aggregation <code>intervalHeaders</code>.Appointments to be displayed in the top of
    * the intervals. The <code>intervalHeaders</code> are used to visualizepublic holidays and similar
    * things.Appointments outside the visible time frame are not rendered.The <code>intervalHeaders</code>
    * always fill whole intervals. If they are shorter than one interval they are not
    * displayed.<b>Note:</b> For performance reasons only appointments in the visible time range or nearby
    * should be assigned.
    */
  def getIntervalHeaders(): js.Array[CalendarAppointment] = js.native
  /**
    * Gets current value of property <code>key</code>.Can be used as an identifier of the row
    * @returns Value of property <code>key</code>
    */
  def getKey(): String = js.native
  /**
    * Gets current value of property <code>nonWorkingDays</code>.If set, the provided weekdays are
    * displayed as non-working days.Valid values inside the array are 0 to 6. (other values will just be
    * ignored.)If not set, the weekend defined in the locale settings is displayed as non-working
    * days.<b>Note:</b> The non-working days are only visualized if <code>intervalType</code> is set to
    * day.
    * @returns Value of property <code>nonWorkingDays</code>
    */
  def getNonWorkingDays(): Double = js.native
  /**
    * Gets current value of property <code>nonWorkingHours</code>.If set, the provided hours are displayed
    * as non-working hours.Valid values inside the array are 0 to 23. (other values will just be
    * ignored.)<b>Note:</b> The non-working hours are only visualized if <code>intervalType</code> is set
    * to hour.
    * @returns Value of property <code>nonWorkingHours</code>
    */
  def getNonWorkingHours(): Double = js.native
  /**
    * Gets current value of property <code>selected</code>.Defines the selected state of the
    * <code>PlanningCalendarRow</code>.<b>Note:</b> Binding the <code>selected</code> property in single
    * selection modes may cause unwanted results if you have more than one selected row in your
    * binding.Default value is <code>false</code>.
    * @returns Value of property <code>selected</code>
    */
  def getSelected(): Boolean = js.native
  /**
    * Gets current value of property <code>text</code>.Text of the header (e.g. department of the person)
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Gets current value of property <code>title</code>.Title of the header (e.g. name of the person)
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.CalendarAppointment</code> in the aggregation
    * <code>appointments</code>.and returns its index if found or -1 otherwise.
    * @param oAppointment The appointment whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfAppointment(oAppointment: CalendarAppointment): Double = js.native
  /**
    * Checks for the provided <code>sap.ui.unified.CalendarAppointment</code> in the aggregation
    * <code>intervalHeaders</code>.and returns its index if found or -1 otherwise.
    * @param oIntervalHeader The intervalHeader whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfIntervalHeader(oIntervalHeader: CalendarAppointment): Double = js.native
  /**
    * Inserts a appointment into the aggregation <code>appointments</code>.
    * @param oAppointment the appointment to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the appointment should be inserted at; for            
    * a negative value of <code>iIndex</code>, the appointment is inserted at position 0; for a value     
    *        greater than the current size of the aggregation, the appointment is inserted at            
    * the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertAppointment(oAppointment: CalendarAppointment, iIndex: Double): PlanningCalendarRow = js.native
  /**
    * Inserts a intervalHeader into the aggregation <code>intervalHeaders</code>.
    * @param oIntervalHeader the intervalHeader to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the intervalHeader should be inserted at; for          
    *   a negative value of <code>iIndex</code>, the intervalHeader is inserted at position 0; for a value
    *             greater than the current size of the aggregation, the intervalHeader is inserted at     
    *        the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertIntervalHeader(oIntervalHeader: CalendarAppointment, iIndex: Double): PlanningCalendarRow = js.native
  /**
    * Removes all the controls from the aggregation <code>appointments</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAppointments(): js.Array[CalendarAppointment] = js.native
  /**
    * Removes all the controls from the aggregation <code>intervalHeaders</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllIntervalHeaders(): js.Array[CalendarAppointment] = js.native
  def removeAppointment(vAppointment: String): CalendarAppointment = js.native
  /**
    * Removes a appointment from the aggregation <code>appointments</code>.
    * @param vAppointment The appointment to remove or its index or id
    * @returns The removed appointment or <code>null</code>
    */
  def removeAppointment(vAppointment: Double): CalendarAppointment = js.native
  def removeAppointment(vAppointment: CalendarAppointment): CalendarAppointment = js.native
  def removeIntervalHeader(vIntervalHeader: String): CalendarAppointment = js.native
  /**
    * Removes a intervalHeader from the aggregation <code>intervalHeaders</code>.
    * @param vIntervalHeader The intervalHeader to remove or its index or id
    * @returns The removed intervalHeader or <code>null</code>
    */
  def removeIntervalHeader(vIntervalHeader: Double): CalendarAppointment = js.native
  def removeIntervalHeader(vIntervalHeader: CalendarAppointment): CalendarAppointment = js.native
  /**
    * Sets a new value for property <code>icon</code>.Icon of the header (e.g. picture of the person)URI
    * of an image or an icon registered in sap.ui.core.IconPool.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sIcon New value for property <code>icon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIcon(sIcon: js.Any): PlanningCalendarRow = js.native
  /**
    * Sets a new value for property <code>key</code>.Can be used as an identifier of the rowWhen called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.
    * @param sKey New value for property <code>key</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setKey(sKey: String): PlanningCalendarRow = js.native
  /**
    * Sets a new value for property <code>nonWorkingDays</code>.If set, the provided weekdays are
    * displayed as non-working days.Valid values inside the array are 0 to 6. (other values will just be
    * ignored.)If not set, the weekend defined in the locale settings is displayed as non-working
    * days.<b>Note:</b> The non-working days are only visualized if <code>intervalType</code> is set to
    * day.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sNonWorkingDays New value for property <code>nonWorkingDays</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNonWorkingDays(sNonWorkingDays: Double): PlanningCalendarRow = js.native
  /**
    * Sets a new value for property <code>nonWorkingHours</code>.If set, the provided hours are displayed
    * as non-working hours.Valid values inside the array are 0 to 23. (other values will just be
    * ignored.)<b>Note:</b> The non-working hours are only visualized if <code>intervalType</code> is set
    * to hour.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sNonWorkingHours New value for property <code>nonWorkingHours</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNonWorkingHours(sNonWorkingHours: Double): PlanningCalendarRow = js.native
  /**
    * Sets a new value for property <code>selected</code>.Defines the selected state of the
    * <code>PlanningCalendarRow</code>.<b>Note:</b> Binding the <code>selected</code> property in single
    * selection modes may cause unwanted results if you have more than one selected row in your
    * binding.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @param bSelected New value for property <code>selected</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSelected(bSelected: Boolean): PlanningCalendarRow = js.native
  /**
    * Sets a new value for property <code>text</code>.Text of the header (e.g. department of the
    * person)When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): PlanningCalendarRow = js.native
  /**
    * Sets a new value for property <code>title</code>.Title of the header (e.g. name of the person)When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): PlanningCalendarRow = js.native
}

