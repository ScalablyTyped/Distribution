package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewReductionMetadata extends js.Object {
  var categorical: js.UndefOr[DataViewCategoricalReductionMetadata] = js.undefined
}

object DataViewReductionMetadata {
  @scala.inline
  def apply(categorical: DataViewCategoricalReductionMetadata = null): DataViewReductionMetadata = {
    val __obj = js.Dynamic.literal()
    if (categorical != null) __obj.updateDynamic("categorical")(categorical)
    __obj.asInstanceOf[DataViewReductionMetadata]
  }
}

