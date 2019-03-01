package typings
package orientjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Force extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var ifexist: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Force {
  @scala.inline
  def apply(force: js.UndefOr[scala.Boolean] = js.undefined, ifexist: js.UndefOr[scala.Boolean] = js.undefined): Anon_Force = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(ifexist)) __obj.updateDynamic("ifexist")(ifexist)
    __obj.asInstanceOf[Anon_Force]
  }
}

