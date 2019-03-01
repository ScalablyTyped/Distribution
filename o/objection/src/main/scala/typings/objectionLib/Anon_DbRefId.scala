package typings
package objectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbRefId extends js.Object {
  var `#dbRef`: js.UndefOr[scala.Nothing] = js.undefined
  var `#id`: js.UndefOr[scala.Nothing] = js.undefined
  var `#ref`: java.lang.String
}

object Anon_DbRefId {
  @scala.inline
  def apply(
    `#ref`: java.lang.String,
    `#dbRef`: js.UndefOr[scala.Nothing] = js.undefined,
    `#id`: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_DbRefId = {
    val __obj = js.Dynamic.literal(`#ref` = `#ref`)
    if (!js.isUndefined(`#dbRef`)) __obj.updateDynamic("#dbRef")(`#dbRef`)
    if (!js.isUndefined(`#id`)) __obj.updateDynamic("#id")(`#id`)
    __obj.asInstanceOf[Anon_DbRefId]
  }
}

