package typings.nextAuth.anon

import typings.nextAuth.coreTypesMod.TokenSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tokens extends StObject {
  
  var tokens: TokenSet
}
object Tokens {
  
  inline def apply(tokens: TokenSet): Tokens = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokens]
  }
  
  extension [Self <: Tokens](x: Self) {
    
    inline def setTokens(value: TokenSet): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
  }
}
