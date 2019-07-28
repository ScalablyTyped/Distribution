package typings.ol.sourceBingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageryProvider extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var coverageAreas: js.Array[CoverageArea]
}

object ImageryProvider {
  @scala.inline
  def apply(coverageAreas: js.Array[CoverageArea], attribution: String = null): ImageryProvider = {
    val __obj = js.Dynamic.literal(coverageAreas = coverageAreas)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    __obj.asInstanceOf[ImageryProvider]
  }
}

