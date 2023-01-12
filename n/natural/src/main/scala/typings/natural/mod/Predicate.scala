package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Predicate extends StObject {
  
  def evaluate(tagged_sentence: js.Array[js.Array[String]], position: Double): Boolean
  
  var function: js.UndefOr[
    js.Function3[
      /* tagged_sentence */ js.Array[js.Array[String]], 
      /* i */ Double, 
      /* parameter */ String, 
      Boolean
    ]
  ] = js.undefined
  
  var name: String
  
  var parameter1: String
  
  var parameter2: js.UndefOr[String] = js.undefined
}
object Predicate {
  
  inline def apply(evaluate: (js.Array[js.Array[String]], Double) => Boolean, name: String, parameter1: String): Predicate = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction2(evaluate), name = name.asInstanceOf[js.Any], parameter1 = parameter1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Predicate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Predicate] (val x: Self) extends AnyVal {
    
    inline def setEvaluate(value: (js.Array[js.Array[String]], Double) => Boolean): Self = StObject.set(x, "evaluate", js.Any.fromFunction2(value))
    
    inline def setFunction(
      value: (/* tagged_sentence */ js.Array[js.Array[String]], /* i */ Double, /* parameter */ String) => Boolean
    ): Self = StObject.set(x, "function", js.Any.fromFunction3(value))
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameter1(value: String): Self = StObject.set(x, "parameter1", value.asInstanceOf[js.Any])
    
    inline def setParameter2(value: String): Self = StObject.set(x, "parameter2", value.asInstanceOf[js.Any])
    
    inline def setParameter2Undefined: Self = StObject.set(x, "parameter2", js.undefined)
  }
}
