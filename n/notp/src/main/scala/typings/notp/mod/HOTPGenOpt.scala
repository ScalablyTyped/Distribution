package typings.notp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HOTPGenOpt extends js.Object {
  /**
    * Counter value used in generating the token. This should be stored by the
    * application, must be user specific, and be incremented for each request.
    */
  var counter: js.UndefOr[Double] = js.undefined
}

object HOTPGenOpt {
  @scala.inline
  def apply(counter: js.UndefOr[Double] = js.undefined): HOTPGenOpt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(counter)) __obj.updateDynamic("counter")(counter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HOTPGenOpt]
  }
}

