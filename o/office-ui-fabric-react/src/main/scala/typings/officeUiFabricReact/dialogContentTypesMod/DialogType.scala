package typings.officeUiFabricReact.dialogContentTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialogType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Dialog/DialogContent.types", "DialogType")
@js.native
object DialogType extends js.Object {
  /** Dialog with an 'x' close button in the upper-right corner */
  @js.native
  sealed trait close extends DialogType
  
  /** Dialog with large header banner */
  @js.native
  sealed trait largeHeader extends DialogType
  
  /** Standard dialog */
  @js.native
  sealed trait normal extends DialogType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialogType with Double] = js.native
  /* 2 */ @js.native
  object close extends TopLevel[close with Double]
  
  /* 1 */ @js.native
  object largeHeader extends TopLevel[largeHeader with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}

