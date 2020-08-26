package typings.ol.wfsMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureCollectionMetadata extends js.Object {
  var bounds: Extent = js.native
  var numberOfFeatures: Double = js.native
}

object FeatureCollectionMetadata {
  @scala.inline
  def apply(bounds: Extent, numberOfFeatures: Double): FeatureCollectionMetadata = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], numberOfFeatures = numberOfFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureCollectionMetadata]
  }
  @scala.inline
  implicit class FeatureCollectionMetadataOps[Self <: FeatureCollectionMetadata] (val x: Self) extends AnyVal {
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
    def setBounds(value: Extent): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfFeatures(value: Double): Self = this.set("numberOfFeatures", value.asInstanceOf[js.Any])
  }
  
}

