package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flow extends StObject {
  
  var flow: Parser[Any]
}
object Flow {
  
  inline def apply(flow: Parser[Any]): Flow = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Flow] (val x: Self) extends AnyVal {
    
    inline def setFlow(value: Parser[Any]): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
  }
}
