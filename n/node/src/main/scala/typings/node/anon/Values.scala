package typings.node.anon

import typings.node.utilMod.ParseArgsConfig
import typings.node.utilMod.ParsedPositionals
import typings.node.utilMod.ParsedValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Values[T /* <: ParseArgsConfig */] extends StObject {
  
  var positionals: ParsedPositionals[T]
  
  var values: ParsedValues[T]
}
object Values {
  
  inline def apply[T /* <: ParseArgsConfig */](positionals: ParsedPositionals[T], values: ParsedValues[T]): Values[T] = {
    val __obj = js.Dynamic.literal(positionals = positionals.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Values[?], T /* <: ParseArgsConfig */] (val x: Self & Values[T]) extends AnyVal {
    
    inline def setPositionals(value: ParsedPositionals[T]): Self = StObject.set(x, "positionals", value.asInstanceOf[js.Any])
    
    inline def setPositionalsVarargs(value: Any*): Self = StObject.set(x, "positionals", js.Array(value*))
    
    inline def setValues(value: ParsedValues[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
