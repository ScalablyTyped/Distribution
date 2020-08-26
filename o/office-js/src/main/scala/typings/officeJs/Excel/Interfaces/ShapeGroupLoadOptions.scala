package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a shape group inside a worksheet. To get the corresponding Shape object, use `ShapeGroup.shape`.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ShapeGroupLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the shape identifier.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the Shape object associated with the group.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shape: js.UndefOr[ShapeLoadOptions] = js.native
}

object ShapeGroupLoadOptions {
  @scala.inline
  def apply(): ShapeGroupLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeGroupLoadOptions]
  }
  @scala.inline
  implicit class ShapeGroupLoadOptionsOps[Self <: ShapeGroupLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setShape(value: ShapeLoadOptions): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
  
}

