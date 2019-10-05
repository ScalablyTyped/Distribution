package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `bindingCollection.toJSON()`. */
trait BindingCollectionData extends js.Object {
  var items: js.UndefOr[js.Array[BindingData]] = js.undefined
}

object BindingCollectionData {
  @scala.inline
  def apply(items: js.Array[BindingData] = null): BindingCollectionData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[BindingCollectionData]
  }
}

