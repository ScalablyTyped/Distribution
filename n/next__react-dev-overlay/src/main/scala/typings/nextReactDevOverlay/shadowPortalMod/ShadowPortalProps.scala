package typings.nextReactDevOverlay.shadowPortalMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowPortalProps extends js.Object {
  var children: ReactNode
}

object ShadowPortalProps {
  @scala.inline
  def apply(children: ReactNode = null): ShadowPortalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowPortalProps]
  }
}

