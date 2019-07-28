package typings.atOracleOraclejet.ojdiagramMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrow
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrowConcave
import typings.atOracleOraclejet.atOracleOraclejetStrings.arrowOpen
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.circle
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typings.atOracleOraclejet.atOracleOraclejetStrings.rectangleRounded
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
    labelStyle: js.Object = null,
    selectable: auto | off = null,
    shortDesc: String = null,
    startConnectorType: arrow | arrowConcave | arrowOpen | circle | none | rectangle | rectangleRounded = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    width: Int | Double = null
  ): ojDiagramLinkSettableProperties = {
    val __obj = js.Dynamic.literal(categories = categories, endNode = endNode, startNode = startNode)
    if (color != null) __obj.updateDynamic("color")(color)
    if (endConnectorType != null) __obj.updateDynamic("endConnectorType")(endConnectorType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    if (startConnectorType != null) __obj.updateDynamic("startConnectorType")(startConnectorType.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDiagramLinkSettableProperties]
  }
}

