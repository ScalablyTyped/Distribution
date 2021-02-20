package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticTokensLegend extends StObject {
  
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
  implicit class SemanticTokensLegendMutableBuilder[Self <: SemanticTokensLegend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTokenModifiers(value: js.Array[String]): Self = StObject.set(x, "tokenModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenModifiersVarargs(value: String*): Self = StObject.set(x, "tokenModifiers", js.Array(value :_*))
    
    @scala.inline
    def setTokenTypes(value: js.Array[String]): Self = StObject.set(x, "tokenTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenTypesVarargs(value: String*): Self = StObject.set(x, "tokenTypes", js.Array(value :_*))
  }
}
