package typings
package olLib.featureloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/featureloader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def loadFeaturesXhr(
    url: java.lang.String,
    format: olLib.formatFeatureMod.default,
    success: js.Function0[scala.Unit],
    failure: js.Function0[scala.Unit]
  ): FeatureLoader = js.native
  def loadFeaturesXhr(
    url: java.lang.String,
    format: olLib.formatFeatureMod.default,
    success: js.Function0[scala.Unit],
    failure: js.ThisFunction0[/* this */ olLib.sourceVectorMod.default, scala.Unit]
  ): FeatureLoader = js.native
  def loadFeaturesXhr(
    url: FeatureUrlFunction,
    format: olLib.formatFeatureMod.default,
    success: js.Function0[scala.Unit],
    failure: js.Function0[scala.Unit]
  ): FeatureLoader = js.native
  def loadFeaturesXhr(
    url: FeatureUrlFunction,
    format: olLib.formatFeatureMod.default,
    success: js.Function0[scala.Unit],
    failure: js.ThisFunction0[/* this */ olLib.sourceVectorMod.default, scala.Unit]
  ): FeatureLoader = js.native
  def xhr(url: java.lang.String, format: olLib.formatFeatureMod.default): FeatureLoader = js.native
  def xhr(url: FeatureUrlFunction, format: olLib.formatFeatureMod.default): FeatureLoader = js.native
}

