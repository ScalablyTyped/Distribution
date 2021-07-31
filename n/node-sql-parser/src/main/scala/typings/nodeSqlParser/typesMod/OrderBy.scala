package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.ASC
import typings.nodeSqlParser.nodeSqlParserStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderBy extends StObject {
  
  var expr: js.Any
  
  var `type`: ASC | DESC
}
object OrderBy {
  
  @scala.inline
  def apply(expr: js.Any, `type`: ASC | DESC): OrderBy = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderBy]
  }
  
  @scala.inline
  implicit class OrderByMutableBuilder[Self <: OrderBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpr(value: js.Any): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ASC | DESC): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
