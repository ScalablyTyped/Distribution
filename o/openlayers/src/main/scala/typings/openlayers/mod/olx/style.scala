package typings.openlayers.mod.olx

import typings.openlayers.mod.ColorLike_
import typings.openlayers.mod.Color_
import typings.openlayers.mod.Feature
import typings.openlayers.mod.Size
import typings.openlayers.mod.StyleGeometryFunction
import typings.openlayers.mod.geom.Geometry
import typings.openlayers.mod.style.AtlasManager
import typings.openlayers.mod.style.Fill
import typings.openlayers.mod.style.IconAnchorUnits
import typings.openlayers.mod.style.IconOrigin
import typings.openlayers.mod.style.Image
import typings.openlayers.mod.style.Stroke
import typings.openlayers.mod.style.Text
import typings.openlayers.openlayersStrings.point_
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object style {
  
  trait AtlasManagerOptions extends StObject {
    
    var initialSize: js.UndefOr[Double] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var space: js.UndefOr[Double] = js.undefined
  }
  object AtlasManagerOptions {
    
    inline def apply(): AtlasManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AtlasManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AtlasManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setInitialSize(value: Double): Self = StObject.set(x, "initialSize", value.asInstanceOf[js.Any])
      
      inline def setInitialSizeUndefined: Self = StObject.set(x, "initialSize", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  trait CircleOptions extends StObject {
    
    var atlasManager: js.UndefOr[AtlasManager] = js.undefined
    
    var fill: js.UndefOr[Fill] = js.undefined
    
    var radius: Double
    
    var snapToPixel: js.UndefOr[Boolean] = js.undefined
    
    var stroke: js.UndefOr[Stroke] = js.undefined
  }
  object CircleOptions {
    
    inline def apply(radius: Double): CircleOptions = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CircleOptions] (val x: Self) extends AnyVal {
      
      inline def setAtlasManager(value: AtlasManager): Self = StObject.set(x, "atlasManager", value.asInstanceOf[js.Any])
      
      inline def setAtlasManagerUndefined: Self = StObject.set(x, "atlasManager", js.undefined)
      
      inline def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setSnapToPixel(value: Boolean): Self = StObject.set(x, "snapToPixel", value.asInstanceOf[js.Any])
      
      inline def setSnapToPixelUndefined: Self = StObject.set(x, "snapToPixel", js.undefined)
      
      inline def setStroke(value: Stroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  trait FillOptions extends StObject {
    
    var color: js.UndefOr[Color_ | ColorLike_] = js.undefined
  }
  object FillOptions {
    
    inline def apply(): FillOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FillOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FillOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color_ | ColorLike_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait IconOptions extends StObject {
    
    var anchor: js.UndefOr[js.Array[Double]] = js.undefined
    
    var anchorOrigin: js.UndefOr[IconOrigin] = js.undefined
    
    var anchorXUnits: js.UndefOr[IconAnchorUnits] = js.undefined
    
    var anchorYUnits: js.UndefOr[IconAnchorUnits] = js.undefined
    
    var color: js.UndefOr[Color_ | String] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var img: js.UndefOr[HTMLImageElement | HTMLCanvasElement] = js.undefined
    
    var imgSize: js.UndefOr[Size] = js.undefined
    
    var offset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var offsetOrigin: js.UndefOr[IconOrigin] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var snapToPixel: js.UndefOr[Boolean] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object IconOptions {
    
    inline def apply(): IconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconOptions] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: js.Array[Double]): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorOrigin(value: IconOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAnchorVarargs(value: Double*): Self = StObject.set(x, "anchor", js.Array(value*))
      
      inline def setAnchorXUnits(value: IconAnchorUnits): Self = StObject.set(x, "anchorXUnits", value.asInstanceOf[js.Any])
      
      inline def setAnchorXUnitsUndefined: Self = StObject.set(x, "anchorXUnits", js.undefined)
      
      inline def setAnchorYUnits(value: IconAnchorUnits): Self = StObject.set(x, "anchorYUnits", value.asInstanceOf[js.Any])
      
      inline def setAnchorYUnitsUndefined: Self = StObject.set(x, "anchorYUnits", js.undefined)
      
      inline def setColor(value: Color_ | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setImg(value: HTMLImageElement | HTMLCanvasElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgSize(value: Size): Self = StObject.set(x, "imgSize", value.asInstanceOf[js.Any])
      
      inline def setImgSizeUndefined: Self = StObject.set(x, "imgSize", js.undefined)
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetOrigin(value: IconOrigin): Self = StObject.set(x, "offsetOrigin", value.asInstanceOf[js.Any])
      
      inline def setOffsetOriginUndefined: Self = StObject.set(x, "offsetOrigin", js.undefined)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSnapToPixel(value: Boolean): Self = StObject.set(x, "snapToPixel", value.asInstanceOf[js.Any])
      
      inline def setSnapToPixelUndefined: Self = StObject.set(x, "snapToPixel", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  /**
    * Specify radius for regular polygons, or radius1 and radius2 for stars.
    */
  trait RegularShapeOptions extends StObject {
    
    var angle: js.UndefOr[Double] = js.undefined
    
    var fill: js.UndefOr[Fill] = js.undefined
    
    var points: Double
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var radius1: js.UndefOr[Double] = js.undefined
    
    var radius2: js.UndefOr[Double] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var snapToPixel: js.UndefOr[Boolean] = js.undefined
    
    var stroke: js.UndefOr[Stroke] = js.undefined
  }
  object RegularShapeOptions {
    
    inline def apply(points: Double): RegularShapeOptions = {
      val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegularShapeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegularShapeOptions] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadius1(value: Double): Self = StObject.set(x, "radius1", value.asInstanceOf[js.Any])
      
      inline def setRadius1Undefined: Self = StObject.set(x, "radius1", js.undefined)
      
      inline def setRadius2(value: Double): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
      
      inline def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setSnapToPixel(value: Boolean): Self = StObject.set(x, "snapToPixel", value.asInstanceOf[js.Any])
      
      inline def setSnapToPixelUndefined: Self = StObject.set(x, "snapToPixel", js.undefined)
      
      inline def setStroke(value: Stroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  trait StrokeOptions extends StObject {
    
    var color: js.UndefOr[Color_ | String] = js.undefined
    
    var lineCap: js.UndefOr[String] = js.undefined
    
    var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
    
    var lineDashOffset: js.UndefOr[Double] = js.undefined
    
    var lineJoin: js.UndefOr[String] = js.undefined
    
    var miterLimit: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object StrokeOptions {
    
    inline def apply(): StrokeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrokeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrokeOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color_ | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
      
      inline def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
      
      inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value*))
      
      inline def setLineJoin(value: String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait StyleOptions extends StObject {
    
    var fill: js.UndefOr[Fill] = js.undefined
    
    var geometry: js.UndefOr[String | Geometry | StyleGeometryFunction] = js.undefined
    
    var image: js.UndefOr[Image] = js.undefined
    
    var stroke: js.UndefOr[Stroke] = js.undefined
    
    var text: js.UndefOr[Text] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object StyleOptions {
    
    inline def apply(): StyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleOptions] (val x: Self) extends AnyVal {
      
      inline def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGeometry(value: String | Geometry | StyleGeometryFunction): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryFunction1(
        value: /* feature */ Feature | typings.openlayers.mod.render.Feature => Geometry | typings.openlayers.mod.render.Feature
      ): Self = StObject.set(x, "geometry", js.Any.fromFunction1(value))
      
      inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
      
      inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setStroke(value: Stroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait TextOptions extends StObject {
    
    var backgroundFill: js.UndefOr[Fill] = js.undefined
    
    var backgroundStroke: js.UndefOr[Stroke] = js.undefined
    
    var fill: js.UndefOr[Fill] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var maxAngle: js.UndefOr[Boolean] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var overflow: js.UndefOr[Boolean] = js.undefined
    
    var padding: js.UndefOr[js.Array[Double]] = js.undefined
    
    var placement: js.UndefOr[TextPlacement] = js.undefined
    
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var stroke: js.UndefOr[Stroke] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var textAlign: js.UndefOr[String] = js.undefined
    
    var textBaseline: js.UndefOr[String] = js.undefined
  }
  object TextOptions {
    
    inline def apply(): TextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
      
      inline def setBackgroundFill(value: Fill): Self = StObject.set(x, "backgroundFill", value.asInstanceOf[js.Any])
      
      inline def setBackgroundFillUndefined: Self = StObject.set(x, "backgroundFill", js.undefined)
      
      inline def setBackgroundStroke(value: Stroke): Self = StObject.set(x, "backgroundStroke", value.asInstanceOf[js.Any])
      
      inline def setBackgroundStrokeUndefined: Self = StObject.set(x, "backgroundStroke", js.undefined)
      
      inline def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setMaxAngle(value: Boolean): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
      
      inline def setMaxAngleUndefined: Self = StObject.set(x, "maxAngle", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPlacement(value: TextPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setStroke(value: Stroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /**
    * Text placement. One of `'point'`, `'line'`. Default is `'point'`. Note that
    * `'line'` requires the underlying geometry to be a {@link ol.geom.LineString},
    * {@link ol.geom.Polygon}, {@link ol.geom.MultiLineString} or
    * {@link ol.geom.MultiPolygon}.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.openlayers.openlayersStrings.point_
    - typings.openlayers.openlayersStrings.line
  */
  trait TextPlacement extends StObject
  object TextPlacement {
    
    inline def line: typings.openlayers.openlayersStrings.line = "line".asInstanceOf[typings.openlayers.openlayersStrings.line]
    
    inline def point: point_ = "point".asInstanceOf[point_]
  }
}
