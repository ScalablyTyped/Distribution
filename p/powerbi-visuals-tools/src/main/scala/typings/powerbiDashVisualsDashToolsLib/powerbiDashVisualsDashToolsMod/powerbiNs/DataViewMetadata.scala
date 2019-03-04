package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewMetadata extends js.Object {
  var columns: js.Array[DataViewMetadataColumn]
  /** Describes the data reduction applied to this data set when limits are exceeded. */
  var dataReduction: js.UndefOr[DataViewReductionMetadata] = js.undefined
  /** The metadata repetition objects. */
  var objects: js.UndefOr[DataViewObjects] = js.undefined
  /** When defined, describes whether the DataView contains just a segment of the complete data set. */
  var segment: js.UndefOr[js.Object] = js.undefined
}

object DataViewMetadata {
  @scala.inline
  def apply(
    columns: js.Array[DataViewMetadataColumn],
    dataReduction: DataViewReductionMetadata = null,
    objects: DataViewObjects = null,
    segment: js.Object = null
  ): DataViewMetadata = {
    val __obj = js.Dynamic.literal(columns = columns)
    if (dataReduction != null) __obj.updateDynamic("dataReduction")(dataReduction)
    if (objects != null) __obj.updateDynamic("objects")(objects)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    __obj.asInstanceOf[DataViewMetadata]
  }
}

