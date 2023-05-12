package typings.openui5

import typings.openui5.anon.Value
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.StepInputStepModeType
import typings.openui5.sapMLibraryMod.StepInputValidationMode
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMStepInputMod {
  
  @JSImport("sap/m/StepInput", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `StepInput`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/step-input/ Step Input}
    */
  open class default () extends StepInput {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: StepInputSettings) = this()
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
    mSettings: StepInputSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: StepInputSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/StepInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.StepInput with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, StepInput]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, StepInput],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.StepInput.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait StepInput
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent {
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
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
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.StepInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.StepInput` itself.
      *
      * Is fired when one of the following happens:
      *
      * 	 - the text in the input has changed and the focus leaves the input field or the enter key is pressed.
      *
      * 	 - One of the decrement or increment buttons is pressed
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
      * Context object to call the event handler with. Defaults to this `sap.m.StepInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.StepInput`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.StepInput` itself.
      *
      * Is fired when one of the following happens:
      *
      * 	 - the text in the input has changed and the focus leaves the input field or the enter key is pressed.
      *
      * 	 - One of the decrement or increment buttons is pressed
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
      * Context object to call the event handler with. Defaults to this `sap.m.StepInput` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.StepInput`.
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
    mParameters: Value): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getDescription description}.
      *
      * Determines the description text after the input field, for example units of measurement, currencies.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * @SINCE 1.46
      *
      * Gets current value of property {@link #getDisplayValuePrecision displayValuePrecision}.
      *
      * Determines the number of digits after the decimal point.
      *
      * The value should be between 0 (default) and 20. In case the value is not valid it will be set to the
      * default value.
      *
      * Default value is `0`.
      *
      * @returns Value of property `displayValuePrecision`
      */
    def getDisplayValuePrecision(): int = js.native
    
    /**
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
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getFieldWidth fieldWidth}.
      *
      * Determines the distribution of space between the input field and the description text . Default value
      * is 50% (leaving the other 50% for the description).
      *
      * **Note:** This property takes effect only if the `description` property is also set.
      *
      * Default value is `'50%'`.
      *
      * @returns Value of property `fieldWidth`
      */
    def getFieldWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getLargerStep largerStep}.
      *
      * Increases/decreases the value with a larger value than the set step only when using the PageUp/PageDown
      * keys. Default value is 2 times larger than the set step.
      *
      * Default value is `2`.
      *
      * @returns Value of property `largerStep`
      */
    def getLargerStep(): float = js.native
    
    /**
      * Gets current value of property {@link #getMax max}.
      *
      * Sets the maximum possible value of the defined range.
      *
      * @returns Value of property `max`
      */
    def getMax(): float = js.native
    
    /**
      * Gets current value of property {@link #getMin min}.
      *
      * Sets the minimum possible value of the defined range.
      *
      * @returns Value of property `min`
      */
    def getMin(): float = js.native
    
    /**
      * @SINCE 1.44.15
      *
      * Gets current value of property {@link #getName name}.
      *
      * Defines the name of the control for the purposes of form submission.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * @SINCE 1.44.15
      *
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * Defines a short hint intended to aid the user with data entry when the control has no value.
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * @SINCE 1.44.15
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
      * Gets current value of property {@link #getStep step}.
      *
      * Increases/decreases the value of the input. **Note:**
      * 	 - The value of the `step` property should not contain more digits after the decimal point than what
      * 			is set to the `displayValuePrecision` property, as it may lead to an increase/decrease that is not visible
      * 			for the user. For example, if the `value` is set to 1.22 and the `displayValuePrecision` is set to one
      * 			digit after the decimal, the user will see 1.2. In this case, if the `value` of the `step` property is
      * 			set to 1.005 and the user selects `increase`, the resulting value will increase to 1.2261 but the displayed
      * 			value will remain as 1.2 as it will be rounded to the first digit after the decimal point.
      * 	 - Depending on what is set for the `value` and the `displayValuePrecision` properties, it is possible
      * 			the displayed value to be rounded to a higher number, for example to 3.0 when the actual value is 2.99.
      *
      * Default value is `1`.
      *
      * @returns Value of property `step`
      */
    def getStep(): float = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getStepMode stepMode}.
      *
      * Defines the calculation mode for the provided `step` and `largerStep`.
      *
      * If the user increases/decreases the value by `largerStep`, this calculation will consider it as well.
      * For example, if the current `value` is 3, `step` is 5, `largerStep` is 5 and the user chooses PageUp,
      * the calculation logic will consider the value of 3x5=15 to decide what will be the next `value`.
      *
      * Default value is `AdditionAndSubtraction`.
      *
      * @returns Value of property `stepMode`
      */
    def getStepMode(): StepInputStepModeType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StepInputStepModeType * / any */ String) = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Defines the horizontal alignment of the text that is displayed inside the input field.
      *
      * Default value is `End`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getValidationMode validationMode}.
      *
      * Defines when the validation of the typed value will happen. By default this happens on focus out.
      *
      * Default value is `FocusOut`.
      *
      * @returns Value of property `validationMode`
      */
    def getValidationMode(): StepInputValidationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StepInputValidationMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Determines the value of the `StepInput` and can be set initially from the app developer.
      *
      * Default value is `0`.
      *
      * @returns Value of property `value`
      */
    def getValue(): float = js.native
    
    /**
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
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getValueStateText valueStateText}.
      *
      * Defines the text that appears in the value state message pop-up.
      *
      * @returns Value of property `valueStateText`
      */
    def getValueStateText(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
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
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getDescription description}.
      *
      * Determines the description text after the input field, for example units of measurement, currencies.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(): this.type = js.native
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * @SINCE 1.46
      *
      * Sets a new value for property {@link #getDisplayValuePrecision displayValuePrecision}.
      *
      * Determines the number of digits after the decimal point.
      *
      * The value should be between 0 (default) and 20. In case the value is not valid it will be set to the
      * default value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayValuePrecision(): this.type = js.native
    def setDisplayValuePrecision(/**
      * New value for property `displayValuePrecision`
      */
    iDisplayValuePrecision: int): this.type = js.native
    
    /**
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
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getFieldWidth fieldWidth}.
      *
      * Determines the distribution of space between the input field and the description text . Default value
      * is 50% (leaving the other 50% for the description).
      *
      * **Note:** This property takes effect only if the `description` property is also set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'50%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFieldWidth(): this.type = js.native
    def setFieldWidth(/**
      * New value for property `fieldWidth`
      */
    sFieldWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLargerStep largerStep}.
      *
      * Increases/decreases the value with a larger value than the set step only when using the PageUp/PageDown
      * keys. Default value is 2 times larger than the set step.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `2`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLargerStep(): this.type = js.native
    def setLargerStep(/**
      * New value for property `largerStep`
      */
    fLargerStep: float): this.type = js.native
    
    /**
      * @SINCE 1.44.15
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
      * @SINCE 1.44.15
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
      * @SINCE 1.44.15
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
      * Sets a new value for property {@link #getStep step}.
      *
      * Increases/decreases the value of the input. **Note:**
      * 	 - The value of the `step` property should not contain more digits after the decimal point than what
      * 			is set to the `displayValuePrecision` property, as it may lead to an increase/decrease that is not visible
      * 			for the user. For example, if the `value` is set to 1.22 and the `displayValuePrecision` is set to one
      * 			digit after the decimal, the user will see 1.2. In this case, if the `value` of the `step` property is
      * 			set to 1.005 and the user selects `increase`, the resulting value will increase to 1.2261 but the displayed
      * 			value will remain as 1.2 as it will be rounded to the first digit after the decimal point.
      * 	 - Depending on what is set for the `value` and the `displayValuePrecision` properties, it is possible
      * 			the displayed value to be rounded to a higher number, for example to 3.0 when the actual value is 2.99.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStep(): this.type = js.native
    def setStep(/**
      * New value for property `step`
      */
    fStep: float): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getStepMode stepMode}.
      *
      * Defines the calculation mode for the provided `step` and `largerStep`.
      *
      * If the user increases/decreases the value by `largerStep`, this calculation will consider it as well.
      * For example, if the current `value` is 3, `step` is 5, `largerStep` is 5 and the user chooses PageUp,
      * the calculation logic will consider the value of 3x5=15 to decide what will be the next `value`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `AdditionAndSubtraction`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStepMode(): this.type = js.native
    def setStepMode(
      /**
      * New value for property `stepMode`
      */
    sStepMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StepInputStepModeType * / any */ String
    ): this.type = js.native
    def setStepMode(/**
      * New value for property `stepMode`
      */
    sStepMode: StepInputStepModeType): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getTextAlign textAlign}.
      *
      * Defines the horizontal alignment of the text that is displayed inside the input field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `End`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextAlign(): this.type = js.native
    def setTextAlign(
      /**
      * New value for property `textAlign`
      */
    sTextAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String
    ): this.type = js.native
    def setTextAlign(/**
      * New value for property `textAlign`
      */
    sTextAlign: TextAlign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * Determines the value of the `StepInput` and can be set initially from the app developer.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    fValue: float): this.type = js.native
    
    /**
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
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getValueStateText valueStateText}.
      *
      * Defines the text that appears in the value state message pop-up.
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
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait StepInputSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / IDs which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / IDs that label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Is fired when one of the following happens:
      *
      * 	 - the text in the input has changed and the focus leaves the input field or the enter key is pressed.
      *
      * 	 - One of the decrement or increment buttons is pressed
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Determines the description text after the input field, for example units of measurement, currencies.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.46
      *
      * Determines the number of digits after the decimal point.
      *
      * The value should be between 0 (default) and 20. In case the value is not valid it will be set to the
      * default value.
      */
    var displayValuePrecision: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines whether the control can be modified by the user or not. **Note:** A user can tab to the non-editable
      * control, highlight it, and copy the text from it.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Indicates whether the user can interact with the control or not. **Note:** Disabled controls cannot be
      * focused and they are out of the tab-chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Determines the distribution of space between the input field and the description text . Default value
      * is 50% (leaving the other 50% for the description).
      *
      * **Note:** This property takes effect only if the `description` property is also set.
      */
    var fieldWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Increases/decreases the value with a larger value than the set step only when using the PageUp/PageDown
      * keys. Default value is 2 times larger than the set step.
      */
    var largerStep: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the maximum possible value of the defined range.
      */
    var max: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the minimum possible value of the defined range.
      */
    var min: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.44.15
      *
      * Defines the name of the control for the purposes of form submission.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.44.15
      *
      * Defines a short hint intended to aid the user with data entry when the control has no value.
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.44.15
      *
      * Indicates that user input is required. This property is only needed for accessibility purposes when a
      * single relationship between the field and a label (see aggregation `labelFor` of `sap.m.Label`) cannot
      * be established (e.g. one label should label multiple fields).
      */
    var required: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Increases/decreases the value of the input. **Note:**
      * 	 - The value of the `step` property should not contain more digits after the decimal point than what
      * 			is set to the `displayValuePrecision` property, as it may lead to an increase/decrease that is not visible
      * 			for the user. For example, if the `value` is set to 1.22 and the `displayValuePrecision` is set to one
      * 			digit after the decimal, the user will see 1.2. In this case, if the `value` of the `step` property is
      * 			set to 1.005 and the user selects `increase`, the resulting value will increase to 1.2261 but the displayed
      * 			value will remain as 1.2 as it will be rounded to the first digit after the decimal point.
      * 	 - Depending on what is set for the `value` and the `displayValuePrecision` properties, it is possible
      * 			the displayed value to be rounded to a higher number, for example to 3.0 when the actual value is 2.99.
      */
    var step: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Defines the calculation mode for the provided `step` and `largerStep`.
      *
      * If the user increases/decreases the value by `largerStep`, this calculation will consider it as well.
      * For example, if the current `value` is 3, `step` is 5, `largerStep` is 5 and the user chooses PageUp,
      * the calculation logic will consider the value of 3x5=15 to decide what will be the next `value`.
      */
    var stepMode: js.UndefOr[
        StepInputStepModeType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StepInputStepModeType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Defines the horizontal alignment of the text that is displayed inside the input field.
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Defines when the validation of the typed value will happen. By default this happens on focus out.
      */
    var validationMode: js.UndefOr[
        StepInputValidationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StepInputValidationMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the value of the `StepInput` and can be set initially from the app developer.
      */
    var value: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Accepts the core enumeration ValueState.type that supports `None`, `Error`, `Warning` and `Success`.
      * ValueState is managed internally only when validation is triggered by user interaction.
      */
    var valueState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Defines the text that appears in the value state message pop-up.
      */
    var valueStateText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the width of the control.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object StepInputSettings {
    
    inline def apply(): StepInputSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepInputSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepInputSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplayValuePrecision(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayValuePrecision", value.asInstanceOf[js.Any])
      
      inline def setDisplayValuePrecisionUndefined: Self = StObject.set(x, "displayValuePrecision", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFieldWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fieldWidth", value.asInstanceOf[js.Any])
      
      inline def setFieldWidthUndefined: Self = StObject.set(x, "fieldWidth", js.undefined)
      
      inline def setLargerStep(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "largerStep", value.asInstanceOf[js.Any])
      
      inline def setLargerStepUndefined: Self = StObject.set(x, "largerStep", js.undefined)
      
      inline def setMax(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlaceholder(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRequired(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStep(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepMode(
        value: StepInputStepModeType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StepInputStepModeType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "stepMode", value.asInstanceOf[js.Any])
      
      inline def setStepModeUndefined: Self = StObject.set(x, "stepMode", js.undefined)
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setValidationMode(
        value: StepInputValidationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StepInputValidationMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "validationMode", value.asInstanceOf[js.Any])
      
      inline def setValidationModeUndefined: Self = StObject.set(x, "validationMode", js.undefined)
      
      inline def setValue(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
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
