package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  /** Dependency tree parse for this token. */
  var dependencyEdge: js.UndefOr[DependencyEdge] = js.undefined
  
  /** [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token. */
  var lemma: js.UndefOr[String] = js.undefined
  
  /** Parts of speech tag for this token. */
  var partOfSpeech: js.UndefOr[PartOfSpeech] = js.undefined
  
  /** The token text. */
  var text: js.UndefOr[TextSpan] = js.undefined
}
object Token {
  
  inline def apply(): Token = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    inline def setDependencyEdge(value: DependencyEdge): Self = StObject.set(x, "dependencyEdge", value.asInstanceOf[js.Any])
    
    inline def setDependencyEdgeUndefined: Self = StObject.set(x, "dependencyEdge", js.undefined)
    
    inline def setLemma(value: String): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
    
    inline def setLemmaUndefined: Self = StObject.set(x, "lemma", js.undefined)
    
    inline def setPartOfSpeech(value: PartOfSpeech): Self = StObject.set(x, "partOfSpeech", value.asInstanceOf[js.Any])
    
    inline def setPartOfSpeechUndefined: Self = StObject.set(x, "partOfSpeech", js.undefined)
    
    inline def setText(value: TextSpan): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
