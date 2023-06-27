package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcMainLibraryMod.IButton
import typings.openui5.sapUiWebcMainLibraryMod.ITab
import typings.openui5.sapUiWebcMainLibraryMod.TabLayout
import typings.openui5.sapUiWebcMainLibraryMod.TabsOverflowMode
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainTabContainerMod {
  
  @JSImport("sap/ui/webc/main/TabContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `TabContainer`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TabContainer {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TabContainerSettings) = this()
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
    mSettings: TabContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TabContainerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/TabContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.TabContainer with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, TabContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TabContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.TabContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait TabContainer
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: ITab): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tabSelect tabSelect} event of this `sap.ui.webc.main.TabContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.TabContainer` itself.
      *
      * Fired when a tab is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTabSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabContainerTabSelectEvent, Unit]
    ): this.type = js.native
    def attachTabSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabContainerTabSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.TabContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:tabSelect tabSelect} event of this `sap.ui.webc.main.TabContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.TabContainer` itself.
      *
      * Fired when a tab is selected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTabSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabContainerTabSelectEvent, Unit]
    ): this.type = js.native
    def attachTabSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabContainerTabSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.TabContainer` itself
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
      * Destroys the overflowButton in the aggregation {@link #getOverflowButton overflowButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyOverflowButton(): this.type = js.native
    
    /**
      * Destroys the startOverflowButton in the aggregation {@link #getStartOverflowButton startOverflowButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyStartOverflowButton(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:tabSelect tabSelect} event of this `sap.ui.webc.main.TabContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTabSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabContainerTabSelectEvent, Unit]
    ): this.type = js.native
    def detachTabSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabContainerTabSelectEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:tabSelect tabSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTabSelect(): this.type = js.native
    def fireTabSelect(
      /**
      * Parameters to pass along with the event
      */
    mParameters: TabContainer$TabSelectEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getCollapsed collapsed}.
      *
      * Defines whether the tab content is collapsed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `collapsed`
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFixed fixed}.
      *
      * Defines whether the tabs are in a fixed state that is not expandable/collapsible by user interaction.
      *
      * Default value is `false`.
      *
      * @returns Value of property `fixed`
      */
    def getFixed(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the tabs.
      *
      *  **Note:** Use `sap.ui.webc.main.Tab` and `sap.ui.webc.main.TabSeparator` for the intended design.
      */
    def getItems(): js.Array[ITab] = js.native
    
    /**
      * Gets content of aggregation {@link #getOverflowButton overflowButton}.
      *
      * Defines the button which will open the overflow menu. If nothing is provided to this slot, the default
      * button will be used.
      */
    def getOverflowButton(): IButton = js.native
    
    /**
      * Gets current value of property {@link #getShowOverflow showOverflow}.
      *
      * Defines whether the overflow select list is displayed.
      *
      *  The overflow select list represents a list, where all tabs are displayed so that it's easier for the
      * user to select a specific tab.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showOverflow`
      */
    def getShowOverflow(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getStartOverflowButton startOverflowButton}.
      *
      * Defines the button which will open the start overflow menu if available. If nothing is provided to this
      * slot, the default button will be used.
      */
    def getStartOverflowButton(): IButton = js.native
    
    /**
      * Gets current value of property {@link #getTabLayout tabLayout}.
      *
      * Defines the alignment of the content and the `additionalText` of a tab.
      *
      *
      *
      *  **Note:** The content and the `additionalText` would be displayed vertically by defualt, but when set
      * to `Inline`, they would be displayed horizontally.
      *
      *
      *
      *  Available options are:
      * 	 - `Standard`
      * 	 - `Inline`
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `tabLayout`
      */
    def getTabLayout(): TabLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabLayout * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTabsOverflowMode tabsOverflowMode}.
      *
      * Defines the overflow mode of the tab strip. If you have a large number of tabs, only the tabs that can
      * fit on screen will be visible. All other tabs that can 't fit on the screen are available in an overflow
      * tab "More".
      *
      *
      *
      *  **Note:** Only one overflow at the end would be displayed by default, but when set to `StartAndEnd`,
      * there will be two overflows on both ends, and tab order will not change on tab selection.
      *
      *
      *
      *  Available options are:
      * 	 - `End`
      * 	 - `StartAndEnd`
      *
      * Default value is `End`.
      *
      * @returns Value of property `tabsOverflowMode`
      */
    def getTabsOverflowMode(): TabsOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabsOverflowMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.ITab` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: ITab): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: ITab,
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
    def removeAllItems(): js.Array[ITab] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): ITab | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): ITab | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: ITab): ITab | Null = js.native
    
    /**
      * Sets a new value for property {@link #getCollapsed collapsed}.
      *
      * Defines whether the tab content is collapsed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCollapsed(): this.type = js.native
    def setCollapsed(/**
      * New value for property `collapsed`
      */
    bCollapsed: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFixed fixed}.
      *
      * Defines whether the tabs are in a fixed state that is not expandable/collapsible by user interaction.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFixed(): this.type = js.native
    def setFixed(/**
      * New value for property `fixed`
      */
    bFixed: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the control
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
      * Sets the aggregated {@link #getOverflowButton overflowButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOverflowButton(/**
      * The overflowButton to set
      */
    oOverflowButton: IButton): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowOverflow showOverflow}.
      *
      * Defines whether the overflow select list is displayed.
      *
      *  The overflow select list represents a list, where all tabs are displayed so that it's easier for the
      * user to select a specific tab.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowOverflow(): this.type = js.native
    def setShowOverflow(/**
      * New value for property `showOverflow`
      */
    bShowOverflow: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getStartOverflowButton startOverflowButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStartOverflowButton(/**
      * The startOverflowButton to set
      */
    oStartOverflowButton: IButton): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTabLayout tabLayout}.
      *
      * Defines the alignment of the content and the `additionalText` of a tab.
      *
      *
      *
      *  **Note:** The content and the `additionalText` would be displayed vertically by defualt, but when set
      * to `Inline`, they would be displayed horizontally.
      *
      *
      *
      *  Available options are:
      * 	 - `Standard`
      * 	 - `Inline`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTabLayout(): this.type = js.native
    def setTabLayout(
      /**
      * New value for property `tabLayout`
      */
    sTabLayout: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabLayout * / any */ String
    ): this.type = js.native
    def setTabLayout(/**
      * New value for property `tabLayout`
      */
    sTabLayout: TabLayout): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTabsOverflowMode tabsOverflowMode}.
      *
      * Defines the overflow mode of the tab strip. If you have a large number of tabs, only the tabs that can
      * fit on screen will be visible. All other tabs that can 't fit on the screen are available in an overflow
      * tab "More".
      *
      *
      *
      *  **Note:** Only one overflow at the end would be displayed by default, but when set to `StartAndEnd`,
      * there will be two overflows on both ends, and tab order will not change on tab selection.
      *
      *
      *
      *  Available options are:
      * 	 - `End`
      * 	 - `StartAndEnd`
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
  
  trait TabContainer$TabSelectEventParameters extends StObject {
    
    /**
      * The selected `tab`.
      */
    var tab: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * The selected `tab` index.
      */
    var tabIndex: js.UndefOr[int] = js.undefined
  }
  object TabContainer$TabSelectEventParameters {
    
    inline def apply(): TabContainer$TabSelectEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabContainer$TabSelectEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabContainer$TabSelectEventParameters] (val x: Self) extends AnyVal {
      
      inline def setTab(value: HTMLElement): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: int): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    }
  }
  
  trait TabContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines whether the tab content is collapsed.
      */
    var collapsed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the tabs are in a fixed state that is not expandable/collapsible by user interaction.
      */
    var fixed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the tabs.
      *
      *  **Note:** Use `sap.ui.webc.main.Tab` and `sap.ui.webc.main.TabSeparator` for the intended design.
      */
    var items: js.UndefOr[
        js.Array[ITab] | ITab | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the button which will open the overflow menu. If nothing is provided to this slot, the default
      * button will be used.
      */
    var overflowButton: js.UndefOr[IButton] = js.undefined
    
    /**
      * Defines whether the overflow select list is displayed.
      *
      *  The overflow select list represents a list, where all tabs are displayed so that it's easier for the
      * user to select a specific tab.
      */
    var showOverflow: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the button which will open the start overflow menu if available. If nothing is provided to this
      * slot, the default button will be used.
      */
    var startOverflowButton: js.UndefOr[IButton] = js.undefined
    
    /**
      * Defines the alignment of the content and the `additionalText` of a tab.
      *
      *
      *
      *  **Note:** The content and the `additionalText` would be displayed vertically by defualt, but when set
      * to `Inline`, they would be displayed horizontally.
      *
      *
      *
      *  Available options are:
      * 	 - `Standard`
      * 	 - `Inline`
      */
    var tabLayout: js.UndefOr[
        TabLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabLayout * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fired when a tab is selected.
      */
    var tabSelect: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[TabContainer$TabSelectEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the overflow mode of the tab strip. If you have a large number of tabs, only the tabs that can
      * fit on screen will be visible. All other tabs that can 't fit on the screen are available in an overflow
      * tab "More".
      *
      *
      *
      *  **Note:** Only one overflow at the end would be displayed by default, but when set to `StartAndEnd`,
      * there will be two overflows on both ends, and tab order will not change on tab selection.
      *
      *
      *
      *  Available options are:
      * 	 - `End`
      * 	 - `StartAndEnd`
      */
    var tabsOverflowMode: js.UndefOr[
        TabsOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabsOverflowMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TabContainerSettings {
    
    inline def apply(): TabContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabContainerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabContainerSettings] (val x: Self) extends AnyVal {
      
      inline def setCollapsed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setFixed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setItems(
        value: js.Array[ITab] | ITab | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: ITab*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOverflowButton(value: IButton): Self = StObject.set(x, "overflowButton", value.asInstanceOf[js.Any])
      
      inline def setOverflowButtonUndefined: Self = StObject.set(x, "overflowButton", js.undefined)
      
      inline def setShowOverflow(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showOverflow", value.asInstanceOf[js.Any])
      
      inline def setShowOverflowUndefined: Self = StObject.set(x, "showOverflow", js.undefined)
      
      inline def setStartOverflowButton(value: IButton): Self = StObject.set(x, "startOverflowButton", value.asInstanceOf[js.Any])
      
      inline def setStartOverflowButtonUndefined: Self = StObject.set(x, "startOverflowButton", js.undefined)
      
      inline def setTabLayout(
        value: TabLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabLayout * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "tabLayout", value.asInstanceOf[js.Any])
      
      inline def setTabLayoutUndefined: Self = StObject.set(x, "tabLayout", js.undefined)
      
      inline def setTabSelect(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[TabContainer$TabSelectEventParameters] => Unit
      ): Self = StObject.set(x, "tabSelect", js.Any.fromFunction1(value))
      
      inline def setTabSelectUndefined: Self = StObject.set(x, "tabSelect", js.undefined)
      
      inline def setTabsOverflowMode(
        value: TabsOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabsOverflowMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "tabsOverflowMode", value.asInstanceOf[js.Any])
      
      inline def setTabsOverflowModeUndefined: Self = StObject.set(x, "tabsOverflowMode", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type TabContainerTabSelectEvent = typings.openui5.sapUiBaseEventMod.default[TabContainer$TabSelectEventParameters]
  
  type TabContainerTabSelectEventParameters = TabContainer$TabSelectEventParameters
}
