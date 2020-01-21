package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRejectUnauthorized extends js.Object {
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
   // Defaults to true
  var servername: js.UndefOr[java.lang.String] = js.undefined
}

object AnonRejectUnauthorized {
  @scala.inline
  def apply(rejectUnauthorized: js.UndefOr[Boolean] = js.undefined, servername: java.lang.String = null): AnonRejectUnauthorized = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRejectUnauthorized]
  }
}

