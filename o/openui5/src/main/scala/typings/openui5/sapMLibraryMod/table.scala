package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object table {
  
  object columnmenu {
    
    @js.native
    sealed trait Category extends StObject
    /**
      * @since 1.110
      *
      * Categories of column menu entries.
      */
    @JSImport("sap/m/library", "table.columnmenu.Category")
    @js.native
    object Category extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[Category & String] = js.native
      
      /**
        * Aggregate category
        */
      @js.native
      sealed trait Aggregate
        extends StObject
           with Category
      /* "Aggregate" */ val Aggregate: typings.openui5.sapMLibraryMod.table.columnmenu.Category.Aggregate & String = js.native
      
      /**
        * Filter category
        */
      @js.native
      sealed trait Filter
        extends StObject
           with Category
      /* "Filter" */ val Filter: typings.openui5.sapMLibraryMod.table.columnmenu.Category.Filter & String = js.native
      
      /**
        * Generic category
        */
      @js.native
      sealed trait Generic
        extends StObject
           with Category
      /* "Generic" */ val Generic: typings.openui5.sapMLibraryMod.table.columnmenu.Category.Generic & String = js.native
      
      /**
        * Group category
        */
      @js.native
      sealed trait Group
        extends StObject
           with Category
      /* "Group" */ val Group: typings.openui5.sapMLibraryMod.table.columnmenu.Category.Group & String = js.native
      
      /**
        * Sort category
        */
      @js.native
      sealed trait Sort
        extends StObject
           with Category
      /* "Sort" */ val Sort: typings.openui5.sapMLibraryMod.table.columnmenu.Category.Sort & String = js.native
    }
  }
}
