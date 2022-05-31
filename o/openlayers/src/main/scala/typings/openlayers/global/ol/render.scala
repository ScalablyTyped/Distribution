package typings.openlayers.global.ol

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.geom.GeometryType
import typings.openlayers.mod.olx.FrameState
import typings.openlayers.mod.olx.render.ToContextOptions
import typings.openlayers.mod.render.EventType
import typings.openlayers.mod.render.canvas.Immediate
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object render {
  
  @JSGlobal("ol.render")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param type Type.
    * @param opt_vectorContext Vector context.
    * @param opt_frameState Frame state.
    * @param opt_context Context.
    * @param opt_glContext WebGL Context.
    */
  @JSGlobal("ol.render.Event")
  @js.native
  class Event protected ()
    extends typings.openlayers.mod.render.Event {
    /**
      * @param type Type.
      * @param opt_vectorContext Vector context.
      * @param opt_frameState Frame state.
      * @param opt_context Context.
      * @param opt_glContext WebGL Context.
      */
    def this(`type`: EventType) = this()
    def this(`type`: EventType, opt_vectorContext: typings.openlayers.mod.render.VectorContext) = this()
    def this(`type`: EventType, opt_vectorContext: Unit, opt_frameState: FrameState) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: typings.openlayers.mod.render.VectorContext,
      opt_frameState: FrameState
    ) = this()
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
      opt_vectorContext: typings.openlayers.mod.render.VectorContext,
      opt_frameState: Unit,
      opt_context: CanvasRenderingContext2D
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: typings.openlayers.mod.render.VectorContext,
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
      opt_vectorContext: typings.openlayers.mod.render.VectorContext,
      opt_frameState: Unit,
      opt_context: Unit,
      opt_glContext: js.Any
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: typings.openlayers.mod.render.VectorContext,
      opt_frameState: Unit,
      opt_context: CanvasRenderingContext2D,
      opt_glContext: js.Any
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: typings.openlayers.mod.render.VectorContext,
      opt_frameState: FrameState,
      opt_context: Unit,
      opt_glContext: js.Any
    ) = this()
    def this(
      `type`: EventType,
      opt_vectorContext: typings.openlayers.mod.render.VectorContext,
      opt_frameState: FrameState,
      opt_context: CanvasRenderingContext2D,
      opt_glContext: js.Any
    ) = this()
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
  @JSGlobal("ol.render.Feature")
  @js.native
  class Feature protected ()
    extends typings.openlayers.mod.render.Feature {
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
  }
  
  /**
    * Context for drawing geometries.  A vector context is available on render
    * events and does not need to be constructed directly.
    * @struct
    * @api
    */
  /* tslint:disable-next-line:no-unnecessary-class */
  @JSGlobal("ol.render.VectorContext")
  @js.native
  /**
    * Context for drawing geometries.  A vector context is available on render
    * events and does not need to be constructed directly.
    * @struct
    * @api
    */
  class VectorContext ()
    extends typings.openlayers.mod.render.VectorContext
  
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
    @JSGlobal("ol.render.canvas.Immediate")
    @js.native
    class Immediate protected ()
      extends typings.openlayers.mod.render.canvas.Immediate {
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
  inline def toContext(context: CanvasRenderingContext2D): Immediate = ^.asInstanceOf[js.Dynamic].applyDynamic("toContext")(context.asInstanceOf[js.Any]).asInstanceOf[Immediate]
  inline def toContext(context: CanvasRenderingContext2D, opt_options: ToContextOptions): Immediate = (^.asInstanceOf[js.Dynamic].applyDynamic("toContext")(context.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Immediate]
}
