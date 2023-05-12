package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.featureMod.FeatureLike
import typings.ol.renderCanvasMod.BuilderType
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasExecutorGroupMod {
  
  @JSImport("ol/render/canvas/ExecutorGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/render/canvas/ExecutorGroup", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ExecutorGroup {
    /**
      * @param {import("../../extent.js").Extent} maxExtent Max extent for clipping. When a
      * `maxExtent` was set on the Builder for this executor group, the same `maxExtent`
      * should be set here, unless the target context does not exceed that extent (which
      * can be the case when rendering to tiles).
      * @param {number} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      * @param {boolean} overlaps The executor group can have overlapping geometries.
      * @param {!Object<string, !Object<import("../canvas.js").BuilderType, import("../canvas.js").SerializableInstructions>>} allInstructions
      * The serializable instructions.
      * @param {number} [renderBuffer] Optional rendering buffer.
      */
    def this(
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      allInstructions: StringDictionary[Any]
    ) = this()
    def this(
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      allInstructions: StringDictionary[Any],
      renderBuffer: Double
    ) = this()
  }
  
  inline def getPixelIndexArray(radius: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPixelIndexArray")(radius.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @js.native
  trait ExecutorGroup extends StObject {
    
    /**
      * @param {CanvasRenderingContext2D} context Context.
      * @param {import("../../transform.js").Transform} transform Transform.
      */
    def clip(context: CanvasRenderingContext2D, transform: Transform): Unit = js.native
    
    /**
      * Create executors and populate them using the provided instructions.
      * @private
      * @param {!Object<string, !Object<import("../canvas.js").BuilderType, import("../canvas.js").SerializableInstructions>>} allInstructions The serializable instructions
      */
    /* private */ var createExecutors_ : Any = js.native
    
    /**
      * @param {CanvasRenderingContext2D} context Context.
      * @param {number} contextScale Scale of the context.
      * @param {import("../../transform.js").Transform} transform Transform.
      * @param {number} viewRotation View rotation.
      * @param {boolean} snapToPixel Snap point symbols and test to integer pixel.
      * @param {Array<import("../canvas.js").BuilderType>} [builderTypes] Ordered replay types to replay.
      *     Default is {@link module:ol/render/replay~ORDER}
      * @param {import("rbush").default} [declutterTree] Declutter tree.
      */
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      builderTypes: js.Array[BuilderType]
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      builderTypes: js.Array[BuilderType],
      declutterTree: Any
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      contextScale: Double,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      builderTypes: Unit,
      declutterTree: Any
    ): Unit = js.native
    
    /**
      * @private
      * @type {!Object<string, !Object<import("../canvas.js").BuilderType, import("./Executor").default>>}
      */
    /* private */ var executorsByZIndex_ : Any = js.native
    
    /**
      * @param {import("../../coordinate.js").Coordinate} coordinate Coordinate.
      * @param {number} resolution Resolution.
      * @param {number} rotation Rotation.
      * @param {number} hitTolerance Hit tolerance in pixels.
      * @param {function(import("../../Feature.js").FeatureLike, import("../../geom/SimpleGeometry.js").default, number): T} callback Feature callback.
      * @param {Array<import("../../Feature.js").FeatureLike>} declutteredFeatures Decluttered features.
      * @return {T|undefined} Callback result.
      * @template T
      */
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      resolution: Double,
      rotation: Double,
      hitTolerance: Double,
      callback: js.Function3[
          /* arg0 */ FeatureLike, 
          /* arg1 */ typings.ol.geomSimpleGeometryMod.default, 
          /* arg2 */ Double, 
          T
        ],
      declutteredFeatures: js.Array[FeatureLike]
    ): js.UndefOr[T] = js.native
    
    /**
      * @param {import("../../transform.js").Transform} transform Transform.
      * @return {Array<number>|null} Clip coordinates.
      */
    def getClipCoords(transform: Transform): js.Array[Double] | Null = js.native
    
    /**
      * @param {Array<import("../canvas.js").BuilderType>} executors Executors.
      * @return {boolean} Has executors of the provided types.
      */
    def hasExecutors(executors: js.Array[BuilderType]): Boolean = js.native
    
    /**
      * @private
      * @type {CanvasRenderingContext2D}
      */
    /* private */ var hitDetectionContext_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../transform.js").Transform}
      */
    /* private */ var hitDetectionTransform_ : Any = js.native
    
    /**
      * @return {boolean} Is empty.
      */
    def isEmpty(): Boolean = js.native
    
    /**
      * @private
      * @type {import("../../extent.js").Extent}
      */
    /* private */ var maxExtent_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var overlaps_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var pixelRatio_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var renderBuffer_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var resolution_ : Any = js.native
  }
}
