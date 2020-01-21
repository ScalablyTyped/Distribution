package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDev extends js.Object {
  /**
    * Whether to launch Next.js in dev mode - @default false
    */
  var dev: js.UndefOr[Boolean] = js.undefined
}

object AnonDev {
  @scala.inline
  def apply(dev: js.UndefOr[Boolean] = js.undefined): AnonDev = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDev]
  }
}

