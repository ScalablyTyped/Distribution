package typings.mongodb.anon

import typings.mongodb.mod.IntegerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xor extends StObject {
  
  var xor: IntegerType
}
object Xor {
  
  inline def apply(xor: IntegerType): Xor = {
    val __obj = js.Dynamic.literal(xor = xor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Xor] (val x: Self) extends AnyVal {
    
    inline def setXor(value: IntegerType): Self = StObject.set(x, "xor", value.asInstanceOf[js.Any])
  }
}
