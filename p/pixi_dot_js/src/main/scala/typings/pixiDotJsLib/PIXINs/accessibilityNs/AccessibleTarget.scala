package typings
package pixiDotJsLib.PIXINs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibleTarget extends js.Object {
  var accessible: scala.Boolean
  var accessibleHint: java.lang.String | scala.Null
  var accessibleTitle: java.lang.String | scala.Null
  var tabIndex: scala.Double
}

object AccessibleTarget {
  @scala.inline
  def apply(
    accessible: scala.Boolean,
    tabIndex: scala.Double,
    accessibleHint: java.lang.String = null,
    accessibleTitle: java.lang.String = null
  ): AccessibleTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessible")(accessible)
    __obj.updateDynamic("tabIndex")(tabIndex)
    if (accessibleHint != null) __obj.updateDynamic("accessibleHint")(accessibleHint)
    if (accessibleTitle != null) __obj.updateDynamic("accessibleTitle")(accessibleTitle)
    __obj.asInstanceOf[AccessibleTarget]
  }
}

