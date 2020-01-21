package typings.openlayers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "featureloader")
@js.native
object featureloader extends js.Object {
  /**
    * Create an XHR feature loader for a `url` and `format`. The feature loader
    * loads features (with XHR), parses the features, and adds them to the
    * vector tile.
    * @param url Feature URL service.
    * @param format Feature format.
    * @return The feature loader.
    * @api
    */
  def tile(url: String, format: typings.openlayers.mod.format.Feature): FeatureLoader_ = js.native
  def tile(url: FeatureUrlFunction, format: typings.openlayers.mod.format.Feature): FeatureLoader_ = js.native
  /**
    * Create an XHR feature loader for a `url` and `format`. The feature loader
    * loads features (with XHR), parses the features, and adds them to the
    * vector source.
    * @param url Feature URL service.
    * @param format Feature format.
    * @return The feature loader.
    * @api
    */
  def xhr(url: String, format: typings.openlayers.mod.format.Feature): FeatureLoader_ = js.native
  def xhr(url: FeatureUrlFunction, format: typings.openlayers.mod.format.Feature): FeatureLoader_ = js.native
}

