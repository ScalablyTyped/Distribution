package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paths extends js.Object {
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}

object Paths {
  @scala.inline
  def apply(paths: js.Array[String] = null): Paths = {
    val __obj = js.Dynamic.literal()
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
}

