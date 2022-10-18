package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixText extends StObject {
  
  var prefixText: String
}
object PrefixText {
  
  inline def apply(prefixText: String): PrefixText = {
    val __obj = js.Dynamic.literal(prefixText = prefixText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixText]
  }
  
  extension [Self <: PrefixText](x: Self) {
    
    inline def setPrefixText(value: String): Self = StObject.set(x, "prefixText", value.asInstanceOf[js.Any])
  }
}
