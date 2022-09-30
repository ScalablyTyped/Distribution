package typings.mongodb.anon

import typings.mongodb.mod.IntegerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Or extends StObject {
  
  var or: IntegerType
}
object Or {
  
  inline def apply(or: IntegerType): Or = {
    val __obj = js.Dynamic.literal(or = or.asInstanceOf[js.Any])
    __obj.asInstanceOf[Or]
  }
  
  extension [Self <: Or](x: Self) {
    
    inline def setOr(value: IntegerType): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
  }
}
