package typings.openui5

import typings.openui5.anon.Collapse
import typings.openui5.anon.PreviousKey
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFLibraryMod.IDynamicPageStickyContent
import typings.openui5.sapMLibraryMod.BackgroundDesign
import typings.openui5.sapMLibraryMod.IconTab
import typings.openui5.sapMLibraryMod.IconTabDensityMode
import typings.openui5.sapMLibraryMod.IconTabHeaderMode
import typings.openui5.sapMLibraryMod.ObjectHeaderContainer
import typings.openui5.sapMLibraryMod.TabsOverflowMode
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMIconTabBarMod {
  
  @JSImport("sap/m/IconTabBar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new IconTabBar.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/icontabbar/ Icon Tab Bar}
    */
  open class default () extends IconTabBar {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: IconTabBarSettings) = this()
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
    mSettings: IconTabBarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: IconTabBarSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_f_IDynamicPageStickyContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_m_ObjectHeaderContainer: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/IconTabBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.IconTabBar with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, IconTabBar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, IconTabBar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.IconTabBar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait IconTabBar
    extends typings.openui5.sapUiCoreControlMod.default
       with ObjectHeaderContainer
       with IDynamicPageStickyContent {
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
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
      * @SINCE 1.15.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:expand expand} event of this `sap.m.IconTabBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.IconTabBar` itself.
      *
      * Indicates that the tab will expand or collapse.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachExpand(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachExpand(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.IconTabBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.15.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:expand expand} event of this `sap.m.IconTabBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.IconTabBar` itself.
      *
      * Indicates that the tab will expand or collapse.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachExpand(
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
    def attachExpand(
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
      * Context object to call the event handler with. Defaults to this `sap.m.IconTabBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.m.IconTabBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.IconTabBar` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.m.IconTabBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.m.IconTabBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.IconTabBar` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.m.IconTabBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * @SINCE 1.15.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:expand expand} event of this `sap.m.IconTabBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachExpand(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachExpand(
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
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.m.IconTabBar`.
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
      * @SINCE 1.15.0
      *
      * Fires event {@link #event:expand expand} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireExpand(): this.type = js.native
    def fireExpand(/**
      * Parameters to pass along with the event
      */
    mParameters: Collapse): this.type = js.native
    
    /**
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: PreviousKey): this.type = js.native
    
    /**
      * @SINCE 1.26
      *
      * Gets current value of property {@link #getApplyContentPadding applyContentPadding}.
      *
      * Determines whether the IconTabBar content fits to the full area. The paddings are removed if it's set
      * to false.
      *
      * Default value is `true`.
      *
      * @returns Value of property `applyContentPadding`
      */
    def getApplyContentPadding(): Boolean = js.native
    
    /**
      * @SINCE 1.78
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
      * @SINCE 1.26
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Specifies the background color of the IconTabBar.
      *
      * Depending on the theme, you can change the state of the background color to "Solid", "Translucent", or
      * "Transparent". Default is "Solid".
      *
      * Default value is `Solid`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Represents the contents displayed below the IconTabBar. If there are multiple contents, they are rendered
      * after each other. The developer has to manage to display the right one or use the content aggregation
      * inside the IconTabFilter (which will be displayed instead if it is set).
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
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
      * @SINCE 1.15.0
      *
      * Gets current value of property {@link #getExpandable expandable}.
      *
      * Defines if the tabs are collapsible and expandable.
      *
      * Default value is `true`.
      *
      * @returns Value of property `expandable`
      */
    def getExpandable(): Boolean = js.native
    
    /**
      * @SINCE 1.15.0
      *
      * Gets current value of property {@link #getExpanded expanded}.
      *
      * Indicates if the actual tab content is expanded or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `expanded`
      */
    def getExpanded(): Boolean = js.native
    
    /**
      * @SINCE 1.44
      *
      * Gets current value of property {@link #getHeaderBackgroundDesign headerBackgroundDesign}.
      *
      * Specifies the background color of the header.
      *
      * Depending on the theme, you can change the state of the background color to "Solid", "Translucent", or
      * "Transparent". **Note:** In SAP Belize Deep (sap_belize_plus) theme this property should be set to "Solid".
      *
      * Default value is `Solid`.
      *
      * @returns Value of property `headerBackgroundDesign`
      */
    def getHeaderBackgroundDesign(): BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) = js.native
    
    /**
      * @SINCE 1.40
      *
      * Gets current value of property {@link #getHeaderMode headerMode}.
      *
      * Specifies the header mode.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `headerMode`
      */
    def getHeaderMode(): IconTabHeaderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabHeaderMode * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The items displayed in the IconTabBar.
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
      * Reflector for the internal header's selectedKey property.
      *
      * @returns The current property value.
      */
    def getSelectedKey(): String = js.native
    
    /**
      * @SINCE 1.42
      * @deprecated (since 1.77)
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
      * Defines whether the current selection should be visualized.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSelection`
      */
    def getShowSelection(): Boolean = js.native
    
    /**
      * @SINCE 1.26
      *
      * Gets current value of property {@link #getStretchContentHeight stretchContentHeight}.
      *
      * Determines whether the IconTabBar height is stretched to the maximum possible height of its parent container.
      * As a prerequisite, the height of the parent container must be defined as a fixed value.
      *
      * Default value is `false`.
      *
      * @returns Value of property `stretchContentHeight`
      */
    def getStretchContentHeight(): Boolean = js.native
    
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
      * two overflow tabs on both ends of the bar.
      *
      * Default value is `End`.
      *
      * @returns Value of property `tabsOverflowMode`
      */
    def getTabsOverflowMode(): TabsOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabsOverflowMode * / any */ String) = js.native
    
    /**
      * @SINCE 1.22
      *
      * Gets current value of property {@link #getUpperCase upperCase}.
      *
      * Determines whether the text of the icon tab filter (not the count) is displayed in uppercase.
      *
      * Default value is `false`.
      *
      * @returns Value of property `upperCase`
      */
    def getUpperCase(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
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
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
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
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[IconTab] = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
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
      * @SINCE 1.26
      *
      * Sets a new value for property {@link #getApplyContentPadding applyContentPadding}.
      *
      * Determines whether the IconTabBar content fits to the full area. The paddings are removed if it's set
      * to false.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setApplyContentPadding(): this.type = js.native
    def setApplyContentPadding(/**
      * New value for property `applyContentPadding`
      */
    bApplyContentPadding: Boolean): this.type = js.native
    
    /**
      * Sets the ariaTexts property.
      *
      * @returns this Reference to this in order to allow method chaining
      */
    def setAriaTexts(/**
      * New value for ariaTexts.
      */
    oAriaTexts: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.26
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Specifies the background color of the IconTabBar.
      *
      * Depending on the theme, you can change the state of the background color to "Solid", "Translucent", or
      * "Transparent". Default is "Solid".
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
      * Sets the enableTabReordering property.
      *
      * @returns this IconTabBar reference for chaining.
      */
    def setEnableTabReordering(/**
      * New value for enableTabReordering.
      */
    value: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.15.0
      *
      * Sets a new value for property {@link #getExpandable expandable}.
      *
      * Defines if the tabs are collapsible and expandable.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpandable(): this.type = js.native
    def setExpandable(/**
      * New value for property `expandable`
      */
    bExpandable: Boolean): this.type = js.native
    
    /**
      * Sets the tab content as expanded.
      *
      * @returns this IconTabBar reference for chaining.
      */
    def setExpanded(/**
      * New parameter value.
      */
    bExpanded: Boolean): this.type = js.native
    
    def setHeaderBackgroundDesign(
      /**
      * New parameter value.
      */
    headerBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String
    ): this.type = js.native
    /**
      * Sets the header background design.
      *
      * @returns this IconTabBar reference for chaining.
      */
    def setHeaderBackgroundDesign(/**
      * New parameter value.
      */
    headerBackgroundDesign: BackgroundDesign): this.type = js.native
    
    def setHeaderMode(
      /**
      * New parameter value.
      */
    mode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabHeaderMode * / any */ String
    ): this.type = js.native
    /**
      * Sets the header mode.
      *
      * @returns this IconTabBar reference for chaining.
      */
    def setHeaderMode(/**
      * New parameter value.
      */
    mode: IconTabHeaderMode): this.type = js.native
    
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
      * Reflector for the internal header's selectedKey property.
      *
      * @returns this Pointer for chaining.
      */
    def setSelectedKey(/**
      * The new value.
      */
    sValue: String): this.type = js.native
    
    /**
      * @SINCE 1.42
      * @deprecated (since 1.77)
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
      * Reflector for the internal header's showSelection property.
      *
      * @returns this IconTabBar reference for chaining.
      */
    def setShowSelection(/**
      * the new value.
      */
    bValue: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.26
      *
      * Sets a new value for property {@link #getStretchContentHeight stretchContentHeight}.
      *
      * Determines whether the IconTabBar height is stretched to the maximum possible height of its parent container.
      * As a prerequisite, the height of the parent container must be defined as a fixed value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStretchContentHeight(): this.type = js.native
    def setStretchContentHeight(/**
      * New value for property `stretchContentHeight`
      */
    bStretchContentHeight: Boolean): this.type = js.native
    
    def setTabDensityMode(
      /**
      * New parameter value.
      */
    mode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabHeaderMode * / any */ String
    ): this.type = js.native
    /**
      * Sets the tab density mode.
      *
      * @returns this IconTabBar reference for chaining.
      */
    def setTabDensityMode(/**
      * New parameter value.
      */
    mode: IconTabHeaderMode): this.type = js.native
    
    /**
      * @SINCE 1.90
      *
      * Sets a new value for property {@link #getTabsOverflowMode tabsOverflowMode}.
      *
      * Specifies the overflow mode of the header.
      *
      * The default `End` mode shows as many tabs that can fit on the screen, then shows one overflow at the
      * end containing the remaining items. The `StartAndEnd` is used to keep the order of tabs intact and offers
      * two overflow tabs on both ends of the bar.
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
      * @SINCE 1.22
      *
      * Sets a new value for property {@link #getUpperCase upperCase}.
      *
      * Determines whether the text of the icon tab filter (not the count) is displayed in uppercase.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUpperCase(): this.type = js.native
    def setUpperCase(/**
      * New value for property `upperCase`
      */
    bUpperCase: Boolean): this.type = js.native
  }
  
  trait IconTabBarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.26
      *
      * Determines whether the IconTabBar content fits to the full area. The paddings are removed if it's set
      * to false.
      */
    var applyContentPadding: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.78
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
      * @SINCE 1.26
      *
      * Specifies the background color of the IconTabBar.
      *
      * Depending on the theme, you can change the state of the background color to "Solid", "Translucent", or
      * "Transparent". Default is "Solid".
      */
    var backgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Represents the contents displayed below the IconTabBar. If there are multiple contents, they are rendered
      * after each other. The developer has to manage to display the right one or use the content aggregation
      * inside the IconTabFilter (which will be displayed instead if it is set).
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
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
      * @SINCE 1.15.0
      *
      * Indicates that the tab will expand or collapse.
      */
    var expand: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.15.0
      *
      * Defines if the tabs are collapsible and expandable.
      */
    var expandable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.15.0
      *
      * Indicates if the actual tab content is expanded or not.
      */
    var expanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.44
      *
      * Specifies the background color of the header.
      *
      * Depending on the theme, you can change the state of the background color to "Solid", "Translucent", or
      * "Transparent". **Note:** In SAP Belize Deep (sap_belize_plus) theme this property should be set to "Solid".
      */
    var headerBackgroundDesign: js.UndefOr[
        BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.40
      *
      * Specifies the header mode.
      */
    var headerMode: js.UndefOr[
        IconTabHeaderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabHeaderMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The items displayed in the IconTabBar.
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
      * Fires when an item is selected.
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.15.0
      *
      * Key of the selected tab item.
      *
      * If the key has no corresponding aggregated item, no changes will apply. If duplicate keys exists the
      * first item matching the key is used.
      */
    var selectedKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.42
      * @deprecated (since 1.77)
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
      * Defines whether the current selection should be visualized.
      */
    var showSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.26
      *
      * Determines whether the IconTabBar height is stretched to the maximum possible height of its parent container.
      * As a prerequisite, the height of the parent container must be defined as a fixed value.
      */
    var stretchContentHeight: js.UndefOr[
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
      * two overflow tabs on both ends of the bar.
      */
    var tabsOverflowMode: js.UndefOr[
        TabsOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabsOverflowMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.22
      *
      * Determines whether the text of the icon tab filter (not the count) is displayed in uppercase.
      */
    var upperCase: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object IconTabBarSettings {
    
    inline def apply(): IconTabBarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconTabBarSettings]
    }
    
    extension [Self <: IconTabBarSettings](x: Self) {
      
      inline def setApplyContentPadding(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "applyContentPadding", value.asInstanceOf[js.Any])
      
      inline def setApplyContentPaddingUndefined: Self = StObject.set(x, "applyContentPadding", js.undefined)
      
      inline def setAriaTexts(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "ariaTexts", value.asInstanceOf[js.Any])
      
      inline def setAriaTextsUndefined: Self = StObject.set(x, "ariaTexts", js.undefined)
      
      inline def setBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setEnableTabReordering(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableTabReordering", value.asInstanceOf[js.Any])
      
      inline def setEnableTabReorderingUndefined: Self = StObject.set(x, "enableTabReordering", js.undefined)
      
      inline def setExpand(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setExpandable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHeaderBackgroundDesign(
        value: BackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerBackgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setHeaderBackgroundDesignUndefined: Self = StObject.set(x, "headerBackgroundDesign", js.undefined)
      
      inline def setHeaderMode(
        value: IconTabHeaderMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabHeaderMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
      
      inline def setHeaderModeUndefined: Self = StObject.set(x, "headerMode", js.undefined)
      
      inline def setItems(
        value: js.Array[IconTab] | IconTab | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: IconTab*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxNestingLevel(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxNestingLevel", value.asInstanceOf[js.Any])
      
      inline def setMaxNestingLevelUndefined: Self = StObject.set(x, "maxNestingLevel", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setShowOverflowSelectList(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showOverflowSelectList", value.asInstanceOf[js.Any])
      
      inline def setShowOverflowSelectListUndefined: Self = StObject.set(x, "showOverflowSelectList", js.undefined)
      
      inline def setShowSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSelection", value.asInstanceOf[js.Any])
      
      inline def setShowSelectionUndefined: Self = StObject.set(x, "showSelection", js.undefined)
      
      inline def setStretchContentHeight(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "stretchContentHeight", value.asInstanceOf[js.Any])
      
      inline def setStretchContentHeightUndefined: Self = StObject.set(x, "stretchContentHeight", js.undefined)
      
      inline def setTabDensityMode(
        value: IconTabDensityMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabDensityMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "tabDensityMode", value.asInstanceOf[js.Any])
      
      inline def setTabDensityModeUndefined: Self = StObject.set(x, "tabDensityMode", js.undefined)
      
      inline def setTabsOverflowMode(
        value: TabsOverflowMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TabsOverflowMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "tabsOverflowMode", value.asInstanceOf[js.Any])
      
      inline def setTabsOverflowModeUndefined: Self = StObject.set(x, "tabsOverflowMode", js.undefined)
      
      inline def setUpperCase(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "upperCase", value.asInstanceOf[js.Any])
      
      inline def setUpperCaseUndefined: Self = StObject.set(x, "upperCase", js.undefined)
    }
  }
}
