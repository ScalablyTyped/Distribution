package typings.officeUiFabricReact.detailsListTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnActionsMode extends js.Object

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "ColumnActionsMode")
@js.native
object ColumnActionsMode extends js.Object {
  /**
    * Renders the column header is clickable.
    */
  @js.native
  sealed trait clickable extends ColumnActionsMode
  
  /**
    * Renders the column header as disabled.
    */
  @js.native
  sealed trait disabled extends ColumnActionsMode
  
  /**
    * Renders the column header ias clickable and displays the dropdown cheveron.
    */
  @js.native
  sealed trait hasDropdown extends ColumnActionsMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnActionsMode with Double] = js.native
  /* 1 */ @js.native
  object clickable extends TopLevel[clickable with Double]
  
  /* 0 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 2 */ @js.native
  object hasDropdown extends TopLevel[hasDropdown with Double]
  
}

