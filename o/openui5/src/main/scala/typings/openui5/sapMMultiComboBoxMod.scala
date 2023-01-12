package typings.openui5

import typings.openui5.anon.ChangedItem
import typings.openui5.anon.`17`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMComboBoxBaseMod.ComboBoxBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMultiComboBoxMod {
  
  @JSImport("sap/m/MultiComboBox", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MultiComboBox.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/multi-combobox/ Multi-Combo Box}
    */
  open class default () extends MultiComboBox {
    def this(/**
      * initial settings for the new control
      */
    mSettings: MultiComboBoxSettings) = this()
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
    mSettings: MultiComboBoxSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: MultiComboBoxSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/MultiComboBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.MultiComboBox with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ComboBoxBase.extend}.
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
    oClassInfo: ClassInfo[T, MultiComboBox]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MultiComboBox],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.MultiComboBox.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MultiComboBox
    extends typings.openui5.sapMComboBoxBaseMod.default {
    
    /**
      * Adds some item `oItem` to the association named `selectedItems`.
      *
      * @returns `this` to allow method chaining.
      */
    def addSelectedItem(
      /**
      * The selected item to add; if empty, nothing is added.
      */
    oItem: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Adds selected items. Only items with valid keys are added as selected.
      *
      * @returns `this` to allow method chaining.
      */
    def addSelectedKeys(
      /**
      * An array of item keys that identifies the items to be added as selected
      */
    aKeys: js.Array[String]
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.MultiComboBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MultiComboBox` itself.
      *
      * Event is fired when selection of an item is changed. Note: please do not use the "change" event inherited
      * from sap.m.InputBase
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
      * Context object to call the event handler with. Defaults to this `sap.m.MultiComboBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.MultiComboBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MultiComboBox` itself.
      *
      * Event is fired when selection of an item is changed. Note: please do not use the "change" event inherited
      * from sap.m.InputBase
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
      * Context object to call the event handler with. Defaults to this `sap.m.MultiComboBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionFinish selectionFinish} event of this
      * `sap.m.MultiComboBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MultiComboBox` itself.
      *
      * Event is fired when user has finished a selection of items in a list box and list box has been closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionFinish(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionFinish(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MultiComboBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionFinish selectionFinish} event of this
      * `sap.m.MultiComboBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MultiComboBox` itself.
      *
      * Event is fired when user has finished a selection of items in a list box and list box has been closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionFinish(
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
    def attachSelectionFinish(
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
      * Context object to call the event handler with. Defaults to this `sap.m.MultiComboBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.m.MultiComboBox`.
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
      * Detaches event handler `fnFunction` from the {@link #event:selectionFinish selectionFinish} event of
      * this `sap.m.MultiComboBox`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionFinish(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelectionFinish(
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
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: ChangedItem): this.type = js.native
    
    /**
      * Fires event {@link #event:selectionFinish selectionFinish} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionFinish(): this.type = js.native
    def fireSelectionFinish(/**
      * Parameters to pass along with the event
      */
    mParameters: `17`): this.type = js.native
    
    /**
      * Retrieves the selected item objects from the association named `selectedItems`.
      *
      * @returns Array of sap.ui.core.Item instances. The current target of the `selectedItems` association.
      */
    def getSelectedItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getSelectedKeys selectedKeys}.
      *
      * Keys of the selected items. If the key has no corresponding item, no changes will apply. If duplicate
      * keys exists the first item matching the key is used.
      *
      * Default value is `[]`.
      *
      * @returns Value of property `selectedKeys`
      */
    def getSelectedKeys(): js.Array[String] = js.native
    
    /**
      * Gets current value of property {@link #getShowSelectAll showSelectAll}.
      *
      * Determines if the select all checkbox is visible on top of suggestions.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showSelectAll`
      */
    def getShowSelectAll(): Boolean = js.native
    
    /**
      * Checks whether an item is selected.
      *
      * @returns True if the item is selected.
      */
    def isItemSelected(/**
      * The item to check.
      */
    oItem: typings.openui5.sapUiCoreItemMod.default): Boolean = js.native
    
    /**
      * This hook method is called after the MultiComboBox's Pop-up is rendered.
      */
    def onAfterRenderingPicker(): Unit = js.native
    
    /**
      * This hook method is called before the MultiComboBox is rendered.
      */
    def onBeforeRendering(): Unit = js.native
    
    /**
      * Handles control click event.
      */
    def onclick(oEvent: Unit): Unit = js.native
    
    /**
      * Removes all the controls in the association named selectedItems.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSelectedItems(): js.Array[ID] = js.native
    
    /**
      * Removes a selected item from the association named `selectedItems`.
      *
      * @returns The removed item or `null`
      */
    def removeSelectedItem(/**
      * The item to be removed or its ID
      */
    oItem: typings.openui5.sapUiCoreItemMod.default): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeSelectedItem(/**
      * The item to be removed or its ID
      */
    oItem: ID): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Removes selected items. Only items with valid keys are removed.
      *
      * @returns The removed items
      */
    def removeSelectedKeys(/**
      * An array of item keys that identifies the items to be removed
      */
    aKeys: js.Array[String]): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Setter for association `selectedItems`.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedItems(): this.type = js.native
    def setSelectedItems(
      /**
      * new values for association `selectedItems`. Array of sap.ui.core.Item Id which becomes the new target
      * of this `selectedItems` association. Alternatively, an array of sap.ui.core.Item instance may be given
      * or null.
      */
    aItems: js.Array[String | typings.openui5.sapUiCoreItemMod.default]
    ): this.type = js.native
    
    /**
      * Sets a new value for property `selectedKeys`. Keys of the selected items. If the key has no corresponding
      * item, no changes will apply. If duplicate keys exists the first item matching the key is used. When called
      * with a value of null or undefined, the default value of the property will be restored. Default value
      * is [].
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedKeys(/**
      * Keys of items to be set as selected
      */
    aKeys: js.Array[String]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSelectAll showSelectAll}.
      *
      * Determines if the select all checkbox is visible on top of suggestions.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSelectAll(): this.type = js.native
    def setShowSelectAll(/**
      * New value for property `showSelectAll`
      */
    bShowSelectAll: Boolean): this.type = js.native
    
    def syncPickerContent(/**
      * Force MultiComboBox to SuggestionPopover sync
      */
    bForceListSync: Boolean): typings.openui5.sapMDialogMod.default | typings.openui5.sapMPopoverMod.default = js.native
  }
  
  trait MultiComboBoxSettings
    extends StObject
       with ComboBoxBaseSettings {
    
    /**
      * Provides getter and setter for the selected items from the aggregation named items.
      */
    var selectedItems: js.UndefOr[js.Array[typings.openui5.sapUiCoreItemMod.default | String]] = js.undefined
    
    /**
      * Keys of the selected items. If the key has no corresponding item, no changes will apply. If duplicate
      * keys exists the first item matching the key is used.
      */
    var selectedKeys: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when selection of an item is changed. Note: please do not use the "change" event inherited
      * from sap.m.InputBase
      */
    var selectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event is fired when user has finished a selection of items in a list box and list box has been closed.
      */
    var selectionFinish: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines if the select all checkbox is visible on top of suggestions.
      */
    var showSelectAll: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MultiComboBoxSettings {
    
    inline def apply(): MultiComboBoxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiComboBoxSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiComboBoxSettings] (val x: Self) extends AnyVal {
      
      inline def setSelectedItems(value: js.Array[typings.openui5.sapUiCoreItemMod.default | String]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSelectedItemsVarargs(value: (typings.openui5.sapUiCoreItemMod.default | String)*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setSelectedKeys(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setSelectionFinish(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionFinish", js.Any.fromFunction1(value))
      
      inline def setSelectionFinishUndefined: Self = StObject.set(x, "selectionFinish", js.undefined)
      
      inline def setShowSelectAll(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSelectAll", value.asInstanceOf[js.Any])
      
      inline def setShowSelectAllUndefined: Self = StObject.set(x, "showSelectAll", js.undefined)
    }
  }
}
