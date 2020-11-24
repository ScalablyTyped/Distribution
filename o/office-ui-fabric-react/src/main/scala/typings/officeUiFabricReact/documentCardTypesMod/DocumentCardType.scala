package typings.officeUiFabricReact.documentCardTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentCardType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.types", "DocumentCardType")
@js.native
object DocumentCardType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentCardType with Double] = js.native
  
  /**
    * Compact layout. Displays the preview beside the details, rather than above.
    */
  @js.native
  sealed trait compact extends DocumentCardType
  /* 1 */ @js.native
  object compact extends TopLevel[compact with Double]
  
  /**
    * Standard DocumentCard.
    */
  @js.native
  sealed trait normal extends DocumentCardType
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
}
