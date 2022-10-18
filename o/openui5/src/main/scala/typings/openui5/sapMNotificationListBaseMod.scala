package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMListItemBaseMod.ListItemBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.Priority
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMNotificationListBaseMod {
  
  @JSImport("sap/m/NotificationListBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `NotificationListBase`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends NotificationListBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: NotificationListBaseSettings) = this()
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
    mSettings: NotificationListBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: NotificationListBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/NotificationListBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.NotificationListBase with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListItemBase.extend}.
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
    oClassInfo: ClassInfo[T, NotificationListBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NotificationListBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.NotificationListBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait NotificationListBase
    extends typings.openui5.sapMListItemBaseMod.default {
    
    /**
      * Adds some button to the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addButton(
      /**
      * The button to add; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.m.NotificationListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.NotificationListBase` itself.
      *
      * Fired when the close button of the notification is pressed.
      * **Note:** Pressing the close button doesn't destroy the notification automatically.
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
      * Context object to call the event handler with. Defaults to this `sap.m.NotificationListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.m.NotificationListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.NotificationListBase` itself.
      *
      * Fired when the close button of the notification is pressed.
      * **Note:** Pressing the close button doesn't destroy the notification automatically.
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
      * Context object to call the event handler with. Defaults to this `sap.m.NotificationListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the NotificationListBase.
      */
    def close(): Unit = js.native
    
    /**
      * Destroys all the buttons in the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyButtons(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.m.NotificationListBase`.
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
      * Gets current value of property {@link #getAuthorName authorName}.
      *
      * Determines the notification author name.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `authorName`
      */
    def getAuthorName(): String = js.native
    
    /**
      * Gets current value of property {@link #getAuthorPicture authorPicture}.
      *
      * Determines the URL of the notification author picture.
      *
      * @returns Value of property `authorPicture`
      */
    def getAuthorPicture(): URI = js.native
    
    /**
      * Gets content of aggregation {@link #getButtons buttons}.
      *
      * Action buttons.
      */
    def getButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getDatetime datetime}.
      *
      * The time stamp of the Notification.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `datetime`
      */
    def getDatetime(): String = js.native
    
    /**
      * Gets current value of property {@link #getPriority priority}.
      *
      * Determines the priority of the Notification.
      *
      * Default value is `None`.
      *
      * @returns Value of property `priority`
      */
    def getPriority(): Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getShowButtons showButtons}.
      *
      * Determines the action buttons visibility.
      *
      * **Note:** Action buttons are not shown when Notification List Groups are collapsed.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showButtons`
      */
    def getShowButtons(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowCloseButton showCloseButton}.
      *
      * Determines the visibility of the close button.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showCloseButton`
      */
    def getShowCloseButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Determines the title of the NotificationListBase item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getButtons buttons}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfButton(/**
      * The button whose index is looked for
      */
    oButton: typings.openui5.sapMButtonMod.default): int = js.native
    
    /**
      * Inserts a button into the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertButton(
      /**
      * The button to insert; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the button should be inserted at; for a negative value of `iIndex`, the button is
      * inserted at position 0; for a value greater than the current size of the aggregation, the button is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getButtons buttons}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * Removes a button from the aggregation {@link #getButtons buttons}.
      *
      * @returns The removed button or `null`
      */
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeButton(
      /**
      * The button to remove or its index or id
      */
    vButton: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAuthorName authorName}.
      *
      * Determines the notification author name.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAuthorName(): this.type = js.native
    def setAuthorName(/**
      * New value for property `authorName`
      */
    sAuthorName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAuthorPicture authorPicture}.
      *
      * Determines the URL of the notification author picture.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAuthorPicture(/**
      * New value for property `authorPicture`
      */
    sAuthorPicture: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDatetime datetime}.
      *
      * The time stamp of the Notification.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDatetime(): this.type = js.native
    def setDatetime(/**
      * New value for property `datetime`
      */
    sDatetime: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPriority priority}.
      *
      * Determines the priority of the Notification.
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
      * Sets a new value for property {@link #getShowButtons showButtons}.
      *
      * Determines the action buttons visibility.
      *
      * **Note:** Action buttons are not shown when Notification List Groups are collapsed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowButtons(): this.type = js.native
    def setShowButtons(/**
      * New value for property `showButtons`
      */
    bShowButtons: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowCloseButton showCloseButton}.
      *
      * Determines the visibility of the close button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCloseButton(): this.type = js.native
    def setShowCloseButton(/**
      * New value for property `showCloseButton`
      */
    bShowCloseButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Determines the title of the NotificationListBase item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait NotificationListBaseSettings
    extends StObject
       with ListItemBaseSettings {
    
    /**
      * Determines the notification author name.
      */
    var authorName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the URL of the notification author picture.
      */
    var authorPicture: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Action buttons.
      */
    var buttons: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the close button of the notification is pressed.
      * **Note:** Pressing the close button doesn't destroy the notification automatically.
      */
    var close: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The time stamp of the Notification.
      */
    var datetime: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the priority of the Notification.
      */
    var priority: js.UndefOr[
        Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the action buttons visibility.
      *
      * **Note:** Action buttons are not shown when Notification List Groups are collapsed.
      */
    var showButtons: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the visibility of the close button.
      */
    var showCloseButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the title of the NotificationListBase item.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object NotificationListBaseSettings {
    
    inline def apply(): NotificationListBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationListBaseSettings]
    }
    
    extension [Self <: NotificationListBaseSettings](x: Self) {
      
      inline def setAuthorName(value: String | PropertyBindingInfo): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
      
      inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
      
      inline def setAuthorPicture(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "authorPicture", value.asInstanceOf[js.Any])
      
      inline def setAuthorPictureUndefined: Self = StObject.set(x, "authorPicture", js.undefined)
      
      inline def setButtons(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDatetime(value: String | PropertyBindingInfo): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setPriority(
        value: Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setShowButtons(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      inline def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      inline def setShowCloseButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
