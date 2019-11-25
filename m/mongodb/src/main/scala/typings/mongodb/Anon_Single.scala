package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Single extends js.Object {
  var single: js.UndefOr[Boolean] = js.undefined
}

object Anon_Single {
  @scala.inline
  def apply(single: js.UndefOr[Boolean] = js.undefined): Anon_Single = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Single]
  }
}

