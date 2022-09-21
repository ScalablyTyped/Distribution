package typings.nlcst.mod

import typings.nlcst.nlcstStrings.TextNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text
  extends StObject
     with Literal {
  
  @JSName("type")
  var type_Text: TextNode
}
object Text {
  
  inline def apply(value: Any): Text = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TextNode")
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setType(value: TextNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
