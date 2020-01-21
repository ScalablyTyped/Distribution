package typings.ol.wfsMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureCollectionMetadata extends js.Object {
  var bounds: Extent
  var numberOfFeatures: Double
}

object FeatureCollectionMetadata {
  @scala.inline
  def apply(bounds: Extent, numberOfFeatures: Double): FeatureCollectionMetadata = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], numberOfFeatures = numberOfFeatures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureCollectionMetadata]
  }
}

