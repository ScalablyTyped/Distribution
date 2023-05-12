package typings.openui5

import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMComboBoxTextFieldMod.ComboBoxTextFieldSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMComboBoxBaseMod {
  
  @JSImport("sap/m/ComboBoxBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.m.ComboBoxBase`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ComboBoxBase {
    def this(/**
      * Initial settings for the new control.
      */
    mSettings: ComboBoxBaseSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: String,
      /**
      * Initial settings for the new control.
      */
    mSettings: ComboBoxBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: Unit,
      /**
      * Initial settings for the new control.
      */
    mSettings: ComboBoxBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ComboBoxBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ComboBoxBase with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ComboBoxTextField.extend}.
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
    oClassInfo: ClassInfo[T, ComboBoxBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ComboBoxBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ComboBoxBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ComboBoxBase
    extends typings.openui5.sapMComboBoxTextFieldMod.default {
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the ID of the hidden label for the group header items
      *
      * @returns Id of hidden text
      */
    def _getGroupHeaderInvisibleText(): String = js.native
    
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
      * @SINCE 1.38
      *
      * Attaches event handler `fnFunction` to the {@link #event:loadItems loadItems} event of this `sap.m.ComboBoxBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ComboBoxBase` itself.
      *
      * This event is fired when the end user clicks the combo box button to open the dropdown list and the data
      * used to display items is not already loaded. Alternatively, it is fired after the user moves the cursor
      * to the combo box text field and perform an action that requires data to be loaded. For example, pressing
      * F4 to open the dropdown list or typing something in the text field fires the event.
      *
      * **Note:** Use this feature in performance critical scenarios only. Loading the data lazily (on demand)
      * to defer initialization has several implications for the end user experience. For example, the busy indicator
      * has to be shown while the items are being loaded and assistive technology software also has to announce
      * the state changes (which may be confusing for some screen reader users).
      *
      * **Note**: Currently the `sap.m.MultiComboBox` does not support this event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoadItems(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLoadItems(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ComboBoxBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.38
      *
      * Attaches event handler `fnFunction` to the {@link #event:loadItems loadItems} event of this `sap.m.ComboBoxBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ComboBoxBase` itself.
      *
      * This event is fired when the end user clicks the combo box button to open the dropdown list and the data
      * used to display items is not already loaded. Alternatively, it is fired after the user moves the cursor
      * to the combo box text field and perform an action that requires data to be loaded. For example, pressing
      * F4 to open the dropdown list or typing something in the text field fires the event.
      *
      * **Note:** Use this feature in performance critical scenarios only. Loading the data lazily (on demand)
      * to defer initialization has several implications for the end user experience. For example, the busy indicator
      * has to be shown while the items are being loaded and assistive technology software also has to announce
      * the state changes (which may be confusing for some screen reader users).
      *
      * **Note**: Currently the `sap.m.MultiComboBox` does not support this event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoadItems(
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
    def attachLoadItems(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ComboBoxBase` itself
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Clears the selection. To be overwritten by subclasses.
      */
    def clearSelection(): Unit = js.native
    
    /**
      * Closes the control's picker popup.
      *
      * @returns `this` to allow method chaining.
      */
    def close(): this.type = js.native
    
    def configPicker(/**
      * Picker instance
      */
    oPicker: typings.openui5.sapMDialogMod.default): Unit = js.native
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Base method for picker configuration
      */
    def configPicker(/**
      * Picker instance
      */
    oPicker: typings.openui5.sapMPopoverMod.default): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Creates a picker popup container where the selection should take place. To be overwritten by subclasses.
      *
      * @returns The picker popup to be used.
      */
    def createPicker(/**
      * The picker type
      */
    sPickerType: String): typings.openui5.sapMPopoverMod.default | typings.openui5.sapMDialogMod.default = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * @SINCE 1.38
      *
      * Detaches event handler `fnFunction` from the {@link #event:loadItems loadItems} event of this `sap.m.ComboBoxBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLoadItems(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLoadItems(
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
      * @SINCE 1.38
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:loadItems loadItems} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLoadItems(): this.type = js.native
    def fireLoadItems(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @deprecated (since 1.86) - The enabled items should be managed by the application.
      *
      * Gets the enabled items from the aggregation named `items`.
      *
      * @returns An array containing the enabled items.
      */
    def getEnabledItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    def getEnabledItems(/**
      * Items to filter.
      */
    aItems: js.Array[typings.openui5.sapUiCoreItemMod.default]): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Gets the first item from the aggregation named `items`.
      *
      * @returns The first item, or `null` if there are no items.
      */
    def getFirstItem(): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.66
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the input properties, which should be forwarded from the combobox text field to the picker text
      * field
      *
      * @returns Array of the forwardable properties
      */
    def getInputForwardableProperties(): js.Array[Any] = js.native
    
    /**
      * Gets the item from the aggregation named `items` at the given 0-based index.
      *
      * @returns Item at the given index, or `null` if none.
      */
    def getItemAt(/**
      * Index of the item to return.
      */
    iIndex: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Gets the item with the given key from the aggregation named `items`.
      *  **Note:** If duplicate keys exist, the first item matching the key is returned.
      *
      * @returns The matching item
      */
    def getItemByKey(/**
      * An item key that specifies the item to retrieve.
      */
    sKey: String): typings.openui5.sapUiCoreItemMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the items contained within this control. **Note:** Disabled items are not visualized in the list
      * with the available options, however they can still be accessed through the aggregation.
      */
    def getItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Gets the last item from the aggregation named `items`.
      *
      * @returns The last item, or `null` if there are no items.
      */
    def getLastItem(): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * @deprecated (since 1.62) - The list structure should not be used as per SAP note: 2746748.
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the `list`.
      *
      * @returns The list instance object or `null`.
      */
    def getList(): typings.openui5.sapMListMod.default | Null = js.native
    
    /**
      * @deprecated (since 1.110)
      *
      * Gets current value of property {@link #getOpen open}.
      *
      * Indicates whether the picker is opened.
      *
      * Default value is `false`.
      *
      * @returns Value of property `open`
      */
    def getOpen(): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the control's picker popup.
      *
      * @returns The picker instance the `createPicker()` method.
      */
    def getPicker(): typings.openui5.sapMDialogMod.default | typings.openui5.sapMPopoverMod.default | Null = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the ID of the hidden label
      *
      * @returns Id of hidden text
      */
    def getPickerInvisibleTextId(): String = js.native
    
    /**
      * @SINCE 1.42
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the control's input from the picker.
      *
      * @returns Picker's input for filtering the list
      */
    def getPickerTextField(): typings.openui5.sapMComboBoxTextFieldMod.default | typings.openui5.sapMInputMod.default | Null = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the property `_sPickerType`
      *
      * @returns The picker type
      */
    def getPickerType(): String = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Gets the flag indicating whether the list items should be recreated
      *
      * @returns True if the list items should be recreated
      */
    def getRecreateItems(): Boolean = js.native
    
    /**
      * @SINCE 1.96
      *
      * Gets current value of property {@link #getShowClearIcon showClearIcon}.
      *
      * Specifies whether clear icon is shown. Pressing the icon will clear input's value.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showClearIcon`
      */
    def getShowClearIcon(): Boolean = js.native
    
    /**
      * @SINCE 1.60
      *
      * Gets current value of property {@link #getShowSecondaryValues showSecondaryValues}.
      *
      * Indicates whether the text values of the `additionalText` property of a {@link sap.ui.core.ListItem}
      * are shown.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showSecondaryValues`
      */
    def getShowSecondaryValues(): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires when an object gets inserted in the items aggregation.
      */
    def handleItemInsertion(/**
      * The item that should be inserted
      */
    oItem: typings.openui5.sapUiCoreItemMod.default): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires when an object gets removed from the items aggregation.
      */
    def handleItemRemoval(/**
      * The item that should be removed
      */
    oItem: typings.openui5.sapUiCoreItemMod.default): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Determines whether the control has content or not.
      *
      * @returns True if the control has content
      */
    def hasContent(): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Handles highlighting of items after filtering.
      */
    def highlightList(/**
      * The value of the item
      */
    sValue: String): Unit = js.native
    
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Finds the common items of two arrays
      *
      * @returns Array of unique items from both arrays
      */
    def intersectItems(
      /**
      * Array of Items
      */
    aItems: js.Array[typings.openui5.sapUiCoreItemMod.default],
      /**
      * Second array of items
      */
    aOtherItems: js.Array[typings.openui5.sapUiCoreItemMod.default]
    ): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Indicates whether the control's picker popup is open.
      *
      * @returns Determines whether the control's picker popup is currently open (this includes opening and closing
      * animations).
      */
    def isOpen(): Boolean = js.native
    
    /**
      * @SINCE 1.90
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Handles properties' changes of items in the aggregation named `items`.
      */
    def onItemChange(
      /**
      * The change event
      */
    oControlEvent: typings.openui5.sapUiBaseEventMod.default,
      /**
      * Indicates whether second values should be shown
      */
    bShowSecondaryValues: Boolean
    ): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Called when the composition of a passage of text has been completed or cancelled.
      */
    def oncompositionend(/**
      * The event object.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Opens the control's picker popup.
      *
      * @returns `this` to allow method chaining.
      */
    def open(): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
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
    
    /**
      * @SINCE 1.58
      *
      * Sets a custom filter function for items. The function accepts two parameters: - currenly typed value
      * in the input field - item to be matched The function should return a Boolean value (true or false) which
      * represents whether an item will be shown in the dropdown or not.
      *
      * @returns `this` to allow method chaining.
      */
    def setFilterFunction(
      /**
      * A callback function called when typing in a ComboBoxBase control or ancestor.
      */
    fnFilter: js.Function3[
          /* p1 */ String, 
          /* p2 */ typings.openui5.sapUiCoreItemMod.default, 
          /* p3 */ Boolean, 
          js.UndefOr[Boolean | js.Function]
        ]
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.110)
      *
      * Sets a new value for property {@link #getOpen open}.
      *
      * Indicates whether the picker is opened.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOpen(): this.type = js.native
    def setOpen(/**
      * New value for property `open`
      */
    bOpen: Boolean): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the property `_sPickerType`.
      */
    def setPickerType(/**
      * The picker type
      */
    sPickerType: String): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets whether the list items should be recreated.
      */
    def setRecreateItems(/**
      * True if the list items should be recreated
      */
    bRecreate: Boolean): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the selectable property of `sap.ui.core.Item`
      */
    def setSelectable(
      /**
      * The item to set the property
      */
    oItem: typings.openui5.sapUiCoreItemMod.default,
      /**
      * The selectable value
      */
    bSelectable: Boolean
    ): Unit = js.native
    
    /**
      * @SINCE 1.96
      *
      * Sets a new value for property {@link #getShowClearIcon showClearIcon}.
      *
      * Specifies whether clear icon is shown. Pressing the icon will clear input's value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowClearIcon(): this.type = js.native
    def setShowClearIcon(/**
      * New value for property `showClearIcon`
      */
    bShowClearIcon: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.60
      *
      * Sets a new value for property {@link #getShowSecondaryValues showSecondaryValues}.
      *
      * Indicates whether the text values of the `additionalText` property of a {@link sap.ui.core.ListItem}
      * are shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSecondaryValues(): this.type = js.native
    def setShowSecondaryValues(/**
      * New value for property `showSecondaryValues`
      */
    bShowSecondaryValues: Boolean): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the TextField handler
      */
    def setTextFieldHandler(/**
      * Text field instance
      */
    oTextField: typings.openui5.sapMComboBoxTextFieldMod.default): Unit = js.native
    def setTextFieldHandler(/**
      * Text field instance
      */
    oTextField: typings.openui5.sapMInputMod.default): Unit = js.native
    
    /**
      * @SINCE 1.64
      *
      * Opens the `SuggestionsPopover` with the available items.
      */
    def showItems(): Unit = js.native
    def showItems(/**
      * Function to filter the items shown in the SuggestionsPopover
      */
    fnFilter: js.Function): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Creates picker if doesn't exist yet and sync with Control items To be overwritten by subclasses.
      */
    def syncPickerContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait ComboBoxBaseSettings
    extends StObject
       with ComboBoxTextFieldSettings {
    
    /**
      * Defines the items contained within this control. **Note:** Disabled items are not visualized in the list
      * with the available options, however they can still be accessed through the aggregation.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38
      *
      * This event is fired when the end user clicks the combo box button to open the dropdown list and the data
      * used to display items is not already loaded. Alternatively, it is fired after the user moves the cursor
      * to the combo box text field and perform an action that requires data to be loaded. For example, pressing
      * F4 to open the dropdown list or typing something in the text field fires the event.
      *
      * **Note:** Use this feature in performance critical scenarios only. Loading the data lazily (on demand)
      * to defer initialization has several implications for the end user experience. For example, the busy indicator
      * has to be shown while the items are being loaded and assistive technology software also has to announce
      * the state changes (which may be confusing for some screen reader users).
      *
      * **Note**: Currently the `sap.m.MultiComboBox` does not support this event.
      */
    var loadItems: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @deprecated (since 1.110)
      *
      * Indicates whether the picker is opened.
      */
    var open: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.96
      *
      * Specifies whether clear icon is shown. Pressing the icon will clear input's value.
      */
    var showClearIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.60
      *
      * Indicates whether the text values of the `additionalText` property of a {@link sap.ui.core.ListItem}
      * are shown.
      */
    var showSecondaryValues: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ComboBoxBaseSettings {
    
    inline def apply(): ComboBoxBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboBoxBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComboBoxBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLoadItems(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "loadItems", js.Any.fromFunction1(value))
      
      inline def setLoadItemsUndefined: Self = StObject.set(x, "loadItems", js.undefined)
      
      inline def setOpen(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setShowClearIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showClearIcon", value.asInstanceOf[js.Any])
      
      inline def setShowClearIconUndefined: Self = StObject.set(x, "showClearIcon", js.undefined)
      
      inline def setShowSecondaryValues(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSecondaryValues", value.asInstanceOf[js.Any])
      
      inline def setShowSecondaryValuesUndefined: Self = StObject.set(x, "showSecondaryValues", js.undefined)
    }
  }
}
