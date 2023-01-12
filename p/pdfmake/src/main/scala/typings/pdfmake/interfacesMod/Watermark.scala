package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Watermark extends StObject {
  
  /**
    * Clock-wise rotation angle of the {@link text}, with `0` being normal text
    * from left to right, and `90` being vertical text from top to bottom.
    *
    * Defaults to an angle from the bottom left to the top right depending on the page size
    * (~ `305` for A4).
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls whether the {@link text} is bold.
    *
    * Defaults to `false`.
    */
  var bold: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Color of the {@link text}.
    *
    * Supports well-known color names like `blue` or hexadecimal color strings like `#ccffcc`.
    *
    * Defaults to `black`.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the font.
    *
    * Only built-in and globally declared fonts are available, regardless of the fonts
    * installed on the system.
    *
    * Defaults to `Roboto`.
    */
  var font: js.UndefOr[String] = js.undefined
  
  /**
    * Font size in `pt`.
    *
    * Defaults to a heuristic depending on the length of {@link text} to cover most of the page.
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls whether the {@link text} is italic.
    *
    * Defaults to `false`.
    */
  var italics: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Opacity of the {@link text}.
    * Must be between 0 (fully transparent) and 1 (fully opaque).
    *
    * Defaults to `0.6`.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /** Text of the watermark. */
  var text: String
}
object Watermark {
  
  inline def apply(text: String): Watermark = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Watermark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Watermark] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
