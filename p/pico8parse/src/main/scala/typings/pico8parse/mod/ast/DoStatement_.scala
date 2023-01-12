package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.DoStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoStatement_
  extends StObject
     with Base[DoStatement]
     with _Statement {
  
  var body: js.Array[Statement]
}
object DoStatement_ {
  
  inline def apply(body: js.Array[Statement]): DoStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoStatement")
    __obj.asInstanceOf[DoStatement_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoStatement_] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
  }
}
