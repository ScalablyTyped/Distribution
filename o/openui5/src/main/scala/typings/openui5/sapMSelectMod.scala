package typings.openui5

import typings.openui5.anon.PreviousSelectedItem
import typings.openui5.anon.`16`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFLibraryMod.IShellBar
import typings.openui5.sapMLibraryMod.IOverflowToolbarContent
import typings.openui5.sapMLibraryMod.OverflowToolbarConfig
import typings.openui5.sapMLibraryMod.SelectColumnRatio
import typings.openui5.sapMLibraryMod.SelectType
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.ISemanticFormContent
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSelectMod {
  
  @JSImport("sap/m/Select", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.m.Select`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/select/ Select}
    */
  open class default () extends Select {
    def this(/**
      * Initial settings for the new control.
      */
    mSettings: SelectSettings) = this()
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
    mSettings: SelectSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given.
      */
    sId: Unit,
      /**
      * Initial settings for the new control.
      */
    mSettings: SelectSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_f_IShellBar: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_m_IOverflowToolbarContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_ISemanticFormContent: Boolean = js.native
    
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
    
    @JSImport("sap/m/Select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Select with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Select]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Select],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Select.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Select
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent
       with ISemanticFormContent
       with IOverflowToolbarContent
       with /* was: sap.m.IToolbarInteractiveControl */ Object
       with IShellBar {
    
    var __implements__sap_m_IToolbarInteractiveControl: Boolean = js.native
    
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
      * Adds an item to the aggregation named `items`.
      *
      * @returns `this` to allow method chaining.
      */
    def addItem(
      /**
      * The item to be added; if empty, nothing is added.
      */
    oItem: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.Select`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Select` itself.
      *
      * This event is fired when the value in the selection field is changed in combination with one of the following
      * actions:
      * 	 - The focus leaves the selection field
      * 	 - The Enter key is pressed
      * 	 - The item is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Select` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.Select`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Select` itself.
      *
      * This event is fired when the value in the selection field is changed in combination with one of the following
      * actions:
      * 	 - The focus leaves the selection field
      * 	 - The Enter key is pressed
      * 	 - The item is pressed
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Select` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.100
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.Select`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Select` itself.
      *
      * Fires when the user navigates through the `Select` items. It's also fired on revert of the currently
      * selected item.
      *
      * **Note:** Revert occurs in some of the following actions:
      * 	 - The user clicks outside of the `Select`
      * 	 - The Escape key is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLiveChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Select` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.100
      *
      * Attaches event handler `fnFunction` to the {@link #event:liveChange liveChange} event of this `sap.m.Select`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Select` itself.
      *
      * Fires when the user navigates through the `Select` items. It's also fired on revert of the currently
      * selected item.
      *
      * **Note:** Revert occurs in some of the following actions:
      * 	 - The user clicks outside of the `Select`
      * 	 - The Escape key is pressed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLiveChange(
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
    def attachLiveChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.Select` itself
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
      * @SINCE 1.16
      *
      * Closes the control's picker popup.
      *
      * @returns `this` to allow method chaining.
      */
    def close(): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Creates a picker popup container where the selection should take place.
      *
      * @returns The `sap.m.Popover` or `sap.m.Dialog` instance
      */
    def createPicker(/**
      * The picker type
      */
    sPickerType: String): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Destroys all the items in the aggregation named `items`.
      *
      * @returns `this` to allow method chaining.
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.Select`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachChange(
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
      * @SINCE 1.100
      *
      * Detaches event handler `fnFunction` from the {@link #event:liveChange liveChange} event of this `sap.m.Select`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLiveChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLiveChange(
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
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: PreviousSelectedItem): this.type = js.native
    
    /**
      * @SINCE 1.100
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:liveChange liveChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLiveChange(): this.type = js.native
    def fireLiveChange(/**
      * Parameters to pass along with the event
      */
    mParameters: `16`): this.type = js.native
    
    /**
      * @SINCE 1.27.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets current value of property {@link #getAutoAdjustWidth autoAdjustWidth}.
      *
      * Indicates whether the width of the input field is determined by the selected item's content.
      *
      * Default value is `false`.
      *
      * @returns Value of property `autoAdjustWidth`
      */
    def getAutoAdjustWidth(): Boolean = js.native
    
    /**
      * @SINCE 1.86
      *
      * Gets current value of property {@link #getColumnRatio columnRatio}.
      *
      * Determines the ratio between the first and the second column when secondary values are displayed.
      *
      * **Note:** This property takes effect only when the `showSecondaryValues` property is set to `true`.
      *
      * Default value is `"3:2"`.
      *
      * @returns Value of property `columnRatio`
      */
    def getColumnRatio(): SelectColumnRatio = js.native
    
    /**
      * @SINCE 1.66.0
      *
      * Gets current value of property {@link #getEditable editable}.
      *
      * Determines whether the user can modify the selected item. When the property is set to `false`, the control
      * appears as disabled but CAN still be focused.
      *
      * **Note:** When both `enabled` and `editable` properties are set to `false`, `enabled` has priority over
      * `editable`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Determines whether the user can modify the selected item. When the property is set to `false`, the control
      * appears as disabled and CANNOT be focused.
      *
      * **Note:** When both `enabled` and `editable` properties are set to `false`, `enabled` has priority over
      * `editable`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * @SINCE 1.22.0
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
      * @SINCE 1.16
      *
      * Gets the first item from the aggregation named `items`.
      *
      * @returns The first item, or `null` if there are no items.
      */
    def getFirstItem(): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.34
      *
      * Gets current value of property {@link #getForceSelection forceSelection}.
      *
      * Indicates whether the selection is restricted to one of the items in the list. **Note:** We strongly
      * recommend that you always set this property to `false` and bind the `selectedKey` property to the desired
      * value for better interoperability with data binding.
      *
      * Default value is `true`.
      *
      * @returns Value of property `forceSelection`
      */
    def getForceSelection(): Boolean = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets current value of property {@link #getIcon icon}.
      *
      * The URI to the icon that will be displayed only when using the `IconOnly` type.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets the item from the aggregation named `items` at the given 0-based index.
      *
      * @returns Item at the given index, or `null` if none.
      */
    def getItemAt(/**
      * Index of the item to return.
      */
    iIndex: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets the item with the given key from the aggregation named `items`.
      *
      * **Note: ** If duplicate keys exist, the first item matching the key is returned.
      *
      * @returns The `sap.ui.core.Item` instance or `null` if there is no such item
      */
    def getItemByKey(/**
      * An item key that specifies the item to be retrieved.
      */
    sKey: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Gets aggregation `items`.
      *
      * **Note**: This is the default aggregation.
      *
      * @returns The controls in the `items` aggregation
      */
    def getItems(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets the last item from the aggregation named `items`.
      *
      * @returns The last item, or `null` if there are no items.
      */
    def getLastItem(): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Gets current value of property {@link #getMaxWidth maxWidth}.
      *
      * Sets the maximum width of the control.
      *
      * **Note:** This property is ignored if the `autoAdjustWidth` property is set to `true`.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `maxWidth`
      */
    def getMaxWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * The name to be used in the HTML code (for example, for HTML forms that send data to the server via submit).
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Enables the `sap.m.Select` to move inside the sap.m.OverflowToolbar. Required by the {@link sap.m.IOverflowToolbarContent}
      * interface.
      *
      * @returns Configuration information for the `sap.m.IOverflowToolbarContent` interface.
      */
    def getOverflowToolbarConfig(): OverflowToolbarConfig = js.native
    
    /**
      * @SINCE 1.74
      *
      * Gets current value of property {@link #getRequired required}.
      *
      * Indicates that user input is required. This property is only needed for accessibility purposes when a
      * single relationship between the field and a label (see aggregation `labelFor` of `sap.m.Label`) cannot
      * be established (e.g. one label should label multiple fields).
      *
      * Default value is `false`.
      *
      * @returns Value of property `required`
      */
    def getRequired(): Boolean = js.native
    
    /**
      * @SINCE 1.77
      *
      * Gets current value of property {@link #getResetOnMissingKey resetOnMissingKey}.
      *
      * Modifies the behavior of the `setSelectedKey` method so that the selected item is cleared when a provided
      * selected key is missing.
      *
      * Default value is `false`.
      *
      * @returns Value of property `resetOnMissingKey`
      */
    def getResetOnMissingKey(): Boolean = js.native
    
    /**
      * Gets the selected item object from the aggregation named `items`.
      *
      * @returns The current target of the `selectedItem` association, or null.
      */
    def getSelectedItem(): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.12
      *
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
      * @SINCE 1.11
      *
      * Gets current value of property {@link #getSelectedKey selectedKey}.
      *
      * Key of the selected item.
      *
      * **Notes:**
      * 	 -  If duplicate keys exist, the first item matching the key is used.
      * 	 -  If invalid or none `selectedKey` is used, the first item is being selected.
      * 	 -  Invalid or missing `selectedKey` leads to severe functional issues in `sap.ui.table.Table`, when
      * 			the `sap.m.Select` is used inside a `sap.ui.table.Table` column.
      * 	 -  If an item with the default key exists and we try to select it, it happens only if the `forceSelection`
      * 			property is set to `true`.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `selectedKey`
      */
    def getSelectedKey(): String = js.native
    
    /**
      * @SINCE 1.40
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
      * @SINCE 1.28
      *
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Sets the horizontal alignment of the text within the input field.
      *
      * Default value is `Initial`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * @SINCE 1.28
      *
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Specifies the direction of the text within the input field with enumerated options. By default, the control
      * inherits text direction from the DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets current value of property {@link #getType type}.
      *
      * Type of a select. Possible values `Default`, `IconOnly`.
      *
      * Default value is `Default`.
      *
      * @returns Value of property `type`
      */
    def getType(): SelectType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectType * / any */ String) = js.native
    
    /**
      * @SINCE 1.40.2
      *
      * Gets current value of property {@link #getValueState valueState}.
      *
      * Visualizes the validation state of the control, e.g. `Error`, `Warning`, `Success`, `Information`.
      *
      * Default value is `None`.
      *
      * @returns Value of property `valueState`
      */
    def getValueState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * @SINCE 1.40.5
      *
      * Gets current value of property {@link #getValueStateText valueStateText}.
      *
      * Defines the text of the value state message popup. If this is not specified, a default text is shown
      * from the resource bundle.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `valueStateText`
      */
    def getValueStateText(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Sets the width of the field. By default, the field width is automatically adjusted to the size of its
      * content and the default width of the field is calculated based on the widest list item in the dropdown
      * list. If the width defined is smaller than its content, only the field width is changed whereas the dropdown
      * list keeps the width of its content. If the dropdown list is wider than the visual viewport, it is truncated
      * and an ellipsis is displayed for each item. For phones, the width of the dropdown list is always the
      * same as the viewport.
      *
      * **Note:** This property is ignored if the `autoAdjustWidth` property is set to `true`.
      *
      * Default value is `"auto"`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.69
      *
      * Gets current value of property {@link #getWrapItemsText wrapItemsText}.
      *
      * Determines whether the text in the items wraps on multiple lines when the available width is not enough.
      * When the text is truncated (`wrapItemsText` property is set to `false`), the max width of the `SelectList`
      * is 600px. When `wrapItemsText` is set to `true`, `SelectList` takes all of the available width.
      *
      * Default value is `false`.
      *
      * @returns Value of property `wrapItemsText`
      */
    def getWrapItemsText(): Boolean = js.native
    
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
      * Inserts an item into the aggregation named `items`.
      *
      * @returns `this` to allow method chaining.
      */
    def insertItem(
      /**
      * The item to be inserted; if empty, nothing is inserted.
      */
    oItem: typings.openui5.sapUiCoreItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position.
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Indicates whether the control's picker popup is opened.
      *
      * @returns Indicates whether the picker popup is currently open (this includes opening and closing animations).
      */
    def isOpen(): Boolean = js.native
    
    /**
      * @SINCE 1.16
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Open the control's picker popup.
      *
      * @returns `this` to allow method chaining.
      */
    def open(): this.type = js.native
    
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
      * The item to be removed or its index or ID.
      */
    vItem: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Removes an item from the aggregation named `items`.
      *
      * @returns The removed item or `null`.
      */
    def removeItem(/**
      * The item to be removed or its index or ID.
      */
    vItem: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to be removed or its index or ID.
      */
    vItem: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets a new value for property {@link #getAutoAdjustWidth autoAdjustWidth}.
      *
      * Indicates whether the width of the input field is determined by the selected item's content.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoAdjustWidth(): this.type = js.native
    def setAutoAdjustWidth(/**
      * New value for property `autoAdjustWidth`
      */
    bAutoAdjustWidth: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.86
      *
      * Sets a new value for property {@link #getColumnRatio columnRatio}.
      *
      * Determines the ratio between the first and the second column when secondary values are displayed.
      *
      * **Note:** This property takes effect only when the `showSecondaryValues` property is set to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"3:2"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnRatio(): this.type = js.native
    def setColumnRatio(/**
      * New value for property `columnRatio`
      */
    sColumnRatio: SelectColumnRatio): this.type = js.native
    
    /**
      * @SINCE 1.66.0
      *
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Determines whether the user can modify the selected item. When the property is set to `false`, the control
      * appears as disabled but CAN still be focused.
      *
      * **Note:** When both `enabled` and `editable` properties are set to `false`, `enabled` has priority over
      * `editable`.
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
      * Determines whether the user can modify the selected item. When the property is set to `false`, the control
      * appears as disabled and CANNOT be focused.
      *
      * **Note:** When both `enabled` and `editable` properties are set to `false`, `enabled` has priority over
      * `editable`.
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
      * @SINCE 1.34
      *
      * Sets a new value for property {@link #getForceSelection forceSelection}.
      *
      * Indicates whether the selection is restricted to one of the items in the list. **Note:** We strongly
      * recommend that you always set this property to `false` and bind the `selectedKey` property to the desired
      * value for better interoperability with data binding.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setForceSelection(): this.type = js.native
    def setForceSelection(/**
      * New value for property `forceSelection`
      */
    bForceSelection: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets a new value for property {@link #getIcon icon}.
      *
      * The URI to the icon that will be displayed only when using the `IconOnly` type.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxWidth maxWidth}.
      *
      * Sets the maximum width of the control.
      *
      * **Note:** This property is ignored if the `autoAdjustWidth` property is set to `true`.
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
      * Sets a new value for property {@link #getName name}.
      *
      * The name to be used in the HTML code (for example, for HTML forms that send data to the server via submit).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * @SINCE 1.74
      *
      * Sets a new value for property {@link #getRequired required}.
      *
      * Indicates that user input is required. This property is only needed for accessibility purposes when a
      * single relationship between the field and a label (see aggregation `labelFor` of `sap.m.Label`) cannot
      * be established (e.g. one label should label multiple fields).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRequired(): this.type = js.native
    def setRequired(/**
      * New value for property `required`
      */
    bRequired: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.77
      *
      * Sets a new value for property {@link #getResetOnMissingKey resetOnMissingKey}.
      *
      * Modifies the behavior of the `setSelectedKey` method so that the selected item is cleared when a provided
      * selected key is missing.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResetOnMissingKey(): this.type = js.native
    def setResetOnMissingKey(/**
      * New value for property `resetOnMissingKey`
      */
    bResetOnMissingKey: Boolean): this.type = js.native
    
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
      * or `null`. If the value of `null` is provided, the first enabled item will be selected (if any items
      * exist).
      */
    vItem: String
    ): this.type = js.native
    def setSelectedItem(
      /**
      * New value for the `selectedItem` association. If an ID of a `sap.ui.core.Item` is given, the item with
      * this ID becomes the `selectedItem` association. Alternatively, a `sap.ui.core.Item` instance may be given
      * or `null`. If the value of `null` is provided, the first enabled item will be selected (if any items
      * exist).
      */
    vItem: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.12
      *
      * Sets the `selectedItemId` property.
      *
      * Default value is an empty string `""` or `undefined`.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedItemId(): this.type = js.native
    def setSelectedItemId(
      /**
      * New value for property `selectedItemId`. If the provided `vItem` has a default value, the first enabled
      * item will be selected (if any items exist).
      */
    vItem: String
    ): this.type = js.native
    
    /**
      * @SINCE 1.11
      *
      * Sets property `selectedKey`.
      *
      * Default value is an empty string `""` or `undefined`.
      *
      * @returns `this` to allow method chaining.
      */
    def setSelectedKey(
      /**
      * New value for property `selectedKey`. If the `forceSelection` property is set to `true` and the provided
      * `sKey` is an empty string `""` or `undefined`, the value of `sKey` is changed to match the `key` of the
      * first enabled item and the first enabled item is selected (if any items exist).
      *
      * If an item with the default key exists and we try to select it, it happens only if the `forceSelection`
      * property is set to `true`. If duplicate keys exist, the first item matching the key is selected.
      */
    sKey: String
    ): this.type = js.native
    
    /**
      * @SINCE 1.40
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
      * @SINCE 1.28
      *
      * Sets a new value for property {@link #getTextAlign textAlign}.
      *
      * Sets the horizontal alignment of the text within the input field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Initial`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextAlign(): this.type = js.native
    def setTextAlign(
      /**
      * New value for property `textAlign`
      */
    sTextAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String
    ): this.type = js.native
    def setTextAlign(/**
      * New value for property `textAlign`
      */
    sTextAlign: TextAlign): this.type = js.native
    
    /**
      * @SINCE 1.28
      *
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * Specifies the direction of the text within the input field with enumerated options. By default, the control
      * inherits text direction from the DOM.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextDirection(): this.type = js.native
    def setTextDirection(
      /**
      * New value for property `textDirection`
      */
    sTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setTextDirection(/**
      * New value for property `textDirection`
      */
    sTextDirection: TextDirection): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets a new value for property {@link #getType type}.
      *
      * Type of a select. Possible values `Default`, `IconOnly`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: SelectType): this.type = js.native
    
    /**
      * @SINCE 1.40.2
      *
      * Sets a new value for property {@link #getValueState valueState}.
      *
      * Visualizes the validation state of the control, e.g. `Error`, `Warning`, `Success`, `Information`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueState(): this.type = js.native
    def setValueState(
      /**
      * New value for property `valueState`
      */
    sValueState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setValueState(/**
      * New value for property `valueState`
      */
    sValueState: ValueState): this.type = js.native
    
    /**
      * @SINCE 1.40.5
      *
      * Sets a new value for property {@link #getValueStateText valueStateText}.
      *
      * Defines the text of the value state message popup. If this is not specified, a default text is shown
      * from the resource bundle.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueStateText(): this.type = js.native
    def setValueStateText(/**
      * New value for property `valueStateText`
      */
    sValueStateText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Sets the width of the field. By default, the field width is automatically adjusted to the size of its
      * content and the default width of the field is calculated based on the widest list item in the dropdown
      * list. If the width defined is smaller than its content, only the field width is changed whereas the dropdown
      * list keeps the width of its content. If the dropdown list is wider than the visual viewport, it is truncated
      * and an ellipsis is displayed for each item. For phones, the width of the dropdown list is always the
      * same as the viewport.
      *
      * **Note:** This property is ignored if the `autoAdjustWidth` property is set to `true`.
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
      * @SINCE 1.69
      *
      * Sets the `wrapItemsText` property.
      *
      * @returns `this` to allow method chaining
      */
    def setWrapItemsText(bWrap: Boolean): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait SelectSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.27.0
      *
      * Association to controls / IDs which label this control (see WAI-ARIA attribute `aria-labelledby`).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * Indicates whether the width of the input field is determined by the selected item's content.
      */
    var autoAdjustWidth: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired when the value in the selection field is changed in combination with one of the following
      * actions:
      * 	 - The focus leaves the selection field
      * 	 - The Enter key is pressed
      * 	 - The item is pressed
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.86
      *
      * Determines the ratio between the first and the second column when secondary values are displayed.
      *
      * **Note:** This property takes effect only when the `showSecondaryValues` property is set to `true`.
      */
    var columnRatio: js.UndefOr[
        SelectColumnRatio | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.66.0
      *
      * Determines whether the user can modify the selected item. When the property is set to `false`, the control
      * appears as disabled but CAN still be focused.
      *
      * **Note:** When both `enabled` and `editable` properties are set to `false`, `enabled` has priority over
      * `editable`.
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the user can modify the selected item. When the property is set to `false`, the control
      * appears as disabled and CANNOT be focused.
      *
      * **Note:** When both `enabled` and `editable` properties are set to `false`, `enabled` has priority over
      * `editable`.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.34
      *
      * Indicates whether the selection is restricted to one of the items in the list. **Note:** We strongly
      * recommend that you always set this property to `false` and bind the `selectedKey` property to the desired
      * value for better interoperability with data binding.
      */
    var forceSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * The URI to the icon that will be displayed only when using the `IconOnly` type.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the items contained within this control.
      *
      * **Note:** For items with icons you can use {@link sap.ui.core.ListItem}.
      *
      * Example:
      *
      *
      * ```javascript
      *
      * ` <ListItem text="Paper plane" icon="sap-icon://paper-plane"></ListItem> `
      * ```
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.100
      *
      * Fires when the user navigates through the `Select` items. It's also fired on revert of the currently
      * selected item.
      *
      * **Note:** Revert occurs in some of the following actions:
      * 	 - The user clicks outside of the `Select`
      * 	 - The Escape key is pressed
      */
    var liveChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Sets the maximum width of the control.
      *
      * **Note:** This property is ignored if the `autoAdjustWidth` property is set to `true`.
      */
    var maxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The name to be used in the HTML code (for example, for HTML forms that send data to the server via submit).
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.74
      *
      * Indicates that user input is required. This property is only needed for accessibility purposes when a
      * single relationship between the field and a label (see aggregation `labelFor` of `sap.m.Label`) cannot
      * be established (e.g. one label should label multiple fields).
      */
    var required: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.77
      *
      * Modifies the behavior of the `setSelectedKey` method so that the selected item is cleared when a provided
      * selected key is missing.
      */
    var resetOnMissingKey: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets or retrieves the selected item from the aggregation named items.
      */
    var selectedItem: js.UndefOr[typings.openui5.sapUiCoreItemMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.12
      *
      * ID of the selected item.
      */
    var selectedItemId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.11
      *
      * Key of the selected item.
      *
      * **Notes:**
      * 	 -  If duplicate keys exist, the first item matching the key is used.
      * 	 -  If invalid or none `selectedKey` is used, the first item is being selected.
      * 	 -  Invalid or missing `selectedKey` leads to severe functional issues in `sap.ui.table.Table`, when
      * 			the `sap.m.Select` is used inside a `sap.ui.table.Table` column.
      * 	 -  If an item with the default key exists and we try to select it, it happens only if the `forceSelection`
      * 			property is set to `true`.
      */
    var selectedKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.40
      *
      * Indicates whether the text values of the `additionalText` property of a {@link sap.ui.core.ListItem}
      * are shown.
      */
    var showSecondaryValues: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.28
      *
      * Sets the horizontal alignment of the text within the input field.
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.28
      *
      * Specifies the direction of the text within the input field with enumerated options. By default, the control
      * inherits text direction from the DOM.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * Type of a select. Possible values `Default`, `IconOnly`.
      */
    var `type`: js.UndefOr[
        SelectType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.40.2
      *
      * Visualizes the validation state of the control, e.g. `Error`, `Warning`, `Success`, `Information`.
      */
    var valueState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.40.5
      *
      * Defines the text of the value state message popup. If this is not specified, a default text is shown
      * from the resource bundle.
      */
    var valueStateText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sets the width of the field. By default, the field width is automatically adjusted to the size of its
      * content and the default width of the field is calculated based on the widest list item in the dropdown
      * list. If the width defined is smaller than its content, only the field width is changed whereas the dropdown
      * list keeps the width of its content. If the dropdown list is wider than the visual viewport, it is truncated
      * and an ellipsis is displayed for each item. For phones, the width of the dropdown list is always the
      * same as the viewport.
      *
      * **Note:** This property is ignored if the `autoAdjustWidth` property is set to `true`.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.69
      *
      * Determines whether the text in the items wraps on multiple lines when the available width is not enough.
      * When the text is truncated (`wrapItemsText` property is set to `false`), the max width of the `SelectList`
      * is 600px. When `wrapItemsText` is set to `true`, `SelectList` takes all of the available width.
      */
    var wrapItemsText: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SelectSettings {
    
    inline def apply(): SelectSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setAutoAdjustWidth(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoAdjustWidth", value.asInstanceOf[js.Any])
      
      inline def setAutoAdjustWidthUndefined: Self = StObject.set(x, "autoAdjustWidth", js.undefined)
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setColumnRatio(
        value: SelectColumnRatio | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "columnRatio", value.asInstanceOf[js.Any])
      
      inline def setColumnRatioUndefined: Self = StObject.set(x, "columnRatio", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setForceSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "forceSelection", value.asInstanceOf[js.Any])
      
      inline def setForceSelectionUndefined: Self = StObject.set(x, "forceSelection", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLiveChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "liveChange", js.Any.fromFunction1(value))
      
      inline def setLiveChangeUndefined: Self = StObject.set(x, "liveChange", js.undefined)
      
      inline def setMaxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRequired(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResetOnMissingKey(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "resetOnMissingKey", value.asInstanceOf[js.Any])
      
      inline def setResetOnMissingKeyUndefined: Self = StObject.set(x, "resetOnMissingKey", js.undefined)
      
      inline def setSelectedItem(value: typings.openui5.sapUiCoreItemMod.default | String): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemId(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedItemId", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemIdUndefined: Self = StObject.set(x, "selectedItemId", js.undefined)
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setSelectedKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setShowSecondaryValues(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSecondaryValues", value.asInstanceOf[js.Any])
      
      inline def setShowSecondaryValuesUndefined: Self = StObject.set(x, "showSecondaryValues", js.undefined)
      
      inline def setTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setType(
        value: SelectType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValueState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
      
      inline def setValueStateText(value: String | PropertyBindingInfo): Self = StObject.set(x, "valueStateText", value.asInstanceOf[js.Any])
      
      inline def setValueStateTextUndefined: Self = StObject.set(x, "valueStateText", js.undefined)
      
      inline def setValueStateUndefined: Self = StObject.set(x, "valueState", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapItemsText(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "wrapItemsText", value.asInstanceOf[js.Any])
      
      inline def setWrapItemsTextUndefined: Self = StObject.set(x, "wrapItemsText", js.undefined)
    }
  }
}
