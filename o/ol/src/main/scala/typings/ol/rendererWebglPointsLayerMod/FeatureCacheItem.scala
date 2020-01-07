package typings.ol.rendererWebglPointsLayerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureCacheItem extends js.Object {
  var feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]
  var geometry: typings.ol.geomGeometryMod.default
  var properties: StringDictionary[js.Any]
}

object FeatureCacheItem {
  @scala.inline
  def apply(
    feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
    geometry: typings.ol.geomGeometryMod.default,
    properties: StringDictionary[js.Any]
  ): FeatureCacheItem = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureCacheItem]
  }
}

