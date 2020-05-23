package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait N extends js.Object {
  //The total count of documents deleted.
  var n: js.UndefOr[Double] = js.undefined
  //Is 1 if the command executed correctly.
  var ok: js.UndefOr[Double] = js.undefined
}

object N {
  @scala.inline
  def apply(n: js.UndefOr[Double] = js.undefined, ok: js.UndefOr[Double] = js.undefined): N = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(n)) __obj.updateDynamic("n")(n.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ok)) __obj.updateDynamic("ok")(ok.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[N]
  }
}

