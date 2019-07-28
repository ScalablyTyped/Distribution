package typings.nodeDashPgDashMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[String] = js.undefined
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
}

object Anon_After {
  @scala.inline
  def apply(after: String = null, before: String = null, ifNotExists: js.UndefOr[Boolean] = js.undefined): Anon_After = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists)
    __obj.asInstanceOf[Anon_After]
  }
}

