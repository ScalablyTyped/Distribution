package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Line object, for use in "line.set({ ... })". */
trait LineUpdateData extends js.Object {
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[
    officeDashJsLib.ExcelNs.ArrowheadLength | officeDashJsLib.officeDashJsLibStrings.Short | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Long
  ] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[
    officeDashJsLib.ExcelNs.ArrowheadStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.Stealth | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Oval | officeDashJsLib.officeDashJsLibStrings.Open
  ] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[
    officeDashJsLib.ExcelNs.ArrowheadWidth | officeDashJsLib.officeDashJsLibStrings.Narrow | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Wide
  ] = js.undefined
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[
    officeDashJsLib.ExcelNs.ConnectorType | officeDashJsLib.officeDashJsLibStrings.Straight | officeDashJsLib.officeDashJsLibStrings.Elbow | officeDashJsLib.officeDashJsLibStrings.Curve
  ] = js.undefined
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[
    officeDashJsLib.ExcelNs.ArrowheadLength | officeDashJsLib.officeDashJsLibStrings.Short | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Long
  ] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[
    officeDashJsLib.ExcelNs.ArrowheadStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.Stealth | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Oval | officeDashJsLib.officeDashJsLibStrings.Open
  ] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[
    officeDashJsLib.ExcelNs.ArrowheadWidth | officeDashJsLib.officeDashJsLibStrings.Narrow | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Wide
  ] = js.undefined
}

object LineUpdateData {
  @scala.inline
  def apply(
    beginArrowheadLength: officeDashJsLib.ExcelNs.ArrowheadLength | officeDashJsLib.officeDashJsLibStrings.Short | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Long = null,
    beginArrowheadStyle: officeDashJsLib.ExcelNs.ArrowheadStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.Stealth | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Oval | officeDashJsLib.officeDashJsLibStrings.Open = null,
    beginArrowheadWidth: officeDashJsLib.ExcelNs.ArrowheadWidth | officeDashJsLib.officeDashJsLibStrings.Narrow | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Wide = null,
    connectorType: officeDashJsLib.ExcelNs.ConnectorType | officeDashJsLib.officeDashJsLibStrings.Straight | officeDashJsLib.officeDashJsLibStrings.Elbow | officeDashJsLib.officeDashJsLibStrings.Curve = null,
    endArrowheadLength: officeDashJsLib.ExcelNs.ArrowheadLength | officeDashJsLib.officeDashJsLibStrings.Short | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Long = null,
    endArrowheadStyle: officeDashJsLib.ExcelNs.ArrowheadStyle | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Triangle | officeDashJsLib.officeDashJsLibStrings.Stealth | officeDashJsLib.officeDashJsLibStrings.Diamond | officeDashJsLib.officeDashJsLibStrings.Oval | officeDashJsLib.officeDashJsLibStrings.Open = null,
    endArrowheadWidth: officeDashJsLib.ExcelNs.ArrowheadWidth | officeDashJsLib.officeDashJsLibStrings.Narrow | officeDashJsLib.officeDashJsLibStrings.Medium | officeDashJsLib.officeDashJsLibStrings.Wide = null
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

