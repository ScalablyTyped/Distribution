package typings.openui5

import typings.openui5.anon.`11`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.ISideNavigationItem
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriSideNavigationMod {
  
  @JSImport("sap/ui/webc/fiori/SideNavigation", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `SideNavigation`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SideNavigation {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SideNavigationSettings) = this()
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
    mSettings: SideNavigationSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SideNavigationSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/SideNavigation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.SideNavigation with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, SideNavigation]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SideNavigation],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.SideNavigation.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait SideNavigation
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Adds some fixedItem to the aggregation {@link #getFixedItems fixedItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFixedItem(/**
      * The fixedItem to add; if empty, nothing is inserted
      */
    oFixedItem: ISideNavigationItem): this.type = js.native
    
    /**
      * Adds some header to the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeader(
      /**
      * The header to add; if empty, nothing is inserted
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: ISideNavigationItem): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.fiori.SideNavigation`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.SideNavigation` itself.
      *
      * Fired when the selection has changed via user interaction
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.SideNavigation` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.fiori.SideNavigation`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.SideNavigation` itself.
      *
      * Fired when the selection has changed via user interaction
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
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
    def attachSelectionChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.SideNavigation` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the fixedItems in the aggregation {@link #getFixedItems fixedItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFixedItems(): this.type = js.native
    
    /**
      * Destroys all the header in the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeader(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.ui.webc.fiori.SideNavigation`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelectionChange(
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
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireSelectionChange(): Boolean = js.native
    def fireSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: `11`): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getCollapsed collapsed}.
      *
      * Defines whether the `sap.ui.webc.fiori.SideNavigation` is expanded or collapsed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `collapsed`
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getFixedItems fixedItems}.
      *
      * Defines the fixed items at the bottom of the `sap.ui.webc.fiori.SideNavigation`. Use the `sap.ui.webc.fiori.SideNavigationItem`
      * component for the fixed items, and optionally the `sap.ui.webc.fiori.SideNavigationSubItem` component
      * to provide second-level items inside them.
      *
      * **Note:** In order to achieve the best user experience, it is recommended that you keep the fixed items
      * "flat" (do not pass sub-items)
      */
    def getFixedItems(): js.Array[ISideNavigationItem] = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * Defines the header of the `sap.ui.webc.fiori.SideNavigation`.
      *
      *
      *
      *  **Note:** The header is displayed when the component is expanded - the property `collapsed` is false;
      */
    def getHeader(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the main items of the `sap.ui.webc.fiori.SideNavigation`. Use the `sap.ui.webc.fiori.SideNavigationItem`
      * component for the top-level items, and the `sap.ui.webc.fiori.SideNavigationSubItem` component for second-level
      * items, nested inside the items.
      */
    def getItems(): js.Array[ISideNavigationItem] = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.ISideNavigationItem` in the aggregation {@link #getFixedItems
      * fixedItems}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFixedItem(/**
      * The fixedItem whose index is looked for
      */
    oFixedItem: ISideNavigationItem): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getHeader header}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeader(
      /**
      * The header whose index is looked for
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.ISideNavigationItem` in the aggregation {@link #getItems items}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: ISideNavigationItem): int = js.native
    
    /**
      * Inserts a fixedItem into the aggregation {@link #getFixedItems fixedItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFixedItem(
      /**
      * The fixedItem to insert; if empty, nothing is inserted
      */
    oFixedItem: ISideNavigationItem,
      /**
      * The `0`-based index the fixedItem should be inserted at; for a negative value of `iIndex`, the fixedItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the fixedItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a header into the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeader(
      /**
      * The header to insert; if empty, nothing is inserted
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the header should be inserted at; for a negative value of `iIndex`, the header is
      * inserted at position 0; for a value greater than the current size of the aggregation, the header is inserted
      * at the last position
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
    oItem: ISideNavigationItem,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFixedItems fixedItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFixedItems(): js.Array[ISideNavigationItem] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeader header}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeader(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[ISideNavigationItem] = js.native
    
    def removeFixedItem(/**
      * The fixedItem to remove or its index or id
      */
    vFixedItem: String): ISideNavigationItem | Null = js.native
    /**
      * Removes a fixedItem from the aggregation {@link #getFixedItems fixedItems}.
      *
      * @returns The removed fixedItem or `null`
      */
    def removeFixedItem(/**
      * The fixedItem to remove or its index or id
      */
    vFixedItem: int): ISideNavigationItem | Null = js.native
    def removeFixedItem(/**
      * The fixedItem to remove or its index or id
      */
    vFixedItem: ISideNavigationItem): ISideNavigationItem | Null = js.native
    
    def removeHeader(/**
      * The header to remove or its index or id
      */
    vHeader: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a header from the aggregation {@link #getHeader header}.
      *
      * @returns The removed header or `null`
      */
    def removeHeader(/**
      * The header to remove or its index or id
      */
    vHeader: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeHeader(
      /**
      * The header to remove or its index or id
      */
    vHeader: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): ISideNavigationItem | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): ISideNavigationItem | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: ISideNavigationItem): ISideNavigationItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getCollapsed collapsed}.
      *
      * Defines whether the `sap.ui.webc.fiori.SideNavigation` is expanded or collapsed.
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
  }
  
  trait SideNavigationSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines whether the `sap.ui.webc.fiori.SideNavigation` is expanded or collapsed.
      */
    var collapsed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the fixed items at the bottom of the `sap.ui.webc.fiori.SideNavigation`. Use the `sap.ui.webc.fiori.SideNavigationItem`
      * component for the fixed items, and optionally the `sap.ui.webc.fiori.SideNavigationSubItem` component
      * to provide second-level items inside them.
      *
      * **Note:** In order to achieve the best user experience, it is recommended that you keep the fixed items
      * "flat" (do not pass sub-items)
      */
    var fixedItems: js.UndefOr[
        js.Array[ISideNavigationItem] | ISideNavigationItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the header of the `sap.ui.webc.fiori.SideNavigation`.
      *
      *
      *
      *  **Note:** The header is displayed when the component is expanded - the property `collapsed` is false;
      */
    var header: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the main items of the `sap.ui.webc.fiori.SideNavigation`. Use the `sap.ui.webc.fiori.SideNavigationItem`
      * component for the top-level items, and the `sap.ui.webc.fiori.SideNavigationSubItem` component for second-level
      * items, nested inside the items.
      */
    var items: js.UndefOr[
        js.Array[ISideNavigationItem] | ISideNavigationItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the selection has changed via user interaction
      */
    var selectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object SideNavigationSettings {
    
    inline def apply(): SideNavigationSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavigationSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavigationSettings] (val x: Self) extends AnyVal {
      
      inline def setCollapsed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setFixedItems(
        value: js.Array[ISideNavigationItem] | ISideNavigationItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "fixedItems", value.asInstanceOf[js.Any])
      
      inline def setFixedItemsUndefined: Self = StObject.set(x, "fixedItems", js.undefined)
      
      inline def setFixedItemsVarargs(value: ISideNavigationItem*): Self = StObject.set(x, "fixedItems", js.Array(value*))
      
      inline def setHeader(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setItems(
        value: js.Array[ISideNavigationItem] | ISideNavigationItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: ISideNavigationItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
    }
  }
}
