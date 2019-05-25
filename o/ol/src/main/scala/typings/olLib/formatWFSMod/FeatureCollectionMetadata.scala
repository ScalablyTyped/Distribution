package typings
package olLib.formatWFSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureCollectionMetadata extends js.Object {
  var bounds: olLib.extentMod.Extent
  var numberOfFeatures: scala.Double
}

object FeatureCollectionMetadata {
  @scala.inline
  def apply(bounds: olLib.extentMod.Extent, numberOfFeatures: scala.Double): FeatureCollectionMetadata = {
    val __obj = js.Dynamic.literal(bounds = bounds, numberOfFeatures = numberOfFeatures)
  
    __obj.asInstanceOf[FeatureCollectionMetadata]
  }
}

