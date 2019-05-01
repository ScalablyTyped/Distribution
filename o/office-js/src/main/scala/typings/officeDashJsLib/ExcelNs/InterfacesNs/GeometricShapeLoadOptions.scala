package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a geometric shape inside a worksheet. A geometric shape can be a rectangle, block arrow, equation symbol, flowchart item, star, banner, callout, or any other basic shape in Excel.
  *
  * [Api set: ExcelApi 1.9]
  */
trait GeometricShapeLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the Shape object for the geometric shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shape: js.UndefOr[ShapeLoadOptions] = js.undefined
}

object GeometricShapeLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    shape: ShapeLoadOptions = null
  ): GeometricShapeLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[GeometricShapeLoadOptions]
  }
}

