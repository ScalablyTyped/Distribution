package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.ol.renderEventTypeMod.EventType
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/Map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  @js.native
  trait MapRenderer
    extends typings.ol.disposableMod.default {
    /* protected */ def calculateMatrices2D(frameState: FrameState): Unit = js.native
    def dispatchRenderEvent(`type`: EventType, frameState: FrameState): Unit = js.native
    def forEachFeatureAtCoordinate[S, T, U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      checkWrapped: Boolean,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ FeatureLike, 
          /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          T
        ],
      thisArg: S,
      layerFilter: js.ThisFunction1[
          /* this */ U, 
          /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          Boolean
        ],
      thisArg2: U
    ): T = js.native
    def forEachLayerAtPixel[S, T, U](
      pixel: Pixel,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          /* p1 */ Uint8ClampedArray | Uint8Array, 
          T
        ],
      layerFilter: js.ThisFunction1[
          /* this */ U, 
          /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          Boolean
        ]
    ): T = js.native
    def getMap(): typings.ol.pluggableMapMod.default = js.native
    def hasFeatureAtCoordinate[U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      checkWrapped: Boolean,
      layerFilter: js.ThisFunction1[
          /* this */ U, 
          /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          Boolean
        ],
      thisArg: U
    ): Boolean = js.native
    def renderFrame(frameState: FrameState): Unit = js.native
    /* protected */ def scheduleExpireIconCache(frameState: FrameState): Unit = js.native
  }
  
  @js.native
  abstract class default protected () extends MapRenderer {
    def this(map: typings.ol.pluggableMapMod.default) = this()
  }
  
}

