package typings.ol

import typings.ol.colorMod.Color
import typings.ol.colorlikeMod.ColorLike
import typings.ol.olStrings.declutter
import typings.ol.olStrings.none
import typings.ol.olStrings.obstacle
import typings.ol.sizeMod.Size
import typings.ol.styleIconMod.IconAnchorUnits
import typings.ol.styleIconMod.IconOrigin
import typings.ol.styleStyleMod.default
import typings.ol.styleTextMod.TextJustify
import typings.ol.styleTextMod.TextPlacement
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleFlatMod {
  
  @JSImport("ol/style/flat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toStyle(flatStyle: FlatStyle): default = ^.asInstanceOf[js.Dynamic].applyDynamic("toStyle")(flatStyle.asInstanceOf[js.Any]).asInstanceOf[default]
  
  trait FlatCircle extends StObject {
    
    /**
      * Declutter mode
      */
    var `circle-declutter-mode`: js.UndefOr[declutter | obstacle | none] = js.undefined
    
    /**
      * displacement
      */
    var `circle-displacement`: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The fill color.
      */
    var `circle-fill-color`: js.UndefOr[Color | ColorLike] = js.undefined
    
    /**
      * Circle radius.
      */
    var `circle-radius`: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to rotate the shape with the view
      * (meaningful only when used in conjunction with a two dimensional scale).
      */
    var `circle-rotate-with-view`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rotation in radians
      * (positive rotation clockwise, meaningful only when used in conjunction with a two dimensional scale).
      */
    var `circle-rotation`: js.UndefOr[Double] = js.undefined
    
    /**
      * Scale. A two dimensional scale will produce an ellipse.
      * Unless two dimensional scaling is required a better result may be obtained with an appropriate setting for `circle-radius`.
      */
    var `circle-scale`: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * The stroke color.
      */
    var `circle-stroke-color`: js.UndefOr[Color | ColorLike] = js.undefined
    
    /**
      * Line cap style: `butt`, `round`, or `square`.
      */
    var `circle-stroke-line-cap`: js.UndefOr[CanvasLineCap] = js.undefined
    
    /**
      * Line dash pattern.
      */
    var `circle-stroke-line-dash`: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Line dash offset.
      */
    var `circle-stroke-line-dash-offset`: js.UndefOr[Double] = js.undefined
    
    /**
      * Line join style: `bevel`, `round`, or `miter`.
      */
    var `circle-stroke-line-join`: js.UndefOr[CanvasLineJoin] = js.undefined
    
    /**
      * Miter limit.
      */
    var `circle-stroke-miter-limit`: js.UndefOr[Double] = js.undefined
    
    /**
      * Stroke pixel width.
      */
    var `circle-stroke-width`: js.UndefOr[Double] = js.undefined
  }
  object FlatCircle {
    
    inline def apply(): FlatCircle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlatCircle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlatCircle] (val x: Self) extends AnyVal {
      
      inline def `setCircle-declutter-mode`(value: declutter | obstacle | none): Self = StObject.set(x, "circle-declutter-mode", value.asInstanceOf[js.Any])
      
      inline def `setCircle-declutter-modeUndefined`: Self = StObject.set(x, "circle-declutter-mode", js.undefined)
      
      inline def `setCircle-displacement`(value: js.Array[Double]): Self = StObject.set(x, "circle-displacement", value.asInstanceOf[js.Any])
      
      inline def `setCircle-displacementUndefined`: Self = StObject.set(x, "circle-displacement", js.undefined)
      
      inline def `setCircle-displacementVarargs`(value: Double*): Self = StObject.set(x, "circle-displacement", js.Array(value*))
      
      inline def `setCircle-fill-color`(value: Color | ColorLike): Self = StObject.set(x, "circle-fill-color", value.asInstanceOf[js.Any])
      
      inline def `setCircle-fill-colorUndefined`: Self = StObject.set(x, "circle-fill-color", js.undefined)
      
      inline def `setCircle-fill-colorVarargs`(value: Double*): Self = StObject.set(x, "circle-fill-color", js.Array(value*))
      
      inline def `setCircle-radius`(value: Double): Self = StObject.set(x, "circle-radius", value.asInstanceOf[js.Any])
      
      inline def `setCircle-radiusUndefined`: Self = StObject.set(x, "circle-radius", js.undefined)
      
      inline def `setCircle-rotate-with-view`(value: Boolean): Self = StObject.set(x, "circle-rotate-with-view", value.asInstanceOf[js.Any])
      
      inline def `setCircle-rotate-with-viewUndefined`: Self = StObject.set(x, "circle-rotate-with-view", js.undefined)
      
      inline def `setCircle-rotation`(value: Double): Self = StObject.set(x, "circle-rotation", value.asInstanceOf[js.Any])
      
      inline def `setCircle-rotationUndefined`: Self = StObject.set(x, "circle-rotation", js.undefined)
      
      inline def `setCircle-scale`(value: Double | Size): Self = StObject.set(x, "circle-scale", value.asInstanceOf[js.Any])
      
      inline def `setCircle-scaleUndefined`: Self = StObject.set(x, "circle-scale", js.undefined)
      
      inline def `setCircle-scaleVarargs`(value: Double*): Self = StObject.set(x, "circle-scale", js.Array(value*))
      
      inline def `setCircle-stroke-color`(value: Color | ColorLike): Self = StObject.set(x, "circle-stroke-color", value.asInstanceOf[js.Any])
      
      inline def `setCircle-stroke-colorUndefined`: Self = StObject.set(x, "circle-stroke-color", js.undefined)
      
      inline def `setCircle-stroke-colorVarargs`(value: Double*): Self = StObject.set(x, "circle-stroke-color", js.Array(value*))
      
      inline def `setCircle-stroke-line-cap`(value: CanvasLineCap): Self = StObject.set(x, "circle-stroke-line-cap", value.asInstanceOf[js.Any])
      
      inline def `setCircle-stroke-line-capUndefined`: Self = StObject.set(x, "circle-stroke-line-cap", js.undefined)
      
      inline def `setCircle-stroke-line-dash`(value: js.Array[Double]): Self = StObject.set(x, "circle-stroke-line-dash", value.asInstanceOf[js.Any])
      
      inline def `setCircle-stroke-line-dash-offset`(value: Double): Self = StObject.set(x, "circle-stroke-line-dash-offset", value.asInstanceOf[js.Any])
      
      inline def `setCircle-stroke-line-dash-offsetUndefined`: Self = StObject.set(x, "circle-stroke-line-dash-offset", js.undefined)
      
      inline def `setCircle-stroke-line-dashUndefined`: Self = StObject.set(x, "circle-stroke-line-dash", js.undefined)
      
      inline def `setCircle-stroke-line-dashVarargs`(value: Double*): Self = StObject.set(x, "circle-stroke-line-dash", js.Array(value*))
      
      inline def `setCircle-stroke-line-join`(value: CanvasLineJoin): Self = StObject.set(x, "circle-stroke-line-join", value.asInstanceOf[js.Any])
      
      inline def `setCircle-stroke-line-joinUndefined`: Self = StObject.set(x, "circle-stroke-line-join", js.undefined)
      
      inline def `setCircle-stroke-miter-limit`(value: Double): Self = StObject.set(x, "circle-stroke-miter-limit", value.asInstanceOf[js.Any])
      
      inline def `setCircle-stroke-miter-limitUndefined`: Self = StObject.set(x, "circle-stroke-miter-limit", js.undefined)
      
      inline def `setCircle-stroke-width`(value: Double): Self = StObject.set(x, "circle-stroke-width", value.asInstanceOf[js.Any])
      
      inline def `setCircle-stroke-widthUndefined`: Self = StObject.set(x, "circle-stroke-width", js.undefined)
    }
  }
  
  trait FlatFill extends StObject {
    
    /**
      * The fill color.
      */
    var `fill-color`: js.UndefOr[Color | ColorLike] = js.undefined
  }
  object FlatFill {
    
    inline def apply(): FlatFill = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlatFill]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlatFill] (val x: Self) extends AnyVal {
      
      inline def `setFill-color`(value: Color | ColorLike): Self = StObject.set(x, "fill-color", value.asInstanceOf[js.Any])
      
      inline def `setFill-colorUndefined`: Self = StObject.set(x, "fill-color", js.undefined)
      
      inline def `setFill-colorVarargs`(value: Double*): Self = StObject.set(x, "fill-color", js.Array(value*))
    }
  }
  
  trait FlatIcon extends StObject {
    
    /**
      * Anchor. Default value is the icon center.
      */
    var `icon-anchor`: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Origin of the anchor: `bottom-left`, `bottom-right`,
      * `top-left` or `top-right`.
      */
    var `icon-anchor-origin`: js.UndefOr[IconOrigin] = js.undefined
    
    /**
      * Units in which the anchor x value is
      * specified. A value of `'fraction'` indicates the x value is a fraction of the icon. A value of `'pixels'` indicates
      * the x value in pixels.
      */
    var `icon-anchor-x-units`: js.UndefOr[IconAnchorUnits] = js.undefined
    
    /**
      * Units in which the anchor y value is
      * specified. A value of `'fraction'` indicates the y value is a fraction of the icon. A value of `'pixels'` indicates
      * the y value in pixels.
      */
    var `icon-anchor-y-units`: js.UndefOr[IconAnchorUnits] = js.undefined
    
    /**
      * Color to tint the icon. If not specified,
      * the icon will be left as is.
      */
    var `icon-color`: js.UndefOr[String | Color] = js.undefined
    
    /**
      * The `crossOrigin` attribute for loaded images. Note that you must provide a
      * `icon-cross-origin` value if you want to access pixel data with the Canvas renderer.
      * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
      */
    var `icon-cross-origin`: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Declutter mode
      */
    var `icon-declutter-mode`: js.UndefOr[declutter | obstacle | none] = js.undefined
    
    /**
      * Displacement of the icon.
      */
    var `icon-displacement`: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Image object for the icon. If the `icon-src` option is not provided then the
      * provided image must already be loaded. And in that case, it is required
      * to provide the size of the image, with the `icon-img-size` option.
      */
    var `icon-img`: js.UndefOr[HTMLCanvasElement | HTMLImageElement] = js.undefined
    
    /**
      * Image size in pixels. Only required if `icon-img` is set and `icon-src` is not.
      * The provided size needs to match the actual size of the image.
      */
    var `icon-img-size`: js.UndefOr[Size] = js.undefined
    
    /**
      * Offset, which, together with the size and the offset origin, define the
      * sub-rectangle to use from the original icon image.
      */
    var `icon-offset`: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Origin of the offset: `bottom-left`, `bottom-right`,
      * `top-left` or `top-right`.
      */
    var `icon-offset-origin`: js.UndefOr[IconOrigin] = js.undefined
    
    /**
      * Opacity of the icon.
      */
    var `icon-opacity`: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to rotate the icon with the view.
      */
    var `icon-rotate-with-view`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rotation in radians (positive rotation clockwise).
      */
    var `icon-rotation`: js.UndefOr[Double] = js.undefined
    
    /**
      * Scale.
      */
    var `icon-scale`: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * Icon size in pixel. Can be used together with `icon-offset` to define the
      * sub-rectangle to use from the origin (sprite) icon image.
      */
    var `icon-size`: js.UndefOr[Size] = js.undefined
    
    /**
      * Image source URI.
      */
    var `icon-src`: js.UndefOr[String] = js.undefined
  }
  object FlatIcon {
    
    inline def apply(): FlatIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlatIcon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlatIcon] (val x: Self) extends AnyVal {
      
      inline def `setIcon-anchor`(value: js.Array[Double]): Self = StObject.set(x, "icon-anchor", value.asInstanceOf[js.Any])
      
      inline def `setIcon-anchor-origin`(value: IconOrigin): Self = StObject.set(x, "icon-anchor-origin", value.asInstanceOf[js.Any])
      
      inline def `setIcon-anchor-originUndefined`: Self = StObject.set(x, "icon-anchor-origin", js.undefined)
      
      inline def `setIcon-anchor-x-units`(value: IconAnchorUnits): Self = StObject.set(x, "icon-anchor-x-units", value.asInstanceOf[js.Any])
      
      inline def `setIcon-anchor-x-unitsUndefined`: Self = StObject.set(x, "icon-anchor-x-units", js.undefined)
      
      inline def `setIcon-anchor-y-units`(value: IconAnchorUnits): Self = StObject.set(x, "icon-anchor-y-units", value.asInstanceOf[js.Any])
      
      inline def `setIcon-anchor-y-unitsUndefined`: Self = StObject.set(x, "icon-anchor-y-units", js.undefined)
      
      inline def `setIcon-anchorUndefined`: Self = StObject.set(x, "icon-anchor", js.undefined)
      
      inline def `setIcon-anchorVarargs`(value: Double*): Self = StObject.set(x, "icon-anchor", js.Array(value*))
      
      inline def `setIcon-color`(value: String | Color): Self = StObject.set(x, "icon-color", value.asInstanceOf[js.Any])
      
      inline def `setIcon-colorUndefined`: Self = StObject.set(x, "icon-color", js.undefined)
      
      inline def `setIcon-colorVarargs`(value: Double*): Self = StObject.set(x, "icon-color", js.Array(value*))
      
      inline def `setIcon-cross-origin`(value: String): Self = StObject.set(x, "icon-cross-origin", value.asInstanceOf[js.Any])
      
      inline def `setIcon-cross-originNull`: Self = StObject.set(x, "icon-cross-origin", null)
      
      inline def `setIcon-cross-originUndefined`: Self = StObject.set(x, "icon-cross-origin", js.undefined)
      
      inline def `setIcon-declutter-mode`(value: declutter | obstacle | none): Self = StObject.set(x, "icon-declutter-mode", value.asInstanceOf[js.Any])
      
      inline def `setIcon-declutter-modeUndefined`: Self = StObject.set(x, "icon-declutter-mode", js.undefined)
      
      inline def `setIcon-displacement`(value: js.Array[Double]): Self = StObject.set(x, "icon-displacement", value.asInstanceOf[js.Any])
      
      inline def `setIcon-displacementUndefined`: Self = StObject.set(x, "icon-displacement", js.undefined)
      
      inline def `setIcon-displacementVarargs`(value: Double*): Self = StObject.set(x, "icon-displacement", js.Array(value*))
      
      inline def `setIcon-img`(value: HTMLCanvasElement | HTMLImageElement): Self = StObject.set(x, "icon-img", value.asInstanceOf[js.Any])
      
      inline def `setIcon-img-size`(value: Size): Self = StObject.set(x, "icon-img-size", value.asInstanceOf[js.Any])
      
      inline def `setIcon-img-sizeUndefined`: Self = StObject.set(x, "icon-img-size", js.undefined)
      
      inline def `setIcon-img-sizeVarargs`(value: Double*): Self = StObject.set(x, "icon-img-size", js.Array(value*))
      
      inline def `setIcon-imgUndefined`: Self = StObject.set(x, "icon-img", js.undefined)
      
      inline def `setIcon-offset`(value: js.Array[Double]): Self = StObject.set(x, "icon-offset", value.asInstanceOf[js.Any])
      
      inline def `setIcon-offset-origin`(value: IconOrigin): Self = StObject.set(x, "icon-offset-origin", value.asInstanceOf[js.Any])
      
      inline def `setIcon-offset-originUndefined`: Self = StObject.set(x, "icon-offset-origin", js.undefined)
      
      inline def `setIcon-offsetUndefined`: Self = StObject.set(x, "icon-offset", js.undefined)
      
      inline def `setIcon-offsetVarargs`(value: Double*): Self = StObject.set(x, "icon-offset", js.Array(value*))
      
      inline def `setIcon-opacity`(value: Double): Self = StObject.set(x, "icon-opacity", value.asInstanceOf[js.Any])
      
      inline def `setIcon-opacityUndefined`: Self = StObject.set(x, "icon-opacity", js.undefined)
      
      inline def `setIcon-rotate-with-view`(value: Boolean): Self = StObject.set(x, "icon-rotate-with-view", value.asInstanceOf[js.Any])
      
      inline def `setIcon-rotate-with-viewUndefined`: Self = StObject.set(x, "icon-rotate-with-view", js.undefined)
      
      inline def `setIcon-rotation`(value: Double): Self = StObject.set(x, "icon-rotation", value.asInstanceOf[js.Any])
      
      inline def `setIcon-rotationUndefined`: Self = StObject.set(x, "icon-rotation", js.undefined)
      
      inline def `setIcon-scale`(value: Double | Size): Self = StObject.set(x, "icon-scale", value.asInstanceOf[js.Any])
      
      inline def `setIcon-scaleUndefined`: Self = StObject.set(x, "icon-scale", js.undefined)
      
      inline def `setIcon-scaleVarargs`(value: Double*): Self = StObject.set(x, "icon-scale", js.Array(value*))
      
      inline def `setIcon-size`(value: Size): Self = StObject.set(x, "icon-size", value.asInstanceOf[js.Any])
      
      inline def `setIcon-sizeUndefined`: Self = StObject.set(x, "icon-size", js.undefined)
      
      inline def `setIcon-sizeVarargs`(value: Double*): Self = StObject.set(x, "icon-size", js.Array(value*))
      
      inline def `setIcon-src`(value: String): Self = StObject.set(x, "icon-src", value.asInstanceOf[js.Any])
      
      inline def `setIcon-srcUndefined`: Self = StObject.set(x, "icon-src", js.undefined)
    }
  }
  
  trait FlatShape extends StObject {
    
    /**
      * Shape's angle in radians. A value of 0 will have one of the shape's point facing up.
      */
    var `shape-angle`: js.UndefOr[Double] = js.undefined
    
    /**
      * Declutter mode.
      */
    var `shape-declutter-mode`: js.UndefOr[declutter | obstacle | none] = js.undefined
    
    /**
      * Displacement of the shape
      */
    var `shape-displacement`: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The fill color.
      */
    var `shape-fill-color`: js.UndefOr[Color | ColorLike] = js.undefined
    
    /**
      * Number of points for stars and regular polygons. In case of a polygon, the number of points
      * is the number of sides.
      */
    var `shape-points`: js.UndefOr[Double] = js.undefined
    
    /**
      * Radius of a regular polygon.
      */
    var `shape-radius`: js.UndefOr[Double] = js.undefined
    
    /**
      * First radius of a star. Ignored if radius is set.
      */
    var `shape-radius1`: js.UndefOr[Double] = js.undefined
    
    /**
      * Second radius of a star.
      */
    var `shape-radius2`: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to rotate the shape with the view.
      */
    var `shape-rotate-with-view`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rotation in radians (positive rotation clockwise).
      */
    var `shape-rotation`: js.UndefOr[Double] = js.undefined
    
    /**
      * Scale. Unless two dimensional scaling is required a better
      * result may be obtained with appropriate settings for `shape-radius`, `shape-radius1` and `shape-radius2`.
      */
    var `shape-scale`: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * The stroke color.
      */
    var `shape-stroke-color`: js.UndefOr[Color | ColorLike] = js.undefined
    
    /**
      * Line cap style: `butt`, `round`, or `square`.
      */
    var `shape-stroke-line-cap`: js.UndefOr[CanvasLineCap] = js.undefined
    
    /**
      * Line dash pattern.
      */
    var `shape-stroke-line-dash`: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Line dash offset.
      */
    var `shape-stroke-line-dash-offset`: js.UndefOr[Double] = js.undefined
    
    /**
      * Line join style: `bevel`, `round`, or `miter`.
      */
    var `shape-stroke-line-join`: js.UndefOr[CanvasLineJoin] = js.undefined
    
    /**
      * Miter limit.
      */
    var `shape-stroke-miter-limit`: js.UndefOr[Double] = js.undefined
    
    /**
      * Stroke pixel width.
      */
    var `shape-stroke-width`: js.UndefOr[Double] = js.undefined
  }
  object FlatShape {
    
    inline def apply(): FlatShape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlatShape]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlatShape] (val x: Self) extends AnyVal {
      
      inline def `setShape-angle`(value: Double): Self = StObject.set(x, "shape-angle", value.asInstanceOf[js.Any])
      
      inline def `setShape-angleUndefined`: Self = StObject.set(x, "shape-angle", js.undefined)
      
      inline def `setShape-declutter-mode`(value: declutter | obstacle | none): Self = StObject.set(x, "shape-declutter-mode", value.asInstanceOf[js.Any])
      
      inline def `setShape-declutter-modeUndefined`: Self = StObject.set(x, "shape-declutter-mode", js.undefined)
      
      inline def `setShape-displacement`(value: js.Array[Double]): Self = StObject.set(x, "shape-displacement", value.asInstanceOf[js.Any])
      
      inline def `setShape-displacementUndefined`: Self = StObject.set(x, "shape-displacement", js.undefined)
      
      inline def `setShape-displacementVarargs`(value: Double*): Self = StObject.set(x, "shape-displacement", js.Array(value*))
      
      inline def `setShape-fill-color`(value: Color | ColorLike): Self = StObject.set(x, "shape-fill-color", value.asInstanceOf[js.Any])
      
      inline def `setShape-fill-colorUndefined`: Self = StObject.set(x, "shape-fill-color", js.undefined)
      
      inline def `setShape-fill-colorVarargs`(value: Double*): Self = StObject.set(x, "shape-fill-color", js.Array(value*))
      
      inline def `setShape-points`(value: Double): Self = StObject.set(x, "shape-points", value.asInstanceOf[js.Any])
      
      inline def `setShape-pointsUndefined`: Self = StObject.set(x, "shape-points", js.undefined)
      
      inline def `setShape-radius`(value: Double): Self = StObject.set(x, "shape-radius", value.asInstanceOf[js.Any])
      
      inline def `setShape-radius1`(value: Double): Self = StObject.set(x, "shape-radius1", value.asInstanceOf[js.Any])
      
      inline def `setShape-radius1Undefined`: Self = StObject.set(x, "shape-radius1", js.undefined)
      
      inline def `setShape-radius2`(value: Double): Self = StObject.set(x, "shape-radius2", value.asInstanceOf[js.Any])
      
      inline def `setShape-radius2Undefined`: Self = StObject.set(x, "shape-radius2", js.undefined)
      
      inline def `setShape-radiusUndefined`: Self = StObject.set(x, "shape-radius", js.undefined)
      
      inline def `setShape-rotate-with-view`(value: Boolean): Self = StObject.set(x, "shape-rotate-with-view", value.asInstanceOf[js.Any])
      
      inline def `setShape-rotate-with-viewUndefined`: Self = StObject.set(x, "shape-rotate-with-view", js.undefined)
      
      inline def `setShape-rotation`(value: Double): Self = StObject.set(x, "shape-rotation", value.asInstanceOf[js.Any])
      
      inline def `setShape-rotationUndefined`: Self = StObject.set(x, "shape-rotation", js.undefined)
      
      inline def `setShape-scale`(value: Double | Size): Self = StObject.set(x, "shape-scale", value.asInstanceOf[js.Any])
      
      inline def `setShape-scaleUndefined`: Self = StObject.set(x, "shape-scale", js.undefined)
      
      inline def `setShape-scaleVarargs`(value: Double*): Self = StObject.set(x, "shape-scale", js.Array(value*))
      
      inline def `setShape-stroke-color`(value: Color | ColorLike): Self = StObject.set(x, "shape-stroke-color", value.asInstanceOf[js.Any])
      
      inline def `setShape-stroke-colorUndefined`: Self = StObject.set(x, "shape-stroke-color", js.undefined)
      
      inline def `setShape-stroke-colorVarargs`(value: Double*): Self = StObject.set(x, "shape-stroke-color", js.Array(value*))
      
      inline def `setShape-stroke-line-cap`(value: CanvasLineCap): Self = StObject.set(x, "shape-stroke-line-cap", value.asInstanceOf[js.Any])
      
      inline def `setShape-stroke-line-capUndefined`: Self = StObject.set(x, "shape-stroke-line-cap", js.undefined)
      
      inline def `setShape-stroke-line-dash`(value: js.Array[Double]): Self = StObject.set(x, "shape-stroke-line-dash", value.asInstanceOf[js.Any])
      
      inline def `setShape-stroke-line-dash-offset`(value: Double): Self = StObject.set(x, "shape-stroke-line-dash-offset", value.asInstanceOf[js.Any])
      
      inline def `setShape-stroke-line-dash-offsetUndefined`: Self = StObject.set(x, "shape-stroke-line-dash-offset", js.undefined)
      
      inline def `setShape-stroke-line-dashUndefined`: Self = StObject.set(x, "shape-stroke-line-dash", js.undefined)
      
      inline def `setShape-stroke-line-dashVarargs`(value: Double*): Self = StObject.set(x, "shape-stroke-line-dash", js.Array(value*))
      
      inline def `setShape-stroke-line-join`(value: CanvasLineJoin): Self = StObject.set(x, "shape-stroke-line-join", value.asInstanceOf[js.Any])
      
      inline def `setShape-stroke-line-joinUndefined`: Self = StObject.set(x, "shape-stroke-line-join", js.undefined)
      
      inline def `setShape-stroke-miter-limit`(value: Double): Self = StObject.set(x, "shape-stroke-miter-limit", value.asInstanceOf[js.Any])
      
      inline def `setShape-stroke-miter-limitUndefined`: Self = StObject.set(x, "shape-stroke-miter-limit", js.undefined)
      
      inline def `setShape-stroke-width`(value: Double): Self = StObject.set(x, "shape-stroke-width", value.asInstanceOf[js.Any])
      
      inline def `setShape-stroke-widthUndefined`: Self = StObject.set(x, "shape-stroke-width", js.undefined)
    }
  }
  
  trait FlatStroke extends StObject {
    
    /**
      * The stroke color.
      */
    var `stroke-color`: js.UndefOr[Color | ColorLike] = js.undefined
    
    /**
      * Line cap style: `butt`, `round`, or `square`.
      */
    var `stroke-line-cap`: js.UndefOr[CanvasLineCap] = js.undefined
    
    /**
      * Line dash pattern.
      */
    var `stroke-line-dash`: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Line dash offset.
      */
    var `stroke-line-dash-offset`: js.UndefOr[Double] = js.undefined
    
    /**
      * Line join style: `bevel`, `round`, or `miter`.
      */
    var `stroke-line-join`: js.UndefOr[CanvasLineJoin] = js.undefined
    
    /**
      * Miter limit.
      */
    var `stroke-miter-limit`: js.UndefOr[Double] = js.undefined
    
    /**
      * Stroke pixel width.
      */
    var `stroke-width`: js.UndefOr[Double] = js.undefined
  }
  object FlatStroke {
    
    inline def apply(): FlatStroke = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlatStroke]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlatStroke] (val x: Self) extends AnyVal {
      
      inline def `setStroke-color`(value: Color | ColorLike): Self = StObject.set(x, "stroke-color", value.asInstanceOf[js.Any])
      
      inline def `setStroke-colorUndefined`: Self = StObject.set(x, "stroke-color", js.undefined)
      
      inline def `setStroke-colorVarargs`(value: Double*): Self = StObject.set(x, "stroke-color", js.Array(value*))
      
      inline def `setStroke-line-cap`(value: CanvasLineCap): Self = StObject.set(x, "stroke-line-cap", value.asInstanceOf[js.Any])
      
      inline def `setStroke-line-capUndefined`: Self = StObject.set(x, "stroke-line-cap", js.undefined)
      
      inline def `setStroke-line-dash`(value: js.Array[Double]): Self = StObject.set(x, "stroke-line-dash", value.asInstanceOf[js.Any])
      
      inline def `setStroke-line-dash-offset`(value: Double): Self = StObject.set(x, "stroke-line-dash-offset", value.asInstanceOf[js.Any])
      
      inline def `setStroke-line-dash-offsetUndefined`: Self = StObject.set(x, "stroke-line-dash-offset", js.undefined)
      
      inline def `setStroke-line-dashUndefined`: Self = StObject.set(x, "stroke-line-dash", js.undefined)
      
      inline def `setStroke-line-dashVarargs`(value: Double*): Self = StObject.set(x, "stroke-line-dash", js.Array(value*))
      
      inline def `setStroke-line-join`(value: CanvasLineJoin): Self = StObject.set(x, "stroke-line-join", value.asInstanceOf[js.Any])
      
      inline def `setStroke-line-joinUndefined`: Self = StObject.set(x, "stroke-line-join", js.undefined)
      
      inline def `setStroke-miter-limit`(value: Double): Self = StObject.set(x, "stroke-miter-limit", value.asInstanceOf[js.Any])
      
      inline def `setStroke-miter-limitUndefined`: Self = StObject.set(x, "stroke-miter-limit", js.undefined)
      
      inline def `setStroke-width`(value: Double): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
      
      inline def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    }
  }
  
  trait FlatStyle
    extends StObject
       with FlatFill
       with FlatStroke
       with FlatText
       with FlatIcon
       with FlatShape
       with FlatCircle
  object FlatStyle {
    
    inline def apply(): FlatStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlatStyle]
    }
  }
  
  type FlatStyleLike = FlatStyle | js.Array[FlatStyle]
  
  trait FlatText extends StObject {
    
    /**
      * Text alignment. Possible values: `'left'`, `'right'`, `'center'`, `'end'` or `'start'`.
      * Default is `'center'` for `text-placement: 'point'`. For `text-placement: 'line'`, the default is to let the renderer choose a
      * placement where `text-max-angle` is not exceeded.
      */
    var `text-align`: js.UndefOr[CanvasTextAlign] = js.undefined
    
    /**
      * The fill color.
      */
    var `text-background-fill-color`: js.UndefOr[Color | ColorLike] = js.undefined
    
    /**
      * The stroke color.
      */
    var `text-background-stroke-color`: js.UndefOr[Color | ColorLike] = js.undefined
    
    /**
      * Line cap style: `butt`, `round`, or `square`.
      */
    var `text-background-stroke-line-cap`: js.UndefOr[CanvasLineCap] = js.undefined
    
    /**
      * Line dash pattern.
      */
    var `text-background-stroke-line-dash`: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Line dash offset.
      */
    var `text-background-stroke-line-dash-offset`: js.UndefOr[Double] = js.undefined
    
    /**
      * Line join style: `bevel`, `round`, or `miter`.
      */
    var `text-background-stroke-line-join`: js.UndefOr[CanvasLineJoin] = js.undefined
    
    /**
      * Miter limit.
      */
    var `text-background-stroke-miter-limit`: js.UndefOr[Double] = js.undefined
    
    /**
      * Stroke pixel width.
      */
    var `text-background-stroke-width`: js.UndefOr[Double] = js.undefined
    
    /**
      * Text base line. Possible values: `'bottom'`, `'top'`, `'middle'`, `'alphabetic'`,
      * `'hanging'`, `'ideographic'`.
      */
    var `text-baseline`: js.UndefOr[CanvasTextBaseline] = js.undefined
    
    /**
      * The fill color.
      */
    var `text-fill-color`: js.UndefOr[Color | ColorLike] = js.undefined
    
    /**
      * Font style as CSS `font` value, see:
      * https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/font. Default is `'10px sans-serif'`
      */
    var `text-font`: js.UndefOr[String] = js.undefined
    
    /**
      * Text justification within the text box.
      * If not set, text is justified towards the `textAlign` anchor.
      * Otherwise, use options `'left'`, `'center'`, or `'right'` to justify the text within the text box.
      * **Note:** `text-justify` is ignored for immediate rendering and also for `text-placement: 'line'`.
      */
    var `text-justify`: js.UndefOr[TextJustify] = js.undefined
    
    /**
      * When `text-placement` is set to `'line'`, allow a maximum angle between adjacent characters.
      * The expected value is in radians, and the default is 45° (`Math.PI / 4`).
      */
    var `text-max-angle`: js.UndefOr[Double] = js.undefined
    
    /**
      * Horizontal text offset in pixels. A positive will shift the text right.
      */
    var `text-offset-x`: js.UndefOr[Double] = js.undefined
    
    /**
      * Vertical text offset in pixels. A positive will shift the text down.
      */
    var `text-offset-y`: js.UndefOr[Double] = js.undefined
    
    /**
      * For polygon labels or when `placement` is set to `'line'`, allow text to exceed
      * the width of the polygon at the label position or the length of the path that it follows.
      */
    var `text-overflow`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Padding in pixels around the text for decluttering and background. The order of
      * values in the array is `[top, right, bottom, left]`.
      */
    var `text-padding`: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Text placement.
      */
    var `text-placement`: js.UndefOr[TextPlacement] = js.undefined
    
    /**
      * Repeat interval in pixels. When set, the text will be repeated at this interval. Only available when
      * `text-placement` is set to `'line'`. Overrides `text-align`.
      */
    var `text-repeat`: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to rotate the text with the view.
      */
    var `text-rotate-with-view`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rotation in radians (positive rotation clockwise).
      */
    var `text-rotation`: js.UndefOr[Double] = js.undefined
    
    /**
      * Scale.
      */
    var `text-scale`: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * The stroke color.
      */
    var `text-stroke-color`: js.UndefOr[Color | ColorLike] = js.undefined
    
    /**
      * Line cap style: `butt`, `round`, or `square`.
      */
    var `text-stroke-line-cap`: js.UndefOr[CanvasLineCap] = js.undefined
    
    /**
      * Line dash pattern.
      */
    var `text-stroke-line-dash`: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Line dash offset.
      */
    var `text-stroke-line-dash-offset`: js.UndefOr[Double] = js.undefined
    
    /**
      * Line join style: `bevel`, `round`, or `miter`.
      */
    var `text-stroke-line-join`: js.UndefOr[CanvasLineJoin] = js.undefined
    
    /**
      * Miter limit.
      */
    var `text-stroke-miter-limit`: js.UndefOr[Double] = js.undefined
    
    /**
      * Stroke pixel width.
      */
    var `text-stroke-width`: js.UndefOr[Double] = js.undefined
    
    /**
      * Text content or rich text content. For plain text provide a string, which can
      * contain line breaks (`\n`). For rich text provide an array of text/font tuples. A tuple consists of the text to
      * render and the font to use (or `''` to use the text style's font). A line break has to be a separate tuple (i.e. `'\n', ''`).
      * **Example:** `['foo', 'bold 10px sans-serif', ' bar', 'italic 10px sans-serif', ' baz', '']` will yield "**foo** *bar* baz".
      * **Note:** Rich text is not supported for the immediate rendering API.
      */
    var `text-value`: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object FlatText {
    
    inline def apply(): FlatText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlatText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlatText] (val x: Self) extends AnyVal {
      
      inline def `setText-align`(value: CanvasTextAlign): Self = StObject.set(x, "text-align", value.asInstanceOf[js.Any])
      
      inline def `setText-alignUndefined`: Self = StObject.set(x, "text-align", js.undefined)
      
      inline def `setText-background-fill-color`(value: Color | ColorLike): Self = StObject.set(x, "text-background-fill-color", value.asInstanceOf[js.Any])
      
      inline def `setText-background-fill-colorUndefined`: Self = StObject.set(x, "text-background-fill-color", js.undefined)
      
      inline def `setText-background-fill-colorVarargs`(value: Double*): Self = StObject.set(x, "text-background-fill-color", js.Array(value*))
      
      inline def `setText-background-stroke-color`(value: Color | ColorLike): Self = StObject.set(x, "text-background-stroke-color", value.asInstanceOf[js.Any])
      
      inline def `setText-background-stroke-colorUndefined`: Self = StObject.set(x, "text-background-stroke-color", js.undefined)
      
      inline def `setText-background-stroke-colorVarargs`(value: Double*): Self = StObject.set(x, "text-background-stroke-color", js.Array(value*))
      
      inline def `setText-background-stroke-line-cap`(value: CanvasLineCap): Self = StObject.set(x, "text-background-stroke-line-cap", value.asInstanceOf[js.Any])
      
      inline def `setText-background-stroke-line-capUndefined`: Self = StObject.set(x, "text-background-stroke-line-cap", js.undefined)
      
      inline def `setText-background-stroke-line-dash`(value: js.Array[Double]): Self = StObject.set(x, "text-background-stroke-line-dash", value.asInstanceOf[js.Any])
      
      inline def `setText-background-stroke-line-dash-offset`(value: Double): Self = StObject.set(x, "text-background-stroke-line-dash-offset", value.asInstanceOf[js.Any])
      
      inline def `setText-background-stroke-line-dash-offsetUndefined`: Self = StObject.set(x, "text-background-stroke-line-dash-offset", js.undefined)
      
      inline def `setText-background-stroke-line-dashUndefined`: Self = StObject.set(x, "text-background-stroke-line-dash", js.undefined)
      
      inline def `setText-background-stroke-line-dashVarargs`(value: Double*): Self = StObject.set(x, "text-background-stroke-line-dash", js.Array(value*))
      
      inline def `setText-background-stroke-line-join`(value: CanvasLineJoin): Self = StObject.set(x, "text-background-stroke-line-join", value.asInstanceOf[js.Any])
      
      inline def `setText-background-stroke-line-joinUndefined`: Self = StObject.set(x, "text-background-stroke-line-join", js.undefined)
      
      inline def `setText-background-stroke-miter-limit`(value: Double): Self = StObject.set(x, "text-background-stroke-miter-limit", value.asInstanceOf[js.Any])
      
      inline def `setText-background-stroke-miter-limitUndefined`: Self = StObject.set(x, "text-background-stroke-miter-limit", js.undefined)
      
      inline def `setText-background-stroke-width`(value: Double): Self = StObject.set(x, "text-background-stroke-width", value.asInstanceOf[js.Any])
      
      inline def `setText-background-stroke-widthUndefined`: Self = StObject.set(x, "text-background-stroke-width", js.undefined)
      
      inline def `setText-baseline`(value: CanvasTextBaseline): Self = StObject.set(x, "text-baseline", value.asInstanceOf[js.Any])
      
      inline def `setText-baselineUndefined`: Self = StObject.set(x, "text-baseline", js.undefined)
      
      inline def `setText-fill-color`(value: Color | ColorLike): Self = StObject.set(x, "text-fill-color", value.asInstanceOf[js.Any])
      
      inline def `setText-fill-colorUndefined`: Self = StObject.set(x, "text-fill-color", js.undefined)
      
      inline def `setText-fill-colorVarargs`(value: Double*): Self = StObject.set(x, "text-fill-color", js.Array(value*))
      
      inline def `setText-font`(value: String): Self = StObject.set(x, "text-font", value.asInstanceOf[js.Any])
      
      inline def `setText-fontUndefined`: Self = StObject.set(x, "text-font", js.undefined)
      
      inline def `setText-justify`(value: TextJustify): Self = StObject.set(x, "text-justify", value.asInstanceOf[js.Any])
      
      inline def `setText-justifyUndefined`: Self = StObject.set(x, "text-justify", js.undefined)
      
      inline def `setText-max-angle`(value: Double): Self = StObject.set(x, "text-max-angle", value.asInstanceOf[js.Any])
      
      inline def `setText-max-angleUndefined`: Self = StObject.set(x, "text-max-angle", js.undefined)
      
      inline def `setText-offset-x`(value: Double): Self = StObject.set(x, "text-offset-x", value.asInstanceOf[js.Any])
      
      inline def `setText-offset-xUndefined`: Self = StObject.set(x, "text-offset-x", js.undefined)
      
      inline def `setText-offset-y`(value: Double): Self = StObject.set(x, "text-offset-y", value.asInstanceOf[js.Any])
      
      inline def `setText-offset-yUndefined`: Self = StObject.set(x, "text-offset-y", js.undefined)
      
      inline def `setText-overflow`(value: Boolean): Self = StObject.set(x, "text-overflow", value.asInstanceOf[js.Any])
      
      inline def `setText-overflowUndefined`: Self = StObject.set(x, "text-overflow", js.undefined)
      
      inline def `setText-padding`(value: js.Array[Double]): Self = StObject.set(x, "text-padding", value.asInstanceOf[js.Any])
      
      inline def `setText-paddingUndefined`: Self = StObject.set(x, "text-padding", js.undefined)
      
      inline def `setText-paddingVarargs`(value: Double*): Self = StObject.set(x, "text-padding", js.Array(value*))
      
      inline def `setText-placement`(value: TextPlacement): Self = StObject.set(x, "text-placement", value.asInstanceOf[js.Any])
      
      inline def `setText-placementUndefined`: Self = StObject.set(x, "text-placement", js.undefined)
      
      inline def `setText-repeat`(value: Double): Self = StObject.set(x, "text-repeat", value.asInstanceOf[js.Any])
      
      inline def `setText-repeatUndefined`: Self = StObject.set(x, "text-repeat", js.undefined)
      
      inline def `setText-rotate-with-view`(value: Boolean): Self = StObject.set(x, "text-rotate-with-view", value.asInstanceOf[js.Any])
      
      inline def `setText-rotate-with-viewUndefined`: Self = StObject.set(x, "text-rotate-with-view", js.undefined)
      
      inline def `setText-rotation`(value: Double): Self = StObject.set(x, "text-rotation", value.asInstanceOf[js.Any])
      
      inline def `setText-rotationUndefined`: Self = StObject.set(x, "text-rotation", js.undefined)
      
      inline def `setText-scale`(value: Double | Size): Self = StObject.set(x, "text-scale", value.asInstanceOf[js.Any])
      
      inline def `setText-scaleUndefined`: Self = StObject.set(x, "text-scale", js.undefined)
      
      inline def `setText-scaleVarargs`(value: Double*): Self = StObject.set(x, "text-scale", js.Array(value*))
      
      inline def `setText-stroke-color`(value: Color | ColorLike): Self = StObject.set(x, "text-stroke-color", value.asInstanceOf[js.Any])
      
      inline def `setText-stroke-colorUndefined`: Self = StObject.set(x, "text-stroke-color", js.undefined)
      
      inline def `setText-stroke-colorVarargs`(value: Double*): Self = StObject.set(x, "text-stroke-color", js.Array(value*))
      
      inline def `setText-stroke-line-cap`(value: CanvasLineCap): Self = StObject.set(x, "text-stroke-line-cap", value.asInstanceOf[js.Any])
      
      inline def `setText-stroke-line-capUndefined`: Self = StObject.set(x, "text-stroke-line-cap", js.undefined)
      
      inline def `setText-stroke-line-dash`(value: js.Array[Double]): Self = StObject.set(x, "text-stroke-line-dash", value.asInstanceOf[js.Any])
      
      inline def `setText-stroke-line-dash-offset`(value: Double): Self = StObject.set(x, "text-stroke-line-dash-offset", value.asInstanceOf[js.Any])
      
      inline def `setText-stroke-line-dash-offsetUndefined`: Self = StObject.set(x, "text-stroke-line-dash-offset", js.undefined)
      
      inline def `setText-stroke-line-dashUndefined`: Self = StObject.set(x, "text-stroke-line-dash", js.undefined)
      
      inline def `setText-stroke-line-dashVarargs`(value: Double*): Self = StObject.set(x, "text-stroke-line-dash", js.Array(value*))
      
      inline def `setText-stroke-line-join`(value: CanvasLineJoin): Self = StObject.set(x, "text-stroke-line-join", value.asInstanceOf[js.Any])
      
      inline def `setText-stroke-line-joinUndefined`: Self = StObject.set(x, "text-stroke-line-join", js.undefined)
      
      inline def `setText-stroke-miter-limit`(value: Double): Self = StObject.set(x, "text-stroke-miter-limit", value.asInstanceOf[js.Any])
      
      inline def `setText-stroke-miter-limitUndefined`: Self = StObject.set(x, "text-stroke-miter-limit", js.undefined)
      
      inline def `setText-stroke-width`(value: Double): Self = StObject.set(x, "text-stroke-width", value.asInstanceOf[js.Any])
      
      inline def `setText-stroke-widthUndefined`: Self = StObject.set(x, "text-stroke-width", js.undefined)
      
      inline def `setText-value`(value: String | js.Array[String]): Self = StObject.set(x, "text-value", value.asInstanceOf[js.Any])
      
      inline def `setText-valueUndefined`: Self = StObject.set(x, "text-value", js.undefined)
      
      inline def `setText-valueVarargs`(value: String*): Self = StObject.set(x, "text-value", js.Array(value*))
    }
  }
}
