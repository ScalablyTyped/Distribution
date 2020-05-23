package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EagerOptions extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var joinOperation: String
  var minimize: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object EagerOptions {
  @scala.inline
  def apply(
    joinOperation: String,
    aliases: js.Array[String] = null,
    minimize: js.UndefOr[Boolean] = js.undefined,
    separator: String = null
  ): EagerOptions = {
    val __obj = js.Dynamic.literal(joinOperation = joinOperation.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize.get.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[EagerOptions]
  }
}

