package typings.openui5

import typings.openui5.anon.Value
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTimePickerSlidersMod {
  
  @JSImport("sap/m/TimePickerSliders", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `TimePickerSliders`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TimePickerSliders {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TimePickerSlidersSettings) = this()
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
    mSettings: TimePickerSlidersSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TimePickerSlidersSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/TimePickerSliders", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TimePickerSliders with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, TimePickerSliders]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TimePickerSliders],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.TimePickerSliders.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TimePickerSliders
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.TimePickerSliders`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TimePickerSliders` itself.
      *
      * Fired when the value is changed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.TimePickerSliders` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.TimePickerSliders`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TimePickerSliders` itself.
      *
      * Fired when the value is changed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.TimePickerSliders` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Collapses all the slider controls.
      *
      * @returns Pointer to the control instance to allow method chaining
      */
    def collapseAll(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.TimePickerSliders`.
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
      * Gets current value of property {@link #getDisplayFormat displayFormat}.
      *
      * Defines the time `displayFormat` of the sliders. The `displayFormat` comes from the browser language
      * settings if not set explicitly.
      *
      * @returns Value of property `displayFormat`
      */
    def getDisplayFormat(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Sets the height of the container. If percentage value is used the parent container should have specified
      * height
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getLabelText labelText}.
      *
      * Defines the text of the picker label.
      *
      * It is read by screen readers. It is visible only on phone.
      *
      * @returns Value of property `labelText`
      */
    def getLabelText(): String = js.native
    
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
      * Gets current value of property {@link #getMinutesStep minutesStep}.
      *
      * Sets the minutes slider step. If step is less than 1, it will be automatically converted back to 1. The
      * minutes slider is populated only by multiples of the step.
      *
      * Default value is `1`.
      *
      * @returns Value of property `minutesStep`
      */
    def getMinutesStep(): int = js.native
    
    /**
      * Gets current value of property {@link #getSecondsStep secondsStep}.
      *
      * Sets the seconds slider step. If step is less than 1, it will be automatically converted back to 1. The
      * seconds slider is populated only by multiples of the step.
      *
      * Default value is `1`.
      *
      * @returns Value of property `secondsStep`
      */
    def getSecondsStep(): int = js.native
    
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
      * Gets the time values from the sliders, as a date object.
      *
      * @returns A JavaScript date object
      */
    def getTimeValues(): js.Date = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Defines the value of the control.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getValueFormat valueFormat}.
      *
      * Determines the format of the `value` property.
      *
      * @returns Value of property `valueFormat`
      */
    def getValueFormat(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Sets the width of the container. The minimum width is 320px.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Opens first slider.
      *
      * @returns Pointer to the control instance to allow method chaining
      */
    def openFirstSlider(): this.type = js.native
    
    /**
      * Sets the time `displayFormat`.
      *
      * @returns this instance, used for chaining
      */
    def setDisplayFormat(/**
      * New display format
      */
    sFormat: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Sets the height of the container. If percentage value is used the parent container should have specified
      * height
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLabelText labelText}.
      *
      * Defines the text of the picker label.
      *
      * It is read by screen readers. It is visible only on phone.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabelText(/**
      * New value for property `labelText`
      */
    sLabelText: String): this.type = js.native
    
    /**
      * Sets the `localeId` property.
      *
      * @returns this instance, used for chaining
      */
    def setLocaleId(/**
      * The ID of the Locale
      */
    sLocaleId: String): this.type = js.native
    
    /**
      * Sets the minutes slider step.
      *
      * @returns `this` to allow method chaining
      */
    def setMinutesStep(/**
      * The step used to generate values for the minutes slider
      */
    value: int): this.type = js.native
    
    /**
      * Sets the seconds slider step.
      *
      * @returns `this` to allow method chaining
      */
    def setSecondsStep(/**
      * The step used to generate values for the seconds slider
      */
    value: int): this.type = js.native
    
    /**
      * Sets `support2400`.
      *
      * @returns this instance, used for chaining
      */
    def setSupport2400(bSupport2400: Boolean): this.type = js.native
    
    /**
      * Sets the value of the `TimepickerSliders` container.
      *
      * @returns Pointer to the control instance to allow method chaining
      */
    def setValue(/**
      * The value of the `TimepickerSliders`
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueFormat valueFormat}.
      *
      * Determines the format of the `value` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueFormat(): this.type = js.native
    def setValueFormat(/**
      * New value for property `valueFormat`
      */
    sValueFormat: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Sets the width of the container. The minimum width is 320px.
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
  
  trait TimePickerSlidersSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the value is changed.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the time `displayFormat` of the sliders. The `displayFormat` comes from the browser language
      * settings if not set explicitly.
      */
    var displayFormat: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sets the height of the container. If percentage value is used the parent container should have specified
      * height
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the text of the picker label.
      *
      * It is read by screen readers. It is visible only on phone.
      */
    var labelText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
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
      * Sets the minutes slider step. If step is less than 1, it will be automatically converted back to 1. The
      * minutes slider is populated only by multiples of the step.
      */
    var minutesStep: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Sets the seconds slider step. If step is less than 1, it will be automatically converted back to 1. The
      * seconds slider is populated only by multiples of the step.
      */
    var secondsStep: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
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
      * Defines the value of the control.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the format of the `value` property.
      */
    var valueFormat: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sets the width of the container. The minimum width is 320px.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TimePickerSlidersSettings {
    
    inline def apply(): TimePickerSlidersSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerSlidersSettings]
    }
    
    extension [Self <: TimePickerSlidersSettings](x: Self) {
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setDisplayFormat(value: String | PropertyBindingInfo): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
      
      inline def setDisplayFormatUndefined: Self = StObject.set(x, "displayFormat", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLabelText(value: String | PropertyBindingInfo): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      inline def setLocaleId(value: String | PropertyBindingInfo): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
      
      inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
      
      inline def setMinutesStep(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minutesStep", value.asInstanceOf[js.Any])
      
      inline def setMinutesStepUndefined: Self = StObject.set(x, "minutesStep", js.undefined)
      
      inline def setSecondsStep(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "secondsStep", value.asInstanceOf[js.Any])
      
      inline def setSecondsStepUndefined: Self = StObject.set(x, "secondsStep", js.undefined)
      
      inline def setSupport2400(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "support2400", value.asInstanceOf[js.Any])
      
      inline def setSupport2400Undefined: Self = StObject.set(x, "support2400", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: String | PropertyBindingInfo): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
