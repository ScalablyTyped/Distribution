package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `geometricShape.toJSON()`. */
@js.native
trait GeometricShapeData extends js.Object {
  /**
    *
    * Returns the shape identifier.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.native
}

object GeometricShapeData {
  @scala.inline
  def apply(): GeometricShapeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeometricShapeData]
  }
  @scala.inline
  implicit class GeometricShapeDataOps[Self <: GeometricShapeData] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

