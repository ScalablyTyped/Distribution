package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.StringCallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringCallExpression_
  extends StObject
     with Base[StringCallExpression]
     with Expression {
  
  var argument: Expression
  
  var base: Expression
}
object StringCallExpression_ {
  
  inline def apply(argument: Expression, base: Expression): StringCallExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringCallExpression")
    __obj.asInstanceOf[StringCallExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringCallExpression_] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
  }
}
