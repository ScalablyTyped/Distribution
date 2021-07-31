package typings.officeUiFabricReact.detailsListTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DetailsListLayoutMode extends StObject
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "DetailsListLayoutMode")
@js.native
object DetailsListLayoutMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DetailsListLayoutMode & Double] = js.native
  
  /**
    * Lets the user resize columns and makes not attempt to fit them.
    */
  @js.native
  sealed trait fixedColumns
    extends StObject
       with DetailsListLayoutMode
  /* 0 */ val fixedColumns: typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.fixedColumns & Double = js.native
  
  /**
    * Manages which columns are visible, tries to size them according to their min/max rules and drops
    * off columns that can't fit and have isCollapsible set.
    */
  @js.native
  sealed trait justified
    extends StObject
       with DetailsListLayoutMode
  /* 1 */ val justified: typings.officeUiFabricReact.detailsListTypesMod.DetailsListLayoutMode.justified & Double = js.native
}
