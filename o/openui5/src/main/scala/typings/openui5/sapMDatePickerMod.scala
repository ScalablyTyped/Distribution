package typings.openui5

import typings.openui5.anon.AfterPopupOpened
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMDateTimeFieldMod.DateTimeFieldSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreCalendarTypeMod.CalendarType
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDatePickerMod {
  
  @JSImport("sap/m/DatePicker", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `DatePicker`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/date-picker/ Date Picker}
    */
  open class default () extends DatePicker {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DatePickerSettings) = this()
    def this(/**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: DatePickerSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DatePickerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/DatePicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.DatePicker with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.DateTimeField.extend}.
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
    oClassInfo: ClassInfo[T, DatePicker]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DatePicker],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.DatePicker.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DatePicker
    extends typings.openui5.sapMDateTimeFieldMod.default {
    
    /**
      * @SINCE 1.38.5
      *
      * Adds some `specialDate` to the aggregation `specialDates`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSpecialDate(
      /**
      * the specialDate to add; if empty, nothing is added
      */
    oSpecialDate: typings.openui5.sapUiUnifiedDateTypeRangeMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterValueHelpClose afterValueHelpClose} event
      * of this `sap.m.DatePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.DatePicker` itself.
      *
      * Fired when `value help` dialog closes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterValueHelpClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterValueHelpClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.DatePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterValueHelpClose afterValueHelpClose} event
      * of this `sap.m.DatePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.DatePicker` itself.
      *
      * Fired when `value help` dialog closes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterValueHelpClose(
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
    def attachAfterValueHelpClose(
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
      * Context object to call the event handler with. Defaults to this `sap.m.DatePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterValueHelpOpen afterValueHelpOpen} event
      * of this `sap.m.DatePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.DatePicker` itself.
      *
      * Fired when `value help` dialog opens.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterValueHelpOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterValueHelpOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.DatePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterValueHelpOpen afterValueHelpOpen} event
      * of this `sap.m.DatePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.DatePicker` itself.
      *
      * Fired when `value help` dialog opens.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterValueHelpOpen(
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
    def attachAfterValueHelpOpen(
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
      * Context object to call the event handler with. Defaults to this `sap.m.DatePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.m.DatePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.DatePicker` itself.
      *
      * Fired when navigating in `Calendar` popup.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachNavigate(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.DatePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.46.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:navigate navigate} event of this `sap.m.DatePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.DatePicker` itself.
      *
      * Fired when navigating in `Calendar` popup.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigate(
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
    def attachNavigate(
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
      * Context object to call the event handler with. Defaults to this `sap.m.DatePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * Destroys all the specialDates in the aggregation {@link #getSpecialDates specialDates}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySpecialDates(): this.type = js.native
    
    /**
      * @SINCE 1.102.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:afterValueHelpClose afterValueHelpClose} event
      * of this `sap.m.DatePicker`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterValueHelpClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterValueHelpClose(
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
      * @SINCE 1.102.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:afterValueHelpOpen afterValueHelpOpen} event
      * of this `sap.m.DatePicker`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterValueHelpOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterValueHelpOpen(
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
      * @SINCE 1.46.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:navigate navigate} event of this `sap.m.DatePicker`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavigate(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachNavigate(
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
      * @SINCE 1.102.0
      *
      * Fires event {@link #event:afterValueHelpClose afterValueHelpClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterValueHelpClose(): this.type = js.native
    def fireAfterValueHelpClose(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.102.0
      *
      * Fires event {@link #event:afterValueHelpOpen afterValueHelpOpen} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterValueHelpOpen(): this.type = js.native
    def fireAfterValueHelpOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    def fireChange(/**
      * the arguments to pass along with the event.
      */
    mArguments: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Fires event {@link #event:navigate navigate} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavigate(): this.type = js.native
    def fireNavigate(/**
      * Parameters to pass along with the event
      */
    mParameters: AfterPopupOpened): this.type = js.native
    
    /**
      * @SINCE 1.28.6
      *
      * Gets current value of property {@link #getDisplayFormatType displayFormatType}.
      *
      * Displays date in this given type in input field. Default value is taken from locale settings. Accepted
      * are values of `sap.ui.core.CalendarType` or an empty string. If no type is set, the default type of the
      * configuration is used. **Note:** If data binding on `value` property with type `sap.ui.model.type.Date`
      * is used, this property will be ignored.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `displayFormatType`
      */
    def getDisplayFormatType(): String = js.native
    
    /**
      * @SINCE 1.97
      *
      * Gets current value of property {@link #getHideInput hideInput}.
      *
      * Determines whether the input field of the picker is hidden or visible. When set to `true`, the input
      * field becomes invisible and there is no way to open the picker popover. In that case it can be opened
      * by another control through calling of picker's `openBy` method, and the opening control's DOM reference
      * must be provided as parameter.
      *
      * Note: Since the picker is not responsible for accessibility attributes of the control which opens its
      * popover, those attributes should be added by the application developer. The following is recommended
      * to be added to the opening control: a text or tooltip that describes the action (example: "Open Date
      * Picker"), and also aria-haspopup attribute with value of `sap.ui.core.aria.HasPopup.Dialog`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideInput`
      */
    def getHideInput(): Boolean = js.native
    
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
      * Maximum date that can be shown and selected in the `DatePicker`. This must be a JavaScript date object.
      *
      * **Note:** If the `maxDate` is set to be before the `minDate`, the `maxDate` and the `minDate` are switched
      * before rendering.
      *
      * @returns Value of property `maxDate`
      */
    def getMaxDate(): js.Object = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getMinDate minDate}.
      *
      * Minimum date that can be shown and selected in the `DatePicker`. This must be a JavaScript date object.
      *
      * **Note:** If the `minDate` is set to be after the `maxDate`, the `maxDate` and the `minDate` are switched
      * before rendering.
      *
      * @returns Value of property `minDate`
      */
    def getMinDate(): js.Object = js.native
    
    /**
      * @SINCE 1.34.1
      *
      * Gets current value of property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * If set, the days in the calendar popup are also displayed in this calendar type If not set, the dates
      * are only displayed in the primary calendar type
      *
      * @returns Value of property `secondaryCalendarType`
      */
    def getSecondaryCalendarType(): CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) = js.native
    
    /**
      * @SINCE 1.95
      *
      * Gets current value of property {@link #getShowCurrentDateButton showCurrentDateButton}.
      *
      * Determines whether there is a shortcut navigation to Today. When used in Month, Year or Year-range picker
      * view, the calendar navigates to Day picker view.
      *
      * Note: The Current date button appears if the `displayFormat` property allows entering day.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showCurrentDateButton`
      */
    def getShowCurrentDateButton(): Boolean = js.native
    
    /**
      * @SINCE 1.70
      *
      * Gets current value of property {@link #getShowFooter showFooter}.
      *
      * Hides or shows the popover's footer.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showFooter`
      */
    def getShowFooter(): Boolean = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * Gets content of aggregation {@link #getSpecialDates specialDates}.
      *
      * Date Range with type to visualize special days in the Calendar. If one day is assigned to more than one
      * Type, only the first one will be used.
      *
      * To set a single date (instead of a range), set only the startDate property of the sap.ui.unified.DateRange
      * class.
      *
      * **Note:** Since 1.48 you could set a non-working day via the sap.ui.unified.CalendarDayType.NonWorking
      * enum type just as any other special date type using sap.ui.unified.DateRangeType.
      */
    def getSpecialDates(): js.Array[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * Checks for the provided `sap.ui.core.Element` in the aggregation {@link #getSpecialDates specialDates}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSpecialDate(
      /**
      * The specialDate whose index is looked for
      */
    oSpecialDate: typings.openui5.sapUiCoreElementMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * Inserts a `specialDate` to the aggregation `specialDates`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSpecialDate(
      /**
      * the specialDate to insert; if empty, nothing is inserted
      */
    oSpecialDate: typings.openui5.sapUiUnifiedDateTypeRangeMod.default,
      /**
      * the 0-based index the `specialDate` should be inserted at; for a negative value of `iIndex`, the `specialDate`
      * is inserted at position 0; for a value greater than the current size of the aggregation, the `specialDate`
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Checks if the picker is open
      */
    def isOpen(): Boolean = js.native
    
    /**
      * @SINCE 1.64
      *
      * Returns if the last entered value is valid.
      */
    def isValidValue(): Boolean = js.native
    
    /**
      * @SINCE 1.97
      *
      * Opens the picker popover. The popover is positioned relatively to the control given as `oDomRef` parameter
      * on tablet or desktop and is full screen on phone. Therefore the control parameter is only used on tablet
      * or desktop and is ignored on phone.
      *
      * Note: use this method to open the picker popover only when the `hideInput` property is set to `true`.
      * Please consider opening of the picker popover by another control only in scenarios that comply with Fiori
      * guidelines. For example, opening the picker popover by another popover is not recommended. The application
      * developer should implement the following accessibility attributes to the opening control: a text or tooltip
      * that describes the action (example: "Open Date Picker"), and aria-haspopup attribute with value of `sap.ui.core.aria.HasPopup.Dialog`.
      */
    def openBy(
      /**
      * DOM reference of the opening control. On tablet or desktop, the popover is positioned relatively to this
      * control.
      */
    oDomRef: HTMLElement
    ): Unit = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * Removes all the controls from the aggregation {@link #getSpecialDates specialDates}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSpecialDates(): js.Array[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * Removes a `specialDate` from the aggregation `specialDates`.
      *
      * @returns The removed `specialDate` or `null`
      */
    def removeSpecialDate(
      /**
      * The `specialDate` to remove or its index or ID
      */
    oSpecialDate: typings.openui5.sapUiUnifiedDateTypeRangeMod.default
    ): typings.openui5.sapUiUnifiedDateTypeRangeMod.default | Null = js.native
    
    /**
      * @SINCE 1.28.6
      *
      * Sets a new value for property {@link #getDisplayFormatType displayFormatType}.
      *
      * Displays date in this given type in input field. Default value is taken from locale settings. Accepted
      * are values of `sap.ui.core.CalendarType` or an empty string. If no type is set, the default type of the
      * configuration is used. **Note:** If data binding on `value` property with type `sap.ui.model.type.Date`
      * is used, this property will be ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayFormatType(): this.type = js.native
    def setDisplayFormatType(/**
      * New value for property `displayFormatType`
      */
    sDisplayFormatType: String): this.type = js.native
    
    /**
      * @SINCE 1.97
      *
      * Sets a new value for property {@link #getHideInput hideInput}.
      *
      * Determines whether the input field of the picker is hidden or visible. When set to `true`, the input
      * field becomes invisible and there is no way to open the picker popover. In that case it can be opened
      * by another control through calling of picker's `openBy` method, and the opening control's DOM reference
      * must be provided as parameter.
      *
      * Note: Since the picker is not responsible for accessibility attributes of the control which opens its
      * popover, those attributes should be added by the application developer. The following is recommended
      * to be added to the opening control: a text or tooltip that describes the action (example: "Open Date
      * Picker"), and also aria-haspopup attribute with value of `sap.ui.core.aria.HasPopup.Dialog`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideInput(): this.type = js.native
    def setHideInput(/**
      * New value for property `hideInput`
      */
    bHideInput: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.38.5
      *
      * Sets the associated legend.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLegend(
      /**
      * ID of an element which becomes the new target of this `legend` association; alternatively, an element
      * instance may be given
      */
    oLegend: ID
    ): this.type = js.native
    def setLegend(
      /**
      * ID of an element which becomes the new target of this `legend` association; alternatively, an element
      * instance may be given
      */
    oLegend: typings.openui5.sapUiUnifiedCalendarLegendMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Sets a new value for property {@link #getMaxDate maxDate}.
      *
      * Maximum date that can be shown and selected in the `DatePicker`. This must be a JavaScript date object.
      *
      * **Note:** If the `maxDate` is set to be before the `minDate`, the `maxDate` and the `minDate` are switched
      * before rendering.
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
      * Minimum date that can be shown and selected in the `DatePicker`. This must be a JavaScript date object.
      *
      * **Note:** If the `minDate` is set to be after the `maxDate`, the `maxDate` and the `minDate` are switched
      * before rendering.
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
      * @SINCE 1.34.1
      *
      * Sets a new value for property {@link #getSecondaryCalendarType secondaryCalendarType}.
      *
      * If set, the days in the calendar popup are also displayed in this calendar type If not set, the dates
      * are only displayed in the primary calendar type
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondaryCalendarType(): this.type = js.native
    def setSecondaryCalendarType(
      /**
      * New value for property `secondaryCalendarType`
      */
    sSecondaryCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): this.type = js.native
    def setSecondaryCalendarType(/**
      * New value for property `secondaryCalendarType`
      */
    sSecondaryCalendarType: CalendarType): this.type = js.native
    
    /**
      * @SINCE 1.95
      *
      * Sets a new value for property {@link #getShowCurrentDateButton showCurrentDateButton}.
      *
      * Determines whether there is a shortcut navigation to Today. When used in Month, Year or Year-range picker
      * view, the calendar navigates to Day picker view.
      *
      * Note: The Current date button appears if the `displayFormat` property allows entering day.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCurrentDateButton(): this.type = js.native
    def setShowCurrentDateButton(/**
      * New value for property `showCurrentDateButton`
      */
    bShowCurrentDateButton: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.70
      *
      * Sets `showFooter` property to the given boolean value
      */
    def setShowFooter(/**
      * when true footer is displayed
      */
    bFlag: Unit): Unit = js.native
  }
  
  trait DatePickerSettings
    extends StObject
       with DateTimeFieldSettings {
    
    /**
      * @SINCE 1.102.0
      *
      * Fired when `value help` dialog closes.
      */
    var afterValueHelpClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.102.0
      *
      * Fired when `value help` dialog opens.
      */
    var afterValueHelpOpen: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.28.6
      *
      * Displays date in this given type in input field. Default value is taken from locale settings. Accepted
      * are values of `sap.ui.core.CalendarType` or an empty string. If no type is set, the default type of the
      * configuration is used. **Note:** If data binding on `value` property with type `sap.ui.model.type.Date`
      * is used, this property will be ignored.
      */
    var displayFormatType: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.97
      *
      * Determines whether the input field of the picker is hidden or visible. When set to `true`, the input
      * field becomes invisible and there is no way to open the picker popover. In that case it can be opened
      * by another control through calling of picker's `openBy` method, and the opening control's DOM reference
      * must be provided as parameter.
      *
      * Note: Since the picker is not responsible for accessibility attributes of the control which opens its
      * popover, those attributes should be added by the application developer. The following is recommended
      * to be added to the opening control: a text or tooltip that describes the action (example: "Open Date
      * Picker"), and also aria-haspopup attribute with value of `sap.ui.core.aria.HasPopup.Dialog`.
      */
    var hideInput: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.5
      *
      * Association to the `CalendarLegend` explaining the colors of the `specialDates`.
      *
      * **Note** The legend does not have to be rendered but must exist, and all required types must be assigned.
      */
    var legend: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Maximum date that can be shown and selected in the `DatePicker`. This must be a JavaScript date object.
      *
      * **Note:** If the `maxDate` is set to be before the `minDate`, the `maxDate` and the `minDate` are switched
      * before rendering.
      */
    var maxDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Minimum date that can be shown and selected in the `DatePicker`. This must be a JavaScript date object.
      *
      * **Note:** If the `minDate` is set to be after the `maxDate`, the `maxDate` and the `minDate` are switched
      * before rendering.
      */
    var minDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.46.0
      *
      * Fired when navigating in `Calendar` popup.
      */
    var navigate: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.34.1
      *
      * If set, the days in the calendar popup are also displayed in this calendar type If not set, the dates
      * are only displayed in the primary calendar type
      */
    var secondaryCalendarType: js.UndefOr[
        CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.95
      *
      * Determines whether there is a shortcut navigation to Today. When used in Month, Year or Year-range picker
      * view, the calendar navigates to Day picker view.
      *
      * Note: The Current date button appears if the `displayFormat` property allows entering day.
      */
    var showCurrentDateButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.70
      *
      * Hides or shows the popover's footer.
      */
    var showFooter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.5
      *
      * Date Range with type to visualize special days in the Calendar. If one day is assigned to more than one
      * Type, only the first one will be used.
      *
      * To set a single date (instead of a range), set only the startDate property of the sap.ui.unified.DateRange
      * class.
      *
      * **Note:** Since 1.48 you could set a non-working day via the sap.ui.unified.CalendarDayType.NonWorking
      * enum type just as any other special date type using sap.ui.unified.DateRangeType.
      */
    var specialDates: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreElementMod.default] | typings.openui5.sapUiCoreElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DatePickerSettings {
    
    inline def apply(): DatePickerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerSettings]
    }
    
    extension [Self <: DatePickerSettings](x: Self) {
      
      inline def setAfterValueHelpClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterValueHelpClose", js.Any.fromFunction1(value))
      
      inline def setAfterValueHelpCloseUndefined: Self = StObject.set(x, "afterValueHelpClose", js.undefined)
      
      inline def setAfterValueHelpOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterValueHelpOpen", js.Any.fromFunction1(value))
      
      inline def setAfterValueHelpOpenUndefined: Self = StObject.set(x, "afterValueHelpOpen", js.undefined)
      
      inline def setDisplayFormatType(value: String | PropertyBindingInfo): Self = StObject.set(x, "displayFormatType", value.asInstanceOf[js.Any])
      
      inline def setDisplayFormatTypeUndefined: Self = StObject.set(x, "displayFormatType", js.undefined)
      
      inline def setHideInput(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideInput", value.asInstanceOf[js.Any])
      
      inline def setHideInputUndefined: Self = StObject.set(x, "hideInput", js.undefined)
      
      inline def setLegend(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setMaxDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setNavigate(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
      
      inline def setSecondaryCalendarType(
        value: CalendarType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "secondaryCalendarType", value.asInstanceOf[js.Any])
      
      inline def setSecondaryCalendarTypeUndefined: Self = StObject.set(x, "secondaryCalendarType", js.undefined)
      
      inline def setShowCurrentDateButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCurrentDateButton", value.asInstanceOf[js.Any])
      
      inline def setShowCurrentDateButtonUndefined: Self = StObject.set(x, "showCurrentDateButton", js.undefined)
      
      inline def setShowFooter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      inline def setSpecialDates(
        value: js.Array[typings.openui5.sapUiCoreElementMod.default] | typings.openui5.sapUiCoreElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "specialDates", value.asInstanceOf[js.Any])
      
      inline def setSpecialDatesUndefined: Self = StObject.set(x, "specialDates", js.undefined)
      
      inline def setSpecialDatesVarargs(value: typings.openui5.sapUiCoreElementMod.default*): Self = StObject.set(x, "specialDates", js.Array(value*))
    }
  }
}
