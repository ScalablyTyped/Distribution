package typings
package objectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbRefIdRef extends js.Object {
  var `#dbRef`: scala.Double
  var `#id`: js.UndefOr[scala.Nothing] = js.undefined
  var `#ref`: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_DbRefIdRef {
  @scala.inline
  def apply(
    `#dbRef`: scala.Double,
    `#id`: js.UndefOr[scala.Nothing] = js.undefined,
    `#ref`: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_DbRefIdRef = {
    val __obj = js.Dynamic.literal(`#dbRef` = `#dbRef`)
    if (!js.isUndefined(`#id`)) __obj.updateDynamic("#id")(`#id`)
    if (!js.isUndefined(`#ref`)) __obj.updateDynamic("#ref")(`#ref`)
    __obj.asInstanceOf[Anon_DbRefIdRef]
  }
}

