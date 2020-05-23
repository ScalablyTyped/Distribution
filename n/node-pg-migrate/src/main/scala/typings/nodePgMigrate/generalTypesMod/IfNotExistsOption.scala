package typings.nodePgMigrate.generalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfNotExistsOption extends js.Object {
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
}

object IfNotExistsOption {
  @scala.inline
  def apply(ifNotExists: js.UndefOr[Boolean] = js.undefined): IfNotExistsOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfNotExistsOption]
  }
}

