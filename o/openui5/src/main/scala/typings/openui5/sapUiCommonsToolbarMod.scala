package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.ToolbarDesign
import typings.openui5.sapUiCommonsLibraryMod.ToolbarItem
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsToolbarMod {
  
  @JSImport("sap/ui/commons/Toolbar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Toolbar.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Toolbar {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ToolbarSettings) = this()
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
    mSettings: ToolbarSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ToolbarSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_Toolbar: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Toolbar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Toolbar with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Toolbar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Toolbar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Toolbar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Toolbar
    extends typings.openui5.sapUiCoreControlMod.default
       with typings.openui5.sapUiCoreLibraryMod.Toolbar {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: ToolbarItem): this.type = js.native
    
    /**
      * Adds some rightItem to the aggregation {@link #getRightItems rightItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addRightItem(/**
      * The rightItem to add; if empty, nothing is inserted
      */
    oRightItem: ToolbarItem): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Destroys all the rightItems in the aggregation {@link #getRightItems rightItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRightItems(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * Design settings are theme-dependent.
      *
      * Default value is `Flat`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): ToolbarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Aggregating the tool bar items.
      */
    def getItems(): js.Array[ToolbarItem] = js.native
    
    /**
      * Gets content of aggregation {@link #getRightItems rightItems}.
      *
      * Aggregating the right side tool bar items.
      */
    def getRightItems(): js.Array[ToolbarItem] = js.native
    
    /**
      * Gets current value of property {@link #getStandalone standalone}.
      *
      * Per default, tool bars have the stand alone status. Alternatively, they can be nested in other controls
      * and then inherit the design from their parent control.
      *
      * Default value is `true`.
      *
      * @returns Value of property `standalone`
      */
    def getStandalone(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * When there is not enough space for the toolbar to display all items, the rightmost items are overflowing
      * into a drop-down menu.
      *
      * Default value is `'auto'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.ToolbarItem` in the aggregation {@link #getItems items}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: ToolbarItem): int = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.ToolbarItem` in the aggregation {@link #getRightItems rightItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfRightItem(/**
      * The rightItem whose index is looked for
      */
    oRightItem: ToolbarItem): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: ToolbarItem,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a rightItem into the aggregation {@link #getRightItems rightItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertRightItem(
      /**
      * The rightItem to insert; if empty, nothing is inserted
      */
    oRightItem: ToolbarItem,
      /**
      * The `0`-based index the rightItem should be inserted at; for a negative value of `iIndex`, the rightItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the rightItem
      * is inserted at the last position
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
    def removeAllItems(): js.Array[ToolbarItem] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getRightItems rightItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllRightItems(): js.Array[ToolbarItem] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): ToolbarItem | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): ToolbarItem | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: ToolbarItem): ToolbarItem | Null = js.native
    
    def removeRightItem(/**
      * The rightItem to remove or its index or id
      */
    vRightItem: String): ToolbarItem | Null = js.native
    /**
      * Removes a rightItem from the aggregation {@link #getRightItems rightItems}.
      *
      * @returns The removed rightItem or `null`
      */
    def removeRightItem(/**
      * The rightItem to remove or its index or id
      */
    vRightItem: int): ToolbarItem | Null = js.native
    def removeRightItem(/**
      * The rightItem to remove or its index or id
      */
    vRightItem: ToolbarItem): ToolbarItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Design settings are theme-dependent.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Flat`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: ToolbarDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStandalone standalone}.
      *
      * Per default, tool bars have the stand alone status. Alternatively, they can be nested in other controls
      * and then inherit the design from their parent control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStandalone(): this.type = js.native
    def setStandalone(/**
      * New value for property `standalone`
      */
    bStandalone: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * When there is not enough space for the toolbar to display all items, the rightmost items are overflowing
      * into a drop-down menu.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'auto'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait ToolbarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Design settings are theme-dependent.
      */
    var design: js.UndefOr[
        ToolbarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Aggregating the tool bar items.
      */
    var items: js.UndefOr[
        js.Array[ToolbarItem] | ToolbarItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Aggregating the right side tool bar items.
      */
    var rightItems: js.UndefOr[
        js.Array[ToolbarItem] | ToolbarItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Per default, tool bars have the stand alone status. Alternatively, they can be nested in other controls
      * and then inherit the design from their parent control.
      */
    var standalone: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * When there is not enough space for the toolbar to display all items, the rightmost items are overflowing
      * into a drop-down menu.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ToolbarSettings {
    
    inline def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    extension [Self <: ToolbarSettings](x: Self) {
      
      inline def setDesign(
        value: ToolbarDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setItems(
        value: js.Array[ToolbarItem] | ToolbarItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: ToolbarItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setRightItems(
        value: js.Array[ToolbarItem] | ToolbarItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "rightItems", value.asInstanceOf[js.Any])
      
      inline def setRightItemsUndefined: Self = StObject.set(x, "rightItems", js.undefined)
      
      inline def setRightItemsVarargs(value: ToolbarItem*): Self = StObject.set(x, "rightItems", js.Array(value*))
      
      inline def setStandalone(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
