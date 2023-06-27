package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcOdataV4TableDelegateMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/odata/v4/TableDelegate", JSImport.Default)
  @js.native
  val default: TableDelegate = js.native
  
  /**
    * @since 1.85
    *
    * Delegate for {@link sap.ui.mdc.Table} and `ODataV4`. Enables additional analytical capabilities.
    */
  @js.native
  trait TableDelegate extends StObject {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Updates the row binding of the table if possible, rebinds otherwise.
      *
      * Compares the current and previous state of the table to detect whether rebinding is necessary or not.
      * The diffing happens for the sorters, filters, aggregation, parameters, and the path of the binding. Other
      * {@link sap.ui.base.ManagedObject.AggregationBindingInfo binding info} keys like `events`, `model`...
      * must be provided in the {@link #updateBindingInfo updateBindingInfo} method always, and those keys must
      * not be changed conditionally.
      */
    def updateBinding(
      /**
      * Instance of the table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default,
      /**
      * The binding info object to be used to bind the table to the model.
      */
    oBindingInfo: AggregationBindingInfo
    ): Unit = js.native
    def updateBinding(
      /**
      * Instance of the table
      */
    oTable: typings.openui5.sapUiMdcTableMod.default,
      /**
      * The binding info object to be used to bind the table to the model.
      */
    oBindingInfo: AggregationBindingInfo,
      /**
      * The binding instance of the table
      */
    oBinding: typings.openui5.sapUiModelListBindingMod.default
    ): Unit = js.native
  }
  
  type _To = TableDelegate
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcOdataV4TableDelegateMod.foo` */
  override def _to: TableDelegate = default
}
