package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsTableP13nModeMod {
  
  /**
    * @since 1.115
    *
    * Defines the personalization mode of the table.
    */
  @JSImport("sap/ui/mdc/enums/TableP13nMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableP13nMode & String] = js.native
    
    /* "Aggregate" */ val Aggregate: typings.openui5.sapUiMdcEnumsTableP13nModeMod.TableP13nMode.Aggregate & String = js.native
    
    /* "Column" */ val Column: typings.openui5.sapUiMdcEnumsTableP13nModeMod.TableP13nMode.Column & String = js.native
    
    /* "Filter" */ val Filter: typings.openui5.sapUiMdcEnumsTableP13nModeMod.TableP13nMode.Filter & String = js.native
    
    /* "Group" */ val Group: typings.openui5.sapUiMdcEnumsTableP13nModeMod.TableP13nMode.Group & String = js.native
    
    /* "Sort" */ val Sort: typings.openui5.sapUiMdcEnumsTableP13nModeMod.TableP13nMode.Sort & String = js.native
  }
  
  @js.native
  sealed trait TableP13nMode extends StObject
  /**
    * @since 1.115
    *
    * Defines the personalization mode of the table.
    */
  @JSImport("sap/ui/mdc/enums/TableP13nMode", "TableP13nMode")
  @js.native
  object TableP13nMode extends StObject {
    
    /**
      * Aggregation personalization is enabled.
      */
    @js.native
    sealed trait Aggregate
      extends StObject
         with TableP13nMode
    
    /**
      * Column personalization is enabled.
      */
    @js.native
    sealed trait Column
      extends StObject
         with TableP13nMode
    
    /**
      * Filter personalization is enabled.
      */
    @js.native
    sealed trait Filter
      extends StObject
         with TableP13nMode
    
    /**
      * Group personalization is enabled.
      */
    @js.native
    sealed trait Group
      extends StObject
         with TableP13nMode
    
    /**
      * Sort personalization is enabled.
      */
    @js.native
    sealed trait Sort
      extends StObject
         with TableP13nMode
  }
}
