package typings.ol

import typings.ol.featureMod.FeatureLike
import typings.ol.featureloaderMod.FeatureLoader
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Options
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/VectorTile", JSImport.Namespace)
@js.native
object vectorTileMod extends js.Object {
  @js.native
  trait VectorTile
    extends typings.ol.tileMod.default {
    def getFeatures(): js.Array[FeatureLike] = js.native
    def getFormat(): typings.ol.formatFeatureMod.default = js.native
    def onError(): Unit = js.native
    def onLoad(
      features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]],
      dataProjection: typings.ol.projProjectionMod.default
    ): Unit = js.native
    def setFeatures(features: js.Array[typings.ol.featureMod.default[typings.ol.geomGeometryMod.default]]): Unit = js.native
    def setLoader(loader: FeatureLoader): Unit = js.native
  }
  
  @js.native
  class default protected () extends VectorTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typings.ol.formatFeatureMod.default,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typings.ol.formatFeatureMod.default,
      tileLoadFunction: LoadFunction,
      opt_options: Options
    ) = this()
  }
  
}

