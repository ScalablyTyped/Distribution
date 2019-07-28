package typings.ol.formatWFSMod

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
    val __obj = js.Dynamic.literal(bounds = bounds, numberOfFeatures = numberOfFeatures)
  
    __obj.asInstanceOf[FeatureCollectionMetadata]
  }
}

