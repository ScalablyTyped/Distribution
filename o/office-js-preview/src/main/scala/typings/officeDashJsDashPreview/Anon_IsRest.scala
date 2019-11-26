package typings.officeDashJsDashPreview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsRest extends js.Object {
  var isRest: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsRest {
  @scala.inline
  def apply(isRest: js.UndefOr[Boolean] = js.undefined): Anon_IsRest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isRest)) __obj.updateDynamic("isRest")(isRest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsRest]
  }
}

