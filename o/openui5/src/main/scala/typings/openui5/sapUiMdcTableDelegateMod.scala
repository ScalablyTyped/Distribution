package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.`0`
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcTableDelegateMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/TableDelegate", JSImport.Default)
  @js.native
  val default: TableDelegate = js.native
  
  /**
    * @since 1.60
    *
    * Base delegate for {@link sap.ui.mdc.Table}.
    */
  @js.native
  trait TableDelegate extends StObject {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Collapses all nodes.
      */
    def collapseAll(/**
      * Instance of the MDC table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Expands all nodes.
      */
    def expandAll(/**
      * Instance of the MDC table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the feature set for exporting data in the MDC Table.
      *
      * @returns Export capabilities with specific features
      */
    def fetchExportCapabilities(/**
      * Instance of the MDC table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default): js.Promise[Any] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Formats the title text of a group header row of the table.
      *
      * @returns The group header title. If `undefined` is returned, the default group header title is set.
      */
    def formatGroupHeader(
      /**
      * Instance of the MDC table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default,
      /**
      * Binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The name of the grouped property
      */
    sProperty: String
    ): js.UndefOr[String] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the filter delegate of the table that provides basic filter functionality, such as adding filter
      * fields. **Note:** The functionality provided in this delegate acts as a subset of a `FilterBarDelegate`
      * to enable the table for inbuilt filtering.
      *
      * @returns Object for the tables filter personalization
      */
    def getFilterDelegate(): `0` = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns filters that are used when updating the table's binding and are created based on the filter conditions
      * of the table and its associated filter control.
      *
      * @returns Array of filters
      */
    def getFilters(/**
      * Instance of the table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default): js.Array[typings.openui5.sapUiModelFilterMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Creates a new sorter for the grouping functionality.
      *
      * @returns New sorter
      */
    def getGroupSorter(
      /**
      * Instance of the MDC table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default,
      /**
      * Property to group
      */
    sPropertyName: String
    ): js.UndefOr[typings.openui5.sapUiModelSorterMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the sort conditions that are used when updating the table's binding.
      *
      * @returns Sort Conditions
      */
    def getSorters(/**
      * Instance of the MDC table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default): js.Array[typings.openui5.sapUiModelSorterMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Rebinds the table.
      */
    def rebind(
      /**
      * Instance of the MDC table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default,
      /**
      * The binding info object to be used to bind the table to the model
      */
    oBindingInfo: AggregationBindingInfo
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Updates the row binding of the table.
      *
      * The default implementation rebinds the table, but model-specific subclasses must call dedicated binding
      * methods to update the binding instead of using {@link #rebind}.
      */
    def updateBinding(
      /**
      * Instance of the table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default,
      /**
      * The binding info object to be used to bind the table to the model
      */
    oBindingInfo: AggregationBindingInfo
    ): Unit = js.native
    def updateBinding(
      /**
      * Instance of the table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default,
      /**
      * The binding info object to be used to bind the table to the model
      */
    oBindingInfo: AggregationBindingInfo,
      /**
      * The binding instance of the table
      */
    oBinding: typings.openui5.sapUiModelListBindingMod.default
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Provides a hook to update the binding info object that is used to bind the table to the model.
      */
    def updateBindingInfo(
      /**
      * Instance of the MDC table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default,
      /**
      * The binding info object to be used to bind the table to the model
      */
    oBindingInfo: AggregationBindingInfo
    ): Unit = js.native
  }
  
  type _To = TableDelegate
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcTableDelegateMod.foo` */
  override def _to: TableDelegate = default
}
