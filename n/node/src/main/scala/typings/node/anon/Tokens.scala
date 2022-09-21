package typings.node.anon

import org.scalablytyped.runtime.StringDictionary
import typings.node.utilMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tokens extends StObject {
  
  var positionals: js.Array[String]
  
  var tokens: js.UndefOr[js.Array[Token]] = js.undefined
  
  var values: StringDictionary[js.UndefOr[String | Boolean | (js.Array[String | Boolean])]]
}
object Tokens {
  
  inline def apply(
    positionals: js.Array[String],
    values: StringDictionary[js.UndefOr[String | Boolean | (js.Array[String | Boolean])]]
  ): Tokens = {
    val __obj = js.Dynamic.literal(positionals = positionals.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokens]
  }
  
  extension [Self <: Tokens](x: Self) {
    
    inline def setPositionals(value: js.Array[String]): Self = StObject.set(x, "positionals", value.asInstanceOf[js.Any])
    
    inline def setPositionalsVarargs(value: String*): Self = StObject.set(x, "positionals", js.Array(value*))
    
    inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setValues(value: StringDictionary[js.UndefOr[String | Boolean | (js.Array[String | Boolean])]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
