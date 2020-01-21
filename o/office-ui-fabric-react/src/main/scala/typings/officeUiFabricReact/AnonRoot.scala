package typings.officeUiFabricReact

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoot extends js.Object {
  var root: IStyle
}

object AnonRoot {
  @scala.inline
  def apply(root: IStyle = null): AnonRoot = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRoot]
  }
}

