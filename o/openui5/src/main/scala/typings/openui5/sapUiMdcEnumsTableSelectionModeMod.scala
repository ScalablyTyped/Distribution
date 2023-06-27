package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsTableSelectionModeMod {
  
  /**
    * @since 1.115
    *
    * Defines the mode of the table.
    */
  @JSImport("sap/ui/mdc/enums/TableSelectionMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableSelectionMode & String] = js.native
    
    /* "Multi" */ val Multi: typings.openui5.sapUiMdcEnumsTableSelectionModeMod.TableSelectionMode.Multi & String = js.native
    
    /* "None" */ val None: typings.openui5.sapUiMdcEnumsTableSelectionModeMod.TableSelectionMode.None & String = js.native
    
    /* "Single" */ val Single: typings.openui5.sapUiMdcEnumsTableSelectionModeMod.TableSelectionMode.Single & String = js.native
    
    /* "SingleMaster" */ val SingleMaster: typings.openui5.sapUiMdcEnumsTableSelectionModeMod.TableSelectionMode.SingleMaster & String = js.native
  }
  
  @js.native
  sealed trait TableSelectionMode extends StObject
  /**
    * @since 1.115
    *
    * Defines the mode of the table.
    */
  @JSImport("sap/ui/mdc/enums/TableSelectionMode", "TableSelectionMode")
  @js.native
  object TableSelectionMode extends StObject {
    
    /**
      * Multiple rows/items can be selected at a time.
      */
    @js.native
    sealed trait Multi
      extends StObject
         with TableSelectionMode
    
    /**
      * No rows/items can be selected (default).
      */
    @js.native
    sealed trait None
      extends StObject
         with TableSelectionMode
    
    /**
      * Only one row/item can be selected at a time.
      */
    @js.native
    sealed trait Single
      extends StObject
         with TableSelectionMode
    
    /**
      * Only one row/item can be selected at a time. Should be used for navigation scenarios to indicate the
      * navigated row/item. If this selection mode is used, no `rowPress` event is fired.
      */
    @js.native
    sealed trait SingleMaster
      extends StObject
         with TableSelectionMode
  }
}
