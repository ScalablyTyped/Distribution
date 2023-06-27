package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IBadge
import typings.openui5.sapMLibraryMod.IconTab
import typings.openui5.sapMLibraryMod.IconTabFilterDesign
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreItemMod.ItemSettings
import typings.openui5.sapUiCoreLibraryMod.IconColor
import typings.openui5.sapUiCoreLibraryMod.PopupInterface
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMIconTabFilterMod {
  
  @JSImport("sap/m/IconTabFilter", JSImport.Default)
  @js.native
  /**
    * Constructor for a new IconTabFilter.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends IconTabFilter {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: IconTabFilterSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: IconTabFilterSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: IconTabFilterSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IBadge: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_m_IconTab: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_PopupInterface: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/IconTabFilter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.IconTabFilter with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Item.extend}.
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
    oClassInfo: ClassInfo[T, IconTabFilter]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, IconTabFilter],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.IconTabFilter.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait IconTabFilter
    extends typings.openui5.sapUiCoreItemMod.default
       with IconTab
       with PopupInterface
       with IBadge {
    
    /**
      * @since 1.15.0
      *
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
      * @since 1.77
      *
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: IconTab): this.type = js.native
    
    /**
      * @since 1.15.0
      *
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * @since 1.77
      *
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * @since 1.15.0
      *
      * Gets content of aggregation {@link #getContent content}.
      *
      * The content displayed for this item (optional).
      *
      * If this content is set, it is displayed instead of the general content inside the IconTabBar.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getCount count}.
      *
      * Represents the "count" text, which is displayed in the tab filter.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `count`
      */
    def getCount(): String = js.native
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * Specifies whether the icon and the texts are placed vertically or horizontally.
      *
      * Default value is `Vertical`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): IconTabFilterDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabFilterDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Specifies the icon to be displayed for the tab filter.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconColor iconColor}.
      *
      * Specifies the icon color.
      *
      * If an icon font is used, the color can be chosen from the icon colors (sap.ui.core.IconColor). Possible
      * semantic colors are: Neutral, Positive, Critical, Negative. Instead of the semantic icon color the brand
      * color can be used, this is named Default. Semantic colors and brand colors should not be mixed up inside
      * one IconTabBar.
      *
      * Default value is `Default`.
      *
      * @returns Value of property `iconColor`
      */
    def getIconColor(): IconColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconColor * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getIconDensityAware iconDensityAware}.
      *
      * If set to true, it sends one or more requests, trying to get the density perfect version of the image
      * if this version of the image doesn't exist on the server. Default value is set to true.
      *
      * If bandwidth is key for the application, set this value to false.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconDensityAware`
      */
    def getIconDensityAware(): Boolean = js.native
    
    /**
      * @since 1.77
      *
      * Gets content of aggregation {@link #getItems items}.
      *
      * The sub items of this filter (optional).
      */
    def getItems(): js.Array[IconTab] = js.native
    
    /**
      * Gets current value of property {@link #getShowAll showAll}.
      *
      * Enables special visualization for disabled filter (show all items). **Note:** You can use this property
      * when you use `IconTabBar` as a filter. In order for it to be displayed correctly, the other tabs in the
      * filter should consist of an icon, text and an optional count. It can be set to true for the first tab
      * filter. You can find more detailed information in the {@link https://experience.sap.com/fiori-design-web/icontabbar/#tabs-as-filters UX Guidelines}.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showAll`
      */
    def getShowAll(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Specifies whether the tab filter is rendered.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * @since 1.15.0
      *
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
      * @since 1.77
      *
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
      * @since 1.15.0
      *
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
      * @since 1.77
      *
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
      * @since 1.15.0
      *
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * @since 1.77
      *
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
      * @since 1.15.0
      *
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
      * @since 1.77
      *
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
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Renders this item in the IconTabHeader.
      */
    def render(
      /**
      * the RenderManager that can be used for writing to the render output buffer
      */
    oRM: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * the visible index within the parent control
      */
    iVisibleIndex: int,
      /**
      * the visible items count
      */
    iVisibleItemsCount: int
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Renders this item in the IconTabSelectList.
      */
    def renderInSelectList(
      /**
      * RenderManager used for writing to the render output buffer
      */
    oRM: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * the select list in which this filter is rendered
      */
    oSelectList: /* was: sap.m.IconTabBarSelectList */ Any,
      /**
      * this item's index within the aggregation of items
      */
    iIndexInSet: int,
      /**
      * total length of the aggregation of items
      */
    iSetSize: int,
      /**
      * the padding with which the item should be indented
      */
    fPaddingValue: float
    ): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getCount count}.
      *
      * Represents the "count" text, which is displayed in the tab filter.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCount(): this.type = js.native
    def setCount(/**
      * New value for property `count`
      */
    sCount: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Specifies whether the icon and the texts are placed vertically or horizontally.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Vertical`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabFilterDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: IconTabFilterDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Specifies the icon to be displayed for the tab filter.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconColor iconColor}.
      *
      * Specifies the icon color.
      *
      * If an icon font is used, the color can be chosen from the icon colors (sap.ui.core.IconColor). Possible
      * semantic colors are: Neutral, Positive, Critical, Negative. Instead of the semantic icon color the brand
      * color can be used, this is named Default. Semantic colors and brand colors should not be mixed up inside
      * one IconTabBar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconColor(): this.type = js.native
    def setIconColor(
      /**
      * New value for property `iconColor`
      */
    sIconColor: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconColor * / any */ String
    ): this.type = js.native
    def setIconColor(/**
      * New value for property `iconColor`
      */
    sIconColor: IconColor): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconDensityAware iconDensityAware}.
      *
      * If set to true, it sends one or more requests, trying to get the density perfect version of the image
      * if this version of the image doesn't exist on the server. Default value is set to true.
      *
      * If bandwidth is key for the application, set this value to false.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconDensityAware(): this.type = js.native
    def setIconDensityAware(/**
      * New value for property `iconDensityAware`
      */
    bIconDensityAware: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowAll showAll}.
      *
      * Enables special visualization for disabled filter (show all items). **Note:** You can use this property
      * when you use `IconTabBar` as a filter. In order for it to be displayed correctly, the other tabs in the
      * filter should consist of an icon, text and an optional count. It can be set to true for the first tab
      * filter. You can find more detailed information in the {@link https://experience.sap.com/fiori-design-web/icontabbar/#tabs-as-filters UX Guidelines}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowAll(): this.type = js.native
    def setShowAll(/**
      * New value for property `showAll`
      */
    bShowAll: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Specifies whether the tab filter is rendered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(): this.type = js.native
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
  }
  
  trait IconTabFilterSettings
    extends StObject
       with ItemSettings {
    
    /**
      * @since 1.15.0
      *
      * The content displayed for this item (optional).
      *
      * If this content is set, it is displayed instead of the general content inside the IconTabBar.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Represents the "count" text, which is displayed in the tab filter.
      */
    var count: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies whether the icon and the texts are placed vertically or horizontally.
      */
    var design: js.UndefOr[
        IconTabFilterDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabFilterDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Specifies the icon to be displayed for the tab filter.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Specifies the icon color.
      *
      * If an icon font is used, the color can be chosen from the icon colors (sap.ui.core.IconColor). Possible
      * semantic colors are: Neutral, Positive, Critical, Negative. Instead of the semantic icon color the brand
      * color can be used, this is named Default. Semantic colors and brand colors should not be mixed up inside
      * one IconTabBar.
      */
    var iconColor: js.UndefOr[
        IconColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * If set to true, it sends one or more requests, trying to get the density perfect version of the image
      * if this version of the image doesn't exist on the server. Default value is set to true.
      *
      * If bandwidth is key for the application, set this value to false.
      */
    var iconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.77
      *
      * The sub items of this filter (optional).
      */
    var items: js.UndefOr[
        js.Array[IconTab] | IconTab | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables special visualization for disabled filter (show all items). **Note:** You can use this property
      * when you use `IconTabBar` as a filter. In order for it to be displayed correctly, the other tabs in the
      * filter should consist of an icon, text and an optional count. It can be set to true for the first tab
      * filter. You can find more detailed information in the {@link https://experience.sap.com/fiori-design-web/icontabbar/#tabs-as-filters UX Guidelines}.
      */
    var showAll: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies whether the tab filter is rendered.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object IconTabFilterSettings {
    
    inline def apply(): IconTabFilterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconTabFilterSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconTabFilterSettings] (val x: Self) extends AnyVal {
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setCount(value: String | PropertyBindingInfo): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDesign(
        value: IconTabFilterDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconTabFilterDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconColor(
        value: IconColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IconColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      inline def setIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAwareUndefined: Self = StObject.set(x, "iconDensityAware", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItems(
        value: js.Array[IconTab] | IconTab | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: IconTab*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setShowAll(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showAll", value.asInstanceOf[js.Any])
      
      inline def setShowAllUndefined: Self = StObject.set(x, "showAll", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
