package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.arrow
import typings.oracleOraclejet.oracleOraclejetStrings.arrowConcave
import typings.oracleOraclejet.oracleOraclejetStrings.arrowOpen
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.rectangleRounded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDiagramLinkSettableProperties extends JetSettableProperties {
  var categories: js.Array[String]
  var color: js.UndefOr[String] = js.undefined
  var endConnectorType: js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.undefined
  var endNode: js.Any
  var label: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[js.Object | Null] = js.undefined
  var selectable: js.UndefOr[auto | off] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var startConnectorType: js.UndefOr[arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded] = js.undefined
  var startNode: js.Any
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ojDiagramLinkSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[String],
    endNode: js.Any,
    startNode: js.Any,
    color: String = null,
    endConnectorType: arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded = null,
    label: String = null,
    labelStyle: js.UndefOr[Null | js.Object] = js.undefined,
    selectable: auto | off = null,
    shortDesc: String = null,
    startConnectorType: arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    width: js.UndefOr[Double] = js.undefined
  ): ojDiagramLinkSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], endNode = endNode.asInstanceOf[js.Any], startNode = startNode.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (endConnectorType != null) __obj.updateDynamic("endConnectorType")(endConnectorType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelStyle)) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (startConnectorType != null) __obj.updateDynamic("startConnectorType")(startConnectorType.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramLinkSettableProperties]
  }
}

