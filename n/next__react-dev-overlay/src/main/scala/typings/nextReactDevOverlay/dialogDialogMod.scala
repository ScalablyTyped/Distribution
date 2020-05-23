package typings.nextReactDevOverlay

import typings.nextReactDevOverlay.nextReactDevOverlayStrings.error
import typings.nextReactDevOverlay.nextReactDevOverlayStrings.warning
import typings.react.mod.FC
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@next/react-dev-overlay/lib/internal/components/Dialog/Dialog", JSImport.Namespace)
@js.native
object dialogDialogMod extends js.Object {
  @js.native
  trait DialogProps extends js.Object {
    var `aria-describedby`: String = js.native
    var `aria-labelledby`: String = js.native
    var `type`: error | warning = js.native
    def onClose(e: MouseEvent): Unit = js.native
    def onClose(e: TouchEvent): Unit = js.native
  }
  
  val Dialog: FC[DialogProps] = js.native
}

