package typings.poly2tri.poly2triMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SweepContextOptions extends js.Object {
  /**
    * cloneArrays - if `true`, do a shallow copy of the Array parameters (contour, holes).
    * Points inside arrays are never copied.
    * Default is `false` : keep a reference to the array arguments, who will be modified in place.
    */
  var cloneArrays: js.UndefOr[Boolean] = js.undefined
}

object SweepContextOptions {
  @scala.inline
  def apply(cloneArrays: js.UndefOr[Boolean] = js.undefined): SweepContextOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cloneArrays)) __obj.updateDynamic("cloneArrays")(cloneArrays)
    __obj.asInstanceOf[SweepContextOptions]
  }
}

