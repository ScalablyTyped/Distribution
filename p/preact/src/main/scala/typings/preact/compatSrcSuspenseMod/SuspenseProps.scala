package typings.preact.compatSrcSuspenseMod

import typings.preact.srcMod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuspenseProps extends js.Object {
  var children: js.UndefOr[ComponentChildren] = js.undefined
  var fallback: ComponentChildren
}

object SuspenseProps {
  @scala.inline
  def apply(fallback: ComponentChildren, children: ComponentChildren = null): SuspenseProps = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseProps]
  }
}

