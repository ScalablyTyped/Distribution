package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Paths extends js.Object {
  var paths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Paths {
  @scala.inline
  def apply(paths: js.Array[java.lang.String] = null): Anon_Paths = {
    val __obj = js.Dynamic.literal()
    if (paths != null) __obj.updateDynamic("paths")(paths)
    __obj.asInstanceOf[Anon_Paths]
  }
}

