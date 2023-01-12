package typings.openui5

import typings.openui5.anon.PreviousValue
import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMInputBaseMod.InputBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDateTimeFieldMod {
  
  @JSImport("sap/m/DateTimeField", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.m.DateTimeField`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DateTimeField {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DateTimeFieldSettings) = this()
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
    mSettings: DateTimeFieldSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DateTimeFieldSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/DateTimeField", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.DateTimeField with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.InputBase.extend}.
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
    oClassInfo: ClassInfo[T, DateTimeField]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateTimeField],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.DateTimeField.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DateTimeField
    extends typings.openui5.sapMInputBaseMod.default {
    
    /**
      * @SINCE 1.104.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.DateTimeField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.DateTimeField` itself.
      *
      * Fired when the value of the `DateTimeField` is changed by user interaction - each keystroke, delete,
      * paste, etc.
      *
      * **Note:** Browsing autocomplete suggestions doesn't fire the event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.DateTimeField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.104.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.DateTimeField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.DateTimeField` itself.
      *
      * Fired when the value of the `DateTimeField` is changed by user interaction - each keystroke, delete,
      * paste, etc.
      *
      * **Note:** Browsing autocomplete suggestions doesn't fire the event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
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
    def attachLiveChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.DateTimeField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.104.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.DateTimeField`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLiveChange(
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
      * @SINCE 1.104.0
      *
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: PreviousValue): this.type = js.native
    
    /**
      * Gets the inner input DOM value.
      *
      * @returns The value of the input.
      */
    def getDOMValue(): Any = js.native
    
    /**
      * Gets current value of property {@link #getDateValue dateValue}.
      *
      * Holds a reference to a JavaScript Date Object. The `value` (string) property will be set according to
      * it. Alternatively, if the `value` and `valueFormat` pair properties are supplied instead, the `dateValue`
      * will be instantiated according to the parsed `value`. Use `dateValue` as a helper property to easily
      * obtain the day, month, year, hours, minutes and seconds of the chosen date and time. Although possible
      * to bind it, the recommendation is not to do it. When binding is needed, use `value` property instead.
      *
      * @returns Value of property `dateValue`
      */
    def getDateValue(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getDisplayFormat displayFormat}.
      *
      * Determines the format, displayed in the input field.
      *
      * @returns Value of property `displayFormat`
      */
    def getDisplayFormat(): String = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getInitialFocusedDateValue initialFocusedDateValue}.
      *
      * Holds a reference to a JavaScript Date Object to define the initially focused date/time when the picker
      * popup is opened.
      *
      * **Notes:**
      * 	 - Setting this property does not change the `value` property.
      * 	 - Depending on the context this property is used in ({@link sap.m.TimePicker}, {@link sap.m.DatePicker}
      * 			or {@link sap.m.DateTimePicker}), it takes into account only the time part, only the date part or both
      * 			parts of the JavaScript Date Object.
      *
      * @returns Value of property `initialFocusedDateValue`
      */
    def getInitialFocusedDateValue(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getValueFormat valueFormat}.
      *
      * Determines the format of the value property.
      *
      * @returns Value of property `valueFormat`
      */
    def getValueFormat(): String = js.native
    
    /**
      * Event handler for user input.
      */
    def oninput(/**
      * User input.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getDateValue dateValue}.
      *
      * Holds a reference to a JavaScript Date Object. The `value` (string) property will be set according to
      * it. Alternatively, if the `value` and `valueFormat` pair properties are supplied instead, the `dateValue`
      * will be instantiated according to the parsed `value`. Use `dateValue` as a helper property to easily
      * obtain the day, month, year, hours, minutes and seconds of the chosen date and time. Although possible
      * to bind it, the recommendation is not to do it. When binding is needed, use `value` property instead.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDateValue(): this.type = js.native
    def setDateValue(/**
      * New value for property `dateValue`
      */
    oDateValue: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayFormat displayFormat}.
      *
      * Determines the format, displayed in the input field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayFormat(): this.type = js.native
    def setDisplayFormat(/**
      * New value for property `displayFormat`
      */
    sDisplayFormat: String): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getInitialFocusedDateValue initialFocusedDateValue}.
      *
      * Holds a reference to a JavaScript Date Object to define the initially focused date/time when the picker
      * popup is opened.
      *
      * **Notes:**
      * 	 - Setting this property does not change the `value` property.
      * 	 - Depending on the context this property is used in ({@link sap.m.TimePicker}, {@link sap.m.DatePicker}
      * 			or {@link sap.m.DateTimePicker}), it takes into account only the time part, only the date part or both
      * 			parts of the JavaScript Date Object.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialFocusedDateValue(): this.type = js.native
    def setInitialFocusedDateValue(/**
      * New value for property `initialFocusedDateValue`
      */
    oInitialFocusedDateValue: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueFormat valueFormat}.
      *
      * Determines the format of the value property.
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
  }
  
  trait DateTimeFieldSettings
    extends StObject
       with InputBaseSettings {
    
    /**
      * Holds a reference to a JavaScript Date Object. The `value` (string) property will be set according to
      * it. Alternatively, if the `value` and `valueFormat` pair properties are supplied instead, the `dateValue`
      * will be instantiated according to the parsed `value`. Use `dateValue` as a helper property to easily
      * obtain the day, month, year, hours, minutes and seconds of the chosen date and time. Although possible
      * to bind it, the recommendation is not to do it. When binding is needed, use `value` property instead.
      */
    var dateValue: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the format, displayed in the input field.
      */
    var displayFormat: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Holds a reference to a JavaScript Date Object to define the initially focused date/time when the picker
      * popup is opened.
      *
      * **Notes:**
      * 	 - Setting this property does not change the `value` property.
      * 	 - Depending on the context this property is used in ({@link sap.m.TimePicker}, {@link sap.m.DatePicker}
      * 			or {@link sap.m.DateTimePicker}), it takes into account only the time part, only the date part or both
      * 			parts of the JavaScript Date Object.
      */
    var initialFocusedDateValue: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.104.0
      *
      * Fired when the value of the `DateTimeField` is changed by user interaction - each keystroke, delete,
      * paste, etc.
      *
      * **Note:** Browsing autocomplete suggestions doesn't fire the event.
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines the format of the value property.
      */
    var valueFormat: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object DateTimeFieldSettings {
    
    inline def apply(): DateTimeFieldSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeFieldSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateTimeFieldSettings] (val x: Self) extends AnyVal {
      
      inline def setDateValue(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "dateValue", value.asInstanceOf[js.Any])
      
      inline def setDateValueUndefined: Self = StObject.set(x, "dateValue", js.undefined)
      
      inline def setDisplayFormat(value: String | PropertyBindingInfo): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
      
      inline def setDisplayFormatUndefined: Self = StObject.set(x, "displayFormat", js.undefined)
      
      inline def setInitialFocusedDateValue(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "initialFocusedDateValue", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusedDateValueUndefined: Self = StObject.set(x, "initialFocusedDateValue", js.undefined)
      
      inline def setLiveChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setValueFormat(value: String | PropertyBindingInfo): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    }
  }
}
