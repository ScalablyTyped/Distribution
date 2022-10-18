package typings.openui5.sapUiTableLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigationMode extends StObject
@JSImport("sap/ui/table/library", "NavigationMode")
@js.native
object NavigationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NavigationMode & String] = js.native
  
  /**
    * @deprecated (since 1.38) - replaced by {@link sap.ui.table.NavigationMode.Scrollbar}
    *
    * Uses the paginator control. This option must no longer be used. Using a scrollbar is the only navigation
    * mode which is supported by the `sap.ui.table` library. The `navigationMode` property has always been
    * a visual representation. No matter which navigation mode is used, data fetched from an OData service
    * is loaded page-wise.
    */
  @js.native
  sealed trait Paginator
    extends StObject
       with NavigationMode
  /* "Paginator" */ val Paginator: typings.openui5.sapUiTableLibraryMod.NavigationMode.Paginator & String = js.native
  
  /**
    * Uses the scrollbar control.
    */
  @js.native
  sealed trait Scrollbar
    extends StObject
       with NavigationMode
  /* "Scrollbar" */ val Scrollbar: typings.openui5.sapUiTableLibraryMod.NavigationMode.Scrollbar & String = js.native
}
