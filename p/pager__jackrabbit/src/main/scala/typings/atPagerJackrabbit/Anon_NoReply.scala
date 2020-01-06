package typings.atPagerJackrabbit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NoReply extends js.Object {
  var noReply: js.UndefOr[Boolean] = js.undefined
}

object Anon_NoReply {
  @scala.inline
  def apply(noReply: js.UndefOr[Boolean] = js.undefined): Anon_NoReply = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noReply)) __obj.updateDynamic("noReply")(noReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NoReply]
  }
}

