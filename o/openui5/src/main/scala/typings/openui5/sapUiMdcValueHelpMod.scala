package typings.openui5

import typings.openui5.anon.InParameter
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiMdcElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValueHelpMod {
  
  @JSImport("sap/ui/mdc/ValueHelp", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ValueHelp`.
    *
    * The `ValueHelp` element can be assigned to {@link sap.ui.mdc.Field Field}, {@link sap.ui.mdc.MultiValueField MultiValueField }
    * and {@link sap.ui.mdc.FilterField FilterField} controls using `valueHelp` association. One `ValueHelp`
    * element instance can be assigned to multiple fields (like in different table rows). It should be placed
    * in the control tree on the container holding the fields.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ValueHelp {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: ValueHelpSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element
      */
    mSettings: ValueHelpSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: ValueHelpSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/ValueHelp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.ValueHelp with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.Element.extend}.
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
    oClassInfo: ClassInfo[T, ValueHelp]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ValueHelp],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.ValueHelp.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  trait ItemForValueConfiguration extends StObject {
    
    /**
      * `BindingContext` of the checked field. Inside a table the `ValueHelp` element might be connected to a
      * different row.
      */
    var bindingContext: js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.undefined
    
    /**
      * If set, the check is done case sensitive
      */
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, the value help checks only if there is an item with the given description. This is set to `false`
      * if only the key is used in the field.
      */
    var checkDescription: Boolean
    
    /**
      * If set, the value help checks only if there is an item with the given key. This is set to `false` if
      * the value cannot be a valid key because of type validation.
      */
    var checkKey: Boolean
    
    /**
      * Contextual information provided by condition payload or inParameters/outParameters. This is only filled
      * if the description needs to be determined for an existing condition.
      */
    var context: js.UndefOr[InParameter] = js.undefined
    
    /**
      * Instance of the calling control
      */
    var control: typings.openui5.sapUiCoreControlMod.default
    
    /**
      * Value parsed by type to fit the data type of the key
      */
    var parsedValue: js.UndefOr[Any] = js.undefined
    
    /**
      * Value as entered by user
      */
    var value: Any
  }
  object ItemForValueConfiguration {
    
    inline def apply(
      checkDescription: Boolean,
      checkKey: Boolean,
      control: typings.openui5.sapUiCoreControlMod.default,
      value: Any
    ): ItemForValueConfiguration = {
      val __obj = js.Dynamic.literal(checkDescription = checkDescription.asInstanceOf[js.Any], checkKey = checkKey.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemForValueConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemForValueConfiguration] (val x: Self) extends AnyVal {
      
      inline def setBindingContext(value: typings.openui5.sapUiModelContextMod.default): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
      
      inline def setBindingContextUndefined: Self = StObject.set(x, "bindingContext", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setCheckDescription(value: Boolean): Self = StObject.set(x, "checkDescription", value.asInstanceOf[js.Any])
      
      inline def setCheckKey(value: Boolean): Self = StObject.set(x, "checkKey", value.asInstanceOf[js.Any])
      
      inline def setContext(value: InParameter): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setControl(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setParsedValue(value: Any): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
      
      inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValueHelp
    extends typings.openui5.sapUiMdcElementMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired after the value help has been closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired after the value help has been closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachClosed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:disconnect disconnect} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired when the `ValueHelp` element is disconnected from a control.
      *
      * **Note:** This event must only be handled by the control the `ValueHelp` element belongs to, not by the
      * application.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDisconnect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachDisconnect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:disconnect disconnect} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired when the `ValueHelp` element is disconnected from a control.
      *
      * **Note:** This event must only be handled by the control the `ValueHelp` element belongs to, not by the
      * application.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDisconnect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachDisconnect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigated navigated} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired after the user navigated, using the arrow keys, in the value help.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpNavigatedEvent, Unit]
    ): this.type = js.native
    def attachNavigated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpNavigatedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:navigated navigated} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired after the user navigated, using the arrow keys, in the value help.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachNavigated(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpNavigatedEvent, Unit]
    ): this.type = js.native
    def attachNavigated(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpNavigatedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:open open} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired as the value help opening is triggered.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenEvent, Unit]
    ): this.type = js.native
    def attachOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:open open} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired as the value help opening is triggered.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenEvent, Unit]
    ): this.type = js.native
    def attachOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:opened opened} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired as the value help is fully open.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenedEvent, Unit]
    ): this.type = js.native
    def attachOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:opened opened} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired as the value help is fully open.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpened(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenedEvent, Unit]
    ): this.type = js.native
    def attachOpened(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired when a value is selected in the value help.
      *
      * **Note:** This event must only be handled by the control the `ValueHelp` element belongs to, not by the
      * application.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpSelectEvent, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired when a value is selected in the value help.
      *
      * **Note:** This event must only be handled by the control the `ValueHelp` element belongs to, not by the
      * application.
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
    fnFunction: js.Function1[/* p1 */ ValueHelpSelectEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ ValueHelpSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:switchToValueHelp switchToValueHelp} event of
      * this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired if the user wants to switch from typeahead to value help.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSwitchToValueHelp(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachSwitchToValueHelp(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:switchToValueHelp switchToValueHelp} event of
      * this `sap.ui.mdc.ValueHelp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.ValueHelp` itself.
      *
      * This event is fired if the user wants to switch from typeahead to value help.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSwitchToValueHelp(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachSwitchToValueHelp(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.ValueHelp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the dialog in the aggregation {@link #getDialog dialog}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDialog(): this.type = js.native
    
    /**
      * Destroys the typeahead in the aggregation {@link #getTypeahead typeahead}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTypeahead(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:closed closed} event of this `sap.ui.mdc.ValueHelp`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:disconnect disconnect} event of this `sap.ui.mdc.ValueHelp`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDisconnect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachDisconnect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:navigated navigated} event of this `sap.ui.mdc.ValueHelp`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachNavigated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpNavigatedEvent, Unit]
    ): this.type = js.native
    def detachNavigated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpNavigatedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:open open} event of this `sap.ui.mdc.ValueHelp`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenEvent, Unit]
    ): this.type = js.native
    def detachOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:opened opened} event of this `sap.ui.mdc.ValueHelp`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpened(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenedEvent, Unit]
    ): this.type = js.native
    def detachOpened(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpOpenedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.mdc.ValueHelp`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpSelectEvent, Unit]
    ): this.type = js.native
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ValueHelpSelectEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:switchToValueHelp switchToValueHelp} event
      * of this `sap.ui.mdc.ValueHelp`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSwitchToValueHelp(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachSwitchToValueHelp(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:closed closed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClosed(): this.type = js.native
    def fireClosed(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:disconnect disconnect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDisconnect(): this.type = js.native
    def fireDisconnect(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:navigated navigated} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireNavigated(): this.type = js.native
    def fireNavigated(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ValueHelp$NavigatedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:open open} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOpen(): this.type = js.native
    def fireOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: ValueHelp$OpenEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:opened opened} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOpened(): this.type = js.native
    def fireOpened(/**
      * Parameters to pass along with the event
      */
    mParameters: ValueHelp$OpenedEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: ValueHelp$SelectEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:switchToValueHelp switchToValueHelp} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSwitchToValueHelp(): this.type = js.native
    def fireSwitchToValueHelp(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getConditions conditions}.
      *
      * The conditions of the selected items.
      *
      * **Note:** This property must only be set by the control the `ValueHelp` element belongs to, not by the
      * application.
      *
      * **Note:** A condition must have the structure of {@link sap.ui.mdc.condition.ConditionObject ConditionObject}.
      *
      * Default value is `[]`.
      *
      * @returns Value of property `conditions`
      */
    def getConditions(): js.Array[js.Object] = js.native
    
    /**
      * Gets content of aggregation {@link #getDialog dialog}.
      *
      * Container that is used and opened if the value help icon of the input field is pressed.
      */
    def getDialog(): Any = js.native
    
    /**
      * Gets current value of property {@link #getFilterValue filterValue}.
      *
      * The value by which the help is filtered. Here the field provides the typed value to allow the value help
      * to filter for it.
      *
      * **Note:** This only takes effect if the `ValueHelp` elements content supports filtering.
      *
      * **Note:** This property must only be set by the control the `ValueHelp` element belongs to, not by the
      * application.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `filterValue`
      */
    def getFilterValue(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getTypeahead typeahead}.
      *
      * Container that is used and opened in typeahead
      */
    def getTypeahead(): Any = js.native
    
    /**
      * Gets current value of property {@link #getValidateInput validateInput}.
      *
      * If this property is set, the user input of the corresponding field is validated against the value help.
      * If no entry is found for the user input, an error is shown on the field.
      *
      * If this property is not set, the user input is still checked against the value help. But if no entry
      * is found, the user input is set to the field if the used data type allows this. (A type parsing error
      * is shown if the user input adheres to the requirements of the used data type.)
      *
      * Default value is `true`.
      *
      * @returns Value of property `validateInput`
      */
    def getValidateInput(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getConditions conditions}.
      *
      * The conditions of the selected items.
      *
      * **Note:** This property must only be set by the control the `ValueHelp` element belongs to, not by the
      * application.
      *
      * **Note:** A condition must have the structure of {@link sap.ui.mdc.condition.ConditionObject ConditionObject}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setConditions(): this.type = js.native
    def setConditions(/**
      * New value for property `conditions`
      */
    sConditions: js.Array[js.Object]): this.type = js.native
    
    /**
      * @experimental
      *
      * Sets a new value for property {@link #getDelegate delegate}.
      *
      * Path to the `Delegate` module that provides the required APIs to execute model-specific logic.
      *  **Note:** Ensure that the related file can be requested (any required library has to be loaded before
      * that).
      *  Do not bind or modify the module. This property can only be configured during control initialization.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDelegate(): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getDialog dialog}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDialog(/**
      * The dialog to set
      */
    oDialog: /* was: sap.ui.mdc.valuehelp.IDialogContainer */ Any): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFilterValue filterValue}.
      *
      * The value by which the help is filtered. Here the field provides the typed value to allow the value help
      * to filter for it.
      *
      * **Note:** This only takes effect if the `ValueHelp` elements content supports filtering.
      *
      * **Note:** This property must only be set by the control the `ValueHelp` element belongs to, not by the
      * application.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterValue(): this.type = js.native
    def setFilterValue(/**
      * New value for property `filterValue`
      */
    sFilterValue: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getTypeahead typeahead}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTypeahead(
      /**
      * The typeahead to set
      */
    oTypeahead: /* was: sap.ui.mdc.valuehelp.ITypeaheadContainer */ Any
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValidateInput validateInput}.
      *
      * If this property is set, the user input of the corresponding field is validated against the value help.
      * If no entry is found for the user input, an error is shown on the field.
      *
      * If this property is not set, the user input is still checked against the value help. But if no entry
      * is found, the user input is set to the field if the used data type allows this. (A type parsing error
      * is shown if the user input adheres to the requirements of the used data type.)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValidateInput(): this.type = js.native
    def setValidateInput(/**
      * New value for property `validateInput`
      */
    bValidateInput: Boolean): this.type = js.native
  }
  
  trait ValueHelp$ClosedEventParameters extends StObject
  
  trait ValueHelp$DisconnectEventParameters extends StObject
  
  trait ValueHelp$NavigatedEventParameters extends StObject {
    
    /**
      * Navigated condition.
      *
      * **Note:** A condition must have the structure of {@link sap.ui.mdc.condition.ConditionObject ConditionObject}.
      */
    var condition: js.UndefOr[js.Object] = js.undefined
    
    /**
      * ID of the navigated item. (This is needed to set the corresponding aria-attribute)
      */
    var itemId: js.UndefOr[String] = js.undefined
    
    /**
      * True if the focus should be set back to the field.
      */
    var leaveFocus: js.UndefOr[Boolean] = js.undefined
  }
  object ValueHelp$NavigatedEventParameters {
    
    inline def apply(): ValueHelp$NavigatedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueHelp$NavigatedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueHelp$NavigatedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setCondition(value: js.Object): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
      
      inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setLeaveFocus(value: Boolean): Self = StObject.set(x, "leaveFocus", value.asInstanceOf[js.Any])
      
      inline def setLeaveFocusUndefined: Self = StObject.set(x, "leaveFocus", js.undefined)
    }
  }
  
  trait ValueHelp$OpenEventParameters extends StObject {
    
    /**
      * The container which will be opened
      */
    var container: js.UndefOr[typings.openui5.sapUiMdcValuehelpBaseContainerMod.default] = js.undefined
  }
  object ValueHelp$OpenEventParameters {
    
    inline def apply(): ValueHelp$OpenEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueHelp$OpenEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueHelp$OpenEventParameters] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: typings.openui5.sapUiMdcValuehelpBaseContainerMod.default): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
  
  trait ValueHelp$OpenedEventParameters extends StObject {
    
    /**
      * The container which was opened
      */
    var container: js.UndefOr[typings.openui5.sapUiMdcValuehelpBaseContainerMod.default] = js.undefined
  }
  object ValueHelp$OpenedEventParameters {
    
    inline def apply(): ValueHelp$OpenedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueHelp$OpenedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueHelp$OpenedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: typings.openui5.sapUiMdcValuehelpBaseContainerMod.default): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
  
  trait ValueHelp$SelectEventParameters extends StObject {
    
    /**
      * If set, the selected `conditions` are added by the listening control, otherwise they replace the existing
      * ones
      */
    var add: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicator if the value help is closed while selection
      */
    var close: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The selected `conditions`
      *
      * **Note:** A condition has the structure of {@link sap.ui.mdc.condition.ConditionObject ConditionObject}.
      */
    var conditions: js.UndefOr[js.Array[js.Object]] = js.undefined
  }
  object ValueHelp$SelectEventParameters {
    
    inline def apply(): ValueHelp$SelectEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueHelp$SelectEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueHelp$SelectEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setConditions(value: js.Array[js.Object]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: js.Object*): Self = StObject.set(x, "conditions", js.Array(value*))
    }
  }
  
  trait ValueHelp$SwitchToValueHelpEventParameters extends StObject
  
  type ValueHelpClosedEvent = typings.openui5.sapUiBaseEventMod.default[ValueHelp$ClosedEventParameters]
  
  type ValueHelpClosedEventParameters = ValueHelp$ClosedEventParameters
  
  type ValueHelpDisconnectEvent = typings.openui5.sapUiBaseEventMod.default[ValueHelp$DisconnectEventParameters]
  
  type ValueHelpDisconnectEventParameters = ValueHelp$DisconnectEventParameters
  
  type ValueHelpNavigatedEvent = typings.openui5.sapUiBaseEventMod.default[ValueHelp$NavigatedEventParameters]
  
  type ValueHelpNavigatedEventParameters = ValueHelp$NavigatedEventParameters
  
  type ValueHelpOpenEvent = typings.openui5.sapUiBaseEventMod.default[ValueHelp$OpenEventParameters]
  
  type ValueHelpOpenEventParameters = ValueHelp$OpenEventParameters
  
  type ValueHelpOpenedEvent = typings.openui5.sapUiBaseEventMod.default[ValueHelp$OpenedEventParameters]
  
  type ValueHelpOpenedEventParameters = ValueHelp$OpenedEventParameters
  
  type ValueHelpSelectEvent = typings.openui5.sapUiBaseEventMod.default[ValueHelp$SelectEventParameters]
  
  type ValueHelpSelectEventParameters = ValueHelp$SelectEventParameters
  
  trait ValueHelpSettings
    extends StObject
       with ElementSettings {
    
    /**
      * This event is fired after the value help has been closed.
      */
    var closed: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * The conditions of the selected items.
      *
      * **Note:** This property must only be set by the control the `ValueHelp` element belongs to, not by the
      * application.
      *
      * **Note:** A condition must have the structure of {@link sap.ui.mdc.condition.ConditionObject ConditionObject}.
      */
    var conditions: js.UndefOr[
        js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Container that is used and opened if the value help icon of the input field is pressed.
      */
    var dialog: js.UndefOr[/* was: sap.ui.mdc.valuehelp.IDialogContainer */ Any] = js.undefined
    
    /**
      * This event is fired when the `ValueHelp` element is disconnected from a control.
      *
      * **Note:** This event must only be handled by the control the `ValueHelp` element belongs to, not by the
      * application.
      */
    var disconnect: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * The value by which the help is filtered. Here the field provides the typed value to allow the value help
      * to filter for it.
      *
      * **Note:** This only takes effect if the `ValueHelp` elements content supports filtering.
      *
      * **Note:** This property must only be set by the control the `ValueHelp` element belongs to, not by the
      * application.
      */
    var filterValue: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * This event is fired after the user navigated, using the arrow keys, in the value help.
      */
    var navigated: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ValueHelp$NavigatedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * This event is fired as the value help opening is triggered.
      */
    var open: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ValueHelp$OpenEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * This event is fired as the value help is fully open.
      */
    var opened: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ValueHelp$OpenedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * This event is fired when a value is selected in the value help.
      *
      * **Note:** This event must only be handled by the control the `ValueHelp` element belongs to, not by the
      * application.
      */
    var select: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ValueHelp$SelectEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * This event is fired if the user wants to switch from typeahead to value help.
      */
    var switchToValueHelp: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Container that is used and opened in typeahead
      */
    var typeahead: js.UndefOr[/* was: sap.ui.mdc.valuehelp.ITypeaheadContainer */ Any] = js.undefined
    
    /**
      * If this property is set, the user input of the corresponding field is validated against the value help.
      * If no entry is found for the user input, an error is shown on the field.
      *
      * If this property is not set, the user input is still checked against the value help. But if no entry
      * is found, the user input is set to the field if the used data type allows this. (A type parsing error
      * is shown if the user input adheres to the requirements of the used data type.)
      */
    var validateInput: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ValueHelpSettings {
    
    inline def apply(): ValueHelpSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueHelpSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueHelpSettings] (val x: Self) extends AnyVal {
      
      inline def setClosed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setConditions(
        value: js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: js.Object*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setDialog(value: /* was: sap.ui.mdc.valuehelp.IDialogContainer */ Any): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
      
      inline def setDisconnect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
      
      inline def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
      
      inline def setFilterValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
      
      inline def setNavigated(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ValueHelp$NavigatedEventParameters] => Unit
      ): Self = StObject.set(x, "navigated", js.Any.fromFunction1(value))
      
      inline def setNavigatedUndefined: Self = StObject.set(x, "navigated", js.undefined)
      
      inline def setOpen(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ValueHelp$OpenEventParameters] => Unit
      ): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOpened(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ValueHelp$OpenedEventParameters] => Unit
      ): Self = StObject.set(x, "opened", js.Any.fromFunction1(value))
      
      inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
      
      inline def setSelect(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ValueHelp$SelectEventParameters] => Unit
      ): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSwitchToValueHelp(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "switchToValueHelp", js.Any.fromFunction1(value))
      
      inline def setSwitchToValueHelpUndefined: Self = StObject.set(x, "switchToValueHelp", js.undefined)
      
      inline def setTypeahead(value: /* was: sap.ui.mdc.valuehelp.ITypeaheadContainer */ Any): Self = StObject.set(x, "typeahead", value.asInstanceOf[js.Any])
      
      inline def setTypeaheadUndefined: Self = StObject.set(x, "typeahead", js.undefined)
      
      inline def setValidateInput(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "validateInput", value.asInstanceOf[js.Any])
      
      inline def setValidateInputUndefined: Self = StObject.set(x, "validateInput", js.undefined)
    }
  }
  
  type ValueHelpSwitchToValueHelpEvent = typings.openui5.sapUiBaseEventMod.default[ValueHelp$SwitchToValueHelpEventParameters]
  
  type ValueHelpSwitchToValueHelpEventParameters = ValueHelp$SwitchToValueHelpEventParameters
}
