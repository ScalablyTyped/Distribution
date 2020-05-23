package typings.nodePgMigrate.viewsTypesMod

import typings.nodePgMigrate.generalTypesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterViewColumnOptions extends js.Object {
  var default: js.UndefOr[Value] = js.undefined
}

object AlterViewColumnOptions {
  @scala.inline
  def apply(default: js.UndefOr[Null | Value] = js.undefined): AlterViewColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlterViewColumnOptions]
  }
}

