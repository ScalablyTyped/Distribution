package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pad extends js.Object {
  var pad: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Pad {
  @scala.inline
  def apply(pad: scala.Int | scala.Double = null): Anon_Pad = {
    val __obj = js.Dynamic.literal()
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Pad]
  }
}

