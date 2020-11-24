package typings.officeUiFabricReact.detailsListTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DetailsListLayoutMode extends js.Object
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "DetailsListLayoutMode")
@js.native
object DetailsListLayoutMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DetailsListLayoutMode with Double] = js.native
  
  /**
    * Lets the user resize columns and makes not attempt to fit them.
    */
  @js.native
  sealed trait fixedColumns extends DetailsListLayoutMode
  /* 0 */ @js.native
  object fixedColumns extends TopLevel[fixedColumns with Double]
  
  /**
    * Manages which columns are visible, tries to size them according to their min/max rules and drops
    * off columns that can't fit and have isCollapsible set.
    */
  @js.native
  sealed trait justified extends DetailsListLayoutMode
  /* 1 */ @js.native
  object justified extends TopLevel[justified with Double]
}
