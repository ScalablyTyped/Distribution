package typings.pdfjsDist.anon

import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDivs extends StObject {
  
  var textDivs: js.Array[Text]
}
object TextDivs {
  
  inline def apply(textDivs: js.Array[Text]): TextDivs = {
    val __obj = js.Dynamic.literal(textDivs = textDivs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDivs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextDivs] (val x: Self) extends AnyVal {
    
    inline def setTextDivs(value: js.Array[Text]): Self = StObject.set(x, "textDivs", value.asInstanceOf[js.Any])
    
    inline def setTextDivsVarargs(value: Text*): Self = StObject.set(x, "textDivs", js.Array(value*))
  }
}
