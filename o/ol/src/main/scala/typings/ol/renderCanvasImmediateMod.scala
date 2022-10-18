package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.projMod.TransformFunction
import typings.ol.transformMod.Transform
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasImmediateMod {
  
  @JSImport("ol/render/canvas/Immediate", JSImport.Default)
  @js.native
  open class default protected () extends CanvasImmediateRenderer {
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
      opt_squaredTolerance: Double
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: Double,
      opt_userTransform: TransformFunction
    ) = this()
    def this(
      context: CanvasRenderingContext2D,
      pixelRatio: Double,
      extent: Extent,
      transform: Transform,
      viewRotation: Double,
      opt_squaredTolerance: Unit,
      opt_userTransform: TransformFunction
    ) = this()
  }
  
  @js.native
  trait CanvasImmediateRenderer
    extends typings.ol.renderVectorContextMod.default {
    
    /**
      * Render a circle geometry into the canvas.  Rendering is immediate and uses
      * the current fill and stroke styles.
      */
    def drawCircle(geometry: typings.ol.geomCircleMod.default): Unit = js.native
    
    def drawGeometry(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a GeometryCollection to the canvas.  Rendering is immediate and
      * uses the current styles appropriate for each geometry in the collection.
      */
    def drawGeometryCollection(geometry: typings.ol.geomGeometryCollectionMod.default): Unit = js.native
    
    /**
      * Render a LineString into the canvas.  Rendering is immediate and uses
      * the current style.
      */
    def drawLineString(geometry: typings.ol.geomLineStringMod.default): Unit = js.native
    def drawLineString(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a MultiLineString geometry into the canvas.  Rendering is immediate
      * and uses the current style.
      */
    def drawMultiLineString(geometry: typings.ol.geomMultiLineStringMod.default): Unit = js.native
    def drawMultiLineString(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a MultiPoint geometry  into the canvas.  Rendering is immediate and
      * uses the current style.
      */
    def drawMultiPoint(geometry: typings.ol.geomMultiPointMod.default): Unit = js.native
    def drawMultiPoint(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render MultiPolygon geometry into the canvas.  Rendering is immediate and
      * uses the current style.
      */
    def drawMultiPolygon(geometry: typings.ol.geomMultiPolygonMod.default): Unit = js.native
    
    /**
      * Render a Point geometry into the canvas.  Rendering is immediate and uses
      * the current style.
      */
    def drawPoint(geometry: typings.ol.geomPointMod.default): Unit = js.native
    def drawPoint(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    /**
      * Render a Polygon geometry into the canvas.  Rendering is immediate and uses
      * the current style.
      */
    def drawPolygon(geometry: typings.ol.geomPolygonMod.default): Unit = js.native
    def drawPolygon(geometry: typings.ol.renderFeatureMod.default): Unit = js.native
    
    def setTransform(transform: Transform): Unit = js.native
  }
}
