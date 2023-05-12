package typings.ol

import typings.ol.colorMod.Color
import typings.ol.sizeMod.Size
import typings.ol.styleCircleMod.Options
import typings.ol.styleCircleMod.default
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("./Fill.js").default} [fill] Fill style.
    * @property {number} radius Circle radius.
    * @property {import("./Stroke.js").default} [stroke] Stroke style.
    * @property {Array<number>} [displacement=[0,0]] displacement
    * @property {number|import("../size.js").Size} [scale=1] Scale. A two dimensional scale will produce an ellipse.
    * Unless two dimensional scaling is required a better result may be obtained with an appropriate setting for `radius`.
    * @property {number} [rotation=0] Rotation in radians
    * (positive rotation clockwise, meaningful only when used in conjunction with a two dimensional scale).
    * @property {boolean} [rotateWithView=false] Whether to rotate the shape with the view
    * (meaningful only when used in conjunction with a two dimensional scale).
    * @property {"declutter"|"obstacle"|"none"|undefined} [declutterMode] Declutter mode
    */
  /**
    * @classdesc
    * Set circle style for vector features.
    * @api
    */
  @JSImport("ol/style", "Circle")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Circle () extends default {
    def this(options: Options) = this()
  }
  
  /**
    * @module ol/style/Fill
    */
  /**
    * @typedef {Object} Options
    * @property {import("../color.js").Color|import("../colorlike.js").ColorLike|null} [color=null] A color, gradient or pattern.
    * See {@link module:ol/color~Color} and {@link module:ol/colorlike~ColorLike} for possible formats.
    * Default null; if null, the Canvas/renderer default black will be used.
    */
  /**
    * @classdesc
    * Set fill style for vector features.
    * @api
    */
  @JSImport("ol/style", "Fill")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Fill ()
    extends typings.ol.styleFillMod.default {
    def this(options: typings.ol.styleFillMod.Options) = this()
  }
  
  /**
    * @typedef {'fraction' | 'pixels'} IconAnchorUnits
    * Anchor unit can be either a fraction of the icon size or in pixels.
    */
  /**
    * @typedef {'bottom-left' | 'bottom-right' | 'top-left' | 'top-right'} IconOrigin
    * Icon origin. One of 'bottom-left', 'bottom-right', 'top-left', 'top-right'.
    */
  /**
    * @typedef {Object} Options
    * @property {Array<number>} [anchor=[0.5, 0.5]] Anchor. Default value is the icon center.
    * @property {IconOrigin} [anchorOrigin='top-left'] Origin of the anchor: `bottom-left`, `bottom-right`,
    * `top-left` or `top-right`.
    * @property {IconAnchorUnits} [anchorXUnits='fraction'] Units in which the anchor x value is
    * specified. A value of `'fraction'` indicates the x value is a fraction of the icon. A value of `'pixels'` indicates
    * the x value in pixels.
    * @property {IconAnchorUnits} [anchorYUnits='fraction'] Units in which the anchor y value is
    * specified. A value of `'fraction'` indicates the y value is a fraction of the icon. A value of `'pixels'` indicates
    * the y value in pixels.
    * @property {import("../color.js").Color|string} [color] Color to tint the icon. If not specified,
    * the icon will be left as is.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images. Note that you must provide a
    * `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {HTMLImageElement|HTMLCanvasElement} [img] Image object for the icon. If the `src` option is not provided then the
    * provided image must already be loaded. And in that case, it is required
    * to provide the size of the image, with the `imgSize` option.
    * @property {import("../size.js").Size} [imgSize] Image size in pixels. Only required if `img` is set and `src` is not.
    * The provided `imgSize` needs to match the actual size of the image.
    * @property {Array<number>} [displacement=[0, 0]] Displacement of the icon in pixels.
    * Positive values will shift the icon right and up.
    * @property {number} [opacity=1] Opacity of the icon.
    * @property {number} [width] The width of the icon in pixels. This can't be used together with `scale`.
    * @property {number} [height] The height of the icon in pixels. This can't be used together with `scale`.
    * @property {number|import("../size.js").Size} [scale=1] Scale.
    * @property {boolean} [rotateWithView=false] Whether to rotate the icon with the view.
    * @property {number} [rotation=0] Rotation in radians (positive rotation clockwise).
    * @property {Array<number>} [offset=[0, 0]] Offset which, together with `size` and `offsetOrigin`, defines the
    * sub-rectangle to use from the original (sprite) image.
    * @property {IconOrigin} [offsetOrigin='top-left'] Origin of the offset: `bottom-left`, `bottom-right`,
    * `top-left` or `top-right`.
    * @property {import("../size.js").Size} [size] Icon size in pixels. Used together with `offset` to define the
    * sub-rectangle to use from the original (sprite) image.
    * @property {string} [src] Image source URI.
    * @property {"declutter"|"obstacle"|"none"|undefined} [declutterMode] Declutter mode.
    */
  /**
    * @classdesc
    * Set icon style for vector features.
    * @api
    */
  @JSImport("ol/style", "Icon")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Icon ()
    extends typings.ol.styleIconMod.default {
    def this(options: typings.ol.styleIconMod.Options) = this()
  }
  
  @JSImport("ol/style", "IconImage")
  @js.native
  open class IconImage protected ()
    extends typings.ol.styleIconImageMod.default {
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: Any,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: String,
      size: Size,
      crossOrigin: Null,
      imageState: Any,
      color: Color
    ) = this()
    def this(
      image: HTMLCanvasElement,
      src: Unit,
      size: Size,
      crossOrigin: String,
      imageState: Any,
      color: Color
    ) = this()
    def this(image: HTMLCanvasElement, src: Unit, size: Size, crossOrigin: Null, imageState: Any, color: Color) = this()
    /**
      * @param {HTMLImageElement|HTMLCanvasElement} image Image.
      * @param {string|undefined} src Src.
      * @param {import("../size.js").Size} size Size.
      * @param {?string} crossOrigin Cross origin.
      * @param {import("../ImageState.js").default} imageState Image state.
      * @param {import("../color.js").Color} color Color.
      */
    def this(
      image: HTMLImageElement,
      src: String,
      size: Size,
      crossOrigin: String,
      imageState: Any,
      color: Color
    ) = this()
    def this(image: HTMLImageElement, src: String, size: Size, crossOrigin: Null, imageState: Any, color: Color) = this()
    def this(image: HTMLImageElement, src: Unit, size: Size, crossOrigin: String, imageState: Any, color: Color) = this()
    def this(image: HTMLImageElement, src: Unit, size: Size, crossOrigin: Null, imageState: Any, color: Color) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {number} opacity Opacity.
    * @property {boolean} rotateWithView If the image should get rotated with the view.
    * @property {number} rotation Rotation.
    * @property {number|import("../size.js").Size} scale Scale.
    * @property {Array<number>} displacement Displacement.
    * @property {"declutter"|"obstacle"|"none"|undefined} declutterMode Declutter mode: `declutter`, `obstacle`, 'none */
  /**
    * @classdesc
    * A base class used for creating subclasses and not instantiated in
    * apps. Base class for {@link module:ol/style/Icon~Icon}, {@link module:ol/style/Circle~CircleStyle} and
    * {@link module:ol/style/RegularShape~RegularShape}.
    * @abstract
    * @api
    */
  @JSImport("ol/style", "Image")
  @js.native
  open class Image protected ()
    extends typings.ol.styleImageMod.default {
    /**
      * @param {Options} options Options.
      */
    def this(options: typings.ol.styleImageMod.Options) = this()
  }
  
  /**
    * Specify radius for regular polygons, or radius1 and radius2 for stars.
    * @typedef {Object} Options
    * @property {import("./Fill.js").default} [fill] Fill style.
    * @property {number} points Number of points for stars and regular polygons. In case of a polygon, the number of points
    * is the number of sides.
    * @property {number} [radius] Radius of a regular polygon.
    * @property {number} [radius1] First radius of a star. Ignored if radius is set.
    * @property {number} [radius2] Second radius of a star.
    * @property {number} [angle=0] Shape's angle in radians. A value of 0 will have one of the shape's points facing up.
    * @property {Array<number>} [displacement=[0, 0]] Displacement of the shape in pixels.
    * Positive values will shift the shape right and up.
    * @property {import("./Stroke.js").default} [stroke] Stroke style.
    * @property {number} [rotation=0] Rotation in radians (positive rotation clockwise).
    * @property {boolean} [rotateWithView=false] Whether to rotate the shape with the view.
    * @property {number|import("../size.js").Size} [scale=1] Scale. Unless two dimensional scaling is required a better
    * result may be obtained with appropriate settings for `radius`, `radius1` and `radius2`.
    * @property {"declutter"|"obstacle"|"none"|undefined} [declutterMode] Declutter mode.
    */
  /**
    * @typedef {Object} RenderOptions
    * @property {import("../colorlike.js").ColorLike} [strokeStyle] StrokeStyle.
    * @property {number} strokeWidth StrokeWidth.
    * @property {number} size Size.
    * @property {Array<number>|null} lineDash LineDash.
    * @property {number} lineDashOffset LineDashOffset.
    * @property {CanvasLineJoin} lineJoin LineJoin.
    * @property {number} miterLimit MiterLimit.
    */
  /**
    * @classdesc
    * Set regular shape style for vector features. The resulting shape will be
    * a regular polygon when `radius` is provided, or a star when `radius1` and
    * `radius2` are provided.
    * @api
    */
  @JSImport("ol/style", "RegularShape")
  @js.native
  open class RegularShape protected ()
    extends typings.ol.styleRegularShapeMod.default {
    /**
      * @param {Options} options Options.
      */
    def this(options: typings.ol.styleRegularShapeMod.Options) = this()
  }
  
  /**
    * @module ol/style/Stroke
    */
  /**
    * @typedef {Object} Options
    * @property {import("../color.js").Color|import("../colorlike.js").ColorLike} [color] A color, gradient or pattern.
    * See {@link module:ol/color~Color} and {@link module:ol/colorlike~ColorLike} for possible formats.
    * Default null; if null, the Canvas/renderer default black will be used.
    * @property {CanvasLineCap} [lineCap='round'] Line cap style: `butt`, `round`, or `square`.
    * @property {CanvasLineJoin} [lineJoin='round'] Line join style: `bevel`, `round`, or `miter`.
    * @property {Array<number>} [lineDash] Line dash pattern. Default is `null` (no dash).
    * @property {number} [lineDashOffset=0] Line dash offset.
    * @property {number} [miterLimit=10] Miter limit.
    * @property {number} [width] Width.
    */
  /**
    * @classdesc
    * Set stroke style for vector features.
    * Note that the defaults given are the Canvas defaults, which will be used if
    * option is not defined. The `get` functions return whatever was entered in
    * the options; they will not return the default.
    * @api
    */
  @JSImport("ol/style", "Stroke")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Stroke ()
    extends typings.ol.styleStrokeMod.default {
    def this(options: typings.ol.styleStrokeMod.Options) = this()
  }
  
  /**
    * A function that takes an {@link module:ol/Feature~Feature} and a `{number}`
    * representing the view's resolution. The function should return a
    * {@link module:ol/style/Style~Style} or an array of them. This way e.g. a
    * vector layer can be styled. If the function returns `undefined`, the
    * feature will not be rendered.
    *
    * @typedef {function(import("../Feature.js").FeatureLike, number):(Style|Array<Style>|void)} StyleFunction
    */
  /**
    * A {@link Style}, an array of {@link Style}, or a {@link StyleFunction}.
    * @typedef {Style|Array<Style>|StyleFunction} StyleLike
    */
  /**
    * A function that takes an {@link module:ol/Feature~Feature} as argument and returns an
    * {@link module:ol/geom/Geometry~Geometry} that will be rendered and styled for the feature.
    *
    * @typedef {function(import("../Feature.js").FeatureLike):
    *     (import("../geom/Geometry.js").default|import("../render/Feature.js").default|undefined)} GeometryFunction
    */
  /**
    * Custom renderer function. Takes two arguments:
    *
    * 1. The pixel coordinates of the geometry in GeoJSON notation.
    * 2. The {@link module:ol/render~State} of the layer renderer.
    *
    * @typedef {function((import("../coordinate.js").Coordinate|Array<import("../coordinate.js").Coordinate>|Array<Array<import("../coordinate.js").Coordinate>>),import("../render.js").State): void} RenderFunction
    */
  /**
    * @typedef {Object} Options
    * @property {string|import("../geom/Geometry.js").default|GeometryFunction} [geometry] Feature property or geometry
    * or function returning a geometry to render for this style.
    * @property {import("./Fill.js").default} [fill] Fill style.
    * @property {import("./Image.js").default} [image] Image style.
    * @property {RenderFunction} [renderer] Custom renderer. When configured, `fill`, `stroke` and `image` will be
    * ignored, and the provided function will be called with each render frame for each geometry.
    * @property {RenderFunction} [hitDetectionRenderer] Custom renderer for hit detection. If provided will be used
    * in hit detection rendering.
    * @property {import("./Stroke.js").default} [stroke] Stroke style.
    * @property {import("./Text.js").default} [text] Text style.
    * @property {number} [zIndex] Z index.
    */
  /**
    * @classdesc
    * Container for vector feature rendering styles. Any changes made to the style
    * or its children through `set*()` methods will not take effect until the
    * feature or layer that uses the style is re-rendered.
    *
    * ## Feature styles
    *
    * If no style is defined, the following default style is used:
    * ```js
    *  import {Circle, Fill, Stroke, Style} from 'ol/style.js';
    *
    *  const fill = new Fill({
    *    color: 'rgba(255,255,255,0.4)',
    *  });
    *  const stroke = new Stroke({
    *    color: '#3399CC',
    *    width: 1.25,
    *  });
    *  const styles = [
    *    new Style({
    *      image: new Circle({
    *        fill: fill,
    *        stroke: stroke,
    *        radius: 5,
    *      }),
    *      fill: fill,
    *      stroke: stroke,
    *    }),
    *  ];
    * ```
    *
    * A separate editing style has the following defaults:
    * ```js
    *  import {Circle, Fill, Stroke, Style} from 'ol/style.js';
    *
    *  const styles = {};
    *  const white = [255, 255, 255, 1];
    *  const blue = [0, 153, 255, 1];
    *  const width = 3;
    *  styles['Polygon'] = [
    *    new Style({
    *      fill: new Fill({
    *        color: [255, 255, 255, 0.5],
    *      }),
    *    }),
    *  ];
    *  styles['MultiPolygon'] =
    *      styles['Polygon'];
    *  styles['LineString'] = [
    *    new Style({
    *      stroke: new Stroke({
    *        color: white,
    *        width: width + 2,
    *      }),
    *    }),
    *    new Style({
    *      stroke: new Stroke({
    *        color: blue,
    *        width: width,
    *      }),
    *    }),
    *  ];
    *  styles['MultiLineString'] = styles['LineString'];
    *
    *  styles['Circle'] = styles['Polygon'].concat(
    *    styles['LineString']
    *  );
    *
    *  styles['Point'] = [
    *    new Style({
    *      image: new Circle({
    *        radius: width * 2,
    *        fill: new Fill({
    *          color: blue,
    *        }),
    *        stroke: new Stroke({
    *          color: white,
    *          width: width / 2,
    *        }),
    *      }),
    *      zIndex: Infinity,
    *    }),
    *  ];
    *  styles['MultiPoint'] =
    *      styles['Point'];
    *  styles['GeometryCollection'] =
    *      styles['Polygon'].concat(
    *          styles['LineString'],
    *          styles['Point']
    *      );
    * ```
    *
    * @api
    */
  @JSImport("ol/style", "Style")
  @js.native
  /**
    * @param {Options} [options] Style options.
    */
  open class Style ()
    extends typings.ol.styleStyleMod.default {
    def this(options: typings.ol.styleStyleMod.Options) = this()
  }
  
  /**
    * @typedef {Object} Options
    * @property {string} [font] Font style as CSS `font` value, see:
    * https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/font. Default is `'10px sans-serif'`
    * @property {number} [maxAngle=Math.PI/4] When `placement` is set to `'line'`, allow a maximum angle between adjacent characters.
    * The expected value is in radians, and the default is 45° (`Math.PI / 4`).
    * @property {number} [offsetX=0] Horizontal text offset in pixels. A positive will shift the text right.
    * @property {number} [offsetY=0] Vertical text offset in pixels. A positive will shift the text down.
    * @property {boolean} [overflow=false] For polygon labels or when `placement` is set to `'line'`, allow text to exceed
    * the width of the polygon at the label position or the length of the path that it follows.
    * @property {TextPlacement} [placement='point'] Text placement.
    * @property {number} [repeat] Repeat interval in pixels. When set, the text will be repeated at this interval. Only available
    * when `placement` is set to `'line'`. Overrides 'textAlign'.
    * @property {number|import("../size.js").Size} [scale] Scale.
    * @property {boolean} [rotateWithView=false] Whether to rotate the text with the view.
    * @property {number} [rotation=0] Rotation in radians (positive rotation clockwise).
    * @property {string|Array<string>} [text] Text content or rich text content. For plain text provide a string, which can
    * contain line breaks (`\n`). For rich text provide an array of text/font tuples. A tuple consists of the text to
    * render and the font to use (or `''` to use the text style's font). A line break has to be a separate tuple (i.e. `'\n', ''`).
    * **Example:** `['foo', 'bold 10px sans-serif', ' bar', 'italic 10px sans-serif', ' baz', '']` will yield "**foo** *bar* baz".
    * **Note:** Rich text is not supported for the immediate rendering API.
    * @property {CanvasTextAlign} [textAlign] Text alignment. Possible values: `'left'`, `'right'`, `'center'`, `'end'` or `'start'`.
    * Default is `'center'` for `placement: 'point'`. For `placement: 'line'`, the default is to let the renderer choose a
    * placement where `maxAngle` is not exceeded.
    * @property {TextJustify} [justify] Text justification within the text box.
    * If not set, text is justified towards the `textAlign` anchor.
    * Otherwise, use options `'left'`, `'center'`, or `'right'` to justify the text within the text box.
    * **Note:** `justify` is ignored for immediate rendering and also for `placement: 'line'`.
    * @property {CanvasTextBaseline} [textBaseline='middle'] Text base line. Possible values: `'bottom'`, `'top'`, `'middle'`, `'alphabetic'`,
    * `'hanging'`, `'ideographic'`.
    * @property {import("./Fill.js").default} [fill] Fill style. If none is provided, we'll use a dark fill-style (#333).
    * @property {import("./Stroke.js").default} [stroke] Stroke style.
    * @property {import("./Fill.js").default} [backgroundFill] Fill style for the text background when `placement` is
    * `'point'`. Default is no fill.
    * @property {import("./Stroke.js").default} [backgroundStroke] Stroke style for the text background  when `placement`
    * is `'point'`. Default is no stroke.
    * @property {Array<number>} [padding=[0, 0, 0, 0]] Padding in pixels around the text for decluttering and background. The order of
    * values in the array is `[top, right, bottom, left]`.
    */
  /**
    * @classdesc
    * Set text style for vector features.
    * @api
    */
  @JSImport("ol/style", "Text")
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class Text ()
    extends typings.ol.styleTextMod.default {
    def this(options: typings.ol.styleTextMod.Options) = this()
  }
}
