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
  def apply(counter: Int | Double = null): HOTPGenOpt = {
    val __obj = js.Dynamic.literal()
    if (counter != null) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    __obj.asInstanceOf[HOTPGenOpt]
  }
}

