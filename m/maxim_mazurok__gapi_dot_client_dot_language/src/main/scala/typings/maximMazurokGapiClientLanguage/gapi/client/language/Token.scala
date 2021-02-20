package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends StObject {
  
  /** Dependency tree parse for this token. */
  var dependencyEdge: js.UndefOr[DependencyEdge] = js.native
  
  /** [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token. */
  var lemma: js.UndefOr[String] = js.native
  
  /** Parts of speech tag for this token. */
  var partOfSpeech: js.UndefOr[PartOfSpeech] = js.native
  
  /** The token text. */
  var text: js.UndefOr[TextSpan] = js.native
}
object Token {
  
  @scala.inline
  def apply(): Token = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDependencyEdge(value: DependencyEdge): Self = StObject.set(x, "dependencyEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyEdgeUndefined: Self = StObject.set(x, "dependencyEdge", js.undefined)
    
    @scala.inline
    def setLemma(value: String): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLemmaUndefined: Self = StObject.set(x, "lemma", js.undefined)
    
    @scala.inline
    def setPartOfSpeech(value: PartOfSpeech): Self = StObject.set(x, "partOfSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfSpeechUndefined: Self = StObject.set(x, "partOfSpeech", js.undefined)
    
    @scala.inline
    def setText(value: TextSpan): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
