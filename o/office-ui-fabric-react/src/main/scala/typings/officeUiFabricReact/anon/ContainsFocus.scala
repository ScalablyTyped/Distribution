package typings.officeUiFabricReact.anon

import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainsFocus extends js.Object {
  var containsFocus: Boolean
  var originalElement: js.UndefOr[HTMLElement | Window] = js.undefined
}

object ContainsFocus {
  @scala.inline
  def apply(containsFocus: Boolean, originalElement: HTMLElement | Window = null): ContainsFocus = {
    val __obj = js.Dynamic.literal(containsFocus = containsFocus.asInstanceOf[js.Any])
    if (originalElement != null) __obj.updateDynamic("originalElement")(originalElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsFocus]
  }
}

