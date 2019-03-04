package typings
package atOracleOraclejetLib.ojdiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDiagramLinkSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var categories: js.Array[java.lang.String]
  var color: js.UndefOr[java.lang.String] = js.undefined
  var endConnectorType: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
  ] = js.undefined
  var endNode: js.Any
  var label: js.UndefOr[java.lang.String] = js.undefined
  var labelStyle: js.UndefOr[js.Object | scala.Null] = js.undefined
  var selectable: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ] = js.undefined
  var shortDesc: js.UndefOr[java.lang.String] = js.undefined
  var startConnectorType: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded
  ] = js.undefined
  var startNode: js.Any
  var svgClassName: js.UndefOr[java.lang.String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ojDiagramLinkSettableProperties {
  @scala.inline
  def apply(
    categories: js.Array[java.lang.String],
    endNode: js.Any,
    startNode: js.Any,
    color: java.lang.String = null,
    endConnectorType: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded = null,
    label: java.lang.String = null,
    labelStyle: js.Object = null,
    selectable: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = null,
    shortDesc: java.lang.String = null,
    startConnectorType: atOracleOraclejetLib.atOracleOraclejetLibStrings.arrow | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowConcave | atOracleOraclejetLib.atOracleOraclejetLibStrings.arrowOpen | atOracleOraclejetLib.atOracleOraclejetLibStrings.circle | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangle | atOracleOraclejetLib.atOracleOraclejetLibStrings.rectangleRounded = null,
    svgClassName: java.lang.String = null,
    svgStyle: js.Object = null,
    width: scala.Int | scala.Double = null
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

