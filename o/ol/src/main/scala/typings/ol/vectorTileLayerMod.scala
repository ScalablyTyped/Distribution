package typings.ol

import typings.ol.olFeatureMod.FeatureLike
import typings.ol.pluggableMapMod.FrameState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorTileLayerMod {
  
  @JSImport("ol/renderer/canvas/VectorTileLayer", JSImport.Default)
  @js.native
  open class default protected () extends CanvasVectorTileLayerRenderer {
    def this(layer: typings.ol.vectorTileMod.default) = this()
  }
  
  @js.native
  trait CanvasVectorTileLayerRenderer
    extends typings.ol.tileLayerMod.default {
    
    def isDrawableTile(tile: typings.ol.vectorRenderTileMod.default): Boolean = js.native
    
    def prepareTile(
      tile: typings.ol.vectorRenderTileMod.default,
      pixelRatio: Double,
      projection: typings.ol.projectionMod.default,
      queue: Boolean
    ): js.UndefOr[Boolean] = js.native
    
    /**
      * Render declutter items for this layer
      */
    def renderDeclutter(frameState: FrameState): Unit = js.native
    
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      builderGroup: typings.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      builderGroup: typings.ol.builderGroupMod.default,
      opt_declutterBuilderGroup: typings.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      builderGroup: typings.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      builderGroup: typings.ol.builderGroupMod.default,
      opt_declutterBuilderGroup: typings.ol.builderGroupMod.default
    ): Boolean = js.native
    
    def renderQueuedTileImages_(hifi: Boolean, frameState: FrameState): Unit = js.native
  }
}
