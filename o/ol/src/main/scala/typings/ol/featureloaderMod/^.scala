package typings.ol.featureloaderMod

import typings.ol.formatFeatureMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/featureloader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def loadFeaturesXhr(url: String, format: default, success: js.Function0[Unit], failure: js.Function0[Unit]): FeatureLoader = js.native
  def loadFeaturesXhr(
    url: String,
    format: default,
    success: js.Function0[Unit],
    failure: js.ThisFunction0[/* this */ typings.ol.sourceVectorMod.default, Unit]
  ): FeatureLoader = js.native
  def loadFeaturesXhr(url: FeatureUrlFunction, format: default, success: js.Function0[Unit], failure: js.Function0[Unit]): FeatureLoader = js.native
  def loadFeaturesXhr(
    url: FeatureUrlFunction,
    format: default,
    success: js.Function0[Unit],
    failure: js.ThisFunction0[/* this */ typings.ol.sourceVectorMod.default, Unit]
  ): FeatureLoader = js.native
  def xhr(url: String, format: default): FeatureLoader = js.native
  def xhr(url: FeatureUrlFunction, format: default): FeatureLoader = js.native
}

