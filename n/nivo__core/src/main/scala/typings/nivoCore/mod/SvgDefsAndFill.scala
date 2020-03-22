package typings.nivoCore.mod

import typings.nivoCore.AnonDictkey
import typings.nivoCore.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgDefsAndFill[T] extends js.Object {
  var defs: js.UndefOr[js.Array[AnonDictkey]] = js.undefined
  var fill: js.UndefOr[js.Array[AnonId[T]]] = js.undefined
}

object SvgDefsAndFill {
  @scala.inline
  def apply[T](defs: js.Array[AnonDictkey] = null, fill: js.Array[AnonId[T]] = null): SvgDefsAndFill[T] = {
    val __obj = js.Dynamic.literal()
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgDefsAndFill[T]]
  }
}

