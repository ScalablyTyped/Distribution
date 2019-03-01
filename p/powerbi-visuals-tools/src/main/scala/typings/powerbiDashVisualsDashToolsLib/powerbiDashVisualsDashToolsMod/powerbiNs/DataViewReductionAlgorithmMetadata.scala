package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewReductionAlgorithmMetadata extends js.Object {
  var binnedLineSample: js.UndefOr[js.Object] = js.undefined
}

object DataViewReductionAlgorithmMetadata {
  @scala.inline
  def apply(binnedLineSample: js.Object = null): DataViewReductionAlgorithmMetadata = {
    val __obj = js.Dynamic.literal()
    if (binnedLineSample != null) __obj.updateDynamic("binnedLineSample")(binnedLineSample)
    __obj.asInstanceOf[DataViewReductionAlgorithmMetadata]
  }
}

