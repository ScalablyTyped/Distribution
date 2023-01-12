package typings.openui5

import typings.openui5.anon.Query
import typings.openui5.anon.Value
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.ToolbarItem
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsSearchFieldMod {
  
  @JSImport("sap/ui/commons/SearchField", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SearchField.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
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
    var __implements__sap_ui_commons_ToolbarItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/SearchField", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.SearchField with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
      * Returns a metadata object for class sap.ui.commons.SearchField.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SearchField
    extends typings.openui5.sapUiCoreControlMod.default
       with ToolbarItem {
    
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
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.commons.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.SearchField` itself.
      *
      * Event which is fired when the user triggers a search
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.commons.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.SearchField` itself.
      *
      * Event which is fired when the user triggers a search
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:suggest suggest} event of this `sap.ui.commons.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.SearchField` itself.
      *
      * Event which is fired when new suggest values are required.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:suggest suggest} event of this `sap.ui.commons.SearchField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.SearchField` itself.
      *
      * Event which is fired when new suggest values are required.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.SearchField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Clears the history of the control
      */
    def clearHistory(): Unit = js.native
    
    /**
      * Destroys the searchProvider in the aggregation {@link #getSearchProvider searchProvider}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySearchProvider(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:search search} event of this `sap.ui.commons.SearchField`.
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
      * Detaches event handler `fnFunction` from the {@link #event:suggest suggest} event of this `sap.ui.commons.SearchField`.
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
      * Fires event {@link #event:search search} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSearch(): this.type = js.native
    def fireSearch(/**
      * Parameters to pass along with the event
      */
    mParameters: Query): this.type = js.native
    
    /**
      * Fires event {@link #event:suggest suggest} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSuggest(): this.type = js.native
    def fireSuggest(/**
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
      * Gets current value of property {@link #getEditable editable}.
      *
      * Non-editable controls have different colors, depending on custom settings
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * @SINCE 1.10.3
      *
      * Gets current value of property {@link #getEnableCache enableCache}.
      *
      * When list suggestion is enabled all suggestions are cached and no suggest event is fired.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableCache`
      */
    def getEnableCache(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableClear enableClear}.
      *
      * Defines whether the clear functionality shall be active
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableClear`
      */
    def getEnableClear(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableFilterMode enableFilterMode}.
      *
      * Defines whether the search event should also be fired when the SearchField is empty (like a Filter field)
      * and when the clear button (if activated) is pressed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableFilterMode`
      */
    def getEnableFilterMode(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableListSuggest enableListSuggest}.
      *
      * Defines whether a pop up list shall be provided for suggestions
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableListSuggest`
      */
    def getEnableListSuggest(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Disabled fields have different colors, and they can not be focused.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMaxHistoryItems maxHistoryItems}.
      *
      * Maximum number of history items in the suggestion list. 0 displays and stores no history. The history
      * is locally stored on the client. Therefore do not activate this feature when this control handles confidential
      * data.
      *
      * Default value is `0`.
      *
      * @returns Value of property `maxHistoryItems`
      */
    def getMaxHistoryItems(): int = js.native
    
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
      * Gets current value of property {@link #getMaxSuggestionItems maxSuggestionItems}.
      *
      * Maximum number of suggestion items in the suggestion list.
      *
      * Default value is `10`.
      *
      * @returns Value of property `maxSuggestionItems`
      */
    def getMaxSuggestionItems(): int = js.native
    
    /**
      * @SINCE 1.32
      *
      * Gets current value of property {@link #getPlaceholder placeholder}.
      *
      * Placeholder for the input field.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `placeholder`
      */
    def getPlaceholder(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getSearchProvider searchProvider}.
      *
      * Search provider instance which handles the suggestions for this SearchField (e.g. Open Search Protocol).
      */
    def getSearchProvider(): typings.openui5.sapUiCoreSearchSearchProviderMod.default = js.native
    
    /**
      * Gets current value of property {@link #getShowExternalButton showExternalButton}.
      *
      * Defines whether an additional search button shall be displayed
      *
      * Default value is `false`.
      *
      * @returns Value of property `showExternalButton`
      */
    def getShowExternalButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowListExpander showListExpander}.
      *
      * Defines whether the list expander shall be displayed in the case of an enabled list for suggestions.
      * This feature is deactivated on mobile devices.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showListExpander`
      */
    def getShowListExpander(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getStartSuggestion startSuggestion}.
      *
      * Minimum length of the entered string triggering the suggestion list.
      *
      * Default value is `3`.
      *
      * @returns Value of property `startSuggestion`
      */
    def getStartSuggestion(): int = js.native
    
    /**
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Sets the horizontal alignment of the text
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Text that shall be displayed within the search field
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * @SINCE 1.32
      *
      * Gets current value of property {@link #getValueState valueState}.
      *
      * Visualizes warnings or errors related to the input field. Possible values: Warning, Error, Success, None.
      *
      * Default value is `None`.
      *
      * @returns Value of property `valueState`
      */
    def getValueState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getVisibleItemCount visibleItemCount}.
      *
      * Defines the number of items in the suggestion list that shall be displayed at once. If the overall number
      * of list items is higher than the setting, a scroll bar is provided.
      *
      * Default value is `20`.
      *
      * @returns Value of property `visibleItemCount`
      */
    def getVisibleItemCount(): int = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Control width in CSS-size
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
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Non-editable controls have different colors, depending on custom settings
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
      * @SINCE 1.10.3
      *
      * Sets a new value for property {@link #getEnableCache enableCache}.
      *
      * When list suggestion is enabled all suggestions are cached and no suggest event is fired.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableCache(): this.type = js.native
    def setEnableCache(/**
      * New value for property `enableCache`
      */
    bEnableCache: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableClear enableClear}.
      *
      * Defines whether the clear functionality shall be active
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableClear(): this.type = js.native
    def setEnableClear(/**
      * New value for property `enableClear`
      */
    bEnableClear: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableFilterMode enableFilterMode}.
      *
      * Defines whether the search event should also be fired when the SearchField is empty (like a Filter field)
      * and when the clear button (if activated) is pressed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableFilterMode(): this.type = js.native
    def setEnableFilterMode(/**
      * New value for property `enableFilterMode`
      */
    bEnableFilterMode: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableListSuggest enableListSuggest}.
      *
      * Defines whether a pop up list shall be provided for suggestions
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableListSuggest(): this.type = js.native
    def setEnableListSuggest(/**
      * New value for property `enableListSuggest`
      */
    bEnableListSuggest: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Disabled fields have different colors, and they can not be focused.
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
      * Sets a new value for property {@link #getMaxHistoryItems maxHistoryItems}.
      *
      * Maximum number of history items in the suggestion list. 0 displays and stores no history. The history
      * is locally stored on the client. Therefore do not activate this feature when this control handles confidential
      * data.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxHistoryItems(): this.type = js.native
    def setMaxHistoryItems(/**
      * New value for property `maxHistoryItems`
      */
    iMaxHistoryItems: int): this.type = js.native
    
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
      * Sets a new value for property {@link #getMaxSuggestionItems maxSuggestionItems}.
      *
      * Maximum number of suggestion items in the suggestion list.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `10`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxSuggestionItems(): this.type = js.native
    def setMaxSuggestionItems(/**
      * New value for property `maxSuggestionItems`
      */
    iMaxSuggestionItems: int): this.type = js.native
    
    /**
      * @SINCE 1.32
      *
      * Sets a new value for property {@link #getPlaceholder placeholder}.
      *
      * Placeholder for the input field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPlaceholder(): this.type = js.native
    def setPlaceholder(/**
      * New value for property `placeholder`
      */
    sPlaceholder: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSearchProvider searchProvider}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSearchProvider(
      /**
      * The searchProvider to set
      */
    oSearchProvider: typings.openui5.sapUiCoreSearchSearchProviderMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowExternalButton showExternalButton}.
      *
      * Defines whether an additional search button shall be displayed
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowExternalButton(): this.type = js.native
    def setShowExternalButton(/**
      * New value for property `showExternalButton`
      */
    bShowExternalButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowListExpander showListExpander}.
      *
      * Defines whether the list expander shall be displayed in the case of an enabled list for suggestions.
      * This feature is deactivated on mobile devices.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowListExpander(): this.type = js.native
    def setShowListExpander(/**
      * New value for property `showListExpander`
      */
    bShowListExpander: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStartSuggestion startSuggestion}.
      *
      * Minimum length of the entered string triggering the suggestion list.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `3`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStartSuggestion(): this.type = js.native
    def setStartSuggestion(/**
      * New value for property `startSuggestion`
      */
    iStartSuggestion: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTextAlign textAlign}.
      *
      * Sets the horizontal alignment of the text
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Begin`.
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
      * Text that shall be displayed within the search field
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    sValue: String): this.type = js.native
    
    /**
      * @SINCE 1.32
      *
      * Sets a new value for property {@link #getValueState valueState}.
      *
      * Visualizes warnings or errors related to the input field. Possible values: Warning, Error, Success, None.
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
      * Sets a new value for property {@link #getVisibleItemCount visibleItemCount}.
      *
      * Defines the number of items in the suggestion list that shall be displayed at once. If the overall number
      * of list items is higher than the setting, a scroll bar is provided.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `20`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleItemCount(): this.type = js.native
    def setVisibleItemCount(/**
      * New value for property `visibleItemCount`
      */
    iVisibleItemCount: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Control width in CSS-size
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
      * Callback function used to provide the suggest values in the handler of the suggest event (only in list
      * suggestion mode)
      */
    def suggest(
      /**
      * The value which was provided in the corresponding suggest event (parameter 'value')
      */
    sSSuggestValue: String,
      /**
      * The list of suggestions belonging to the suggest value
      */
    aASuggestions: js.Array[String]
    ): Unit = js.native
  }
  
  trait SearchFieldSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / IDs which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / IDs which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Non-editable controls have different colors, depending on custom settings
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.10.3
      *
      * When list suggestion is enabled all suggestions are cached and no suggest event is fired.
      */
    var enableCache: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the clear functionality shall be active
      */
    var enableClear: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the search event should also be fired when the SearchField is empty (like a Filter field)
      * and when the clear button (if activated) is pressed.
      */
    var enableFilterMode: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether a pop up list shall be provided for suggestions
      */
    var enableListSuggest: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Disabled fields have different colors, and they can not be focused.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Maximum number of history items in the suggestion list. 0 displays and stores no history. The history
      * is locally stored on the client. Therefore do not activate this feature when this control handles confidential
      * data.
      */
    var maxHistoryItems: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Maximum number of characters. Value '0' means the feature is switched off.
      */
    var maxLength: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Maximum number of suggestion items in the suggestion list.
      */
    var maxSuggestionItems: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.32
      *
      * Placeholder for the input field.
      */
    var placeholder: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event which is fired when the user triggers a search
      */
    var search: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Search provider instance which handles the suggestions for this SearchField (e.g. Open Search Protocol).
      */
    var searchProvider: js.UndefOr[typings.openui5.sapUiCoreSearchSearchProviderMod.default] = js.undefined
    
    /**
      * Defines whether an additional search button shall be displayed
      */
    var showExternalButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the list expander shall be displayed in the case of an enabled list for suggestions.
      * This feature is deactivated on mobile devices.
      */
    var showListExpander: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Minimum length of the entered string triggering the suggestion list.
      */
    var startSuggestion: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Event which is fired when new suggest values are required.
      */
    var suggest: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Sets the horizontal alignment of the text
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Text that shall be displayed within the search field
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.32
      *
      * Visualizes warnings or errors related to the input field. Possible values: Warning, Error, Success, None.
      */
    var valueState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the number of items in the suggestion list that shall be displayed at once. If the overall number
      * of list items is higher than the setting, a scroll bar is provided.
      */
    var visibleItemCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Control width in CSS-size
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
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEnableCache(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableCache", value.asInstanceOf[js.Any])
      
      inline def setEnableCacheUndefined: Self = StObject.set(x, "enableCache", js.undefined)
      
      inline def setEnableClear(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableClear", value.asInstanceOf[js.Any])
      
      inline def setEnableClearUndefined: Self = StObject.set(x, "enableClear", js.undefined)
      
      inline def setEnableFilterMode(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableFilterMode", value.asInstanceOf[js.Any])
      
      inline def setEnableFilterModeUndefined: Self = StObject.set(x, "enableFilterMode", js.undefined)
      
      inline def setEnableListSuggest(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableListSuggest", value.asInstanceOf[js.Any])
      
      inline def setEnableListSuggestUndefined: Self = StObject.set(x, "enableListSuggest", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setMaxHistoryItems(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxHistoryItems", value.asInstanceOf[js.Any])
      
      inline def setMaxHistoryItemsUndefined: Self = StObject.set(x, "maxHistoryItems", js.undefined)
      
      inline def setMaxLength(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxSuggestionItems(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxSuggestionItems", value.asInstanceOf[js.Any])
      
      inline def setMaxSuggestionItemsUndefined: Self = StObject.set(x, "maxSuggestionItems", js.undefined)
      
      inline def setPlaceholder(value: String | PropertyBindingInfo): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSearch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchProvider(value: typings.openui5.sapUiCoreSearchSearchProviderMod.default): Self = StObject.set(x, "searchProvider", value.asInstanceOf[js.Any])
      
      inline def setSearchProviderUndefined: Self = StObject.set(x, "searchProvider", js.undefined)
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setShowExternalButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showExternalButton", value.asInstanceOf[js.Any])
      
      inline def setShowExternalButtonUndefined: Self = StObject.set(x, "showExternalButton", js.undefined)
      
      inline def setShowListExpander(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showListExpander", value.asInstanceOf[js.Any])
      
      inline def setShowListExpanderUndefined: Self = StObject.set(x, "showListExpander", js.undefined)
      
      inline def setStartSuggestion(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "startSuggestion", value.asInstanceOf[js.Any])
      
      inline def setStartSuggestionUndefined: Self = StObject.set(x, "startSuggestion", js.undefined)
      
      inline def setSuggest(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "suggest", js.Any.fromFunction1(value))
      
      inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
      
      inline def setTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
      
      inline def setValueStateUndefined: Self = StObject.set(x, "valueState", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVisibleItemCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleItemCount", value.asInstanceOf[js.Any])
      
      inline def setVisibleItemCountUndefined: Self = StObject.set(x, "visibleItemCount", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
