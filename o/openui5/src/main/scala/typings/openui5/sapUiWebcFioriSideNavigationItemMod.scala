package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.ISideNavigationItem
import typings.openui5.sapUiWebcFioriLibraryMod.ISideNavigationSubItem
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriSideNavigationItemMod {
  
  @JSImport("sap/ui/webc/fiori/SideNavigationItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `SideNavigationItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SideNavigationItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SideNavigationItemSettings) = this()
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
    mSettings: SideNavigationItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SideNavigationItemSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_fiori_ISideNavigationItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/SideNavigationItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.SideNavigationItem with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, SideNavigationItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SideNavigationItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.SideNavigationItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait SideNavigationItem
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with ISideNavigationItem {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: ISideNavigationSubItem): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getExpanded expanded}.
      *
      * Defines if the item is expanded
      *
      * Default value is `false`.
      *
      * @returns Value of property `expanded`
      */
    def getExpanded(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the icon of the item.
      *
      *
      *
      * The SAP-icons font provides numerous options.
      *  See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * If you wish to nest menus, you can pass inner menu items to the default slot.
      */
    def getItems(): js.Array[ISideNavigationSubItem] = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines whether the subitem is selected
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the text of the item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getWholeItemToggleable wholeItemToggleable}.
      *
      * Defines whether pressing the whole item or only pressing the icon will show/hide the items's sub items(if
      * present). If set to true, pressing the whole item will toggle the sub items, and it won't fire the `click`
      * event. By default, only pressing the arrow icon will toggle the sub items & the click event will be fired
      * if the item is pressed outside of the icon.
      *
      * Default value is `false`.
      *
      * @returns Value of property `wholeItemToggleable`
      */
    def getWholeItemToggleable(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.ISideNavigationSubItem` in the aggregation {@link #getItems
      * items}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: ISideNavigationSubItem): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: ISideNavigationSubItem,
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
    def removeAllItems(): js.Array[ISideNavigationSubItem] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): ISideNavigationSubItem | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): ISideNavigationSubItem | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: ISideNavigationSubItem): ISideNavigationSubItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getExpanded expanded}.
      *
      * Defines if the item is expanded
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpanded(): this.type = js.native
    def setExpanded(/**
      * New value for property `expanded`
      */
    bExpanded: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the icon of the item.
      *
      *
      *
      * The SAP-icons font provides numerous options.
      *  See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
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
    sIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines whether the subitem is selected
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the text of the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWholeItemToggleable wholeItemToggleable}.
      *
      * Defines whether pressing the whole item or only pressing the icon will show/hide the items's sub items(if
      * present). If set to true, pressing the whole item will toggle the sub items, and it won't fire the `click`
      * event. By default, only pressing the arrow icon will toggle the sub items & the click event will be fired
      * if the item is pressed outside of the icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWholeItemToggleable(): this.type = js.native
    def setWholeItemToggleable(/**
      * New value for property `wholeItemToggleable`
      */
    bWholeItemToggleable: Boolean): this.type = js.native
  }
  
  trait SideNavigationItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines if the item is expanded
      */
    var expanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the icon of the item.
      *
      *
      *
      * The SAP-icons font provides numerous options.
      *  See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * If you wish to nest menus, you can pass inner menu items to the default slot.
      */
    var items: js.UndefOr[
        js.Array[ISideNavigationSubItem] | ISideNavigationSubItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the subitem is selected
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the text of the item.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines whether pressing the whole item or only pressing the icon will show/hide the items's sub items(if
      * present). If set to true, pressing the whole item will toggle the sub items, and it won't fire the `click`
      * event. By default, only pressing the arrow icon will toggle the sub items & the click event will be fired
      * if the item is pressed outside of the icon.
      */
    var wholeItemToggleable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SideNavigationItemSettings {
    
    inline def apply(): SideNavigationItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavigationItemSettings]
    }
    
    extension [Self <: SideNavigationItemSettings](x: Self) {
      
      inline def setExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItems(
        value: js.Array[ISideNavigationSubItem] | ISideNavigationSubItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: ISideNavigationSubItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWholeItemToggleable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "wholeItemToggleable", value.asInstanceOf[js.Any])
      
      inline def setWholeItemToggleableUndefined: Self = StObject.set(x, "wholeItemToggleable", js.undefined)
    }
  }
}
