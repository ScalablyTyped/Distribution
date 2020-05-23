package typings.nivoGeo.anon

import typings.nivoGeo.mod.ChoroplethBoundFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureChoroplethBoundFeature extends js.Object {
  var feature: ChoroplethBoundFeature
}

object FeatureChoroplethBoundFeature {
  @scala.inline
  def apply(feature: ChoroplethBoundFeature): FeatureChoroplethBoundFeature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureChoroplethBoundFeature]
  }
}

