package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMTableColumnmenuEntryMod.EntrySettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTableColumnmenuQuickGroupMod {
  
  @JSImport("sap/m/table/columnmenu/QuickGroup", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `QuickGroup`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends QuickGroup {
    def this(/**
      * Initial settings for the new `QuickGroup`
      */
    mSettings: QuickGroupSettings) = this()
    def this(/**
      * ID for the new `QuickGroup`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `QuickGroup`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new `QuickGroup`
      */
    mSettings: QuickGroupSettings
    ) = this()
    def this(
      /**
      * ID for the new `QuickGroup`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new `QuickGroup`
      */
    mSettings: QuickGroupSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/table/columnmenu/QuickGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.table.columnmenu.QuickGroup with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.table.columnmenu.QuickActionBase.extend}.
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
    oClassInfo: ClassInfo[T, QuickGroup]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, QuickGroup],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.table.columnmenu.QuickGroup.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickGroup
    extends typings.openui5.sapMTableColumnmenuQuickActionBaseMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.table.columnmenu.QuickGroup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.QuickGroup` itself.
      *
      * Fires the change event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickGroupChangeEvent, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickGroupChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.QuickGroup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.table.columnmenu.QuickGroup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.QuickGroup` itself.
      *
      * Fires the change event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickGroupChangeEvent, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickGroupChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.QuickGroup` itself
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
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.table.columnmenu.QuickGroup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickGroupChangeEvent, Unit]
    ): this.type = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ QuickGroupChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: QuickGroup$ChangeEventParameters): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The groupable properties and the initial state.
      */
    def getItems(): js.Array[typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default] = js.native
    
    /**
      * Checks for the provided `sap.m.table.columnmenu.QuickGroupItem` in the aggregation {@link #getItems items}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default
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
    oItem: typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default,
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
    def removeAllItems(): js.Array[typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default
    ): typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default | Null = js.native
  }
  
  trait QuickGroup$ChangeEventParameters extends StObject {
    
    /**
      * The new grouped state.
      */
    var grouped: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key of the property to be grouped.
      */
    var key: js.UndefOr[String] = js.undefined
  }
  object QuickGroup$ChangeEventParameters {
    
    inline def apply(): QuickGroup$ChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickGroup$ChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickGroup$ChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
      
      inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  type QuickGroupChangeEvent = typings.openui5.sapUiBaseEventMod.default[QuickGroup$ChangeEventParameters]
  
  type QuickGroupChangeEventParameters = QuickGroup$ChangeEventParameters
  
  trait QuickGroupSettings
    extends StObject
       with EntrySettings {
    
    /**
      * Fires the change event.
      */
    var change: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickGroup$ChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The groupable properties and the initial state.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default] | typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object QuickGroupSettings {
    
    inline def apply(): QuickGroupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickGroupSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickGroupSettings] (val x: Self) extends AnyVal {
      
      inline def setChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[QuickGroup$ChangeEventParameters] => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default] | typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMTableColumnmenuQuickGroupItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}
