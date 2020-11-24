package typings.officeUiFabricReact.detailsListTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnActionsMode extends js.Object
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ColumnActionsMode")
@js.native
object ColumnActionsMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnActionsMode with Double] = js.native
  
  /** Renders the column header as clickable. Default value. */
  @js.native
  sealed trait clickable extends ColumnActionsMode
  /* 1 */ @js.native
  object clickable extends TopLevel[clickable with Double]
  
  /** Renders the column header as disabled. */
  @js.native
  sealed trait disabled extends ColumnActionsMode
  /* 0 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /** Renders the column header as clickable and displays the dropdown chevron. */
  @js.native
  sealed trait hasDropdown extends ColumnActionsMode
  /* 2 */ @js.native
  object hasDropdown extends TopLevel[hasDropdown with Double]
}
