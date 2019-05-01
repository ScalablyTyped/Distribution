package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "geometricShape.toJSON()". */
trait GeometricShapeData extends js.Object {
  /**
    *
    * Returns the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object GeometricShapeData {
  @scala.inline
  def apply(id: java.lang.String = null): GeometricShapeData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GeometricShapeData]
  }
}

