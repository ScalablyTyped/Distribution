package typings.openui5.sapUiTableLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionMode extends StObject
@JSImport("sap/ui/table/library", "SelectionMode")
@js.native
object SelectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectionMode & String] = js.native
  
  /**
    * @deprecated (since 1.38) - replaced by {@link sap.ui.table.SelectionMode.MultiToggle}
    *
    * Select multiple rows at a time.
    */
  @js.native
  sealed trait Multi
    extends StObject
       with SelectionMode
  /* "Multi" */ val Multi: typings.openui5.sapUiTableLibraryMod.SelectionMode.Multi & String = js.native
  
  /**
    * Select multiple rows at a time (toggle behavior).
    */
  @js.native
  sealed trait MultiToggle
    extends StObject
       with SelectionMode
  /* "MultiToggle" */ val MultiToggle: typings.openui5.sapUiTableLibraryMod.SelectionMode.MultiToggle & String = js.native
  
  /**
    * No rows can be selected.
    */
  @js.native
  sealed trait None
    extends StObject
       with SelectionMode
  /* "None" */ val None: typings.openui5.sapUiTableLibraryMod.SelectionMode.None & String = js.native
  
  /**
    * Select one row at a time.
    */
  @js.native
  sealed trait Single
    extends StObject
       with SelectionMode
  /* "Single" */ val Single: typings.openui5.sapUiTableLibraryMod.SelectionMode.Single & String = js.native
}
