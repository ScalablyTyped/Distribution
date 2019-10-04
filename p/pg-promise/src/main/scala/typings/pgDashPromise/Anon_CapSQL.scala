package typings.pgDashPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CapSQL extends js.Object {
  var capSQL: js.UndefOr[Boolean] = js.undefined
}

object Anon_CapSQL {
  @scala.inline
  def apply(capSQL: js.UndefOr[Boolean] = js.undefined): Anon_CapSQL = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capSQL)) __obj.updateDynamic("capSQL")(capSQL)
    __obj.asInstanceOf[Anon_CapSQL]
  }
}

