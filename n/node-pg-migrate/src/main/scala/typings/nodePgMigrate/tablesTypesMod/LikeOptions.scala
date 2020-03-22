package typings.nodePgMigrate.tablesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LikeOptions extends js.Object {
  var excluding: js.UndefOr[Like | js.Array[Like]] = js.undefined
  var including: js.UndefOr[Like | js.Array[Like]] = js.undefined
}

object LikeOptions {
  @scala.inline
  def apply(excluding: Like | js.Array[Like] = null, including: Like | js.Array[Like] = null): LikeOptions = {
    val __obj = js.Dynamic.literal()
    if (excluding != null) __obj.updateDynamic("excluding")(excluding.asInstanceOf[js.Any])
    if (including != null) __obj.updateDynamic("including")(including.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikeOptions]
  }
}

