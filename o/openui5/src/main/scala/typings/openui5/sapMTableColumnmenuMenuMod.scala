package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.IColumnHeaderMenu
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTableColumnmenuMenuMod {
  
  @JSImport("sap/m/table/columnmenu/Menu", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Menu`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Menu {
    def this(/**
      * Initial settings for the new `Menu`
      */
    mSettings: MenuSettings) = this()
    def this(/**
      * ID for the new `Menu`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `Menu`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new `Menu`
      */
    mSettings: MenuSettings
    ) = this()
    def this(
      /**
      * ID for the new `Menu`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new `Menu`
      */
    mSettings: MenuSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/table/columnmenu/Menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.table.columnmenu.Menu with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, Menu]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Menu],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.table.columnmenu.Menu.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Menu
    extends typings.openui5.sapUiCoreControlMod.default
       with IColumnHeaderMenu {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMTableColumnmenuItemBaseMod.default
    ): this.type = js.native
    
    /**
      * Adds some quickAction to the aggregation {@link #getQuickActions quickActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addQuickAction(
      /**
      * The quickAction to add; if empty, nothing is inserted
      */
    oQuickAction: typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default
    ): this.type = js.native
    
    /**
      * @since 1.112
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.table.columnmenu.Menu`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.Menu` itself.
      *
      * Fires after the column menu is closed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachAfterClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.Menu` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.112
      *
      * Attaches event handler `fnFunction` to the {@link #event:afterClose afterClose} event of this `sap.m.table.columnmenu.Menu`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.Menu` itself.
      *
      * Fires after the column menu is closed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachAfterClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.Menu` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.table.columnmenu.Menu`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.Menu` itself.
      *
      * Fired before the column menu is opened
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ MenuBeforeOpenEvent, Unit]
    ): this.type = js.native
    def attachBeforeOpen(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ MenuBeforeOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.Menu` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpen beforeOpen} event of this `sap.m.table.columnmenu.Menu`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.Menu` itself.
      *
      * Fired before the column menu is opened
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ MenuBeforeOpenEvent, Unit]
    ): this.type = js.native
    def attachBeforeOpen(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ MenuBeforeOpenEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.Menu` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the popover.
      */
    def close(): Unit = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Destroys all the quickActions in the aggregation {@link #getQuickActions quickActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyQuickActions(): this.type = js.native
    
    /**
      * @since 1.112
      *
      * Detaches event handler `fnFunction` from the {@link #event:afterClose afterClose} event of this `sap.m.table.columnmenu.Menu`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachAfterClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforeOpen beforeOpen} event of this `sap.m.table.columnmenu.Menu`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ MenuBeforeOpenEvent, Unit]
    ): this.type = js.native
    def detachBeforeOpen(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ MenuBeforeOpenEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.112
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:afterClose afterClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterClose(): this.type = js.native
    def fireAfterClose(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:beforeOpen beforeOpen} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireBeforeOpen(): Boolean = js.native
    def fireBeforeOpen(/**
      * Parameters to pass along with the event
      */
    mParameters: Menu$BeforeOpenEventParameters): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the items of the column menu.
      */
    def getItems(): js.Array[typings.openui5.sapMTableColumnmenuItemBaseMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getQuickActions quickActions}.
      *
      * Defines the quick actions of the column menu.
      */
    def getQuickActions(): js.Array[typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default] = js.native
    
    /**
      * Checks for the provided `sap.m.table.columnmenu.ItemBase` in the aggregation {@link #getItems items}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMTableColumnmenuItemBaseMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.table.columnmenu.QuickActionBase` in the aggregation {@link #getQuickActions quickActions}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfQuickAction(
      /**
      * The quickAction whose index is looked for
      */
    oQuickAction: typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default
    ): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMTableColumnmenuItemBaseMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a quickAction into the aggregation {@link #getQuickActions quickActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertQuickAction(
      /**
      * The quickAction to insert; if empty, nothing is inserted
      */
    oQuickAction: typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default,
      /**
      * The `0`-based index the quickAction should be inserted at; for a negative value of `iIndex`, the quickAction
      * is inserted at position 0; for a value greater than the current size of the aggregation, the quickAction
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def openBy(
      /**
      * This is the control or HTMLElement where the popover is placed.
      */
    oAnchor: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Whether to suppress the beforeOpen event.
      */
    bSuppressEvent: Boolean
    ): Unit = js.native
    def openBy(
      /**
      * This is the control or HTMLElement where the popover is placed.
      */
    oAnchor: HTMLElement,
      /**
      * Whether to suppress the beforeOpen event.
      */
    bSuppressEvent: Boolean
    ): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapMTableColumnmenuItemBaseMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getQuickActions quickActions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllQuickActions(): js.Array[typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapMTableColumnmenuItemBaseMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapMTableColumnmenuItemBaseMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapMTableColumnmenuItemBaseMod.default
    ): typings.openui5.sapMTableColumnmenuItemBaseMod.default | Null = js.native
    
    def removeQuickAction(/**
      * The quickAction to remove or its index or id
      */
    vQuickAction: String): typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default | Null = js.native
    /**
      * Removes a quickAction from the aggregation {@link #getQuickActions quickActions}.
      *
      * @returns The removed quickAction or `null`
      */
    def removeQuickAction(/**
      * The quickAction to remove or its index or id
      */
    vQuickAction: int): typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default | Null = js.native
    def removeQuickAction(
      /**
      * The quickAction to remove or its index or id
      */
    vQuickAction: typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default
    ): typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default | Null = js.native
  }
  
  trait Menu$AfterCloseEventParameters extends StObject
  
  trait Menu$BeforeOpenEventParameters extends StObject {
    
    /**
      * The element for which the menu is opened. If it is an `HTMLElement`, the closest control is passed for
      * this event (if it exists).
      */
    var openBy: js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.undefined
  }
  object Menu$BeforeOpenEventParameters {
    
    inline def apply(): Menu$BeforeOpenEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Menu$BeforeOpenEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Menu$BeforeOpenEventParameters] (val x: Self) extends AnyVal {
      
      inline def setOpenBy(value: typings.openui5.sapUiCoreElementMod.default): Self = StObject.set(x, "openBy", value.asInstanceOf[js.Any])
      
      inline def setOpenByUndefined: Self = StObject.set(x, "openBy", js.undefined)
    }
  }
  
  type MenuAfterCloseEvent = typings.openui5.sapUiBaseEventMod.default[Menu$AfterCloseEventParameters]
  
  type MenuAfterCloseEventParameters = Menu$AfterCloseEventParameters
  
  type MenuBeforeOpenEvent = typings.openui5.sapUiBaseEventMod.default[Menu$BeforeOpenEventParameters]
  
  type MenuBeforeOpenEventParameters = Menu$BeforeOpenEventParameters
  
  trait MenuSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.112
      *
      * Fires after the column menu is closed
      */
    var afterClose: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Fired before the column menu is opened
      */
    var beforeOpen: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Menu$BeforeOpenEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Defines the items of the column menu.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMTableColumnmenuItemBaseMod.default] | typings.openui5.sapMTableColumnmenuItemBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the quick actions of the column menu.
      */
    var quickActions: js.UndefOr[
        js.Array[typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default] | typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MenuSettings {
    
    inline def apply(): MenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuSettings] (val x: Self) extends AnyVal {
      
      inline def setAfterClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction1(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setBeforeOpen(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Menu$BeforeOpenEventParameters] => Unit
      ): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMTableColumnmenuItemBaseMod.default] | typings.openui5.sapMTableColumnmenuItemBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMTableColumnmenuItemBaseMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setQuickActions(
        value: js.Array[typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default] | typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "quickActions", value.asInstanceOf[js.Any])
      
      inline def setQuickActionsUndefined: Self = StObject.set(x, "quickActions", js.undefined)
      
      inline def setQuickActionsVarargs(value: typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default*): Self = StObject.set(x, "quickActions", js.Array(value*))
    }
  }
}
