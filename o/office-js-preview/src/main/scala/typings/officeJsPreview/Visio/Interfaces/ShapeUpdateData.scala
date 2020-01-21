package typings.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Shape object, for use in "shape.set({ ... })". */
trait ShapeUpdateData extends js.Object {
  /**
    *
    * Returns true, if shape is selected. User can set true to select the shape explicitly.
    *
    * [Api set:  1.1]
    */
  var select: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the view of the shape.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[ShapeViewUpdateData] = js.undefined
}

object ShapeUpdateData {
  @scala.inline
  def apply(select: js.UndefOr[Boolean] = js.undefined, view: ShapeViewUpdateData = null): ShapeUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeUpdateData]
  }
}

