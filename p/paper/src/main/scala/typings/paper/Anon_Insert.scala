package typings.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Insert extends js.Object {
  var insert: js.UndefOr[Boolean] = js.undefined
}

object Anon_Insert {
  @scala.inline
  def apply(insert: js.UndefOr[Boolean] = js.undefined): Anon_Insert = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insert)) __obj.updateDynamic("insert")(insert)
    __obj.asInstanceOf[Anon_Insert]
  }
}

