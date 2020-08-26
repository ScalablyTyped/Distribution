package typings.ol.pointsLayerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureCacheItem extends js.Object {
  var feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
  var geometry: typings.ol.geometryMod.default = js.native
  var properties: StringDictionary[js.Any] = js.native
}

object FeatureCacheItem {
  @scala.inline
  def apply(
    feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
    geometry: typings.ol.geometryMod.default,
    properties: StringDictionary[js.Any]
  ): FeatureCacheItem = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureCacheItem]
  }
  @scala.inline
  implicit class FeatureCacheItemOps[Self <: FeatureCacheItem] (val x: Self) extends AnyVal {
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
    def setFeature(value: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): Self = this.set("feature", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometry(value: typings.ol.geometryMod.default): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: StringDictionary[js.Any]): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

