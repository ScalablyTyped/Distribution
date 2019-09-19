package typings.orientjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxNumber extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
}

object Anon_MaxNumber {
  @scala.inline
  def apply(max: Int | Double = null): Anon_MaxNumber = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxNumber]
  }
}

