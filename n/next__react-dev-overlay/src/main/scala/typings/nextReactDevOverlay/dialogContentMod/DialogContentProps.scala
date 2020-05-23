package typings.nextReactDevOverlay.dialogContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContentProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object DialogContentProps {
  @scala.inline
  def apply(className: String = null): DialogContentProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogContentProps]
  }
}

