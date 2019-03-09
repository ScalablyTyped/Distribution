package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBVersionChangeEventInit extends EventInit {
  var newVersion: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var oldVersion: js.UndefOr[scala.Double] = js.undefined
}

object IDBVersionChangeEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    newVersion: scala.Int | scala.Double = null,
    oldVersion: scala.Int | scala.Double = null
  ): IDBVersionChangeEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (newVersion != null) __obj.updateDynamic("newVersion")(newVersion.asInstanceOf[js.Any])
    if (oldVersion != null) __obj.updateDynamic("oldVersion")(oldVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBVersionChangeEventInit]
  }
}

