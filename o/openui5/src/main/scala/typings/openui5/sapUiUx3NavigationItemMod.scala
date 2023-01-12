package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreItemMod.ItemSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3NavigationItemMod {
  
  @JSImport("sap/ui/ux3/NavigationItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new NavigationItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends NavigationItem {
    def this(/**
      * initial settings for the new control
      */
    mSettings: NavigationItemSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: NavigationItemSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: NavigationItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/NavigationItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.NavigationItem with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, NavigationItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NavigationItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.NavigationItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait NavigationItem
    extends typings.openui5.sapUiCoreItemMod.default {
    
    /**
      * Adds some subItem to the aggregation {@link #getSubItems subItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSubItem(/**
      * The subItem to add; if empty, nothing is inserted
      */
    oSubItem: NavigationItem): this.type = js.native
    
    /**
      * Destroys all the subItems in the aggregation {@link #getSubItems subItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubItems(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getHref href}.
      *
      * Defines the link target URL. This property is optional and should only be set when required! The use
      * of the href property is to not only allow users to navigate in-place by left-clicking NavigationItems,
      * but also to allow right-click and then "open in new tab" or "open in new window". As long as href is
      * not set, an empty window will open and stay blank. But when href is set, the new window/tab will load
      * this URL and it is the application's responsibility to display what the user expects (e.g. the Shell,
      * with the respective NavigationItem being selected).
      *
      * @returns Value of property `href`
      */
    def getHref(): URI = js.native
    
    /**
      * Gets content of aggregation {@link #getSubItems subItems}.
      *
      * Any NavigationItems on the next hierarchy level connected to this NavigationItem
      */
    def getSubItems(): js.Array[NavigationItem] = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Gets current value of property {@link #getVisible visible}.
      *
      * Whether the NavigationItem is currently visible. When making NavigationItems invisible at runtime it
      * is the application's responsibility to make sure it is not the currently selected one - or to select
      * another one in this case.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.NavigationItem` in the aggregation {@link #getSubItems subItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSubItem(/**
      * The subItem whose index is looked for
      */
    oSubItem: NavigationItem): int = js.native
    
    /**
      * Inserts a subItem into the aggregation {@link #getSubItems subItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSubItem(
      /**
      * The subItem to insert; if empty, nothing is inserted
      */
    oSubItem: NavigationItem,
      /**
      * The `0`-based index the subItem should be inserted at; for a negative value of `iIndex`, the subItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the subItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSubItems subItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSubItems(): js.Array[NavigationItem] = js.native
    
    def removeSubItem(/**
      * The subItem to remove or its index or id
      */
    vSubItem: String): NavigationItem | Null = js.native
    /**
      * Removes a subItem from the aggregation {@link #getSubItems subItems}.
      *
      * @returns The removed subItem or `null`
      */
    def removeSubItem(/**
      * The subItem to remove or its index or id
      */
    vSubItem: int): NavigationItem | Null = js.native
    def removeSubItem(/**
      * The subItem to remove or its index or id
      */
    vSubItem: NavigationItem): NavigationItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getHref href}.
      *
      * Defines the link target URL. This property is optional and should only be set when required! The use
      * of the href property is to not only allow users to navigate in-place by left-clicking NavigationItems,
      * but also to allow right-click and then "open in new tab" or "open in new window". As long as href is
      * not set, an empty window will open and stay blank. But when href is set, the new window/tab will load
      * this URL and it is the application's responsibility to display what the user expects (e.g. the Shell,
      * with the respective NavigationItem being selected).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHref(): this.type = js.native
    def setHref(/**
      * New value for property `href`
      */
    sHref: URI): this.type = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Whether the NavigationItem is currently visible. When making NavigationItems invisible at runtime it
      * is the application's responsibility to make sure it is not the currently selected one - or to select
      * another one in this case.
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
  
  trait NavigationItemSettings
    extends StObject
       with ItemSettings {
    
    /**
      * Defines the link target URL. This property is optional and should only be set when required! The use
      * of the href property is to not only allow users to navigate in-place by left-clicking NavigationItems,
      * but also to allow right-click and then "open in new tab" or "open in new window". As long as href is
      * not set, an empty window will open and stay blank. But when href is set, the new window/tab will load
      * this URL and it is the application's responsibility to display what the user expects (e.g. the Shell,
      * with the respective NavigationItem being selected).
      */
    var href: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Any NavigationItems on the next hierarchy level connected to this NavigationItem
      */
    var subItems: js.UndefOr[
        js.Array[NavigationItem] | NavigationItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.9.0
      *
      * Whether the NavigationItem is currently visible. When making NavigationItems invisible at runtime it
      * is the application's responsibility to make sure it is not the currently selected one - or to select
      * another one in this case.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object NavigationItemSettings {
    
    inline def apply(): NavigationItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigationItemSettings] (val x: Self) extends AnyVal {
      
      inline def setHref(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setSubItems(
        value: js.Array[NavigationItem] | NavigationItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "subItems", value.asInstanceOf[js.Any])
      
      inline def setSubItemsUndefined: Self = StObject.set(x, "subItems", js.undefined)
      
      inline def setSubItemsVarargs(value: NavigationItem*): Self = StObject.set(x, "subItems", js.Array(value*))
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
