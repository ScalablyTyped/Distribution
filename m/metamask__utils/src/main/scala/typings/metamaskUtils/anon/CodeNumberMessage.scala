package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeNumberMessage extends StObject {
  
  var code: Double
}
object CodeNumberMessage {
  
  inline def apply(code: Double): CodeNumberMessage = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeNumberMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeNumberMessage] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
