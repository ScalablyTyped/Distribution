package typings.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascadeOption extends js.Object {
  var cascade: js.UndefOr[Boolean] = js.undefined
}

object CascadeOption {
  @scala.inline
  def apply(cascade: js.UndefOr[Boolean] = js.undefined): CascadeOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascadeOption]
  }
}

