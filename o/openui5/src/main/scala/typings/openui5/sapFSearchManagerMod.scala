package typings.openui5

import typings.openui5.anon.ClearButtonPressed
import typings.openui5.anon.NewValue
import typings.openui5.anon.SuggestValue
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFSearchManagerMod {
  
  @JSImport("sap/f/SearchManager", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `SearchManager`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SearchManager {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SearchManagerSettings) = this()
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
    mSettings: SearchManagerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SearchManagerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/SearchManager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.SearchManager with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, SearchManager]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SearchManager],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.SearchManager.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SearchManager
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
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
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.f.SearchManager`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.SearchManager` itself.
      *
      * Fired when the value of the search field is changed by the user, for example at each key press.
      *
      * **Note:** Do not invalidate or re-render a focused search field, especially during the `liveChange` event.
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
      * Context object to call the event handler with. Defaults to this `sap.f.SearchManager` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.f.SearchManager`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.SearchManager` itself.
      *
      * Fired when the value of the search field is changed by the user, for example at each key press.
      *
      * **Note:** Do not invalidate or re-render a focused search field, especially during the `liveChange` event.
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
      * Context object to call the event handler with. Defaults to this `sap.f.SearchManager` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.f.SearchManager`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.SearchManager` itself.
      *
      * Fired when the user triggers a search.
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
      * Context object to call the event handler with. Defaults to this `sap.f.SearchManager` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.f.SearchManager`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.SearchManager` itself.
      *
      * Fired when the user triggers a search.
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
      * Context object to call the event handler with. Defaults to this `sap.f.SearchManager` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:suggest suggest} event of this `sap.f.SearchManager`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.SearchManager` itself.
      *
      * Fired when the search field is initially focused or its value is changed by the user. This event means
      * that suggestion data should be updated, in case if suggestions are used. Use the value parameter to create
      * new suggestions for it.
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
      * Context object to call the event handler with. Defaults to this `sap.f.SearchManager` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:suggest suggest} event of this `sap.f.SearchManager`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.SearchManager` itself.
      *
      * Fired when the search field is initially focused or its value is changed by the user. This event means
      * that suggestion data should be updated, in case if suggestions are used. Use the value parameter to create
      * new suggestions for it.
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
      * Context object to call the event handler with. Defaults to this `sap.f.SearchManager` itself
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
      * Destroys all the suggestionItems in the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySuggestionItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.f.SearchManager`.
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
      * Detaches event handler `fnFunction` from the {@link #event:search search} event of this `sap.f.SearchManager`.
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
      * Detaches event handler `fnFunction` from the {@link #event:suggest suggest} event of this `sap.f.SearchManager`.
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
      * Fires event {@link #event:search search} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSearch(): this.type = js.native
    def fireSearch(/**
      * Parameters to pass along with the event
      */
    mParameters: ClearButtonPressed): this.type = js.native
    
    /**
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
      * Gets current value of property {@link #getEnableSuggestions enableSuggestions}.
      *
      * If true, a `suggest` event is fired when user types in the input and when the input is focused. On a
      * phone device, a full screen dialog with suggestions is always shown even if the suggestions list is empty.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableSuggestions`
      */
    def getEnableSuggestions(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Determines whether the control is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMaxLength maxLength}.
      *
      * Determines the maximum number of characters. Value '0' means the feature is switched off.
      *
      * Default value is `0`.
      *
      * @returns Value of property `maxLength`
      */
    def getMaxLength(): int = js.native
    
    /**
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * Defines the text that is displayed when no value is available. The default placeholder text is the word
      * "Search" in the current local language (if supported) or in English.
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * `SuggestionItems` are the items which are displayed in the suggestions list. The following properties
      * can be used:
      * 	 - `key` - it is not displayed and may be used as internal technical field
      * 	 - `text` - it is displayed as normal suggestion text
      * 	 - `icon`
      * 	 - `description` - additional text that may be used to visually display search item type or category
      */
    def getSuggestionItems(): js.Array[typings.openui5.sapMSuggestionItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Defines the input value.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
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
      * Removes all the controls from the aggregation {@link #getSuggestionItems suggestionItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSuggestionItems(): js.Array[typings.openui5.sapMSuggestionItemMod.default] = js.native
    
    def removeSuggestionItem(/**
      * The suggestionItem to remove or its index or id
      */
    vSuggestionItem: String): typings.openui5.sapMSuggestionItemMod.default | Null = js.native
    /**
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
      * Sets a new value for property {@link #getEnableSuggestions enableSuggestions}.
      *
      * If true, a `suggest` event is fired when user types in the input and when the input is focused. On a
      * phone device, a full screen dialog with suggestions is always shown even if the suggestions list is empty.
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
      * Determines whether the control is enabled.
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
      * Determines the maximum number of characters. Value '0' means the feature is switched off.
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
      * Defines the text that is displayed when no value is available. The default placeholder text is the word
      * "Search" in the current local language (if supported) or in English.
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
      * Sets a new value for property {@link #getValue value}.
      *
      * Defines the input value.
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
      * Unbinds property {@link #getValue value} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindValue(): this.type = js.native
  }
  
  trait SearchManagerSettings
    extends StObject
       with ElementSettings {
    
    /**
      * If true, a `suggest` event is fired when user types in the input and when the input is focused. On a
      * phone device, a full screen dialog with suggestions is always shown even if the suggestions list is empty.
      */
    var enableSuggestions: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the control is enabled.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the value of the search field is changed by the user, for example at each key press.
      *
      * **Note:** Do not invalidate or re-render a focused search field, especially during the `liveChange` event.
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines the maximum number of characters. Value '0' means the feature is switched off.
      */
    var maxLength: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the text that is displayed when no value is available. The default placeholder text is the word
      * "Search" in the current local language (if supported) or in English.
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when the user triggers a search.
      */
    var search: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the search field is initially focused or its value is changed by the user. This event means
      * that suggestion data should be updated, in case if suggestions are used. Use the value parameter to create
      * new suggestions for it.
      */
    var suggest: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * `SuggestionItems` are the items which are displayed in the suggestions list. The following properties
      * can be used:
      * 	 - `key` - it is not displayed and may be used as internal technical field
      * 	 - `text` - it is displayed as normal suggestion text
      * 	 - `icon`
      * 	 - `description` - additional text that may be used to visually display search item type or category
      */
    var suggestionItems: js.UndefOr[
        js.Array[typings.openui5.sapMSuggestionItemMod.default] | typings.openui5.sapMSuggestionItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the input value.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object SearchManagerSettings {
    
    inline def apply(): SearchManagerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchManagerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchManagerSettings] (val x: Self) extends AnyVal {
      
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
      
      inline def setSearch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSuggest(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "suggest", js.Any.fromFunction1(value))
      
      inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
      
      inline def setSuggestionItems(
        value: js.Array[typings.openui5.sapMSuggestionItemMod.default] | typings.openui5.sapMSuggestionItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "suggestionItems", value.asInstanceOf[js.Any])
      
      inline def setSuggestionItemsUndefined: Self = StObject.set(x, "suggestionItems", js.undefined)
      
      inline def setSuggestionItemsVarargs(value: typings.openui5.sapMSuggestionItemMod.default*): Self = StObject.set(x, "suggestionItems", js.Array(value*))
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
