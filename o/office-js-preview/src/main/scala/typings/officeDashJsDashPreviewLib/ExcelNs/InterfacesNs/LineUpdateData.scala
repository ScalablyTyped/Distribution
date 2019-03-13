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
}

object LineUpdateData {
  @scala.inline
  def apply(
    beginArrowheadLength: officeDashJsDashPreviewLib.ExcelNs.ArrowheadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long = null,
    beginArrowheadStyle: officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open = null,
    beginArrowheadWidth: officeDashJsDashPreviewLib.ExcelNs.ArrowheadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide = null,
    connectorType: officeDashJsDashPreviewLib.ExcelNs.ConnectorType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Straight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Elbow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Curve = null,
    endArrowheadLength: officeDashJsDashPreviewLib.ExcelNs.ArrowheadLength | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Short | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Long = null,
    endArrowheadStyle: officeDashJsDashPreviewLib.ExcelNs.ArrowheadStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Triangle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Stealth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Diamond | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Oval | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Open = null,
    endArrowheadWidth: officeDashJsDashPreviewLib.ExcelNs.ArrowheadWidth | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Narrow | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wide = null
  ): LineUpdateData = {
    val __obj = js.Dynamic.literal()
    if (beginArrowheadLength != null) __obj.updateDynamic("beginArrowheadLength")(beginArrowheadLength.asInstanceOf[js.Any])
    if (beginArrowheadStyle != null) __obj.updateDynamic("beginArrowheadStyle")(beginArrowheadStyle.asInstanceOf[js.Any])
    if (beginArrowheadWidth != null) __obj.updateDynamic("beginArrowheadWidth")(beginArrowheadWidth.asInstanceOf[js.Any])
    if (connectorType != null) __obj.updateDynamic("connectorType")(connectorType.asInstanceOf[js.Any])
    if (endArrowheadLength != null) __obj.updateDynamic("endArrowheadLength")(endArrowheadLength.asInstanceOf[js.Any])
    if (endArrowheadStyle != null) __obj.updateDynamic("endArrowheadStyle")(endArrowheadStyle.asInstanceOf[js.Any])
    if (endArrowheadWidth != null) __obj.updateDynamic("endArrowheadWidth")(endArrowheadWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineUpdateData]
  }
}

