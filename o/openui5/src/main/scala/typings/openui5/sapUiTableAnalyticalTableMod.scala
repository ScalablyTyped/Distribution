package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiTableTableMod.TableSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTableAnalyticalTableMod {
  
  @JSImport("sap/ui/table/AnalyticalTable", JSImport.Default)
  @js.native
  /**
    * Constructor for a new AnalyticalTable.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    *   https://github.com/SAP/odata-vocabularies/blob/main/docs/v2-annotations.md
    *   {@link topic:08197fa68e4f479cbe30f639cc1cd22c sap.ui.table}
    *   {@link fiori:/analytical-table-alv/ Analytical Table}
    */
  open class default () extends AnalyticalTable {
    def this(/**
      * initial settings for the new control
      */
    mSettings: AnalyticalTableSettings) = this()
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
    mSettings: AnalyticalTableSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: AnalyticalTableSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/table/AnalyticalTable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.table.AnalyticalTable with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, AnalyticalTable]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, AnalyticalTable],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.table.AnalyticalTable.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait AnalyticalTable
    extends typings.openui5.sapUiTableTableMod.default {
    
    def collapse(
      /**
      * A single index, or an array of indices of the rows to be collapsed
      */
    vRowIndex: js.Array[int]
    ): this.type = js.native
    /**
      * Collapses one or more rows.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def collapse(/**
      * A single index, or an array of indices of the rows to be collapsed
      */
    vRowIndex: int): this.type = js.native
    
    /**
      * Collapses all nodes (and their child nodes if collapseRecursive is activated).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def collapseAll(): this.type = js.native
    
    def expand(
      /**
      * A single index or an array of indices of the rows to be expanded
      */
    vRowIndex: js.Array[int]
    ): this.type = js.native
    /**
      * Expands one or more rows.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def expand(/**
      * A single index or an array of indices of the rows to be expanded
      */
    vRowIndex: int): this.type = js.native
    
    /**
      * @SINCE 1.70
      *
      * Expands all nodes. The current selection is removed, and the table scrolls back to the top. If this method
      * is called, not all groups might be loaded. If the user then scrolls to the bottom of the table, additional
      * groups are loaded, which increases the scroll range, and the scroll thumb moves up.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def expandAll(): this.type = js.native
    
    /**
      * @deprecated (since 1.44) - replaced by the `autoExpandMode` binding parameter
      *
      * Gets current value of property {@link #getAutoExpandMode autoExpandMode}.
      *
      * The kind of auto expansion algorithm, e.g. optimized filter conditions, per level requests, ... Must
      * be a value of `sap.ui.table.TreeAutoExpandMode`.
      *
      * The value of the property is only taken into account if no parameter is given in the binding information.
      * Changes to this property after the table is bound do not have any effect unless an explicit (re-)bind
      * of the `rows` aggregation is done.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       autoExpandMode: "Bundled"
      *     }
      *   });
      * ```
      *
      *
      * Default value is `"Bundled"`.
      *
      * @returns Value of property `autoExpandMode`
      */
    def getAutoExpandMode(): String = js.native
    
    /**
      * @deprecated (since 1.76) - replaced by the `collapseRecursive` binding parameter
      *
      * Gets current value of property {@link #getCollapseRecursive collapseRecursive}.
      *
      * Setting collapseRecursive to true means, that when collapsing a node all subsequent child nodes will
      * also be collapsed.
      *
      * Calling the setter of this property only has an effect when the tables `rows` aggregation is already
      * bound and the binding supports this feature.
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
      * Gets current value of property {@link #getColumnVisibilityMenuSorter columnVisibilityMenuSorter}.
      *
      * Functions which is used to sort the column visibility menu entries e.g.: function(ColumnA, ColumnB) {
      * return 0 = equals, <0 lower, >0 greater }; Other values than functions will be ignored.
      *
      * @returns Value of property `columnVisibilityMenuSorter`
      */
    def getColumnVisibilityMenuSorter(): Any = js.native
    
    /**
      * @deprecated (since 1.21.2) - replaced by {@link sap.ui.table.Table#setShowOverlay}
      *
      * Gets current value of property {@link #getDirty dirty}.
      *
      * If dirty the content of the Table will be overlayed.
      *
      * @returns Value of property `dirty`
      */
    def getDirty(): Boolean = js.native
    
    /**
      * @deprecated (since 1.44) - replaced by the `numberOfExpandedLevels` binding parameter
      *
      * Gets current value of property {@link #getNumberOfExpandedLevels numberOfExpandedLevels}.
      *
      * Number of levels, which should be opened initially (on first load of data).
      *
      * The value of the property is only taken into account if no parameter is given in the binding information.
      * Changes to this property after the table is bound do not have any effect unless an explicit (re-)bind
      * of the `rows` aggregation is done.
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
      * Default value is `0`.
      *
      * @returns Value of property `numberOfExpandedLevels`
      */
    def getNumberOfExpandedLevels(): int = js.native
    
    /**
      * @deprecated (since 1.44) - replaced by the `sumOnTop` binding parameter
      *
      * Gets current value of property {@link #getSumOnTop sumOnTop}.
      *
      * Specifies if the total values should be displayed in the group headers or on bottom of the row. Does
      * not affect the total sum.
      *
      * The value of the property is only taken into account if no parameter is given in the binding information.
      * Changes to this property after the table is bound do not have any effect unless an explicit (re-)bind
      * of the `rows` aggregation is done.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       sumOnTop: true
      *     }
      *   });
      * ```
      *
      *
      * Default value is `false`.
      *
      * @returns Value of property `sumOnTop`
      */
    def getSumOnTop(): Boolean = js.native
    
    /**
      * Returns the total size of the data entries.
      *
      * @returns The total size of the data entries
      */
    def getTotalSize(): int = js.native
    
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * This function is used by some composite controls to force updating the AnalyticalInfo
      */
    def resumeUpdateAnalyticalInfo(
      /**
      * binding shall not refresh data
      */
    bSuppressRefresh: Boolean,
      /**
      * forces the binding to fire a change event
      */
    bForceChange: Boolean
    ): Unit = js.native
    
    /**
      * @deprecated (since 1.44) - replaced by the `autoExpandMode` binding parameter
      *
      * Sets a new value for property {@link #getAutoExpandMode autoExpandMode}.
      *
      * The kind of auto expansion algorithm, e.g. optimized filter conditions, per level requests, ... Must
      * be a value of `sap.ui.table.TreeAutoExpandMode`.
      *
      * The value of the property is only taken into account if no parameter is given in the binding information.
      * Changes to this property after the table is bound do not have any effect unless an explicit (re-)bind
      * of the `rows` aggregation is done.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       autoExpandMode: "Bundled"
      *     }
      *   });
      * ```
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Bundled"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoExpandMode(): this.type = js.native
    def setAutoExpandMode(/**
      * New value for property `autoExpandMode`
      */
    sAutoExpandMode: String): this.type = js.native
    
    /**
      * @deprecated (since 1.76) - replaced by the `collapseRecursive` binding parameter
      *
      * Sets a new value for property {@link #getCollapseRecursive collapseRecursive}.
      *
      * Setting collapseRecursive to true means, that when collapsing a node all subsequent child nodes will
      * also be collapsed.
      *
      * Calling the setter of this property only has an effect when the tables `rows` aggregation is already
      * bound and the binding supports this feature.
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
      * Sets a new value for property {@link #getColumnVisibilityMenuSorter columnVisibilityMenuSorter}.
      *
      * Functions which is used to sort the column visibility menu entries e.g.: function(ColumnA, ColumnB) {
      * return 0 = equals, <0 lower, >0 greater }; Other values than functions will be ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnVisibilityMenuSorter(): this.type = js.native
    def setColumnVisibilityMenuSorter(/**
      * New value for property `columnVisibilityMenuSorter`
      */
    oColumnVisibilityMenuSorter: Any): this.type = js.native
    
    /**
      * @deprecated (since 1.21.2) - replaced by {@link sap.ui.table.Table#setShowOverlay}
      *
      * Sets a new value for property {@link #getDirty dirty}.
      *
      * If dirty the content of the Table will be overlayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDirty(): this.type = js.native
    def setDirty(/**
      * New value for property `dirty`
      */
    bDirty: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.44) - replaced by the `numberOfExpandedLevels` binding parameter
      *
      * Sets a new value for property {@link #getNumberOfExpandedLevels numberOfExpandedLevels}.
      *
      * Number of levels, which should be opened initially (on first load of data).
      *
      * The value of the property is only taken into account if no parameter is given in the binding information.
      * Changes to this property after the table is bound do not have any effect unless an explicit (re-)bind
      * of the `rows` aggregation is done.
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
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNumberOfExpandedLevels(): this.type = js.native
    def setNumberOfExpandedLevels(/**
      * New value for property `numberOfExpandedLevels`
      */
    iNumberOfExpandedLevels: int): this.type = js.native
    
    /**
      * @deprecated (since 1.44) - replaced by the `sumOnTop` binding parameter
      *
      * Sets a new value for property {@link #getSumOnTop sumOnTop}.
      *
      * Specifies if the total values should be displayed in the group headers or on bottom of the row. Does
      * not affect the total sum.
      *
      * The value of the property is only taken into account if no parameter is given in the binding information.
      * Changes to this property after the table is bound do not have any effect unless an explicit (re-)bind
      * of the `rows` aggregation is done.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       sumOnTop: true
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
    def setSumOnTop(): this.type = js.native
    def setSumOnTop(/**
      * New value for property `sumOnTop`
      */
    bSumOnTop: Boolean): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * This function is used by some composite controls to avoid updating the AnalyticalInfo when several column
      * are added to the table. In order to finally update the AnalyticalInfo and request data, resumeUpdateAnalyticalInfo
      * must be called.
      */
    def suspendUpdateAnalyticalInfo(): Unit = js.native
  }
  
  trait AnalyticalTableSettings
    extends StObject
       with TableSettings {
    
    /**
      * @deprecated (since 1.44) - replaced by the `autoExpandMode` binding parameter
      *
      * The kind of auto expansion algorithm, e.g. optimized filter conditions, per level requests, ... Must
      * be a value of `sap.ui.table.TreeAutoExpandMode`.
      *
      * The value of the property is only taken into account if no parameter is given in the binding information.
      * Changes to this property after the table is bound do not have any effect unless an explicit (re-)bind
      * of the `rows` aggregation is done.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       autoExpandMode: "Bundled"
      *     }
      *   });
      * ```
      */
    var autoExpandMode: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.76) - replaced by the `collapseRecursive` binding parameter
      *
      * Setting collapseRecursive to true means, that when collapsing a node all subsequent child nodes will
      * also be collapsed.
      *
      * Calling the setter of this property only has an effect when the tables `rows` aggregation is already
      * bound and the binding supports this feature.
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
      * Functions which is used to sort the column visibility menu entries e.g.: function(ColumnA, ColumnB) {
      * return 0 = equals, <0 lower, >0 greater }; Other values than functions will be ignored.
      */
    var columnVisibilityMenuSorter: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.21.2) - replaced by {@link sap.ui.table.Table#setShowOverlay}
      *
      * If dirty the content of the Table will be overlayed.
      */
    var dirty: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.44) - replaced by the `numberOfExpandedLevels` binding parameter
      *
      * Number of levels, which should be opened initially (on first load of data).
      *
      * The value of the property is only taken into account if no parameter is given in the binding information.
      * Changes to this property after the table is bound do not have any effect unless an explicit (re-)bind
      * of the `rows` aggregation is done.
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
    var numberOfExpandedLevels: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.44) - replaced by the `sumOnTop` binding parameter
      *
      * Specifies if the total values should be displayed in the group headers or on bottom of the row. Does
      * not affect the total sum.
      *
      * The value of the property is only taken into account if no parameter is given in the binding information.
      * Changes to this property after the table is bound do not have any effect unless an explicit (re-)bind
      * of the `rows` aggregation is done.
      *
      * Example:
      * ```javascript
      *
      *   oTable.bindRows({
      *     path: "...",
      *     parameters: {
      *       sumOnTop: true
      *     }
      *   });
      * ```
      */
    var sumOnTop: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object AnalyticalTableSettings {
    
    inline def apply(): AnalyticalTableSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalyticalTableSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticalTableSettings] (val x: Self) extends AnyVal {
      
      inline def setAutoExpandMode(value: String | PropertyBindingInfo): Self = StObject.set(x, "autoExpandMode", value.asInstanceOf[js.Any])
      
      inline def setAutoExpandModeUndefined: Self = StObject.set(x, "autoExpandMode", js.undefined)
      
      inline def setCollapseRecursive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "collapseRecursive", value.asInstanceOf[js.Any])
      
      inline def setCollapseRecursiveUndefined: Self = StObject.set(x, "collapseRecursive", js.undefined)
      
      inline def setColumnVisibilityMenuSorter(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnVisibilityMenuSorter", value.asInstanceOf[js.Any])
      
      inline def setColumnVisibilityMenuSorterUndefined: Self = StObject.set(x, "columnVisibilityMenuSorter", js.undefined)
      
      inline def setDirty(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
      
      inline def setNumberOfExpandedLevels(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "numberOfExpandedLevels", value.asInstanceOf[js.Any])
      
      inline def setNumberOfExpandedLevelsUndefined: Self = StObject.set(x, "numberOfExpandedLevels", js.undefined)
      
      inline def setSumOnTop(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sumOnTop", value.asInstanceOf[js.Any])
      
      inline def setSumOnTopUndefined: Self = StObject.set(x, "sumOnTop", js.undefined)
    }
  }
}
