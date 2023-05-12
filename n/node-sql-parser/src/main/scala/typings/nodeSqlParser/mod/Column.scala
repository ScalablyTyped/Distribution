package typings.nodeSqlParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var as: String
  
  var expr: ColumnRef | AggrFunc
}
object Column {
  
  inline def apply(as: String, expr: ColumnRef | AggrFunc): Column = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], expr = expr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setExpr(value: ColumnRef | AggrFunc): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
  }
}
