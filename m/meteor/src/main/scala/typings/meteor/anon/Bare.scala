package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bare extends js.Object {
  var bare: js.UndefOr[Boolean] = js.undefined
}

object Bare {
  @scala.inline
  def apply(bare: js.UndefOr[Boolean] = js.undefined): Bare = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bare)) __obj.updateDynamic("bare")(bare.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bare]
  }
}

