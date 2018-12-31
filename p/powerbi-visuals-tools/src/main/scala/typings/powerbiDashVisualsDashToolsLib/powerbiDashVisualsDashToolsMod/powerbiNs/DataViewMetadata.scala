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

