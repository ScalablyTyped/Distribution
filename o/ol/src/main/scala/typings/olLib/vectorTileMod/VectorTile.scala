package typings
package olLib.vectorTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTile
  extends olLib.tileMod.default {
  def getExtent(): olLib.extentMod.Extent = js.native
  def getFeatures(): js.Array[olLib.featureMod.FeatureLike] = js.native
  def getFormat(): olLib.formatFeatureMod.default = js.native
  def getProjection(): olLib.projProjectionMod.default = js.native
  def getReplayGroup(layer: olLib.layerLayerMod.default, key: java.lang.String): olLib.renderReplayGroupMod.default = js.native
  def onError(): scala.Unit = js.native
  def onLoad(
    features: js.Array[olLib.featureMod.default],
    dataProjection: olLib.projProjectionMod.default,
    extent: olLib.extentMod.Extent
  ): scala.Unit = js.native
  def setExtent(extent: olLib.extentMod.Extent): scala.Unit = js.native
  def setFeatures(features: js.Array[olLib.featureMod.default]): scala.Unit = js.native
  def setLoader(loader: olLib.featureloaderMod.FeatureLoader): scala.Unit = js.native
  def setProjection(projection: olLib.projProjectionMod.default): scala.Unit = js.native
  def setReplayGroup(
    layer: olLib.layerLayerMod.default,
    key: java.lang.String,
    replayGroup: olLib.renderReplayGroupMod.default
  ): scala.Unit = js.native
}

