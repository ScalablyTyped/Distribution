package typings.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfExistsOption extends js.Object {
  var ifExists: js.UndefOr[Boolean] = js.undefined
}

object IfExistsOption {
  @scala.inline
  def apply(ifExists: js.UndefOr[Boolean] = js.undefined): IfExistsOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifExists)) __obj.updateDynamic("ifExists")(ifExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfExistsOption]
  }
}

