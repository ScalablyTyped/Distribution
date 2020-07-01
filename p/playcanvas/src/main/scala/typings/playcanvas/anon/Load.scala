package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Load extends js.Object {
  var load: js.UndefOr[String] = js.undefined
  var original: js.UndefOr[String] = js.undefined
}

object Load {
  @scala.inline
  def apply(load: String = null, original: String = null): Load = {
    val __obj = js.Dynamic.literal()
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    __obj.asInstanceOf[Load]
  }
}

