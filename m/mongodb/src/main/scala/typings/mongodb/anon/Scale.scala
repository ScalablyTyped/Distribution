package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale extends js.Object {
  var scale: js.UndefOr[Double] = js.undefined
}

object Scale {
  @scala.inline
  def apply(scale: js.UndefOr[Double] = js.undefined): Scale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

