package typings.openui5

import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMInputBaseMod.InputBaseSettings
import typings.openui5.sapMLibraryMod.InputTextFormatMode
import typings.openui5.sapMLibraryMod.InputType
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IAccessKeySupport
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.HTMLElement
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMInputMod {
  
  @JSImport("sap/m/Input", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Input`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/input-field/ Input}
    */
  open class default () extends Input {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: InputSettings) = this()
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
    mSettings: InputSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: InputSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IAccessKeySupport: Boolean = js.native
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Input with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Input]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Input],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Input.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Input
    extends typings.openui5.sapMInputBaseMod.default
       with IAccessKeySupport
       with /* was: sap.m.IToolbarInteractiveControl */ Object {
    
    var __implements__sap_m_IToolbarInteractiveControl: Boolean = js.native
    
    /**
      * @since 1.21.1
      *
      * Adds some suggestionColumn to the aggregation {@link #getSuggestionColumns suggestionColumns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSuggestionColumn(
      /**
      * The suggestionColumn to add; if empty, nothing is inserted
      */
    oSuggestionColumn: typings.openui5.sapMColumnMod.default
    ): this.type = js.native
    
    /**
      * Adds suggestion item.
      *
      * @returns this Input instance for chaining.
      */
    def addSuggestionItem(/**
      * Suggestion item.
      */
    oItem: typings.openui5.sapUiCoreItemMod.default): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Adds some suggestionRow to the aggregation {@link #getSuggestionRows suggestionRows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSuggestionRow(
      /**
      * The suggestionRow to add; if empty, nothing is inserted
      */
    vSuggestionRow: typings.openui5.sapMColumnListItemMod.default
    ): this.type = js.native
    def addSuggestionRow(
      /**
      * The suggestionRow to add; if empty, nothing is inserted
      */
    vSuggestionRow: typings.openui5.sapMGroupHeaderListItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.Input`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Input` itself.
      *
      * Fired when the value of the input is changed by user interaction - each keystroke, delete, paste, etc.
      *
      * **Note:** Browsing autocomplete suggestions does not fire the event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputLiveChangeEvent, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputLiveChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Input` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.Input`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Input` itself.
      *
      * Fired when the value of the input is changed by user interaction - each keystroke, delete, paste, etc.
      *
      * **Note:** Browsing autocomplete suggestions does not fire the event.
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
    fnFunction: js.Function1[/* p1 */ InputLiveChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ InputLiveChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Input` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.33.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:submit submit} event of this `sap.m.Input`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Input` itself.
      *
      * This event is fired when user presses the Enter key on the input.
      *
      * **Notes:**
      * 	 - The event is fired independent of whether there was a change before or not. If a change was performed,
      *     the event is fired after the change event.
      * 	 - The event is also fired when an item of the select list is selected via Enter.
      * 	 - The event is only fired on an input which allows text input (`editable`, `enabled` and not `valueHelpOnly`).
      *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSubmitEvent, Unit]
    ): this.type = js.native
    def attachSubmit(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSubmitEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Input` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.33.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:submit submit} event of this `sap.m.Input`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Input` itself.
      *
      * This event is fired when user presses the Enter key on the input.
      *
      * **Notes:**
      * 	 - The event is fired independent of whether there was a change before or not. If a change was performed,
      *     the event is fired after the change event.
      * 	 - The event is also fired when an item of the select list is selected via Enter.
      * 	 - The event is only fired on an input which allows text input (`editable`, `enabled` and not `valueHelpOnly`).
      *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSubmit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSubmitEvent, Unit]
    ): this.type = js.native
    def attachSubmit(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSubmitEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Input` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.16.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:suggest suggest} event of this `sap.m.Input`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Input` itself.
      *
      * This event is fired when user types in the input and showSuggestion is set to true. Changing the suggestItems
      * aggregation will show the suggestions within a popup.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSuggest(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestEvent, Unit]
    ): this.type = js.native
    def attachSuggest(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Input` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.16.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:suggest suggest} event of this `sap.m.Input`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Input` itself.
      *
      * This event is fired when user types in the input and showSuggestion is set to true. Changing the suggestItems
      * aggregation will show the suggestions within a popup.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSuggest(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestEvent, Unit]
    ): this.type = js.native
    def attachSuggest(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Input` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.16.3
      *
      * Attaches event handler `fnFunction` to the {@link #event:suggestionItemSelected suggestionItemSelected }
      * event of this `sap.m.Input`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Input` itself.
      *
      * This event is fired when suggestionItem shown in suggestion popup are selected. This event is only fired
      * when showSuggestion is set to true and there are suggestionItems shown in the suggestion popup.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSuggestionItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestionItemSelectedEvent, Unit]
    ): this.type = js.native
    def attachSuggestionItemSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestionItemSelectedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Input` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.16.3
      *
      * Attaches event handler `fnFunction` to the {@link #event:suggestionItemSelected suggestionItemSelected }
      * event of this `sap.m.Input`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Input` itself.
      *
      * This event is fired when suggestionItem shown in suggestion popup are selected. This event is only fired
      * when showSuggestion is set to true and there are suggestionItems shown in the suggestion popup.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSuggestionItemSelected(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestionItemSelectedEvent, Unit]
    ): this.type = js.native
    def attachSuggestionItemSelected(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestionItemSelectedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Input` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Attaches event handler `fnFunction` to the {@link #event:valueHelpRequest valueHelpRequest} event of
      * this `sap.m.Input`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Input` itself.
      *
      * When the value help indicator is clicked, this event will be fired.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValueHelpRequest(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputValueHelpRequestEvent, Unit]
    ): this.type = js.native
    def attachValueHelpRequest(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputValueHelpRequestEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Input` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.16
      *
      * Attaches event handler `fnFunction` to the {@link #event:valueHelpRequest valueHelpRequest} event of
      * this `sap.m.Input`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Input` itself.
      *
      * When the value help indicator is clicked, this event will be fired.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValueHelpRequest(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputValueHelpRequestEvent, Unit]
    ): this.type = js.native
    def attachValueHelpRequest(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputValueHelpRequestEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Input` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Binds aggregation {@link #getSuggestionColumns suggestionColumns} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindSuggestionColumns(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Binds aggregation {@link #getSuggestionRows suggestionRows} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindSuggestionRows(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Cancels any pending suggestions.
      */
    def cancelPendingSuggest(): Unit = js.native
    
    /**
      * @since 1.48
      *
      * Closes the suggestion list.
      */
    def closeSuggestions(): Unit = js.native
    
    /**
      * @since 1.21.1
      *
      * Destroys all the suggestionColumns in the aggregation {@link #getSuggestionColumns suggestionColumns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySuggestionColumns(): this.type = js.native
    
    /**
      * Destroys suggestion items.
      *
      * @returns this Input instance for chaining.
      */
    def destroySuggestionItems(): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Destroys all the suggestionRows in the aggregation {@link #getSuggestionRows suggestionRows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySuggestionRows(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.Input`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputLiveChangeEvent, Unit]
    ): this.type = js.native
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputLiveChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.33.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:submit submit} event of this `sap.m.Input`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSubmitEvent, Unit]
    ): this.type = js.native
    def detachSubmit(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSubmitEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.16.1
      *
      * Detaches event handler `fnFunction` from the {@link #event:suggest suggest} event of this `sap.m.Input`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSuggest(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestEvent, Unit]
    ): this.type = js.native
    def detachSuggest(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.16.3
      *
      * Detaches event handler `fnFunction` from the {@link #event:suggestionItemSelected suggestionItemSelected }
      * event of this `sap.m.Input`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSuggestionItemSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestionItemSelectedEvent, Unit]
    ): this.type = js.native
    def detachSuggestionItemSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputSuggestionItemSelectedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Detaches event handler `fnFunction` from the {@link #event:valueHelpRequest valueHelpRequest} event of
      * this `sap.m.Input`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachValueHelpRequest(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputValueHelpRequestEvent, Unit]
    ): this.type = js.native
    def detachValueHelpRequest(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ InputValueHelpRequestEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Input$LiveChangeEventParameters): this.type = js.native
    
    /**
      * @since 1.33.0
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:submit submit} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSubmit(): this.type = js.native
    def fireSubmit(/**
      * Parameters to pass along with the event
      */
    mParameters: Input$SubmitEventParameters): this.type = js.native
    
    /**
      * @since 1.16.1
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:suggest suggest} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSuggest(): this.type = js.native
    def fireSuggest(/**
      * Parameters to pass along with the event
      */
    mParameters: Input$SuggestEventParameters): this.type = js.native
    
    /**
      * @since 1.16.3
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:suggestionItemSelected suggestionItemSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSuggestionItemSelected(): this.type = js.native
    def fireSuggestionItemSelected(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Input$SuggestionItemSelectedEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.16
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:valueHelpRequest valueHelpRequest} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireValueHelpRequest(): this.type = js.native
    def fireValueHelpRequest(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Input$ValueHelpRequestEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.61
      *
      * Gets current value of property {@link #getAutocomplete autocomplete}.
      *
      * Specifies whether autocomplete is enabled. Works only if "showSuggestion" property is set to true. **Note:**
      * The autocomplete feature is disabled on Android devices due to a OS specific issue.
      *
      * Default value is `true`.
      *
      * @returns Value of property `autocomplete`
      */
    def getAutocomplete(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the inner input DOM value.
      *
      * @returns The value of the input.
      */
    def getDOMValue(): Any = js.native
    
    /**
      * @deprecated (since 1.9.1) - `sap.m.DatePicker`, `sap.m.TimePicker` or `sap.m.DateTimePicker` should be
      * used for date/time inputs and formating.
      *
      * Gets current value of property {@link #getDateFormat dateFormat}.
      *
      * Only used if type=date and no datepicker is available. The data is displayed and the user input is parsed
      * according to this format. **Note:** The value property is always of the form RFC 3339 (YYYY-MM-dd).
      *
      * Default value is `'YYYY-MM-dd'`.
      *
      * @returns Value of property `dateFormat`
      */
    def getDateFormat(): String = js.native
    
    /**
      * Gets current value of property {@link #getDescription description}.
      *
      * The description is a text after the input field, e.g. units of measurement, currencies.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * @since 1.46
      *
      * Gets current value of property {@link #getEnableSuggestionsHighlighting enableSuggestionsHighlighting}.
      *
      * Specifies whether the suggestions highlighting is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableSuggestionsHighlighting`
      */
    def getEnableSuggestionsHighlighting(): Boolean = js.native
    
    /**
      * @since 1.89
      *
      * Gets current value of property {@link #getEnableTableAutoPopinMode enableTableAutoPopinMode}.
      *
      * Enables the `autoPopinMode` of `sap.m.Table`, when the input has tabular suggestions. **Note:** The `autoPopinMode`
      * overwrites the `demandPopin` and the `minScreenWidth` properties of the `sap.m.Column`. When setting,
      * `enableTableAutoPopinMode`, from true to false, the application must reconfigure the `demandPopin` and
      * `minScreenWidth` properties of the `sap.m.Column` control by itself.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableTableAutoPopinMode`
      */
    def getEnableTableAutoPopinMode(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFieldWidth fieldWidth}.
      *
      * This property only takes effect if the description property is set. It controls the distribution of space
      * between the input field and the description text. The default value is 50% leaving the other 50% for
      * the description.
      *
      * Default value is `'50%'`.
      *
      * @returns Value of property `fieldWidth`
      */
    def getFieldWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getFilterSuggests filterSuggests}.
      *
      * Defines whether to filter the provided suggestions before showing them to the user.
      *
      * Default value is `true`.
      *
      * @returns Value of property `filterSuggests`
      */
    def getFilterSuggests(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMaxLength maxLength}.
      *
      * Maximum number of characters. Value '0' means the feature is switched off. This parameter is not compatible
      * with the input type `sap.m.InputType.Number`. If the input type is set to `Number`, the `maxLength` value
      * is ignored. If the `maxLength` is set after there is already a longer value, this value will not get
      * truncated. The `maxLength` property has effect only when the value is modified by user interaction.
      *
      * Default value is `0`.
      *
      * @returns Value of property `maxLength`
      */
    def getMaxLength(): int = js.native
    
    /**
      * @since 1.21.1
      *
      * Gets current value of property {@link #getMaxSuggestionWidth maxSuggestionWidth}.
      *
      * If set, the value of this parameter will control the horizontal size of the suggestion list to display
      * more data. This allows suggestion lists to be wider than the input field if there is enough space available.
      * By default, the suggestion list is always as wide as the input field. **Note:** The value will be ignored
      * if the actual width of the input field is larger than the specified parameter value.
      *
      * @returns Value of property `maxSuggestionWidth`
      */
    def getMaxSuggestionWidth(): CSSSize = js.native
    
    /**
      * @since 1.44
      *
      * ID of the element which is the current target of the association {@link #getSelectedItem selectedItem},
      * or `null`.
      */
    def getSelectedItem(): ID = js.native
    
    /**
      * @since 1.44
      *
      * Gets current value of property {@link #getSelectedKey selectedKey}.
      *
      * Defines the key of the selected item.
      *
      * **Note:** If duplicate keys exist, the first item matching the key is used.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `selectedKey`
      */
    def getSelectedKey(): String = js.native
    
    /**
      * @since 1.44
      *
      * ID of the element which is the current target of the association {@link #getSelectedRow selectedRow},
      * or `null`.
      */
    def getSelectedRow(): ID = js.native
    
    /**
      * @since 1.94
      *
      * Gets current value of property {@link #getShowClearIcon showClearIcon}.
      *
      * Specifies whether clear icon is shown. Pressing the icon will clear input's value and fire the liveChange
      * event.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showClearIcon`
      */
    def getShowClearIcon(): Boolean = js.native
    
    /**
      * @since 1.16.1
      *
      * Gets current value of property {@link #getShowSuggestion showSuggestion}.
      *
      * If this is set to true, suggest event is fired when user types in the input. Changing the suggestItems
      * aggregation in suggest event listener will show suggestions within a popup. When runs on phone, input
      * will first open a dialog where the input and suggestions are shown. When runs on a tablet, the suggestions
      * are shown in a popup next to the input.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showSuggestion`
      */
    def getShowSuggestion(): Boolean = js.native
    
    /**
      * @since 1.22.1
      *
      * Gets current value of property {@link #getShowTableSuggestionValueHelp showTableSuggestionValueHelp}.
      *
      * For tabular suggestions, this flag will show/hide the button at the end of the suggestion table that
      * triggers the event "valueHelpRequest" when pressed. The default value is true.
      *
      * **Note:** If suggestions are not tabular or no suggestions are used, the button will not be displayed
      * and this flag is without effect.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showTableSuggestionValueHelp`
      */
    def getShowTableSuggestionValueHelp(): Boolean = js.native
    
    /**
      * @since 1.16
      *
      * Gets current value of property {@link #getShowValueHelp showValueHelp}.
      *
      * If set to true, a value help indicator will be displayed inside the control. When clicked the event "valueHelpRequest"
      * will be fired.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showValueHelp`
      */
    def getShowValueHelp(): Boolean = js.native
    
    /**
      * @since 1.21.2
      *
      * Gets current value of property {@link #getStartSuggestion startSuggestion}.
      *
      * Minimum length of the entered text in input before suggest event is fired. The default value is 1 which
      * means the suggest event is fired after user types in input.
      *
      * **Note:** When it's set to 0, suggest event is fired when input with no text gets focus. In this case
      * no suggestion popup will open.
      *
      * Default value is `1`.
      *
      * @returns Value of property `startSuggestion`
      */
    def getStartSuggestion(): int = js.native
    
    /**
      * @since 1.21.1
      *
      * Gets content of aggregation {@link #getSuggestionColumns suggestionColumns}.
      *
      * The suggestionColumns and suggestionRows are for tabular input suggestions. This aggregation allows for
      * binding the table columns; for more details see the aggregation "suggestionRows".
      */
    def getSuggestionColumns(): js.Array[typings.openui5.sapMColumnMod.default] = js.native
    
    /**
      * @since 1.44
      *
      * Gets the item with the given key from the aggregation `suggestionItems`. **Note:** If duplicate keys
      * exist, the first item matching the key is returned.
      *
      * @returns Suggestion item.
      */
    def getSuggestionItemByKey(/**
      * An item key that specifies the item to retrieve.
      */
    sKey: String): typings.openui5.sapUiCoreItemMod.default = js.native
    
    /**
      * @since 1.16.1
      *
      * Gets content of aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * Defines the items displayed in the suggestion popup. Changing this aggregation (by calling `addSuggestionItem`,
      * `insertSuggestionItem`, `removeSuggestionItem`, `removeAllSuggestionItems`, or `destroySuggestionItems`)
      * after `Input` is rendered opens/closes the suggestion popup.
      *
      * To display suggestions with two text values, add `sap.ui.core.ListItem` as `SuggestionItems` (since 1.21.1).
      * For the selected `ListItem`, only the first value is returned to the input field.
      *
      * **Note:** Only `text` and `additionalText` property values of the item are displayed. For example, if
      * an `icon` is set, it is ignored. To display more information per item (including icons), you can use
      * the `suggestionRows` aggregation.
      *
      * **Note:** Disabled items are not visualized in the list with the suggestions, however they can still
      * be accessed through the aggregation. **Note:** If `suggestionItems` & `suggestionRows` are set in parallel,
      * the last aggeragtion to come would overwrite the previous ones.
      */
    def getSuggestionItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * @since 1.44
      *
      * Gets current value of property {@link #getSuggestionRowValidator suggestionRowValidator}.
      *
      * Defines the validation callback function called when a suggestion row gets selected.
      *
      * @returns Value of property `suggestionRowValidator`
      */
    def getSuggestionRowValidator(): js.Function = js.native
    
    /**
      * @since 1.21.1
      *
      * Gets content of aggregation {@link #getSuggestionRows suggestionRows}.
      *
      * The suggestionColumns and suggestionRows are for tabular input suggestions. This aggregation allows for
      * binding the table cells. The items of this aggregation are to be bound directly or to set in the suggest
      * event method. **Note:** If `suggestionItems` & `suggestionRows` are set in parallel, the last aggeragtion
      * to come would overwrite the previous ones.
      */
    def getSuggestionRows(): js.Array[
        typings.openui5.sapMColumnListItemMod.default | typings.openui5.sapMGroupHeaderListItemMod.default
      ] = js.native
    
    /**
      * @since 1.44
      *
      * Gets current value of property {@link #getTextFormatMode textFormatMode}.
      *
      * Defines the display text format mode.
      *
      * Default value is `Value`.
      *
      * @returns Value of property `textFormatMode`
      */
    def getTextFormatMode(): InputTextFormatMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputTextFormatMode * / any */ String) = js.native
    
    /**
      * @since 1.44
      *
      * Gets current value of property {@link #getTextFormatter textFormatter}.
      *
      * Defines the display text formatter function.
      *
      * @returns Value of property `textFormatter`
      */
    def getTextFormatter(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * HTML type of the internal `input` tag (e.g. Text, Number, Email, Phone). The particular effect of this
      * property differs depending on the browser and the current language settings, especially for the type
      * Number.
      *  This parameter is intended to be used with touch devices that use different soft keyboard layouts depending
      * on the given input type.
      *  Only the default value `sap.m.InputType.Text` may be used in combination with data model formats. `sap.ui.model`
      * defines extended formats that are mostly incompatible with normal HTML representations for numbers and
      * dates.
      *
      * Default value is `Text`.
      *
      * @returns Value of property `type`
      */
    def getType(): InputType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputType * / any */ String) = js.native
    
    /**
      * @since 1.84.0
      *
      * Gets current value of property {@link #getValueHelpIconSrc valueHelpIconSrc}.
      *
      * Set custom value help icon.
      *
      * Default value is `"sap-icon://value-help"`.
      *
      * @returns Value of property `valueHelpIconSrc`
      */
    def getValueHelpIconSrc(): URI = js.native
    
    /**
      * @since 1.21.0
      *
      * Gets current value of property {@link #getValueHelpOnly valueHelpOnly}.
      *
      * If set to true, direct text input is disabled and the control will trigger the event "valueHelpRequest"
      * for all user interactions. The properties "showValueHelp", "editable", and "enabled" must be set to true,
      * otherwise the property will have no effect. In this scenario, the `showItems` API will not work.
      *
      * Default value is `false`.
      *
      * @returns Value of property `valueHelpOnly`
      */
    def getValueHelpOnly(): Boolean = js.native
    
    /**
      * @since 1.24
      *
      * Gets current value of property {@link #getValueLiveUpdate valueLiveUpdate}.
      *
      * Indicates when the value gets updated with the user changes: At each keystroke (true) or first when the
      * user presses enter or tabs out (false).
      *
      * **Note:** When set to true and the value of the Input control is bound to a model, the change event becomes
      * obsolete and will not be fired, as the value in the model will be updated each time the user provides
      * input. In such cases, subscription to the liveChange event is more appropriate, as it corresponds to
      * the way the underlying model gets updated.
      *
      * Default value is `false`.
      *
      * @returns Value of property `valueLiveUpdate`
      */
    def getValueLiveUpdate(): Boolean = js.native
    
    /**
      * @since 1.21.1
      *
      * Checks for the provided `sap.m.Column` in the aggregation {@link #getSuggestionColumns suggestionColumns}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSuggestionColumn(
      /**
      * The suggestionColumn whose index is looked for
      */
    oSuggestionColumn: typings.openui5.sapMColumnMod.default
    ): int = js.native
    
    /**
      * @since 1.16.1
      *
      * Checks for the provided `sap.ui.core.Item` in the aggregation {@link #getSuggestionItems suggestionItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSuggestionItem(
      /**
      * The suggestionItem whose index is looked for
      */
    oSuggestionItem: typings.openui5.sapUiCoreItemMod.default
    ): int = js.native
    
    /**
      * @since 1.21.1
      *
      * Checks for the provided `sap.m.ColumnListItem` in the aggregation {@link #getSuggestionRows suggestionRows}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSuggestionRow(
      /**
      * The suggestionRow whose index is looked for
      */
    vSuggestionRow: typings.openui5.sapMColumnListItemMod.default
    ): int = js.native
    def indexOfSuggestionRow(
      /**
      * The suggestionRow whose index is looked for
      */
    vSuggestionRow: typings.openui5.sapMGroupHeaderListItemMod.default
    ): int = js.native
    
    /**
      * @since 1.21.1
      *
      * Inserts a suggestionColumn into the aggregation {@link #getSuggestionColumns suggestionColumns}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSuggestionColumn(
      /**
      * The suggestionColumn to insert; if empty, nothing is inserted
      */
    oSuggestionColumn: typings.openui5.sapMColumnMod.default,
      /**
      * The `0`-based index the suggestionColumn should be inserted at; for a negative value of `iIndex`, the
      * suggestionColumn is inserted at position 0; for a value greater than the current size of the aggregation,
      * the suggestionColumn is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts suggestion item.
      *
      * @returns this Input instance for chaining.
      */
    def insertSuggestionItem(
      /**
      * Suggestion item.
      */
    oItem: typings.openui5.sapUiCoreItemMod.default,
      /**
      * Index to be inserted.
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Inserts a suggestionRow into the aggregation {@link #getSuggestionRows suggestionRows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSuggestionRow(
      /**
      * The suggestionRow to insert; if empty, nothing is inserted
      */
    vSuggestionRow: typings.openui5.sapMColumnListItemMod.default,
      /**
      * The `0`-based index the suggestionRow should be inserted at; for a negative value of `iIndex`, the suggestionRow
      * is inserted at position 0; for a value greater than the current size of the aggregation, the suggestionRow
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    def insertSuggestionRow(
      /**
      * The suggestionRow to insert; if empty, nothing is inserted
      */
    vSuggestionRow: typings.openui5.sapMGroupHeaderListItemMod.default,
      /**
      * The `0`-based index the suggestionRow should be inserted at; for a negative value of `iIndex`, the suggestionRow
      * is inserted at position 0; for a value greater than the current size of the aggregation, the suggestionRow
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Indicates whether the control should use `sap.m.Dialog` or not.
      *
      * @returns Boolean.
      */
    def isMobileDevice(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the supported openers for the valueHelpOnly. In the context of the Input, all targets are valid.
      *
      * @returns Boolean indicating if the target is a valid opener.
      */
    def isValueHelpOnlyOpener(): Boolean = js.native
    def isValueHelpOnlyOpener(/**
      * The target of the event.
      */
    oTarget: HTMLElement): Boolean = js.native
    
    /**
      * Overwrites the onBeforeRendering.
      */
    def onBeforeRendering(): Unit = js.native
    
    /**
      * @since 1.73
      *
      * Event handler for browsers' `change` event.
      */
    def onchange(/**
      * The event.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Event handler for the onFocusIn event.
      */
    def onfocusin(/**
      * On focus in event.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Event handler for user input.
      */
    def oninput(/**
      * User input.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Keyboard handler for the onMouseDown event.
      */
    def onmousedown(/**
      * Keyboard event.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Keyboard handler for enter key.
      */
    def onsapenter(/**
      * Keyboard event.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Keyboard handler for escape key.
      */
    def onsapescape(/**
      * Keyboard event.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Keyboard handler for the onFocusLeave event.
      */
    def onsapfocusleave(/**
      * Keyboard event.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Finalizes autocomplete and fires liveChange event eventually.
      */
    def onsapright(): Unit = js.native
    
    /**
      * Fire valueHelpRequest event on tap.
      */
    def ontap(/**
      * Ontap event.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * @since 1.21.1
      *
      * Removes all the controls from the aggregation {@link #getSuggestionColumns suggestionColumns}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSuggestionColumns(): js.Array[typings.openui5.sapMColumnMod.default] = js.native
    
    /**
      * Removes all suggestion items.
      *
      * @returns Determines whether the suggestion items are removed.
      */
    def removeAllSuggestionItems(): Boolean = js.native
    
    /**
      * @since 1.21.1
      *
      * Removes all the controls from the aggregation {@link #getSuggestionRows suggestionRows}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSuggestionRows(): js.Array[
        typings.openui5.sapMColumnListItemMod.default | typings.openui5.sapMGroupHeaderListItemMod.default
      ] = js.native
    
    def removeSuggestionColumn(/**
      * The suggestionColumn to remove or its index or id
      */
    vSuggestionColumn: String): typings.openui5.sapMColumnMod.default | Null = js.native
    /**
      * @since 1.21.1
      *
      * Removes a suggestionColumn from the aggregation {@link #getSuggestionColumns suggestionColumns}.
      *
      * @returns The removed suggestionColumn or `null`
      */
    def removeSuggestionColumn(/**
      * The suggestionColumn to remove or its index or id
      */
    vSuggestionColumn: int): typings.openui5.sapMColumnMod.default | Null = js.native
    def removeSuggestionColumn(
      /**
      * The suggestionColumn to remove or its index or id
      */
    vSuggestionColumn: typings.openui5.sapMColumnMod.default
    ): typings.openui5.sapMColumnMod.default | Null = js.native
    
    /**
      * Removes suggestion item.
      *
      * @returns Determines whether the suggestion item has been removed.
      */
    def removeSuggestionItem(/**
      * Suggestion item.
      */
    oItem: typings.openui5.sapUiCoreItemMod.default): Boolean = js.native
    
    def removeSuggestionRow(/**
      * The suggestionRow to remove or its index or id
      */
    vSuggestionRow: String): typings.openui5.sapMColumnListItemMod.default | typings.openui5.sapMGroupHeaderListItemMod.default | Null = js.native
    /**
      * @since 1.21.1
      *
      * Removes a suggestionRow from the aggregation {@link #getSuggestionRows suggestionRows}.
      *
      * @returns The removed suggestionRow or `null`
      */
    def removeSuggestionRow(/**
      * The suggestionRow to remove or its index or id
      */
    vSuggestionRow: int): typings.openui5.sapMColumnListItemMod.default | typings.openui5.sapMGroupHeaderListItemMod.default | Null = js.native
    def removeSuggestionRow(
      /**
      * The suggestionRow to remove or its index or id
      */
    vSuggestionRow: typings.openui5.sapMColumnListItemMod.default
    ): typings.openui5.sapMColumnListItemMod.default | typings.openui5.sapMGroupHeaderListItemMod.default | Null = js.native
    def removeSuggestionRow(
      /**
      * The suggestionRow to remove or its index or id
      */
    vSuggestionRow: typings.openui5.sapMGroupHeaderListItemMod.default
    ): typings.openui5.sapMColumnListItemMod.default | typings.openui5.sapMGroupHeaderListItemMod.default | Null = js.native
    
    /**
      * @since 1.61
      *
      * Sets a new value for property {@link #getAutocomplete autocomplete}.
      *
      * Specifies whether autocomplete is enabled. Works only if "showSuggestion" property is set to true. **Note:**
      * The autocomplete feature is disabled on Android devices due to a OS specific issue.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutocomplete(): this.type = js.native
    def setAutocomplete(/**
      * New value for property `autocomplete`
      */
    bAutocomplete: Boolean): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the inner input DOM value.
      */
    def setDOMValue(/**
      * Dom value which will be set.
      */
    value: String): Unit = js.native
    
    /**
      * @deprecated (since 1.9.1) - `sap.m.DatePicker`, `sap.m.TimePicker` or `sap.m.DateTimePicker` should be
      * used for date/time inputs and formating.
      *
      * Sets a new value for property {@link #getDateFormat dateFormat}.
      *
      * Only used if type=date and no datepicker is available. The data is displayed and the user input is parsed
      * according to this format. **Note:** The value property is always of the form RFC 3339 (YYYY-MM-dd).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'YYYY-MM-dd'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDateFormat(): this.type = js.native
    def setDateFormat(/**
      * New value for property `dateFormat`
      */
    sDateFormat: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDescription description}.
      *
      * The description is a text after the input field, e.g. units of measurement, currencies.
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
      * @since 1.46
      *
      * Sets a new value for property {@link #getEnableSuggestionsHighlighting enableSuggestionsHighlighting}.
      *
      * Specifies whether the suggestions highlighting is enabled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableSuggestionsHighlighting(): this.type = js.native
    def setEnableSuggestionsHighlighting(
      /**
      * New value for property `enableSuggestionsHighlighting`
      */
    bEnableSuggestionsHighlighting: Boolean
    ): this.type = js.native
    
    /**
      * @since 1.89
      *
      * Sets a new value for property {@link #getEnableTableAutoPopinMode enableTableAutoPopinMode}.
      *
      * Enables the `autoPopinMode` of `sap.m.Table`, when the input has tabular suggestions. **Note:** The `autoPopinMode`
      * overwrites the `demandPopin` and the `minScreenWidth` properties of the `sap.m.Column`. When setting,
      * `enableTableAutoPopinMode`, from true to false, the application must reconfigure the `demandPopin` and
      * `minScreenWidth` properties of the `sap.m.Column` control by itself.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableTableAutoPopinMode(): this.type = js.native
    def setEnableTableAutoPopinMode(/**
      * New value for property `enableTableAutoPopinMode`
      */
    bEnableTableAutoPopinMode: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFieldWidth fieldWidth}.
      *
      * This property only takes effect if the description property is set. It controls the distribution of space
      * between the input field and the description text. The default value is 50% leaving the other 50% for
      * the description.
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
      * @since 1.16.1
      *
      * Sets a custom filter function for suggestions. The default is to check whether the first item text begins
      * with the typed value. For one and two-value suggestions this callback function will operate on sap.ui.core.Item
      * types, for tabular suggestions the function will operate on sap.m.ColumnListItem types.
      *
      * @returns this pointer for chaining
      */
    def setFilterFunction(
      /**
      * The filter function is called when displaying suggestion items and has two input parameters: the first
      * one is the string that is currently typed in the input field and the second one is the item that is being
      * filtered. Returning true will add this item to the popup, returning false will not display it.
      */
    fnFilter: js.Function3[
          /* p1 */ String, 
          /* p2 */ typings.openui5.sapUiCoreItemMod.default, 
          /* p3 */ Boolean, 
          js.UndefOr[Boolean | js.Function]
        ]
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFilterSuggests filterSuggests}.
      *
      * Defines whether to filter the provided suggestions before showing them to the user.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterSuggests(): this.type = js.native
    def setFilterSuggests(/**
      * New value for property `filterSuggests`
      */
    bFilterSuggests: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxLength maxLength}.
      *
      * Maximum number of characters. Value '0' means the feature is switched off. This parameter is not compatible
      * with the input type `sap.m.InputType.Number`. If the input type is set to `Number`, the `maxLength` value
      * is ignored. If the `maxLength` is set after there is already a longer value, this value will not get
      * truncated. The `maxLength` property has effect only when the value is modified by user interaction.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxLength(): this.type = js.native
    def setMaxLength(/**
      * New value for property `maxLength`
      */
    iMaxLength: int): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Sets a new value for property {@link #getMaxSuggestionWidth maxSuggestionWidth}.
      *
      * If set, the value of this parameter will control the horizontal size of the suggestion list to display
      * more data. This allows suggestion lists to be wider than the input field if there is enough space available.
      * By default, the suggestion list is always as wide as the input field. **Note:** The value will be ignored
      * if the actual width of the input field is larger than the specified parameter value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxSuggestionWidth(): this.type = js.native
    def setMaxSuggestionWidth(/**
      * New value for property `maxSuggestionWidth`
      */
    sMaxSuggestionWidth: CSSSize): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Sets a custom result filter function for tabular suggestions to select the text that is passed to the
      * input field. Default is to check whether the first cell with a "text" property begins with the typed
      * value. For one value and two-value suggestions this callback function is not called.
      *
      * @returns this pointer for chaining
      */
    def setRowResultFunction(
      /**
      * The result function is called with one parameter: the sap.m.ColumnListItem that is selected. The function
      * must return a result string that will be displayed as the input field's value.
      */
    fnFilter: js.Function3[
          /* p1 */ String, 
          /* p2 */ typings.openui5.sapUiCoreItemMod.default, 
          /* p3 */ Boolean, 
          js.UndefOr[Boolean | js.Function]
        ]
    ): this.type = js.native
    
    /**
      * @since 1.44
      *
      * Sets the `selectedItem` association.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedItem(): this.type = js.native
    def setSelectedItem(
      /**
      * New value for the `selectedItem` association. If an ID of a `sap.ui.core.Item` is given, the item with
      * this ID becomes the `selectedItem` association. Alternatively, a `sap.ui.core.Item` instance may be given
      * or `null` to clear the selection.
      */
    oItem: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * @since 1.44
      *
      * Sets the `selectedKey` property.
      *
      * Default value is an empty string `""` or `undefined`.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedKey(
      /**
      * New value for property `selectedKey`. If the provided `sKey` is an empty string `""` or `undefined`,
      * the selection is cleared. If duplicate keys exist, the first item matching the key is selected.
      */
    sKey: String
    ): this.type = js.native
    
    /**
      * @since 1.44
      *
      * Sets the `selectedRow` association. Default value is `null`.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedRow(
      /**
      * New value for the `selectedRow` association. If an ID of a `sap.m.ColumnListItem` is given, the item
      * with this ID becomes the `selectedRow` association. Alternatively, a `sap.m.ColumnListItem` instance
      * may be given or `null` to clear the selection.
      */
    oListItem: typings.openui5.sapMColumnListItemMod.default
    ): this.type = js.native
    
    /**
      * @since 1.94
      *
      * Sets a new value for property {@link #getShowClearIcon showClearIcon}.
      *
      * Specifies whether clear icon is shown. Pressing the icon will clear input's value and fire the liveChange
      * event.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowClearIcon(): this.type = js.native
    def setShowClearIcon(/**
      * New value for property `showClearIcon`
      */
    bShowClearIcon: Boolean): this.type = js.native
    
    /**
      * @since 1.16.1
      *
      * Sets a new value for property {@link #getShowSuggestion showSuggestion}.
      *
      * If this is set to true, suggest event is fired when user types in the input. Changing the suggestItems
      * aggregation in suggest event listener will show suggestions within a popup. When runs on phone, input
      * will first open a dialog where the input and suggestions are shown. When runs on a tablet, the suggestions
      * are shown in a popup next to the input.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSuggestion(): this.type = js.native
    def setShowSuggestion(/**
      * New value for property `showSuggestion`
      */
    bShowSuggestion: Boolean): this.type = js.native
    
    /**
      * @since 1.22.1
      *
      * Sets a new value for property {@link #getShowTableSuggestionValueHelp showTableSuggestionValueHelp}.
      *
      * For tabular suggestions, this flag will show/hide the button at the end of the suggestion table that
      * triggers the event "valueHelpRequest" when pressed. The default value is true.
      *
      * **Note:** If suggestions are not tabular or no suggestions are used, the button will not be displayed
      * and this flag is without effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTableSuggestionValueHelp(): this.type = js.native
    def setShowTableSuggestionValueHelp(
      /**
      * New value for property `showTableSuggestionValueHelp`
      */
    bShowTableSuggestionValueHelp: Boolean
    ): this.type = js.native
    
    /**
      * @since 1.16
      *
      * Sets a new value for property {@link #getShowValueHelp showValueHelp}.
      *
      * If set to true, a value help indicator will be displayed inside the control. When clicked the event "valueHelpRequest"
      * will be fired.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowValueHelp(): this.type = js.native
    def setShowValueHelp(/**
      * New value for property `showValueHelp`
      */
    bShowValueHelp: Boolean): this.type = js.native
    
    /**
      * @since 1.21.2
      *
      * Sets a new value for property {@link #getStartSuggestion startSuggestion}.
      *
      * Minimum length of the entered text in input before suggest event is fired. The default value is 1 which
      * means the suggest event is fired after user types in input.
      *
      * **Note:** When it's set to 0, suggest event is fired when input with no text gets focus. In this case
      * no suggestion popup will open.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStartSuggestion(): this.type = js.native
    def setStartSuggestion(/**
      * New value for property `startSuggestion`
      */
    iStartSuggestion: int): this.type = js.native
    
    /**
      * @since 1.44
      *
      * Sets a new value for property {@link #getSuggestionRowValidator suggestionRowValidator}.
      *
      * Defines the validation callback function called when a suggestion row gets selected.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSuggestionRowValidator(): this.type = js.native
    def setSuggestionRowValidator(/**
      * New value for property `suggestionRowValidator`
      */
    fnSuggestionRowValidator: js.Function): this.type = js.native
    
    /**
      * @since 1.44
      *
      * Sets a new value for property {@link #getTextFormatMode textFormatMode}.
      *
      * Defines the display text format mode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Value`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextFormatMode(): this.type = js.native
    def setTextFormatMode(
      /**
      * New value for property `textFormatMode`
      */
    sTextFormatMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputTextFormatMode * / any */ String
    ): this.type = js.native
    def setTextFormatMode(/**
      * New value for property `textFormatMode`
      */
    sTextFormatMode: InputTextFormatMode): this.type = js.native
    
    /**
      * @since 1.44
      *
      * Sets a new value for property {@link #getTextFormatter textFormatter}.
      *
      * Defines the display text formatter function.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextFormatter(): this.type = js.native
    def setTextFormatter(/**
      * New value for property `textFormatter`
      */
    fnTextFormatter: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * HTML type of the internal `input` tag (e.g. Text, Number, Email, Phone). The particular effect of this
      * property differs depending on the browser and the current language settings, especially for the type
      * Number.
      *  This parameter is intended to be used with touch devices that use different soft keyboard layouts depending
      * on the given input type.
      *  Only the default value `sap.m.InputType.Text` may be used in combination with data model formats. `sap.ui.model`
      * defines extended formats that are mostly incompatible with normal HTML representations for numbers and
      * dates.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Text`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: InputType): this.type = js.native
    
    /**
      * @since 1.84.0
      *
      * Sets a new value for property {@link #getValueHelpIconSrc valueHelpIconSrc}.
      *
      * Set custom value help icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"sap-icon://value-help"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueHelpIconSrc(): this.type = js.native
    def setValueHelpIconSrc(/**
      * New value for property `valueHelpIconSrc`
      */
    sValueHelpIconSrc: URI): this.type = js.native
    
    /**
      * @since 1.21.0
      *
      * Sets a new value for property {@link #getValueHelpOnly valueHelpOnly}.
      *
      * If set to true, direct text input is disabled and the control will trigger the event "valueHelpRequest"
      * for all user interactions. The properties "showValueHelp", "editable", and "enabled" must be set to true,
      * otherwise the property will have no effect. In this scenario, the `showItems` API will not work.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueHelpOnly(): this.type = js.native
    def setValueHelpOnly(/**
      * New value for property `valueHelpOnly`
      */
    bValueHelpOnly: Boolean): this.type = js.native
    
    /**
      * @since 1.24
      *
      * Sets a new value for property {@link #getValueLiveUpdate valueLiveUpdate}.
      *
      * Indicates when the value gets updated with the user changes: At each keystroke (true) or first when the
      * user presses enter or tabs out (false).
      *
      * **Note:** When set to true and the value of the Input control is bound to a model, the change event becomes
      * obsolete and will not be fired, as the value in the model will be updated each time the user provides
      * input. In such cases, subscription to the liveChange event is more appropriate, as it corresponds to
      * the way the underlying model gets updated.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueLiveUpdate(): this.type = js.native
    def setValueLiveUpdate(/**
      * New value for property `valueLiveUpdate`
      */
    bValueLiveUpdate: Boolean): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * A helper function calculating if the SuggestionsPopover should be opened on mobile.
      *
      * @returns If the popover should be opened.
      */
    def shouldSuggetionsPopoverOpenOnMobile(/**
      * Ontap event.
      */
    oEvent: Event): Boolean = js.native
    
    /**
      * @since 1.64
      *
      * Opens the `SuggestionsPopover` with the available items. **Note:** When `valueHelpOnly` property is set
      * to true, the `SuggestionsPopover` will not open.
      */
    def showItems(): Unit = js.native
    def showItems(/**
      * Function to filter the items shown in the SuggestionsPopover
      */
    fnFilter: js.Function): Unit = js.native
    
    /**
      * @since 1.21.1
      *
      * Unbinds aggregation {@link #getSuggestionColumns suggestionColumns} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindSuggestionColumns(): this.type = js.native
    
    /**
      * @since 1.21.1
      *
      * Unbinds aggregation {@link #getSuggestionRows suggestionRows} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindSuggestionRows(): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Updates the inner input field.
      */
    def updateInputField(): Unit = js.native
    
    /**
      * Update suggestion items.
      *
      * @returns this Input instance for chaining.
      */
    def updateSuggestionItems(): this.type = js.native
  }
  
  trait Input$LiveChangeEventParameters extends StObject {
    
    /**
      * Indicates that ESC key triggered the event. **Note:** This parameter will not be sent unless the ESC
      * key is pressed.
      */
    var escPressed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value of the input before pressing ESC key. **Note:** This parameter will not be sent unless the
      * ESC key is pressed.
      */
    var previousValue: js.UndefOr[String] = js.undefined
    
    /**
      * The current value of the input, after a live change event.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object Input$LiveChangeEventParameters {
    
    inline def apply(): Input$LiveChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Input$LiveChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Input$LiveChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setEscPressed(value: Boolean): Self = StObject.set(x, "escPressed", value.asInstanceOf[js.Any])
      
      inline def setEscPressedUndefined: Self = StObject.set(x, "escPressed", js.undefined)
      
      inline def setPreviousValue(value: String): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousValueUndefined: Self = StObject.set(x, "previousValue", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Input$SubmitEventParameters extends StObject {
    
    /**
      * The new value of the input.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object Input$SubmitEventParameters {
    
    inline def apply(): Input$SubmitEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Input$SubmitEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Input$SubmitEventParameters] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Input$SuggestEventParameters extends StObject {
    
    /**
      * The current value which has been typed in the input.
      */
    var suggestValue: js.UndefOr[String] = js.undefined
    
    /**
      * The suggestion list is passed to this event for convenience. If you use list-based or tabular suggestions,
      * fill the suggestionList with the items you want to suggest. Otherwise, directly add the suggestions to
      * the "suggestionItems" aggregation of the input control.
      */
    var suggestionColumns: js.UndefOr[typings.openui5.sapMListBaseMod.default] = js.undefined
  }
  object Input$SuggestEventParameters {
    
    inline def apply(): Input$SuggestEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Input$SuggestEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Input$SuggestEventParameters] (val x: Self) extends AnyVal {
      
      inline def setSuggestValue(value: String): Self = StObject.set(x, "suggestValue", value.asInstanceOf[js.Any])
      
      inline def setSuggestValueUndefined: Self = StObject.set(x, "suggestValue", js.undefined)
      
      inline def setSuggestionColumns(value: typings.openui5.sapMListBaseMod.default): Self = StObject.set(x, "suggestionColumns", value.asInstanceOf[js.Any])
      
      inline def setSuggestionColumnsUndefined: Self = StObject.set(x, "suggestionColumns", js.undefined)
    }
  }
  
  trait Input$SuggestionItemSelectedEventParameters extends StObject {
    
    /**
      * This is the item selected in the suggestion popup for one and two-value suggestions. For tabular suggestions,
      * this value will not be set.
      */
    var selectedItem: js.UndefOr[typings.openui5.sapUiCoreItemMod.default] = js.undefined
    
    /**
      * This is the row selected in the tabular suggestion popup represented as a ColumnListItem. For one and
      * two-value suggestions, this value will not be set.
      *
      * **Note:** The row result function to select a result value for the string is already executed at this
      * time. To pick different value for the input field or to do follow up steps after the item has been selected.
      */
    var selectedRow: js.UndefOr[typings.openui5.sapMColumnListItemMod.default] = js.undefined
  }
  object Input$SuggestionItemSelectedEventParameters {
    
    inline def apply(): Input$SuggestionItemSelectedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Input$SuggestionItemSelectedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Input$SuggestionItemSelectedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setSelectedItem(value: typings.openui5.sapUiCoreItemMod.default): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setSelectedRow(value: typings.openui5.sapMColumnListItemMod.default): Self = StObject.set(x, "selectedRow", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowUndefined: Self = StObject.set(x, "selectedRow", js.undefined)
    }
  }
  
  trait Input$ValueHelpRequestEventParameters extends StObject {
    
    /**
      * The event parameter is set to true, when the button at the end of the suggestion table is clicked, otherwise
      * false. It can be used to determine whether the "value help" trigger or the "show all items" trigger has
      * been pressed.
      */
    var fromSuggestions: js.UndefOr[Boolean] = js.undefined
  }
  object Input$ValueHelpRequestEventParameters {
    
    inline def apply(): Input$ValueHelpRequestEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Input$ValueHelpRequestEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Input$ValueHelpRequestEventParameters] (val x: Self) extends AnyVal {
      
      inline def setFromSuggestions(value: Boolean): Self = StObject.set(x, "fromSuggestions", value.asInstanceOf[js.Any])
      
      inline def setFromSuggestionsUndefined: Self = StObject.set(x, "fromSuggestions", js.undefined)
    }
  }
  
  type InputLiveChangeEvent = typings.openui5.sapUiBaseEventMod.default[Input$LiveChangeEventParameters]
  
  type InputLiveChangeEventParameters = Input$LiveChangeEventParameters
  
  trait InputSettings
    extends StObject
       with InputBaseSettings {
    
    /**
      * @since 1.61
      *
      * Specifies whether autocomplete is enabled. Works only if "showSuggestion" property is set to true. **Note:**
      * The autocomplete feature is disabled on Android devices due to a OS specific issue.
      */
    var autocomplete: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.9.1) - `sap.m.DatePicker`, `sap.m.TimePicker` or `sap.m.DateTimePicker` should be
      * used for date/time inputs and formating.
      *
      * Only used if type=date and no datepicker is available. The data is displayed and the user input is parsed
      * according to this format. **Note:** The value property is always of the form RFC 3339 (YYYY-MM-dd).
      */
    var dateFormat: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The description is a text after the input field, e.g. units of measurement, currencies.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.46
      *
      * Specifies whether the suggestions highlighting is enabled.
      */
    var enableSuggestionsHighlighting: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.89
      *
      * Enables the `autoPopinMode` of `sap.m.Table`, when the input has tabular suggestions. **Note:** The `autoPopinMode`
      * overwrites the `demandPopin` and the `minScreenWidth` properties of the `sap.m.Column`. When setting,
      * `enableTableAutoPopinMode`, from true to false, the application must reconfigure the `demandPopin` and
      * `minScreenWidth` properties of the `sap.m.Column` control by itself.
      */
    var enableTableAutoPopinMode: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property only takes effect if the description property is set. It controls the distribution of space
      * between the input field and the description text. The default value is 50% leaving the other 50% for
      * the description.
      */
    var fieldWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether to filter the provided suggestions before showing them to the user.
      */
    var filterSuggests: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the value of the input is changed by user interaction - each keystroke, delete, paste, etc.
      *
      * **Note:** Browsing autocomplete suggestions does not fire the event.
      */
    var liveChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Input$LiveChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Maximum number of characters. Value '0' means the feature is switched off. This parameter is not compatible
      * with the input type `sap.m.InputType.Number`. If the input type is set to `Number`, the `maxLength` value
      * is ignored. If the `maxLength` is set after there is already a longer value, this value will not get
      * truncated. The `maxLength` property has effect only when the value is modified by user interaction.
      */
    var maxLength: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.21.1
      *
      * If set, the value of this parameter will control the horizontal size of the suggestion list to display
      * more data. This allows suggestion lists to be wider than the input field if there is enough space available.
      * By default, the suggestion list is always as wide as the input field. **Note:** The value will be ignored
      * if the actual width of the input field is larger than the specified parameter value.
      */
    var maxSuggestionWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.44
      *
      * Sets or retrieves the selected item from the suggestionItems.
      */
    var selectedItem: js.UndefOr[typings.openui5.sapUiCoreItemMod.default | String] = js.undefined
    
    /**
      * @since 1.44
      *
      * Defines the key of the selected item.
      *
      * **Note:** If duplicate keys exist, the first item matching the key is used.
      */
    var selectedKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.44
      *
      * Sets or retrieves the selected row from the suggestionRows.
      */
    var selectedRow: js.UndefOr[typings.openui5.sapMColumnListItemMod.default | String] = js.undefined
    
    /**
      * @since 1.94
      *
      * Specifies whether clear icon is shown. Pressing the icon will clear input's value and fire the liveChange
      * event.
      */
    var showClearIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.16.1
      *
      * If this is set to true, suggest event is fired when user types in the input. Changing the suggestItems
      * aggregation in suggest event listener will show suggestions within a popup. When runs on phone, input
      * will first open a dialog where the input and suggestions are shown. When runs on a tablet, the suggestions
      * are shown in a popup next to the input.
      */
    var showSuggestion: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.22.1
      *
      * For tabular suggestions, this flag will show/hide the button at the end of the suggestion table that
      * triggers the event "valueHelpRequest" when pressed. The default value is true.
      *
      * **Note:** If suggestions are not tabular or no suggestions are used, the button will not be displayed
      * and this flag is without effect.
      */
    var showTableSuggestionValueHelp: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.16
      *
      * If set to true, a value help indicator will be displayed inside the control. When clicked the event "valueHelpRequest"
      * will be fired.
      */
    var showValueHelp: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.21.2
      *
      * Minimum length of the entered text in input before suggest event is fired. The default value is 1 which
      * means the suggest event is fired after user types in input.
      *
      * **Note:** When it's set to 0, suggest event is fired when input with no text gets focus. In this case
      * no suggestion popup will open.
      */
    var startSuggestion: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.33.0
      *
      * This event is fired when user presses the Enter key on the input.
      *
      * **Notes:**
      * 	 - The event is fired independent of whether there was a change before or not. If a change was performed,
      *     the event is fired after the change event.
      * 	 - The event is also fired when an item of the select list is selected via Enter.
      * 	 - The event is only fired on an input which allows text input (`editable`, `enabled` and not `valueHelpOnly`).
      */
    var submit: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Input$SubmitEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.16.1
      *
      * This event is fired when user types in the input and showSuggestion is set to true. Changing the suggestItems
      * aggregation will show the suggestions within a popup.
      */
    var suggest: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Input$SuggestEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.21.1
      *
      * The suggestionColumns and suggestionRows are for tabular input suggestions. This aggregation allows for
      * binding the table columns; for more details see the aggregation "suggestionRows".
      */
    var suggestionColumns: js.UndefOr[
        js.Array[typings.openui5.sapMColumnMod.default] | typings.openui5.sapMColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.16.3
      *
      * This event is fired when suggestionItem shown in suggestion popup are selected. This event is only fired
      * when showSuggestion is set to true and there are suggestionItems shown in the suggestion popup.
      */
    var suggestionItemSelected: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Input$SuggestionItemSelectedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.16.1
      *
      * Defines the items displayed in the suggestion popup. Changing this aggregation (by calling `addSuggestionItem`,
      * `insertSuggestionItem`, `removeSuggestionItem`, `removeAllSuggestionItems`, or `destroySuggestionItems`)
      * after `Input` is rendered opens/closes the suggestion popup.
      *
      * To display suggestions with two text values, add `sap.ui.core.ListItem` as `SuggestionItems` (since 1.21.1).
      * For the selected `ListItem`, only the first value is returned to the input field.
      *
      * **Note:** Only `text` and `additionalText` property values of the item are displayed. For example, if
      * an `icon` is set, it is ignored. To display more information per item (including icons), you can use
      * the `suggestionRows` aggregation.
      *
      * **Note:** Disabled items are not visualized in the list with the suggestions, however they can still
      * be accessed through the aggregation. **Note:** If `suggestionItems` & `suggestionRows` are set in parallel,
      * the last aggeragtion to come would overwrite the previous ones.
      */
    var suggestionItems: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.44
      *
      * Defines the validation callback function called when a suggestion row gets selected.
      */
    var suggestionRowValidator: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.21.1
      *
      * The suggestionColumns and suggestionRows are for tabular input suggestions. This aggregation allows for
      * binding the table cells. The items of this aggregation are to be bound directly or to set in the suggest
      * event method. **Note:** If `suggestionItems` & `suggestionRows` are set in parallel, the last aggeragtion
      * to come would overwrite the previous ones.
      */
    var suggestionRows: js.UndefOr[
        (js.Array[
          typings.openui5.sapMGroupHeaderListItemMod.default | typings.openui5.sapMColumnListItemMod.default
        ]) | typings.openui5.sapMGroupHeaderListItemMod.default | typings.openui5.sapMColumnListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.44
      *
      * Defines the display text format mode.
      */
    var textFormatMode: js.UndefOr[
        InputTextFormatMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputTextFormatMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.44
      *
      * Defines the display text formatter function.
      */
    var textFormatter: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * HTML type of the internal `input` tag (e.g. Text, Number, Email, Phone). The particular effect of this
      * property differs depending on the browser and the current language settings, especially for the type
      * Number.
      *  This parameter is intended to be used with touch devices that use different soft keyboard layouts depending
      * on the given input type.
      *  Only the default value `sap.m.InputType.Text` may be used in combination with data model formats. `sap.ui.model`
      * defines extended formats that are mostly incompatible with normal HTML representations for numbers and
      * dates.
      */
    var `type`: js.UndefOr[
        InputType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.84.0
      *
      * Set custom value help icon.
      */
    var valueHelpIconSrc: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.21.0
      *
      * If set to true, direct text input is disabled and the control will trigger the event "valueHelpRequest"
      * for all user interactions. The properties "showValueHelp", "editable", and "enabled" must be set to true,
      * otherwise the property will have no effect. In this scenario, the `showItems` API will not work.
      */
    var valueHelpOnly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.16
      *
      * When the value help indicator is clicked, this event will be fired.
      */
    var valueHelpRequest: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Input$ValueHelpRequestEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.24
      *
      * Indicates when the value gets updated with the user changes: At each keystroke (true) or first when the
      * user presses enter or tabs out (false).
      *
      * **Note:** When set to true and the value of the Input control is bound to a model, the change event becomes
      * obsolete and will not be fired, as the value in the model will be updated each time the user provides
      * input. In such cases, subscription to the liveChange event is more appropriate, as it corresponds to
      * the way the underlying model gets updated.
      */
    var valueLiveUpdate: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object InputSettings {
    
    inline def apply(): InputSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputSettings] (val x: Self) extends AnyVal {
      
      inline def setAutocomplete(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setDateFormat(value: String | PropertyBindingInfo): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnableSuggestionsHighlighting(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableSuggestionsHighlighting", value.asInstanceOf[js.Any])
      
      inline def setEnableSuggestionsHighlightingUndefined: Self = StObject.set(x, "enableSuggestionsHighlighting", js.undefined)
      
      inline def setEnableTableAutoPopinMode(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableTableAutoPopinMode", value.asInstanceOf[js.Any])
      
      inline def setEnableTableAutoPopinModeUndefined: Self = StObject.set(x, "enableTableAutoPopinMode", js.undefined)
      
      inline def setFieldWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fieldWidth", value.asInstanceOf[js.Any])
      
      inline def setFieldWidthUndefined: Self = StObject.set(x, "fieldWidth", js.undefined)
      
      inline def setFilterSuggests(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "filterSuggests", value.asInstanceOf[js.Any])
      
      inline def setFilterSuggestsUndefined: Self = StObject.set(x, "filterSuggests", js.undefined)
      
      inline def setLiveChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Input$LiveChangeEventParameters] => Unit
      ): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMaxLength(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxSuggestionWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxSuggestionWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxSuggestionWidthUndefined: Self = StObject.set(x, "maxSuggestionWidth", js.undefined)
      
      inline def setSelectedItem(value: typings.openui5.sapUiCoreItemMod.default | String): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setSelectedKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setSelectedRow(value: typings.openui5.sapMColumnListItemMod.default | String): Self = StObject.set(x, "selectedRow", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowUndefined: Self = StObject.set(x, "selectedRow", js.undefined)
      
      inline def setShowClearIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showClearIcon", value.asInstanceOf[js.Any])
      
      inline def setShowClearIconUndefined: Self = StObject.set(x, "showClearIcon", js.undefined)
      
      inline def setShowSuggestion(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSuggestion", value.asInstanceOf[js.Any])
      
      inline def setShowSuggestionUndefined: Self = StObject.set(x, "showSuggestion", js.undefined)
      
      inline def setShowTableSuggestionValueHelp(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTableSuggestionValueHelp", value.asInstanceOf[js.Any])
      
      inline def setShowTableSuggestionValueHelpUndefined: Self = StObject.set(x, "showTableSuggestionValueHelp", js.undefined)
      
      inline def setShowValueHelp(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showValueHelp", value.asInstanceOf[js.Any])
      
      inline def setShowValueHelpUndefined: Self = StObject.set(x, "showValueHelp", js.undefined)
      
      inline def setStartSuggestion(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "startSuggestion", value.asInstanceOf[js.Any])
      
      inline def setStartSuggestionUndefined: Self = StObject.set(x, "startSuggestion", js.undefined)
      
      inline def setSubmit(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Input$SubmitEventParameters] => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction1(value))
      
      inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
      
      inline def setSuggest(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Input$SuggestEventParameters] => Unit
      ): Self = StObject.set(x, "suggest", js.Any.fromFunction1(value))
      
      inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
      
      inline def setSuggestionColumns(
        value: js.Array[typings.openui5.sapMColumnMod.default] | typings.openui5.sapMColumnMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "suggestionColumns", value.asInstanceOf[js.Any])
      
      inline def setSuggestionColumnsUndefined: Self = StObject.set(x, "suggestionColumns", js.undefined)
      
      inline def setSuggestionColumnsVarargs(value: typings.openui5.sapMColumnMod.default*): Self = StObject.set(x, "suggestionColumns", js.Array(value*))
      
      inline def setSuggestionItemSelected(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Input$SuggestionItemSelectedEventParameters] => Unit
      ): Self = StObject.set(x, "suggestionItemSelected", js.Any.fromFunction1(value))
      
      inline def setSuggestionItemSelectedUndefined: Self = StObject.set(x, "suggestionItemSelected", js.undefined)
      
      inline def setSuggestionItems(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "suggestionItems", value.asInstanceOf[js.Any])
      
      inline def setSuggestionItemsUndefined: Self = StObject.set(x, "suggestionItems", js.undefined)
      
      inline def setSuggestionItemsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "suggestionItems", js.Array(value*))
      
      inline def setSuggestionRowValidator(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "suggestionRowValidator", value.asInstanceOf[js.Any])
      
      inline def setSuggestionRowValidatorUndefined: Self = StObject.set(x, "suggestionRowValidator", js.undefined)
      
      inline def setSuggestionRows(
        value: (js.Array[
              typings.openui5.sapMGroupHeaderListItemMod.default | typings.openui5.sapMColumnListItemMod.default
            ]) | typings.openui5.sapMGroupHeaderListItemMod.default | typings.openui5.sapMColumnListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "suggestionRows", value.asInstanceOf[js.Any])
      
      inline def setSuggestionRowsUndefined: Self = StObject.set(x, "suggestionRows", js.undefined)
      
      inline def setSuggestionRowsVarargs(
        value: (typings.openui5.sapMGroupHeaderListItemMod.default | typings.openui5.sapMColumnListItemMod.default)*
      ): Self = StObject.set(x, "suggestionRows", js.Array(value*))
      
      inline def setTextFormatMode(
        value: InputTextFormatMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputTextFormatMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textFormatMode", value.asInstanceOf[js.Any])
      
      inline def setTextFormatModeUndefined: Self = StObject.set(x, "textFormatMode", js.undefined)
      
      inline def setTextFormatter(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "textFormatter", value.asInstanceOf[js.Any])
      
      inline def setTextFormatterUndefined: Self = StObject.set(x, "textFormatter", js.undefined)
      
      inline def setType(
        value: InputType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof InputType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValueHelpIconSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "valueHelpIconSrc", value.asInstanceOf[js.Any])
      
      inline def setValueHelpIconSrcUndefined: Self = StObject.set(x, "valueHelpIconSrc", js.undefined)
      
      inline def setValueHelpOnly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "valueHelpOnly", value.asInstanceOf[js.Any])
      
      inline def setValueHelpOnlyUndefined: Self = StObject.set(x, "valueHelpOnly", js.undefined)
      
      inline def setValueHelpRequest(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Input$ValueHelpRequestEventParameters] => Unit
      ): Self = StObject.set(x, "valueHelpRequest", js.Any.fromFunction1(value))
      
      inline def setValueHelpRequestUndefined: Self = StObject.set(x, "valueHelpRequest", js.undefined)
      
      inline def setValueLiveUpdate(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "valueLiveUpdate", value.asInstanceOf[js.Any])
      
      inline def setValueLiveUpdateUndefined: Self = StObject.set(x, "valueLiveUpdate", js.undefined)
    }
  }
  
  type InputSubmitEvent = typings.openui5.sapUiBaseEventMod.default[Input$SubmitEventParameters]
  
  type InputSubmitEventParameters = Input$SubmitEventParameters
  
  type InputSuggestEvent = typings.openui5.sapUiBaseEventMod.default[Input$SuggestEventParameters]
  
  type InputSuggestEventParameters = Input$SuggestEventParameters
  
  type InputSuggestionItemSelectedEvent = typings.openui5.sapUiBaseEventMod.default[Input$SuggestionItemSelectedEventParameters]
  
  type InputSuggestionItemSelectedEventParameters = Input$SuggestionItemSelectedEventParameters
  
  type InputValueHelpRequestEvent = typings.openui5.sapUiBaseEventMod.default[Input$ValueHelpRequestEventParameters]
  
  type InputValueHelpRequestEventParameters = Input$ValueHelpRequestEventParameters
}
