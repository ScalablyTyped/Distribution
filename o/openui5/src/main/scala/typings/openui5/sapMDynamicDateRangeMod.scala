package typings.openui5

import typings.openui5.anon.ValidValue
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.DynamicDateRangeValue
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreDateCalendarWeekNumberingMod.CalendarWeekNumbering
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDynamicDateRangeMod {
  
  @JSImport("sap/m/DynamicDateRange", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DynamicDateRange.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DynamicDateRange {
    def this(/**
      * initial settings for the new control
      */
    mSettings: DynamicDateRangeSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: DynamicDateRangeSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: DynamicDateRangeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/DynamicDateRange", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.DynamicDateRange with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, DynamicDateRange]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DynamicDateRange],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.DynamicDateRange.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * Returns a date range from a provided object in the format of the DynamicDateRange's value.
      *
      * @returns An array of two date objects - start and end date
      */
    inline def toDates(
      /**
      * A `sap.m.DynamicDateRangeValue`
      */
    oValue: DynamicDateRangeValue,
      /**
      * The type of calendar week numbering
      */
    sCalendarWeekNumbering: String
    ): js.Array[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("toDates")(oValue.asInstanceOf[js.Any], sCalendarWeekNumbering.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Date]]
  }
  
  @js.native
  trait DynamicDateRange
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.92
      *
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.92
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Appends an option key, identifying an additional option to be used by the control.
      */
    def addOption(/**
      * option key
      */
    sKey: String): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.DynamicDateRange`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.DynamicDateRange` itself.
      *
      * Is fired when the text in the input field has changed and the focus leaves the input field or the Enter
      * key is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.DynamicDateRange` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.DynamicDateRange`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.DynamicDateRange` itself.
      *
      * Is fired when the text in the input field has changed and the focus leaves the input field or the Enter
      * key is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
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
    def attachChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.DynamicDateRange` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.DynamicDateRange`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachChange(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: ValidValue): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.92
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.111.0
      *
      * Gets current value of property {@link #getCalendarWeekNumbering calendarWeekNumbering}.
      *
      * If set, the calendar week numbering is used for display. If not set, the calendar week numbering of the
      * global configuration is used.
      *
      * @returns Value of property `calendarWeekNumbering`
      */
    def getCalendarWeekNumbering(): CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getEditable editable}.
      *
      * Defines whether the control can be modified by the user or not. **Note:** A user can tab to the non-editable
      * control, highlight it, and copy the text from it.
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getEnableGroupHeaders enableGroupHeaders}.
      *
      * Disable list group headers.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableGroupHeaders`
      */
    def getEnableGroupHeaders(): Boolean = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Indicates whether the user can interact with the control or not. **Note:** Disabled controls cannot be
      * focused and they are out of the tab-chain.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getFormatter formatter}.
      *
      * An instance of sap.m.DynamicDateFormat or a user defined format object with the corresponding formatting
      * and parsing functionality.
      *
      * @returns Value of property `formatter`
      */
    def getFormatter(): js.Object = js.native
    
    /**
      * @SINCE 1.105
      *
      * Gets current value of property {@link #getHideInput hideInput}.
      *
      * Determines whether the input field of the control is hidden or visible. When set to `true`, the input
      * field becomes invisible and there is no way to open the value help popover. In that case it can be opened
      * by another control through calling of control's `openBy` method, and the opening control's DOM reference
      * must be provided as parameter.
      *
      * Note: Since the Dynamic Date Range is not responsible for accessibility attributes of the control which
      * opens its popover, those attributes should be added by the application developer. The following is recommended
      * to be added to the opening control: a text or tooltip that describes the action (example: "Open Dynamic
      * Date Range"), and also aria-haspopup attribute with value of `true`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideInput`
      */
    def getHideInput(): Boolean = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getName name}.
      *
      * Defines the name of the control for the purposes of form submission.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getOptions options}.
      *
      * Array of standard and custom option keys
      *
      * Default value is `["DATE", "TODAY", "YESTERDAY", "TOMORROW", "FIRSTDAYWEEK", "LASTDAYWEEK", "FIRSTDAYMONTH",
      * "LASTDAYMONTH", "FIRSTDAYQUARTER", "LASTDAYQUARTER", "FIRSTDAYYEAR", "LASTDAYYEAR", "DATERANGE", "DATETIMERANGE",
      * "FROM", "TO", "FROMDATETIME", "TODATETIME", "YEARTODATE", "DATETOYEAR", "LASTMINUTES", "LASTHOURS", "LASTDAYS",
      * "LASTWEEKS", "LASTMONTHS", "LASTQUARTERS", "LASTYEARS", "NEXTMINUTES", "NEXTHOURS", "NEXTDAYS", "NEXTWEEKS",
      * "NEXTMONTHS", "NEXTQUARTERS", "NEXTYEARS", "TODAYFROMTO", "THISWEEK", "LASTWEEK", "NEXTWEEK", "SPECIFICMONTH",
      * "SPECIFICMONTHINYEAR", "THISMONTH", "LASTMONTH", "NEXTMONTH", "THISQUARTER", "LASTQUARTER", "NEXTQUARTER",
      * "QUARTER1", "QUARTER2", "QUARTER3", "QUARTER4", "THISYEAR", "LASTYEAR", "NEXTYEAR", "DATETIME"]`.
      *
      * @returns Value of property `options`
      */
    def getOptions(): js.Array[String] = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * Defines a short hint intended to aid the user with data entry when the control has no value.
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getRequired required}.
      *
      * Indicates that user input is required. This property is only needed for accessibility purposes when a
      * single relationship between the field and a label (see aggregation `labelFor` of `sap.m.Label`) cannot
      * be established (e.g. one label should label multiple fields).
      *
      * Default value is `false`.
      *
      * @returns Value of property `required`
      */
    def getRequired(): Boolean = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getValue value}.
      *
      * Defines the control value. The object has two properties 'operator' - a string, the key of a DynamicDateOption
      * and 'values' - an array of parameters for the same option. The control uses a special wrong-value object,
      * when the input receives an unrecognized string - { operator: "PARSEERROR", values: [...]}
      *
      * @returns Value of property `value`
      */
    def getValue(): js.Object = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getValueState valueState}.
      *
      * Accepts the core enumeration ValueState.type that supports `None`, `Error`, `Warning` and `Success`.
      * ValueState is managed internally only when validation is triggered by user interaction.
      *
      * Default value is `None`.
      *
      * @returns Value of property `valueState`
      */
    def getValueState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getValueStateText valueStateText}.
      *
      * Defines the text that appears in the value state message popup.
      *
      * @returns Value of property `valueStateText`
      */
    def getValueStateText(): String = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.92
      *
      * Opens the value help dialog.
      */
    def open(
      /**
      * DOM reference of the opening control. On tablet or desktop, the popover is positioned relatively to this
      * control.
      */
    oDomRef: HTMLElement
    ): Unit = js.native
    
    /**
      * @SINCE 1.105
      *
      * Opens the value help popover. The popover is positioned relatively to the control given as `oDomRef`
      * parameter on tablet or desktop and is full screen on phone. Therefore the control parameter is only used
      * on tablet or desktop and is ignored on phone.
      *
      * Note: use this method to open the value help popover only when the `hideInput` property is set to `true`.
      * Please consider opening of the value help popover by another control only in scenarios that comply with
      * Fiori guidelines. For example, opening the value help popover by another popover is not recommended.
      * The application developer should implement the following accessibility attributes to the opening control:
      * a text or tooltip that describes the action (example: "Open Dynamic Date Range"), and aria-haspopup attribute
      * with value of `true`.
      */
    def openBy(
      /**
      * DOM reference of the opening control. On tablet or desktop, the popover is positioned relatively to this
      * control.
      */
    oDomRef: HTMLElement
    ): Unit = js.native
    
    /**
      * @SINCE 1.92
      *
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.92
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.92
      *
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
    /**
      * @SINCE 1.92
      *
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
    
    /**
      * @SINCE 1.111.0
      *
      * Sets a new value for property {@link #getCalendarWeekNumbering calendarWeekNumbering}.
      *
      * If set, the calendar week numbering is used for display. If not set, the calendar week numbering of the
      * global configuration is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCalendarWeekNumbering(): this.type = js.native
    def setCalendarWeekNumbering(
      /**
      * New value for property `calendarWeekNumbering`
      */
    sCalendarWeekNumbering: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String
    ): this.type = js.native
    def setCalendarWeekNumbering(
      /**
      * New value for property `calendarWeekNumbering`
      */
    sCalendarWeekNumbering: CalendarWeekNumbering
    ): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Defines whether the control can be modified by the user or not. **Note:** A user can tab to the non-editable
      * control, highlight it, and copy the text from it.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditable(): this.type = js.native
    def setEditable(/**
      * New value for property `editable`
      */
    bEditable: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getEnableGroupHeaders enableGroupHeaders}.
      *
      * Disable list group headers.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableGroupHeaders(): this.type = js.native
    def setEnableGroupHeaders(/**
      * New value for property `enableGroupHeaders`
      */
    bEnableGroupHeaders: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Indicates whether the user can interact with the control or not. **Note:** Disabled controls cannot be
      * focused and they are out of the tab-chain.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getFormatter formatter}.
      *
      * An instance of sap.m.DynamicDateFormat or a user defined format object with the corresponding formatting
      * and parsing functionality.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFormatter(/**
      * New value for property `formatter`
      */
    oFormatter: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.105
      *
      * Sets a new value for property {@link #getHideInput hideInput}.
      *
      * Determines whether the input field of the control is hidden or visible. When set to `true`, the input
      * field becomes invisible and there is no way to open the value help popover. In that case it can be opened
      * by another control through calling of control's `openBy` method, and the opening control's DOM reference
      * must be provided as parameter.
      *
      * Note: Since the Dynamic Date Range is not responsible for accessibility attributes of the control which
      * opens its popover, those attributes should be added by the application developer. The following is recommended
      * to be added to the opening control: a text or tooltip that describes the action (example: "Open Dynamic
      * Date Range"), and also aria-haspopup attribute with value of `true`.
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
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getName name}.
      *
      * Defines the name of the control for the purposes of form submission.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getOptions options}.
      *
      * Array of standard and custom option keys
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `["DATE", "TODAY", "YESTERDAY", "TOMORROW", "FIRSTDAYWEEK", "LASTDAYWEEK", "FIRSTDAYMONTH",
      * "LASTDAYMONTH", "FIRSTDAYQUARTER", "LASTDAYQUARTER", "FIRSTDAYYEAR", "LASTDAYYEAR", "DATERANGE", "DATETIMERANGE",
      * "FROM", "TO", "FROMDATETIME", "TODATETIME", "YEARTODATE", "DATETOYEAR", "LASTMINUTES", "LASTHOURS", "LASTDAYS",
      * "LASTWEEKS", "LASTMONTHS", "LASTQUARTERS", "LASTYEARS", "NEXTMINUTES", "NEXTHOURS", "NEXTDAYS", "NEXTWEEKS",
      * "NEXTMONTHS", "NEXTQUARTERS", "NEXTYEARS", "TODAYFROMTO", "THISWEEK", "LASTWEEK", "NEXTWEEK", "SPECIFICMONTH",
      * "SPECIFICMONTHINYEAR", "THISMONTH", "LASTMONTH", "NEXTMONTH", "THISQUARTER", "LASTQUARTER", "NEXTQUARTER",
      * "QUARTER1", "QUARTER2", "QUARTER3", "QUARTER4", "THISYEAR", "LASTYEAR", "NEXTYEAR", "DATETIME"]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOptions(): this.type = js.native
    def setOptions(/**
      * New value for property `options`
      */
    sOptions: js.Array[String]): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getPlaceholder placeholder}.
      *
      * Defines a short hint intended to aid the user with data entry when the control has no value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlaceholder(): this.type = js.native
    def setPlaceholder(/**
      * New value for property `placeholder`
      */
    sPlaceholder: String): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getRequired required}.
      *
      * Indicates that user input is required. This property is only needed for accessibility purposes when a
      * single relationship between the field and a label (see aggregation `labelFor` of `sap.m.Label`) cannot
      * be established (e.g. one label should label multiple fields).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRequired(): this.type = js.native
    def setRequired(/**
      * New value for property `required`
      */
    bRequired: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getValueState valueState}.
      *
      * Accepts the core enumeration ValueState.type that supports `None`, `Error`, `Warning` and `Success`.
      * ValueState is managed internally only when validation is triggered by user interaction.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueState(): this.type = js.native
    def setValueState(
      /**
      * New value for property `valueState`
      */
    sValueState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setValueState(/**
      * New value for property `valueState`
      */
    sValueState: ValueState): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getValueStateText valueStateText}.
      *
      * Defines the text that appears in the value state message popup.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueStateText(): this.type = js.native
    def setValueStateText(/**
      * New value for property `valueStateText`
      */
    sValueStateText: String): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control.
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
  
  trait DynamicDateRangeSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.92
      *
      * Association to controls / IDs that describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Association to controls / IDs that label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.111.0
      *
      * If set, the calendar week numbering is used for display. If not set, the calendar week numbering of the
      * global configuration is used.
      */
    var calendarWeekNumbering: js.UndefOr[
        CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Is fired when the text in the input field has changed and the focus leaves the input field or the Enter
      * key is pressed.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Defines whether the control can be modified by the user or not. **Note:** A user can tab to the non-editable
      * control, highlight it, and copy the text from it.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Disable list group headers.
      */
    var enableGroupHeaders: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Indicates whether the user can interact with the control or not. **Note:** Disabled controls cannot be
      * focused and they are out of the tab-chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * An instance of sap.m.DynamicDateFormat or a user defined format object with the corresponding formatting
      * and parsing functionality.
      */
    var formatter: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.105
      *
      * Determines whether the input field of the control is hidden or visible. When set to `true`, the input
      * field becomes invisible and there is no way to open the value help popover. In that case it can be opened
      * by another control through calling of control's `openBy` method, and the opening control's DOM reference
      * must be provided as parameter.
      *
      * Note: Since the Dynamic Date Range is not responsible for accessibility attributes of the control which
      * opens its popover, those attributes should be added by the application developer. The following is recommended
      * to be added to the opening control: a text or tooltip that describes the action (example: "Open Dynamic
      * Date Range"), and also aria-haspopup attribute with value of `true`.
      */
    var hideInput: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Defines the name of the control for the purposes of form submission.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Array of standard and custom option keys
      */
    var options: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Defines a short hint intended to aid the user with data entry when the control has no value.
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Indicates that user input is required. This property is only needed for accessibility purposes when a
      * single relationship between the field and a label (see aggregation `labelFor` of `sap.m.Label`) cannot
      * be established (e.g. one label should label multiple fields).
      */
    var required: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Defines the control value. The object has two properties 'operator' - a string, the key of a DynamicDateOption
      * and 'values' - an array of parameters for the same option. The control uses a special wrong-value object,
      * when the input receives an unrecognized string - { operator: "PARSEERROR", values: [...]}
      */
    var value: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Accepts the core enumeration ValueState.type that supports `None`, `Error`, `Warning` and `Success`.
      * ValueState is managed internally only when validation is triggered by user interaction.
      */
    var valueState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Defines the text that appears in the value state message popup.
      */
    var valueStateText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.92
      *
      * Defines the width of the control.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DynamicDateRangeSettings {
    
    inline def apply(): DynamicDateRangeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicDateRangeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicDateRangeSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setCalendarWeekNumbering(
        value: CalendarWeekNumbering | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarWeekNumbering * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "calendarWeekNumbering", value.asInstanceOf[js.Any])
      
      inline def setCalendarWeekNumberingUndefined: Self = StObject.set(x, "calendarWeekNumbering", js.undefined)
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEnableGroupHeaders(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableGroupHeaders", value.asInstanceOf[js.Any])
      
      inline def setEnableGroupHeadersUndefined: Self = StObject.set(x, "enableGroupHeaders", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFormatter(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setHideInput(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideInput", value.asInstanceOf[js.Any])
      
      inline def setHideInputUndefined: Self = StObject.set(x, "hideInput", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlaceholder(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRequired(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValue(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
      
      inline def setValueStateText(value: String | PropertyBindingInfo): Self = StObject.set(x, "valueStateText", value.asInstanceOf[js.Any])
      
      inline def setValueStateTextUndefined: Self = StObject.set(x, "valueStateText", js.undefined)
      
      inline def setValueStateUndefined: Self = StObject.set(x, "valueState", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
