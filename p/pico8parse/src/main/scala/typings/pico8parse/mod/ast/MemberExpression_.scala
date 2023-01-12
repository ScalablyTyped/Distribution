package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.Colon
import typings.pico8parse.pico8parseStrings.Dot
import typings.pico8parse.pico8parseStrings.MemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberExpression_
  extends StObject
     with Base[MemberExpression]
     with Expression {
  
  var base: Expression
  
  var identifier: Identifier_
  
  var indexer: Dot | Colon
}
object MemberExpression_ {
  
  inline def apply(base: Expression, identifier: Identifier_, indexer: Dot | Colon): MemberExpression_ = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[MemberExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberExpression_] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Identifier_): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIndexer(value: Dot | Colon): Self = StObject.set(x, "indexer", value.asInstanceOf[js.Any])
  }
}
