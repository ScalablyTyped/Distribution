package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_J extends js.Object {
  var j: js.UndefOr[Boolean] = js.undefined
  var w: js.UndefOr[Double | String] = js.undefined
  var wtimeout: js.UndefOr[Double] = js.undefined
}

object Anon_J {
  @scala.inline
  def apply(j: js.UndefOr[Boolean] = js.undefined, w: Double | String = null, wtimeout: Int | Double = null): Anon_J = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_J]
  }
}

