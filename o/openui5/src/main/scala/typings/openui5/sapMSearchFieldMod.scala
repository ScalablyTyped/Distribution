package typings.openui5

import typings.openui5.anon.NewValue
import typings.openui5.anon.RefreshButtonPressed
import typings.openui5.anon.SuggestValue
import typings.openui5.anon.Value
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFLibraryMod.IShellBar
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.std.Element
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSearchFieldMod {
  
  @JSImport("sap/m/SearchField", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SearchField.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/search/ Search Field}
    */
  open class default () extends SearchField {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SearchFieldSettings) = this()
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
    mSettings: SearchFieldSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SearchFieldSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_f_IShellBar: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
    
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
    
    @JSImport("sap/m/SearchField", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.SearchField with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, SearchField]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SearchField],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.SearchField.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SearchField
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent
       with IShellBar
       with /* was: sap.m.IToolbarInteractiveControl */ Object {
    
    var __implements__sap_m_IToolbarInteractiveControl: Boolean = js.native
    
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
      * @SINCE 1.34
      *
      * Adds some suggestionItem to the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSuggestionItem(
      /**
      * The suggestionItem to add; if empty, nothing is inserted
      */
    oSuggestionItem: typings.openui5.sapMSuggestionItemMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SearchField` itself.
      *
      * This event is fired when the user changes the value of the search field. Unlike the `liveChange` event,
      * the `change` event is not fired for each key press.
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
      * Context object to call the event handler with. Defaults to this `sap.m.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.77
      *
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SearchField` itself.
      *
      * This event is fired when the user changes the value of the search field. Unlike the `liveChange` event,
      * the `change` event is not fired for each key press.
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
      * Context object to call the event handler with. Defaults to this `sap.m.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.9.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SearchField` itself.
      *
      * This event is fired each time when the value of the search field is changed by the user - e.g. at each
      * key press. Do not invalidate a focused search field, especially during the liveChange event.
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
      * Context object to call the event handler with. Defaults to this `sap.m.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.9.1
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SearchField` itself.
      *
      * This event is fired each time when the value of the search field is changed by the user - e.g. at each
      * key press. Do not invalidate a focused search field, especially during the liveChange event.
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
      * Context object to call the event handler with. Defaults to this `sap.m.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.m.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SearchField` itself.
      *
      * Event which is fired when the user triggers a search.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.m.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SearchField` itself.
      *
      * Event which is fired when the user triggers a search.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
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
    def attachSearch(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.34
      *
      * Attaches event handler `fnFunction` to the {@link #event:suggest suggest} event of this `sap.m.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SearchField` itself.
      *
      * This event is fired when the search field is initially focused or its value is changed by the user. This
      * event means that suggestion data should be updated, in case if suggestions are used. Use the value parameter
      * to create new suggestions for it.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSuggest(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSuggest(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.34
      *
      * Attaches event handler `fnFunction` to the {@link #event:suggest suggest} event of this `sap.m.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SearchField` itself.
      *
      * This event is fired when the search field is initially focused or its value is changed by the user. This
      * event means that suggestion data should be updated, in case if suggestions are used. Use the value parameter
      * to create new suggestions for it.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds property {@link #getValue value} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindProperty ManagedObject.bindProperty} for a detailed description
      * of the possible properties of `oBindingInfo`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindValue(/**
      * The binding information
      */
    oBindingInfo: PropertyBindingInfo): this.type = js.native
    
    /**
      * @SINCE 1.34
      *
      * Destroys all the suggestionItems in the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySuggestionItems(): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.SearchField`.
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
      * @SINCE 1.9.1
      *
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.SearchField`.
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
      * Detaches event handler `fnFunction` from the {@link #event:search search} event of this `sap.m.SearchField`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSearch(
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
      * @SINCE 1.34
      *
      * Detaches event handler `fnFunction` from the {@link #event:suggest suggest} event of this `sap.m.SearchField`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSuggest(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSuggest(
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
      * @SINCE 1.77
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
      * @SINCE 1.9.1
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: NewValue): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:search search} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSearch(): this.type = js.native
    def fireSearch(/**
      * Parameters to pass along with the event
      */
    mParameters: RefreshButtonPressed): this.type = js.native
    
    /**
      * @SINCE 1.34
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:suggest suggest} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSuggest(): this.type = js.native
    def fireSuggest(/**
      * Parameters to pass along with the event
      */
    mParameters: SuggestValue): this.type = js.native
    
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
      * @SINCE 1.34
      *
      * Gets current value of property {@link #getEnableSuggestions enableSuggestions}.
      *
      * If `true`, a `suggest` event is fired when user types in the input and when the input is focused. On
      * a phone device, a full screen dialog with suggestions is always shown even if the suggestions list is
      * empty.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableSuggestions`
      */
    def getEnableSuggestions(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Boolean property to enable the control (default is true).
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMaxLength maxLength}.
      *
      * Maximum number of characters. Value '0' means the feature is switched off.
      *
      * Default value is `0`.
      *
      * @returns Value of property `maxLength`
      */
    def getMaxLength(): int = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * Text shown when no value available. If no placeholder value is set, the word "Search" in the current
      * local language (if supported) or in English will be displayed as a placeholder (property value will still
      * be `null` in that case).
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * @SINCE 1.34
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Function returns DOM element which acts as reference point for the opening suggestion menu
      *
      * @returns the DOM element at which to open the suggestion list
      */
    def getPopupAnchorDomRef(): Element = js.native
    
    /**
      * @SINCE 1.16
      * @deprecated (since 1.110.0)
      *
      * Gets current value of property {@link #getRefreshButtonTooltip refreshButtonTooltip}.
      *
      * Tooltip text of the refresh button. If it is not set, the Default tooltip text is the word "Refresh"
      * in the current local language (if supported) or in English. Tooltips are not displayed on touch devices.
      *
      * @returns Value of property `refreshButtonTooltip`
      */
    def getRefreshButtonTooltip(): String = js.native
    
    /**
      * @SINCE 1.20
      * @deprecated (since 1.38) - This parameter is deprecated and has no effect in run time. The cursor position
      * of a focused search field is restored after re-rendering automatically.
      *
      * Gets current value of property {@link #getSelectOnFocus selectOnFocus}.
      *
      * Normally, search text is selected for copy when the SearchField is focused by keyboard navigation. If
      * an application re-renders the SearchField during the liveChange event, set this property to `false` to
      * disable text selection by focus.
      *
      * Default value is `true`.
      *
      * @returns Value of property `selectOnFocus`
      */
    def getSelectOnFocus(): Boolean = js.native
    
    /**
      * @deprecated (since 1.16.0) - This parameter is deprecated. Use "showSearchButton" instead.
      *
      * Gets current value of property {@link #getShowMagnifier showMagnifier}.
      *
      * Set to `false` to hide the magnifier icon.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showMagnifier`
      */
    def getShowMagnifier(): Boolean = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets current value of property {@link #getShowRefreshButton showRefreshButton}.
      *
      * Set to `true` to display a refresh button in place of the search icon. By pressing the refresh button
      * or F5 key on keyboard, the user can reload the results list without changing the search string. Note:
      * if "showSearchButton" property is set to `false`, both the search and refresh buttons are not displayed
      * even if the "showRefreshButton" property is true.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showRefreshButton`
      */
    def getShowRefreshButton(): Boolean = js.native
    
    /**
      * @SINCE 1.23
      *
      * Gets current value of property {@link #getShowSearchButton showSearchButton}.
      *
      * Set to `true` to show the search button with the magnifier icon. If `false`, both the search and refresh
      * buttons are not displayed even if the "showRefreshButton" property is `true`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSearchButton`
      */
    def getShowSearchButton(): Boolean = js.native
    
    /**
      * @SINCE 1.34
      *
      * Gets content of aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * `SuggestionItems` are the items which will be shown in the suggestions list. The following properties
      * can be used:
      * 	 - `key` is not displayed and may be used as internal technical field
      * 	 - `text` is displayed as normal suggestion text
      * 	 - `icon`
      * 	 - `description` - additional text may be used to visually display search item type or category
      */
    def getSuggestionItems(): js.Array[typings.openui5.sapMSuggestionItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Input Value.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the CSS width of the input. If not set, width is 100%.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.34
      *
      * Checks for the provided `sap.m.SuggestionItem` in the aggregation {@link #getSuggestionItems suggestionItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSuggestionItem(
      /**
      * The suggestionItem whose index is looked for
      */
    oSuggestionItem: typings.openui5.sapMSuggestionItemMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.34
      *
      * Inserts a suggestionItem into the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSuggestionItem(
      /**
      * The suggestionItem to insert; if empty, nothing is inserted
      */
    oSuggestionItem: typings.openui5.sapMSuggestionItemMod.default,
      /**
      * The `0`-based index the suggestionItem should be inserted at; for a negative value of `iIndex`, the suggestionItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the suggestionItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
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
      * @SINCE 1.34
      *
      * Removes all the controls from the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSuggestionItems(): js.Array[typings.openui5.sapMSuggestionItemMod.default] = js.native
    
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
    
    def removeSuggestionItem(/**
      * The suggestionItem to remove or its index or id
      */
    vSuggestionItem: String): typings.openui5.sapMSuggestionItemMod.default | Null = js.native
    /**
      * @SINCE 1.34
      *
      * Removes a suggestionItem from the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * @returns The removed suggestionItem or `null`
      */
    def removeSuggestionItem(/**
      * The suggestionItem to remove or its index or id
      */
    vSuggestionItem: int): typings.openui5.sapMSuggestionItemMod.default | Null = js.native
    def removeSuggestionItem(
      /**
      * The suggestionItem to remove or its index or id
      */
    vSuggestionItem: typings.openui5.sapMSuggestionItemMod.default
    ): typings.openui5.sapMSuggestionItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.34
      *
      * Sets a new value for property {@link #getEnableSuggestions enableSuggestions}.
      *
      * If `true`, a `suggest` event is fired when user types in the input and when the input is focused. On
      * a phone device, a full screen dialog with suggestions is always shown even if the suggestions list is
      * empty.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableSuggestions(): this.type = js.native
    def setEnableSuggestions(/**
      * New value for property `enableSuggestions`
      */
    bEnableSuggestions: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Boolean property to enable the control (default is true).
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
      * Sets a new value for property {@link #getMaxLength maxLength}.
      *
      * Maximum number of characters. Value '0' means the feature is switched off.
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
      * Sets a new value for property {@link #getPlaceholder placeholder}.
      *
      * Text shown when no value available. If no placeholder value is set, the word "Search" in the current
      * local language (if supported) or in English will be displayed as a placeholder (property value will still
      * be `null` in that case).
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
      * @SINCE 1.16
      * @deprecated (since 1.110.0)
      *
      * Sets a new value for property {@link #getRefreshButtonTooltip refreshButtonTooltip}.
      *
      * Tooltip text of the refresh button. If it is not set, the Default tooltip text is the word "Refresh"
      * in the current local language (if supported) or in English. Tooltips are not displayed on touch devices.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRefreshButtonTooltip(): this.type = js.native
    def setRefreshButtonTooltip(/**
      * New value for property `refreshButtonTooltip`
      */
    sRefreshButtonTooltip: String): this.type = js.native
    
    /**
      * @SINCE 1.20
      * @deprecated (since 1.38) - This parameter is deprecated and has no effect in run time. The cursor position
      * of a focused search field is restored after re-rendering automatically.
      *
      * Sets a new value for property {@link #getSelectOnFocus selectOnFocus}.
      *
      * Normally, search text is selected for copy when the SearchField is focused by keyboard navigation. If
      * an application re-renders the SearchField during the liveChange event, set this property to `false` to
      * disable text selection by focus.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectOnFocus(): this.type = js.native
    def setSelectOnFocus(/**
      * New value for property `selectOnFocus`
      */
    bSelectOnFocus: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.16.0) - This parameter is deprecated. Use "showSearchButton" instead.
      *
      * Sets a new value for property {@link #getShowMagnifier showMagnifier}.
      *
      * Set to `false` to hide the magnifier icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowMagnifier(): this.type = js.native
    def setShowMagnifier(/**
      * New value for property `showMagnifier`
      */
    bShowMagnifier: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets a new value for property {@link #getShowRefreshButton showRefreshButton}.
      *
      * Set to `true` to display a refresh button in place of the search icon. By pressing the refresh button
      * or F5 key on keyboard, the user can reload the results list without changing the search string. Note:
      * if "showSearchButton" property is set to `false`, both the search and refresh buttons are not displayed
      * even if the "showRefreshButton" property is true.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowRefreshButton(): this.type = js.native
    def setShowRefreshButton(/**
      * New value for property `showRefreshButton`
      */
    bShowRefreshButton: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.23
      *
      * Sets a new value for property {@link #getShowSearchButton showSearchButton}.
      *
      * Set to `true` to show the search button with the magnifier icon. If `false`, both the search and refresh
      * buttons are not displayed even if the "showRefreshButton" property is `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSearchButton(): this.type = js.native
    def setShowSearchButton(/**
      * New value for property `showSearchButton`
      */
    bShowSearchButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * Input Value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the CSS width of the input. If not set, width is 100%.
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
    
    /**
      * @SINCE 1.34
      *
      * Toggle visibility of the suggestion list.
      *
      * @returns `this` to allow method chaining
      */
    def suggest(): this.type = js.native
    def suggest(
      /**
      * If the value is `true` the suggestions are displayed. If the value is `false` the suggestions are hidden.
      * An empty suggestion list is not shown on desktop and tablet devices.
      *
      *
      * This method may be called only as a response to the `suggest` event to ensure that the suggestion list
      * is shown at the moment when the user expects it.
      */
    bShow: Boolean
    ): this.type = js.native
    
    /**
      * Unbinds property {@link #getValue value} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindValue(): this.type = js.native
  }
  
  trait SearchFieldSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.77
      *
      * This event is fired when the user changes the value of the search field. Unlike the `liveChange` event,
      * the `change` event is not fired for each key press.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.34
      *
      * If `true`, a `suggest` event is fired when user types in the input and when the input is focused. On
      * a phone device, a full screen dialog with suggestions is always shown even if the suggestions list is
      * empty.
      */
    var enableSuggestions: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Boolean property to enable the control (default is true).
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.9.1
      *
      * This event is fired each time when the value of the search field is changed by the user - e.g. at each
      * key press. Do not invalidate a focused search field, especially during the liveChange event.
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Maximum number of characters. Value '0' means the feature is switched off.
      */
    var maxLength: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Text shown when no value available. If no placeholder value is set, the word "Search" in the current
      * local language (if supported) or in English will be displayed as a placeholder (property value will still
      * be `null` in that case).
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.16
      * @deprecated (since 1.110.0)
      *
      * Tooltip text of the refresh button. If it is not set, the Default tooltip text is the word "Refresh"
      * in the current local language (if supported) or in English. Tooltips are not displayed on touch devices.
      */
    var refreshButtonTooltip: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event which is fired when the user triggers a search.
      */
    var search: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.20
      * @deprecated (since 1.38) - This parameter is deprecated and has no effect in run time. The cursor position
      * of a focused search field is restored after re-rendering automatically.
      *
      * Normally, search text is selected for copy when the SearchField is focused by keyboard navigation. If
      * an application re-renders the SearchField during the liveChange event, set this property to `false` to
      * disable text selection by focus.
      */
    var selectOnFocus: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.16.0) - This parameter is deprecated. Use "showSearchButton" instead.
      *
      * Set to `false` to hide the magnifier icon.
      */
    var showMagnifier: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * Set to `true` to display a refresh button in place of the search icon. By pressing the refresh button
      * or F5 key on keyboard, the user can reload the results list without changing the search string. Note:
      * if "showSearchButton" property is set to `false`, both the search and refresh buttons are not displayed
      * even if the "showRefreshButton" property is true.
      */
    var showRefreshButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.23
      *
      * Set to `true` to show the search button with the magnifier icon. If `false`, both the search and refresh
      * buttons are not displayed even if the "showRefreshButton" property is `true`.
      */
    var showSearchButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34
      *
      * This event is fired when the search field is initially focused or its value is changed by the user. This
      * event means that suggestion data should be updated, in case if suggestions are used. Use the value parameter
      * to create new suggestions for it.
      */
    var suggest: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.34
      *
      * `SuggestionItems` are the items which will be shown in the suggestions list. The following properties
      * can be used:
      * 	 - `key` is not displayed and may be used as internal technical field
      * 	 - `text` is displayed as normal suggestion text
      * 	 - `icon`
      * 	 - `description` - additional text may be used to visually display search item type or category
      */
    var suggestionItems: js.UndefOr[
        js.Array[typings.openui5.sapMSuggestionItemMod.default] | typings.openui5.sapMSuggestionItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Input Value.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the CSS width of the input. If not set, width is 100%.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SearchFieldSettings {
    
    inline def apply(): SearchFieldSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchFieldSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchFieldSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setEnableSuggestions(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableSuggestions", value.asInstanceOf[js.Any])
      
      inline def setEnableSuggestionsUndefined: Self = StObject.set(x, "enableSuggestions", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setLiveChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMaxLength(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setPlaceholder(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRefreshButtonTooltip(value: String | PropertyBindingInfo): Self = StObject.set(x, "refreshButtonTooltip", value.asInstanceOf[js.Any])
      
      inline def setRefreshButtonTooltipUndefined: Self = StObject.set(x, "refreshButtonTooltip", js.undefined)
      
      inline def setSearch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSelectOnFocus(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectOnFocusUndefined: Self = StObject.set(x, "selectOnFocus", js.undefined)
      
      inline def setShowMagnifier(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showMagnifier", value.asInstanceOf[js.Any])
      
      inline def setShowMagnifierUndefined: Self = StObject.set(x, "showMagnifier", js.undefined)
      
      inline def setShowRefreshButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showRefreshButton", value.asInstanceOf[js.Any])
      
      inline def setShowRefreshButtonUndefined: Self = StObject.set(x, "showRefreshButton", js.undefined)
      
      inline def setShowSearchButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSearchButton", value.asInstanceOf[js.Any])
      
      inline def setShowSearchButtonUndefined: Self = StObject.set(x, "showSearchButton", js.undefined)
      
      inline def setSuggest(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "suggest", js.Any.fromFunction1(value))
      
      inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
      
      inline def setSuggestionItems(
        value: js.Array[typings.openui5.sapMSuggestionItemMod.default] | typings.openui5.sapMSuggestionItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "suggestionItems", value.asInstanceOf[js.Any])
      
      inline def setSuggestionItemsUndefined: Self = StObject.set(x, "suggestionItems", js.undefined)
      
      inline def setSuggestionItemsVarargs(value: typings.openui5.sapMSuggestionItemMod.default*): Self = StObject.set(x, "suggestionItems", js.Array(value*))
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
