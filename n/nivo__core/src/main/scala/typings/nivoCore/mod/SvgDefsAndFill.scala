package typings.nivoCore.mod

import typings.nivoCore.Anon
import typings.nivoCore.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgDefsAndFill[T] extends js.Object {
  var defs: js.UndefOr[js.Array[AnonId]] = js.undefined
  var fill: js.UndefOr[js.Array[Anon[T]]] = js.undefined
}

object SvgDefsAndFill {
  @scala.inline
  def apply[T](defs: js.Array[AnonId] = null, fill: js.Array[Anon[T]] = null): SvgDefsAndFill[T] = {
    val __obj = js.Dynamic.literal()
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgDefsAndFill[T]]
  }
}

