package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlphaColor extends StObject {
  
  var alpha: DstFactor
  
  var color: DstFactor
}
object AlphaColor {
  
  inline def apply(alpha: DstFactor, color: DstFactor): AlphaColor = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlphaColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlphaColor] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: DstFactor): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setColor(value: DstFactor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
