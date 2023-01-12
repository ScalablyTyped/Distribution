package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: String
  
  var textDecorationSkip: String
}
object Background {
  
  inline def apply(background: String, textDecorationSkip: String): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], textDecorationSkip = textDecorationSkip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationSkip(value: String): Self = StObject.set(x, "textDecorationSkip", value.asInstanceOf[js.Any])
  }
}
