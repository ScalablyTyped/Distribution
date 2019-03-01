package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewCategoricalReductionMetadata extends js.Object {
  var categories: js.UndefOr[DataViewReductionAlgorithmMetadata] = js.undefined
  var metadata: js.UndefOr[DataViewReductionAlgorithmMetadata] = js.undefined
  var values: js.UndefOr[DataViewReductionAlgorithmMetadata] = js.undefined
}

object DataViewCategoricalReductionMetadata {
  @scala.inline
  def apply(
    categories: DataViewReductionAlgorithmMetadata = null,
    metadata: DataViewReductionAlgorithmMetadata = null,
    values: DataViewReductionAlgorithmMetadata = null
  ): DataViewCategoricalReductionMetadata = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DataViewCategoricalReductionMetadata]
  }
}

