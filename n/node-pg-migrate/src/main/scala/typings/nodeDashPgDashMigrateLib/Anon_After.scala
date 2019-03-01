package typings
package nodeDashPgDashMigrateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  var after: js.UndefOr[java.lang.String] = js.undefined
  var before: js.UndefOr[java.lang.String] = js.undefined
  var ifNotExists: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_After {
  @scala.inline
  def apply(
    after: java.lang.String = null,
    before: java.lang.String = null,
    ifNotExists: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_After = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists)
    __obj.asInstanceOf[Anon_After]
  }
}

