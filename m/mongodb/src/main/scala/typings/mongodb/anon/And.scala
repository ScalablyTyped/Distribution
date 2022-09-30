package typings.mongodb.anon

import typings.mongodb.mod.IntegerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait And extends StObject {
  
  var and: IntegerType
}
object And {
  
  inline def apply(and: IntegerType): And = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any])
    __obj.asInstanceOf[And]
  }
  
  extension [Self <: And](x: Self) {
    
    inline def setAnd(value: IntegerType): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
  }
}
