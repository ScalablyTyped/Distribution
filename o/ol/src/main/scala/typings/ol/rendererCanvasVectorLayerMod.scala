package typings.ol

import typings.ol.mapMod.FrameState
import typings.ol.projMod.TransformFunction
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasVectorLayerMod {
  
  /**
    * @classdesc
    * Canvas renderer for vector layers.
    * @api
    */
  @JSImport("ol/renderer/canvas/VectorLayer", JSImport.Default)
  @js.native
  open class default protected () extends CanvasVectorLayerRenderer {
    /**
      * @param {import("../../layer/BaseVector.js").default} vectorLayer Vector layer.
      */
    def this(vectorLayer: typings.ol.layerBaseVectorMod.default[Any, Any]) = this()
  }
  
  /**
    * @classdesc
    * Canvas renderer for vector layers.
    * @api
    */
  @js.native
  trait CanvasVectorLayerRenderer
    extends typings.ol.rendererCanvasLayerMod.default[Any] {
    
    /**
      * @type {boolean}
      */
    var animatingOrInteracting_ : Boolean = js.native
    
    /** @private */
    /* private */ var boundHandleStyleImageChange_ : Any = js.native
    
    /**
      * Clipping to be performed by `renderFrame()`
      * @type {boolean}
      */
    var clipping: Boolean = js.native
    
    /**
      * @private
      * @type {CanvasRenderingContext2D}
      */
    /* private */ var compositionContext_ : Any = js.native
    
    /**
      * Handle changes in image style state.
      * @param {import("../../events/Event.js").default} event Image style change event.
      * @private
      */
    /* private */ var handleStyleImageChange_ : Any = js.native
    
    /**
      * @type {ImageData|null}
      */
    var hitDetectionImageData_ : ImageData | Null = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var opacity_ : Any = js.native
    
    def releaseCompositionContext_(): Unit = js.native
    
    /**
      * Render declutter items for this layer
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      */
    def renderDeclutter(frameState: FrameState): Unit = js.native
    
    def renderFeature(
      feature: typings.ol.renderFeatureMod.default,
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.renderFeatureMod.default,
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default,
      transform: Unit,
      declutterBuilderGroup: typings.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.renderFeatureMod.default,
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default,
      transform: TransformFunction
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.renderFeatureMod.default,
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default,
      transform: TransformFunction,
      declutterBuilderGroup: typings.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    /**
      * @param {import("../../Feature.js").default} feature Feature.
      * @param {number} squaredTolerance Squared render tolerance.
      * @param {import("../../style/Style.js").default|Array<import("../../style/Style.js").default>} styles The style or array of styles.
      * @param {import("../../render/canvas/BuilderGroup.js").default} builderGroup Builder group.
      * @param {import("../../proj.js").TransformFunction} [transform] Transform from user to view projection.
      * @param {import("../../render/canvas/BuilderGroup.js").default} [declutterBuilderGroup] Builder for decluttering.
      * @return {boolean} `true` if an image is loading.
      */
    def renderFeature(
      feature: typings.ol.renderFeatureMod.default,
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.renderFeatureMod.default,
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default,
      transform: Unit,
      declutterBuilderGroup: typings.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.renderFeatureMod.default,
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default,
      transform: TransformFunction
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.renderFeatureMod.default,
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default,
      transform: TransformFunction,
      declutterBuilderGroup: typings.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    
    /**
      * @param {ExecutorGroup} executorGroup Executor group.
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      * @param {import("rbush").default} [declutterTree] Declutter tree.
      */
    def renderWorlds(executorGroup: typings.ol.renderCanvasExecutorGroupMod.default, frameState: FrameState): Unit = js.native
    def renderWorlds(
      executorGroup: typings.ol.renderCanvasExecutorGroupMod.default,
      frameState: FrameState,
      declutterTree: Any
    ): Unit = js.native
    
    /**
      * @private
      * @type {import("../../coordinate").Coordinate}
      */
    /* private */ var renderedCenter_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../extent.js").Extent}
      */
    /* private */ var renderedExtent_ : Any = js.native
    
    /**
      * @type {Array<import("../../Feature.js").default>}
      */
    var renderedFeatures_ : js.Array[typings.ol.renderFeatureMod.default] = js.native
    
    /**
      * @private
      * @type {import("../../proj/Projection").default}
      */
    /* private */ var renderedProjection_ : Any = js.native
    
    /**
      * @private
      * @type {function(import("../../Feature.js").default, import("../../Feature.js").default): number|null}
      */
    /* private */ var renderedRenderOrder_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var renderedResolution_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var renderedRevision_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var renderedRotation_ : Any = js.native
    
    /**
      * A new replay group had to be created by `prepareFrame()`
      * @type {boolean}
      */
    var replayGroupChanged: Boolean = js.native
    
    /**
      * @private
      * @type {import("../../render/canvas/ExecutorGroup").default}
      */
    /* private */ var replayGroup_ : Any = js.native
    
    def setupCompositionContext_(): Unit = js.native
    
    /**
      * @private
      * @type {import("../../extent.js").Extent}
      */
    /* private */ var wrappedRenderedExtent_ : Any = js.native
  }
}
