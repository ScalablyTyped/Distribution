package typings.openui5

import typings.openui5.anon.Show
import typings.openui5.anon.Status
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiUx3LibraryMod.NotificationBarStatus
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3NotificationBarMod {
  
  @JSImport("sap/ui/ux3/NotificationBar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new NotificationBar.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends NotificationBar {
    def this(/**
      * initial settings for the new control
      */
    mSettings: NotificationBarSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: NotificationBarSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: NotificationBarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/NotificationBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.NotificationBar with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, NotificationBar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NotificationBar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.NotificationBar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait NotificationBar
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some notifier to the aggregation {@link #getNotifiers notifiers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addNotifier(
      /**
      * The notifier to add; if empty, nothing is inserted
      */
    oNotifier: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:display display} event of this `sap.ui.ux3.NotificationBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.NotificationBar` itself.
      *
      * Event is fired when the bar wants to be displayed depending on given flag. This allows the application
      * to decide what to do.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDisplay(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDisplay(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.NotificationBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:display display} event of this `sap.ui.ux3.NotificationBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.NotificationBar` itself.
      *
      * Event is fired when the bar wants to be displayed depending on given flag. This allows the application
      * to decide what to do.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDisplay(
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
    def attachDisplay(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.NotificationBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.12.2
      *
      * Attaches event handler `fnFunction` to the {@link #event:resize resize} event of this `sap.ui.ux3.NotificationBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.NotificationBar` itself.
      *
      * This event is thrown when the bar was resized (to the different valid states: Min, Max, Default, None).
      * The event itself can be used from SAPUI5-version 1.12.2 since there was a bug in the previous versions
      * firing this event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.NotificationBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.12.2
      *
      * Attaches event handler `fnFunction` to the {@link #event:resize resize} event of this `sap.ui.ux3.NotificationBar`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.NotificationBar` itself.
      *
      * This event is thrown when the bar was resized (to the different valid states: Min, Max, Default, None).
      * The event itself can be used from SAPUI5-version 1.12.2 since there was a bug in the previous versions
      * firing this event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachResize(
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
    def attachResize(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.NotificationBar` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the messageNotifier in the aggregation {@link #getMessageNotifier messageNotifier}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMessageNotifier(): this.type = js.native
    
    /**
      * Destroys all the notifiers in the aggregation {@link #getNotifiers notifiers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNotifiers(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:display display} event of this `sap.ui.ux3.NotificationBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDisplay(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDisplay(
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
      * @SINCE 1.12.2
      *
      * Detaches event handler `fnFunction` from the {@link #event:resize resize} event of this `sap.ui.ux3.NotificationBar`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachResize(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachResize(
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
      * Fires event {@link #event:display display} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDisplay(): this.type = js.native
    def fireDisplay(/**
      * Parameters to pass along with the event
      */
    mParameters: Show): this.type = js.native
    
    /**
      * @SINCE 1.12.2
      *
      * Fires event {@link #event:resize resize} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireResize(): this.type = js.native
    def fireResize(/**
      * Parameters to pass along with the event
      */
    mParameters: Status): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAlwaysShowToggler alwaysShowToggler}.
      *
      * This property defines if the toggler should be displayed the whole time when the NotificationBar is shown.
      *
      * Default value is `false`.
      *
      * @returns Value of property `alwaysShowToggler`
      */
    def getAlwaysShowToggler(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getMessageNotifier messageNotifier}.
      *
      * Notifier that shows messages
      */
    def getMessageNotifier(): typings.openui5.sapUiCoreElementMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getNotifiers notifiers}.
      *
      * Notifiers that monitor something within the application and display the corresponding notifications.
      */
    def getNotifiers(): js.Array[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getResizeEnabled resizeEnabled}.
      *
      * This property enables the bar to be resized by the user.
      *
      * Default value is `true`.
      *
      * @returns Value of property `resizeEnabled`
      */
    def getResizeEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisibleStatus visibleStatus}.
      *
      * This property displays the bar corresponding to given status
      *
      * Default value is `Default`.
      *
      * @returns Value of property `visibleStatus`
      */
    def getVisibleStatus(): NotificationBarStatus | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NotificationBarStatus * / any */ String) = js.native
    
    /**
      * This method checks if the NotificationBar has any items (notifications or messages) to show and returns
      * true if there are any items to show. So the application should decide if the bar should be displayed.
      */
    def hasItems(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Element` in the aggregation {@link #getNotifiers notifiers}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfNotifier(
      /**
      * The notifier whose index is looked for
      */
    oNotifier: typings.openui5.sapUiCoreElementMod.default
    ): int = js.native
    
    /**
      * Inserts a notifier into the aggregation {@link #getNotifiers notifiers}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertNotifier(
      /**
      * The notifier to insert; if empty, nothing is inserted
      */
    oNotifier: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The `0`-based index the notifier should be inserted at; for a negative value of `iIndex`, the notifier
      * is inserted at position 0; for a value greater than the current size of the aggregation, the notifier
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getNotifiers notifiers}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllNotifiers(): js.Array[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    def removeNotifier(/**
      * The notifier to remove or its index or id
      */
    vNotifier: String): typings.openui5.sapUiCoreElementMod.default | Null = js.native
    /**
      * Removes a notifier from the aggregation {@link #getNotifiers notifiers}.
      *
      * @returns The removed notifier or `null`
      */
    def removeNotifier(/**
      * The notifier to remove or its index or id
      */
    vNotifier: int): typings.openui5.sapUiCoreElementMod.default | Null = js.native
    def removeNotifier(
      /**
      * The notifier to remove or its index or id
      */
    vNotifier: typings.openui5.sapUiCoreElementMod.default
    ): typings.openui5.sapUiCoreElementMod.default | Null = js.native
    
    /**
      * @SINCE 1.22.11
      */
    def setAlwaysShowToggler(
      /**
      * if the toggler should be visible all the time set this parameter to **true**
      */
    bAlwaysShow: Boolean
    ): Unit = js.native
    
    /**
      * Sets the aggregated {@link #getMessageNotifier messageNotifier}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMessageNotifier(
      /**
      * The messageNotifier to set
      */
    oMessageNotifier: typings.openui5.sapUiCoreElementMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getResizeEnabled resizeEnabled}.
      *
      * This property enables the bar to be resized by the user.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResizeEnabled(): this.type = js.native
    def setResizeEnabled(/**
      * New value for property `resizeEnabled`
      */
    bResizeEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleStatus visibleStatus}.
      *
      * This property displays the bar corresponding to given status
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleStatus(): this.type = js.native
    def setVisibleStatus(
      /**
      * New value for property `visibleStatus`
      */
    sVisibleStatus: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NotificationBarStatus * / any */ String
    ): this.type = js.native
    def setVisibleStatus(/**
      * New value for property `visibleStatus`
      */
    sVisibleStatus: NotificationBarStatus): this.type = js.native
  }
  
  trait NotificationBarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This property defines if the toggler should be displayed the whole time when the NotificationBar is shown.
      */
    var alwaysShowToggler: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the bar wants to be displayed depending on given flag. This allows the application
      * to decide what to do.
      */
    var display: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Notifier that shows messages
      */
    var messageNotifier: js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.undefined
    
    /**
      * Notifiers that monitor something within the application and display the corresponding notifications.
      */
    var notifiers: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreElementMod.default] | typings.openui5.sapUiCoreElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.12.2
      *
      * This event is thrown when the bar was resized (to the different valid states: Min, Max, Default, None).
      * The event itself can be used from SAPUI5-version 1.12.2 since there was a bug in the previous versions
      * firing this event.
      */
    var resize: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This property enables the bar to be resized by the user.
      */
    var resizeEnabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property displays the bar corresponding to given status
      */
    var visibleStatus: js.UndefOr[
        NotificationBarStatus | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NotificationBarStatus * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object NotificationBarSettings {
    
    inline def apply(): NotificationBarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationBarSettings]
    }
    
    extension [Self <: NotificationBarSettings](x: Self) {
      
      inline def setAlwaysShowToggler(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "alwaysShowToggler", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowTogglerUndefined: Self = StObject.set(x, "alwaysShowToggler", js.undefined)
      
      inline def setDisplay(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "display", js.Any.fromFunction1(value))
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setMessageNotifier(value: typings.openui5.sapUiCoreElementMod.default): Self = StObject.set(x, "messageNotifier", value.asInstanceOf[js.Any])
      
      inline def setMessageNotifierUndefined: Self = StObject.set(x, "messageNotifier", js.undefined)
      
      inline def setNotifiers(
        value: js.Array[typings.openui5.sapUiCoreElementMod.default] | typings.openui5.sapUiCoreElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "notifiers", value.asInstanceOf[js.Any])
      
      inline def setNotifiersUndefined: Self = StObject.set(x, "notifiers", js.undefined)
      
      inline def setNotifiersVarargs(value: typings.openui5.sapUiCoreElementMod.default*): Self = StObject.set(x, "notifiers", js.Array(value*))
      
      inline def setResize(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      inline def setResizeEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "resizeEnabled", value.asInstanceOf[js.Any])
      
      inline def setResizeEnabledUndefined: Self = StObject.set(x, "resizeEnabled", js.undefined)
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setVisibleStatus(
        value: NotificationBarStatus | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NotificationBarStatus * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "visibleStatus", value.asInstanceOf[js.Any])
      
      inline def setVisibleStatusUndefined: Self = StObject.set(x, "visibleStatus", js.undefined)
    }
  }
}
