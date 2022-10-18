package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.INotificationAction
import typings.openui5.sapUiWebcFioriLibraryMod.INotificationListItem
import typings.openui5.sapUiWebcMainLibraryMod.IAvatar
import typings.openui5.sapUiWebcMainLibraryMod.IListItem
import typings.openui5.sapUiWebcMainLibraryMod.Priority
import typings.openui5.sapUiWebcMainLibraryMod.WrappingType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriNotificationListItemMod {
  
  @JSImport("sap/ui/webc/fiori/NotificationListItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `NotificationListItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends NotificationListItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: NotificationListItemSettings) = this()
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
    mSettings: NotificationListItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: NotificationListItemSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_fiori_INotificationListItem: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_webc_main_IListItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/NotificationListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.NotificationListItem with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, NotificationListItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NotificationListItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.NotificationListItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait NotificationListItem
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with INotificationListItem
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
      * Adds some footnote to the aggregation {@link #getFootnotes footnotes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFootnote(
      /**
      * The footnote to add; if empty, nothing is inserted
      */
    oFootnote: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.webc.fiori.NotificationListItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.NotificationListItem` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.NotificationListItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.webc.fiori.NotificationListItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.NotificationListItem` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.NotificationListItem`
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
      * Destroys the avatar in the aggregation {@link #getAvatar avatar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAvatar(): this.type = js.native
    
    /**
      * Destroys all the footnotes in the aggregation {@link #getFootnotes footnotes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFootnotes(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.ui.webc.fiori.NotificationListItem`.
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
      * Gets content of aggregation {@link #getActions actions}.
      *
      * Defines the actions, displayed in the top-right area.
      *
      *  **Note:** use the `sap.ui.webc.fiori.NotificationAction` component.
      */
    def getActions(): js.Array[INotificationAction] = js.native
    
    /**
      * Gets content of aggregation {@link #getAvatar avatar}.
      *
      * Defines the avatar, displayed in the `sap.ui.webc.fiori.NotificationListItem`.
      *
      *
      *
      *  **Note:** Consider using the `sap.ui.webc.main.Avatar` to display icons, initials or images.
      *  **Note:**In order to be complaint with the UX guidlines and for best experience, we recommend using
      * avatars with 2rem X 2rem in size (32px X 32px). In case you are using the `sap.ui.webc.main.Avatar` you
      * can set its `size` property to `XS` to get the required size - `<ui5-avatar size="XS"></ui5-avatar>`.
      */
    def getAvatar(): IAvatar = js.native
    
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
      * Gets current value of property {@link #getDescription description}.
      *
      * Defines the content of the control
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getFootnotes footnotes}.
      *
      * Defines the elements, displayed in the footer of the of the component.
      */
    def getFootnotes(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
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
      * Gets current value of property {@link #getWrappingType wrappingType}.
      *
      * Defines if the `titleText` and `description` should wrap, they truncate by default.
      *
      *
      *
      *  **Note:** by default the `titleText` and `decription`, and a `ShowMore/Less` button would be displayed.
      *
      * Default value is `None`.
      *
      * @returns Value of property `wrappingType`
      */
    def getWrappingType(): WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) = js.native
    
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
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getFootnotes footnotes}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFootnote(
      /**
      * The footnote whose index is looked for
      */
    oFootnote: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
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
      * Inserts a footnote into the aggregation {@link #getFootnotes footnotes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFootnote(
      /**
      * The footnote to insert; if empty, nothing is inserted
      */
    oFootnote: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the footnote should be inserted at; for a negative value of `iIndex`, the footnote
      * is inserted at position 0; for a value greater than the current size of the aggregation, the footnote
      * is inserted at the last position
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
      * Removes all the controls from the aggregation {@link #getFootnotes footnotes}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFootnotes(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeFootnote(/**
      * The footnote to remove or its index or id
      */
    vFootnote: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a footnote from the aggregation {@link #getFootnotes footnotes}.
      *
      * @returns The removed footnote or `null`
      */
    def removeFootnote(/**
      * The footnote to remove or its index or id
      */
    vFootnote: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeFootnote(
      /**
      * The footnote to remove or its index or id
      */
    vFootnote: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets the aggregated {@link #getAvatar avatar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAvatar(/**
      * The avatar to set
      */
    oAvatar: IAvatar): this.type = js.native
    
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
      * Sets a new value for property {@link #getDescription description}.
      *
      * Defines the content of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(): this.type = js.native
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
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
    
    /**
      * Sets a new value for property {@link #getWrappingType wrappingType}.
      *
      * Defines if the `titleText` and `description` should wrap, they truncate by default.
      *
      *
      *
      *  **Note:** by default the `titleText` and `decription`, and a `ShowMore/Less` button would be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrappingType(): this.type = js.native
    def setWrappingType(
      /**
      * New value for property `wrappingType`
      */
    sWrappingType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String
    ): this.type = js.native
    def setWrappingType(/**
      * New value for property `wrappingType`
      */
    sWrappingType: WrappingType): this.type = js.native
  }
  
  trait NotificationListItemSettings
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
      * Defines the avatar, displayed in the `sap.ui.webc.fiori.NotificationListItem`.
      *
      *
      *
      *  **Note:** Consider using the `sap.ui.webc.main.Avatar` to display icons, initials or images.
      *  **Note:**In order to be complaint with the UX guidlines and for best experience, we recommend using
      * avatars with 2rem X 2rem in size (32px X 32px). In case you are using the `sap.ui.webc.main.Avatar` you
      * can set its `size` property to `XS` to get the required size - `<ui5-avatar size="XS"></ui5-avatar>`.
      */
    var avatar: js.UndefOr[IAvatar] = js.undefined
    
    /**
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      */
    var busyDelay: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fired when the `Close` button is pressed.
      */
    var close: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the content of the control
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the elements, displayed in the footer of the of the component.
      */
    var footnotes: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
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
      * Defines the `titleText` of the item.
      */
    var titleText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines if the `titleText` and `description` should wrap, they truncate by default.
      *
      *
      *
      *  **Note:** by default the `titleText` and `decription`, and a `ShowMore/Less` button would be displayed.
      */
    var wrappingType: js.UndefOr[
        WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object NotificationListItemSettings {
    
    inline def apply(): NotificationListItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationListItemSettings]
    }
    
    extension [Self <: NotificationListItemSettings](x: Self) {
      
      inline def setActions(
        value: js.Array[INotificationAction] | INotificationAction | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: INotificationAction*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setAvatar(value: IAvatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setBusyDelay(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "busyDelay", value.asInstanceOf[js.Any])
      
      inline def setBusyDelayUndefined: Self = StObject.set(x, "busyDelay", js.undefined)
      
      inline def setClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFootnotes(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "footnotes", value.asInstanceOf[js.Any])
      
      inline def setFootnotesUndefined: Self = StObject.set(x, "footnotes", js.undefined)
      
      inline def setFootnotesVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "footnotes", js.Array(value*))
      
      inline def setPriority(
        value: Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setRead(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setShowClose(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
      
      inline def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
      
      inline def setTitleText(value: String | PropertyBindingInfo): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
      
      inline def setWrappingType(
        value: WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "wrappingType", value.asInstanceOf[js.Any])
      
      inline def setWrappingTypeUndefined: Self = StObject.set(x, "wrappingType", js.undefined)
    }
  }
}
