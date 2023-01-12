package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reduce extends StObject {
  
  var reduce: String
}
object Reduce {
  
  inline def apply(reduce: String): Reduce = {
    val __obj = js.Dynamic.literal(reduce = reduce.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduce]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reduce] (val x: Self) extends AnyVal {
    
    inline def setReduce(value: String): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
  }
}
