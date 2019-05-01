package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shapeGroup.toJSON()". */
trait ShapeGroupData extends js.Object {
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Returns the collection of Shape objects. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.undefined
}

object ShapeGroupData {
  @scala.inline
  def apply(id: java.lang.String = null, shapes: js.Array[ShapeData] = null): ShapeGroupData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (shapes != null) __obj.updateDynamic("shapes")(shapes)
    __obj.asInstanceOf[ShapeGroupData]
  }
}

