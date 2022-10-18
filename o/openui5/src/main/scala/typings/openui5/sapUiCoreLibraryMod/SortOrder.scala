package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortOrder extends StObject
@JSImport("sap/ui/core/library", "SortOrder")
@js.native
object SortOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SortOrder & String] = js.native
  
  /**
    * Sorting is done in ascending order.
    */
  @js.native
  sealed trait Ascending
    extends StObject
       with SortOrder
  /* "Ascending" */ val Ascending: typings.openui5.sapUiCoreLibraryMod.SortOrder.Ascending & String = js.native
  
  /**
    * Sorting is done in descending order.
    */
  @js.native
  sealed trait Descending
    extends StObject
       with SortOrder
  /* "Descending" */ val Descending: typings.openui5.sapUiCoreLibraryMod.SortOrder.Descending & String = js.native
  
  /**
    * Sorting is not applied.
    */
  @js.native
  sealed trait None
    extends StObject
       with SortOrder
  /* "None" */ val None: typings.openui5.sapUiCoreLibraryMod.SortOrder.None & String = js.native
}
