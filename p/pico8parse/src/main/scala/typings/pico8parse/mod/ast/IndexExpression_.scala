package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.IndexExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexExpression_
  extends StObject
     with Base[IndexExpression]
     with Expression {
  
  var base: Expression
  
  var index: Expression
}
object IndexExpression_ {
  
  inline def apply(base: Expression, index: Expression): IndexExpression_ = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexExpression")
    __obj.asInstanceOf[IndexExpression_]
  }
  
  extension [Self <: IndexExpression_](x: Self) {
    
    inline def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Expression): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
