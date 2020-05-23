package typings.passwordHash.mod

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
  def apply(
    algorithm: String = null,
    iterations: js.UndefOr[Double] = js.undefined,
    saltLength: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saltLength)) __obj.updateDynamic("saltLength")(saltLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

