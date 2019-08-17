package typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentCardType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.types", "DocumentCardType")
@js.native
object DocumentCardType extends js.Object {
  /**
    * Compact layout. Displays the preview beside the details, rather than above.
    */
  @js.native
  sealed trait compact extends DocumentCardType
  
  /**
    * Standard DocumentCard.
    */
  @js.native
  sealed trait normal extends DocumentCardType
  
  /* 1 */ val compact: typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardDotTypesMod.DocumentCardType.compact with Double = js.native
  /* 0 */ val normal: typings.officeDashUiDashFabricDashReact.libComponentsDocumentCardDocumentCardDotTypesMod.DocumentCardType.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentCardType with Double] = js.native
}

