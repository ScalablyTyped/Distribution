package typings.ol

import typings.ol.colorMod.Color
import typings.ol.colorlikeMod.ColorLike
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleStrokeMod {
  
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
  @JSImport("ol/style/Stroke", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default ()
    extends StObject
       with Stroke {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * A color, gradient or pattern.
      * See {@link module :ol/color~Color} and {@link module :ol/colorlike~ColorLike} for possible formats.
      * Default null; if null, the Canvas/renderer default black will be used.
      */
    var color: js.UndefOr[Color | ColorLike] = js.undefined
    
    /**
      * Line cap style: `butt`, `round`, or `square`.
      */
    var lineCap: js.UndefOr[CanvasLineCap] = js.undefined
    
    /**
      * Line dash pattern. Default is `null` (no dash).
      */
    var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Line dash offset.
      */
    var lineDashOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Line join style: `bevel`, `round`, or `miter`.
      */
    var lineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
    
    /**
      * Miter limit.
      */
    var miterLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Width.
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
      
      inline def setColor(value: Color | ColorLike): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setLineCap(value: CanvasLineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
      
      inline def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
      
      inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value*))
      
      inline def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
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
  @js.native
  trait Stroke extends StObject {
    
    /**
      * @private
      * @type {import("../color.js").Color|import("../colorlike.js").ColorLike}
      */
    /* private */ var color_ : Any = js.native
    
    /**
      * Get the stroke color.
      * @return {import("../color.js").Color|import("../colorlike.js").ColorLike} Color.
      * @api
      */
    def getColor(): Color | ColorLike = js.native
    
    /**
      * Get the line cap type for the stroke.
      * @return {CanvasLineCap|undefined} Line cap.
      * @api
      */
    def getLineCap(): js.UndefOr[CanvasLineCap] = js.native
    
    /**
      * Get the line dash style for the stroke.
      * @return {Array<number>|null} Line dash.
      * @api
      */
    def getLineDash(): js.Array[Double] | Null = js.native
    
    /**
      * Get the line dash offset for the stroke.
      * @return {number|undefined} Line dash offset.
      * @api
      */
    def getLineDashOffset(): js.UndefOr[Double] = js.native
    
    /**
      * Get the line join type for the stroke.
      * @return {CanvasLineJoin|undefined} Line join.
      * @api
      */
    def getLineJoin(): js.UndefOr[CanvasLineJoin] = js.native
    
    /**
      * Get the miter limit for the stroke.
      * @return {number|undefined} Miter limit.
      * @api
      */
    def getMiterLimit(): js.UndefOr[Double] = js.native
    
    /**
      * Get the stroke width.
      * @return {number|undefined} Width.
      * @api
      */
    def getWidth(): js.UndefOr[Double] = js.native
    
    /**
      * @private
      * @type {CanvasLineCap|undefined}
      */
    /* private */ var lineCap_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var lineDashOffset_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>|null}
      */
    /* private */ var lineDash_ : Any = js.native
    
    /**
      * @private
      * @type {CanvasLineJoin|undefined}
      */
    /* private */ var lineJoin_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var miterLimit_ : Any = js.native
    
    /**
      * Set the color.
      *
      * @param {import("../color.js").Color|import("../colorlike.js").ColorLike} color Color.
      * @api
      */
    def setColor(color: Color): Unit = js.native
    def setColor(color: ColorLike): Unit = js.native
    
    /**
      * Set the line cap.
      *
      * @param {CanvasLineCap|undefined} lineCap Line cap.
      * @api
      */
    def setLineCap(): Unit = js.native
    def setLineCap(lineCap: CanvasLineCap): Unit = js.native
    
    /**
      * Set the line dash.
      *
      * @param {Array<number>|null} lineDash Line dash.
      * @api
      */
    def setLineDash(): Unit = js.native
    def setLineDash(lineDash: js.Array[Double]): Unit = js.native
    
    /**
      * Set the line dash offset.
      *
      * @param {number|undefined} lineDashOffset Line dash offset.
      * @api
      */
    def setLineDashOffset(): Unit = js.native
    def setLineDashOffset(lineDashOffset: Double): Unit = js.native
    
    /**
      * Set the line join.
      *
      * @param {CanvasLineJoin|undefined} lineJoin Line join.
      * @api
      */
    def setLineJoin(): Unit = js.native
    def setLineJoin(lineJoin: CanvasLineJoin): Unit = js.native
    
    /**
      * Set the miter limit.
      *
      * @param {number|undefined} miterLimit Miter limit.
      * @api
      */
    def setMiterLimit(): Unit = js.native
    def setMiterLimit(miterLimit: Double): Unit = js.native
    
    /**
      * Set the width.
      *
      * @param {number|undefined} width Width.
      * @api
      */
    def setWidth(): Unit = js.native
    def setWidth(width: Double): Unit = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var width_ : Any = js.native
  }
}
