package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.TextStyle")
@js.native
class TextStyle protected () extends TextStyleOptions {
  def this(style: TextStyleOptions) = this()
  var _align: java.lang.String = js.native
  var _breakWords: scala.Boolean = js.native
  var _dropShadow: scala.Boolean = js.native
  var _dropShadowAlpha: scala.Double = js.native
  var _dropShadowAngle: scala.Double = js.native
  var _dropShadowBlur: scala.Double = js.native
  var _dropShadowColor: java.lang.String | scala.Double = js.native
  var _dropShadowDistance: scala.Double = js.native
  var _fill: java.lang.String | js.Array[java.lang.String] | scala.Double | js.Array[scala.Double] | stdLib.CanvasGradient | stdLib.CanvasPattern = js.native
  var _fillGradientStops: js.Array[scala.Double] = js.native
  var _fillGradientType: scala.Double = js.native
  var _fontFamily: java.lang.String | js.Array[java.lang.String] = js.native
  var _fontSize: scala.Double | java.lang.String = js.native
  var _fontStyle: java.lang.String = js.native
  var _fontVariant: java.lang.String = js.native
  var _fontWeight: java.lang.String = js.native
  var _leading: scala.Double = js.native
  var _letterSpacing: scala.Double = js.native
  var _lineHeight: scala.Double = js.native
  var _lineJoin: java.lang.String = js.native
  var _miterLimit: scala.Double = js.native
  var _padding: scala.Double = js.native
  var _stroke: java.lang.String | scala.Double = js.native
  var _strokeThickness: scala.Double = js.native
  var _textBaseline: java.lang.String = js.native
  var _trim: scala.Boolean = js.native
  var _whiteSpace: java.lang.String = js.native
  var _wordWrap: scala.Boolean = js.native
  var _wordWrapWidth: scala.Double = js.native
  @JSName("align")
  var align_TextStyle: java.lang.String = js.native
  @JSName("breakWords")
  var breakWords_TextStyle: scala.Boolean = js.native
  @JSName("dropShadowAlpha")
  var dropShadowAlpha_TextStyle: scala.Double = js.native
  @JSName("dropShadowAngle")
  var dropShadowAngle_TextStyle: scala.Double = js.native
  @JSName("dropShadowBlur")
  var dropShadowBlur_TextStyle: scala.Double = js.native
  @JSName("dropShadowColor")
  var dropShadowColor_TextStyle: java.lang.String | scala.Double = js.native
  @JSName("dropShadowDistance")
  var dropShadowDistance_TextStyle: scala.Double = js.native
  @JSName("dropShadow")
  var dropShadow_TextStyle: scala.Boolean = js.native
  @JSName("fillGradientStops")
  var fillGradientStops_TextStyle: js.Array[scala.Double] = js.native
  @JSName("fillGradientType")
  var fillGradientType_TextStyle: scala.Double = js.native
  @JSName("fill")
  var fill_TextStyle: java.lang.String | js.Array[java.lang.String] | scala.Double | js.Array[scala.Double] | stdLib.CanvasGradient | stdLib.CanvasPattern = js.native
  @JSName("fontFamily")
  var fontFamily_TextStyle: java.lang.String | js.Array[java.lang.String] = js.native
  @JSName("fontSize")
  var fontSize_TextStyle: scala.Double | java.lang.String = js.native
  @JSName("fontStyle")
  var fontStyle_TextStyle: java.lang.String = js.native
  @JSName("fontVariant")
  var fontVariant_TextStyle: java.lang.String = js.native
  @JSName("fontWeight")
  var fontWeight_TextStyle: java.lang.String = js.native
  @JSName("leading")
  var leading_TextStyle: scala.Double = js.native
  @JSName("letterSpacing")
  var letterSpacing_TextStyle: scala.Double = js.native
  @JSName("lineHeight")
  var lineHeight_TextStyle: scala.Double = js.native
  @JSName("lineJoin")
  var lineJoin_TextStyle: java.lang.String = js.native
  @JSName("miterLimit")
  var miterLimit_TextStyle: scala.Double = js.native
  @JSName("padding")
  var padding_TextStyle: scala.Double = js.native
  @JSName("strokeThickness")
  var strokeThickness_TextStyle: scala.Double = js.native
  @JSName("stroke")
  var stroke_TextStyle: java.lang.String | scala.Double = js.native
  var styleID: scala.Double = js.native
  @JSName("textBaseline")
  var textBaseline_TextStyle: java.lang.String = js.native
  @JSName("trim")
  var trim_TextStyle: scala.Boolean = js.native
  @JSName("whiteSpace")
  var whiteSpace_TextStyle: java.lang.String = js.native
  @JSName("wordWrapWidth")
  var wordWrapWidth_TextStyle: scala.Double = js.native
  @JSName("wordWrap")
  var wordWrap_TextStyle: scala.Boolean = js.native
  def reset(): scala.Unit = js.native
  def toFontString(): java.lang.String = js.native
}

