package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3CollectionMod {
  
  @JSImport("sap/ui/ux3/Collection", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Collection.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Collection {
    def this(/**
      * initial settings for the new control
      */
    mSettings: CollectionSettings) = this()
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
    mSettings: CollectionSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: CollectionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/Collection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.Collection with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, Collection]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Collection],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.Collection.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Collection
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      *
      * @returns `this` to allow method chaining
      */
    def addSelectedItem(
      /**
      * Id of a selectedItem which becomes an additional target of this `selectedItems` association. Alternatively,
      * a selectedItem instance may be given.
      */
    vSelectedItem: String
    ): this.type = js.native
    def addSelectedItem(
      /**
      * Id of a selectedItem which becomes an additional target of this `selectedItems` association. Alternatively,
      * a selectedItem instance may be given.
      */
    vSelectedItem: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:propertyChanged propertyChanged} event of this
      * `sap.ui.ux3.Collection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Collection` itself.
      *
      * Fires if a property has changed, and the collection inspector needs to do something after that
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPropertyChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPropertyChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Collection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:propertyChanged propertyChanged} event of this
      * `sap.ui.ux3.Collection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Collection` itself.
      *
      * Fires if a property has changed, and the collection inspector needs to do something after that
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPropertyChanged(
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
    def attachPropertyChanged(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Collection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.ux3.Collection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Collection` itself.
      *
      * Fired when ever the selected items changer
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Collection` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.ux3.Collection`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.Collection` itself.
      *
      * Fired when ever the selected items changer
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChanged(
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
    def attachSelectionChanged(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.Collection` itself
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
      * Detaches event handler `fnFunction` from the {@link #event:propertyChanged propertyChanged} event of
      * this `sap.ui.ux3.Collection`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPropertyChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPropertyChanged(
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
      * Detaches event handler `fnFunction` from the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.ux3.Collection`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelectionChanged(
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
      * Fires event {@link #event:propertyChanged propertyChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePropertyChanged(): this.type = js.native
    def firePropertyChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:selectionChanged selectionChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChanged(): this.type = js.native
    def fireSelectionChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getEditable editable}.
      *
      * If a collection is editable an edit button will be displayed below the list of items
      *
      * Default value is `false`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Items in the collection
      */
    def getItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMultiSelection multiSelection}.
      *
      * Allow multi selection of items in collection
      *
      * Default value is `false`.
      *
      * @returns Value of property `multiSelection`
      */
    def getMultiSelection(): Boolean = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getSelectedItems
      * selectedItems}.
      */
    def getSelectedItems(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Name for the collection
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Item` in the aggregation {@link #getItems items}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiCoreItemMod.default): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiCoreItemMod.default,
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
    def removeAllItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      *
      * @returns an array with the ids of the removed elements (might be empty)
      */
    def removeAllSelectedItems(): js.Array[String] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapUiCoreItemMod.default): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    def removeSelectedItem(/**
      * the selected item to remove or its index or ID
      */
    vSelectedItem: String): js.UndefOr[String | Null] = js.native
    /**
      *
      * @returns the ID of the removed selected item or `null`
      */
    def removeSelectedItem(/**
      * the selected item to remove or its index or ID
      */
    vSelectedItem: int): js.UndefOr[String | Null] = js.native
    def removeSelectedItem(
      /**
      * the selected item to remove or its index or ID
      */
    vSelectedItem: typings.openui5.sapUiCoreItemMod.default
    ): js.UndefOr[String | Null] = js.native
    
    /**
      * Sets a new value for property {@link #getEditable editable}.
      *
      * If a collection is editable an edit button will be displayed below the list of items
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditable(): this.type = js.native
    def setEditable(/**
      * New value for property `editable`
      */
    bEditable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMultiSelection multiSelection}.
      *
      * Allow multi selection of items in collection
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMultiSelection(): this.type = js.native
    def setMultiSelection(/**
      * New value for property `multiSelection`
      */
    bMultiSelection: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Name for the collection
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait CollectionSettings
    extends StObject
       with ElementSettings {
    
    /**
      * If a collection is editable an edit button will be displayed below the list of items
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Items in the collection
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Allow multi selection of items in collection
      */
    var multiSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires if a property has changed, and the collection inspector needs to do something after that
      */
    var propertyChanged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Contains all items that are currently selected
      */
    var selectedItems: js.UndefOr[js.Array[typings.openui5.sapUiCoreItemMod.default | String]] = js.undefined
    
    /**
      * Fired when ever the selected items changer
      */
    var selectionChanged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Name for the collection
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object CollectionSettings {
    
    inline def apply(): CollectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionSettings]
    }
    
    extension [Self <: CollectionSettings](x: Self) {
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMultiSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multiSelection", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectionUndefined: Self = StObject.set(x, "multiSelection", js.undefined)
      
      inline def setPropertyChanged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "propertyChanged", js.Any.fromFunction1(value))
      
      inline def setPropertyChangedUndefined: Self = StObject.set(x, "propertyChanged", js.undefined)
      
      inline def setSelectedItems(value: js.Array[typings.openui5.sapUiCoreItemMod.default | String]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSelectedItemsVarargs(value: (typings.openui5.sapUiCoreItemMod.default | String)*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setSelectionChanged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction1(value))
      
      inline def setSelectionChangedUndefined: Self = StObject.set(x, "selectionChanged", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
