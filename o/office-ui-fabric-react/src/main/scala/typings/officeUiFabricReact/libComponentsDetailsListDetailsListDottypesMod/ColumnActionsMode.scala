package typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnActionsMode extends StObject
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ColumnActionsMode")
@js.native
object ColumnActionsMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnActionsMode & Double] = js.native
  
  /** Renders the column header as clickable. Default value. */
  @js.native
  sealed trait clickable
    extends StObject
       with ColumnActionsMode
  /* 1 */ val clickable: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnActionsMode.clickable & Double = js.native
  
  /** Renders the column header as disabled. */
  @js.native
  sealed trait disabled
    extends StObject
       with ColumnActionsMode
  /* 0 */ val disabled: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnActionsMode.disabled & Double = js.native
  
  /** Renders the column header as clickable and displays the dropdown chevron. */
  @js.native
  sealed trait hasDropdown
    extends StObject
       with ColumnActionsMode
  /* 2 */ val hasDropdown: typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ColumnActionsMode.hasDropdown & Double = js.native
}
