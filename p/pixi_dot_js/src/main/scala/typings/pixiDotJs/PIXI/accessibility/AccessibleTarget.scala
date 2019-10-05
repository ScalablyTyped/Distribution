package typings.pixiDotJs.PIXI.accessibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibleTarget extends js.Object {
  var accessible: Boolean
  var accessibleHint: String | Null
  var accessibleTitle: String | Null
  var tabIndex: Double
}

object AccessibleTarget {
  @scala.inline
  def apply(
    accessible: Boolean,
    tabIndex: Double,
    accessibleHint: String = null,
    accessibleTitle: String = null
  ): AccessibleTarget = {
    val __obj = js.Dynamic.literal(accessible = accessible, tabIndex = tabIndex)
    if (accessibleHint != null) __obj.updateDynamic("accessibleHint")(accessibleHint)
    if (accessibleTitle != null) __obj.updateDynamic("accessibleTitle")(accessibleTitle)
    __obj.asInstanceOf[AccessibleTarget]
  }
}

