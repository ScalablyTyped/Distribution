package typings.nlcst.mod

import typings.nlcst.nlcstStrings.SentenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sentence
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_Sentence: js.Array[SentenceContent]
  
  @JSName("type")
  var type_Sentence: SentenceNode
}
object Sentence {
  
  inline def apply(children: js.Array[SentenceContent]): Sentence = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SentenceNode")
    __obj.asInstanceOf[Sentence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sentence] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[SentenceContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: SentenceContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: SentenceNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
