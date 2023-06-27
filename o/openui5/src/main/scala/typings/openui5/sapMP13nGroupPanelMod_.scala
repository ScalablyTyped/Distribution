package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMP13nPanelMod.P13nPanelSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nGroupPanelMod_ {
  
  @JSImport("sap/m/P13nGroupPanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nGroupPanel.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends P13nGroupPanel {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nGroupPanelSettings) = this()
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
      * initial settings for the new control
      */
    mSettings: P13nGroupPanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nGroupPanelSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nGroupPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nGroupPanel with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.P13nPanel.extend}.
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
    oClassInfo: ClassInfo[T, P13nGroupPanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nGroupPanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.P13nGroupPanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nGroupPanel
    extends typings.openui5.sapMP13nPanelMod.default {
    
    /**
      * Adds some groupItem to the aggregation {@link #getGroupItems groupItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addGroupItem(
      /**
      * The groupItem to add; if empty, nothing is inserted
      */
    oGroupItem: typings.openui5.sapMP13nGroupItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:addGroupItem addGroupItem} event of this `sap.m.P13nGroupPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nGroupPanel` itself.
      *
      * Event raised if a `GroupItem` has been added.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAddGroupItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachAddGroupItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nGroupPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:addGroupItem addGroupItem} event of this `sap.m.P13nGroupPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nGroupPanel` itself.
      *
      * Event raised if a `GroupItem` has been added.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAddGroupItem(
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
    def attachAddGroupItem(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nGroupPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:removeGroupItem removeGroupItem} event of this
      * `sap.m.P13nGroupPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nGroupPanel` itself.
      *
      * Event raised if a `GroupItem` has been removed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRemoveGroupItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachRemoveGroupItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nGroupPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:removeGroupItem removeGroupItem} event of this
      * `sap.m.P13nGroupPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nGroupPanel` itself.
      *
      * Event raised if a `GroupItem` has been removed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRemoveGroupItem(
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
    def attachRemoveGroupItem(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nGroupPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:updateGroupItem updateGroupItem} event of this
      * `sap.m.P13nGroupPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nGroupPanel` itself.
      *
      * Event raised if a `GroupItem` has been updated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateGroupItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachUpdateGroupItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nGroupPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:updateGroupItem updateGroupItem} event of this
      * `sap.m.P13nGroupPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nGroupPanel` itself.
      *
      * Event raised if a `GroupItem` has been updated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateGroupItem(
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
    def attachUpdateGroupItem(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nGroupPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getGroupItems groupItems} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindGroupItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the groupItems in the aggregation {@link #getGroupItems groupItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyGroupItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:addGroupItem addGroupItem} event of this `sap.m.P13nGroupPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAddGroupItem(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachAddGroupItem(
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
      * Detaches event handler `fnFunction` from the {@link #event:removeGroupItem removeGroupItem} event of
      * this `sap.m.P13nGroupPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRemoveGroupItem(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachRemoveGroupItem(
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
      * Detaches event handler `fnFunction` from the {@link #event:updateGroupItem updateGroupItem} event of
      * this `sap.m.P13nGroupPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUpdateGroupItem(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachUpdateGroupItem(
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
      * Fires event {@link #event:addGroupItem addGroupItem} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAddGroupItem(): this.type = js.native
    def fireAddGroupItem(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:removeGroupItem removeGroupItem} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRemoveGroupItem(): this.type = js.native
    def fireRemoveGroupItem(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:updateGroupItem updateGroupItem} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUpdateGroupItem(): this.type = js.native
    def fireUpdateGroupItem(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getContainerQuery containerQuery}.
      *
      * Defines if `mediaQuery` or `ContainerResize` is used for a layout update. If `ConditionPanel` is used
      * in a dialog, the property must be set to true.
      *
      * Default value is `false`.
      *
      * @returns Value of property `containerQuery`
      */
    def getContainerQuery(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getGroupItems groupItems}.
      *
      * Defined group items.
      */
    def getGroupItems(): js.Array[typings.openui5.sapMP13nGroupItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getLayoutMode layoutMode}.
      *
      * Can be used to control the layout behavior. Default is "" which will automatically change the layout.
      * With "Desktop", "Table" or "Phone" you can set a fixed layout.
      *
      * @returns Value of property `layoutMode`
      */
    def getLayoutMode(): String = js.native
    
    /**
      * Gets current value of property {@link #getMaxGroups maxGroups}.
      *
      * Defines the maximum number of groups.
      *
      * Default value is `'-1'`.
      *
      * @returns Value of property `maxGroups`
      */
    def getMaxGroups(): String = js.native
    
    /**
      * Checks for the provided `sap.m.P13nGroupItem` in the aggregation {@link #getGroupItems groupItems}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfGroupItem(
      /**
      * The groupItem whose index is looked for
      */
    oGroupItem: typings.openui5.sapMP13nGroupItemMod.default
    ): int = js.native
    
    /**
      * Inserts a groupItem into the aggregation {@link #getGroupItems groupItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertGroupItem(
      /**
      * The groupItem to insert; if empty, nothing is inserted
      */
    oGroupItem: typings.openui5.sapMP13nGroupItemMod.default,
      /**
      * The `0`-based index the groupItem should be inserted at; for a negative value of `iIndex`, the groupItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the groupItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getGroupItems groupItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllGroupItems(): js.Array[typings.openui5.sapMP13nGroupItemMod.default] = js.native
    
    def removeGroupItem(/**
      * The groupItem to remove or its index or id
      */
    vGroupItem: String): typings.openui5.sapMP13nGroupItemMod.default | Null = js.native
    /**
      * Removes a groupItem from the aggregation {@link #getGroupItems groupItems}.
      *
      * @returns The removed groupItem or `null`
      */
    def removeGroupItem(/**
      * The groupItem to remove or its index or id
      */
    vGroupItem: int): typings.openui5.sapMP13nGroupItemMod.default | Null = js.native
    def removeGroupItem(
      /**
      * The groupItem to remove or its index or id
      */
    vGroupItem: typings.openui5.sapMP13nGroupItemMod.default
    ): typings.openui5.sapMP13nGroupItemMod.default | Null = js.native
    
    /**
      * @since 1.28
      *
      * Removes all invalid group conditions.
      */
    def removeInvalidConditions(): Unit = js.native
    
    /**
      * @since 1.28
      *
      * Removes all errors/warning states from of all group conditions.
      */
    def removeValidationErrors(): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getContainerQuery containerQuery}.
      *
      * Defines if `mediaQuery` or `ContainerResize` is used for a layout update. If `ConditionPanel` is used
      * in a dialog, the property must be set to true.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContainerQuery(): this.type = js.native
    def setContainerQuery(/**
      * New value for property `containerQuery`
      */
    bContainerQuery: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLayoutMode layoutMode}.
      *
      * Can be used to control the layout behavior. Default is "" which will automatically change the layout.
      * With "Desktop", "Table" or "Phone" you can set a fixed layout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutMode(): this.type = js.native
    def setLayoutMode(/**
      * New value for property `layoutMode`
      */
    sLayoutMode: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxGroups maxGroups}.
      *
      * Defines the maximum number of groups.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'-1'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxGroups(): this.type = js.native
    def setMaxGroups(/**
      * New value for property `maxGroups`
      */
    sMaxGroups: String): this.type = js.native
    
    /**
      * Setter for the supported operations array.
      */
    def setOperations(
      /**
      * array of operations `[sap.m.P13nConditionOperation.BT, sap.m.P13nConditionOperation.EQ]`
      */
    aOperations: js.Array[Any]
    ): Unit = js.native
    
    /**
      * Unbinds aggregation {@link #getGroupItems groupItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindGroupItems(): this.type = js.native
    
    /**
      * Checks if the entered or modified conditions are correct, marks invalid fields yellow (Warning) and opens
      * a popup message dialog to let the user know that some values are not correct or missing.
      *
      * @returns `True` if all conditions are valid, `false` otherwise.
      */
    def validateConditions(): Boolean = js.native
  }
  
  trait P13nGroupPanel$AddGroupItemEventParameters extends StObject
  
  trait P13nGroupPanel$RemoveGroupItemEventParameters extends StObject
  
  trait P13nGroupPanel$UpdateGroupItemEventParameters extends StObject
  
  type P13nGroupPanelAddGroupItemEvent = typings.openui5.sapUiBaseEventMod.default[P13nGroupPanel$AddGroupItemEventParameters]
  
  type P13nGroupPanelAddGroupItemEventParameters = P13nGroupPanel$AddGroupItemEventParameters
  
  type P13nGroupPanelRemoveGroupItemEvent = typings.openui5.sapUiBaseEventMod.default[P13nGroupPanel$RemoveGroupItemEventParameters]
  
  type P13nGroupPanelRemoveGroupItemEventParameters = P13nGroupPanel$RemoveGroupItemEventParameters
  
  trait P13nGroupPanelSettings
    extends StObject
       with P13nPanelSettings {
    
    /**
      * Event raised if a `GroupItem` has been added.
      */
    var addGroupItem: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Defines if `mediaQuery` or `ContainerResize` is used for a layout update. If `ConditionPanel` is used
      * in a dialog, the property must be set to true.
      */
    var containerQuery: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defined group items.
      */
    var groupItems: js.UndefOr[
        js.Array[typings.openui5.sapMP13nGroupItemMod.default] | typings.openui5.sapMP13nGroupItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Can be used to control the layout behavior. Default is "" which will automatically change the layout.
      * With "Desktop", "Table" or "Phone" you can set a fixed layout.
      */
    var layoutMode: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the maximum number of groups.
      */
    var maxGroups: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Event raised if a `GroupItem` has been removed.
      */
    var removeGroupItem: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Event raised if a `GroupItem` has been updated.
      */
    var updateGroupItem: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
  }
  object P13nGroupPanelSettings {
    
    inline def apply(): P13nGroupPanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nGroupPanelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: P13nGroupPanelSettings] (val x: Self) extends AnyVal {
      
      inline def setAddGroupItem(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "addGroupItem", js.Any.fromFunction1(value))
      
      inline def setAddGroupItemUndefined: Self = StObject.set(x, "addGroupItem", js.undefined)
      
      inline def setContainerQuery(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "containerQuery", value.asInstanceOf[js.Any])
      
      inline def setContainerQueryUndefined: Self = StObject.set(x, "containerQuery", js.undefined)
      
      inline def setGroupItems(
        value: js.Array[typings.openui5.sapMP13nGroupItemMod.default] | typings.openui5.sapMP13nGroupItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "groupItems", value.asInstanceOf[js.Any])
      
      inline def setGroupItemsUndefined: Self = StObject.set(x, "groupItems", js.undefined)
      
      inline def setGroupItemsVarargs(value: typings.openui5.sapMP13nGroupItemMod.default*): Self = StObject.set(x, "groupItems", js.Array(value*))
      
      inline def setLayoutMode(value: String | PropertyBindingInfo): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
      
      inline def setLayoutModeUndefined: Self = StObject.set(x, "layoutMode", js.undefined)
      
      inline def setMaxGroups(value: String | PropertyBindingInfo): Self = StObject.set(x, "maxGroups", value.asInstanceOf[js.Any])
      
      inline def setMaxGroupsUndefined: Self = StObject.set(x, "maxGroups", js.undefined)
      
      inline def setRemoveGroupItem(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "removeGroupItem", js.Any.fromFunction1(value))
      
      inline def setRemoveGroupItemUndefined: Self = StObject.set(x, "removeGroupItem", js.undefined)
      
      inline def setUpdateGroupItem(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "updateGroupItem", js.Any.fromFunction1(value))
      
      inline def setUpdateGroupItemUndefined: Self = StObject.set(x, "updateGroupItem", js.undefined)
    }
  }
  
  type P13nGroupPanelUpdateGroupItemEvent = typings.openui5.sapUiBaseEventMod.default[P13nGroupPanel$UpdateGroupItemEventParameters]
  
  type P13nGroupPanelUpdateGroupItemEventParameters = P13nGroupPanel$UpdateGroupItemEventParameters
}
