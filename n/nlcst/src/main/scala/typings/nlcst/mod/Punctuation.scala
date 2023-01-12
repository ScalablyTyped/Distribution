package typings.nlcst.mod

import typings.nlcst.nlcstStrings.PunctuationNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Punctuation
  extends StObject
     with Literal {
  
  @JSName("type")
  var type_Punctuation: PunctuationNode
}
object Punctuation {
  
  inline def apply(value: Any): Punctuation = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PunctuationNode")
    __obj.asInstanceOf[Punctuation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Punctuation] (val x: Self) extends AnyVal {
    
    inline def setType(value: PunctuationNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
