package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.pixelMod.Pixel
import typings.ol.pluggableMapMod.FrameState
import typings.ol.renderEventTypeMod.EventType
import typings.ol.rendererVectorMod.FeatureCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("ol/renderer/Map", JSImport.Default)
  @js.native
  abstract class default protected () extends MapRenderer {
    def this(map: typings.ol.pluggableMapMod.default) = this()
  }
  
  trait HitMatch[T] extends StObject {
    
    def callback(
      p0: FeatureLike,
      p1: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default],
      p2: typings.ol.simpleGeometryMod.default
    ): T
    @JSName("callback")
    var callback_Original: FeatureCallback[T]
    
    var distanceSq: Double
    
    var feature: FeatureLike
    
    var geometry: typings.ol.simpleGeometryMod.default
    
    var layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]
  }
  object HitMatch {
    
    inline def apply[T](
      callback: (/* p0 */ FeatureLike, /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], /* p2 */ typings.ol.simpleGeometryMod.default) => T,
      distanceSq: Double,
      feature: FeatureLike,
      geometry: typings.ol.simpleGeometryMod.default,
      layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]
    ): HitMatch[T] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction3(callback), distanceSq = distanceSq.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[HitMatch[T]]
    }
    
    extension [Self <: HitMatch[?], T](x: Self & HitMatch[T]) {
      
      inline def setCallback(
        value: (/* p0 */ FeatureLike, /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], /* p2 */ typings.ol.simpleGeometryMod.default) => T
      ): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setDistanceSq(value: Double): Self = StObject.set(x, "distanceSq", value.asInstanceOf[js.Any])
      
      inline def setFeature(value: FeatureLike): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: typings.ol.simpleGeometryMod.default): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
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
      callback: FeatureCallback[T],
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
          /* p1 */ js.typedarray.Uint8ClampedArray | js.typedarray.Uint8Array, 
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
