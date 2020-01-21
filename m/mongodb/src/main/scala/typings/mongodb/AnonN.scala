package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonN extends js.Object {
  //The total count of documents deleted.
  var n: js.UndefOr[Double] = js.undefined
  //Is 1 if the command executed correctly.
  var ok: js.UndefOr[Double] = js.undefined
}

object AnonN {
  @scala.inline
  def apply(n: Int | Double = null, ok: Int | Double = null): AnonN = {
    val __obj = js.Dynamic.literal()
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonN]
  }
}

