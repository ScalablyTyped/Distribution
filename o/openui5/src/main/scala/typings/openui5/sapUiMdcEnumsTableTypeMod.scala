package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsTableTypeMod {
  
  /**
    * @since 1.115
    *
    * Defines the type of table used in the MDC table.
    */
  @JSImport("sap/ui/mdc/enums/TableType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableType & String] = js.native
    
    /* "ResponsiveTable" */ val ResponsiveTable: typings.openui5.sapUiMdcEnumsTableTypeMod.TableType.ResponsiveTable & String = js.native
    
    /* "Table" */ val Table: typings.openui5.sapUiMdcEnumsTableTypeMod.TableType.Table & String = js.native
  }
  
  @js.native
  sealed trait TableType extends StObject
  /**
    * @since 1.115
    *
    * Defines the type of table used in the MDC table.
    */
  @JSImport("sap/ui/mdc/enums/TableType", "TableType")
  @js.native
  object TableType extends StObject {
    
    /**
      * Responsive table ({@link sap.m.Table} control) is used.
      */
    @js.native
    sealed trait ResponsiveTable
      extends StObject
         with TableType
    
    /**
      * Grid table ({@link sap.ui.table.Table} control) is used (default)
      */
    @js.native
    sealed trait Table
      extends StObject
         with TableType
  }
}
