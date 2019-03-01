package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Line object, for use in "line.set({ ... })". */
trait LineUpdateData extends js.Object {
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
}

object LineUpdateData {
  @scala.inline
  def apply(
    beginArrowHeadLength: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long = null,
    beginArrowHeadStyle: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open = null,
    beginArrowHeadWidth: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide = null,
    connectorType: officeDashJsDashPreviewLib.ExcelNs.ConnectorType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Straight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Elbow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Curve = null,
    endArrowHeadLength: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long = null,
    endArrowHeadStyle: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open = null,
    endArrowHeadWidth: officeDashJsDashPreviewLib.ExcelNs.ArrowHeadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide = null
  ): LineUpdateData = {
    val __obj = js.Dynamic.literal()
    if (beginArrowHeadLength != null) __obj.updateDynamic("beginArrowHeadLength")(beginArrowHeadLength.asInstanceOf[js.Any])
    if (beginArrowHeadStyle != null) __obj.updateDynamic("beginArrowHeadStyle")(beginArrowHeadStyle.asInstanceOf[js.Any])
    if (beginArrowHeadWidth != null) __obj.updateDynamic("beginArrowHeadWidth")(beginArrowHeadWidth.asInstanceOf[js.Any])
    if (connectorType != null) __obj.updateDynamic("connectorType")(connectorType.asInstanceOf[js.Any])
    if (endArrowHeadLength != null) __obj.updateDynamic("endArrowHeadLength")(endArrowHeadLength.asInstanceOf[js.Any])
    if (endArrowHeadStyle != null) __obj.updateDynamic("endArrowHeadStyle")(endArrowHeadStyle.asInstanceOf[js.Any])
    if (endArrowHeadWidth != null) __obj.updateDynamic("endArrowHeadWidth")(endArrowHeadWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineUpdateData]
  }
}

