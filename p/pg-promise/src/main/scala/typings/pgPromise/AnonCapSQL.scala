package typings.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapSQL extends js.Object {
  var capSQL: js.UndefOr[Boolean] = js.undefined
}

object AnonCapSQL {
  @scala.inline
  def apply(capSQL: js.UndefOr[Boolean] = js.undefined): AnonCapSQL = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capSQL)) __obj.updateDynamic("capSQL")(capSQL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCapSQL]
  }
}

