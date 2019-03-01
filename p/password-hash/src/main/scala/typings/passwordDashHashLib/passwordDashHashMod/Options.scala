package typings
package passwordDashHashLib.passwordDashHashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  var iterations: js.UndefOr[scala.Double] = js.undefined
  var saltLength: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    algorithm: java.lang.String = null,
    iterations: scala.Int | scala.Double = null,
    saltLength: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (saltLength != null) __obj.updateDynamic("saltLength")(saltLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

