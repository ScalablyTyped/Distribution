package typings.ol

import typings.ol.colorMod.Color
import typings.ol.olStrings.declutter
import typings.ol.olStrings.none
import typings.ol.olStrings.obstacle
import typings.ol.sizeMod.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleIconMod {
  
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
  @JSImport("ol/style/Icon", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default () extends Icon {
    def this(options: Options) = this()
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
  @js.native
  trait Icon
    extends typings.ol.styleImageMod.default {
    
    /**
      * @private
      * @type {IconOrigin}
      */
    /* private */ var anchorOrigin_ : Any = js.native
    
    /**
      * @private
      * @type {IconAnchorUnits}
      */
    /* private */ var anchorXUnits_ : Any = js.native
    
    /**
      * @private
      * @type {IconAnchorUnits}
      */
    /* private */ var anchorYUnits_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var anchor_ : Any = js.native
    
    /**
      * @private
      * @type {import("../color.js").Color}
      */
    /* private */ var color_ : Any = js.native
    
    /**
      * @private
      * @type {?string}
      */
    /* private */ var crossOrigin_ : Any = js.native
    
    /**
      * Get the icon color.
      * @return {import("../color.js").Color} Color.
      * @api
      */
    def getColor(): Color = js.native
    
    /**
      * Get the height of the icon (in pixels).
      * @return {number} Icon height (in pixels).
      * @api
      */
    def getHeight(): Double = js.native
    
    /**
      * Get the image URL.
      * @return {string|undefined} Image src.
      * @api
      */
    def getSrc(): js.UndefOr[String] = js.native
    
    /**
      * Get the width of the icon (in pixels).
      * @return {number} Icon width (in pixels).
      * @api
      */
    def getWidth(): Double = js.native
    
    /**
      * @type {number|undefined}
      */
    var height_ : js.UndefOr[Double] = js.native
    
    /**
      * @private
      * @type {import("./IconImage.js").default}
      */
    /* private */ var iconImage_ : Any = js.native
    
    /**
      * @private
      * @type {import("../size.js").Size|undefined}
      */
    /* private */ var imgSize_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var normalizedAnchor_ : Any = js.native
    
    /**
      * @private
      * @type {IconOrigin}
      */
    /* private */ var offsetOrigin_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var offset_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>}
      */
    /* private */ var origin_ : Any = js.native
    
    /**
      * Set the anchor point. The anchor determines the center point for the
      * symbolizer.
      *
      * @param {Array<number>} anchor Anchor.
      * @api
      */
    def setAnchor(anchor: js.Array[Double]): Unit = js.native
    
    /**
      * Set the height of the icon in pixels.
      *
      * @param {number} height The height to set.
      */
    def setHeight(height: Double): Unit = js.native
    
    /**
      * Set the width of the icon in pixels.
      *
      * @param {number} width The width to set.
      */
    def setWidth(width: Double): Unit = js.native
    
    /**
      * @private
      * @type {import("../size.js").Size}
      */
    /* private */ var size_ : Any = js.native
    
    /**
      * Set the scale of the Icon by calculating it from given width and height and the
      * width and height of the image.
      *
      * @private
      * @param {number} width The width.
      * @param {number} height The height.
      */
    /* private */ var updateScaleFromWidthAndHeight: Any = js.native
    
    /**
      * @type {number|undefined}
      */
    var width_ : js.UndefOr[Double] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.fraction
    - typings.ol.olStrings.pixels
  */
  trait IconAnchorUnits extends StObject
  object IconAnchorUnits {
    
    inline def fraction: typings.ol.olStrings.fraction = "fraction".asInstanceOf[typings.ol.olStrings.fraction]
    
    inline def pixels: typings.ol.olStrings.pixels = "pixels".asInstanceOf[typings.ol.olStrings.pixels]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.`bottom-left`
    - typings.ol.olStrings.`bottom-right`
    - typings.ol.olStrings.`top-left`
    - typings.ol.olStrings.`top-right`
  */
  trait IconOrigin extends StObject
  object IconOrigin {
    
    inline def `bottom-left`: typings.ol.olStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.ol.olStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.ol.olStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.ol.olStrings.`bottom-right`]
    
    inline def `top-left`: typings.ol.olStrings.`top-left` = "top-left".asInstanceOf[typings.ol.olStrings.`top-left`]
    
    inline def `top-right`: typings.ol.olStrings.`top-right` = "top-right".asInstanceOf[typings.ol.olStrings.`top-right`]
  }
  
  trait Options extends StObject {
    
    /**
      * Anchor. Default value is the icon center.
      */
    var anchor: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Origin of the anchor: `bottom-left`, `bottom-right`,
      * `top-left` or `top-right`.
      */
    var anchorOrigin: js.UndefOr[IconOrigin] = js.undefined
    
    /**
      * Units in which the anchor x value is
      * specified. A value of `'fraction'` indicates the x value is a fraction of the icon. A value of `'pixels'` indicates
      * the x value in pixels.
      */
    var anchorXUnits: js.UndefOr[IconAnchorUnits] = js.undefined
    
    /**
      * Units in which the anchor y value is
      * specified. A value of `'fraction'` indicates the y value is a fraction of the icon. A value of `'pixels'` indicates
      * the y value in pixels.
      */
    var anchorYUnits: js.UndefOr[IconAnchorUnits] = js.undefined
    
    /**
      * Color to tint the icon. If not specified,
      * the icon will be left as is.
      */
    var color: js.UndefOr[String | Color] = js.undefined
    
    /**
      * The `crossOrigin` attribute for loaded images. Note that you must provide a
      * `crossOrigin` value if you want to access pixel data with the Canvas renderer.
      * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
      */
    var crossOrigin: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Declutter mode.
      */
    var declutterMode: js.UndefOr[declutter | obstacle | none] = js.undefined
    
    /**
      * Displacement of the icon in pixels.
      * Positive values will shift the icon right and up.
      */
    var displacement: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The height of the icon in pixels. This can't be used together with `scale`.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Image object for the icon. If the `src` option is not provided then the
      * provided image must already be loaded. And in that case, it is required
      * to provide the size of the image, with the `imgSize` option.
      */
    var img: js.UndefOr[HTMLCanvasElement | HTMLImageElement] = js.undefined
    
    /**
      * Image size in pixels. Only required if `img` is set and `src` is not.
      * The provided `imgSize` needs to match the actual size of the image.
      */
    var imgSize: js.UndefOr[Size] = js.undefined
    
    /**
      * Offset which, together with `size` and `offsetOrigin`, defines the
      * sub-rectangle to use from the original (sprite) image.
      */
    var offset: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Origin of the offset: `bottom-left`, `bottom-right`,
      * `top-left` or `top-right`.
      */
    var offsetOrigin: js.UndefOr[IconOrigin] = js.undefined
    
    /**
      * Opacity of the icon.
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to rotate the icon with the view.
      */
    var rotateWithView: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rotation in radians (positive rotation clockwise).
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * Scale.
      */
    var scale: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * Icon size in pixels. Used together with `offset` to define the
      * sub-rectangle to use from the original (sprite) image.
      */
    var size: js.UndefOr[Size] = js.undefined
    
    /**
      * Image source URI.
      */
    var src: js.UndefOr[String] = js.undefined
    
    /**
      * The width of the icon in pixels. This can't be used together with `scale`.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: js.Array[Double]): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorOrigin(value: IconOrigin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAnchorVarargs(value: Double*): Self = StObject.set(x, "anchor", js.Array(value*))
      
      inline def setAnchorXUnits(value: IconAnchorUnits): Self = StObject.set(x, "anchorXUnits", value.asInstanceOf[js.Any])
      
      inline def setAnchorXUnitsUndefined: Self = StObject.set(x, "anchorXUnits", js.undefined)
      
      inline def setAnchorYUnits(value: IconAnchorUnits): Self = StObject.set(x, "anchorYUnits", value.asInstanceOf[js.Any])
      
      inline def setAnchorYUnitsUndefined: Self = StObject.set(x, "anchorYUnits", js.undefined)
      
      inline def setColor(value: String | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDeclutterMode(value: declutter | obstacle | none): Self = StObject.set(x, "declutterMode", value.asInstanceOf[js.Any])
      
      inline def setDeclutterModeUndefined: Self = StObject.set(x, "declutterMode", js.undefined)
      
      inline def setDisplacement(value: js.Array[Double]): Self = StObject.set(x, "displacement", value.asInstanceOf[js.Any])
      
      inline def setDisplacementUndefined: Self = StObject.set(x, "displacement", js.undefined)
      
      inline def setDisplacementVarargs(value: Double*): Self = StObject.set(x, "displacement", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImg(value: HTMLCanvasElement | HTMLImageElement): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgSize(value: Size): Self = StObject.set(x, "imgSize", value.asInstanceOf[js.Any])
      
      inline def setImgSizeUndefined: Self = StObject.set(x, "imgSize", js.undefined)
      
      inline def setImgSizeVarargs(value: Double*): Self = StObject.set(x, "imgSize", js.Array(value*))
      
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
      
      inline def setScale(value: Double | Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
