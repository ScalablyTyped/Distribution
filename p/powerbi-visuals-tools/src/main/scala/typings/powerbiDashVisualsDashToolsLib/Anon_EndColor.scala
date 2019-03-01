package typings
package powerbiDashVisualsDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndColor extends js.Object {
  var endColor: js.UndefOr[java.lang.String] = js.undefined
  var startColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EndColor {
  @scala.inline
  def apply(endColor: java.lang.String = null, startColor: java.lang.String = null): Anon_EndColor = {
    val __obj = js.Dynamic.literal()
    if (endColor != null) __obj.updateDynamic("endColor")(endColor)
    if (startColor != null) __obj.updateDynamic("startColor")(startColor)
    __obj.asInstanceOf[Anon_EndColor]
  }
}

