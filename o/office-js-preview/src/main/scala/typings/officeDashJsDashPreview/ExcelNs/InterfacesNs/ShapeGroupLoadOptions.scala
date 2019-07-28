package typings.officeDashJsDashPreview.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a shape group inside a worksheet. To get the corresponding Shape object, use `ShapeGroup.shape`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ShapeGroupLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the Shape object associated with the group.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shape: js.UndefOr[ShapeLoadOptions] = js.undefined
}

object ShapeGroupLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    shape: ShapeLoadOptions = null
  ): ShapeGroupLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[ShapeGroupLoadOptions]
  }
}

