package typings.nlcst.mod

import typings.nlcst.nlcstStrings.WordNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Word
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_Word: js.Array[WordContent]
  
  @JSName("type")
  var type_Word: WordNode
}
object Word {
  
  inline def apply(children: js.Array[WordContent]): Word = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WordNode")
    __obj.asInstanceOf[Word]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Word] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[WordContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: WordContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: WordNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
