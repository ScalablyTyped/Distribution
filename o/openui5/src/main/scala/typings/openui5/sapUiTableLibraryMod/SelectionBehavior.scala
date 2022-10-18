package typings.openui5.sapUiTableLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionBehavior extends StObject
@JSImport("sap/ui/table/library", "SelectionBehavior")
@js.native
object SelectionBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectionBehavior & String] = js.native
  
  /**
    * Rows can be selected on the complete row.
    */
  @js.native
  sealed trait Row
    extends StObject
       with SelectionBehavior
  /* "Row" */ val Row: typings.openui5.sapUiTableLibraryMod.SelectionBehavior.Row & String = js.native
  
  /**
    * Rows can only be selected on the row (and the selector is hidden).
    */
  @js.native
  sealed trait RowOnly
    extends StObject
       with SelectionBehavior
  /* "RowOnly" */ val RowOnly: typings.openui5.sapUiTableLibraryMod.SelectionBehavior.RowOnly & String = js.native
  
  /**
    * Rows can only be selected on the row selector.
    */
  @js.native
  sealed trait RowSelector
    extends StObject
       with SelectionBehavior
  /* "RowSelector" */ val RowSelector: typings.openui5.sapUiTableLibraryMod.SelectionBehavior.RowSelector & String = js.native
}
