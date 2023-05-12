package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMDateTimeFieldMod.DateTimeFieldSettings
import typings.openui5.sapMLibraryMod.TimePickerMaskMode
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTimePickerMod {
  
  @JSImport("sap/m/TimePicker", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `TimePicker`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/time-picker/ Time Picker}
    */
  open class default () extends TimePicker {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TimePickerSettings) = this()
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
    mSettings: TimePickerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TimePickerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/TimePicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TimePicker with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, TimePicker]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TimePicker],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.TimePicker.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TimePicker
    extends typings.openui5.sapMDateTimeFieldMod.default {
    
    /**
      * Adds some rule to the aggregation {@link #getRules rules}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addRule(
      /**
      * The rule to add; if empty, nothing is inserted
      */
    oRule: typings.openui5.sapMMaskInputRuleMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterValueHelpClose afterValueHelpClose} event
      * of this `sap.m.TimePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TimePicker` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.m.TimePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterValueHelpClose afterValueHelpClose} event
      * of this `sap.m.TimePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TimePicker` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.m.TimePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterValueHelpOpen afterValueHelpOpen} event
      * of this `sap.m.TimePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TimePicker` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.m.TimePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.102.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterValueHelpOpen afterValueHelpOpen} event
      * of this `sap.m.TimePicker`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TimePicker` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.m.TimePicker` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the rules in the aggregation {@link #getRules rules}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRules(): this.type = js.native
    
    /**
      * @SINCE 1.102.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:afterValueHelpClose afterValueHelpClose} event
      * of this `sap.m.TimePicker`.
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
      * of this `sap.m.TimePicker`.
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
      * @SINCE 1.102.0
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
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
      * The arguments to pass along with the event
      */
    mArguments: js.Object): this.type = js.native
    
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
      * to be added to the opening control: a text or tooltip that describes the action (example: "Open Time
      * Picker"), and also aria-haspopup attribute with value of `sap.ui.core.aria.HasPopup.Dialog`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideInput`
      */
    def getHideInput(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLocaleId localeId}.
      *
      * Defines the locale used to parse string values representing time.
      *
      * Determines the locale, used to interpret the string, supplied by the `value` property.
      *
      * Example: AM in the string "09:04 AM" is locale (language) dependent. The format comes from the browser
      * language settings if not set explicitly. Used in combination with 12 hour `displayFormat` containing
      * 'a', which stands for day period string.
      *
      * @returns Value of property `localeId`
      */
    def getLocaleId(): String = js.native
    
    /**
      * Gets current value of property {@link #getMask mask}.
      *
      * Mask defined by its characters type (respectively, by its length). You should consider the following
      * important facts: 1. The mask characters normally correspond to an existing rule (one rule per unique
      * char). Characters which don't, are considered immutable characters (for example, the mask '2099', where
      * '9' corresponds to a rule for digits, has the characters '2' and '0' as immutable). 2. Adding a rule
      * corresponding to the `placeholderSymbol` is not recommended and would lead to an unpredictable behavior.
      * 3. You can use the special escape character '^' called "Caret" prepending a rule character to make it
      * immutable. Use the double escape '^^' if you want to make use of the escape character as an immutable
      * one.
      *
      * @returns Value of property `mask`
      */
    def getMask(): String = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getMaskMode maskMode}.
      *
      * Defines whether the mask is enabled. When disabled, there are no restrictions and validation for the
      * user and no placeholders are displayed.
      *
      * **Note:** A disabled mask does not reset any validation rules that are already set. You can update the
      * `mask` property and add new `rules` while it is disabled. When `maskMode` is set to `On` again, the `rules`
      * and the updated `mask` will be applied.
      *
      * Default value is `On`.
      *
      * @returns Value of property `maskMode`
      */
    def getMaskMode(): TimePickerMaskMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TimePickerMaskMode * / any */ String) = js.native
    
    /**
      * @SINCE 1.40
      *
      * Gets current value of property {@link #getMinutesStep minutesStep}.
      *
      * Sets the minutes step. If step is less than 1, it will be automatically converted back to 1. The minutes
      * clock is populated only by multiples of the step.
      *
      * Default value is `1`.
      *
      * @returns Value of property `minutesStep`
      */
    def getMinutesStep(): int = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholderSymbol placeholderSymbol}.
      *
      * Defines a placeholder symbol. Shown at the position where there is no user input yet.
      *
      * Default value is `"_"`.
      *
      * @returns Value of property `placeholderSymbol`
      */
    def getPlaceholderSymbol(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getRules rules}.
      *
      * A list of validation rules (one rule per mask character).
      */
    def getRules(): js.Array[typings.openui5.sapMMaskInputRuleMod.default] = js.native
    
    /**
      * @SINCE 1.40
      *
      * Gets current value of property {@link #getSecondsStep secondsStep}.
      *
      * Sets the seconds step. If step is less than 1, it will be automatically converted back to 1. The seconds
      * clock is populated only by multiples of the step.
      *
      * Default value is `1`.
      *
      * @returns Value of property `secondsStep`
      */
    def getSecondsStep(): int = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets current value of property {@link #getShowCurrentTimeButton showCurrentTimeButton}.
      *
      * Determines whether there is a shortcut navigation to current time.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showCurrentTimeButton`
      */
    def getShowCurrentTimeButton(): Boolean = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getSupport2400 support2400}.
      *
      * Allows to set a value of 24:00, used to indicate the end of the day. Works only with HH or H formats.
      * Don't use it together with am/pm.
      *
      * Default value is `false`.
      *
      * @returns Value of property `support2400`
      */
    def getSupport2400(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Displays the text of the general picker label and is read by screen readers. It is visible only on phone.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Checks for the provided `sap.m.MaskInputRule` in the aggregation {@link #getRules rules}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfRule(
      /**
      * The rule whose index is looked for
      */
    oRule: typings.openui5.sapMMaskInputRuleMod.default
    ): int = js.native
    
    /**
      * Inserts a rule into the aggregation {@link #getRules rules}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertRule(
      /**
      * The rule to insert; if empty, nothing is inserted
      */
    oRule: typings.openui5.sapMMaskInputRuleMod.default,
      /**
      * The `0`-based index the rule should be inserted at; for a negative value of `iIndex`, the rule is inserted
      * at position 0; for a value greater than the current size of the aggregation, the rule is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Called after the clock picker closes.
      */
    def onAfterClose(): Unit = js.native
    
    /**
      * Called after the clock picker appears.
      */
    def onAfterOpen(): Unit = js.native
    
    /**
      * Called before the clock picker appears.
      */
    def onBeforeOpen(): Unit = js.native
    
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
      * that describes the action (example: "Open Time Picker"), and aria-haspopup attribute with value of `sap.ui.core.aria.HasPopup.Dialog`.
      */
    def openBy(
      /**
      * DOM reference of the opening control. On tablet or desktop, the popover is positioned relatively to this
      * control.
      */
    oDomRef: HTMLElement
    ): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getRules rules}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllRules(): js.Array[typings.openui5.sapMMaskInputRuleMod.default] = js.native
    
    def removeRule(/**
      * The rule to remove or its index or id
      */
    vRule: String): typings.openui5.sapMMaskInputRuleMod.default | Null = js.native
    /**
      * Removes a rule from the aggregation {@link #getRules rules}.
      *
      * @returns The removed rule or `null`
      */
    def removeRule(/**
      * The rule to remove or its index or id
      */
    vRule: int): typings.openui5.sapMMaskInputRuleMod.default | Null = js.native
    def removeRule(
      /**
      * The rule to remove or its index or id
      */
    vRule: typings.openui5.sapMMaskInputRuleMod.default
    ): typings.openui5.sapMMaskInputRuleMod.default | Null = js.native
    
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
      * to be added to the opening control: a text or tooltip that describes the action (example: "Open Time
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
      * Sets the locale of the control.
      *
      * Used for parsing and formatting the time values in languages different than English. Necessary for translation
      * and auto-complete of the day periods, such as AM and PM.
      *
      * @returns Reference to `this` for method chaining
      */
    def setLocaleId(/**
      * A locale identifier like 'en_US'
      */
    sLocaleId: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMask mask}.
      *
      * Mask defined by its characters type (respectively, by its length). You should consider the following
      * important facts: 1. The mask characters normally correspond to an existing rule (one rule per unique
      * char). Characters which don't, are considered immutable characters (for example, the mask '2099', where
      * '9' corresponds to a rule for digits, has the characters '2' and '0' as immutable). 2. Adding a rule
      * corresponding to the `placeholderSymbol` is not recommended and would lead to an unpredictable behavior.
      * 3. You can use the special escape character '^' called "Caret" prepending a rule character to make it
      * immutable. Use the double escape '^^' if you want to make use of the escape character as an immutable
      * one.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMask(): this.type = js.native
    def setMask(/**
      * New value for property `mask`
      */
    sMask: String): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getMaskMode maskMode}.
      *
      * Defines whether the mask is enabled. When disabled, there are no restrictions and validation for the
      * user and no placeholders are displayed.
      *
      * **Note:** A disabled mask does not reset any validation rules that are already set. You can update the
      * `mask` property and add new `rules` while it is disabled. When `maskMode` is set to `On` again, the `rules`
      * and the updated `mask` will be applied.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `On`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaskMode(): this.type = js.native
    def setMaskMode(
      /**
      * New value for property `maskMode`
      */
    sMaskMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TimePickerMaskMode * / any */ String
    ): this.type = js.native
    def setMaskMode(/**
      * New value for property `maskMode`
      */
    sMaskMode: TimePickerMaskMode): this.type = js.native
    
    /**
      * Sets the minutes step of clocks and inputs.
      *
      * @returns Reference to `this` for method chaining
      */
    def setMinutesStep(/**
      * The step used to generate values for the minutes clock/input
      */
    step: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPlaceholderSymbol placeholderSymbol}.
      *
      * Defines a placeholder symbol. Shown at the position where there is no user input yet.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"_"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlaceholderSymbol(): this.type = js.native
    def setPlaceholderSymbol(/**
      * New value for property `placeholderSymbol`
      */
    sPlaceholderSymbol: String): this.type = js.native
    
    /**
      * Sets the seconds step of clocks and inputs.
      *
      * @returns Reference to `this` for method chaining
      */
    def setSecondsStep(/**
      * The step used to generate values for the seconds clock/input
      */
    step: int): this.type = js.native
    
    /**
      * @SINCE 1.98
      *
      * Sets a new value for property {@link #getShowCurrentTimeButton showCurrentTimeButton}.
      *
      * Determines whether there is a shortcut navigation to current time.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCurrentTimeButton(): this.type = js.native
    def setShowCurrentTimeButton(/**
      * New value for property `showCurrentTimeButton`
      */
    bShowCurrentTimeButton: Boolean): this.type = js.native
    
    /**
      * Sets `support2400` of the control.
      *
      * Allows the control to use 24-hour format. Recommended usage is to not use it with am/pm format.
      *
      * @returns Reference to `this` for method chaining
      */
    def setSupport2400(bSupport2400: Boolean): this.type = js.native
  }
  
  trait TimePickerSettings
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
      * @SINCE 1.97
      *
      * Determines whether the input field of the picker is hidden or visible. When set to `true`, the input
      * field becomes invisible and there is no way to open the picker popover. In that case it can be opened
      * by another control through calling of picker's `openBy` method, and the opening control's DOM reference
      * must be provided as parameter.
      *
      * Note: Since the picker is not responsible for accessibility attributes of the control which opens its
      * popover, those attributes should be added by the application developer. The following is recommended
      * to be added to the opening control: a text or tooltip that describes the action (example: "Open Time
      * Picker"), and also aria-haspopup attribute with value of `sap.ui.core.aria.HasPopup.Dialog`.
      */
    var hideInput: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the locale used to parse string values representing time.
      *
      * Determines the locale, used to interpret the string, supplied by the `value` property.
      *
      * Example: AM in the string "09:04 AM" is locale (language) dependent. The format comes from the browser
      * language settings if not set explicitly. Used in combination with 12 hour `displayFormat` containing
      * 'a', which stands for day period string.
      */
    var localeId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Mask defined by its characters type (respectively, by its length). You should consider the following
      * important facts: 1. The mask characters normally correspond to an existing rule (one rule per unique
      * char). Characters which don't, are considered immutable characters (for example, the mask '2099', where
      * '9' corresponds to a rule for digits, has the characters '2' and '0' as immutable). 2. Adding a rule
      * corresponding to the `placeholderSymbol` is not recommended and would lead to an unpredictable behavior.
      * 3. You can use the special escape character '^' called "Caret" prepending a rule character to make it
      * immutable. Use the double escape '^^' if you want to make use of the escape character as an immutable
      * one.
      */
    var mask: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Defines whether the mask is enabled. When disabled, there are no restrictions and validation for the
      * user and no placeholders are displayed.
      *
      * **Note:** A disabled mask does not reset any validation rules that are already set. You can update the
      * `mask` property and add new `rules` while it is disabled. When `maskMode` is set to `On` again, the `rules`
      * and the updated `mask` will be applied.
      */
    var maskMode: js.UndefOr[
        TimePickerMaskMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TimePickerMaskMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.40
      *
      * Sets the minutes step. If step is less than 1, it will be automatically converted back to 1. The minutes
      * clock is populated only by multiples of the step.
      */
    var minutesStep: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines a placeholder symbol. Shown at the position where there is no user input yet.
      */
    var placeholderSymbol: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * A list of validation rules (one rule per mask character).
      */
    var rules: js.UndefOr[
        js.Array[typings.openui5.sapMMaskInputRuleMod.default] | typings.openui5.sapMMaskInputRuleMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.40
      *
      * Sets the seconds step. If step is less than 1, it will be automatically converted back to 1. The seconds
      * clock is populated only by multiples of the step.
      */
    var secondsStep: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.98
      *
      * Determines whether there is a shortcut navigation to current time.
      */
    var showCurrentTimeButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Allows to set a value of 24:00, used to indicate the end of the day. Works only with HH or H formats.
      * Don't use it together with am/pm.
      */
    var support2400: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Displays the text of the general picker label and is read by screen readers. It is visible only on phone.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object TimePickerSettings {
    
    inline def apply(): TimePickerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimePickerSettings] (val x: Self) extends AnyVal {
      
      inline def setAfterValueHelpClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterValueHelpClose", js.Any.fromFunction1(value))
      
      inline def setAfterValueHelpCloseUndefined: Self = StObject.set(x, "afterValueHelpClose", js.undefined)
      
      inline def setAfterValueHelpOpen(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterValueHelpOpen", js.Any.fromFunction1(value))
      
      inline def setAfterValueHelpOpenUndefined: Self = StObject.set(x, "afterValueHelpOpen", js.undefined)
      
      inline def setHideInput(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideInput", value.asInstanceOf[js.Any])
      
      inline def setHideInputUndefined: Self = StObject.set(x, "hideInput", js.undefined)
      
      inline def setLocaleId(value: String | PropertyBindingInfo): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
      
      inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
      
      inline def setMask(value: String | PropertyBindingInfo): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskMode(
        value: TimePickerMaskMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TimePickerMaskMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "maskMode", value.asInstanceOf[js.Any])
      
      inline def setMaskModeUndefined: Self = StObject.set(x, "maskMode", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMinutesStep(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minutesStep", value.asInstanceOf[js.Any])
      
      inline def setMinutesStepUndefined: Self = StObject.set(x, "minutesStep", js.undefined)
      
      inline def setPlaceholderSymbol(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholderSymbol", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderSymbolUndefined: Self = StObject.set(x, "placeholderSymbol", js.undefined)
      
      inline def setRules(
        value: js.Array[typings.openui5.sapMMaskInputRuleMod.default] | typings.openui5.sapMMaskInputRuleMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: typings.openui5.sapMMaskInputRuleMod.default*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setSecondsStep(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "secondsStep", value.asInstanceOf[js.Any])
      
      inline def setSecondsStepUndefined: Self = StObject.set(x, "secondsStep", js.undefined)
      
      inline def setShowCurrentTimeButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCurrentTimeButton", value.asInstanceOf[js.Any])
      
      inline def setShowCurrentTimeButtonUndefined: Self = StObject.set(x, "showCurrentTimeButton", js.undefined)
      
      inline def setSupport2400(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "support2400", value.asInstanceOf[js.Any])
      
      inline def setSupport2400Undefined: Self = StObject.set(x, "support2400", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
