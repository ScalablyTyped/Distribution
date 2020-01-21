package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPaths extends js.Object {
  var paths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AnonPaths {
  @scala.inline
  def apply(paths: js.Array[java.lang.String] = null): AnonPaths = {
    val __obj = js.Dynamic.literal()
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPaths]
  }
}

