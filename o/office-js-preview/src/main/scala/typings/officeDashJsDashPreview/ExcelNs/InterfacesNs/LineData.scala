package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import typings.officeDashJsDashPreview.ExcelNs.ArrowheadLength
import typings.officeDashJsDashPreview.ExcelNs.ArrowheadStyle
import typings.officeDashJsDashPreview.ExcelNs.ArrowheadWidth
import typings.officeDashJsDashPreview.ExcelNs.ConnectorType
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Curve
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Diamond
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Elbow
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Long
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Medium
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Narrow
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Open
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Oval
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Short
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Stealth
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Straight
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Triangle
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "line.toJSON()". */
trait LineData extends js.Object {
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
  /**
    *
    * Represents the connection site to which the beginning of a connector is connected. Read-only. Returns null when the beginning of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedSite: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[ConnectorType | Straight | Elbow | Curve] = js.undefined
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
  /**
    *
    * Represents the connection site to which the end of a connector is connected. Read-only. Returns null when the end of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedSite: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies whether or not the beginning of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isBeginConnected: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the end of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEndConnected: js.UndefOr[Boolean] = js.undefined
}

object LineData {
  @scala.inline
  def apply(
    beginArrowheadLength: ArrowheadLength | Short | Medium | Long = null,
    beginArrowheadStyle: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open = null,
    beginArrowheadWidth: ArrowheadWidth | Narrow | Medium | Wide = null,
    beginConnectedSite: Int | Double = null,
    connectorType: ConnectorType | Straight | Elbow | Curve = null,
    endArrowheadLength: ArrowheadLength | Short | Medium | Long = null,
    endArrowheadStyle: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open = null,
    endArrowheadWidth: ArrowheadWidth | Narrow | Medium | Wide = null,
    endConnectedSite: Int | Double = null,
    id: String = null,
    isBeginConnected: js.UndefOr[Boolean] = js.undefined,
    isEndConnected: js.UndefOr[Boolean] = js.undefined
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

