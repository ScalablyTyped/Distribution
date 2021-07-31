package typings.openlayers.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.geom.Circle
import typings.openlayers.mod.geom.Geometry
import typings.openlayers.mod.geom.GeometryType
import typings.openlayers.mod.olx.FrameState
import typings.openlayers.mod.olx.render.ToContextOptions
import typings.openlayers.mod.render.canvas.Immediate
import typings.openlayers.mod.style.Style
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object render {
  
  @JSImport("openlayers", "render")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param type Type.
    * @param opt_vectorContext Vector context.
    * @param opt_frameState Frame state.
    * @param opt_context Context.
    * @param opt_glContext WebGL Context.
    */
  @JSImport("openlayers", "render.Event")
  @js.native
  class Event protected ()
    extends typings.openlayers.mod.events.Event {
    /**
      * @param type Type.
      * @param opt_vectorContext Vector context.
      * @param opt_frameState Frame state.
      * @param opt_context Context.
      * @param opt_glContext WebGL Context.
      */
    def this(`type`: EventType) = this()
    def this(`type`: EventType, opt_vectorContext: VectorContext) = this()
    def this(`type`: EventType, opt_vectorContext: Unit, opt_frameState: FrameState) = this()
    def this(`type`: EventType, opt_vectorContext: VectorContext, opt_frameState: FrameState) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: Unit,
      opt_frameState: Unit,
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: Unit,
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: VectorContext,
      opt_frameState: Unit,
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: VectorContext,
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: Unit,
      opt_frameState: Unit,
      opt_context: Unit,
      opt_glContext: js.Any
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: Unit,
      opt_frameState: Unit,
      opt_context: CanvasRenderingContext2D,
      opt_glContext: js.Any
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: Unit,
      opt_frameState: FrameState,
      opt_context: Unit,
      opt_glContext: js.Any
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: Unit,
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D,
      opt_glContext: js.Any
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: VectorContext,
      opt_frameState: Unit,
      opt_context: Unit,
      opt_glContext: js.Any
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: VectorContext,
      opt_frameState: Unit,
      opt_context: CanvasRenderingContext2D,
      opt_glContext: js.Any
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: VectorContext,
      opt_frameState: FrameState,
      opt_context: Unit,
      opt_glContext: js.Any
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: VectorContext,
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D,
      opt_glContext: js.Any
    ) = this()
    
    /**
      * Canvas context. Only available when a Canvas renderer is used, null
      * otherwise.
      * @api
      */
    var context: CanvasRenderingContext2D = js.native
    
    /**
      * An object representing the current render frame state.
      * @api
      */
    var frameState: FrameState = js.native
    
    /**
      * WebGL context. Only available when a WebGL renderer is used, null
      * otherwise.
      * @api
      */
    var glContext: js.Any = js.native
    
    /**
      * For canvas, this is an instance of {@link ol.render.canvas.Immediate}.
      * @api
      */
    var vectorContext: VectorContext = js.native
  }
  
  /**
    * Lightweight, read-only, {@link ol.Feature} and {@link ol.geom.Geometry} like
    * structure, optimized for rendering and styling. Geometry access through the
    * API is limited to getting the type and extent of the geometry.
    *
    * @param type Geometry type.
    * @param flatCoordinates Flat coordinates. These always need
    *     to be right-handed for polygons.
    * @param ends Ends or Endss.
    * @param properties Properties.
    */
  @JSImport("openlayers", "render.Feature")
  @js.native
  class Feature protected () extends StObject {
    /**
      * Lightweight, read-only, {@link ol.Feature} and {@link ol.geom.Geometry} like
      * structure, optimized for rendering and styling. Geometry access through the
      * API is limited to getting the type and extent of the geometry.
      *
      * @param type Geometry type.
      * @param flatCoordinates Flat coordinates. These always need
      *     to be right-handed for polygons.
      * @param ends Ends or Endss.
      * @param properties Properties.
      */
    def this(
      `type`: GeometryType,
      flatCoordinates: js.Array[Double],
      ends: js.Array[js.Array[Double] | Double],
      properties: StringDictionary[js.Any]
    ) = this()
    
    /**
      * Get a feature property by its key.
      * @param key Key
      * @return Value for the requested key.
      * @api
      */
    def get(key: String): js.Any = js.native
    
    /**
      * Get the extent of this feature's geometry.
      * @return Extent.
      * @api
      */
    def getExtent(): Extent_ = js.native
    
    /**
      * Get the feature for working with its geometry.
      * @return Feature.
      * @api
      */
    def getGeometry(): typings.openlayers.mod.render.Feature = js.native
    
    /**
      * Get the feature properties.
      * @return Feature properties.
      * @api
      */
    def getProperties(): StringDictionary[js.Any] = js.native
    
    /**
      * Get the type of this feature's geometry.
      * @return Geometry type.
      * @api
      */
    def getType(): GeometryType = js.native
  }
  
  /**
    * Context for drawing geometries.  A vector context is available on render
    * events and does not need to be constructed directly.
    * @struct
    * @api
    */
  /* tslint:disable-next-line:no-unnecessary-class */
  @JSImport("openlayers", "render.VectorContext")
  @js.native
  /**
    * Context for drawing geometries.  A vector context is available on render
    * events and does not need to be constructed directly.
    * @struct
    * @api
    */
  class VectorContext () extends StObject
  
  object canvas {
    
    /**
      * @classdesc
      * A concrete subclass of {@link ol.render.VectorContext} that implements
      * direct rendering of features and geometries to an HTML5 Canvas context.
      * Instances of this class are created internally by the library and
      * provided to application code as vectorContext member of the
      * {@link ol.render.Event} object associated with postcompose, precompose and
      * render events emitted by layers and maps.
      *
      * @param context Context.
      * @param pixelRatio Pixel ratio.
      * @param extent Extent.
      * @param transform Transform.
      * @param viewRotation View rotation.
      * @struct
      */
    @JSImport("openlayers", "render.canvas.Immediate")
    @js.native
    class Immediate protected () extends VectorContext {
      /**
        * @classdesc
        * A concrete subclass of {@link ol.render.VectorContext} that implements
        * direct rendering of features and geometries to an HTML5 Canvas context.
        * Instances of this class are created internally by the library and
        * provided to application code as vectorContext member of the
        * {@link ol.render.Event} object associated with postcompose, precompose and
        * render events emitted by layers and maps.
        *
        * @param context Context.
        * @param pixelRatio Pixel ratio.
        * @param extent Extent.
        * @param transform Transform.
        * @param viewRotation View rotation.
        * @struct
        */
      def this(
        context: CanvasRenderingContext2D,
        pixelRatio: Double,
        extent: Extent_,
        transform: js.Any,
        viewRotation: Double
      ) = this()
      
      /**
        * Render a circle geometry into the canvas.  Rendering is immediate and uses
        * the current fill and stroke styles.
        *
        * @param geometry Circle geometry.
        * @api
        */
      def drawCircle(geometry: Circle): Unit = js.native
      
      /**
        * Render a feature into the canvas.  Note that any `zIndex` on the provided
        * style will be ignored - features are rendered immediately in the order that
        * this method is called.  If you need `zIndex` support, you should be using an
        * {@link ol.layer.Vector} instead.
        *
        * @param feature Feature.
        * @param style Style.
        * @api
        */
      def drawFeature(feature: typings.openlayers.mod.Feature, style: Style): Unit = js.native
      
      /**
        * Render a geometry into the canvas.  Call
        * {@link ol.render.canvas.Immediate#setStyle} first to set the rendering style.
        *
        * @param geometry The geometry to render.
        * @api
        */
      def drawGeometry(geometry: Geometry): Unit = js.native
      def drawGeometry(geometry: typings.openlayers.mod.render.Feature): Unit = js.native
      
      /**
        * Set the rendering style.  Note that since this is an immediate rendering API,
        * any `zIndex` on the provided style will be ignored.
        *
        * @param style The rendering style.
        * @api
        */
      def setStyle(style: Style): Unit = js.native
    }
  }
  
  /**
    * Binds a Canvas Immediate API to a canvas context, to allow drawing geometries
    * to the context's canvas.
    *
    * The units for geometry coordinates are css pixels relative to the top left
    * corner of the canvas element.
    * ```js
    * var canvas = document.createElement('canvas');
    * var render = ol.render.toContext(canvas.getContext('2d'),
    *     { size: [100, 100] });
    * render.setFillStrokeStyle(new ol.style.Fill({ color: blue }));
    * render.drawPolygon(
    *     new ol.geom.Polygon([[[0, 0], [100, 100], [100, 0], [0, 0]]]));
    * ```
    *
    * @param context Canvas context.
    * @param opt_options Options.
    * @return Canvas Immediate.
    * @api
    */
  @scala.inline
  def toContext(context: CanvasRenderingContext2D): Immediate = ^.asInstanceOf[js.Dynamic].applyDynamic("toContext")(context.asInstanceOf[js.Any]).asInstanceOf[Immediate]
  @scala.inline
  def toContext(context: CanvasRenderingContext2D, opt_options: ToContextOptions): Immediate = (^.asInstanceOf[js.Dynamic].applyDynamic("toContext")(context.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Immediate]
  
  type EventType = String
}
