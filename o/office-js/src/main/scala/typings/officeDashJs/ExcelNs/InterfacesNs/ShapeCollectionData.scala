package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "shapeCollection.toJSON()". */
trait ShapeCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[ShapeData]] = js.undefined
}

object ShapeCollectionData {
  @scala.inline
  def apply(items: js.Array[ShapeData] = null): ShapeCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ShapeCollectionData]
  }
}

