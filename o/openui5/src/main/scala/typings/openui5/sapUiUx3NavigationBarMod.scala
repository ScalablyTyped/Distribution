package typings.openui5

import typings.openui5.anon.ItemItemId
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3NavigationBarMod {
  
  @JSImport("sap/ui/ux3/NavigationBar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new NavigationBar.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends NavigationBar {
    def this(/**
      * initial settings for the new control
      */
    mSettings: NavigationBarSettings) = this()
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
    mSettings: NavigationBarSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: NavigationBarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/NavigationBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.NavigationBar with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, NavigationBar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NavigationBar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.NavigationBar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait NavigationBar
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some associatedItem into the association {@link #getAssociatedItems associatedItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAssociatedItem(/**
      * The associatedItems to add; if empty, nothing is inserted
      */
    vAssociatedItem: ID): this.type = js.native
    def addAssociatedItem(
      /**
      * The associatedItems to add; if empty, nothing is inserted
      */
    vAssociatedItem: typings.openui5.sapUiUx3NavigationItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiUx3NavigationItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.ux3.NavigationBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.NavigationBar` itself.
      *
      * Event is fired when an item is selected by the user
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.NavigationBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.ux3.NavigationBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.NavigationBar` itself.
      *
      * Event is fired when an item is selected by the user
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.NavigationBar` itself
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
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.ux3.NavigationBar`.
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
      * Fires event {@link #event:select select} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireSelect(): Boolean = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: ItemItemId): Boolean = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAssociatedItems
      * associatedItems}.
      */
    def getAssociatedItems(): js.Array[ID] = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * If the navigation items need to have a different parent than the NavigationBar, alternatively the associatedItems
      * association can be used. The NavigationBar follows the approach to use the items aggregation. If this
      * aggregation is empty, associatedItems is used.
      */
    def getItems(): js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] = js.native
    
    /**
      * @SINCE 1.36
      *
      * Gets current value of property {@link #getOverflowItemsToUpperCase overflowItemsToUpperCase}.
      *
      * Sets the appearance of the menu items in the overflow menu to uppercase
      *
      * Default value is `false`.
      *
      * @returns Value of property `overflowItemsToUpperCase`
      */
    def getOverflowItemsToUpperCase(): Boolean = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedItem selectedItem},
      * or `null`.
      */
    def getSelectedItem(): ID = js.native
    
    /**
      * Gets current value of property {@link #getToplevelVariant toplevelVariant}.
      *
      * Defines whether the navigation bar shall have top-level appearance
      *
      * Default value is `false`.
      *
      * @returns Value of property `toplevelVariant`
      */
    def getToplevelVariant(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.NavigationItem` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiUx3NavigationItemMod.default
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
    oItem: typings.openui5.sapUiUx3NavigationItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Returns whether there is a selectedItem set which is actually present in the items aggregation; or, if
      * the aggregation is empty, in the associatedItems association.
      */
    def isSelectedItemValid(): Boolean = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAssociatedItems associatedItems}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAssociatedItems(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] = js.native
    
    /**
      * Removes an associatedItem from the association named {@link #getAssociatedItems associatedItems}.
      *
      * @returns The removed associatedItem or `null`
      */
    def removeAssociatedItem(/**
      * The associatedItem to be removed or its index or ID
      */
    vAssociatedItem: int): ID | Null = js.native
    def removeAssociatedItem(/**
      * The associatedItem to be removed or its index or ID
      */
    vAssociatedItem: ID): ID | Null = js.native
    def removeAssociatedItem(
      /**
      * The associatedItem to be removed or its index or ID
      */
    vAssociatedItem: typings.openui5.sapUiUx3NavigationItemMod.default
    ): ID | Null = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapUiUx3NavigationItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapUiUx3NavigationItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapUiUx3NavigationItemMod.default
    ): typings.openui5.sapUiUx3NavigationItemMod.default | Null = js.native
    
    /**
      * Replaces the currently associated items with the ones in the given array
      */
    def setAssociatedItems(
      /**
      * The items to associate
      */
    aItems: js.Array[typings.openui5.sapUiUx3NavigationItemMod.default]
    ): this.type = js.native
    
    /**
      * @SINCE 1.36
      *
      * Sets a new value for property {@link #getOverflowItemsToUpperCase overflowItemsToUpperCase}.
      *
      * Sets the appearance of the menu items in the overflow menu to uppercase
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOverflowItemsToUpperCase(): this.type = js.native
    def setOverflowItemsToUpperCase(/**
      * New value for property `overflowItemsToUpperCase`
      */
    bOverflowItemsToUpperCase: Boolean): this.type = js.native
    
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
    def setSelectedItem(
      /**
      * ID of an element which becomes the new target of this selectedItem association; alternatively, an element
      * instance may be given
      */
    oSelectedItem: typings.openui5.sapUiUx3NavigationItemMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getToplevelVariant toplevelVariant}.
      *
      * Defines whether the navigation bar shall have top-level appearance
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setToplevelVariant(): this.type = js.native
    def setToplevelVariant(/**
      * New value for property `toplevelVariant`
      */
    bToplevelVariant: Boolean): this.type = js.native
  }
  
  trait NavigationBarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This association is ignored as long as the items aggregation is used; and supposed to be used alternatively
      * when the items should be aggregated by other entities.
      */
    var associatedItems: js.UndefOr[js.Array[typings.openui5.sapUiUx3NavigationItemMod.default | String]] = js.undefined
    
    /**
      * If the navigation items need to have a different parent than the NavigationBar, alternatively the associatedItems
      * association can be used. The NavigationBar follows the approach to use the items aggregation. If this
      * aggregation is empty, associatedItems is used.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] | typings.openui5.sapUiUx3NavigationItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.36
      *
      * Sets the appearance of the menu items in the overflow menu to uppercase
      */
    var overflowItemsToUpperCase: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when an item is selected by the user
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The selected NavigationItem.
      */
    var selectedItem: js.UndefOr[typings.openui5.sapUiUx3NavigationItemMod.default | String] = js.undefined
    
    /**
      * Defines whether the navigation bar shall have top-level appearance
      */
    var toplevelVariant: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object NavigationBarSettings {
    
    inline def apply(): NavigationBarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationBarSettings]
    }
    
    extension [Self <: NavigationBarSettings](x: Self) {
      
      inline def setAssociatedItems(value: js.Array[typings.openui5.sapUiUx3NavigationItemMod.default | String]): Self = StObject.set(x, "associatedItems", value.asInstanceOf[js.Any])
      
      inline def setAssociatedItemsUndefined: Self = StObject.set(x, "associatedItems", js.undefined)
      
      inline def setAssociatedItemsVarargs(value: (typings.openui5.sapUiUx3NavigationItemMod.default | String)*): Self = StObject.set(x, "associatedItems", js.Array(value*))
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiUx3NavigationItemMod.default] | typings.openui5.sapUiUx3NavigationItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiUx3NavigationItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOverflowItemsToUpperCase(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "overflowItemsToUpperCase", value.asInstanceOf[js.Any])
      
      inline def setOverflowItemsToUpperCaseUndefined: Self = StObject.set(x, "overflowItemsToUpperCase", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedItem(value: typings.openui5.sapUiUx3NavigationItemMod.default | String): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setToplevelVariant(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "toplevelVariant", value.asInstanceOf[js.Any])
      
      inline def setToplevelVariantUndefined: Self = StObject.set(x, "toplevelVariant", js.undefined)
    }
  }
}
