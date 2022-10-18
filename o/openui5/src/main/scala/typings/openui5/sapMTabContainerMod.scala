package typings.openui5

import typings.openui5.anon.`22`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.PageBackgroundDesign
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTabContainerMod {
  
  @JSImport("sap/m/TabContainer", JSImport.Default)
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
    
    @JSImport("sap/m/TabContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TabContainer with name `sClassName` and enriches it with the information
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
      * Returns a metadata object for class sap.m.TabContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TabContainer
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMTabContainerItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:addNewButtonPress addNewButtonPress} event of
      * this `sap.m.TabContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TabContainer` itself.
      *
      * Fired when the Add New Tab button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAddNewButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAddNewButtonPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TabContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:addNewButtonPress addNewButtonPress} event of
      * this `sap.m.TabContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TabContainer` itself.
      *
      * Fired when the Add New Tab button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAddNewButtonPress(
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
    def attachAddNewButtonPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TabContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClose itemClose} event of this `sap.m.TabContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TabContainer` itself.
      *
      * Fired when an item is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TabContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClose itemClose} event of this `sap.m.TabContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TabContainer` itself.
      *
      * Fired when an item is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemClose(
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
    def attachItemClose(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TabContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelect itemSelect} event of this `sap.m.TabContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TabContainer` itself.
      *
      * Fired when an item is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TabContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelect itemSelect} event of this `sap.m.TabContainer`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TabContainer` itself.
      *
      * Fired when an item is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelect(
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
    def attachItemSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TabContainer` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getItems items} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:addNewButtonPress addNewButtonPress} event
      * of this `sap.m.TabContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAddNewButtonPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAddNewButtonPress(
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
      * Detaches event handler `fnFunction` from the {@link #event:itemClose itemClose} event of this `sap.m.TabContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemClose(
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
      * Detaches event handler `fnFunction` from the {@link #event:itemSelect itemSelect} event of this `sap.m.TabContainer`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemSelect(
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
      * Fires event {@link #event:addNewButtonPress addNewButtonPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAddNewButtonPress(): this.type = js.native
    def fireAddNewButtonPress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:itemClose itemClose} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireItemClose(): Boolean = js.native
    def fireItemClose(/**
      * Parameters to pass along with the event
      */
    mParameters: `22`): Boolean = js.native
    
    /**
      * Fires event {@link #event:itemSelect itemSelect} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireItemSelect(): Boolean = js.native
    def fireItemSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: `22`): Boolean = js.native
    
    /**
      * @SINCE 1.71
      *
      * Gets current value of property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of the content in `TabContainer`.
      *
      * Default value is `List`.
      *
      * @returns Value of property `backgroundDesign`
      */
    def getBackgroundDesign(): PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The items displayed in the `TabContainer`.
      */
    def getItems(): js.Array[typings.openui5.sapMTabContainerItemMod.default] = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedItem selectedItem},
      * or `null`.
      */
    def getSelectedItem(): ID = js.native
    
    /**
      * Gets current value of property {@link #getShowAddNewButton showAddNewButton}.
      *
      * Defines whether an Add New Tab button is displayed in the `TabStrip`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showAddNewButton`
      */
    def getShowAddNewButton(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.TabContainerItem` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMTabContainerItemMod.default
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
    oItem: typings.openui5.sapMTabContainerItemMod.default,
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
    def removeAllItems(): js.Array[typings.openui5.sapMTabContainerItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or ID
      */
    vItem: String): typings.openui5.sapMTabContainerItemMod.default | Null = js.native
    /**
      * Removes an item from the aggregation named `items`.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or ID
      */
    vItem: int): typings.openui5.sapMTabContainerItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or ID
      */
    vItem: typings.openui5.sapMTabContainerItemMod.default
    ): typings.openui5.sapMTabContainerItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.71
      *
      * Sets a new value for property {@link #getBackgroundDesign backgroundDesign}.
      *
      * Determines the background color of the content in `TabContainer`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `List`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundDesign(): this.type = js.native
    def setBackgroundDesign(
      /**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String
    ): this.type = js.native
    def setBackgroundDesign(/**
      * New value for property `backgroundDesign`
      */
    sBackgroundDesign: PageBackgroundDesign): this.type = js.native
    
    def setSelectedItem(
      /**
      * ID of an element which becomes the new target of this selectedItem association; alternatively, an element
      * instance may be given
      */
    oSelectedItem: typings.openui5.sapMTabContainerItemMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getSelectedItem selectedItem}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedItem(
      /**
      * ID of an element which becomes the new target of this selectedItem association; alternatively, an element
      * instance may be given
      */
    oSelectedItem: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowAddNewButton showAddNewButton}.
      *
      * Defines whether an Add New Tab button is displayed in the `TabStrip`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowAddNewButton(): this.type = js.native
    def setShowAddNewButton(/**
      * New value for property `showAddNewButton`
      */
    bShowAddNewButton: Boolean): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait TabContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the Add New Tab button is pressed.
      */
    var addNewButtonPress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.71
      *
      * Determines the background color of the content in `TabContainer`.
      */
    var backgroundDesign: js.UndefOr[
        PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Fired when an item is closed.
      */
    var itemClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when an item is pressed.
      */
    var itemSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The items displayed in the `TabContainer`.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMTabContainerItemMod.default] | typings.openui5.sapMTabContainerItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets or retrieves the selected item from the `items` aggregation.
      */
    var selectedItem: js.UndefOr[typings.openui5.sapMTabContainerItemMod.default | String] = js.undefined
    
    /**
      * Defines whether an Add New Tab button is displayed in the `TabStrip`.
      */
    var showAddNewButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TabContainerSettings {
    
    inline def apply(): TabContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabContainerSettings]
    }
    
    extension [Self <: TabContainerSettings](x: Self) {
      
      inline def setAddNewButtonPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "addNewButtonPress", js.Any.fromFunction1(value))
      
      inline def setAddNewButtonPressUndefined: Self = StObject.set(x, "addNewButtonPress", js.undefined)
      
      inline def setBackgroundDesign(
        value: PageBackgroundDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageBackgroundDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "backgroundDesign", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDesignUndefined: Self = StObject.set(x, "backgroundDesign", js.undefined)
      
      inline def setItemClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemClose", js.Any.fromFunction1(value))
      
      inline def setItemCloseUndefined: Self = StObject.set(x, "itemClose", js.undefined)
      
      inline def setItemSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemSelect", js.Any.fromFunction1(value))
      
      inline def setItemSelectUndefined: Self = StObject.set(x, "itemSelect", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMTabContainerItemMod.default] | typings.openui5.sapMTabContainerItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMTabContainerItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSelectedItem(value: typings.openui5.sapMTabContainerItemMod.default | String): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setShowAddNewButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showAddNewButton", value.asInstanceOf[js.Any])
      
      inline def setShowAddNewButtonUndefined: Self = StObject.set(x, "showAddNewButton", js.undefined)
    }
  }
}
