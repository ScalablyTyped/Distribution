package typings.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapSQL extends js.Object {
  var capSQL: js.UndefOr[Boolean] = js.undefined
}

object CapSQL {
  @scala.inline
  def apply(capSQL: js.UndefOr[Boolean] = js.undefined): CapSQL = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capSQL)) __obj.updateDynamic("capSQL")(capSQL.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapSQL]
  }
}

