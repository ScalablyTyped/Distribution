package typings.nodeSqlParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limit extends StObject {
  
  var seperator: String
  
  var value: js.Array[LimitValue]
}
object Limit {
  
  inline def apply(seperator: String, value: js.Array[LimitValue]): Limit = {
    val __obj = js.Dynamic.literal(seperator = seperator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
    
    inline def setSeperator(value: String): Self = StObject.set(x, "seperator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[LimitValue]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: LimitValue*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
