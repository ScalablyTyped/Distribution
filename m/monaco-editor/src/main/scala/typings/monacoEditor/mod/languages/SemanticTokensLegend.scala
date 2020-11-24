package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensLegend extends js.Object {
  
  val tokenModifiers: js.Array[String] = js.native
  
  val tokenTypes: js.Array[String] = js.native
}
object SemanticTokensLegend {
  
  @scala.inline
  def apply(tokenModifiers: js.Array[String], tokenTypes: js.Array[String]): SemanticTokensLegend = {
    val __obj = js.Dynamic.literal(tokenModifiers = tokenModifiers.asInstanceOf[js.Any], tokenTypes = tokenTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensLegend]
  }
  
  @scala.inline
  implicit class SemanticTokensLegendOps[Self <: SemanticTokensLegend] (val x: Self) extends AnyVal {
    
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
    def setTokenModifiersVarargs(value: String*): Self = this.set("tokenModifiers", js.Array(value :_*))
    
    @scala.inline
    def setTokenModifiers(value: js.Array[String]): Self = this.set("tokenModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenTypesVarargs(value: String*): Self = this.set("tokenTypes", js.Array(value :_*))
    
    @scala.inline
    def setTokenTypes(value: js.Array[String]): Self = this.set("tokenTypes", value.asInstanceOf[js.Any])
  }
}
