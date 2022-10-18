package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainRangeSliderMod {
  
  @JSImport("sap/ui/webc/main/RangeSlider", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `RangeSlider`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends RangeSlider {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: RangeSliderSettings) = this()
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
    mSettings: RangeSliderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: RangeSliderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/RangeSlider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.RangeSlider with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, RangeSlider]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RangeSlider],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.RangeSlider.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait RangeSlider
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.webc.main.RangeSlider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.RangeSlider` itself.
      *
      * Fired when the value changes and the user has finished interacting with the slider.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.RangeSlider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.ui.webc.main.RangeSlider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.RangeSlider` itself.
      *
      * Fired when the value changes and the user has finished interacting with the slider.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.RangeSlider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:input input} event of this `sap.ui.webc.main.RangeSlider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.RangeSlider` itself.
      *
      * Fired when the value changes due to user interaction that is not yet finished - during mouse/touch dragging.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachInput(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachInput(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.RangeSlider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:input input} event of this `sap.ui.webc.main.RangeSlider`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.RangeSlider` itself.
      *
      * Fired when the value changes due to user interaction that is not yet finished - during mouse/touch dragging.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachInput(
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
    def attachInput(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.RangeSlider` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.ui.webc.main.RangeSlider`.
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
      * Detaches event handler `fnFunction` from the {@link #event:input input} event of this `sap.ui.webc.main.RangeSlider`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachInput(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachInput(
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
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:input input} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireInput(): this.type = js.native
    def fireInput(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEndValue endValue}.
      *
      * Defines end point of a selection - position of a second handle on the slider.
      *
      *
      *
      * Default value is `100`.
      *
      * @returns Value of property `endValue`
      */
    def getEndValue(): float = js.native
    
    /**
      * Gets current value of property {@link #getLabelInterval labelInterval}.
      *
      * Displays a label with a value on every N-th step.
      *
      *  **Note:** The step and tickmarks properties must be enabled. Example - if the step value is set to 2
      * and the label interval is also specified to 2 - then every second tickmark will be labelled, which means
      * every 4th value number.
      *
      * Default value is `0`.
      *
      * @returns Value of property `labelInterval`
      */
    def getLabelInterval(): int = js.native
    
    /**
      * Gets current value of property {@link #getMax max}.
      *
      * Defines the maximum value of the slider.
      *
      * Default value is `100`.
      *
      * @returns Value of property `max`
      */
    def getMax(): float = js.native
    
    /**
      * Gets current value of property {@link #getMin min}.
      *
      * Defines the minimum value of the slider.
      *
      * Default value is `0`.
      *
      * @returns Value of property `min`
      */
    def getMin(): float = js.native
    
    /**
      * Gets current value of property {@link #getShowTickmarks showTickmarks}.
      *
      * Enables tickmarks visualization for each step.
      *
      *  **Note:** The step must be a positive number.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showTickmarks`
      */
    def getShowTickmarks(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowTooltip showTooltip}.
      *
      * Enables handle tooltip displaying the current value.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showTooltip`
      */
    def getShowTooltip(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getStartValue startValue}.
      *
      * Defines start point of a selection - position of a first handle on the slider.
      *
      *
      *
      * Default value is `0`.
      *
      * @returns Value of property `startValue`
      */
    def getStartValue(): float = js.native
    
    /**
      * Gets current value of property {@link #getStep step}.
      *
      * Defines the size of the slider's selection intervals (e.g. min = 0, max = 10, step = 5 would result in
      * possible selection of the values 0, 5, 10).
      *
      *  **Note:** If set to 0 the slider handle movement is disabled. When negative number or value other than
      * a number, the component fallbacks to its default value.
      *
      * Default value is `1`.
      *
      * @returns Value of property `step`
      */
    def getStep(): int = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible aria name of the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
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
      * Sets a new value for property {@link #getEndValue endValue}.
      *
      * Defines end point of a selection - position of a second handle on the slider.
      *
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `100`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEndValue(): this.type = js.native
    def setEndValue(/**
      * New value for property `endValue`
      */
    fEndValue: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLabelInterval labelInterval}.
      *
      * Displays a label with a value on every N-th step.
      *
      *  **Note:** The step and tickmarks properties must be enabled. Example - if the step value is set to 2
      * and the label interval is also specified to 2 - then every second tickmark will be labelled, which means
      * every 4th value number.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabelInterval(): this.type = js.native
    def setLabelInterval(/**
      * New value for property `labelInterval`
      */
    iLabelInterval: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMax max}.
      *
      * Defines the maximum value of the slider.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `100`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMax(): this.type = js.native
    def setMax(/**
      * New value for property `max`
      */
    fMax: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMin min}.
      *
      * Defines the minimum value of the slider.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMin(): this.type = js.native
    def setMin(/**
      * New value for property `min`
      */
    fMin: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowTickmarks showTickmarks}.
      *
      * Enables tickmarks visualization for each step.
      *
      *  **Note:** The step must be a positive number.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTickmarks(): this.type = js.native
    def setShowTickmarks(/**
      * New value for property `showTickmarks`
      */
    bShowTickmarks: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowTooltip showTooltip}.
      *
      * Enables handle tooltip displaying the current value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTooltip(): this.type = js.native
    def setShowTooltip(/**
      * New value for property `showTooltip`
      */
    bShowTooltip: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStartValue startValue}.
      *
      * Defines start point of a selection - position of a first handle on the slider.
      *
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStartValue(): this.type = js.native
    def setStartValue(/**
      * New value for property `startValue`
      */
    fStartValue: float): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStep step}.
      *
      * Defines the size of the slider's selection intervals (e.g. min = 0, max = 10, step = 5 would result in
      * possible selection of the values 0, 5, 10).
      *
      *  **Note:** If set to 0 the slider handle movement is disabled. When negative number or value other than
      * a number, the component fallbacks to its default value.
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
    iStep: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control
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
  
  trait RangeSliderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the accessible aria name of the component.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when the value changes and the user has finished interacting with the slider.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines end point of a selection - position of a second handle on the slider.
      */
    var endValue: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the value changes due to user interaction that is not yet finished - during mouse/touch dragging.
      */
    var input: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Displays a label with a value on every N-th step.
      *
      *  **Note:** The step and tickmarks properties must be enabled. Example - if the step value is set to 2
      * and the label interval is also specified to 2 - then every second tickmark will be labelled, which means
      * every 4th value number.
      */
    var labelInterval: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the maximum value of the slider.
      */
    var max: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the minimum value of the slider.
      */
    var min: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables tickmarks visualization for each step.
      *
      *  **Note:** The step must be a positive number.
      */
    var showTickmarks: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables handle tooltip displaying the current value.
      */
    var showTooltip: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines start point of a selection - position of a first handle on the slider.
      */
    var startValue: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the size of the slider's selection intervals (e.g. min = 0, max = 10, step = 5 would result in
      * possible selection of the values 0, 5, 10).
      *
      *  **Note:** If set to 0 the slider handle movement is disabled. When negative number or value other than
      * a number, the component fallbacks to its default value.
      */
    var step: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object RangeSliderSettings {
    
    inline def apply(): RangeSliderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeSliderSettings]
    }
    
    extension [Self <: RangeSliderSettings](x: Self) {
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEndValue(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
      
      inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
      
      inline def setInput(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setLabelInterval(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "labelInterval", value.asInstanceOf[js.Any])
      
      inline def setLabelIntervalUndefined: Self = StObject.set(x, "labelInterval", js.undefined)
      
      inline def setMax(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setShowTickmarks(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTickmarks", value.asInstanceOf[js.Any])
      
      inline def setShowTickmarksUndefined: Self = StObject.set(x, "showTickmarks", js.undefined)
      
      inline def setShowTooltip(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setStartValue(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
      
      inline def setStep(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
