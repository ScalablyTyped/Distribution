package typings.openui5

import typings.openui5.anon.KeyPreviousKey
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapMLibraryMod.IconTab
import typings.openui5.sapMLibraryMod.IconTabDensityMode
import typings.openui5.sapMLibraryMod.IconTabHeaderMode
import typings.openui5.sapMLibraryMod.TabsOverflowMode
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMIconTabHeaderMod {
  
  @JSImport("sap/m/IconTabHeader", JSImport.Default)
  @js.native
  /**
    * Constructor for a new IconTabHeader.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends IconTabHeader {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: IconTabHeaderSettings) = this()
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
    mSettings: IconTabHeaderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: IconTabHeaderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/IconTabHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.IconTabHeader with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, IconTabHeader]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, IconTabHeader],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.IconTabHeader.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait IconTabHeader
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: IconTab): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.m.IconTabHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.IconTabHeader` itself.
      *
      * Fires when an item is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.IconTabHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.m.IconTabHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.IconTabHeader` itself.
      *
      * Fires when an item is selected.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.IconTabHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.m.IconTabHeader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelect(
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
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: KeyPreviousKey): this.type = js.native
    
    /**
      * @SINCE 1.80
      *
      * Gets current value of property {@link #getAriaTexts ariaTexts}.
      *
      * Specifies optional texts for the screen reader.
      *
      * The given object can contain the following keys: `headerLabel` - text to serve as a label for the header,
      * `headerDescription` - text to serve as a description for the header.
      *
      * @returns Value of property `ariaTexts`
      */
    def getAriaTexts(): js.Object = js.native
    
    /**
      * @SINCE 1.44
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Specifies the background color of the header.
      *
      * Depending on the theme, you can change the state of the background color to "Solid", "Translucent", or
      * "Transparent". **Note:** In SAP Belize Deep (sap_belize_plus) theme this property should be set to "Solid".
      *
      * Default value is `Solid`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * @SINCE 1.46
      *
      * Gets current value of property {@link #getEnableTabReordering enableTabReordering}.
      *
      * Specifies whether tab reordering is enabled. Relevant only for desktop devices. The {@link sap.m.IconTabSeparator
      * sap.m.IconTabSeparator} cannot be dragged and dropped Items can be moved around {@link sap.m.IconTabSeparator
      * sap.m.IconTabSeparator} Reordering is enabled via keyboard using `Ctrl` + arrow keys (Windows) and `Control`
      * + arrow keys (Mac OS)
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableTabReordering`
      */
    def getEnableTabReordering(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The items displayed in the IconTabHeader.
      */
    def getItems(): js.Array[IconTab] = js.native
    
    /**
      * @SINCE 1.79
      *
      * Gets current value of property {@link #getMaxNestingLevel maxNestingLevel}.
      *
      * Specifies the allowed level of tabs nesting within one another using drag and drop. Default value is
      * 0 which means nesting via interaction is not allowed. Maximum value is 100. This property allows nesting
      * via user interaction only, and does not restrict adding items to the `items` aggregation of {@link sap.m.IconTabFilter
      * sap.m.IconTabFilter}.
      *
      * Default value is `0`.
      *
      * @returns Value of property `maxNestingLevel`
      */
    def getMaxNestingLevel(): int = js.native
    
    /**
      * @SINCE 1.40
      *
      * Gets current value of property {@link #getMode mode}.
      *
      * Specifies the header mode.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): IconTabHeaderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabHeaderMode * / any */ String) = js.native
    
    /**
      * @SINCE 1.15.0
      *
      * Gets current value of property {@link #getSelectedKey selectedKey}.
      *
      * Key of the selected item.
      *
      * If the key has no corresponding aggregated item, no changes will apply. If duplicate keys exists the
      * first item matching, the key is used.
      *
      * @returns Value of property `selectedKey`
      */
    def getSelectedKey(): String = js.native
    
    /**
      * @deprecated (since 1.75)
      *
      * Gets current value of property {@link #getShowOverflowSelectList showOverflowSelectList}.
      *
      * Specifies if the overflow select list is displayed.
      *
      * The overflow select list represents a list, where all tab filters are displayed, so the user can select
      * specific tab filter easier.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showOverflowSelectList`
      */
    def getShowOverflowSelectList(): Boolean = js.native
    
    /**
      * @deprecated (since 1.15.0) - Regarding to changes of this control this property is not needed anymore.
      *
      * Gets current value of property {@link #getShowSelection showSelection}.
      *
      * Defines whether the current selection is visualized.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSelection`
      */
    def getShowSelection(): Boolean = js.native
    
    /**
      * @SINCE 1.56
      *
      * Gets current value of property {@link #getTabDensityMode tabDensityMode}.
      *
      * Specifies the visual density mode of the tabs.
      *
      * The values that can be applied are `Cozy`, `Compact` and `Inherit`. `Cozy` and `Compact` render the control
      * in one of these modes independent of the global density settings. The `Inherit` value follows the global
      * density settings which are applied. For compatibility reasons, the default value is `Cozy`.
      *
      * Default value is `Cozy`.
      *
      * @returns Value of property `tabDensityMode`
      */
    def getTabDensityMode(): IconTabDensityMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabDensityMode * / any */ String) = js.native
    
    /**
      * @SINCE 1.90
      *
      * Gets current value of property {@link #getTabsOverflowMode tabsOverflowMode}.
      *
      * Specifies the overflow mode of the header.
      *
      * The default `End` mode shows as many tabs that can fit on the screen, then shows one overflow at the
      * end containing the remaining items. The `StartAndEnd` is used to keep the order of tabs intact and offers
      * overflow tabs on both ends of the bar.
      *
      * Default value is `End`.
      *
      * @returns Value of property `tabsOverflowMode`
      */
    def getTabsOverflowMode(): TabsOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabsOverflowMode * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.m.IconTab` in the aggregation {@link #getItems items}. and returns its index
      * if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: IconTab): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: IconTab,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[IconTab] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): IconTab | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): IconTab | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: IconTab): IconTab | Null = js.native
    
    /**
      * @SINCE 1.80
      *
      * Sets a new value for property {@link #getAriaTexts ariaTexts}.
      *
      * Specifies optional texts for the screen reader.
      *
      * The given object can contain the following keys: `headerLabel` - text to serve as a label for the header,
      * `headerDescription` - text to serve as a description for the header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaTexts(): this.type = js.native
    def setAriaTexts(/**
      * New value for property `ariaTexts`
      */
    oAriaTexts: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.44
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Specifies the background color of the header.
      *
      * Depending on the theme, you can change the state of the background color to "Solid", "Translucent", or
      * "Transparent". **Note:** In SAP Belize Deep (sap_belize_plus) theme this property should be set to "Solid".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Solid`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(): this.type = js.native
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: BackgroundDesign): this.type = js.native
    
    /**
      * @SINCE 1.46
      *
      * Sets a new value for property {@link #getEnableTabReordering enableTabReordering}.
      *
      * Specifies whether tab reordering is enabled. Relevant only for desktop devices. The {@link sap.m.IconTabSeparator
      * sap.m.IconTabSeparator} cannot be dragged and dropped Items can be moved around {@link sap.m.IconTabSeparator
      * sap.m.IconTabSeparator} Reordering is enabled via keyboard using `Ctrl` + arrow keys (Windows) and `Control`
      * + arrow keys (Mac OS)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableTabReordering(): this.type = js.native
    def setEnableTabReordering(/**
      * New value for property `enableTabReordering`
      */
    bEnableTabReordering: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.79
      *
      * Sets a new value for property {@link #getMaxNestingLevel maxNestingLevel}.
      *
      * Specifies the allowed level of tabs nesting within one another using drag and drop. Default value is
      * 0 which means nesting via interaction is not allowed. Maximum value is 100. This property allows nesting
      * via user interaction only, and does not restrict adding items to the `items` aggregation of {@link sap.m.IconTabFilter
      * sap.m.IconTabFilter}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxNestingLevel(): this.type = js.native
    def setMaxNestingLevel(/**
      * New value for property `maxNestingLevel`
      */
    iMaxNestingLevel: int): this.type = js.native
    
    /**
      * @SINCE 1.40
      *
      * Sets a new value for property {@link #getMode mode}.
      *
      * Specifies the header mode.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMode(): this.type = js.native
    def setMode(
      /**
      * New value for property `mode`
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabHeaderMode * / any */ String
    ): this.type = js.native
    def setMode(/**
      * New value for property `mode`
      */
    sMode: IconTabHeaderMode): this.type = js.native
    
    /**
      * Sets the selected item based on key.
      *
      * @returns this pointer for chaining
      */
    def setSelectedKey(/**
      * The key of the item to be selected
      */
    sKey: String): this.type = js.native
    
    /**
      * @deprecated (since 1.75)
      *
      * Sets a new value for property {@link #getShowOverflowSelectList showOverflowSelectList}.
      *
      * Specifies if the overflow select list is displayed.
      *
      * The overflow select list represents a list, where all tab filters are displayed, so the user can select
      * specific tab filter easier.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowOverflowSelectList(): this.type = js.native
    def setShowOverflowSelectList(/**
      * New value for property `showOverflowSelectList`
      */
    bShowOverflowSelectList: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.15.0) - Regarding to changes of this control this property is not needed anymore.
      *
      * Sets a new value for property {@link #getShowSelection showSelection}.
      *
      * Defines whether the current selection is visualized.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSelection(): this.type = js.native
    def setShowSelection(/**
      * New value for property `showSelection`
      */
    bShowSelection: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.56
      *
      * Sets a new value for property {@link #getTabDensityMode tabDensityMode}.
      *
      * Specifies the visual density mode of the tabs.
      *
      * The values that can be applied are `Cozy`, `Compact` and `Inherit`. `Cozy` and `Compact` render the control
      * in one of these modes independent of the global density settings. The `Inherit` value follows the global
      * density settings which are applied. For compatibility reasons, the default value is `Cozy`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Cozy`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTabDensityMode(): this.type = js.native
    def setTabDensityMode(
      /**
      * New value for property `tabDensityMode`
      */
    sTabDensityMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabDensityMode * / any */ String
    ): this.type = js.native
    def setTabDensityMode(/**
      * New value for property `tabDensityMode`
      */
    sTabDensityMode: IconTabDensityMode): this.type = js.native
    
    /**
      * @SINCE 1.90
      *
      * Sets a new value for property {@link #getTabsOverflowMode tabsOverflowMode}.
      *
      * Specifies the overflow mode of the header.
      *
      * The default `End` mode shows as many tabs that can fit on the screen, then shows one overflow at the
      * end containing the remaining items. The `StartAndEnd` is used to keep the order of tabs intact and offers
      * overflow tabs on both ends of the bar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `End`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTabsOverflowMode(): this.type = js.native
    def setTabsOverflowMode(
      /**
      * New value for property `tabsOverflowMode`
      */
    sTabsOverflowMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabsOverflowMode * / any */ String
    ): this.type = js.native
    def setTabsOverflowMode(/**
      * New value for property `tabsOverflowMode`
      */
    sTabsOverflowMode: TabsOverflowMode): this.type = js.native
  }
  
  trait IconTabHeaderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.80
      *
      * Specifies optional texts for the screen reader.
      *
      * The given object can contain the following keys: `headerLabel` - text to serve as a label for the header,
      * `headerDescription` - text to serve as a description for the header.
      */
    var ariaTexts: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.44
      *
      * Specifies the background color of the header.
      *
      * Depending on the theme, you can change the state of the background color to "Solid", "Translucent", or
      * "Transparent". **Note:** In SAP Belize Deep (sap_belize_plus) theme this property should be set to "Solid".
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.46
      *
      * Specifies whether tab reordering is enabled. Relevant only for desktop devices. The {@link sap.m.IconTabSeparator
      * sap.m.IconTabSeparator} cannot be dragged and dropped Items can be moved around {@link sap.m.IconTabSeparator
      * sap.m.IconTabSeparator} Reordering is enabled via keyboard using `Ctrl` + arrow keys (Windows) and `Control`
      * + arrow keys (Mac OS)
      */
    var enableTabReordering: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The items displayed in the IconTabHeader.
      */
    var items: js.UndefOr[
        js.Array[IconTab] | IconTab | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.79
      *
      * Specifies the allowed level of tabs nesting within one another using drag and drop. Default value is
      * 0 which means nesting via interaction is not allowed. Maximum value is 100. This property allows nesting
      * via user interaction only, and does not restrict adding items to the `items` aggregation of {@link sap.m.IconTabFilter
      * sap.m.IconTabFilter}.
      */
    var maxNestingLevel: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.40
      *
      * Specifies the header mode.
      */
    var mode: js.UndefOr[
        IconTabHeaderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabHeaderMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fires when an item is selected.
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.15.0
      *
      * Key of the selected item.
      *
      * If the key has no corresponding aggregated item, no changes will apply. If duplicate keys exists the
      * first item matching, the key is used.
      */
    var selectedKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.75)
      *
      * Specifies if the overflow select list is displayed.
      *
      * The overflow select list represents a list, where all tab filters are displayed, so the user can select
      * specific tab filter easier.
      */
    var showOverflowSelectList: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.15.0) - Regarding to changes of this control this property is not needed anymore.
      *
      * Defines whether the current selection is visualized.
      */
    var showSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.56
      *
      * Specifies the visual density mode of the tabs.
      *
      * The values that can be applied are `Cozy`, `Compact` and `Inherit`. `Cozy` and `Compact` render the control
      * in one of these modes independent of the global density settings. The `Inherit` value follows the global
      * density settings which are applied. For compatibility reasons, the default value is `Cozy`.
      */
    var tabDensityMode: js.UndefOr[
        IconTabDensityMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabDensityMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.90
      *
      * Specifies the overflow mode of the header.
      *
      * The default `End` mode shows as many tabs that can fit on the screen, then shows one overflow at the
      * end containing the remaining items. The `StartAndEnd` is used to keep the order of tabs intact and offers
      * overflow tabs on both ends of the bar.
      */
    var tabsOverflowMode: js.UndefOr[
        TabsOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabsOverflowMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object IconTabHeaderSettings {
    
    inline def apply(): IconTabHeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconTabHeaderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconTabHeaderSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaTexts(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "ariaTexts", value.asInstanceOf[js.Any])
      
      inline def setAriaTextsUndefined: Self = StObject.set(x, "ariaTexts", js.undefined)
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setEnableTabReordering(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableTabReordering", value.asInstanceOf[js.Any])
      
      inline def setEnableTabReorderingUndefined: Self = StObject.set(x, "enableTabReordering", js.undefined)
      
      inline def setItems(
        value: js.Array[IconTab] | IconTab | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: IconTab*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxNestingLevel(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxNestingLevel", value.asInstanceOf[js.Any])
      
      inline def setMaxNestingLevelUndefined: Self = StObject.set(x, "maxNestingLevel", js.undefined)
      
      inline def setMode(
        value: IconTabHeaderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabHeaderMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setShowOverflowSelectList(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showOverflowSelectList", value.asInstanceOf[js.Any])
      
      inline def setShowOverflowSelectListUndefined: Self = StObject.set(x, "showOverflowSelectList", js.undefined)
      
      inline def setShowSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSelection", value.asInstanceOf[js.Any])
      
      inline def setShowSelectionUndefined: Self = StObject.set(x, "showSelection", js.undefined)
      
      inline def setTabDensityMode(
        value: IconTabDensityMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabDensityMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "tabDensityMode", value.asInstanceOf[js.Any])
      
      inline def setTabDensityModeUndefined: Self = StObject.set(x, "tabDensityMode", js.undefined)
      
      inline def setTabsOverflowMode(
        value: TabsOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabsOverflowMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "tabsOverflowMode", value.asInstanceOf[js.Any])
      
      inline def setTabsOverflowModeUndefined: Self = StObject.set(x, "tabsOverflowMode", js.undefined)
    }
  }
}
