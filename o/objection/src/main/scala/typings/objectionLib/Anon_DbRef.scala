package typings
package objectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbRef extends js.Object {
  var `#dbRef`: js.UndefOr[scala.Nothing] = js.undefined
  var `#id`: js.UndefOr[java.lang.String] = js.undefined
  var `#ref`: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_DbRef {
  @scala.inline
  def apply(
    `#dbRef`: js.UndefOr[scala.Nothing] = js.undefined,
    `#id`: java.lang.String = null,
    `#ref`: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_DbRef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`#dbRef`)) __obj.updateDynamic("#dbRef")(`#dbRef`)
    if (`#id` != null) __obj.updateDynamic("#id")(`#id`)
    if (!js.isUndefined(`#ref`)) __obj.updateDynamic("#ref")(`#ref`)
    __obj.asInstanceOf[Anon_DbRef]
  }
}

