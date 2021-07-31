package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMonarchLanguageBracket extends StObject {
  
  /**
    * closing bracket
    */
  var close: String
  
  /**
    * open bracket
    */
  var open: String
  
  /**
    * token class
    */
  var token: String
}
object IMonarchLanguageBracket {
  
  @scala.inline
  def apply(close: String, open: String, token: String): IMonarchLanguageBracket = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMonarchLanguageBracket]
  }
  
  @scala.inline
  implicit class IMonarchLanguageBracketMutableBuilder[Self <: IMonarchLanguageBracket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
