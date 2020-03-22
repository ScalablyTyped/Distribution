package typings.nodePgMigrate.typesTypesMod

import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTypeValueOptions extends IfNotExistsOption {
  var after: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[String] = js.undefined
}

object AddTypeValueOptions {
  @scala.inline
  def apply(after: String = null, before: String = null, ifNotExists: js.UndefOr[Boolean] = js.undefined): AddTypeValueOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTypeValueOptions]
  }
}

