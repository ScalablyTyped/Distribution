package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_N extends js.Object {
  //The total count of documents deleted.
  var n: js.UndefOr[scala.Double] = js.undefined
  //Is 1 if the command executed correctly.
  var ok: js.UndefOr[scala.Double] = js.undefined
}

object Anon_N {
  @scala.inline
  def apply(n: scala.Int | scala.Double = null, ok: scala.Int | scala.Double = null): Anon_N = {
    val __obj = js.Dynamic.literal()
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_N]
  }
}

