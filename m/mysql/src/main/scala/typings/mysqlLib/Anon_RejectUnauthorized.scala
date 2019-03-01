package typings
package mysqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RejectUnauthorized extends js.Object {
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_RejectUnauthorized {
  @scala.inline
  def apply(rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined): Anon_RejectUnauthorized = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[Anon_RejectUnauthorized]
  }
}

