package typings.openui5

import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMComboBoxBaseMod.ComboBoxBaseSettings
import typings.openui5.sapMInputBaseMod.InputBase$ChangeEventParameters
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMComboBoxMod {
  
  @JSImport("sap/m/ComboBox", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ComboBox.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/combo-box/ Combo Box}
    */
  open class default () extends ComboBox {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ComboBoxSettings) = this()
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
    mSettings: ComboBoxSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ComboBoxSettings
    ) = this()
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ComboBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ComboBox with name `sClassName` and enriches it with the information
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
      * Returns a metadata object for class sap.m.ComboBox.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ComboBox
    extends typings.openui5.sapMComboBoxBaseMod.default
       with /* was: sap.m.IToolbarInteractiveControl */ Object {
    
    var __implements__sap_m_IToolbarInteractiveControl: Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Configures the SuggestionsPopover's list.
      */
    def _configureList(/**
      * The list instance to be configured
      */
    oList: typings.openui5.sapMListMod.default): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.ComboBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ComboBox` itself.
      *
      * This event is fired when the user types something that matches with an item in the list; it is also fired
      * when the user presses on a list item, or when navigating via keyboard.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ComboBoxSelectionChangeEvent, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ComboBoxSelectionChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ComboBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.ComboBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ComboBox` itself.
      *
      * This event is fired when the user types something that matches with an item in the list; it is also fired
      * when the user presses on a list item, or when navigating via keyboard.
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
    fnFunction: js.Function1[/* p1 */ ComboBoxSelectionChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ ComboBoxSelectionChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ComboBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.m.ComboBox`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ComboBoxSelectionChangeEvent, Unit]
    ): this.type = js.native
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ComboBoxSelectionChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: ComboBox$ChangeEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ComboBox$SelectionChangeEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the default selected item from the aggregation named `items`.
      *
      * @returns Null, as there is no default selected item
      */
    def getDefaultSelectedItem(): Null = js.native
    
    /**
      * @since 1.46
      *
      * Gets current value of property {@link #getFilterSecondaryValues filterSecondaryValues}.
      *
      * Indicates whether the filter should check in both the `text` and the `additionalText` property of the
      * {@link sap.ui.core.ListItem} for the suggestion.
      *
      * Default value is `false`.
      *
      * @returns Value of property `filterSecondaryValues`
      */
    def getFilterSecondaryValues(): Boolean = js.native
    
    /**
      * Gets the selected item object from the aggregation named `items`.
      *
      * @returns The current target of the `selectedItem` association, or `null`.
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
      * **Note:** If duplicate keys exist, the first item matching the key is used.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `selectedKey`
      */
    def getSelectedKey(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This event handler will be called after the ComboBox Picker's List is rendered.
      */
    def onAfterRenderingList(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This event handler will be called after the ComboBox's Picker is rendered.
      */
    def onAfterRenderingPicker(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This event handler is called before the picker popup is opened.
      */
    def onBeforeOpen(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This event handler will be called before the ComboBox is rendered.
      */
    def onBeforeRendering(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This event handler will be called before the ComboBox' Picker of type `sap.m.Popover` is rendered.
      */
    def onBeforeRenderingDropdown(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This event handler will be called before the ComboBox Picker's List is rendered.
      */
    def onBeforeRenderingList(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This event handler will be called before the ComboBox's Picker is rendered.
      */
    def onBeforeRenderingPicker(): Unit = js.native
    
    /**
      * Called when the `ComboBox` is clicked or tapped.
      */
    def ontap(/**
      * The event object.
      */
    oEvent: Event): Unit = js.native
    
    /**
      * @since 1.46
      *
      * Sets a new value for property {@link #getFilterSecondaryValues filterSecondaryValues}.
      *
      * Indicates whether the filter should check in both the `text` and the `additionalText` property of the
      * {@link sap.ui.core.ListItem} for the suggestion.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterSecondaryValues(): this.type = js.native
    def setFilterSecondaryValues(/**
      * New value for property `filterSecondaryValues`
      */
    bFilterSecondaryValues: Boolean): this.type = js.native
    
    /**
      * Sets the `selectedItem` association.
      *
      * Default value is `null`.
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
      * Sets the `selectedItemId` property.
      *
      * Default value is an empty string `""` or `undefined`.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedItemId(): this.type = js.native
    def setSelectedItemId(
      /**
      * New value for property `selectedItemId`. If the provided `vItem` is an empty string `""` or `undefined`,
      * the selection is cleared. If the ID has no corresponding aggregated item, the selected item is not changed.
      */
    vItem: String
    ): this.type = js.native
    
    /**
      * Sets the `selectedKey` property.
      *
      * Default value is an empty string `""` or `undefined`.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedKey(
      /**
      * New value for property `selectedKey`. If the provided `sKey` is an empty string `""` or `undefined`,
      * the selection is cleared. If duplicate keys exist, the first item matching the key is selected. If a
      * key is set and no item exists with that key, the visual selection remains the same.
      */
    sKey: String
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Synchronizes the `selectedItem` association and the `selectedItemId` property.
      */
    def synchronizeSelection(): Unit = js.native
  }
  
  trait ComboBox$ChangeEventParameters
    extends StObject
       with InputBase$ChangeEventParameters {
    
    /**
      * Indicates whether the change event was caused by selecting an item in the list
      */
    var itemPressed: js.UndefOr[Boolean] = js.undefined
  }
  object ComboBox$ChangeEventParameters {
    
    inline def apply(): ComboBox$ChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboBox$ChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComboBox$ChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setItemPressed(value: Boolean): Self = StObject.set(x, "itemPressed", value.asInstanceOf[js.Any])
      
      inline def setItemPressedUndefined: Self = StObject.set(x, "itemPressed", js.undefined)
    }
  }
  
  trait ComboBox$SelectionChangeEventParameters extends StObject {
    
    /**
      * The selected item.
      */
    var selectedItem: js.UndefOr[typings.openui5.sapUiCoreItemMod.default] = js.undefined
  }
  object ComboBox$SelectionChangeEventParameters {
    
    inline def apply(): ComboBox$SelectionChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboBox$SelectionChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComboBox$SelectionChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setSelectedItem(value: typings.openui5.sapUiCoreItemMod.default): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    }
  }
  
  type ComboBoxChangeEvent = typings.openui5.sapUiBaseEventMod.default[ComboBox$ChangeEventParameters]
  
  type ComboBoxChangeEventParameters = ComboBox$ChangeEventParameters
  
  type ComboBoxSelectionChangeEvent = typings.openui5.sapUiBaseEventMod.default[ComboBox$SelectionChangeEventParameters]
  
  type ComboBoxSelectionChangeEventParameters = ComboBox$SelectionChangeEventParameters
  
  trait ComboBoxSettings
    extends StObject
       with ComboBoxBaseSettings {
    
    /**
      * This event is fired when the value in the text input field is changed in combination with one of the
      * following actions:
      *
      *
      * 	 - The focus leaves the text input field
      * 	 - The Enter key is pressed
      * 	 - An item in the list is selected
      */
    @JSName("change")
    var change_ComboBoxSettings: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ComboBox$ChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.46
      *
      * Indicates whether the filter should check in both the `text` and the `additionalText` property of the
      * {@link sap.ui.core.ListItem} for the suggestion.
      */
    var filterSecondaryValues: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
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
      * **Note:** If duplicate keys exist, the first item matching the key is used.
      */
    var selectedKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * This event is fired when the user types something that matches with an item in the list; it is also fired
      * when the user presses on a list item, or when navigating via keyboard.
      */
    var selectionChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ComboBox$SelectionChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
  }
  object ComboBoxSettings {
    
    inline def apply(): ComboBoxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComboBoxSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComboBoxSettings] (val x: Self) extends AnyVal {
      
      inline def setChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ComboBox$ChangeEventParameters] => Unit
      ): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setFilterSecondaryValues(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "filterSecondaryValues", value.asInstanceOf[js.Any])
      
      inline def setFilterSecondaryValuesUndefined: Self = StObject.set(x, "filterSecondaryValues", js.undefined)
      
      inline def setSelectedItem(value: typings.openui5.sapUiCoreItemMod.default | String): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemId(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedItemId", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemIdUndefined: Self = StObject.set(x, "selectedItemId", js.undefined)
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setSelectedKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setSelectionChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ComboBox$SelectionChangeEventParameters] => Unit
      ): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
    }
  }
}
