package typings.officeUiFabricReact.dialogContentTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DialogType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Dialog/DialogContent.types", "DialogType")
@js.native
object DialogType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialogType with Double] = js.native
  
  /** Dialog with an 'x' close button in the upper-right corner */
  @js.native
  sealed trait close extends DialogType
  /* 2 */ @js.native
  object close extends TopLevel[close with Double]
  
  /** Dialog with large header banner */
  @js.native
  sealed trait largeHeader extends DialogType
  /* 1 */ @js.native
  object largeHeader extends TopLevel[largeHeader with Double]
  
  /** Standard dialog */
  @js.native
  sealed trait normal extends DialogType
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
}
