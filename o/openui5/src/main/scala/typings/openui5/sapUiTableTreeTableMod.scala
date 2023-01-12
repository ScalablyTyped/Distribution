package typings.openui5

import typings.openui5.anon.RowIndex
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiTableTableMod.TableSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTableTreeTableMod {
  
  @JSImport("sap/ui/table/TreeTable", JSImport.Default)
  @js.native
  /**
    * Constructor for a new TreeTable.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:08197fa68e4f479cbe30f639cc1cd22c sap.ui.table}
    * 	{@link topic:148892ff9aea4a18b912829791e38f3e Tables: Which One Should I Choose?}
    * 	{@link fiori:/tree-table/ Tree Table}
    */
  open class default () extends TreeTable {
    def this(/**
      * initial settings for the new control
      */
    mSettings: TreeTableSettings) = this()
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
    mSettings: TreeTableSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: TreeTableSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/table/TreeTable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.table.TreeTable with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.table.Table.extend}.
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
    oClassInfo: ClassInfo[T, TreeTable]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TreeTable],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.table.TreeTable.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TreeTable
    extends typings.openui5.sapUiTableTableMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleOpenState toggleOpenState} event of this
      * `sap.ui.table.TreeTable`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.table.TreeTable` itself.
      *
      * Fired when a row has been expanded or collapsed by user interaction. Only available in hierarchical mode.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleOpenState(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToggleOpenState(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.table.TreeTable` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggleOpenState toggleOpenState} event of this
      * `sap.ui.table.TreeTable`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.table.TreeTable` itself.
      *
      * Fired when a row has been expanded or collapsed by user interaction. Only available in hierarchical mode.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggleOpenState(
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
    def attachToggleOpenState(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.table.TreeTable` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    def collapse(
      /**
      * A single index or an array of indices of the rows to be collapsed
      */
    vRowIndex: js.Array[int]
    ): this.type = js.native
    /**
      * Collapses one or more rows.
      *
      * @returns `this` to allow method chaining
      */
    def collapse(/**
      * A single index or an array of indices of the rows to be collapsed
      */
    vRowIndex: int): this.type = js.native
    
    /**
      * Collapses all nodes (and lower if collapseRecursive is activated)
      *
      * @returns `this` to allow method chaining
      */
    def collapseAll(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:toggleOpenState toggleOpenState} event of
      * this `sap.ui.table.TreeTable`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToggleOpenState(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachToggleOpenState(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    def expand(
      /**
      * A single index or an array of indices of the rows to be expanded
      */
    vRowIndex: js.Array[int]
    ): this.type = js.native
    /**
      * Expands one or more rows.
      *
      * @returns `this` to allow method chaining
      */
    def expand(/**
      * A single index or an array of indices of the rows to be expanded
      */
    vRowIndex: int): this.type = js.native
    
    /**
      * Expands all nodes starting from the root level to the given level 'iLevel'.
      *
      * Only supported with ODataModel v2, when running in OperationMode.Client. Fully supported for `sap.ui.model.ClientTreeBinding`,
      * e.g. if you are using a `sap.ui.model.json.JSONModel`.
      *
      * Please also see `sap.ui.model.odata.OperationMode`.
      *
      * @returns a reference on the TreeTable control, can be used for chaining
      */
    def expandToLevel(/**
      * the level to which the trees shall be expanded
      */
    iLevel: int): this.type = js.native
    
    /**
      * Fires event {@link #event:toggleOpenState toggleOpenState} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireToggleOpenState(): this.type = js.native
    def fireToggleOpenState(/**
      * Parameters to pass along with the event
      */
    mParameters: RowIndex): this.type = js.native
    
    /**
      * @deprecated (since 1.76) - replaced by the `collapseRecursive` binding parameter. May not work with all
      * bindings.
      *
      * Gets current value of property {@link #getCollapseRecursive collapseRecursive}.
      *
      * Setting collapseRecursive to true means, that when collapsing a node all subsequent child nodes will
      * also be collapsed. This property is only supported with sap.ui.model.odata.v2.ODataModel. **Note:** collapseRecursive
      * is currently **not** supported if your OData service exposes the hierarchy annotation `hierarchy-node-descendant-count-for`.
      * In this case the value of the collapseRecursive property is ignored. For more information about the OData
      * hierarchy annotations, please see the **SAP Annotations for OData Version 2.0** specification.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       collapseRecursive: true
      *     }
      *   });
      * ```
      *
      *
      * Default value is `true`.
      *
      * @returns Value of property `collapseRecursive`
      */
    def getCollapseRecursive(): Boolean = js.native
    
    /**
      * @deprecated (since 1.46.3) - replaced by the `numberOfExpandedLevels` binding parameter. May not work
      * with all bindings.
      *
      * Gets current value of property {@link #getExpandFirstLevel expandFirstLevel}.
      *
      * Specifies whether the first level is expanded.
      *
      * The value of the property is only taken into account if no parameter `numberOfExpandedLevels` is given
      * in the binding information. Changes to this property after the table is bound do not have any effect
      * unless an explicit (re-)bind of the `rows` aggregation is done.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       numberOfExpandedLevels: 1
      *     }
      *   });
      * ```
      *
      *
      * Default value is `false`.
      *
      * @returns Value of property `expandFirstLevel`
      */
    def getExpandFirstLevel(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getGroupHeaderProperty groupHeaderProperty}.
      *
      * The property name of the rows data which will be displayed as a group header if the group mode is enabled
      *
      * @returns Value of property `groupHeaderProperty`
      */
    def getGroupHeaderProperty(): String = js.native
    
    /**
      * @deprecated (since 1.76) - replaced by the `rootLevel` binding parameter. May not work with all bindings.
      *
      * Gets current value of property {@link #getRootLevel rootLevel}.
      *
      * The root level is the level of the topmost tree nodes, which will be used as an entry point for OData
      * services. This property is only supported when the TreeTable uses an underlying odata services with hierarchy
      * annotations. This property is only supported with sap.ui.model.odata.v2.ODataModel The hierarchy annotations
      * may also be provided locally as a parameter for the ODataTreeBinding.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       rootLevel: 1
      *     }
      *   });
      * ```
      *
      *
      * Default value is `0`.
      *
      * @returns Value of property `rootLevel`
      */
    def getRootLevel(): int = js.native
    
    /**
      * Gets current value of property {@link #getUseGroupMode useGroupMode}.
      *
      * If group mode is enabled nodes with subitems are rendered as if they were group headers. This can be
      * used to do the grouping for an OData service on the backend and visualize this in a table.
      *
      * Default value is `false`.
      *
      * @returns Value of property `useGroupMode`
      */
    def getUseGroupMode(): Boolean = js.native
    
    /**
      * Checks whether the row is expanded or collapsed.
      *
      * @returns `true` if the row is expanded, `false` if it is collapsed
      */
    def isExpanded(/**
      * The index of the row to be checked
      */
    iRowIndex: int): Boolean = js.native
    
    /**
      * @deprecated (since 1.76) - replaced by the `collapseRecursive` binding parameter. May not work with all
      * bindings.
      *
      * Sets a new value for property {@link #getCollapseRecursive collapseRecursive}.
      *
      * Setting collapseRecursive to true means, that when collapsing a node all subsequent child nodes will
      * also be collapsed. This property is only supported with sap.ui.model.odata.v2.ODataModel. **Note:** collapseRecursive
      * is currently **not** supported if your OData service exposes the hierarchy annotation `hierarchy-node-descendant-count-for`.
      * In this case the value of the collapseRecursive property is ignored. For more information about the OData
      * hierarchy annotations, please see the **SAP Annotations for OData Version 2.0** specification.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       collapseRecursive: true
      *     }
      *   });
      * ```
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCollapseRecursive(): this.type = js.native
    def setCollapseRecursive(/**
      * New value for property `collapseRecursive`
      */
    bCollapseRecursive: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.46.3) - replaced by the `numberOfExpandedLevels` binding parameter. May not work
      * with all bindings.
      *
      * Sets a new value for property {@link #getExpandFirstLevel expandFirstLevel}.
      *
      * Specifies whether the first level is expanded.
      *
      * The value of the property is only taken into account if no parameter `numberOfExpandedLevels` is given
      * in the binding information. Changes to this property after the table is bound do not have any effect
      * unless an explicit (re-)bind of the `rows` aggregation is done.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       numberOfExpandedLevels: 1
      *     }
      *   });
      * ```
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpandFirstLevel(): this.type = js.native
    def setExpandFirstLevel(/**
      * New value for property `expandFirstLevel`
      */
    bExpandFirstLevel: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGroupHeaderProperty groupHeaderProperty}.
      *
      * The property name of the rows data which will be displayed as a group header if the group mode is enabled
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupHeaderProperty(): this.type = js.native
    def setGroupHeaderProperty(/**
      * New value for property `groupHeaderProperty`
      */
    sGroupHeaderProperty: String): this.type = js.native
    
    /**
      * @deprecated (since 1.76) - replaced by the `rootLevel` binding parameter. May not work with all bindings.
      *
      * Sets a new value for property {@link #getRootLevel rootLevel}.
      *
      * The root level is the level of the topmost tree nodes, which will be used as an entry point for OData
      * services. This property is only supported when the TreeTable uses an underlying odata services with hierarchy
      * annotations. This property is only supported with sap.ui.model.odata.v2.ODataModel The hierarchy annotations
      * may also be provided locally as a parameter for the ODataTreeBinding.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       rootLevel: 1
      *     }
      *   });
      * ```
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRootLevel(): this.type = js.native
    def setRootLevel(/**
      * New value for property `rootLevel`
      */
    iRootLevel: int): this.type = js.native
    
    /**
      * Allows to hide the tree structure (tree icons, indentation) in tree mode (property `useGroupMode` is
      * set to `false`).
      *
      * This option might be useful in some scenarios when actually a tree table must be used but under certain
      * conditions the data is not hierarchical, because it contains leafs only.
      *
      * **Note:** In flat mode the user of the table cannot expand or collapse certain nodes and the hierarchy
      * is not visible to the user. The caller of this function has to ensure to use this option only with non-hierarchical
      * data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseFlatMode(/**
      * If set to `true`, the flat mode is enabled
      */
    bFlat: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUseGroupMode useGroupMode}.
      *
      * If group mode is enabled nodes with subitems are rendered as if they were group headers. This can be
      * used to do the grouping for an OData service on the backend and visualize this in a table.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseGroupMode(): this.type = js.native
    def setUseGroupMode(/**
      * New value for property `useGroupMode`
      */
    bUseGroupMode: Boolean): this.type = js.native
  }
  
  trait TreeTableSettings
    extends StObject
       with TableSettings {
    
    /**
      * @deprecated (since 1.76) - replaced by the `collapseRecursive` binding parameter. May not work with all
      * bindings.
      *
      * Setting collapseRecursive to true means, that when collapsing a node all subsequent child nodes will
      * also be collapsed. This property is only supported with sap.ui.model.odata.v2.ODataModel. **Note:** collapseRecursive
      * is currently **not** supported if your OData service exposes the hierarchy annotation `hierarchy-node-descendant-count-for`.
      * In this case the value of the collapseRecursive property is ignored. For more information about the OData
      * hierarchy annotations, please see the **SAP Annotations for OData Version 2.0** specification.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       collapseRecursive: true
      *     }
      *   });
      * ```
      */
    var collapseRecursive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.46.3) - replaced by the `numberOfExpandedLevels` binding parameter. May not work
      * with all bindings.
      *
      * Specifies whether the first level is expanded.
      *
      * The value of the property is only taken into account if no parameter `numberOfExpandedLevels` is given
      * in the binding information. Changes to this property after the table is bound do not have any effect
      * unless an explicit (re-)bind of the `rows` aggregation is done.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       numberOfExpandedLevels: 1
      *     }
      *   });
      * ```
      */
    var expandFirstLevel: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The property name of the rows data which will be displayed as a group header if the group mode is enabled
      */
    var groupHeaderProperty: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.76) - replaced by the `rootLevel` binding parameter. May not work with all bindings.
      *
      * The root level is the level of the topmost tree nodes, which will be used as an entry point for OData
      * services. This property is only supported when the TreeTable uses an underlying odata services with hierarchy
      * annotations. This property is only supported with sap.ui.model.odata.v2.ODataModel The hierarchy annotations
      * may also be provided locally as a parameter for the ODataTreeBinding.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       rootLevel: 1
      *     }
      *   });
      * ```
      */
    var rootLevel: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fired when a row has been expanded or collapsed by user interaction. Only available in hierarchical mode.
      */
    var toggleOpenState: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If group mode is enabled nodes with subitems are rendered as if they were group headers. This can be
      * used to do the grouping for an OData service on the backend and visualize this in a table.
      */
    var useGroupMode: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TreeTableSettings {
    
    inline def apply(): TreeTableSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeTableSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeTableSettings] (val x: Self) extends AnyVal {
      
      inline def setCollapseRecursive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "collapseRecursive", value.asInstanceOf[js.Any])
      
      inline def setCollapseRecursiveUndefined: Self = StObject.set(x, "collapseRecursive", js.undefined)
      
      inline def setExpandFirstLevel(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expandFirstLevel", value.asInstanceOf[js.Any])
      
      inline def setExpandFirstLevelUndefined: Self = StObject.set(x, "expandFirstLevel", js.undefined)
      
      inline def setGroupHeaderProperty(value: String | PropertyBindingInfo): Self = StObject.set(x, "groupHeaderProperty", value.asInstanceOf[js.Any])
      
      inline def setGroupHeaderPropertyUndefined: Self = StObject.set(x, "groupHeaderProperty", js.undefined)
      
      inline def setRootLevel(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rootLevel", value.asInstanceOf[js.Any])
      
      inline def setRootLevelUndefined: Self = StObject.set(x, "rootLevel", js.undefined)
      
      inline def setToggleOpenState(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "toggleOpenState", js.Any.fromFunction1(value))
      
      inline def setToggleOpenStateUndefined: Self = StObject.set(x, "toggleOpenState", js.undefined)
      
      inline def setUseGroupMode(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useGroupMode", value.asInstanceOf[js.Any])
      
      inline def setUseGroupModeUndefined: Self = StObject.set(x, "useGroupMode", js.undefined)
    }
  }
}
