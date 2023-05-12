package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.projMod.TransformFunction
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasImmediateMod {
  
  /**
    * @classdesc
    * A concrete subclass of {@link module:ol/render/VectorContext~VectorContext} that implements
    * direct rendering of features and geometries to an HTML5 Canvas context.
    * Instances of this class are created internally by the library and
    * provided to application code as vectorContext member of the
    * {@link module:ol/render/Event~RenderEvent} object associated with postcompose, precompose and
    * render events emitted by layers and maps.
    */
  @JSImport("ol/render/canvas/Immediate", JSImport.Default)
  @js.native
  open class default protected () extends CanvasImmediateRenderer {
    /**
      * @param {CanvasRenderingContext2D} context Context.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../../extent.js").Extent} extent Extent.
      * @param {import("../../transform.js").Transform} transform Transform.
      * @param {number} viewRotation View rotation.
      * @param {number} [squaredTolerance] Optional squared tolerance for simplification.
      * @param {import("../../proj.js").TransformFunction} [userTransform] Transform from user to view projection.
      */
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      squaredTolerance: Double
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      squaredTolerance: Double,
      userTransform: TransformFunction
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      squaredTolerance: Unit,
      userTransform: TransformFunction
    ) = this()
  }
  
  /**
    * @classdesc
    * A concrete subclass of {@link module:ol/render/VectorContext~VectorContext} that implements
    * direct rendering of features and geometries to an HTML5 Canvas context.
    * Instances of this class are created internally by the library and
    * provided to application code as vectorContext member of the
    * {@link module:ol/render/Event~RenderEvent} object associated with postcompose, precompose and
    * render events emitted by layers and maps.
    */
  @js.native
  trait CanvasImmediateRenderer
    extends typings.ol.renderVectorContextMod.default {
    
    /**
      * @private
      * @type {?import("../canvas.js").FillState}
      */
    /* private */ var contextFillState_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../canvas.js").StrokeState}
      */
    /* private */ var contextStrokeState_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../canvas.js").TextState}
      */
    /* private */ var contextTextState_ : Any = js.native
    
    /**
      * @private
      * @type {CanvasRenderingContext2D}
      */
    /* private */ var context_ : Any = js.native
    
    /**
      * Render a circle geometry into the canvas.  Rendering is immediate and uses
      * the current fill and stroke styles.
      *
      * @param {import("../../geom/Circle.js").default} geometry Circle geometry.
      * @api
      */
    def drawCircle(geometry: typings.ol.geomCircleMod.default): Unit = js.native
    
    def drawGeometry(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a GeometryCollection to the canvas.  Rendering is immediate and
      * uses the current styles appropriate for each geometry in the collection.
      *
      * @param {import("../../geom/GeometryCollection.js").default} geometry Geometry collection.
      */
    def drawGeometryCollection(geometry: typings.ol.geomGeometryCollectionMod.default): Unit = js.native
    
    /**
      * @param {Array<number>} flatCoordinates Flat coordinates.
      * @param {number} offset Offset.
      * @param {number} end End.
      * @param {number} stride Stride.
      * @private
      */
    /* private */ var drawImages_ : Any = js.native
    
    /**
      * Render a LineString into the canvas.  Rendering is immediate and uses
      * the current style.
      *
      * @param {import("../../geom/LineString.js").default|import("../Feature.js").default} geometry LineString geometry.
      */
    def drawLineString(geometry: typings.ol.geomLineStringMod.default): Unit = js.native
    def drawLineString(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a MultiLineString geometry into the canvas.  Rendering is immediate
      * and uses the current style.
      *
      * @param {import("../../geom/MultiLineString.js").default|import("../Feature.js").default} geometry MultiLineString geometry.
      */
    def drawMultiLineString(geometry: typings.ol.geomMultiLineStringMod.default): Unit = js.native
    def drawMultiLineString(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a MultiPoint geometry  into the canvas.  Rendering is immediate and
      * uses the current style.
      *
      * @param {import("../../geom/MultiPoint.js").default|import("../Feature.js").default} geometry MultiPoint geometry.
      */
    def drawMultiPoint(geometry: typings.ol.geomMultiPointMod.default): Unit = js.native
    def drawMultiPoint(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render MultiPolygon geometry into the canvas.  Rendering is immediate and
      * uses the current style.
      * @param {import("../../geom/MultiPolygon.js").default} geometry MultiPolygon geometry.
      */
    def drawMultiPolygon(geometry: typings.ol.geomMultiPolygonMod.default): Unit = js.native
    
    /**
      * Render a Point geometry into the canvas.  Rendering is immediate and uses
      * the current style.
      *
      * @param {import("../../geom/Point.js").default|import("../Feature.js").default} geometry Point geometry.
      */
    def drawPoint(geometry: typings.ol.geomPointMod.default): Unit = js.native
    def drawPoint(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a Polygon geometry into the canvas.  Rendering is immediate and uses
      * the current style.
      *
      * @param {import("../../geom/Polygon.js").default|import("../Feature.js").default} geometry Polygon geometry.
      */
    def drawPolygon(geometry: typings.ol.geomPolygonMod.default): Unit = js.native
    def drawPolygon(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * @param {Array<number>} flatCoordinates Flat coordinates.
      * @param {number} offset Offset.
      * @param {Array<number>} ends Ends.
      * @param {number} stride Stride.
      * @private
      * @return {number} End.
      */
    /* private */ var drawRings_ : Any = js.native
    
    /**
      * @param {Array<number>} flatCoordinates Flat coordinates.
      * @param {number} offset Offset.
      * @param {number} end End.
      * @param {number} stride Stride.
      * @private
      */
    /* private */ var drawText_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../extent.js").Extent}
      */
    /* private */ var extent_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../canvas.js").FillState}
      */
    /* private */ var fillState_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var imageAnchorX_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var imageAnchorY_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var imageHeight_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var imageOpacity_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var imageOriginX_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var imageOriginY_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var imageRotateWithView_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var imageRotation_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../size.js").Size}
      */
    /* private */ var imageScale_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var imageWidth_ : Any = js.native
    
    /**
      * @private
      * @type {HTMLCanvasElement|HTMLVideoElement|HTMLImageElement}
      */
    /* private */ var image_ : Any = js.native
    
    /**
      * @param {Array<number>} flatCoordinates Flat coordinates.
      * @param {number} offset Offset.
      * @param {number} end End.
      * @param {number} stride Stride.
      * @param {boolean} close Close.
      * @private
      * @return {number} end End.
      */
    /* private */ var moveToLineTo_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var pixelCoordinates_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var pixelRatio_ : Any = js.native
    
    /**
      * @param {import("../canvas.js").FillState} fillState Fill state.
      * @private
      */
    /* private */ var setContextFillState_ : Any = js.native
    
    /**
      * @param {import("../canvas.js").StrokeState} strokeState Stroke state.
      * @private
      */
    /* private */ var setContextStrokeState_ : Any = js.native
    
    /**
      * @param {import("../canvas.js").TextState} textState Text state.
      * @private
      */
    /* private */ var setContextTextState_ : Any = js.native
    
    /**
      * @param {import("../../transform.js").Transform} transform Transform.
      */
    def setTransform(transform: Transform): Unit = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var squaredTolerance_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../canvas.js").StrokeState}
      */
    /* private */ var strokeState_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../canvas.js").FillState}
      */
    /* private */ var textFillState_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var textOffsetX_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var textOffsetY_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var textRotateWithView_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var textRotation_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../size.js").Size}
      */
    /* private */ var textScale_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../canvas.js").TextState}
      */
    /* private */ var textState_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../canvas.js").StrokeState}
      */
    /* private */ var textStrokeState_ : Any = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var text_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../transform.js").Transform}
      */
    /* private */ var tmpLocalTransform_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var transformRotation_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../transform.js").Transform}
      */
    /* private */ var transform_ : Any = js.native
    
    /**
      * @private
      * @type {import("../../proj.js").TransformFunction}
      */
    /* private */ var userTransform_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var viewRotation_ : Any = js.native
  }
}
