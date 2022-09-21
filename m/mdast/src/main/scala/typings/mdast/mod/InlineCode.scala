package typings.mdast.mod

import typings.mdast.mdastStrings.inlineCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineCode
  extends StObject
     with Literal {
  
  @JSName("type")
  var type_InlineCode: inlineCode
}
object InlineCode {
  
  inline def apply(value: Any): InlineCode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("inlineCode")
    __obj.asInstanceOf[InlineCode]
  }
  
  extension [Self <: InlineCode](x: Self) {
    
    inline def setType(value: inlineCode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
