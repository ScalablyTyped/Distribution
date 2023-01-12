package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextPartialCSSProperties extends StObject {
  
  var text: PartialCSSProperties
}
object TextPartialCSSProperties {
  
  inline def apply(text: PartialCSSProperties): TextPartialCSSProperties = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPartialCSSProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextPartialCSSProperties] (val x: Self) extends AnyVal {
    
    inline def setText(value: PartialCSSProperties): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
