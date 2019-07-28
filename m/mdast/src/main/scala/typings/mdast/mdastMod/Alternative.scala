package typings.mdast.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternative extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
}

object Alternative {
  @scala.inline
  def apply(alt: String = null): Alternative = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    __obj.asInstanceOf[Alternative]
  }
}

