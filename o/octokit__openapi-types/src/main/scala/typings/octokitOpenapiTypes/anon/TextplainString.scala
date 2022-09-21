package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextplainString extends StObject {
  
  @JSName("text/plain")
  var textSlashplain: String
}
object TextplainString {
  
  inline def apply(textSlashplain: String): TextplainString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text/plain")(textSlashplain.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextplainString]
  }
  
  extension [Self <: TextplainString](x: Self) {
    
    inline def setTextSlashplain(value: String): Self = StObject.set(x, "text/plain", value.asInstanceOf[js.Any])
  }
}
