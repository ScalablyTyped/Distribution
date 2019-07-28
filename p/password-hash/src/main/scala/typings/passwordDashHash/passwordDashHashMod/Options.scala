package typings.passwordDashHash.passwordDashHashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var algorithm: js.UndefOr[String] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
  var saltLength: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(algorithm: String = null, iterations: Int | Double = null, saltLength: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (saltLength != null) __obj.updateDynamic("saltLength")(saltLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

