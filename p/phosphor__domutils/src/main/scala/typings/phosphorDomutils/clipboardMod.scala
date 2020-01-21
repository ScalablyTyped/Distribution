package typings.phosphorDomutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/domutils/lib/clipboard", JSImport.Namespace)
@js.native
object clipboardMod extends js.Object {
  @js.native
  object ClipboardExt extends js.Object {
    /**
      * Copy text to the system clipboard.
      *
      * @param text - The text to copy to the clipboard.
      */
    def copyText(text: String): Unit = js.native
  }
  
}

