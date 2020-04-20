package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFinFrameStatic extends js.Object {
  def getCurrent(): OpenFinFrame
  def wrap(uuid: String, name: String): OpenFinFrame
}

object OpenFinFrameStatic {
  @scala.inline
  def apply(getCurrent: () => OpenFinFrame, wrap: (String, String) => OpenFinFrame): OpenFinFrameStatic = {
    val __obj = js.Dynamic.literal(getCurrent = js.Any.fromFunction0(getCurrent), wrap = js.Any.fromFunction2(wrap))
    __obj.asInstanceOf[OpenFinFrameStatic]
  }
}

