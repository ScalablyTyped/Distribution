package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardDotTypesMod

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
  sealed trait compact
    extends officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardDotTypesMod.DocumentCardType
  
  /**
       * Standard DocumentCard.
       */
  @js.native
  sealed trait normal
    extends officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardDotTypesMod.DocumentCardType
  
  /* 1 */ val compact: compact with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardDotTypesMod.DocumentCardType with scala.Double
  ] = js.native
}

