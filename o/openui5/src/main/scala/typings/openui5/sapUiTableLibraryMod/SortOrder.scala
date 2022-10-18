package typings.openui5.sapUiTableLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortOrder extends StObject
@JSImport("sap/ui/table/library", "SortOrder")
@js.native
object SortOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortOrder & String] = js.native
  
  /**
    * Sort Order: ascending.
    */
  @js.native
  sealed trait Ascending
    extends StObject
       with SortOrder
  /* "Ascending" */ val Ascending: typings.openui5.sapUiTableLibraryMod.SortOrder.Ascending & String = js.native
  
  /**
    * Sort Order: descending.
    */
  @js.native
  sealed trait Descending
    extends StObject
       with SortOrder
  /* "Descending" */ val Descending: typings.openui5.sapUiTableLibraryMod.SortOrder.Descending & String = js.native
}
