package typings.nextReactDevOverlay.dialogHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogHeaderProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object DialogHeaderProps {
  @scala.inline
  def apply(className: String = null): DialogHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogHeaderProps]
  }
}

