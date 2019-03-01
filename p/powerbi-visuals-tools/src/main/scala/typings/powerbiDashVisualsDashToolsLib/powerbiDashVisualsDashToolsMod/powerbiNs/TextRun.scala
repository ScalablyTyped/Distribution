package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRun extends js.Object {
  var textStyle: js.UndefOr[TextRunStyle] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
  var valueExpr: js.UndefOr[
    powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
  ] = js.undefined
}

object TextRun {
  @scala.inline
  def apply(
    value: java.lang.String,
    textStyle: TextRunStyle = null,
    url: java.lang.String = null,
    valueExpr: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr = null
  ): TextRun = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (url != null) __obj.updateDynamic("url")(url)
    if (valueExpr != null) __obj.updateDynamic("valueExpr")(valueExpr)
    __obj.asInstanceOf[TextRun]
  }
}

