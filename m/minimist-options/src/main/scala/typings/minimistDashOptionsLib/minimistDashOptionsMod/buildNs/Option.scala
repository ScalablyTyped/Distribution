package typings
package minimistDashOptionsLib.minimistDashOptionsMod.buildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var alias: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[Type] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    alias: java.lang.String | js.Array[java.lang.String] = null,
    default: js.Any = null,
    `type`: Type = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Option]
  }
}

