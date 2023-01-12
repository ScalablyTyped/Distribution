package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialFont
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentValue extends StObject {
  
  /**
    * Sets the font of the current value label text.
    */
  var font: PartialFont
  
  /**
    * The amount of space, in pixels, between the current value label
    * and the slider.
    */
  var offset: Double
  
  /**
    * When currentvalue.visible is true, this sets the prefix of the label.
    */
  var prefix: String
  
  /**
    * When currentvalue.visible is true, this sets the suffix of the label.
    */
  var suffix: String
  
  /**
    * Shows the currently-selected value above the slider.
    */
  var visible: Boolean
  
  /**
    * The alignment of the value readout relative to the length of the slider.
    */
  var xanchor: left | center | right
}
object CurrentValue {
  
  inline def apply(
    font: PartialFont,
    offset: Double,
    prefix: String,
    suffix: String,
    visible: Boolean,
    xanchor: left | center | right
  ): CurrentValue = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentValue] (val x: Self) extends AnyVal {
    
    inline def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setXanchor(value: left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
  }
}
