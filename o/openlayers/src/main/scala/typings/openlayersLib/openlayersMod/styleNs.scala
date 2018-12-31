package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "style")
@js.native
object styleNs extends js.Object {
  /**
    * Manages the creation of image atlases.
    *
    * Images added to this manager will be inserted into an atlas, which
    * will be used for rendering.
    * The `size` given in the constructor is the size for the first
    * atlas. After that, when new atlases are created, they will have
    * twice the size as the latest atlas (until `maxSize` is reached).
    *
    * If an application uses many images or very large images, it is recommended
    * to set a higher `size` value to avoid the creation of too many atlases.
    *
    * @struct
    * @api
    * @param opt_options Options.
    */
  /* tslint:disable-next-line:no-unnecessary-class */
  @js.native
  /**
    * Manages the creation of image atlases.
    *
    * Images added to this manager will be inserted into an atlas, which
    * will be used for rendering.
    * The `size` given in the constructor is the size for the first
    * atlas. After that, when new atlases are created, they will have
    * twice the size as the latest atlas (until `maxSize` is reached).
    *
    * If an application uses many images or very large images, it is recommended
    * to set a higher `size` value to avoid the creation of too many atlases.
    *
    * @struct
    * @api
    * @param opt_options Options.
    */
  class AtlasManager () extends js.Object {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.AtlasManagerOptions) = this()
  }
  
  /**
    * @classdesc
    * Set circle style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Set circle style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  class Circle () extends Image {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.CircleOptions) = this()
    /**
      * Get the fill style for the circle.
      * @return Fill style.
      * @api
      */
    def getFill(): Fill = js.native
    /**
      * Get the image used to render the circle.
      * @param pixelRatio Pixel ratio.
      * @return Canvas element.
      * @api
      */
    def getImage(pixelRatio: scala.Double): stdLib.HTMLCanvasElement = js.native
    /**
      * Get the circle radius.
      * @return Radius.
      * @api
      */
    def getRadius(): scala.Double = js.native
    /**
      * Get the stroke style for the circle.
      * @return Stroke style.
      * @api
      */
    def getStroke(): Stroke = js.native
    /**
      * Set the circle radius.
      *
      * @param radius Circle radius.
      * @api
      */
    def setRadius(radius: scala.Double): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * Set fill style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Set fill style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  class Fill () extends js.Object {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.FillOptions) = this()
    /**
      * Get the fill color.
      * @return Color.
      * @api
      */
    def getColor(): openlayersLib.openlayersMod.Color | openlayersLib.openlayersMod.ColorLike = js.native
    /**
      * Set the color.
      *
      * @param color Color.
      * @api
      */
    def setColor(color: openlayersLib.openlayersMod.Color | openlayersLib.openlayersMod.ColorLike): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * Set icon style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Set icon style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  class Icon () extends Image {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.IconOptions) = this()
    /**
      * @inheritDoc
      * @api
      */
    def getAnchor(): js.Array[scala.Double] = js.native
    /**
      * Get the image icon.
      * @param pixelRatio Pixel ratio.
      * @return Image or Canvas element.
      * @api
      */
    def getImage(pixelRatio: scala.Double): Image | stdLib.HTMLCanvasElement = js.native
    /**
      * @inheritDoc
      * @api
      */
    def getOrigin(): js.Array[scala.Double] = js.native
    /**
      * @inheritDoc
      * @api
      */
    def getSize(): openlayersLib.openlayersMod.Size = js.native
    /**
      * Get the image URL.
      * @return Image src.
      * @api
      */
    def getSrc(): java.lang.String = js.native
    /**
      * Load not yet loaded URI.
      * When rendering a feature with an icon style, the vector renderer will
      * automatically call this method. However, you might want to call this
      * method yourself for preloading or other purposes.
      * @api
      */
    def load(): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * A base class used for creating subclasses and not instantiated in
    * apps. Base class for {@link ol.style.Icon}, {@link ol.style.Circle} and
    * {@link ol.style.RegularShape}.
    *
    * @param options Options.
    * @api
    */
  @js.native
  class Image protected () extends js.Object {
    /**
      * @classdesc
      * A base class used for creating subclasses and not instantiated in
      * apps. Base class for {@link ol.style.Icon}, {@link ol.style.Circle} and
      * {@link ol.style.RegularShape}.
      *
      * @param options Options.
      * @api
      */
    def this(options: openlayersLib.openlayersMod.StyleImageOptions) = this()
    /**
      * Get the symbolizer opacity.
      * @return Opacity.
      * @api
      */
    def getOpacity(): scala.Double = js.native
    /**
      * Determine whether the symbolizer rotates with the map.
      * @return Rotate with map.
      * @api
      */
    def getRotateWithView(): scala.Boolean = js.native
    /**
      * Get the symoblizer rotation.
      * @return Rotation.
      * @api
      */
    def getRotation(): scala.Double = js.native
    /**
      * Get the symbolizer scale.
      * @return Scale.
      * @api
      */
    def getScale(): scala.Double = js.native
    /**
      * Determine whether the symbolizer should be snapped to a pixel.
      * @return The symbolizer should snap to a pixel.
      * @api
      */
    def getSnapToPixel(): scala.Boolean = js.native
    /**
      * Set the opacity.
      *
      * @param opacity Opacity.
      * @api
      */
    def setOpacity(opacity: scala.Double): scala.Unit = js.native
    /**
      * Set the rotation.
      *
      * @param rotation Rotation.
      * @api
      */
    def setRotation(rotation: scala.Double): scala.Unit = js.native
    /**
      * Set the scale.
      *
      * @param scale Scale.
      * @api
      */
    def setScale(scale: scala.Double): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * Set regular shape style for vector features. The resulting shape will be
    * a regular polygon when `radius` is provided, or a star when `radius1` and
    * `radius2` are provided.
    *
    * @param options Options.
    * @api
    */
  @js.native
  class RegularShape protected () extends Image {
    /**
      * @classdesc
      * Set regular shape style for vector features. The resulting shape will be
      * a regular polygon when `radius` is provided, or a star when `radius1` and
      * `radius2` are provided.
      *
      * @param options Options.
      * @api
      */
    def this(options: openlayersLib.openlayersMod.olxNs.styleNs.RegularShapeOptions) = this()
    /**
      * @inheritDoc
      * @api
      */
    def getAnchor(): js.Array[scala.Double] = js.native
    /**
      * Get the angle used in generating the shape.
      * @return Shape's rotation in radians.
      * @api
      */
    def getAngle(): scala.Double = js.native
    /**
      * Get the fill style for the shape.
      * @return Fill style.
      * @api
      */
    def getFill(): Fill = js.native
    /**
      * @inheritDoc
      * @api
      */
    def getImage(pixelRatio: scala.Double): stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement | Image = js.native
    /**
      * @inheritDoc
      * @api
      */
    def getOrigin(): js.Array[scala.Double] = js.native
    /**
      * Get the number of points for generating the shape.
      * @return Number of points for stars and regular polygons.
      * @api
      */
    def getPoints(): scala.Double = js.native
    /**
      * Get the (primary) radius for the shape.
      * @return Radius.
      * @api
      */
    def getRadius(): scala.Double = js.native
    /**
      * Get the secondary radius for the shape.
      * @return Radius2.
      * @api
      */
    def getRadius2(): scala.Double = js.native
    /**
      * @inheritDoc
      * @api
      */
    def getSize(): openlayersLib.openlayersMod.Size = js.native
    /**
      * Get the stroke style for the shape.
      * @return Stroke style.
      * @api
      */
    def getStroke(): Stroke = js.native
  }
  
  /**
    * @classdesc
    * Set stroke style for vector features.
    * Note that the defaults given are the Canvas defaults, which will be used if
    * option is not defined. The `get` functions return whatever was entered in
    * the options; they will not return the default.
    *
    * @param opt_options Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Set stroke style for vector features.
    * Note that the defaults given are the Canvas defaults, which will be used if
    * option is not defined. The `get` functions return whatever was entered in
    * the options; they will not return the default.
    *
    * @param opt_options Options.
    * @api
    */
  class Stroke () extends js.Object {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.StrokeOptions) = this()
    /**
      * Get the stroke color.
      * @return Color.
      * @api
      */
    def getColor(): openlayersLib.openlayersMod.Color | java.lang.String = js.native
    /**
      * Get the line cap type for the stroke.
      * @return Line cap.
      * @api
      */
    def getLineCap(): java.lang.String = js.native
    /**
      * Get the line dash style for the stroke.
      * @return Line dash.
      * @api
      */
    def getLineDash(): js.Array[scala.Double] = js.native
    /**
      * Get the line dash offset style for the stroke.
      * @return Line dash offset
      * @api
      */
    def getLineDashOffset(): scala.Double = js.native
    /**
      * Get the line join type for the stroke.
      * @return Line join.
      * @api
      */
    def getLineJoin(): java.lang.String = js.native
    /**
      * Get the miter limit for the stroke.
      * @return Miter limit.
      * @api
      */
    def getMiterLimit(): scala.Double = js.native
    /**
      * Get the stroke width.
      * @return Width.
      * @api
      */
    def getWidth(): scala.Double = js.native
    def setColor(color: java.lang.String): scala.Unit = js.native
    /**
      * Set the color.
      *
      * @param color Color.
      * @api
      */
    def setColor(color: openlayersLib.openlayersMod.Color): scala.Unit = js.native
    /**
      * Set the line cap.
      *
      * @param lineCap Line cap.
      * @api
      */
    def setLineCap(lineCap: java.lang.String): scala.Unit = js.native
    /**
      * Set the line dash.
      *
      * Please note that Internet Explorer 10 and lower [do not support][mdn] the
      * `setLineDash` method on the `CanvasRenderingContext2D` and therefore this
      * property will have no visual effect in these browsers.
      *
      * [mdn]: https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash#Browser_compatibility
      *
      * @param lineDash Line dash.
      * @api
      */
    def setLineDash(lineDash: js.Array[scala.Double]): scala.Unit = js.native
    /**
      * Set the line dash offset.
      *
      * @param lineDashOffset Line dash offset.
      * @api
      */
    def setLineDashOffset(lineDashOffset: scala.Double): scala.Unit = js.native
    /**
      * Set the line join.
      *
      * @param lineJoin Line join.
      * @api
      */
    def setLineJoin(lineJoin: java.lang.String): scala.Unit = js.native
    /**
      * Set the miter limit.
      *
      * @param miterLimit Miter limit.
      * @api
      */
    def setMiterLimit(miterLimit: scala.Double): scala.Unit = js.native
    /**
      * Set the width.
      *
      * @param width Width.
      * @api
      */
    def setWidth(width: scala.Double): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * Container for vector feature rendering styles. Any changes made to the style
    * or its children through `set*()` methods will not take effect until the
    * feature or layer that uses the style is re-rendered.
    *
    * @struct
    * @param opt_options Style options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Container for vector feature rendering styles. Any changes made to the style
    * or its children through `set*()` methods will not take effect until the
    * feature or layer that uses the style is re-rendered.
    *
    * @struct
    * @param opt_options Style options.
    * @api
    */
  class Style () extends js.Object {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.StyleOptions) = this()
    /**
      * Get the fill style.
      * @return Fill style.
      * @api
      */
    def getFill(): Fill = js.native
    /**
      * Get the geometry to be rendered.
      * @return Feature property or geometry or function that returns the geometry that will
      *     be rendered with this style.
      * @api
      */
    def getGeometry(): java.lang.String | openlayersLib.openlayersMod.geomNs.Geometry | openlayersLib.openlayersMod.StyleGeometryFunction = js.native
    /**
      * Get the function used to generate a geometry for rendering.
      * @return Function that is called with a feature
      * and returns the geometry to render instead of the feature's geometry.
      * @api
      */
    def getGeometryFunction(): openlayersLib.openlayersMod.StyleGeometryFunction = js.native
    /**
      * Get the image style.
      * @return Image style.
      * @api
      */
    def getImage(): Image = js.native
    /**
      * Get the stroke style.
      * @return Stroke style.
      * @api
      */
    def getStroke(): Stroke = js.native
    /**
      * Get the text style.
      * @return Text style.
      * @api
      */
    def getText(): Text = js.native
    /**
      * Get the z-index for the style.
      * @return ZIndex.
      * @api
      */
    def getZIndex(): scala.Double = js.native
    /**
      * Set the fill style.
      * @param fill Fill style.
      * @api
      */
    def setFill(fill: Fill): scala.Unit = js.native
    /**
      * Set a geometry that is rendered instead of the feature's geometry.
      *
      * @param geometry
      *     Feature property or geometry or function returning a geometry to render
      *     for this style.
      * @api
      */
    def setGeometry(geometry: java.lang.String): scala.Unit = js.native
    def setGeometry(geometry: openlayersLib.openlayersMod.StyleGeometryFunction): scala.Unit = js.native
    def setGeometry(geometry: openlayersLib.openlayersMod.geomNs.Geometry): scala.Unit = js.native
    /**
      * Set the image style.
      * @param image Image style.
      * @api
      */
    def setImage(image: Image): scala.Unit = js.native
    /**
      * Set the stroke style.
      * @param stroke Stroke style.
      * @api
      */
    def setStroke(stroke: Stroke): scala.Unit = js.native
    /**
      * Set the text style.
      * @param text Text style.
      * @api
      */
    def setText(text: Text): scala.Unit = js.native
    /**
      * Set the z-index.
      *
      * @param zIndex ZIndex.
      * @api
      */
    def setZIndex(zIndex: scala.Double): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * Set text style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Set text style for vector features.
    *
    * @param opt_options Options.
    * @api
    */
  class Text () extends js.Object {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.styleNs.TextOptions) = this()
    /**
      * Get the fill style for the text.
      * @return Fill style.
      * @api
      */
    def getFill(): Fill = js.native
    /**
      * Get the font name.
      * @return Font.
      * @api
      */
    def getFont(): java.lang.String = js.native
    /**
      * Get the x-offset for the text.
      * @return Horizontal text offset.
      * @api
      */
    def getOffsetX(): scala.Double = js.native
    /**
      * Get the y-offset for the text.
      * @return Vertical text offset.
      * @api
      */
    def getOffsetY(): scala.Double = js.native
    /**
      * Determine whether the text rotates with the map.
      * @return Rotate with map.
      * @api
      */
    def getRotateWithView(): scala.Boolean = js.native
    /**
      * Get the text rotation.
      * @return Rotation.
      * @api
      */
    def getRotation(): scala.Double = js.native
    /**
      * Get the text scale.
      * @return Scale.
      * @api
      */
    def getScale(): scala.Double = js.native
    /**
      * Get the stroke style for the text.
      * @return Stroke style.
      * @api
      */
    def getStroke(): Stroke = js.native
    /**
      * Get the text to be rendered.
      * @return Text.
      * @api
      */
    def getText(): java.lang.String = js.native
    /**
      * Get the text alignment.
      * @return Text align.
      * @api
      */
    def getTextAlign(): java.lang.String = js.native
    /**
      * Get the text baseline.
      * @return Text baseline.
      * @api
      */
    def getTextBaseline(): java.lang.String = js.native
    /**
      * Set the fill.
      *
      * @param fill Fill style.
      * @api
      */
    def setFill(fill: Fill): scala.Unit = js.native
    /**
      * Set the font.
      *
      * @param font Font.
      * @api
      */
    def setFont(font: java.lang.String): scala.Unit = js.native
    /**
      * Set the x offset.
      *
      * @param offsetX Horizontal text offset.
      * @api
      */
    def setOffsetX(offsetX: scala.Double): scala.Unit = js.native
    /**
      * Set the y offset.
      *
      * @param offsetY Vertical text offset.
      * @api
      */
    def setOffsetY(offsetY: scala.Double): scala.Unit = js.native
    /**
      * Set the rotation.
      *
      * @param rotation Rotation.
      * @api
      */
    def setRotation(rotation: scala.Double): scala.Unit = js.native
    /**
      * Set the scale.
      *
      * @param scale Scale.
      * @api
      */
    def setScale(scale: scala.Double): scala.Unit = js.native
    /**
      * Set the stroke.
      *
      * @param stroke Stroke style.
      * @api
      */
    def setStroke(stroke: Stroke): scala.Unit = js.native
    /**
      * Set the text.
      *
      * @param text Text.
      * @api
      */
    def setText(text: java.lang.String): scala.Unit = js.native
    /**
      * Set the text alignment.
      *
      * @param textAlign Text align.
      * @api
      */
    def setTextAlign(textAlign: java.lang.String): scala.Unit = js.native
    /**
      * Set the text baseline.
      *
      * @param textBaseline Text baseline.
      * @api
      */
    def setTextBaseline(textBaseline: java.lang.String): scala.Unit = js.native
  }
  
  /**
    * Icon anchor units. One of 'fraction', 'pixels'.
    */
  type IconAnchorUnits = openlayersLib.openlayersLibStrings.fraction | openlayersLib.openlayersLibStrings.pixels
  /**
    * Icon origin. One of 'bottom-left', 'bottom-right', 'top-left', 'top-right'.
    */
  type IconOrigin = openlayersLib.openlayersLibStrings.`bottom-left` | openlayersLib.openlayersLibStrings.`bottom-right` | openlayersLib.openlayersLibStrings.`top-left` | openlayersLib.openlayersLibStrings.`top-right`
}

