package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "line.toJSON()". */
trait LineData extends js.Object {
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var beginArrowHeadLength: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowHeadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long
  ] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var beginArrowHeadStyle: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open
  ] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var beginArrowHeadWidth: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowHeadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide
  ] = js.undefined
  /**
    *
    * Represents an integer that specifies the connection site that the beginning of a connector is connected to. Read-only. Returns null when the beginning of the line is not attached to any shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var beginConnectedSite: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var connectorType: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ConnectorType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Straight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Elbow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Curve
  ] = js.undefined
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endArrowHeadLength: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowHeadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long
  ] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endArrowHeadStyle: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open
  ] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endArrowHeadWidth: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowHeadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide
  ] = js.undefined
  /**
    *
    * Represents an integer that specifies the connection site that the end of a connector is connected to. Read-only. Returns null when the end of the line is not attached to any shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endConnectedSite: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents whether the beginning of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isBeginConnected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents whether the end of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isEndConnected: js.UndefOr[scala.Boolean] = js.undefined
}

object LineData {
  @scala.inline
  def apply(
    beginArrowHeadLength: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long = null,
    beginArrowHeadStyle: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open = null,
    beginArrowHeadWidth: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide = null,
    beginConnectedSite: scala.Int | scala.Double = null,
    connectorType: officeDashJsDashPreviewLib.ExcelNs.ConnectorType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Straight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Elbow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Curve = null,
    endArrowHeadLength: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long = null,
    endArrowHeadStyle: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open = null,
    endArrowHeadWidth: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide = null,
    endConnectedSite: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    isBeginConnected: js.UndefOr[scala.Boolean] = js.undefined,
    isEndConnected: js.UndefOr[scala.Boolean] = js.undefined
  ): LineData = {
    val __obj = js.Dynamic.literal()
    if (beginArrowHeadLength != null) __obj.updateDynamic("beginArrowHeadLength")(beginArrowHeadLength.asInstanceOf[js.Any])
    if (beginArrowHeadStyle != null) __obj.updateDynamic("beginArrowHeadStyle")(beginArrowHeadStyle.asInstanceOf[js.Any])
    if (beginArrowHeadWidth != null) __obj.updateDynamic("beginArrowHeadWidth")(beginArrowHeadWidth.asInstanceOf[js.Any])
    if (beginConnectedSite != null) __obj.updateDynamic("beginConnectedSite")(beginConnectedSite.asInstanceOf[js.Any])
    if (connectorType != null) __obj.updateDynamic("connectorType")(connectorType.asInstanceOf[js.Any])
    if (endArrowHeadLength != null) __obj.updateDynamic("endArrowHeadLength")(endArrowHeadLength.asInstanceOf[js.Any])
    if (endArrowHeadStyle != null) __obj.updateDynamic("endArrowHeadStyle")(endArrowHeadStyle.asInstanceOf[js.Any])
    if (endArrowHeadWidth != null) __obj.updateDynamic("endArrowHeadWidth")(endArrowHeadWidth.asInstanceOf[js.Any])
    if (endConnectedSite != null) __obj.updateDynamic("endConnectedSite")(endConnectedSite.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isBeginConnected)) __obj.updateDynamic("isBeginConnected")(isBeginConnected)
    if (!js.isUndefined(isEndConnected)) __obj.updateDynamic("isEndConnected")(isEndConnected)
    __obj.asInstanceOf[LineData]
  }
}

