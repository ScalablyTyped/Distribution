package typings.ol

import typings.ol.featureloaderMod.FeatureLoader
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.olTileMod.LoadFunction
import typings.ol.olTileMod.Options
import typings.ol.tileStateMod.TileState
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/VectorTile", JSImport.Namespace)
@js.native
object olVectorTileMod extends js.Object {
  @js.native
  trait VectorTile
    extends typings.ol.olTileMod.default {
    def getFeatures(): js.Array[FeatureLike] = js.native
    def getFormat(): typings.ol.featureMod.default = js.native
    def onError(): Unit = js.native
    def onLoad(
      features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
      dataProjection: typings.ol.projectionMod.default
    ): Unit = js.native
    def setFeatures(features: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]): Unit = js.native
    def setLoader(loader: FeatureLoader): Unit = js.native
  }
  
  @js.native
  class default protected () extends VectorTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typings.ol.featureMod.default,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typings.ol.featureMod.default,
      tileLoadFunction: LoadFunction,
      opt_options: Options
    ) = this()
  }
  
}

