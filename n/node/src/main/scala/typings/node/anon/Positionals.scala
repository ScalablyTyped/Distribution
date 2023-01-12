package typings.node.anon

import typings.node.utilMod.ParseArgsConfig
import typings.node.utilMod.ParsedOptionToken
import typings.node.utilMod.ParsedPositionalToken
import typings.node.utilMod.ParsedPositionals
import typings.node.utilMod.ParsedTokens
import typings.node.utilMod.ParsedValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Positionals[T /* <: ParseArgsConfig */] extends StObject {
  
  var positionals: ParsedPositionals[T]
  
  var tokens: ParsedTokens[T]
  
  var values: ParsedValues[T]
}
object Positionals {
  
  inline def apply[T /* <: ParseArgsConfig */](positionals: ParsedPositionals[T], tokens: ParsedTokens[T], values: ParsedValues[T]): Positionals[T] = {
    val __obj = js.Dynamic.literal(positionals = positionals.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positionals[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Positionals[?], T /* <: ParseArgsConfig */] (val x: Self & Positionals[T]) extends AnyVal {
    
    inline def setPositionals(value: ParsedPositionals[T]): Self = StObject.set(x, "positionals", value.asInstanceOf[js.Any])
    
    inline def setPositionalsVarargs(value: Any*): Self = StObject.set(x, "positionals", js.Array(value*))
    
    inline def setTokens(value: ParsedTokens[T]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: (ParsedOptionToken[T] | ParsedPositionalToken[T] | Kind)*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setValues(value: ParsedValues[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
