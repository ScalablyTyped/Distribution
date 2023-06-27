package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsTableRowCountModeMod {
  
  /**
    * @since 1.115
    *
    * Defines the row count mode of the GridTable.
    */
  @JSImport("sap/ui/mdc/enums/TableRowCountMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableRowCountMode & String] = js.native
    
    /* "Auto" */ val Auto: typings.openui5.sapUiMdcEnumsTableRowCountModeMod.TableRowCountMode.Auto & String = js.native
    
    /* "Fixed" */ val Fixed: typings.openui5.sapUiMdcEnumsTableRowCountModeMod.TableRowCountMode.Fixed & String = js.native
  }
  
  @js.native
  sealed trait TableRowCountMode extends StObject
  /**
    * @since 1.115
    *
    * Defines the row count mode of the GridTable.
    */
  @JSImport("sap/ui/mdc/enums/TableRowCountMode", "TableRowCountMode")
  @js.native
  object TableRowCountMode extends StObject {
    
    /**
      * The table automatically fills the height of the surrounding container.
      */
    @js.native
    sealed trait Auto
      extends StObject
         with TableRowCountMode
    
    /**
      * The table always has as many rows as defined in the `rowCount` property of `GridTableType`.
      */
    @js.native
    sealed trait Fixed
      extends StObject
         with TableRowCountMode
  }
}
