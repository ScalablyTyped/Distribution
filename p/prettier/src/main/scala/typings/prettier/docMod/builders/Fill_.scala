package typings.prettier.docMod.builders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fill_
  extends StObject
     with DocCommand {
  
  var parts: js.Array[Doc]
  
  var `type`: typings.prettier.prettierStrings.fill
}
object Fill_ {
  
  inline def apply(parts: js.Array[Doc]): Fill_ = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[Fill_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fill_] (val x: Self) extends AnyVal {
    
    inline def setParts(value: js.Array[Doc]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: Doc*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setType(value: typings.prettier.prettierStrings.fill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
