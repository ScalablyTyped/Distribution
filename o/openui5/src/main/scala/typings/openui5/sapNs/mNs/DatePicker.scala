package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.CalendarType
import typings.openui5.sapNs.uiNs.coreNs.Element
import typings.openui5.sapNs.uiNs.unifiedNs.CalendarLegend
import typings.openui5.sapNs.uiNs.unifiedNs.DateTypeRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.DatePicker")
@js.native
class DatePicker protected () extends InputBase {
  /**
    * Constructor for a new DatePicker.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some <code>specialDate</code> to the aggregation <code>specialDates</code>.
    * @since 1.38.5
    * @param oSpecialDate the specialDate to add; if empty, nothing is added
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSpecialDate(oSpecialDate: DateTypeRange): DatePicker = js.native
  /**
    * Destroys all the specialDates in the aggregation <code>specialDates</code>.
    * @since 1.38.5
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySpecialDates(): DatePicker = js.native
  /**
    * Gets current value of property <code>dateValue</code>.The date as JavaScript Date object. This is
    * independent from any formatter.<b>Note:</b> If this property is used, the <code>value</code>
    * property should not be changed from the caller.
    * @returns Value of property <code>dateValue</code>
    */
  def getDateValue(): js.Any = js.native
  /**
    * Gets current value of property <code>displayFormat</code>.The date is displayed in the input field
    * using this format. By default, the medium format of the used locale is used.Supported format options
    * are pattern-based on Unicode LDML Date Format notation. {@link
    * http://unicode.org/reports/tr35/#Date_Field_Symbol_Table}<b>Note:</b> If you use data binding on the
    * <code>value</code> property with type <code>sap.ui.model.type.Date</code> this property will be
    * ignored.The format defined in the binding will be used.
    * @returns Value of property <code>displayFormat</code>
    */
  def getDisplayFormat(): String = js.native
  /**
    * Gets current value of property <code>displayFormatType</code>.Displays date in this given type in
    * input field. Default value is taken from locale settings.Accepted are values of
    * <code>sap.ui.core.CalendarType</code> or an empty string. If no type is set, the default type of
    * theconfiguration is used.<b>Note:</b> If data binding on <code>value</code> property with type
    * <code>sap.ui.model.type.Date</code> is used, this property will be ignored.Default value is
    * <code></code>.
    * @since 1.28.6
    * @returns Value of property <code>displayFormatType</code>
    */
  def getDisplayFormatType(): String = js.native
  /**
    * ID of the element which is the current target of the association <code>legend</code>, or
    * <code>null</code>.
    * @since 1.38.5
    */
  def getLegend(): js.Any = js.native
  /**
    * Gets current value of property <code>maxDate</code>.Maximum date that can be shown and selected in
    * the <code>DatePicker</code>. This must be a JavaScript date object.<b>Note:</b> If the
    * <code>maxDate</code> is set to be before the <code>minDate</code>,the <code>maxDate</code> and the
    * <code>minDate</code> are switched before rendering.
    * @since 1.38.0
    * @returns Value of property <code>maxDate</code>
    */
  def getMaxDate(): js.Any = js.native
  /**
    * Gets current value of property <code>minDate</code>.Minimum date that can be shown and selected in
    * the <code>DatePicker</code>. This must be a JavaScript date object.<b>Note:</b> If the
    * <code>minDate</code> is set to be after the <code>maxDate</code>,the <code>maxDate</code> and the
    * <code>minDate</code> are switched before rendering.
    * @since 1.38.0
    * @returns Value of property <code>minDate</code>
    */
  def getMinDate(): js.Any = js.native
  /**
    * Gets current value of property <code>secondaryCalendarType</code>.If set, the days in the calendar
    * popup are also displayed in this calendar typeIf not set, the dates are only displayed in the
    * primary calendar type
    * @since 1.34.1
    * @returns Value of property <code>secondaryCalendarType</code>
    */
  def getSecondaryCalendarType(): CalendarType = js.native
  /**
    * Gets content of aggregation <code>specialDates</code>.Date Range with type to visualize special days
    * in the Calendar.If one day is assigned to more than one Type, only the first one will be used.
    * @since 1.38.5
    */
  def getSpecialDates(): js.Array[Element] = js.native
  /**
    * Gets current value of property <code>valueFormat</code>.The date string expected and returned in the
    * <code>value</code> property uses this format. By default the short format of the used locale is
    * used.Supported format options are pattern-based on Unicode LDML Date Format notation. {@link
    * http://unicode.org/reports/tr35/#Date_Field_Symbol_Table}For example, if the date string represents
    * an ABAP DATS type, the format should be "yyyyMMdd".<b>Note:</b> If data binding on
    * <code>value</code> property with type <code>sap.ui.model.type.Date</code> is used, this property
    * will be ignored.The format defined in the binding will be used.
    * @returns Value of property <code>valueFormat</code>
    */
  def getValueFormat(): String = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Element</code> in the aggregation
    * <code>specialDates</code>.and returns its index if found or -1 otherwise.
    * @since 1.38.5
    * @param oSpecialDate The specialDate whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSpecialDate(oSpecialDate: Element): Double = js.native
  /**
    * Inserts a <code>specialDate</code> to the aggregation <code>specialDates</code>.
    * @since 1.38.5
    * @param oSpecialDate the specialDate to insert; if empty, nothing is inserted
    * @param iIndex the 0-based index the <code>specialDate</code> should be inserted at;             for
    * a negative value of <code>iIndex</code>, the <code>specialDate</code> is inserted at position 0;    
    *         for a value greater than the current size of the aggregation, the <code>specialDate</code>
    * is inserted at the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSpecialDate(oSpecialDate: DateTypeRange, iIndex: Double): DatePicker = js.native
  /**
    * Removes all the controls from the aggregation <code>specialDates</code>.Additionally, it unregisters
    * them from the hosting UIArea.
    * @since 1.38.5
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSpecialDates(): js.Array[Element] = js.native
  /**
    * Removes a <code>specialDate</code> from the aggregation <code>specialDates</code>.
    * @since 1.38.5
    * @param oSpecialDate The <code>specialDate</code> to remove or its index or id
    * @returns The removed <code>specialDate</code> or null
    */
  def removeSpecialDate(oSpecialDate: DateTypeRange): DateTypeRange = js.native
  /**
    * Sets a new value for property <code>dateValue</code>.The date as JavaScript Date object. This is
    * independent from any formatter.<b>Note:</b> If this property is used, the <code>value</code>
    * property should not be changed from the caller.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param oDateValue New value for property <code>dateValue</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDateValue(oDateValue: js.Any): DatePicker = js.native
  /**
    * Sets a new value for property <code>displayFormat</code>.The date is displayed in the input field
    * using this format. By default, the medium format of the used locale is used.Supported format options
    * are pattern-based on Unicode LDML Date Format notation. {@link
    * http://unicode.org/reports/tr35/#Date_Field_Symbol_Table}<b>Note:</b> If you use data binding on the
    * <code>value</code> property with type <code>sap.ui.model.type.Date</code> this property will be
    * ignored.The format defined in the binding will be used.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.
    * @param sDisplayFormat New value for property <code>displayFormat</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDisplayFormat(sDisplayFormat: String): DatePicker = js.native
  /**
    * Sets a new value for property <code>displayFormatType</code>.Displays date in this given type in
    * input field. Default value is taken from locale settings.Accepted are values of
    * <code>sap.ui.core.CalendarType</code> or an empty string. If no type is set, the default type of
    * theconfiguration is used.<b>Note:</b> If data binding on <code>value</code> property with type
    * <code>sap.ui.model.type.Date</code> is used, this property will be ignored.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @since 1.28.6
    * @param sDisplayFormatType New value for property <code>displayFormatType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDisplayFormatType(sDisplayFormatType: String): DatePicker = js.native
  /**
    * Sets the associated legend.
    * @since 1.38.5
    * @param oLegend ID of an element which becomes the new target of this <code>legend</code>
    * association;                                                        alternatively, an element
    * instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLegend(oLegend: js.Any): DatePicker = js.native
  def setLegend(oLegend: CalendarLegend): DatePicker = js.native
  /**
    * Sets a new value for property <code>maxDate</code>.Maximum date that can be shown and selected in
    * the <code>DatePicker</code>. This must be a JavaScript date object.<b>Note:</b> If the
    * <code>maxDate</code> is set to be before the <code>minDate</code>,the <code>maxDate</code> and the
    * <code>minDate</code> are switched before rendering.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.38.0
    * @param oMaxDate New value for property <code>maxDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxDate(oMaxDate: js.Any): DatePicker = js.native
  /**
    * Sets a new value for property <code>minDate</code>.Minimum date that can be shown and selected in
    * the <code>DatePicker</code>. This must be a JavaScript date object.<b>Note:</b> If the
    * <code>minDate</code> is set to be after the <code>maxDate</code>,the <code>maxDate</code> and the
    * <code>minDate</code> are switched before rendering.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @since 1.38.0
    * @param oMinDate New value for property <code>minDate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinDate(oMinDate: js.Any): DatePicker = js.native
  /**
    * Sets a new value for property <code>secondaryCalendarType</code>.If set, the days in the calendar
    * popup are also displayed in this calendar typeIf not set, the dates are only displayed in the
    * primary calendar typeWhen called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @since 1.34.1
    * @param sSecondaryCalendarType New value for property <code>secondaryCalendarType</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSecondaryCalendarType(sSecondaryCalendarType: CalendarType): DatePicker = js.native
  /**
    * Sets a new value for property <code>valueFormat</code>.The date string expected and returned in the
    * <code>value</code> property uses this format. By default the short format of the used locale is
    * used.Supported format options are pattern-based on Unicode LDML Date Format notation. {@link
    * http://unicode.org/reports/tr35/#Date_Field_Symbol_Table}For example, if the date string represents
    * an ABAP DATS type, the format should be "yyyyMMdd".<b>Note:</b> If data binding on
    * <code>value</code> property with type <code>sap.ui.model.type.Date</code> is used, this property
    * will be ignored.The format defined in the binding will be used.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sValueFormat New value for property <code>valueFormat</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueFormat(sValueFormat: String): DatePicker = js.native
  /**
    * Defines the width of the DatePicker. Default value is 100%
    * @param sWidth new value for <code>width</code>
    * @returns <code>this</code> to allow method chaining
    */
  def setWidth(sWidth: String): DatePicker = js.native
}

