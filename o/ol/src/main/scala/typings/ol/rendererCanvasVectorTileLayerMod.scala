package typings.ol

import typings.ol.featureMod.FeatureLike
import typings.ol.mapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererCanvasVectorTileLayerMod {
  
  /**
    * @classdesc
    * Canvas renderer for vector tile layers.
    * @api
    * @extends {CanvasTileLayerRenderer<import("../../layer/VectorTile.js").default>}
    */
  @JSImport("ol/renderer/canvas/VectorTileLayer", JSImport.Default)
  @js.native
  open class default protected () extends CanvasVectorTileLayerRenderer {
    /**
      * @param {import("../../layer/VectorTile.js").default} layer VectorTile layer.
      */
    def this(layer: typings.ol.vectorTileMod.default) = this()
  }
  
  /**
    * @classdesc
    * Canvas renderer for vector tile layers.
    * @api
    * @extends {CanvasTileLayerRenderer<import("../../layer/VectorTile.js").default>}
    */
  @js.native
  trait CanvasVectorTileLayerRenderer
    extends typings.ol.rendererCanvasTileLayerMod.default[typings.ol.vectorTileMod.default] {
    
    /** @private */
    /* private */ var boundHandleStyleImageChange_ : Any = js.native
    
    /**
      * @inheritDoc
      */
    def getTileImage(tile: Any): Any = js.native
    
    def getTileRenderTransform(tile: Any, frameState: Any): js.Array[Double] = js.native
    
    /**
      * Handle changes in image style state.
      * @param {import("../../events/Event.js").default} event Image style change event.
      * @private
      */
    /* private */ var handleStyleImageChange_ : Any = js.native
    
    /**
      * @param {import("../../VectorRenderTile.js").default} tile Tile.
      * @return {boolean} Tile is drawable.
      */
    def isDrawableTile(tile: typings.ol.vectorRenderTileMod.default): Boolean = js.native
    
    /**
      * @param {import("../../VectorRenderTile.js").default} tile Tile.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../../proj/Projection").default} projection Projection.
      * @return {boolean|undefined} Tile needs to be rendered.
      */
    def prepareTile(
      tile: typings.ol.vectorRenderTileMod.default,
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default
    ): js.UndefOr[Boolean] = js.native
    
    /**
      * Render declutter items for this layer
      * @param {import("../../Map.js").FrameState} frameState Frame state.
      */
    def renderDeclutter(frameState: FrameState): Unit = js.native
    
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default,
      declutterBuilderGroup: typings.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    /**
      * @param {import("../../Feature.js").FeatureLike} feature Feature.
      * @param {number} squaredTolerance Squared tolerance.
      * @param {import("../../style/Style.js").default|Array<import("../../style/Style.js").default>} styles The style or array of styles.
      * @param {import("../../render/canvas/BuilderGroup.js").default} builderGroup Replay group.
      * @param {import("../../render/canvas/BuilderGroup.js").default} [declutterBuilderGroup] Builder group for decluttering.
      * @return {boolean} `true` if an image is loading.
      */
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      builderGroup: typings.ol.renderCanvasBuilderGroupMod.default,
      declutterBuilderGroup: typings.ol.renderCanvasBuilderGroupMod.default
    ): Boolean = js.native
    
    /**
      * @param {import("../../VectorRenderTile.js").default} tile Tile.
      * @param {import("../../Map").FrameState} frameState Frame state.
      * @private
      */
    /* private */ var renderTileImage_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var renderedLayerRevision_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../transform").Transform}
      */
    /* private */ var renderedPixelToCoordinateTransform_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var renderedRotation_ : Any = js.native
    
    /**
      * @param {import("../../VectorRenderTile.js").default} tile Tile.
      * @return {boolean} A new tile image was rendered.
      * @private
      */
    /* private */ var tileImageNeedsRender_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../transform.js").Transform}
      */
    /* private */ var tmpTransform_ : Any = js.native
    
    /**
      * @param {import("../../VectorRenderTile.js").default} tile Tile.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../../proj/Projection.js").default} projection Projection.
      * @private
      */
    /* private */ var updateExecutorGroup_ : Any = js.native
  }
}
