package typings.ol

import typings.ol.olStrings.point_
import typings.ol.sizeMod.Size
import typings.std.CanvasTextAlign
import typings.std.CanvasTextBaseline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleTextMod {
  
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
  @JSImport("ol/style/Text", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default ()
    extends StObject
       with Text {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Fill style for the text background when `placement` is
      * `'point'`. Default is no fill.
      */
    var backgroundFill: js.UndefOr[typings.ol.styleFillMod.default] = js.undefined
    
    /**
      * Stroke style for the text background  when `placement`
      * is `'point'`. Default is no stroke.
      */
    var backgroundStroke: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
    
    /**
      * Fill style. If none is provided, we'll use a dark fill-style (#333).
      */
    var fill: js.UndefOr[typings.ol.styleFillMod.default] = js.undefined
    
    /**
      * Font style as CSS `font` value, see:
      * https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/font. Default is `'10px sans-serif'`
      */
    var font: js.UndefOr[String] = js.undefined
    
    /**
      * Text justification within the text box.
      * If not set, text is justified towards the `textAlign` anchor.
      * Otherwise, use options `'left'`, `'center'`, or `'right'` to justify the text within the text box.
      * **Note:** `justify` is ignored for immediate rendering and also for `placement: 'line'`.
      */
    var justify: js.UndefOr[TextJustify] = js.undefined
    
    /**
      * When `placement` is set to `'line'`, allow a maximum angle between adjacent characters.
      * The expected value is in radians, and the default is 45° (`Math.PI / 4`).
      */
    var maxAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * Horizontal text offset in pixels. A positive will shift the text right.
      */
    var offsetX: js.UndefOr[Double] = js.undefined
    
    /**
      * Vertical text offset in pixels. A positive will shift the text down.
      */
    var offsetY: js.UndefOr[Double] = js.undefined
    
    /**
      * For polygon labels or when `placement` is set to `'line'`, allow text to exceed
      * the width of the polygon at the label position or the length of the path that it follows.
      */
    var overflow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Padding in pixels around the text for decluttering and background. The order of
      * values in the array is `[top, right, bottom, left]`.
      */
    var padding: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Text placement.
      */
    var placement: js.UndefOr[TextPlacement] = js.undefined
    
    /**
      * Repeat interval in pixels. When set, the text will be repeated at this interval. Only available
      * when `placement` is set to `'line'`. Overrides 'textAlign'.
      */
    var repeat: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to rotate the text with the view.
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
      * Stroke style.
      */
    var stroke: js.UndefOr[typings.ol.styleStrokeMod.default] = js.undefined
    
    /**
      * Text content or rich text content. For plain text provide a string, which can
      * contain line breaks (`\n`). For rich text provide an array of text/font tuples. A tuple consists of the text to
      * render and the font to use (or `''` to use the text style's font). A line break has to be a separate tuple (i.e. `'\n', ''`).
      * **Example:** `['foo', 'bold 10px sans-serif', ' bar', 'italic 10px sans-serif', ' baz', '']` will yield "**foo** *bar* baz".
      * **Note:** Rich text is not supported for the immediate rendering API.
      */
    var text: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Text alignment. Possible values: `'left'`, `'right'`, `'center'`, `'end'` or `'start'`.
      * Default is `'center'` for `placement: 'point'`. For `placement: 'line'`, the default is to let the renderer choose a
      * placement where `maxAngle` is not exceeded.
      */
    var textAlign: js.UndefOr[CanvasTextAlign] = js.undefined
    
    /**
      * Text base line. Possible values: `'bottom'`, `'top'`, `'middle'`, `'alphabetic'`,
      * `'hanging'`, `'ideographic'`.
      */
    var textBaseline: js.UndefOr[CanvasTextBaseline] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBackgroundFill(value: typings.ol.styleFillMod.default): Self = StObject.set(x, "backgroundFill", value.asInstanceOf[js.Any])
      
      inline def setBackgroundFillUndefined: Self = StObject.set(x, "backgroundFill", js.undefined)
      
      inline def setBackgroundStroke(value: typings.ol.styleStrokeMod.default): Self = StObject.set(x, "backgroundStroke", value.asInstanceOf[js.Any])
      
      inline def setBackgroundStrokeUndefined: Self = StObject.set(x, "backgroundStroke", js.undefined)
      
      inline def setFill(value: typings.ol.styleFillMod.default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setJustify(value: TextJustify): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      inline def setMaxAngle(value: Double): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
      
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
      
      inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      inline def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Double | Size): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleVarargs(value: Double*): Self = StObject.set(x, "scale", js.Array(value*))
      
      inline def setStroke(value: typings.ol.styleStrokeMod.default): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setText(value: String | js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(value: CanvasTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextBaseline(value: CanvasTextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    }
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
  @js.native
  trait Text extends StObject {
    
    /**
      * @private
      * @type {import("./Fill.js").default}
      */
    /* private */ var backgroundFill_ : Any = js.native
    
    /**
      * @private
      * @type {import("./Stroke.js").default}
      */
    /* private */ var backgroundStroke_ : Any = js.native
    
    /**
      * @private
      * @type {import("./Fill.js").default}
      */
    /* private */ var fill_ : Any = js.native
    
    /**
      * @private
      * @type {string|undefined}
      */
    /* private */ var font_ : Any = js.native
    
    /**
      * Get the background fill style for the text.
      * @return {import("./Fill.js").default} Fill style.
      * @api
      */
    def getBackgroundFill(): typings.ol.styleFillMod.default = js.native
    
    /**
      * Get the background stroke style for the text.
      * @return {import("./Stroke.js").default} Stroke style.
      * @api
      */
    def getBackgroundStroke(): typings.ol.styleStrokeMod.default = js.native
    
    /**
      * Get the fill style for the text.
      * @return {import("./Fill.js").default} Fill style.
      * @api
      */
    def getFill(): typings.ol.styleFillMod.default = js.native
    
    /**
      * Get the font name.
      * @return {string|undefined} Font.
      * @api
      */
    def getFont(): js.UndefOr[String] = js.native
    
    /**
      * Get the justification.
      * @return {TextJustify|undefined} Justification.
      * @api
      */
    def getJustify(): js.UndefOr[TextJustify] = js.native
    
    /**
      * Get the maximum angle between adjacent characters.
      * @return {number} Angle in radians.
      * @api
      */
    def getMaxAngle(): Double = js.native
    
    /**
      * Get the x-offset for the text.
      * @return {number} Horizontal text offset.
      * @api
      */
    def getOffsetX(): Double = js.native
    
    /**
      * Get the y-offset for the text.
      * @return {number} Vertical text offset.
      * @api
      */
    def getOffsetY(): Double = js.native
    
    /**
      * Get the `overflow` configuration.
      * @return {boolean} Let text overflow the length of the path they follow.
      * @api
      */
    def getOverflow(): Boolean = js.native
    
    /**
      * Get the padding for the text.
      * @return {Array<number>|null} Padding.
      * @api
      */
    def getPadding(): js.Array[Double] | Null = js.native
    
    /**
      * Get the label placement.
      * @return {TextPlacement} Text placement.
      * @api
      */
    def getPlacement(): TextPlacement = js.native
    
    /**
      * Get the repeat interval of the text.
      * @return {number|undefined} Repeat interval in pixels.
      * @api
      */
    def getRepeat(): js.UndefOr[Double] = js.native
    
    /**
      * Determine whether the text rotates with the map.
      * @return {boolean|undefined} Rotate with map.
      * @api
      */
    def getRotateWithView(): js.UndefOr[Boolean] = js.native
    
    /**
      * Get the text rotation.
      * @return {number|undefined} Rotation.
      * @api
      */
    def getRotation(): js.UndefOr[Double] = js.native
    
    /**
      * Get the text scale.
      * @return {number|import("../size.js").Size|undefined} Scale.
      * @api
      */
    def getScale(): js.UndefOr[Double | Size] = js.native
    
    /**
      * Get the symbolizer scale array.
      * @return {import("../size.js").Size} Scale array.
      */
    def getScaleArray(): Size = js.native
    
    /**
      * Get the stroke style for the text.
      * @return {import("./Stroke.js").default} Stroke style.
      * @api
      */
    def getStroke(): typings.ol.styleStrokeMod.default = js.native
    
    /**
      * Get the text to be rendered.
      * @return {string|Array<string>|undefined} Text.
      * @api
      */
    def getText(): js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Get the text alignment.
      * @return {CanvasTextAlign|undefined} Text align.
      * @api
      */
    def getTextAlign(): js.UndefOr[CanvasTextAlign] = js.native
    
    /**
      * Get the text baseline.
      * @return {CanvasTextBaseline|undefined} Text baseline.
      * @api
      */
    def getTextBaseline(): js.UndefOr[CanvasTextBaseline] = js.native
    
    /**
      * @private
      * @type {TextJustify|undefined}
      */
    /* private */ var justify_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var maxAngle_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var offsetX_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var offsetY_ : Any = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var overflow_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>|null}
      */
    /* private */ var padding_ : Any = js.native
    
    /**
      * @private
      * @type {TextPlacement}
      */
    /* private */ var placement_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var repeat_ : Any = js.native
    
    /**
      * @private
      * @type {boolean|undefined}
      */
    /* private */ var rotateWithView_ : Any = js.native
    
    /**
      * @private
      * @type {number|undefined}
      */
    /* private */ var rotation_ : Any = js.native
    
    /**
      * @private
      * @type {import("../size.js").Size}
      */
    /* private */ var scaleArray_ : Any = js.native
    
    /**
      * @private
      * @type {number|import("../size.js").Size|undefined}
      */
    /* private */ var scale_ : Any = js.native
    
    /**
      * Set the background fill.
      *
      * @param {import("./Fill.js").default} fill Fill style.
      * @api
      */
    def setBackgroundFill(fill: typings.ol.styleFillMod.default): Unit = js.native
    
    /**
      * Set the background stroke.
      *
      * @param {import("./Stroke.js").default} stroke Stroke style.
      * @api
      */
    def setBackgroundStroke(stroke: typings.ol.styleStrokeMod.default): Unit = js.native
    
    /**
      * Set the fill.
      *
      * @param {import("./Fill.js").default} fill Fill style.
      * @api
      */
    def setFill(fill: typings.ol.styleFillMod.default): Unit = js.native
    
    /**
      * Set the font.
      *
      * @param {string|undefined} font Font.
      * @api
      */
    def setFont(): Unit = js.native
    def setFont(font: String): Unit = js.native
    
    /**
      * Set the justification.
      *
      * @param {TextJustify|undefined} justify Justification.
      * @api
      */
    def setJustify(): Unit = js.native
    def setJustify(justify: TextJustify): Unit = js.native
    
    /**
      * Set the maximum angle between adjacent characters.
      *
      * @param {number} maxAngle Angle in radians.
      * @api
      */
    def setMaxAngle(maxAngle: Double): Unit = js.native
    
    /**
      * Set the x offset.
      *
      * @param {number} offsetX Horizontal text offset.
      * @api
      */
    def setOffsetX(offsetX: Double): Unit = js.native
    
    /**
      * Set the y offset.
      *
      * @param {number} offsetY Vertical text offset.
      * @api
      */
    def setOffsetY(offsetY: Double): Unit = js.native
    
    /**
      * Set the `overflow` property.
      *
      * @param {boolean} overflow Let text overflow the path that it follows.
      * @api
      */
    def setOverflow(overflow: Boolean): Unit = js.native
    
    /**
      * Set the padding (`[top, right, bottom, left]`).
      *
      * @param {Array<number>|null} padding Padding.
      * @api
      */
    def setPadding(): Unit = js.native
    def setPadding(padding: js.Array[Double]): Unit = js.native
    
    /**
      * Set the text placement.
      *
      * @param {TextPlacement} placement Placement.
      * @api
      */
    def setPlacement(placement: TextPlacement): Unit = js.native
    
    /**
      * Set the repeat interval of the text.
      * @param {number|undefined} [repeat] Repeat interval in pixels.
      * @api
      */
    def setRepeat(): Unit = js.native
    def setRepeat(repeat: Double): Unit = js.native
    
    /**
      * Set whether to rotate the text with the view.
      *
      * @param {boolean} rotateWithView Rotate with map.
      * @api
      */
    def setRotateWithView(rotateWithView: Boolean): Unit = js.native
    
    /**
      * Set the rotation.
      *
      * @param {number|undefined} rotation Rotation.
      * @api
      */
    def setRotation(): Unit = js.native
    def setRotation(rotation: Double): Unit = js.native
    
    /**
      * Set the scale.
      *
      * @param {number|import("../size.js").Size|undefined} scale Scale.
      * @api
      */
    def setScale(): Unit = js.native
    def setScale(scale: Double): Unit = js.native
    def setScale(scale: Size): Unit = js.native
    
    /**
      * Set the stroke.
      *
      * @param {import("./Stroke.js").default} stroke Stroke style.
      * @api
      */
    def setStroke(stroke: typings.ol.styleStrokeMod.default): Unit = js.native
    
    /**
      * Set the text.
      *
      * @param {string|Array<string>|undefined} text Text.
      * @api
      */
    def setText(): Unit = js.native
    def setText(text: String): Unit = js.native
    def setText(text: js.Array[String]): Unit = js.native
    
    /**
      * Set the text alignment.
      *
      * @param {CanvasTextAlign|undefined} textAlign Text align.
      * @api
      */
    def setTextAlign(): Unit = js.native
    def setTextAlign(textAlign: CanvasTextAlign): Unit = js.native
    
    /**
      * Set the text baseline.
      *
      * @param {CanvasTextBaseline|undefined} textBaseline Text baseline.
      * @api
      */
    def setTextBaseline(): Unit = js.native
    def setTextBaseline(textBaseline: CanvasTextBaseline): Unit = js.native
    
    /**
      * @private
      * @type {import("./Stroke.js").default}
      */
    /* private */ var stroke_ : Any = js.native
    
    /**
      * @private
      * @type {CanvasTextAlign|undefined}
      */
    /* private */ var textAlign_ : Any = js.native
    
    /**
      * @private
      * @type {CanvasTextBaseline|undefined}
      */
    /* private */ var textBaseline_ : Any = js.native
    
    /**
      * @private
      * @type {string|Array<string>|undefined}
      */
    /* private */ var text_ : Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.left
    - typings.ol.olStrings.center
    - typings.ol.olStrings.right
  */
  trait TextJustify extends StObject
  object TextJustify {
    
    inline def center: typings.ol.olStrings.center = "center".asInstanceOf[typings.ol.olStrings.center]
    
    inline def left: typings.ol.olStrings.left = "left".asInstanceOf[typings.ol.olStrings.left]
    
    inline def right: typings.ol.olStrings.right = "right".asInstanceOf[typings.ol.olStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.point_
    - typings.ol.olStrings.line
  */
  trait TextPlacement extends StObject
  object TextPlacement {
    
    inline def line: typings.ol.olStrings.line = "line".asInstanceOf[typings.ol.olStrings.line]
    
    inline def point: point_ = "point".asInstanceOf[point_]
  }
}
