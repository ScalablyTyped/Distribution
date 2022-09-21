package typings.nlcst.mod

import typings.nlcst.nlcstStrings.SourceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source
  extends StObject
     with Literal {
  
  @JSName("type")
  var type_Source: SourceNode
}
object Source {
  
  inline def apply(value: Any): Source = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SourceNode")
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setType(value: SourceNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
