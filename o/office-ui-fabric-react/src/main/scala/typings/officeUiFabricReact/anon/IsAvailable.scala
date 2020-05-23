package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsAvailable extends js.Object {
  var isAvailable: Boolean
  var isAway: Boolean
  var isBlocked: Boolean
  var isBusy: Boolean
  var isDoNotDisturb: Boolean
  var isOffline: Boolean
}

object IsAvailable {
  @scala.inline
  def apply(
    isAvailable: Boolean,
    isAway: Boolean,
    isBlocked: Boolean,
    isBusy: Boolean,
    isDoNotDisturb: Boolean,
    isOffline: Boolean
  ): IsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], isAway = isAway.asInstanceOf[js.Any], isBlocked = isBlocked.asInstanceOf[js.Any], isBusy = isBusy.asInstanceOf[js.Any], isDoNotDisturb = isDoNotDisturb.asInstanceOf[js.Any], isOffline = isOffline.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAvailable]
  }
}

