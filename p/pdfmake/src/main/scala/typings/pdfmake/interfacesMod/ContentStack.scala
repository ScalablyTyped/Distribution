package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentStack
  extends StObject
     with ContentBase
     with _Content {
  
  var stack: js.Array[Content]
  
  /** if true, ensures that the contents of the stack are always on the same page */
  var unbreakable: js.UndefOr[Boolean] = js.undefined
}
object ContentStack {
  
  inline def apply(stack: js.Array[Content]): ContentStack = {
    val __obj = js.Dynamic.literal(stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentStack]
  }
  
  extension [Self <: ContentStack](x: Self) {
    
    inline def setStack(value: js.Array[Content]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackVarargs(value: Content*): Self = StObject.set(x, "stack", js.Array(value :_*))
    
    inline def setUnbreakable(value: Boolean): Self = StObject.set(x, "unbreakable", value.asInstanceOf[js.Any])
    
    inline def setUnbreakableUndefined: Self = StObject.set(x, "unbreakable", js.undefined)
  }
}
