package typings.pixiDotJs.PIXI

import typings.std.CanvasGradient
import typings.std.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.TextStyle")
@js.native
class TextStyle protected () extends TextStyleOptions {
  def this(style: TextStyleOptions) = this()
  var _align: String = js.native
  var _breakWords: Boolean = js.native
  var _dropShadow: Boolean = js.native
  var _dropShadowAlpha: Double = js.native
  var _dropShadowAngle: Double = js.native
  var _dropShadowBlur: Double = js.native
  var _dropShadowColor: String | Double = js.native
  var _dropShadowDistance: Double = js.native
  var _fill: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern = js.native
  var _fillGradientStops: js.Array[Double] = js.native
  var _fillGradientType: Double = js.native
  var _fontFamily: String | js.Array[String] = js.native
  var _fontSize: Double | String = js.native
  var _fontStyle: String = js.native
  var _fontVariant: String = js.native
  var _fontWeight: String = js.native
  var _leading: Double = js.native
  var _letterSpacing: Double = js.native
  var _lineHeight: Double = js.native
  var _lineJoin: String = js.native
  var _miterLimit: Double = js.native
  var _padding: Double = js.native
  var _stroke: String | Double = js.native
  var _strokeThickness: Double = js.native
  var _textBaseline: String = js.native
  var _trim: Boolean = js.native
  var _whiteSpace: String = js.native
  var _wordWrap: Boolean = js.native
  var _wordWrapWidth: Double = js.native
  @JSName("align")
  var align_TextStyle: String = js.native
  @JSName("breakWords")
  var breakWords_TextStyle: Boolean = js.native
  @JSName("dropShadowAlpha")
  var dropShadowAlpha_TextStyle: Double = js.native
  @JSName("dropShadowAngle")
  var dropShadowAngle_TextStyle: Double = js.native
  @JSName("dropShadowBlur")
  var dropShadowBlur_TextStyle: Double = js.native
  @JSName("dropShadowColor")
  var dropShadowColor_TextStyle: String | Double = js.native
  @JSName("dropShadowDistance")
  var dropShadowDistance_TextStyle: Double = js.native
  @JSName("dropShadow")
  var dropShadow_TextStyle: Boolean = js.native
  @JSName("fillGradientStops")
  var fillGradientStops_TextStyle: js.Array[Double] = js.native
  @JSName("fillGradientType")
  var fillGradientType_TextStyle: Double = js.native
  @JSName("fill")
  var fill_TextStyle: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern = js.native
  @JSName("fontFamily")
  var fontFamily_TextStyle: String | js.Array[String] = js.native
  @JSName("fontSize")
  var fontSize_TextStyle: Double | String = js.native
  @JSName("fontStyle")
  var fontStyle_TextStyle: String = js.native
  @JSName("fontVariant")
  var fontVariant_TextStyle: String = js.native
  @JSName("fontWeight")
  var fontWeight_TextStyle: String = js.native
  @JSName("leading")
  var leading_TextStyle: Double = js.native
  @JSName("letterSpacing")
  var letterSpacing_TextStyle: Double = js.native
  @JSName("lineHeight")
  var lineHeight_TextStyle: Double = js.native
  @JSName("lineJoin")
  var lineJoin_TextStyle: String = js.native
  @JSName("miterLimit")
  var miterLimit_TextStyle: Double = js.native
  @JSName("padding")
  var padding_TextStyle: Double = js.native
  @JSName("strokeThickness")
  var strokeThickness_TextStyle: Double = js.native
  @JSName("stroke")
  var stroke_TextStyle: String | Double = js.native
  var styleID: Double = js.native
  @JSName("textBaseline")
  var textBaseline_TextStyle: String = js.native
  @JSName("trim")
  var trim_TextStyle: Boolean = js.native
  @JSName("whiteSpace")
  var whiteSpace_TextStyle: String = js.native
  @JSName("wordWrapWidth")
  var wordWrapWidth_TextStyle: Double = js.native
  @JSName("wordWrap")
  var wordWrap_TextStyle: Boolean = js.native
  def reset(): Unit = js.native
  def toFontString(): String = js.native
}

