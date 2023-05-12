package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assert extends StObject {
  
  var assert: js.Object
}
object Assert {
  
  inline def apply(assert: js.Object): Assert = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assert]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assert] (val x: Self) extends AnyVal {
    
    inline def setAssert(value: js.Object): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
  }
}
