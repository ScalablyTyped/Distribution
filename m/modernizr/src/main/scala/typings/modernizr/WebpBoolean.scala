package typings.modernizr

import typings.std.Boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpBoolean
  extends StObject
     with Boolean {
  
  var alpha: scala.Boolean
  
  var animation: scala.Boolean
  
  var lossless: scala.Boolean
}
object WebpBoolean {
  
  inline def apply(alpha: scala.Boolean, animation: scala.Boolean, lossless: scala.Boolean): WebpBoolean = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], lossless = lossless.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebpBoolean] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: scala.Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAnimation(value: scala.Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setLossless(value: scala.Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
  }
}
