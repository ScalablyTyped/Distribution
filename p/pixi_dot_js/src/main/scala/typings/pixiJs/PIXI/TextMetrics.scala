package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The TextMetrics object represents the measurement of a block of text with a specified style.
  *
  * ```js
  * let style = new PIXI.TextStyle({fontFamily : 'Arial', fontSize: 24, fill : 0xff1010, align : 'center'})
  * let textMetrics = PIXI.TextMetrics.measureText('Your text', style)
  * ```
  *
  * @class
  * @memberof PIXI
  */
trait TextMetrics extends StObject {
  
  /**
    * The font properties object from TextMetrics.measureFont
    *
    * @member {PIXI.IFontMetrics} PIXI.TextMetrics#fontProperties
    */
  var fontProperties: IFontMetrics
  
  /**
    * The measured height of the text
    *
    * @member {number} PIXI.TextMetrics#height
    */
  var height: Double
  
  /**
    * The measured line height for this style
    *
    * @member {number} PIXI.TextMetrics#lineHeight
    */
  var lineHeight: Double
  
  /**
    * An array of the line widths for each line matched to `lines`
    *
    * @member {number[]} PIXI.TextMetrics#lineWidths
    */
  var lineWidths: js.Array[Double]
  
  /**
    * An array of lines of the text broken by new lines and wrapping is specified in style
    *
    * @member {string[]} PIXI.TextMetrics#lines
    */
  var lines: js.Array[String]
  
  /**
    * The maximum line width for all measured lines
    *
    * @member {number} PIXI.TextMetrics#maxLineWidth
    */
  var maxLineWidth: Double
  
  /**
    * The style that was measured
    *
    * @member {PIXI.TextStyle} PIXI.TextMetrics#style
    */
  var style: TextStyle
  
  /**
    * The text that was measured
    *
    * @member {string} PIXI.TextMetrics#text
    */
  var text: String
  
  /**
    * The measured width of the text
    *
    * @member {number} PIXI.TextMetrics#width
    */
  var width: Double
}
object TextMetrics {
  
  inline def apply(
    fontProperties: IFontMetrics,
    height: Double,
    lineHeight: Double,
    lineWidths: js.Array[Double],
    lines: js.Array[String],
    maxLineWidth: Double,
    style: TextStyle,
    text: String,
    width: Double
  ): TextMetrics = {
    val __obj = js.Dynamic.literal(fontProperties = fontProperties.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineWidths = lineWidths.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], maxLineWidth = maxLineWidth.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetrics]
  }
  
  extension [Self <: TextMetrics](x: Self) {
    
    inline def setFontProperties(value: IFontMetrics): Self = StObject.set(x, "fontProperties", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineWidths(value: js.Array[Double]): Self = StObject.set(x, "lineWidths", value.asInstanceOf[js.Any])
    
    inline def setLineWidthsVarargs(value: Double*): Self = StObject.set(x, "lineWidths", js.Array(value :_*))
    
    inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    inline def setMaxLineWidth(value: Double): Self = StObject.set(x, "maxLineWidth", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
