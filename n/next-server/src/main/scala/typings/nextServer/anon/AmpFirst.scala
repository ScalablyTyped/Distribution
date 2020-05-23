package typings.nextServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmpFirst extends js.Object {
  var ampFirst: js.UndefOr[Boolean] = js.undefined
  var hasQuery: js.UndefOr[Boolean] = js.undefined
  var hybrid: js.UndefOr[Boolean] = js.undefined
}

object AmpFirst {
  @scala.inline
  def apply(
    ampFirst: js.UndefOr[Boolean] = js.undefined,
    hasQuery: js.UndefOr[Boolean] = js.undefined,
    hybrid: js.UndefOr[Boolean] = js.undefined
  ): AmpFirst = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ampFirst)) __obj.updateDynamic("ampFirst")(ampFirst.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasQuery)) __obj.updateDynamic("hasQuery")(hasQuery.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hybrid)) __obj.updateDynamic("hybrid")(hybrid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpFirst]
  }
}

