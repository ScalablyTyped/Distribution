package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewCategoricalColumn extends js.Object {
  /** The data repetition objects. */
  var objects: js.UndefOr[js.Array[DataViewObjects]] = js.undefined
  var source: DataViewMetadataColumn
}

object DataViewCategoricalColumn {
  @scala.inline
  def apply(source: DataViewMetadataColumn, objects: js.Array[DataViewObjects] = null): DataViewCategoricalColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    if (objects != null) __obj.updateDynamic("objects")(objects)
    __obj.asInstanceOf[DataViewCategoricalColumn]
  }
}

