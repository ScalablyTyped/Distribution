package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokensProviderFactory extends StObject {
  
  def create(): ProviderResult[TokensProvider | EncodedTokensProvider | IMonarchLanguage]
}
object TokensProviderFactory {
  
  inline def apply(create: () => ProviderResult[TokensProvider | EncodedTokensProvider | IMonarchLanguage]): TokensProviderFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
    __obj.asInstanceOf[TokensProviderFactory]
  }
  
  extension [Self <: TokensProviderFactory](x: Self) {
    
    inline def setCreate(value: () => ProviderResult[TokensProvider | EncodedTokensProvider | IMonarchLanguage]): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
  }
}
