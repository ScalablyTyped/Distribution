package typings.nivoGeo.anon

import typings.nivoGeo.mod.ChoroplethBoundFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureChoroplethBoundFeature extends js.Object {
  var feature: ChoroplethBoundFeature = js.native
}

object FeatureChoroplethBoundFeature {
  @scala.inline
  def apply(feature: ChoroplethBoundFeature): FeatureChoroplethBoundFeature = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureChoroplethBoundFeature]
  }
  @scala.inline
  implicit class FeatureChoroplethBoundFeatureOps[Self <: FeatureChoroplethBoundFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeature(value: ChoroplethBoundFeature): Self = this.set("feature", value.asInstanceOf[js.Any])
  }
  
}

