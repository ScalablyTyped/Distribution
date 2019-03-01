package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a Line object inside a worksheet.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait LineLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var beginArrowHeadLength: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var beginArrowHeadStyle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var beginArrowHeadWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the shape object that the beginning of the specified line is attached to.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var beginConnectedShape: js.UndefOr[ShapeLoadOptions] = js.undefined
  /**
    *
    * Represents an integer that specifies the connection site that the beginning of a connector is connected to. Read-only. Returns null when the beginning of the line is not attached to any shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var beginConnectedSite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var connectorType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endArrowHeadLength: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endArrowHeadStyle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endArrowHeadWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the shape object that the end of the specified line is attached to.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endConnectedShape: js.UndefOr[ShapeLoadOptions] = js.undefined
  /**
    *
    * Represents an integer that specifies the connection site that the end of a connector is connected to. Read-only. Returns null when the end of the line is not attached to any shape.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endConnectedSite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
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
  /**
    *
    * Returns the shape object for the line.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var shape: js.UndefOr[ShapeLoadOptions] = js.undefined
}

object LineLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    beginArrowHeadLength: js.UndefOr[scala.Boolean] = js.undefined,
    beginArrowHeadStyle: js.UndefOr[scala.Boolean] = js.undefined,
    beginArrowHeadWidth: js.UndefOr[scala.Boolean] = js.undefined,
    beginConnectedShape: ShapeLoadOptions = null,
    beginConnectedSite: js.UndefOr[scala.Boolean] = js.undefined,
    connectorType: js.UndefOr[scala.Boolean] = js.undefined,
    endArrowHeadLength: js.UndefOr[scala.Boolean] = js.undefined,
    endArrowHeadStyle: js.UndefOr[scala.Boolean] = js.undefined,
    endArrowHeadWidth: js.UndefOr[scala.Boolean] = js.undefined,
    endConnectedShape: ShapeLoadOptions = null,
    endConnectedSite: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    isBeginConnected: js.UndefOr[scala.Boolean] = js.undefined,
    isEndConnected: js.UndefOr[scala.Boolean] = js.undefined,
    shape: ShapeLoadOptions = null
  ): LineLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(beginArrowHeadLength)) __obj.updateDynamic("beginArrowHeadLength")(beginArrowHeadLength)
    if (!js.isUndefined(beginArrowHeadStyle)) __obj.updateDynamic("beginArrowHeadStyle")(beginArrowHeadStyle)
    if (!js.isUndefined(beginArrowHeadWidth)) __obj.updateDynamic("beginArrowHeadWidth")(beginArrowHeadWidth)
    if (beginConnectedShape != null) __obj.updateDynamic("beginConnectedShape")(beginConnectedShape)
    if (!js.isUndefined(beginConnectedSite)) __obj.updateDynamic("beginConnectedSite")(beginConnectedSite)
    if (!js.isUndefined(connectorType)) __obj.updateDynamic("connectorType")(connectorType)
    if (!js.isUndefined(endArrowHeadLength)) __obj.updateDynamic("endArrowHeadLength")(endArrowHeadLength)
    if (!js.isUndefined(endArrowHeadStyle)) __obj.updateDynamic("endArrowHeadStyle")(endArrowHeadStyle)
    if (!js.isUndefined(endArrowHeadWidth)) __obj.updateDynamic("endArrowHeadWidth")(endArrowHeadWidth)
    if (endConnectedShape != null) __obj.updateDynamic("endConnectedShape")(endConnectedShape)
    if (!js.isUndefined(endConnectedSite)) __obj.updateDynamic("endConnectedSite")(endConnectedSite)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isBeginConnected)) __obj.updateDynamic("isBeginConnected")(isBeginConnected)
    if (!js.isUndefined(isEndConnected)) __obj.updateDynamic("isEndConnected")(isEndConnected)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[LineLoadOptions]
  }
}

