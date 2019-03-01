package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewCategorical extends js.Object {
  var categories: js.UndefOr[js.Array[DataViewCategoryColumn]] = js.undefined
  var values: js.UndefOr[DataViewValueColumns] = js.undefined
}

object DataViewCategorical {
  @scala.inline
  def apply(categories: js.Array[DataViewCategoryColumn] = null, values: DataViewValueColumns = null): DataViewCategorical = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DataViewCategorical]
  }
}

