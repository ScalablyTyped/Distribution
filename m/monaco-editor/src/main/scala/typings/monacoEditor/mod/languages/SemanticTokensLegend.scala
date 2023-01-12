package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokensLegend extends StObject {
  
  val tokenModifiers: js.Array[String]
  
  val tokenTypes: js.Array[String]
}
object SemanticTokensLegend {
  
  inline def apply(tokenModifiers: js.Array[String], tokenTypes: js.Array[String]): SemanticTokensLegend = {
    val __obj = js.Dynamic.literal(tokenModifiers = tokenModifiers.asInstanceOf[js.Any], tokenTypes = tokenTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokensLegend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SemanticTokensLegend] (val x: Self) extends AnyVal {
    
    inline def setTokenModifiers(value: js.Array[String]): Self = StObject.set(x, "tokenModifiers", value.asInstanceOf[js.Any])
    
    inline def setTokenModifiersVarargs(value: String*): Self = StObject.set(x, "tokenModifiers", js.Array(value*))
    
    inline def setTokenTypes(value: js.Array[String]): Self = StObject.set(x, "tokenTypes", value.asInstanceOf[js.Any])
    
    inline def setTokenTypesVarargs(value: String*): Self = StObject.set(x, "tokenTypes", js.Array(value*))
  }
}
