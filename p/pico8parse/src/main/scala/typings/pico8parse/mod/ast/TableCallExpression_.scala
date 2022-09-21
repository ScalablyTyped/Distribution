package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.TableCallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCallExpression_
  extends StObject
     with Base[TableCallExpression]
     with Expression {
  
  var argument: Expression
  
  var base: Expression
}
object TableCallExpression_ {
  
  inline def apply(argument: Expression, base: Expression): TableCallExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableCallExpression")
    __obj.asInstanceOf[TableCallExpression_]
  }
  
  extension [Self <: TableCallExpression_](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
  }
}
