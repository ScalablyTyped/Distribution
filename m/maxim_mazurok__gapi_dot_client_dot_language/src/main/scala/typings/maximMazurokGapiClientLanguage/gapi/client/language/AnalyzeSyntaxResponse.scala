package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeSyntaxResponse extends StObject {
  
  /**
    * The language of the text, which will be the same as the language specified in the request or, if not specified, the automatically-detected language. See Document.language field for
    * more details.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /** Sentences in the input document. */
  var sentences: js.UndefOr[js.Array[Sentence]] = js.undefined
  
  /** Tokens, along with their syntactic information, in the input document. */
  var tokens: js.UndefOr[js.Array[Token]] = js.undefined
}
object AnalyzeSyntaxResponse {
  
  inline def apply(): AnalyzeSyntaxResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeSyntaxResponse]
  }
  
  extension [Self <: AnalyzeSyntaxResponse](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setSentences(value: js.Array[Sentence]): Self = StObject.set(x, "sentences", value.asInstanceOf[js.Any])
    
    inline def setSentencesUndefined: Self = StObject.set(x, "sentences", js.undefined)
    
    inline def setSentencesVarargs(value: Sentence*): Self = StObject.set(x, "sentences", js.Array(value*))
    
    inline def setTokens(value: js.Array[Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    
    inline def setTokensVarargs(value: Token*): Self = StObject.set(x, "tokens", js.Array(value*))
  }
}
