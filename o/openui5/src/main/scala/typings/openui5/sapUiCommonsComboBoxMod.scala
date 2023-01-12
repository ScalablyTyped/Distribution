package typings.openui5

import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsTextFieldMod.TextFieldSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsComboBoxMod {
  
  @JSImport("sap/ui/commons/ComboBox", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ComboBox.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ComboBox {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ComboBoxSettings) = this()
    def this(/**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: ComboBoxSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ComboBoxSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/ComboBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.ComboBox with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.commons.TextField.extend}.
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
    oClassInfo: ClassInfo[T, ComboBox]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ComboBox],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.ComboBox.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ComboBox
    extends typings.openui5.sapUiCommonsTextFieldMod.default {
    
    def _checkChange(
      /**
      * The event object.
      */
    oEvent: Event,
      /**
      * indicate whether the check should happen immediately or delayed (e.g. to avoid focusout / click double
      * event processing)
      */
    bImmediate: Boolean
    ): Unit = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiCoreListItemMod.default
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
    
    def fireChange(/**
      * the arguments to pass along with the event.
      */
    mArguments: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getDisplaySecondaryValues displaySecondaryValues}.
      *
      * Indicates whether the `additionalText` property that is available for `sap.ui.core.ListItem` shall be
      * displayed in the list.
      *
      * Default value is `false`.
      *
      * @returns Value of property `displaySecondaryValues`
      */
    def getDisplaySecondaryValues(): Boolean = js.native
    
    /**
      * Returns the DOM element which represents the icon for value help. Could be overwritten in child-classes.
      *
      * @returns The F4-element's DOM reference or `null`
      */
    def getF4ButtonDomRef(): Element | Null = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * `ListItems` (see `sap.ui.core.ListBox`) that shall be displayed in the list.
      */
    def getItems(): js.Array[typings.openui5.sapUiCoreListItemMod.default] = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getListBox listBox}, or `null`.
      */
    def getListBox(): ID = js.native
    
    /**
      * Gets current value of property {@link #getMaxPopupItems maxPopupItems}.
      *
      * Defines the number of items that shall be displayed at once. If the overall number of items is higher
      * than this setting, a scrollbar is provided.
      *
      * Default value is `10`.
      *
      * @returns Value of property `maxPopupItems`
      */
    def getMaxPopupItems(): int = js.native
    
    /**
      * Gets current value of property {@link #getSelectedItemId selectedItemId}.
      *
      * Id of the selected item. If the value has no corresponding item, the `selectedItemId` is empty.
      *
      * If the `selectedItemId` is set to a not existing item, it will not be changed.
      *
      * @returns Value of property `selectedItemId`
      */
    def getSelectedItemId(): String = js.native
    
    /**
      * Gets current value of property {@link #getSelectedKey selectedKey}.
      *
      * Key of the selected item.
      *
      * If the value has no corresponding item the key is empty.
      *
      * If duplicate keys exists the first item matching the key is used.
      *
      * If the key is set to a not existing value it will not be changed.
      *
      * @returns Value of property `selectedKey`
      */
    def getSelectedKey(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.core.ListItem` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiCoreListItemMod.default
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
    oItem: typings.openui5.sapUiCoreListItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Handle sapescape pseudo events on the control
      */
    def onsapescape(/**
      * The event object.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Handle saphide pseudo events on the control
      */
    def onsaphide(/**
      * The event object.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Handle sapnextmodifiers pseudo events on the control if in toolbar prevent item navigation if popup is
      * opened.
      */
    def onsapnextmodifiers(/**
      * The event object.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Handle sapshow pseudo events on the control
      */
    def onsapshow(/**
      * The event object.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiCoreListItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapUiCoreListItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapUiCoreListItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapUiCoreListItemMod.default
    ): typings.openui5.sapUiCoreListItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getDisplaySecondaryValues displaySecondaryValues}.
      *
      * Indicates whether the `additionalText` property that is available for `sap.ui.core.ListItem` shall be
      * displayed in the list.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplaySecondaryValues(): this.type = js.native
    def setDisplaySecondaryValues(/**
      * New value for property `displaySecondaryValues`
      */
    bDisplaySecondaryValues: Boolean): this.type = js.native
    
    def setListBox(
      /**
      * ID of an element which becomes the new target of this listBox association; alternatively, an element
      * instance may be given
      */
    oListBox: typings.openui5.sapUiCommonsListBoxMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getListBox listBox}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setListBox(
      /**
      * ID of an element which becomes the new target of this listBox association; alternatively, an element
      * instance may be given
      */
    oListBox: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxPopupItems maxPopupItems}.
      *
      * Defines the number of items that shall be displayed at once. If the overall number of items is higher
      * than this setting, a scrollbar is provided.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `10`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxPopupItems(): this.type = js.native
    def setMaxPopupItems(/**
      * New value for property `maxPopupItems`
      */
    iMaxPopupItems: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelectedItemId selectedItemId}.
      *
      * Id of the selected item. If the value has no corresponding item, the `selectedItemId` is empty.
      *
      * If the `selectedItemId` is set to a not existing item, it will not be changed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedItemId(): this.type = js.native
    def setSelectedItemId(/**
      * New value for property `selectedItemId`
      */
    sSelectedItemId: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelectedKey selectedKey}.
      *
      * Key of the selected item.
      *
      * If the value has no corresponding item the key is empty.
      *
      * If duplicate keys exists the first item matching the key is used.
      *
      * If the key is set to a not existing value it will not be changed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedKey(): this.type = js.native
    def setSelectedKey(/**
      * New value for property `selectedKey`
      */
    sSelectedKey: String): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait ComboBoxSettings
    extends StObject
       with TextFieldSettings {
    
    /**
      * Indicates whether the `additionalText` property that is available for `sap.ui.core.ListItem` shall be
      * displayed in the list.
      */
    var displaySecondaryValues: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * `ListItems` (see `sap.ui.core.ListBox`) that shall be displayed in the list.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreListItemMod.default] | typings.openui5.sapUiCoreListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Using this method, you provide a `ListBox` control. This allows reuse of item lists in different controls.
      * Either a control id can be used as new target, or a control instance.
      *
      * **Note:** The ListBox must not be rendered somewhere in the UI. But if you want to bind the `ListBox`
      * items to a model it must be in the control tree. So we suggest to add it as dependent somewhere (e.g.
      * to the view or the first used `ComboBox`). If it is not set as child or dependant to an other control
      * it will be automatically set as dependent to the first ComboBox where it is assigned.
      */
    var listBox: js.UndefOr[typings.openui5.sapUiCommonsListBoxMod.default | String] = js.undefined
    
    /**
      * Defines the number of items that shall be displayed at once. If the overall number of items is higher
      * than this setting, a scrollbar is provided.
      */
    var maxPopupItems: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Id of the selected item. If the value has no corresponding item, the `selectedItemId` is empty.
      *
      * If the `selectedItemId` is set to a not existing item, it will not be changed.
      */
    var selectedItemId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Key of the selected item.
      *
      * If the value has no corresponding item the key is empty.
      *
      * If duplicate keys exists the first item matching the key is used.
      *
      * If the key is set to a not existing value it will not be changed.
      */
    var selectedKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ComboBoxSettings {
    
    inline def apply(): ComboBoxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboBoxSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComboBoxSettings] (val x: Self) extends AnyVal {
      
      inline def setDisplaySecondaryValues(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displaySecondaryValues", value.asInstanceOf[js.Any])
      
      inline def setDisplaySecondaryValuesUndefined: Self = StObject.set(x, "displaySecondaryValues", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiCoreListItemMod.default] | typings.openui5.sapUiCoreListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiCoreListItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setListBox(value: typings.openui5.sapUiCommonsListBoxMod.default | String): Self = StObject.set(x, "listBox", value.asInstanceOf[js.Any])
      
      inline def setListBoxUndefined: Self = StObject.set(x, "listBox", js.undefined)
      
      inline def setMaxPopupItems(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxPopupItems", value.asInstanceOf[js.Any])
      
      inline def setMaxPopupItemsUndefined: Self = StObject.set(x, "maxPopupItems", js.undefined)
      
      inline def setSelectedItemId(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedItemId", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemIdUndefined: Self = StObject.set(x, "selectedItemId", js.undefined)
      
      inline def setSelectedKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
    }
  }
}
