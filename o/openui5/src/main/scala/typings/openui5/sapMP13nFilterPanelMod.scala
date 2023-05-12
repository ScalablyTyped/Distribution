package typings.openui5

import typings.openui5.anon.ItemData
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.P13nConditionOperation
import typings.openui5.sapMP13nPanelMod.P13nPanelSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nFilterPanelMod {
  
  @JSImport("sap/m/P13nFilterPanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nFilterPanel.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends P13nFilterPanel {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nFilterPanelSettings) = this()
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
    mSettings: P13nFilterPanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nFilterPanelSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nFilterPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nFilterPanel with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, P13nFilterPanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nFilterPanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.P13nFilterPanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nFilterPanel
    extends typings.openui5.sapMP13nPanelMod.default {
    
    /**
      * Adds some filterItem to the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFilterItem(
      /**
      * The filterItem to add; if empty, nothing is inserted
      */
    oFilterItem: typings.openui5.sapMP13nFilterItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:addFilterItem addFilterItem} event of this `sap.m.P13nFilterPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nFilterPanel` itself.
      *
      * Event raised if a filter item has been added.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAddFilterItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAddFilterItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nFilterPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:addFilterItem addFilterItem} event of this `sap.m.P13nFilterPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nFilterPanel` itself.
      *
      * Event raised if a filter item has been added.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAddFilterItem(
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
    def attachAddFilterItem(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nFilterPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.56)
      *
      * Attaches event handler `fnFunction` to the {@link #event:filterItemChanged filterItemChanged} event of
      * this `sap.m.P13nFilterPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nFilterPanel` itself.
      *
      * Event raised if a filter item has been changed. reason can be added, updated or removed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilterItemChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFilterItemChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nFilterPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @EXPERIMENTAL (since 1.56)
      *
      * Attaches event handler `fnFunction` to the {@link #event:filterItemChanged filterItemChanged} event of
      * this `sap.m.P13nFilterPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nFilterPanel` itself.
      *
      * Event raised if a filter item has been changed. reason can be added, updated or removed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilterItemChanged(
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
    def attachFilterItemChanged(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nFilterPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:removeFilterItem removeFilterItem} event of
      * this `sap.m.P13nFilterPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nFilterPanel` itself.
      *
      * Event raised if a filter item has been removed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRemoveFilterItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachRemoveFilterItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nFilterPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:removeFilterItem removeFilterItem} event of
      * this `sap.m.P13nFilterPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nFilterPanel` itself.
      *
      * Event raised if a filter item has been removed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRemoveFilterItem(
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
    def attachRemoveFilterItem(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nFilterPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:updateFilterItem updateFilterItem} event of
      * this `sap.m.P13nFilterPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nFilterPanel` itself.
      *
      * Event raised if a filter item has been updated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateFilterItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUpdateFilterItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nFilterPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:updateFilterItem updateFilterItem} event of
      * this `sap.m.P13nFilterPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nFilterPanel` itself.
      *
      * Event raised if a filter item has been updated.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateFilterItem(
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
    def attachUpdateFilterItem(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nFilterPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getFilterItems filterItems} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindFilterItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the filterItems in the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFilterItems(): this.type = js.native
    
    /**
      * Destroys the messageStrip in the aggregation {@link #getMessageStrip messageStrip}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMessageStrip(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:addFilterItem addFilterItem} event of this
      * `sap.m.P13nFilterPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAddFilterItem(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAddFilterItem(
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
      * @EXPERIMENTAL (since 1.56)
      *
      * Detaches event handler `fnFunction` from the {@link #event:filterItemChanged filterItemChanged} event
      * of this `sap.m.P13nFilterPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFilterItemChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFilterItemChanged(
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
      * Detaches event handler `fnFunction` from the {@link #event:removeFilterItem removeFilterItem} event of
      * this `sap.m.P13nFilterPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRemoveFilterItem(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachRemoveFilterItem(
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
      * Detaches event handler `fnFunction` from the {@link #event:updateFilterItem updateFilterItem} event of
      * this `sap.m.P13nFilterPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUpdateFilterItem(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUpdateFilterItem(
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
      * Fires event {@link #event:addFilterItem addFilterItem} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAddFilterItem(): this.type = js.native
    def fireAddFilterItem(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.56)
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:filterItemChanged filterItemChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFilterItemChanged(): this.type = js.native
    def fireFilterItemChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: ItemData): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:removeFilterItem removeFilterItem} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRemoveFilterItem(): this.type = js.native
    def fireRemoveFilterItem(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:updateFilterItem updateFilterItem} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUpdateFilterItem(): this.type = js.native
    def fireUpdateFilterItem(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Returns the array of conditions.
      */
    def getConditions(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getContainerQuery containerQuery}.
      *
      * Defines if the `mediaQuery` or a `ContainerResize` is used for layout update. If the `ConditionPanel`
      * is used in a dialog, the property must be set to `true`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `containerQuery`
      */
    def getContainerQuery(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableEmptyOperations enableEmptyOperations}.
      *
      * Should empty operation be enabled for certain data types. This is also based on their nullable setting.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableEmptyOperations`
      */
    def getEnableEmptyOperations(): Boolean = js.native
    
    /**
      * Getter for the exclude operations.
      *
      * @returns array of operations [`sap.m.P13nConditionOperation.BT`, `sap.m.P13nConditionOperation.EQ`]
      */
    def getExcludeOperations(/**
      * the type for which the operations are defined
      */
    sType: String): js.Array[
        P13nConditionOperation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nConditionOperation * / any */ String)
      ] = js.native
    
    /**
      * Gets content of aggregation {@link #getFilterItems filterItems}.
      *
      * Defines filter items.
      */
    def getFilterItems(): js.Array[typings.openui5.sapMP13nFilterItemMod.default] = js.native
    
    /**
      * Getter for the include operations.
      *
      * @returns array of operations [`sap.m.P13nConditionOperation.BT`, `sap.m.P13nConditionOperation.EQ`]
      */
    def getIncludeOperations(/**
      * for which the operations are defined
      */
    sType: String): P13nConditionOperation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nConditionOperation * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getLayoutMode layoutMode}.
      *
      * Can be used to control the layout behavior. Default is "" which will automatically change the layout.
      * With "Desktop", "Table" or"Phone" you can set a fixed layout.
      *
      * @returns Value of property `layoutMode`
      */
    def getLayoutMode(): String = js.native
    
    /**
      * Gets current value of property {@link #getMaxExcludes maxExcludes}.
      *
      * Defines the maximum number of exclude filters.
      *
      * Default value is `'-1'`.
      *
      * @returns Value of property `maxExcludes`
      */
    def getMaxExcludes(): String = js.native
    
    /**
      * Gets current value of property {@link #getMaxIncludes maxIncludes}.
      *
      * Defines the maximum number of include filters.
      *
      * Default value is `'-1'`.
      *
      * @returns Value of property `maxIncludes`
      */
    def getMaxIncludes(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getMessageStrip messageStrip}.
      *
      * Defines an optional message strip to be displayed in the content area
      */
    def getMessageStrip(): typings.openui5.sapMMessageStripMod.default = js.native
    
    /**
      * Checks for the provided `sap.m.P13nFilterItem` in the aggregation {@link #getFilterItems filterItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFilterItem(
      /**
      * The filterItem whose index is looked for
      */
    oFilterItem: typings.openui5.sapMP13nFilterItemMod.default
    ): int = js.native
    
    /**
      * Inserts a filterItem into the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFilterItem(
      /**
      * The filterItem to insert; if empty, nothing is inserted
      */
    oFilterItem: typings.openui5.sapMP13nFilterItemMod.default,
      /**
      * The `0`-based index the filterItem should be inserted at; for a negative value of `iIndex`, the filterItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the filterItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFilterItems filterItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFilterItems(): js.Array[typings.openui5.sapMP13nFilterItemMod.default] = js.native
    
    def removeFilterItem(/**
      * The filterItem to remove or its index or id
      */
    vFilterItem: String): typings.openui5.sapMP13nFilterItemMod.default | Null = js.native
    /**
      * Removes a filterItem from the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns The removed filterItem or `null`
      */
    def removeFilterItem(/**
      * The filterItem to remove or its index or id
      */
    vFilterItem: int): typings.openui5.sapMP13nFilterItemMod.default | Null = js.native
    def removeFilterItem(
      /**
      * The filterItem to remove or its index or id
      */
    vFilterItem: typings.openui5.sapMP13nFilterItemMod.default
    ): typings.openui5.sapMP13nFilterItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.28
      *
      * Removes all invalid conditions.
      */
    def removeInvalidConditions(): Unit = js.native
    
    /**
      * @SINCE 1.28
      *
      * Removes all errors and warnings states from of all filter conditions.
      */
    def removeValidationErrors(): Unit = js.native
    
    /**
      * Sets the array of conditions.
      *
      * @returns this for chaining
      */
    def setConditions(/**
      * the complete list of conditions
      */
    aConditions: js.Array[js.Object]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getContainerQuery containerQuery}.
      *
      * Defines if the `mediaQuery` or a `ContainerResize` is used for layout update. If the `ConditionPanel`
      * is used in a dialog, the property must be set to `true`.
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
      * Sets a new value for property {@link #getEnableEmptyOperations enableEmptyOperations}.
      *
      * Should empty operation be enabled for certain data types. This is also based on their nullable setting.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableEmptyOperations(): this.type = js.native
    def setEnableEmptyOperations(/**
      * New value for property `enableEmptyOperations`
      */
    bEnableEmptyOperations: Boolean): this.type = js.native
    
    /**
      * Setter for the supported exclude operations array.
      */
    def setExcludeOperations(
      /**
      * array of operations [`sap.m.P13nConditionOperation.BT`, `sap.m.P13nConditionOperation.EQ`]
      */
    aOperation: js.Array[
          P13nConditionOperation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nConditionOperation * / any */ String)
        ],
      /**
      * the type for which the operations are defined
      */
    sType: String
    ): Unit = js.native
    
    /**
      * Setter for the supported Include operations array.
      */
    def setIncludeOperations(
      /**
      * array of operations [`sap.m.P13nConditionOperation.BT`, `sap.m.P13nConditionOperation.EQ`]
      */
    aOperation: js.Array[
          P13nConditionOperation | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nConditionOperation * / any */ String)
        ],
      /**
      * the type for which the operations are defined
      */
    sType: String
    ): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getLayoutMode layoutMode}.
      *
      * Can be used to control the layout behavior. Default is "" which will automatically change the layout.
      * With "Desktop", "Table" or"Phone" you can set a fixed layout.
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
      * Sets a new value for property {@link #getMaxExcludes maxExcludes}.
      *
      * Defines the maximum number of exclude filters.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'-1'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxExcludes(): this.type = js.native
    def setMaxExcludes(/**
      * New value for property `maxExcludes`
      */
    sMaxExcludes: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxIncludes maxIncludes}.
      *
      * Defines the maximum number of include filters.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'-1'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxIncludes(): this.type = js.native
    def setMaxIncludes(/**
      * New value for property `maxIncludes`
      */
    sMaxIncludes: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getMessageStrip messageStrip}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMessageStrip(/**
      * The messageStrip to set
      */
    oMessageStrip: typings.openui5.sapMMessageStripMod.default): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getFilterItems filterItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindFilterItems(): this.type = js.native
    
    /**
      * Checks if the entered and modified conditions are correct, marks invalid fields in yellow (warning).
      *
      * @returns `True` if all conditions are valid, `false` otherwise.
      */
    def validateConditions(): Boolean = js.native
  }
  
  trait P13nFilterPanelSettings
    extends StObject
       with P13nPanelSettings {
    
    /**
      * Event raised if a filter item has been added.
      */
    var addFilterItem: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines if the `mediaQuery` or a `ContainerResize` is used for layout update. If the `ConditionPanel`
      * is used in a dialog, the property must be set to `true`.
      */
    var containerQuery: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Should empty operation be enabled for certain data types. This is also based on their nullable setting.
      */
    var enableEmptyOperations: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.56)
      *
      * Event raised if a filter item has been changed. reason can be added, updated or removed.
      */
    var filterItemChanged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines filter items.
      */
    var filterItems: js.UndefOr[
        js.Array[typings.openui5.sapMP13nFilterItemMod.default] | typings.openui5.sapMP13nFilterItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Can be used to control the layout behavior. Default is "" which will automatically change the layout.
      * With "Desktop", "Table" or"Phone" you can set a fixed layout.
      */
    var layoutMode: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the maximum number of exclude filters.
      */
    var maxExcludes: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the maximum number of include filters.
      */
    var maxIncludes: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines an optional message strip to be displayed in the content area
      */
    var messageStrip: js.UndefOr[typings.openui5.sapMMessageStripMod.default] = js.undefined
    
    /**
      * Event raised if a filter item has been removed.
      */
    var removeFilterItem: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Event raised if a filter item has been updated.
      */
    var updateFilterItem: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object P13nFilterPanelSettings {
    
    inline def apply(): P13nFilterPanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nFilterPanelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: P13nFilterPanelSettings] (val x: Self) extends AnyVal {
      
      inline def setAddFilterItem(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "addFilterItem", js.Any.fromFunction1(value))
      
      inline def setAddFilterItemUndefined: Self = StObject.set(x, "addFilterItem", js.undefined)
      
      inline def setContainerQuery(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "containerQuery", value.asInstanceOf[js.Any])
      
      inline def setContainerQueryUndefined: Self = StObject.set(x, "containerQuery", js.undefined)
      
      inline def setEnableEmptyOperations(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableEmptyOperations", value.asInstanceOf[js.Any])
      
      inline def setEnableEmptyOperationsUndefined: Self = StObject.set(x, "enableEmptyOperations", js.undefined)
      
      inline def setFilterItemChanged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "filterItemChanged", js.Any.fromFunction1(value))
      
      inline def setFilterItemChangedUndefined: Self = StObject.set(x, "filterItemChanged", js.undefined)
      
      inline def setFilterItems(
        value: js.Array[typings.openui5.sapMP13nFilterItemMod.default] | typings.openui5.sapMP13nFilterItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      inline def setFilterItemsVarargs(value: typings.openui5.sapMP13nFilterItemMod.default*): Self = StObject.set(x, "filterItems", js.Array(value*))
      
      inline def setLayoutMode(value: String | PropertyBindingInfo): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
      
      inline def setLayoutModeUndefined: Self = StObject.set(x, "layoutMode", js.undefined)
      
      inline def setMaxExcludes(value: String | PropertyBindingInfo): Self = StObject.set(x, "maxExcludes", value.asInstanceOf[js.Any])
      
      inline def setMaxExcludesUndefined: Self = StObject.set(x, "maxExcludes", js.undefined)
      
      inline def setMaxIncludes(value: String | PropertyBindingInfo): Self = StObject.set(x, "maxIncludes", value.asInstanceOf[js.Any])
      
      inline def setMaxIncludesUndefined: Self = StObject.set(x, "maxIncludes", js.undefined)
      
      inline def setMessageStrip(value: typings.openui5.sapMMessageStripMod.default): Self = StObject.set(x, "messageStrip", value.asInstanceOf[js.Any])
      
      inline def setMessageStripUndefined: Self = StObject.set(x, "messageStrip", js.undefined)
      
      inline def setRemoveFilterItem(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "removeFilterItem", js.Any.fromFunction1(value))
      
      inline def setRemoveFilterItemUndefined: Self = StObject.set(x, "removeFilterItem", js.undefined)
      
      inline def setUpdateFilterItem(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "updateFilterItem", js.Any.fromFunction1(value))
      
      inline def setUpdateFilterItemUndefined: Self = StObject.set(x, "updateFilterItem", js.undefined)
    }
  }
}
