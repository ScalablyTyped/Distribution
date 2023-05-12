package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.featureMod.FeatureLike
import typings.ol.mapMod.FrameState
import typings.ol.rendererVectorMod.FeatureCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMapMod {
  
  /**
    * @typedef HitMatch
    * @property {import("../Feature.js").FeatureLike} feature Feature.
    * @property {import("../layer/Layer.js").default} layer Layer.
    * @property {import("../geom/SimpleGeometry.js").default} geometry Geometry.
    * @property {number} distanceSq Squared distance.
    * @property {import("./vector.js").FeatureCallback<T>} callback Callback.
    * @template T
    */
  /**
    * @abstract
    */
  @JSImport("ol/renderer/Map", JSImport.Default)
  @js.native
  open class default protected () extends MapRenderer {
    /**
      * @param {import("../Map.js").default} map Map.
      */
    def this(map: default) = this()
  }
  
  trait HitMatch[T] extends StObject {
    
    /**
      * Callback.
      */
    def callback(
      arg0: FeatureLike,
      arg1: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any],
      arg2: typings.ol.geomSimpleGeometryMod.default
    ): T
    /**
      * Callback.
      */
    @JSName("callback")
    var callback_Original: FeatureCallback[T]
    
    /**
      * Squared distance.
      */
    var distanceSq: Double
    
    /**
      * Feature.
      */
    var feature: FeatureLike
    
    /**
      * Geometry.
      */
    var geometry: typings.ol.geomSimpleGeometryMod.default
    
    /**
      * Layer.
      */
    var layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]
  }
  object HitMatch {
    
    inline def apply[T](
      callback: (/* arg0 */ FeatureLike, /* arg1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], /* arg2 */ typings.ol.geomSimpleGeometryMod.default) => T,
      distanceSq: Double,
      feature: FeatureLike,
      geometry: typings.ol.geomSimpleGeometryMod.default,
      layer: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]
    ): HitMatch[T] = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction3(callback), distanceSq = distanceSq.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[HitMatch[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HitMatch[?], T] (val x: Self & HitMatch[T]) extends AnyVal {
      
      inline def setCallback(
        value: (/* arg0 */ FeatureLike, /* arg1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], /* arg2 */ typings.ol.geomSimpleGeometryMod.default) => T
      ): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setDistanceSq(value: Double): Self = StObject.set(x, "distanceSq", value.asInstanceOf[js.Any])
      
      inline def setFeature(value: FeatureLike): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: typings.ol.geomSimpleGeometryMod.default): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setLayer(
        value: typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any]
      ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @typedef HitMatch
    * @property {import("../Feature.js").FeatureLike} feature Feature.
    * @property {import("../layer/Layer.js").default} layer Layer.
    * @property {import("../geom/SimpleGeometry.js").default} geometry Geometry.
    * @property {number} distanceSq Squared distance.
    * @property {import("./vector.js").FeatureCallback<T>} callback Callback.
    * @template T
    */
  /**
    * @abstract
    */
  @js.native
  trait MapRenderer
    extends typings.ol.disposableMod.default {
    
    /**
      * @param {import("../Map.js").FrameState} frameState FrameState.
      * @protected
      */
    /* protected */ def calculateMatrices2D(frameState: FrameState): Unit = js.native
    
    /**
      * @abstract
      * @param {import("../render/EventType.js").default} type Event type.
      * @param {import("../Map.js").FrameState} frameState Frame state.
      */
    def dispatchRenderEvent(`type`: Any, frameState: FrameState): Unit = js.native
    
    /**
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @param {import("../Map.js").FrameState} frameState FrameState.
      * @param {number} hitTolerance Hit tolerance in pixels.
      * @param {boolean} checkWrapped Check for wrapped geometries.
      * @param {import("./vector.js").FeatureCallback<T>} callback Feature callback.
      * @param {S} thisArg Value to use as `this` when executing `callback`.
      * @param {function(this: U, import("../layer/Layer.js").default): boolean} layerFilter Layer filter
      *     function, only layers which are visible and for which this function
      *     returns `true` will be tested for features.  By default, all visible
      *     layers will be tested.
      * @param {U} thisArg2 Value to use as `this` when executing `layerFilter`.
      * @return {T|undefined} Callback result.
      * @template S,T,U
      */
    def forEachFeatureAtCoordinate[S, T, U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      checkWrapped: Boolean,
      callback: FeatureCallback[T],
      thisArg: S,
      layerFilter: js.ThisFunction1[
          /* this */ U, 
          /* arg1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], 
          Boolean
        ],
      thisArg2: U
    ): js.UndefOr[T] = js.native
    
    /**
      * @return {import("../Map.js").default} Map.
      */
    def getMap(): default = js.native
    
    /**
      * @param {import("../coordinate.js").Coordinate} coordinate Coordinate.
      * @param {import("../Map.js").FrameState} frameState FrameState.
      * @param {number} hitTolerance Hit tolerance in pixels.
      * @param {boolean} checkWrapped Check for wrapped geometries.
      * @param {function(this: U, import("../layer/Layer.js").default): boolean} layerFilter Layer filter
      *     function, only layers which are visible and for which this function
      *     returns `true` will be tested for features.  By default, all visible
      *     layers will be tested.
      * @param {U} thisArg Value to use as `this` when executing `layerFilter`.
      * @return {boolean} Is there a feature at the given coordinate?
      * @template U
      */
    def hasFeatureAtCoordinate[U_1](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      checkWrapped: Boolean,
      layerFilter: js.ThisFunction1[
          /* this */ U_1, 
          /* arg1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default, /* ol.ol/layer/Layer.default<any> */ Any], 
          Boolean
        ],
      thisArg: U_1
    ): Boolean = js.native
    
    /**
      * @private
      * @type {import("../Map.js").default}
      */
    /* private */ var map_ : Any = js.native
    
    /**
      * Render.
      * @abstract
      * @param {?import("../Map.js").FrameState} frameState Frame state.
      */
    def renderFrame(): Unit = js.native
    def renderFrame(frameState: FrameState): Unit = js.native
    
    /**
      * @param {import("../Map.js").FrameState} frameState Frame state.
      * @protected
      */
    /* protected */ def scheduleExpireIconCache(frameState: FrameState): Unit = js.native
  }
}
