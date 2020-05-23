package typings.openfin.utilsMod

import typings.jquery.JQuery.DragEventBase
import typings.openfin.identityMod.Identity
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/utils", "isSameApp")
@js.native
object isSameApp extends js.Object {
  def apply(
    e: DragEventBase[HTMLElement, js.UndefOr[scala.Nothing], HTMLElement, HTMLElement],
    currentWindow: Identity
  ): Boolean = js.native
}

