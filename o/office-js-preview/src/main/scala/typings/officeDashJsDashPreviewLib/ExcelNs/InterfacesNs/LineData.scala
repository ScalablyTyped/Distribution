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
  var beginArrowheadLength: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowheadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long
  ] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var beginArrowheadStyle: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open
  ] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var beginArrowheadWidth: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowheadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide
  ] = js.undefined
  /**
    *
    * Represents the connection site to which the beginning of a connector is connected. Read-only. Returns null when the beginning of the line is not attached to any shape.
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
  var endArrowheadLength: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowheadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long
  ] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endArrowheadStyle: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open
  ] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endArrowheadWidth: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ArrowheadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide
  ] = js.undefined
  /**
    *
    * Represents the connection site to which the end of a connector is connected. Read-only. Returns null when the end of the line is not attached to any shape.
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
    * Specifies whether or not the beginning of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isBeginConnected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the end of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isEndConnected: js.UndefOr[scala.Boolean] = js.undefined
}

object LineData {
  @scala.inline
  def apply(
    beginArrowheadLength: officeDashJsDashPreviewLib.ExcelNs.ArrowheadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long = null,
    beginArrowheadStyle: officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open = null,
    beginArrowheadWidth: officeDashJsDashPreviewLib.ExcelNs.ArrowheadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide = null,
    beginConnectedSite: scala.Int | scala.Double = null,
    connectorType: officeDashJsDashPreviewLib.ExcelNs.ConnectorType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Straight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Elbow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Curve = null,
    endArrowheadLength: officeDashJsDashPreviewLib.ExcelNs.ArrowheadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long = null,
    endArrowheadStyle: officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open = null,
    endArrowheadWidth: officeDashJsDashPreviewLib.ExcelNs.ArrowheadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide = null,
    endConnectedSite: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    isBeginConnected: js.UndefOr[scala.Boolean] = js.undefined,
    isEndConnected: js.UndefOr[scala.Boolean] = js.undefined
  ): LineData = {
    val __obj = js.Dynamic.literal()
    if (beginArrowheadLength != null) __obj.updateDynamic("beginArrowheadLength")(beginArrowheadLength.asInstanceOf[js.Any])
    if (beginArrowheadStyle != null) __obj.updateDynamic("beginArrowheadStyle")(beginArrowheadStyle.asInstanceOf[js.Any])
    if (beginArrowheadWidth != null) __obj.updateDynamic("beginArrowheadWidth")(beginArrowheadWidth.asInstanceOf[js.Any])
    if (beginConnectedSite != null) __obj.updateDynamic("beginConnectedSite")(beginConnectedSite.asInstanceOf[js.Any])
    if (connectorType != null) __obj.updateDynamic("connectorType")(connectorType.asInstanceOf[js.Any])
    if (endArrowheadLength != null) __obj.updateDynamic("endArrowheadLength")(endArrowheadLength.asInstanceOf[js.Any])
    if (endArrowheadStyle != null) __obj.updateDynamic("endArrowheadStyle")(endArrowheadStyle.asInstanceOf[js.Any])
    if (endArrowheadWidth != null) __obj.updateDynamic("endArrowheadWidth")(endArrowheadWidth.asInstanceOf[js.Any])
    if (endConnectedSite != null) __obj.updateDynamic("endConnectedSite")(endConnectedSite.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isBeginConnected)) __obj.updateDynamic("isBeginConnected")(isBeginConnected)
    if (!js.isUndefined(isEndConnected)) __obj.updateDynamic("isEndConnected")(isEndConnected)
    __obj.asInstanceOf[LineData]
  }
}

