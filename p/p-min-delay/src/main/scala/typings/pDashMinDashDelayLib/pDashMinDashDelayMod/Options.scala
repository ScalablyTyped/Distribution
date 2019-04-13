package typings
package pDashMinDashDelayLib.pDashMinDashDelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Delay the rejection.
  		Turn this off if you want a rejected promise to fail fast.
  		@default true
  		*/
  val delayRejection: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(delayRejection: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayRejection)) __obj.updateDynamic("delayRejection")(delayRejection)
    __obj.asInstanceOf[Options]
  }
}

