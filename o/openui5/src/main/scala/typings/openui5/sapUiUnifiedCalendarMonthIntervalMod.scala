package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedCalendarMonthIntervalMod {
  
  @JSImport("sap/ui/unified/CalendarMonthInterval", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `CalendarMonthInterval`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CalendarMonthInterval {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: CalendarMonthIntervalSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: CalendarMonthIntervalSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: CalendarMonthIntervalSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/CalendarMonthInterval", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.CalendarMonthInterval with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CalendarMonthInterval]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CalendarMonthInterval],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.CalendarMonthInterval.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CalendarMonthInterval
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some selectedDate to the aggregation {@link #getSelectedDates selectedDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSelectedDate(
      /**
      * The selectedDate to add; if empty, nothing is inserted
      */
    oSelectedDate: typings.openui5.sapUiUnifiedDateRangeMod.default
    ): this.type = js.native
    
    /**
      * Adds some specialDate to the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSpecialDate(
      /**
      * The specialDate to add; if empty, nothing is inserted
      */
    oSpecialDate: typings.openui5.sapUiUnifiedDateTypeRangeMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.unified.CalendarMonthInterval`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarMonthInterval` itself.
      *
      * Month selection was cancelled
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarMonthInterval`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.ui.unified.CalendarMonthInterval`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarMonthInterval` itself.
      *
      * Month selection was cancelled
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarMonthInterval`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.CalendarMonthInterval`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarMonthInterval` itself.
      *
      * Month selection changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarMonthInterval`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.CalendarMonthInterval`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarMonthInterval` itself.
      *
      * Month selection changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarMonthInterval`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:startDateChange startDateChange} event of this
      * `sap.ui.unified.CalendarMonthInterval`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarMonthInterval` itself.
      *
      * `startDate` was changed while navigation in `CalendarMonthInterval`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStartDateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachStartDateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarMonthInterval`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.34.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:startDateChange startDateChange} event of this
      * `sap.ui.unified.CalendarMonthInterval`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.CalendarMonthInterval` itself.
      *
      * `startDate` was changed while navigation in `CalendarMonthInterval`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStartDateChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachStartDateChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.CalendarMonthInterval`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the selectedDates in the aggregation {@link #getSelectedDates selectedDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySelectedDates(): this.type = js.native
    
    /**
      * Destroys all the specialDates in the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySpecialDates(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.ui.unified.CalendarMonthInterval`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.unified.CalendarMonthInterval`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:startDateChange startDateChange} event of
      * this `sap.ui.unified.CalendarMonthInterval`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachStartDateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachStartDateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Displays a month in the `CalendarMonthInterval` but doesn't set the focus.
      *
      * @returns `this` to allow method chaining
      */
    def displayDate(
      /**
      * JavaScript date object for displayed date. (The month of this date will be displayed.)
      */
    oDatetime: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:cancel cancel} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCancel(): this.type = js.native
    def fireCancel(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Fires event {@link #event:startDateChange startDateChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireStartDateChange(): this.type = js.native
    def fireStartDateChange(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Sets the focused month of the `CalendarMonthInterval`.
      *
      * @returns `this` to allow method chaining
      */
    def focusDate(
      /**
      * JavaScript date object for focused date. (The month of this date will be focused.)
      */
    oDatetime: js.Object
    ): typings.openui5.sapUiUnifiedCalendarMod.default = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getIntervalSelection intervalSelection}.
      *
      * If set, interval selection is allowed
      *
      * Default value is `false`.
      *
      * @returns Value of property `intervalSelection`
      */
    def getIntervalSelection(): Boolean = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * ID of the element which is the current target of the association {@link #getLegend legend}, or `null`.
      */
    def getLegend(): ID = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getMaxDate maxDate}.
      *
      * Maximum date that can be shown and selected in the Calendar. This must be a JavaScript date object.
      *
      * **Note:** If the `maxDate` is set to be before the `minDate`, the `minDate` is set to the begin of the
      * month of the `maxDate`.
      *
      * @returns Value of property `maxDate`
      */
    def getMaxDate(): js.Object = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getMinDate minDate}.
      *
      * Minimum date that can be shown and selected in the Calendar. This must be a JavaScript date object.
      *
      * **Note:** If the `minDate` is set to be after the `maxDate`, the `maxDate` is set to the end of the month
      * of the `minDate`.
      *
      * @returns Value of property `minDate`
      */
    def getMinDate(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getMonths months}.
      *
      * Number of months displayed
      *
      * **Note:** On phones, the maximum number of months displayed in the row is always 6.
      *
      * Default value is `12`.
      *
      * @returns Value of property `months`
      */
    def getMonths(): int = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Gets current value of property {@link #getPickerPopup pickerPopup}.
      *
      * If set, the yearPicker opens on a popup
      *
      * Default value is `false`.
      *
      * @returns Value of property `pickerPopup`
      */
    def getPickerPopup(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSelectedDates selectedDates}.
      *
      * Date ranges for selected dates of the `CalendarMonthInterval`.
      *
      * If `singleSelection` is set, only the first entry is used.
      *
      * **Note:** Even if only one day is selected, the whole corresponding month is selected.
      */
    def getSelectedDates(): js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getSingleSelection singleSelection}.
      *
      * If set, only a single date or interval, if `intervalSelection` is enabled, can be selected
      *
      * **Note:** Selection of multiple intervals is not supported in the current version.
      *
      * Default value is `true`.
      *
      * @returns Value of property `singleSelection`
      */
    def getSingleSelection(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSpecialDates specialDates}.
      *
      * Date ranges with type to visualize special months in the `CalendarMonthInterval`. If one day is assigned
      * to more than one type, only the first one will be used.
      *
      * **Note:** Even if only one day is set as a special day, the whole corresponding month is displayed in
      * this way.
      */
    def getSpecialDates(): js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getStartDate startDate}.
      *
      * Start date of the Interval as JavaScript Date object. The month of this Date will be the first month
      * in the displayed row.
      *
      * @returns Value of property `startDate`
      */
    def getStartDate(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of the `CalendarMonthInterval`. The width of the single months depends on this width.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.unified.DateRange` in the aggregation {@link #getSelectedDates selectedDates}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSelectedDate(
      /**
      * The selectedDate whose index is looked for
      */
    oSelectedDate: typings.openui5.sapUiUnifiedDateRangeMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.unified.DateTypeRange` in the aggregation {@link #getSpecialDates specialDates}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSpecialDate(
      /**
      * The specialDate whose index is looked for
      */
    oSpecialDate: typings.openui5.sapUiUnifiedDateTypeRangeMod.default
    ): int = js.native
    
    /**
      * Inserts a selectedDate into the aggregation {@link #getSelectedDates selectedDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSelectedDate(
      /**
      * The selectedDate to insert; if empty, nothing is inserted
      */
    oSelectedDate: typings.openui5.sapUiUnifiedDateRangeMod.default,
      /**
      * The `0`-based index the selectedDate should be inserted at; for a negative value of `iIndex`, the selectedDate
      * is inserted at position 0; for a value greater than the current size of the aggregation, the selectedDate
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a specialDate into the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSpecialDate(
      /**
      * The specialDate to insert; if empty, nothing is inserted
      */
    oSpecialDate: typings.openui5.sapUiUnifiedDateTypeRangeMod.default,
      /**
      * The `0`-based index the specialDate should be inserted at; for a negative value of `iIndex`, the specialDate
      * is inserted at position 0; for a value greater than the current size of the aggregation, the specialDate
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSelectedDates selectedDates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSelectedDates(): js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSpecialDates specialDates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSpecialDates(): js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] = js.native
    
    /**
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeSelectedDate(/**
      * The selectedDate to remove or its index or id
      */
    vSelectedDate: String): typings.openui5.sapUiUnifiedDateRangeMod.default | Null = js.native
    /**
      * Removes a selectedDate from the aggregation {@link #getSelectedDates selectedDates}.
      *
      * @returns The removed selectedDate or `null`
      */
    def removeSelectedDate(/**
      * The selectedDate to remove or its index or id
      */
    vSelectedDate: int): typings.openui5.sapUiUnifiedDateRangeMod.default | Null = js.native
    def removeSelectedDate(
      /**
      * The selectedDate to remove or its index or id
      */
    vSelectedDate: typings.openui5.sapUiUnifiedDateRangeMod.default
    ): typings.openui5.sapUiUnifiedDateRangeMod.default | Null = js.native
    
    def removeSpecialDate(/**
      * The specialDate to remove or its index or id
      */
    vSpecialDate: String): typings.openui5.sapUiUnifiedDateTypeRangeMod.default | Null = js.native
    /**
      * Removes a specialDate from the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns The removed specialDate or `null`
      */
    def removeSpecialDate(/**
      * The specialDate to remove or its index or id
      */
    vSpecialDate: int): typings.openui5.sapUiUnifiedDateTypeRangeMod.default | Null = js.native
    def removeSpecialDate(
      /**
      * The specialDate to remove or its index or id
      */
    vSpecialDate: typings.openui5.sapUiUnifiedDateTypeRangeMod.default
    ): typings.openui5.sapUiUnifiedDateTypeRangeMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getIntervalSelection intervalSelection}.
      *
      * If set, interval selection is allowed
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIntervalSelection(): this.type = js.native
    def setIntervalSelection(/**
      * New value for property `intervalSelection`
      */
    bIntervalSelection: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * Sets the associated {@link #getLegend legend}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLegend(
      /**
      * ID of an element which becomes the new target of this legend association; alternatively, an element instance
      * may be given
      */
    oLegend: ID
    ): this.type = js.native
    def setLegend(
      /**
      * ID of an element which becomes the new target of this legend association; alternatively, an element instance
      * may be given
      */
    oLegend: typings.openui5.sapUiUnifiedCalendarLegendMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Sets a new value for property {@link #getMaxDate maxDate}.
      *
      * Maximum date that can be shown and selected in the Calendar. This must be a JavaScript date object.
      *
      * **Note:** If the `maxDate` is set to be before the `minDate`, the `minDate` is set to the begin of the
      * month of the `maxDate`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxDate(): this.type = js.native
    def setMaxDate(/**
      * New value for property `maxDate`
      */
    oMaxDate: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Sets a new value for property {@link #getMinDate minDate}.
      *
      * Minimum date that can be shown and selected in the Calendar. This must be a JavaScript date object.
      *
      * **Note:** If the `minDate` is set to be after the `maxDate`, the `maxDate` is set to the end of the month
      * of the `minDate`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinDate(): this.type = js.native
    def setMinDate(/**
      * New value for property `minDate`
      */
    oMinDate: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMonths months}.
      *
      * Number of months displayed
      *
      * **Note:** On phones, the maximum number of months displayed in the row is always 6.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `12`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMonths(): this.type = js.native
    def setMonths(/**
      * New value for property `months`
      */
    iMonths: int): this.type = js.native
    
    /**
      * @SINCE 1.34.0
      *
      * Sets a new value for property {@link #getPickerPopup pickerPopup}.
      *
      * If set, the yearPicker opens on a popup
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPickerPopup(): this.type = js.native
    def setPickerPopup(/**
      * New value for property `pickerPopup`
      */
    bPickerPopup: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSingleSelection singleSelection}.
      *
      * If set, only a single date or interval, if `intervalSelection` is enabled, can be selected
      *
      * **Note:** Selection of multiple intervals is not supported in the current version.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSingleSelection(): this.type = js.native
    def setSingleSelection(/**
      * New value for property `singleSelection`
      */
    bSingleSelection: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Width of the `CalendarMonthInterval`. The width of the single months depends on this width.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait CalendarMonthIntervalSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / IDs which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Month selection was cancelled
      */
    var cancel: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If set, interval selection is allowed
      */
    var intervalSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.5
      *
      * Association to the `CalendarLegend` explaining the colors of the `specialDates`.
      *
      * **Note** The legend does not have to be rendered but must exist, and all required types must be assigned.
      */
    var legend: js.UndefOr[typings.openui5.sapUiUnifiedCalendarLegendMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Maximum date that can be shown and selected in the Calendar. This must be a JavaScript date object.
      *
      * **Note:** If the `maxDate` is set to be before the `minDate`, the `minDate` is set to the begin of the
      * month of the `maxDate`.
      */
    var maxDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Minimum date that can be shown and selected in the Calendar. This must be a JavaScript date object.
      *
      * **Note:** If the `minDate` is set to be after the `maxDate`, the `maxDate` is set to the end of the month
      * of the `minDate`.
      */
    var minDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of months displayed
      *
      * **Note:** On phones, the maximum number of months displayed in the row is always 6.
      */
    var months: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * If set, the yearPicker opens on a popup
      */
    var pickerPopup: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Month selection changed
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Date ranges for selected dates of the `CalendarMonthInterval`.
      *
      * If `singleSelection` is set, only the first entry is used.
      *
      * **Note:** Even if only one day is selected, the whole corresponding month is selected.
      */
    var selectedDates: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] | typings.openui5.sapUiUnifiedDateRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set, only a single date or interval, if `intervalSelection` is enabled, can be selected
      *
      * **Note:** Selection of multiple intervals is not supported in the current version.
      */
    var singleSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Date ranges with type to visualize special months in the `CalendarMonthInterval`. If one day is assigned
      * to more than one type, only the first one will be used.
      *
      * **Note:** Even if only one day is set as a special day, the whole corresponding month is displayed in
      * this way.
      */
    var specialDates: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] | typings.openui5.sapUiUnifiedDateTypeRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Start date of the Interval as JavaScript Date object. The month of this Date will be the first month
      * in the displayed row.
      */
    var startDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34.0
      *
      * `startDate` was changed while navigation in `CalendarMonthInterval`
      */
    var startDateChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Width of the `CalendarMonthInterval`. The width of the single months depends on this width.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CalendarMonthIntervalSettings {
    
    inline def apply(): CalendarMonthIntervalSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarMonthIntervalSettings]
    }
    
    extension [Self <: CalendarMonthIntervalSettings](x: Self) {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIntervalSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "intervalSelection", value.asInstanceOf[js.Any])
      
      inline def setIntervalSelectionUndefined: Self = StObject.set(x, "intervalSelection", js.undefined)
      
      inline def setLegend(value: typings.openui5.sapUiUnifiedCalendarLegendMod.default | String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setMaxDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMonths(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      inline def setPickerPopup(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "pickerPopup", value.asInstanceOf[js.Any])
      
      inline def setPickerPopupUndefined: Self = StObject.set(x, "pickerPopup", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedDates(
        value: js.Array[typings.openui5.sapUiUnifiedDateRangeMod.default] | typings.openui5.sapUiUnifiedDateRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "selectedDates", value.asInstanceOf[js.Any])
      
      inline def setSelectedDatesUndefined: Self = StObject.set(x, "selectedDates", js.undefined)
      
      inline def setSelectedDatesVarargs(value: typings.openui5.sapUiUnifiedDateRangeMod.default*): Self = StObject.set(x, "selectedDates", js.Array(value*))
      
      inline def setSingleSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "singleSelection", value.asInstanceOf[js.Any])
      
      inline def setSingleSelectionUndefined: Self = StObject.set(x, "singleSelection", js.undefined)
      
      inline def setSpecialDates(
        value: js.Array[typings.openui5.sapUiUnifiedDateTypeRangeMod.default] | typings.openui5.sapUiUnifiedDateTypeRangeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "specialDates", value.asInstanceOf[js.Any])
      
      inline def setSpecialDatesUndefined: Self = StObject.set(x, "specialDates", js.undefined)
      
      inline def setSpecialDatesVarargs(value: typings.openui5.sapUiUnifiedDateTypeRangeMod.default*): Self = StObject.set(x, "specialDates", js.Array(value*))
      
      inline def setStartDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "startDateChange", js.Any.fromFunction1(value))
      
      inline def setStartDateChangeUndefined: Self = StObject.set(x, "startDateChange", js.undefined)
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
