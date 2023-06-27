package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsTableRowActionMod {
  
  /**
    * @since 1.115
    *
    * Defines the actions that can be used in the table.
    */
  @JSImport("sap/ui/mdc/enums/TableRowAction", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableRowAction & String] = js.native
    
    /* "Navigation" */ val Navigation: typings.openui5.sapUiMdcEnumsTableRowActionMod.TableRowAction.Navigation & String = js.native
  }
  
  @js.native
  sealed trait TableRowAction extends StObject
  /**
    * @since 1.115
    *
    * Defines the actions that can be used in the table.
    */
  @JSImport("sap/ui/mdc/enums/TableRowAction", "TableRowAction")
  @js.native
  object TableRowAction extends StObject {
    
    /**
      * Navigation arrow (chevron) is shown in the table rows/items.
      */
    @js.native
    sealed trait Navigation
      extends StObject
         with TableRowAction
  }
}
