package typings.nlcst.mod

import typings.nlcst.nlcstStrings.WhiteSpaceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhiteSpace
  extends StObject
     with Literal {
  
  @JSName("type")
  var type_WhiteSpace: WhiteSpaceNode
}
object WhiteSpace {
  
  inline def apply(value: Any): WhiteSpace = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhiteSpaceNode")
    __obj.asInstanceOf[WhiteSpace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WhiteSpace] (val x: Self) extends AnyVal {
    
    inline def setType(value: WhiteSpaceNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
