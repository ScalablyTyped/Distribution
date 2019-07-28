package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "worksheetCollection.toJSON()". */
trait WorksheetCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[WorksheetData]] = js.undefined
}

object WorksheetCollectionData {
  @scala.inline
  def apply(items: js.Array[WorksheetData] = null): WorksheetCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[WorksheetCollectionData]
  }
}

