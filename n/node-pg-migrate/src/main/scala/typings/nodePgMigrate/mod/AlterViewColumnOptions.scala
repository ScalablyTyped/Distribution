package typings.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterViewColumnOptions extends js.Object {
  var default: js.UndefOr[Value] = js.undefined
}

object AlterViewColumnOptions {
  @scala.inline
  def apply(default: Value = null): AlterViewColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlterViewColumnOptions]
  }
}

