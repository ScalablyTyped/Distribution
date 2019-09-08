package typings.atPhosphorDomutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/domutils/lib/clipboard", JSImport.Namespace)
@js.native
object libClipboardMod extends js.Object {
  @JSName("ClipboardExt")
  @js.native
  object ClipboardExtNs extends js.Object {
    /**
      * Copy text to the system clipboard.
      *
      * @param text - The text to copy to the clipboard.
      */
    def copyText(text: String): Unit = js.native
  }
  
}

