package typings.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Simplify extends js.Object {
  var simplify: js.UndefOr[Boolean] = js.undefined
}

object Anon_Simplify {
  @scala.inline
  def apply(simplify: js.UndefOr[Boolean] = js.undefined): Anon_Simplify = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(simplify)) __obj.updateDynamic("simplify")(simplify)
    __obj.asInstanceOf[Anon_Simplify]
  }
}

