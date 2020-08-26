package typings.officeJsPreview.Visio.Interfaces

import typings.officeJsPreview.Visio.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ShapeView object, for use in "shapeView.set({ ... })". */
@js.native
trait ShapeViewUpdateData extends js.Object {
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: js.UndefOr[Highlight] = js.native
}

object ShapeViewUpdateData {
  @scala.inline
  def apply(): ShapeViewUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeViewUpdateData]
  }
  @scala.inline
  implicit class ShapeViewUpdateDataOps[Self <: ShapeViewUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHighlight(value: Highlight): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
  }
  
}

