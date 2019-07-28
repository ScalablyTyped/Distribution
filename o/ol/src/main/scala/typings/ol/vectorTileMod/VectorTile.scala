package typings.ol.vectorTileMod

import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.featureloaderMod.FeatureLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTile
  extends typings.ol.tileMod.default {
  def getExtent(): Extent = js.native
  def getFeatures(): js.Array[FeatureLike] = js.native
  def getFormat(): typings.ol.formatFeatureMod.default = js.native
  def getProjection(): typings.ol.projProjectionMod.default = js.native
  def getReplayGroup(layer: typings.ol.layerLayerMod.default, key: String): typings.ol.renderReplayGroupMod.default = js.native
  def onError(): Unit = js.native
  def onLoad(
    features: js.Array[typings.ol.featureMod.default],
    dataProjection: typings.ol.projProjectionMod.default,
    extent: Extent
  ): Unit = js.native
  def setExtent(extent: Extent): Unit = js.native
  def setFeatures(features: js.Array[typings.ol.featureMod.default]): Unit = js.native
  def setLoader(loader: FeatureLoader): Unit = js.native
  def setProjection(projection: typings.ol.projProjectionMod.default): Unit = js.native
  def setReplayGroup(
    layer: typings.ol.layerLayerMod.default,
    key: String,
    replayGroup: typings.ol.renderReplayGroupMod.default
  ): Unit = js.native
}

