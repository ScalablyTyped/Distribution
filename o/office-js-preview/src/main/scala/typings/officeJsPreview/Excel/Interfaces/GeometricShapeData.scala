package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `geometricShape.toJSON()`. */
trait GeometricShapeData extends js.Object {
  /**
    *
    * Returns the shape identifier.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.undefined
}

object GeometricShapeData {
  @scala.inline
  def apply(id: String = null): GeometricShapeData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometricShapeData]
  }
}

