package typings.openui5

import typings.openui5.anon.Item
import typings.openui5.anon.`13`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.SelectListKeyboardNavigationMode
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSelectListMod {
  
  @JSImport("sap/m/SelectList", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.m.SelectList`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SelectList {
    def this(/**
      * Initial settings for the new control.
      */
    mSettings: SelectListSettings) = this()
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
    mSettings: SelectListSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: Unit,
      /**
      * Initial settings for the new control.
      */
    mSettings: SelectListSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SelectList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.SelectList with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, SelectList]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SelectList],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.SelectList.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SelectList
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.27.0
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
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
      * @SINCE 1.32.4
      *
      * Attaches event handler `fnFunction` to the {@link #event:itemPress itemPress} event of this `sap.m.SelectList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectList` itself.
      *
      * This event is fired when an item is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.32.4
      *
      * Attaches event handler `fnFunction` to the {@link #event:itemPress itemPress} event of this `sap.m.SelectList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectList` itself.
      *
      * This event is fired when an item is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemPress(
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
    def attachItemPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.SelectList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectList` itself.
      *
      * This event is fired when the selection has changed.
      *
      * **Note: ** The selection can be changed by pressing a non-selected item or via keyboard and after the
      * enter or space key is pressed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.SelectList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectList` itself.
      *
      * This event is fired when the selection has changed.
      *
      * **Note: ** The selection can be changed by pressing a non-selected item or via keyboard and after the
      * enter or space key is pressed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectList` itself
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
      * Clear the selection.
      */
    def clearSelection(): Unit = js.native
    
    /**
      * Destroys all the items in the aggregation named `items`.
      *
      * @returns `this` to allow method chaining.
      */
    def destroyItems(): this.type = js.native
    
    /**
      * @SINCE 1.32.4
      *
      * Detaches event handler `fnFunction` from the {@link #event:itemPress itemPress} event of this `sap.m.SelectList`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemPress(
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
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.m.SelectList`.
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
      * @SINCE 1.32.4
      *
      * Fires event {@link #event:itemPress itemPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemPress(): this.type = js.native
    def fireItemPress(/**
      * Parameters to pass along with the event
      */
    mParameters: Item): this.type = js.native
    
    /**
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: `13`): this.type = js.native
    
    /**
      * @SINCE 1.27.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Retrieves the default selected item from the aggregation named `items`.
      */
    def getDefaultSelectedItem(): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def getDefaultSelectedItem(aItems: js.Array[typings.openui5.sapUiCoreItemMod.default]): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Indicates whether the user can change the selection.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets the enabled items from the aggregation named `items`.
      *
      * @returns An array containing the enabled items.
      */
    def getEnabledItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    def getEnabledItems(/**
      * items to filter
      */
    aItems: js.Array[typings.openui5.sapUiCoreItemMod.default]): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Gets the first item from the aggregation named `items`.
      *
      * @returns The first item, or `null` if there are no items.
      */
    def getFirstItem(): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.91
      *
      * Gets current value of property {@link #getHideDisabledItems hideDisabledItems}.
      *
      * Determines whether the disabled items are hidden from the DOM structure.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideDisabledItems`
      */
    def getHideDisabledItems(): Boolean = js.native
    
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
      *
      * **Note: ** If duplicate keys exists, the first item matching the key is returned.
      *
      * @returns The matched item or `null`
      */
    def getItemByKey(/**
      * An item key that specifies the item to retrieve.
      */
    sKey: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the items contained within this control.
      */
    def getItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * @SINCE 1.38
      *
      * Gets current value of property {@link #getKeyboardNavigationMode keyboardNavigationMode}.
      *
      * Defines the keyboard navigation mode.
      *
      * **Note:** The `sap.m.SelectListKeyboardNavigationMode.None` enumeration value, is only intended for use
      * in some composite controls that handles keyboard navigation by themselves.
      *
      * Default value is `Delimited`.
      *
      * @returns Value of property `keyboardNavigationMode`
      */
    def getKeyboardNavigationMode(): SelectListKeyboardNavigationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectListKeyboardNavigationMode * / any */ String) = js.native
    
    /**
      * Gets the enabled items from the aggregation named `items`.
      *
      * @returns The last item, or `null` if there are no items.
      */
    def getLastItem(): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Gets current value of property {@link #getMaxWidth maxWidth}.
      *
      * Sets the maximum width of the control.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `maxWidth`
      */
    def getMaxWidth(): CSSSize = js.native
    
    /**
      * Gets the selected item object from the aggregation named `items`.
      *
      * @returns The current target of the `selectedItem` association, or null.
      */
    def getSelectedItem(): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Gets current value of property {@link #getSelectedItemId selectedItemId}.
      *
      * ID of the selected item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `selectedItemId`
      */
    def getSelectedItemId(): String = js.native
    
    /**
      * Gets current value of property {@link #getSelectedKey selectedKey}.
      *
      * Key of the selected item.
      *
      * **Note: ** If duplicate keys exist, the first item matching the key is used.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `selectedKey`
      */
    def getSelectedKey(): String = js.native
    
    /**
      * @SINCE 1.32.3
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
      * Gets current value of property {@link #getWidth width}.
      *
      * Sets the width of the control.
      *
      * Default value is `"auto"`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
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
      * @SINCE 1.27.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the items in the aggregation named `items`. Additionally unregisters them from the hosting
      * UIArea.
      *
      * @returns An array of the removed items (might be empty).
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * @SINCE 1.27.0
      *
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeItem(/**
      * The item to remove or its index or id.
      */
    vItem: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Removes an item from the aggregation named `items`.
      *
      * @returns The removed item or `null`.
      */
    def removeItem(/**
      * The item to remove or its index or id.
      */
    vItem: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id.
      */
    vItem: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Indicates whether the user can change the selection.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.91
      *
      * Sets a new value for property {@link #getHideDisabledItems hideDisabledItems}.
      *
      * Determines whether the disabled items are hidden from the DOM structure.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideDisabledItems(): this.type = js.native
    def setHideDisabledItems(/**
      * New value for property `hideDisabledItems`
      */
    bHideDisabledItems: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.38
      *
      * Sets a new value for property {@link #getKeyboardNavigationMode keyboardNavigationMode}.
      *
      * Defines the keyboard navigation mode.
      *
      * **Note:** The `sap.m.SelectListKeyboardNavigationMode.None` enumeration value, is only intended for use
      * in some composite controls that handles keyboard navigation by themselves.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Delimited`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKeyboardNavigationMode(): this.type = js.native
    def setKeyboardNavigationMode(
      /**
      * New value for property `keyboardNavigationMode`
      */
    sKeyboardNavigationMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectListKeyboardNavigationMode * / any */ String
    ): this.type = js.native
    def setKeyboardNavigationMode(
      /**
      * New value for property `keyboardNavigationMode`
      */
    sKeyboardNavigationMode: SelectListKeyboardNavigationMode
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxWidth maxWidth}.
      *
      * Sets the maximum width of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxWidth(): this.type = js.native
    def setMaxWidth(/**
      * New value for property `maxWidth`
      */
    sMaxWidth: CSSSize): this.type = js.native
    
    /**
      * Sets the `selectedItem` association.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedItem(): this.type = js.native
    def setSelectedItem(
      /**
      * New value for the `selectedItem` association. If an ID of a `sap.ui.core.Item` is given, the item with
      * this ID becomes the `selectedItem` association. Alternatively, a `sap.ui.core.Item` instance may be given
      * or `null` to clear the selection.
      */
    vItem: String
    ): this.type = js.native
    def setSelectedItem(
      /**
      * New value for the `selectedItem` association. If an ID of a `sap.ui.core.Item` is given, the item with
      * this ID becomes the `selectedItem` association. Alternatively, a `sap.ui.core.Item` instance may be given
      * or `null` to clear the selection.
      */
    vItem: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Sets property `selectedItemId`.
      *
      * Default value is an empty string `""` or `undefined`.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedItemId(): this.type = js.native
    def setSelectedItemId(/**
      * New value for property `selectedItemId`.
      */
    vItem: String): this.type = js.native
    
    /**
      * Sets property `selectedKey`.
      *
      * Default value is an empty string `""` or `undefined`.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedKey(/**
      * New value for property `selectedKey`.
      */
    sKey: String): this.type = js.native
    
    /**
      * Updates and synchronizes `selectedItem` association, `selectedItemId` and `selectedKey` properties.
      */
    def setSelection(): Unit = js.native
    def setSelection(vItem: String): Unit = js.native
    def setSelection(vItem: typings.openui5.sapUiCoreItemMod.default): Unit = js.native
    
    /**
      * @SINCE 1.32.3
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
      * Sets a new value for property {@link #getWidth width}.
      *
      * Sets the width of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"auto"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait SelectListSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.27.0
      *
      * Association to controls / IDs which label this control (see WAI-ARIA attribute `aria-labelledby`).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Indicates whether the user can change the selection.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.91
      *
      * Determines whether the disabled items are hidden from the DOM structure.
      */
    var hideDisabledItems: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.32.4
      *
      * This event is fired when an item is pressed.
      */
    var itemPress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the items contained within this control.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38
      *
      * Defines the keyboard navigation mode.
      *
      * **Note:** The `sap.m.SelectListKeyboardNavigationMode.None` enumeration value, is only intended for use
      * in some composite controls that handles keyboard navigation by themselves.
      */
    var keyboardNavigationMode: js.UndefOr[
        SelectListKeyboardNavigationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectListKeyboardNavigationMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Sets the maximum width of the control.
      */
    var maxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets or retrieves the selected item from the aggregation named items.
      */
    var selectedItem: js.UndefOr[typings.openui5.sapUiCoreItemMod.default | String] = js.undefined
    
    /**
      * ID of the selected item.
      */
    var selectedItemId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Key of the selected item.
      *
      * **Note: ** If duplicate keys exist, the first item matching the key is used.
      */
    var selectedKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * This event is fired when the selection has changed.
      *
      * **Note: ** The selection can be changed by pressing a non-selected item or via keyboard and after the
      * enter or space key is pressed.
      */
    var selectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.32.3
      *
      * Indicates whether the text values of the `additionalText` property of a {@link sap.ui.core.ListItem}
      * are shown.
      */
    var showSecondaryValues: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the width of the control.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SelectListSettings {
    
    inline def apply(): SelectListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectListSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectListSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHideDisabledItems(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideDisabledItems", value.asInstanceOf[js.Any])
      
      inline def setHideDisabledItemsUndefined: Self = StObject.set(x, "hideDisabledItems", js.undefined)
      
      inline def setItemPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemPress", js.Any.fromFunction1(value))
      
      inline def setItemPressUndefined: Self = StObject.set(x, "itemPress", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKeyboardNavigationMode(
        value: SelectListKeyboardNavigationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectListKeyboardNavigationMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "keyboardNavigationMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardNavigationModeUndefined: Self = StObject.set(x, "keyboardNavigationMode", js.undefined)
      
      inline def setMaxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setSelectedItem(value: typings.openui5.sapUiCoreItemMod.default | String): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemId(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedItemId", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemIdUndefined: Self = StObject.set(x, "selectedItemId", js.undefined)
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setSelectedKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setShowSecondaryValues(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSecondaryValues", value.asInstanceOf[js.Any])
      
      inline def setShowSecondaryValuesUndefined: Self = StObject.set(x, "showSecondaryValues", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
