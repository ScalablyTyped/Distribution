package typings.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureloader {
  
  /**
    * Create an XHR feature loader for a `url` and `format`. The feature loader
    * loads features (with XHR), parses the features, and adds them to the
    * vector tile.
    * @param url Feature URL service.
    * @param format Feature format.
    * @return The feature loader.
    * @api
    */
  @JSImport("openlayers", "featureloader.tile")
  @js.native
  def tile(url: String, format: typings.openlayers.mod.format.Feature): FeatureLoader_ = js.native
  @JSImport("openlayers", "featureloader.tile")
  @js.native
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
  @JSImport("openlayers", "featureloader.xhr")
  @js.native
  def xhr(url: String, format: typings.openlayers.mod.format.Feature): FeatureLoader_ = js.native
  @JSImport("openlayers", "featureloader.xhr")
  @js.native
  def xhr(url: FeatureUrlFunction, format: typings.openlayers.mod.format.Feature): FeatureLoader_ = js.native
}
