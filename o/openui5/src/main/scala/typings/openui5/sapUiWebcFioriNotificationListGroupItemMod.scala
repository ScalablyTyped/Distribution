package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.INotificationAction
import typings.openui5.sapUiWebcFioriLibraryMod.INotificationListItem
import typings.openui5.sapUiWebcMainLibraryMod.IListItem
import typings.openui5.sapUiWebcMainLibraryMod.Priority
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriNotificationListGroupItemMod {
  
  @JSImport("sap/ui/webc/fiori/NotificationListGroupItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `NotificationListGroupItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends NotificationListGroupItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: NotificationListGroupItemSettings) = this()
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
    mSettings: NotificationListGroupItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: NotificationListGroupItemSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_main_IListItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/NotificationListGroupItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.NotificationListGroupItem with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, NotificationListGroupItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NotificationListGroupItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.NotificationListGroupItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait NotificationListGroupItem
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IListItem {
    
    /**
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(/**
      * The action to add; if empty, nothing is inserted
      */
    oAction: INotificationAction): this.type = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: INotificationListItem): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.webc.fiori.NotificationListGroupItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.NotificationListGroupItem` itself.
      *
      * Fired when the `Close` button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.NotificationListGroupItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.webc.fiori.NotificationListGroupItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.NotificationListGroupItem` itself.
      *
      * Fired when the `Close` button is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
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
    def attachClose(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.NotificationListGroupItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggle toggle} event of this `sap.ui.webc.fiori.NotificationListGroupItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.NotificationListGroupItem` itself.
      *
      * Fired when the `sap.ui.webc.fiori.NotificationListGroupItem` is expanded/collapsed by user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggle(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToggle(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.NotificationListGroupItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggle toggle} event of this `sap.ui.webc.fiori.NotificationListGroupItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.NotificationListGroupItem` itself.
      *
      * Fired when the `sap.ui.webc.fiori.NotificationListGroupItem` is expanded/collapsed by user interaction.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggle(
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
    def attachToggle(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.NotificationListGroupItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.ui.webc.fiori.NotificationListGroupItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClose(
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
      * Detaches event handler `fnFunction` from the {@link #event:toggle toggle} event of this `sap.ui.webc.fiori.NotificationListGroupItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToggle(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachToggle(
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
      * Fires event {@link #event:close close} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClose(): this.type = js.native
    def fireClose(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:toggle toggle} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireToggle(): this.type = js.native
    def fireToggle(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getActions actions}.
      *
      * Defines the actions, displayed in the top-right area.
      *
      *  **Note:** use the `sap.ui.webc.fiori.NotificationAction` component.
      */
    def getActions(): js.Array[INotificationAction] = js.native
    
    /**
      * Gets current value of property {@link #getBusyDelay busyDelay}.
      *
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      *
      * Default value is `1000`.
      *
      * @returns Value of property `busyDelay`
      */
    def getBusyDelay(): int = js.native
    
    /**
      * Gets current value of property {@link #getCollapsed collapsed}.
      *
      * Defines if the group is collapsed or expanded.
      *
      * Default value is `false`.
      *
      * @returns Value of property `collapsed`
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the items of the `sap.ui.webc.fiori.NotificationListGroupItem`, usually `sap.ui.webc.fiori.NotificationListItem`
      * items.
      */
    def getItems(): js.Array[INotificationListItem] = js.native
    
    /**
      * Gets current value of property {@link #getPriority priority}.
      *
      * Defines the `priority` of the item. Available options are:
      * 	 - `None`
      * 	 - `Low`
      * 	 - `Medium`
      * 	 - `High`
      *
      * Default value is `None`.
      *
      * @returns Value of property `priority`
      */
    def getPriority(): Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getRead read}.
      *
      * Defines if the `notification` is new or has been already read.
      *
      *  **Note:** if set to `false` the `titleText` has bold font, if set to true - it has a normal font.
      *
      * Default value is `false`.
      *
      * @returns Value of property `read`
      */
    def getRead(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowClose showClose}.
      *
      * Defines if the `close` button would be displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showClose`
      */
    def getShowClose(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowCounter showCounter}.
      *
      * Defines if the items `counter` would be displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showCounter`
      */
    def getShowCounter(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitleText titleText}.
      *
      * Defines the `titleText` of the item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `titleText`
      */
    def getTitleText(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.INotificationAction` in the aggregation {@link #getActions
      * actions}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(/**
      * The action whose index is looked for
      */
    oAction: INotificationAction): int = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.fiori.INotificationListItem` in the aggregation {@link #getItems
      * items}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: INotificationListItem): int = js.native
    
    /**
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: INotificationAction,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: INotificationListItem,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): INotificationAction | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): INotificationAction | Null = js.native
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: INotificationAction): INotificationAction | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[INotificationAction] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[INotificationListItem] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): INotificationListItem | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): INotificationListItem | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: INotificationListItem): INotificationListItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getBusy busy}.
      *
      * Defines if a busy indicator would be displayed over the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBusy(): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBusyDelay busyDelay}.
      *
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1000`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBusyDelay(): this.type = js.native
    def setBusyDelay(/**
      * New value for property `busyDelay`
      */
    iBusyDelay: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCollapsed collapsed}.
      *
      * Defines if the group is collapsed or expanded.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCollapsed(): this.type = js.native
    def setCollapsed(/**
      * New value for property `collapsed`
      */
    bCollapsed: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPriority priority}.
      *
      * Defines the `priority` of the item. Available options are:
      * 	 - `None`
      * 	 - `Low`
      * 	 - `Medium`
      * 	 - `High`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPriority(): this.type = js.native
    def setPriority(
      /**
      * New value for property `priority`
      */
    sPriority: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String
    ): this.type = js.native
    def setPriority(/**
      * New value for property `priority`
      */
    sPriority: Priority): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRead read}.
      *
      * Defines if the `notification` is new or has been already read.
      *
      *  **Note:** if set to `false` the `titleText` has bold font, if set to true - it has a normal font.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRead(): this.type = js.native
    def setRead(/**
      * New value for property `read`
      */
    bRead: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowClose showClose}.
      *
      * Defines if the `close` button would be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowClose(): this.type = js.native
    def setShowClose(/**
      * New value for property `showClose`
      */
    bShowClose: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowCounter showCounter}.
      *
      * Defines if the items `counter` would be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCounter(): this.type = js.native
    def setShowCounter(/**
      * New value for property `showCounter`
      */
    bShowCounter: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleText titleText}.
      *
      * Defines the `titleText` of the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleText(): this.type = js.native
    def setTitleText(/**
      * New value for property `titleText`
      */
    sTitleText: String): this.type = js.native
  }
  
  trait NotificationListGroupItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the actions, displayed in the top-right area.
      *
      *  **Note:** use the `sap.ui.webc.fiori.NotificationAction` component.
      */
    var actions: js.UndefOr[
        js.Array[INotificationAction] | INotificationAction | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      */
    var busyDelay: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fired when the `Close` button is pressed.
      */
    var close: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines if the group is collapsed or expanded.
      */
    var collapsed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the items of the `sap.ui.webc.fiori.NotificationListGroupItem`, usually `sap.ui.webc.fiori.NotificationListItem`
      * items.
      */
    var items: js.UndefOr[
        js.Array[INotificationListItem] | INotificationListItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the `priority` of the item. Available options are:
      * 	 - `None`
      * 	 - `Low`
      * 	 - `Medium`
      * 	 - `High`
      */
    var priority: js.UndefOr[
        Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines if the `notification` is new or has been already read.
      *
      *  **Note:** if set to `false` the `titleText` has bold font, if set to true - it has a normal font.
      */
    var read: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines if the `close` button would be displayed.
      */
    var showClose: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines if the items `counter` would be displayed.
      */
    var showCounter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the `titleText` of the item.
      */
    var titleText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when the `sap.ui.webc.fiori.NotificationListGroupItem` is expanded/collapsed by user interaction.
      */
    var toggle: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object NotificationListGroupItemSettings {
    
    inline def apply(): NotificationListGroupItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationListGroupItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationListGroupItemSettings] (val x: Self) extends AnyVal {
      
      inline def setActions(
        value: js.Array[INotificationAction] | INotificationAction | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: INotificationAction*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setBusyDelay(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "busyDelay", value.asInstanceOf[js.Any])
      
      inline def setBusyDelayUndefined: Self = StObject.set(x, "busyDelay", js.undefined)
      
      inline def setClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCollapsed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setItems(
        value: js.Array[INotificationListItem] | INotificationListItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: INotificationListItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setPriority(
        value: Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setRead(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setShowClose(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
      
      inline def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
      
      inline def setShowCounter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCounter", value.asInstanceOf[js.Any])
      
      inline def setShowCounterUndefined: Self = StObject.set(x, "showCounter", js.undefined)
      
      inline def setTitleText(value: String | PropertyBindingInfo): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
      
      inline def setToggle(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
}
