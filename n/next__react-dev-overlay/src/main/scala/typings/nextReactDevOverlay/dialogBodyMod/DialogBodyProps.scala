package typings.nextReactDevOverlay.dialogBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogBodyProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object DialogBodyProps {
  @scala.inline
  def apply(className: String = null): DialogBodyProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogBodyProps]
  }
}

