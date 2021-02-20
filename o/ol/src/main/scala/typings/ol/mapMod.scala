package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.ol.renderEventTypeMod.EventType
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("ol/renderer/Map", JSImport.Default)
  @js.native
  abstract class default protected () extends MapRenderer {
    def this(map: typings.ol.pluggableMapMod.default) = this()
  }
  
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
    ): js.UndefOr[T] = js.native
    
    def forEachLayerAtPixel[T](
      pixel: Pixel,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.Function2[
          /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          /* p1 */ Uint8ClampedArray | Uint8Array, 
          T
        ],
      layerFilter: js.Function1[
          /* p0 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
          Boolean
        ]
    ): js.UndefOr[T] = js.native
    
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
    
    /**
      * Render.
      */
    def renderFrame(frameState: FrameState): Unit = js.native
    
    /* protected */ def scheduleExpireIconCache(frameState: FrameState): Unit = js.native
  }
}
