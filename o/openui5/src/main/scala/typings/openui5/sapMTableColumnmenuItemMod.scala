package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMTableColumnmenuEntryMod.EntrySettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTableColumnmenuItemMod {
  
  @JSImport("sap/m/table/columnmenu/Item", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Item`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Item {
    def this(/**
      * Initial settings for the new `Item`
      */
    mSettings: ItemSettings) = this()
    def this(/**
      * ID for the new `Item`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `Item`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new `Item`
      */
    mSettings: ItemSettings
    ) = this()
    def this(
      /**
      * ID for the new `Item`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new `Item`
      */
    mSettings: ItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/table/columnmenu/Item", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.table.columnmenu.Item with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.table.columnmenu.ItemBase.extend}.
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
    oClassInfo: ClassInfo[T, Item]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Item],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.table.columnmenu.Item.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Item
    extends typings.openui5.sapMTableColumnmenuItemBaseMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.table.columnmenu.Item`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.Item` itself.
      *
      * This event is fired when the Cancel button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.Item` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.table.columnmenu.Item`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.Item` itself.
      *
      * This event is fired when the Cancel button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.Item` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.table.columnmenu.Item`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.Item` itself.
      *
      * This event is fired when the Confirm button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.Item` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.table.columnmenu.Item`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.Item` itself.
      *
      * This event is fired when the Confirm button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachConfirm(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.Item` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:reset reset} event of this `sap.m.table.columnmenu.Item`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.Item` itself.
      *
      * This event is fired when the Reset button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachReset(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachReset(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.Item` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:reset reset} event of this `sap.m.table.columnmenu.Item`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.table.columnmenu.Item` itself.
      *
      * This event is fired when the Reset button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachReset(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachReset(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.table.columnmenu.Item` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.m.table.columnmenu.Item`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:confirm confirm} event of this `sap.m.table.columnmenu.Item`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:reset reset} event of this `sap.m.table.columnmenu.Item`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachReset(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachReset(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:cancel cancel} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCancel(): this.type = js.native
    def fireCancel(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:confirm confirm} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireConfirm(): this.type = js.native
    def fireConfirm(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:reset reset} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireReset(): this.type = js.native
    def fireReset(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the content that is shown when navigating to the item.
      */
    def getContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getLabel label}.
      *
      * Defines the label that is used for the item.
      *
      * @returns Value of property `label`
      */
    def getLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getResetButtonEnabled resetButtonEnabled}.
      *
      * Defines whether the Reset button is enabled when navigating to the item.
      *
      * Default value is `true`.
      *
      * @returns Value of property `resetButtonEnabled`
      */
    def getResetButtonEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowCancelButton showCancelButton}.
      *
      * Defines whether the Cancel button is shown when navigating to the item.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showCancelButton`
      */
    def getShowCancelButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowConfirmButton showConfirmButton}.
      *
      * Defines whether the Confirm button is shown when navigating to the item.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showConfirmButton`
      */
    def getShowConfirmButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowResetButton showResetButton}.
      *
      * Defines whether the Reset button is shown when navigating to the item.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showResetButton`
      */
    def getShowResetButton(): Boolean = js.native
    
    /**
      * Sets the aggregated {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContent(/**
      * The content to set
      */
    oContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the icon for the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLabel label}.
      *
      * Defines the label that is used for the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(/**
      * New value for property `label`
      */
    sLabel: String): this.type = js.native
  }
  
  trait Item$CancelEventParameters extends StObject
  
  trait Item$ConfirmEventParameters extends StObject
  
  trait Item$ResetEventParameters extends StObject
  
  type ItemCancelEvent = typings.openui5.sapUiBaseEventMod.default[Item$CancelEventParameters]
  
  type ItemCancelEventParameters = Item$CancelEventParameters
  
  type ItemConfirmEvent = typings.openui5.sapUiBaseEventMod.default[Item$ConfirmEventParameters]
  
  type ItemConfirmEventParameters = Item$ConfirmEventParameters
  
  type ItemResetEvent = typings.openui5.sapUiBaseEventMod.default[Item$ResetEventParameters]
  
  type ItemResetEventParameters = Item$ResetEventParameters
  
  trait ItemSettings
    extends StObject
       with EntrySettings {
    
    /**
      * This event is fired when the Cancel button is pressed.
      */
    var cancel: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * This event is fired when the Confirm button is pressed.
      */
    var confirm: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Defines the content that is shown when navigating to the item.
      */
    var content: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the icon for the item.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the label that is used for the item.
      */
    var label: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * This event is fired when the Reset button is pressed.
      */
    var reset: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Defines whether the Reset button is enabled when navigating to the item.
      */
    var resetButtonEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the Cancel button is shown when navigating to the item.
      */
    var showCancelButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the Confirm button is shown when navigating to the item.
      */
    var showConfirmButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the Reset button is shown when navigating to the item.
      */
    var showResetButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ItemSettings {
    
    inline def apply(): ItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemSettings] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setConfirm(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setReset(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setResetButtonEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "resetButtonEnabled", value.asInstanceOf[js.Any])
      
      inline def setResetButtonEnabledUndefined: Self = StObject.set(x, "resetButtonEnabled", js.undefined)
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setShowCancelButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
      
      inline def setShowCancelButtonUndefined: Self = StObject.set(x, "showCancelButton", js.undefined)
      
      inline def setShowConfirmButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showConfirmButton", value.asInstanceOf[js.Any])
      
      inline def setShowConfirmButtonUndefined: Self = StObject.set(x, "showConfirmButton", js.undefined)
      
      inline def setShowResetButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showResetButton", value.asInstanceOf[js.Any])
      
      inline def setShowResetButtonUndefined: Self = StObject.set(x, "showResetButton", js.undefined)
    }
  }
}
