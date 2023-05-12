package typings.openui5

import typings.openui5.anon.Id
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsListBoxMod {
  
  @JSImport("sap/ui/commons/ListBox", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ListBox.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ListBox {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ListBoxSettings) = this()
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
    mSettings: ListBoxSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ListBoxSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/ListBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.ListBox with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ListBox]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ListBox],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.ListBox.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ListBox
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
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
      * Adds the given index to current selection. When multiple selection is disabled, this replaces the current
      * selection. When the given index is invalid, the call is ignored.
      *
      * @returns `this` to allow method chaining.
      */
    def addSelectedIndex(/**
      * Index to add to selection..
      */
    iSelectedIndex: int): this.type = js.native
    
    /**
      * Adds the given indices to selection. Any invalid indices are ignored.
      *
      * @returns `this` to allow method chaining.
      */
    def addSelectedIndices(
      /**
      * Indices of the items that shall additionally be selected.
      */
    aSelectedIndices: js.Array[int]
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.commons.ListBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.ListBox` itself.
      *
      * Event is fired when selection is changed by user interaction.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.ListBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.commons.ListBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.ListBox` itself.
      *
      * Event is fired when selection is changed by user interaction.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.ListBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Removes complete selection.
      *
      * @returns `this` to allow method chaining.
      */
    def clearSelection(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.commons.ListBox`.
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: Id): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAllowMultiSelect allowMultiSelect}.
      *
      * Determines whether multiple selection is allowed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `allowMultiSelect`
      */
    def getAllowMultiSelect(): Boolean = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getDisplayIcons displayIcons}.
      *
      * Determines whether the icons of the list items shall also be displayed. Enabling icons requires some
      * space to be reserved for them. Displaying icons can also influence the width and height of a single item,
      * which affects the overall height of the ListBox when defined in number of items. Note that the number
      * of icons that can be displayed in the ListBox depends on the size of the icons themselves and of the
      * total ListBox height.
      *
      * Default value is `false`.
      *
      * @returns Value of property `displayIcons`
      */
    def getDisplayIcons(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getDisplaySecondaryValues displaySecondaryValues}.
      *
      * Determines whether the text values from the additionalText property (see sap.ui.core.ListItems) shall
      * be displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `displaySecondaryValues`
      */
    def getDisplaySecondaryValues(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEditable editable}.
      *
      * Determines whether the ListBox is interactive or not. Can be used to disable interaction with mouse or
      * keyboard.
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Determines whether the ListBox is enabled or not. Can be used to disable interaction with mouse or keyboard.
      * Disabled controls have another color display depending on custom settings.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Control height as common CSS-size (px or % as unit, for example). The setting overrides any definitions
      * made for the setVisibleItems() method.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Aggregation of items to be displayed. Must be either of type sap.ui.core.ListItem or sap.ui.core.SeparatorItem.
      */
    def getItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMaxWidth maxWidth}.
      *
      * Determines the maximum width of the ListBox. If not set, there is no maximum width.
      *
      * @returns Value of property `maxWidth`
      */
    def getMaxWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getMinWidth minWidth}.
      *
      * Determines the minimum width of the ListBox. If not set, there is no minimum width.
      *
      * @returns Value of property `minWidth`
      */
    def getMinWidth(): CSSSize = js.native
    
    /**
      * Returns how many pixels the ListBox contents are currently scrolled down.
      *
      * @returns Vertical scroll position.
      */
    def getScrollTop(): int = js.native
    
    /**
      * Gets current value of property {@link #getSecondaryValueTextAlign secondaryValueTextAlign}.
      *
      * Determines the text alignment in the secondary ListBox text column (if available).
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `secondaryValueTextAlign`
      */
    def getSecondaryValueTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * Zero-based index of selected item. Index value for no selection is -1. When multiple selection is enabled
      * and multiple items are selected, the method returns the first selected item.
      *
      * @returns Selected index
      */
    def getSelectedIndex(): int = js.native
    
    /**
      * Zero-based indices of selected items, wrapped in an array. An empty array means "no selection".
      *
      * @returns Array of selected indices.
      */
    def getSelectedIndices(): js.Array[int] = js.native
    
    /**
      * Returns selected item. When no item is selected, "null" is returned. When multi-selection is enabled
      * and multiple items are selected, only the first selected item is returned.
      *
      * @returns Selected item
      */
    def getSelectedItem(): typings.openui5.sapUiCoreItemMod.default = js.native
    
    /**
      * Returns an array containing the selected items. In the case of no selection, an empty array is returned.
      *
      * @returns Selected items.
      */
    def getSelectedItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Returns the keys of the selected items in an array. If a selected item does not have a key, the respective
      * array entry will be undefined.
      *
      * @returns Array with selected keys.
      */
    def getSelectedKeys(): js.Array[String] = js.native
    
    /**
      * Gets current value of property {@link #getValueTextAlign valueTextAlign}.
      *
      * Determines the text alignment in the primary ListBox column.
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `valueTextAlign`
      */
    def getValueTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * Returns the number of visible items.
      *
      * @returns Number of visible items.
      */
    def getVisibleItems(): int = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Control width as common CSS-size (px or % as unit, for example).
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
      * Returns whether the given index is selected.
      *
      * @returns Whether index is selected.
      */
    def isIndexSelected(/**
      * Index which is checked for selection state.
      */
    iIndex: int): Boolean = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
    /**
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
      * Removes the given index from this selection. When the index is invalid or not selected, the call is ignored.
      *
      * @returns `this` to allow method chaining.
      */
    def removeSelectedIndex(/**
      * Index that shall be removed from selection.
      */
    iIndex: int): this.type = js.native
    
    /**
      * If the ListBox has a scroll bar because the number of items is larger than the number of visible items,
      * this method scrolls to the item with the given index. If there are enough items, this item will then
      * appear at the topmost visible position in the ListBox. If bLazy is true, it only scrolls as far as required
      * to make the item visible. Setting the scrollTop property and calling scrollToIndex are two operations
      * influencing the same "physical" property, so the last call "wins".
      *
      * @returns `this` to allow method chaining.
      */
    def scrollToIndex(
      /**
      * The index to which the ListBox should scroll.
      */
    iIndex: int,
      /**
      * If set to true, the ListBox only scrolls if the item is not completely visible, and it scrolls for exactly
      * the space to make it fully visible. If set to false, the item is scrolled to the top position (if possible).
      */
    bLazy: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAllowMultiSelect allowMultiSelect}.
      *
      * Determines whether multiple selection is allowed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAllowMultiSelect(): this.type = js.native
    def setAllowMultiSelect(/**
      * New value for property `allowMultiSelect`
      */
    bAllowMultiSelect: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayIcons displayIcons}.
      *
      * Determines whether the icons of the list items shall also be displayed. Enabling icons requires some
      * space to be reserved for them. Displaying icons can also influence the width and height of a single item,
      * which affects the overall height of the ListBox when defined in number of items. Note that the number
      * of icons that can be displayed in the ListBox depends on the size of the icons themselves and of the
      * total ListBox height.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayIcons(): this.type = js.native
    def setDisplayIcons(/**
      * New value for property `displayIcons`
      */
    bDisplayIcons: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplaySecondaryValues displaySecondaryValues}.
      *
      * Determines whether the text values from the additionalText property (see sap.ui.core.ListItems) shall
      * be displayed.
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
    
    /**
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Determines whether the ListBox is interactive or not. Can be used to disable interaction with mouse or
      * keyboard.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditable(): this.type = js.native
    def setEditable(/**
      * New value for property `editable`
      */
    bEditable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Determines whether the ListBox is enabled or not. Can be used to disable interaction with mouse or keyboard.
      * Disabled controls have another color display depending on custom settings.
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
      * Sets the height of this ListBox in CSS units.
      *
      * @returns `this` to allow method chaining.
      */
    def setHeight(/**
      * New height for the ListBox.
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Allows setting the list items as array for this instance of ListBox.
      *
      * @returns `this` to allow method chaining.
      */
    def setItems(
      /**
      * The items to set for this ListBox.
      */
    aItems: js.Array[typings.openui5.sapUiCoreListItemMod.default],
      /**
      * Optional boolean parameter to indicate that the formerly set items should be destroyed, instead of just
      * removed.
      */
    bDestroyItems: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxWidth maxWidth}.
      *
      * Determines the maximum width of the ListBox. If not set, there is no maximum width.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxWidth(): this.type = js.native
    def setMaxWidth(/**
      * New value for property `maxWidth`
      */
    sMaxWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinWidth minWidth}.
      *
      * Determines the minimum width of the ListBox. If not set, there is no minimum width.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinWidth(): this.type = js.native
    def setMinWidth(/**
      * New value for property `minWidth`
      */
    sMinWidth: CSSSize): this.type = js.native
    
    /**
      * Positions the ListBox contents so that they are scrolled-down by the given number of pixels.
      *
      * @returns `this` to allow method chaining.
      */
    def setScrollTop(/**
      * Vertical scroll position in pixels.
      */
    iScrollTop: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSecondaryValueTextAlign secondaryValueTextAlign}.
      *
      * Determines the text alignment in the secondary ListBox text column (if available).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Begin`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSecondaryValueTextAlign(): this.type = js.native
    def setSecondaryValueTextAlign(
      /**
      * New value for property `secondaryValueTextAlign`
      */
    sSecondaryValueTextAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String
    ): this.type = js.native
    def setSecondaryValueTextAlign(/**
      * New value for property `secondaryValueTextAlign`
      */
    sSecondaryValueTextAlign: TextAlign): this.type = js.native
    
    /**
      * Sets the zero-based index of the currently selected item. This method removes any previous selections.
      * When the given index is invalid, the call is ignored.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedIndex(/**
      * Index to be selected.
      */
    iSelectedIndex: int): this.type = js.native
    
    /**
      * Zero-based indices of selected items, wrapped in an array. An empty array means "no selection". When
      * multiple selection is disabled and multiple items are given, the selection is set to the index of the
      * first valid index in the given array. Any invalid indices are ignored. The previous selection is in any
      * case replaced.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedIndices(/**
      * Indices of the items to be selected.
      */
    aSelectedIndices: js.Array[int]): this.type = js.native
    
    /**
      * Keys of the items to be selected, wrapped in an array. An empty array means no selection. When multiple
      * selection is disabled, and multiple keys are given, the selection is set to the item with the first valid
      * key in the given array. Any invalid keys are ignored. The previous selection is replaced in any case.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedKeys(/**
      * The keys of the items to be selected.
      */
    aSelectedKeys: js.Array[String]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueTextAlign valueTextAlign}.
      *
      * Determines the text alignment in the primary ListBox column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Begin`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueTextAlign(): this.type = js.native
    def setValueTextAlign(
      /**
      * New value for property `valueTextAlign`
      */
    sValueTextAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String
    ): this.type = js.native
    def setValueTextAlign(/**
      * New value for property `valueTextAlign`
      */
    sValueTextAlign: TextAlign): this.type = js.native
    
    /**
      * Makes the ListBox render with a height that allows it to display exactly the given number of items.
      *
      * @returns `this` to allow method chaining.
      */
    def setVisibleItems(
      /**
      * The number of items that should fit into the ListBox without scrolling.
      */
    iItemCount: int
    ): this.type = js.native
    
    /**
      * Sets the width of this ListBox in CSS units.
      *
      * @returns `this` to allow method chaining.
      */
    def setWidth(/**
      * New width for the ListBox.
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait ListBoxSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Determines whether multiple selection is allowed.
      */
    var allowMultiSelect: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Association to controls / ids which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Determines whether the icons of the list items shall also be displayed. Enabling icons requires some
      * space to be reserved for them. Displaying icons can also influence the width and height of a single item,
      * which affects the overall height of the ListBox when defined in number of items. Note that the number
      * of icons that can be displayed in the ListBox depends on the size of the icons themselves and of the
      * total ListBox height.
      */
    var displayIcons: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the text values from the additionalText property (see sap.ui.core.ListItems) shall
      * be displayed.
      */
    var displaySecondaryValues: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the ListBox is interactive or not. Can be used to disable interaction with mouse or
      * keyboard.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the ListBox is enabled or not. Can be used to disable interaction with mouse or keyboard.
      * Disabled controls have another color display depending on custom settings.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Control height as common CSS-size (px or % as unit, for example). The setting overrides any definitions
      * made for the setVisibleItems() method.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Aggregation of items to be displayed. Must be either of type sap.ui.core.ListItem or sap.ui.core.SeparatorItem.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the maximum width of the ListBox. If not set, there is no maximum width.
      */
    var maxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the minimum width of the ListBox. If not set, there is no minimum width.
      */
    var minWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Scroll bar position from the top. Setting the scrollTop property and calling scrollToIndex are two operations
      * influencing the same "physical" property, so the last call "wins".
      */
    var scrollTop: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the text alignment in the secondary ListBox text column (if available).
      */
    var secondaryValueTextAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Event is fired when selection is changed by user interaction.
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines the text alignment in the primary ListBox column.
      */
    var valueTextAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The ListBox height in number of items that are initially displayed without scrolling. This setting overwrites
      * height settings in terms of CSS size that have been made. When the items have different heights, the
      * height of the first item is used for all other item height calculations. Note that if there are one or
      * more separators between the visible ListBox items, the displayed items might not relate 1:1 to the initially
      * specified number of items. When the value is retrieved, it equals the previously set value if it was
      * set; otherwise, it will be the number of items completely fitting into the ListBox without scrolling
      * in the case the control was already rendered. Note that if the control was not rendered, the behavior
      * will be undefined, it may return -1 or any other number.
      */
    var visibleItems: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Control width as common CSS-size (px or % as unit, for example).
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ListBoxSettings {
    
    inline def apply(): ListBoxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBoxSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListBoxSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowMultiSelect(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "allowMultiSelect", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiSelectUndefined: Self = StObject.set(x, "allowMultiSelect", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setDisplayIcons(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayIcons", value.asInstanceOf[js.Any])
      
      inline def setDisplayIconsUndefined: Self = StObject.set(x, "displayIcons", js.undefined)
      
      inline def setDisplaySecondaryValues(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displaySecondaryValues", value.asInstanceOf[js.Any])
      
      inline def setDisplaySecondaryValuesUndefined: Self = StObject.set(x, "displaySecondaryValues", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setScrollTop(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
      
      inline def setSecondaryValueTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "secondaryValueTextAlign", value.asInstanceOf[js.Any])
      
      inline def setSecondaryValueTextAlignUndefined: Self = StObject.set(x, "secondaryValueTextAlign", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setValueTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueTextAlign", value.asInstanceOf[js.Any])
      
      inline def setValueTextAlignUndefined: Self = StObject.set(x, "valueTextAlign", js.undefined)
      
      inline def setVisibleItems(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleItems", value.asInstanceOf[js.Any])
      
      inline def setVisibleItemsUndefined: Self = StObject.set(x, "visibleItems", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
