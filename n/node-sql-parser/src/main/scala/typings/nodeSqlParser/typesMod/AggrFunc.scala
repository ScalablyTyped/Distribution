package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.aggr_func
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggrFunc extends StObject {
  
  var args: ColumnRef | AggrFunc | Star | Null
  
  var name: String
  
  var `type`: aggr_func
}
object AggrFunc {
  
  inline def apply(name: String): AggrFunc = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], args = null)
    __obj.updateDynamic("type")("aggr_func")
    __obj.asInstanceOf[AggrFunc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggrFunc] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: ColumnRef | AggrFunc | Star): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: aggr_func): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
