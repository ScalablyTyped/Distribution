package typings.maximMazurokGapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends js.Object {
  
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
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDependencyEdge(value: DependencyEdge): Self = this.set("dependencyEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencyEdge: Self = this.set("dependencyEdge", js.undefined)
    
    @scala.inline
    def setLemma(value: String): Self = this.set("lemma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLemma: Self = this.set("lemma", js.undefined)
    
    @scala.inline
    def setPartOfSpeech(value: PartOfSpeech): Self = this.set("partOfSpeech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartOfSpeech: Self = this.set("partOfSpeech", js.undefined)
    
    @scala.inline
    def setText(value: TextSpan): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
