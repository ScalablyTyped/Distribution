package typings.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOperatorClassOptions extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var family: js.UndefOr[String] = js.undefined
}

object CreateOperatorClassOptions {
  @scala.inline
  def apply(default: js.UndefOr[Boolean] = js.undefined, family: String = null): CreateOperatorClassOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOperatorClassOptions]
  }
}

