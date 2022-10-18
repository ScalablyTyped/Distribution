package typings.openui5

import typings.openui5.anon.Collapsed
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMNotificationListBaseMod.NotificationListBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMNotificationListGroupMod {
  
  @JSImport("sap/m/NotificationListGroup", JSImport.Default)
  @js.native
  /**
    * Constructor for a new NotificationListGroup.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends NotificationListGroup {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: NotificationListGroupSettings) = this()
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
    mSettings: NotificationListGroupSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: NotificationListGroupSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/NotificationListGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.NotificationListGroup with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.NotificationListBase.extend}.
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
    oClassInfo: ClassInfo[T, NotificationListGroup]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, NotificationListGroup],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.NotificationListGroup.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait NotificationListGroup
    extends typings.openui5.sapMNotificationListBaseMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMNotificationListItemMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.44
      *
      * Attaches event handler `fnFunction` to the {@link #event:onCollapse onCollapse} event of this `sap.m.NotificationListGroup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.NotificationListGroup` itself.
      *
      * `onCollapse` event is called when collapse property value is changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOnCollapse(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachOnCollapse(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.NotificationListGroup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.44
      *
      * Attaches event handler `fnFunction` to the {@link #event:onCollapse onCollapse} event of this `sap.m.NotificationListGroup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.NotificationListGroup` itself.
      *
      * `onCollapse` event is called when collapse property value is changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOnCollapse(
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
    def attachOnCollapse(
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
      * Context object to call the event handler with. Defaults to this `sap.m.NotificationListGroup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * @SINCE 1.44
      *
      * Detaches event handler `fnFunction` from the {@link #event:onCollapse onCollapse} event of this `sap.m.NotificationListGroup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOnCollapse(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachOnCollapse(
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
      * @SINCE 1.44
      *
      * Fires event {@link #event:onCollapse onCollapse} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOnCollapse(): this.type = js.native
    def fireOnCollapse(/**
      * Parameters to pass along with the event
      */
    mParameters: Collapsed): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAutoPriority autoPriority}.
      *
      * Determines if the group will automatically set the priority based on the highest priority of its notifications
      * or get its priority from the `priority` property.
      *
      * Default value is `true`.
      *
      * @returns Value of property `autoPriority`
      */
    def getAutoPriority(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getCollapsed collapsed}.
      *
      * Determines if the group is collapsed or expanded.
      *
      * Default value is `false`.
      *
      * @returns Value of property `collapsed`
      */
    def getCollapsed(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableCollapseButtonWhenEmpty enableCollapseButtonWhenEmpty}.
      *
      * Determines if the collapse/expand button for an empty group is displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableCollapseButtonWhenEmpty`
      */
    def getEnableCollapseButtonWhenEmpty(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The NotificationListItems inside the group.
      */
    def getItems(): js.Array[typings.openui5.sapMNotificationListItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getShowEmptyGroup showEmptyGroup}.
      *
      * Determines if the group header/footer of the empty group will be always shown. By default groups with
      * 0 notifications are not shown.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showEmptyGroup`
      */
    def getShowEmptyGroup(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowItemsCounter showItemsCounter}.
      *
      * Determines if the items counter inside the group header will be visible.
      *
      * **Note:** Counter value represents the number of currently visible (loaded) items inside the group.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showItemsCounter`
      */
    def getShowItemsCounter(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.NotificationListItem` in the aggregation {@link #getItems items}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMNotificationListItemMod.default
    ): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMNotificationListItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapMNotificationListItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapMNotificationListItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapMNotificationListItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapMNotificationListItemMod.default
    ): typings.openui5.sapMNotificationListItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAutoPriority autoPriority}.
      *
      * Determines if the group will automatically set the priority based on the highest priority of its notifications
      * or get its priority from the `priority` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoPriority(): this.type = js.native
    def setAutoPriority(/**
      * New value for property `autoPriority`
      */
    bAutoPriority: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCollapsed collapsed}.
      *
      * Determines if the group is collapsed or expanded.
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
      * Sets a new value for property {@link #getEnableCollapseButtonWhenEmpty enableCollapseButtonWhenEmpty}.
      *
      * Determines if the collapse/expand button for an empty group is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableCollapseButtonWhenEmpty(): this.type = js.native
    def setEnableCollapseButtonWhenEmpty(
      /**
      * New value for property `enableCollapseButtonWhenEmpty`
      */
    bEnableCollapseButtonWhenEmpty: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowEmptyGroup showEmptyGroup}.
      *
      * Determines if the group header/footer of the empty group will be always shown. By default groups with
      * 0 notifications are not shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowEmptyGroup(): this.type = js.native
    def setShowEmptyGroup(/**
      * New value for property `showEmptyGroup`
      */
    bShowEmptyGroup: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowItemsCounter showItemsCounter}.
      *
      * Determines if the items counter inside the group header will be visible.
      *
      * **Note:** Counter value represents the number of currently visible (loaded) items inside the group.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowItemsCounter(): this.type = js.native
    def setShowItemsCounter(/**
      * New value for property `showItemsCounter`
      */
    bShowItemsCounter: Boolean): this.type = js.native
  }
  
  trait NotificationListGroupSettings
    extends StObject
       with NotificationListBaseSettings {
    
    /**
      * Determines if the group will automatically set the priority based on the highest priority of its notifications
      * or get its priority from the `priority` property.
      */
    var autoPriority: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines if the group is collapsed or expanded.
      */
    var collapsed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines if the collapse/expand button for an empty group is displayed.
      */
    var enableCollapseButtonWhenEmpty: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The NotificationListItems inside the group.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMNotificationListItemMod.default] | typings.openui5.sapMNotificationListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.44
      *
      * `onCollapse` event is called when collapse property value is changed
      */
    var onCollapse: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines if the group header/footer of the empty group will be always shown. By default groups with
      * 0 notifications are not shown.
      */
    var showEmptyGroup: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines if the items counter inside the group header will be visible.
      *
      * **Note:** Counter value represents the number of currently visible (loaded) items inside the group.
      */
    var showItemsCounter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object NotificationListGroupSettings {
    
    inline def apply(): NotificationListGroupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationListGroupSettings]
    }
    
    extension [Self <: NotificationListGroupSettings](x: Self) {
      
      inline def setAutoPriority(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoPriority", value.asInstanceOf[js.Any])
      
      inline def setAutoPriorityUndefined: Self = StObject.set(x, "autoPriority", js.undefined)
      
      inline def setCollapsed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setEnableCollapseButtonWhenEmpty(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableCollapseButtonWhenEmpty", value.asInstanceOf[js.Any])
      
      inline def setEnableCollapseButtonWhenEmptyUndefined: Self = StObject.set(x, "enableCollapseButtonWhenEmpty", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMNotificationListItemMod.default] | typings.openui5.sapMNotificationListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMNotificationListItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnCollapse(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
      
      inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      inline def setShowEmptyGroup(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showEmptyGroup", value.asInstanceOf[js.Any])
      
      inline def setShowEmptyGroupUndefined: Self = StObject.set(x, "showEmptyGroup", js.undefined)
      
      inline def setShowItemsCounter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showItemsCounter", value.asInstanceOf[js.Any])
      
      inline def setShowItemsCounterUndefined: Self = StObject.set(x, "showItemsCounter", js.undefined)
    }
  }
}
